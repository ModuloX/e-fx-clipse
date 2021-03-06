/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Anton Leherbauer (Wind River Systems) - [misc] Allow custom token for WhitespaceRule - https://bugs.eclipse.org/bugs/show_bug.cgi?id=251224
 *******************************************************************************/
package at.bestsolution.efxclipse.text.test.app.sample.jscanners;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;

import at.bestsolution.efxclipse.text.jface.rules.ICharacterScanner;
import at.bestsolution.efxclipse.text.jface.rules.IRule;
import at.bestsolution.efxclipse.text.jface.rules.IToken;
import at.bestsolution.efxclipse.text.jface.rules.IWordDetector;
import at.bestsolution.efxclipse.text.jface.rules.SingleLineRule;
import at.bestsolution.efxclipse.text.jface.rules.Token;
import at.bestsolution.efxclipse.text.jface.rules.WhitespaceRule;
import at.bestsolution.efxclipse.text.jface.rules.WordRule;
import at.bestsolution.efxclipse.text.test.app.sample.jscanners.CombinedWordRule.WordMatcher;

/**
 * A rule based JavaDoc scanner.
 */
public final class JavaScanner extends JavaCommentScanner {


	/**
	 * Detector for HTML comment delimiters.
	 */
	static class HTMLCommentDetector implements IWordDetector {

		/**
		 * @see IWordDetector#isWordStart(char)
		 */
		public boolean isWordStart(char c) {
			return (c == '<' || c == '-');
		}

		/**
		 * @see IWordDetector#isWordPart(char)
		 */
		public boolean isWordPart(char c) {
			return (c == '-' || c == '!' || c == '>');
		}
	}

	class TagRule extends SingleLineRule {

		/*
		 * @see SingleLineRule
		 */
		public TagRule(IToken token) {
			super("<", ">", token, (char) 0); //$NON-NLS-2$ //$NON-NLS-1$
		}

		/*
		 * @see SingleLineRule
		 */
		public TagRule(IToken token, char escapeCharacter) {
			super("<", ">", token, escapeCharacter); //$NON-NLS-2$ //$NON-NLS-1$
		}

		private IToken evaluateToken() {
			try {
				final String token= getDocument().get(getTokenOffset(), getTokenLength()) + "."; //$NON-NLS-1$

				int offset= 0;
				char character= token.charAt(++offset);

				if (character == '/')
					character= token.charAt(++offset);

				while (Character.isWhitespace(character))
					character= token.charAt(++offset);

				while (Character.isLetterOrDigit(character))
					character= token.charAt(++offset);

				while (Character.isWhitespace(character))
					character= token.charAt(++offset);

				if (offset >= 2 && token.charAt(offset) == fEndSequence[0])
					return fToken;

			} catch (BadLocationException exception) {
				// Do nothing
			}
			return getToken(ResourceProvider.JAVADOC_DEFAULT);
		}

		/*
		 * @see PatternRule#evaluate(ICharacterScanner)
		 */
		public IToken evaluate(ICharacterScanner scanner) {
			IToken result= super.evaluate(scanner);
			if (result == fToken)
				return evaluateToken();
			return result;
		}
	}

	private static String[] fgTokenProperties= {
		ResourceProvider.JAVADOC_KEYWORD,
		ResourceProvider.JAVADOC_TAG,
		ResourceProvider.JAVADOC_LINK,
		ResourceProvider.JAVADOC_DEFAULT/*,
		TASK_TAG*/
	};


	public JavaScanner(TextAttributesManager colorManager) {
		super(colorManager, ResourceProvider.JAVADOC_DEFAULT, fgTokenProperties);
	}


	public IDocument getDocument() {
		return fDocument;
	}

	/*
	 * @see AbstractJavaScanner#createRules()
	 */
	protected List<IRule> createRules() {

		List<IRule> list= new ArrayList<IRule>();

		// Add rule for tags.
		Token token= getToken(ResourceProvider.JAVADOC_TAG);
		list.add(new TagRule(token));


		// Add rule for HTML comments
		WordRule wordRule= new WordRule(new HTMLCommentDetector(), token);
		wordRule.addWord("<!--", token); //$NON-NLS-1$
		wordRule.addWord("--!>", token); //$NON-NLS-1$
		list.add(wordRule);


		// Add rule for links.
		token= getToken(ResourceProvider.JAVADOC_LINK);
		list.add(new SingleLineRule("{@link", "}", token)); //$NON-NLS-2$ //$NON-NLS-1$
		list.add(new SingleLineRule("{@value", "}", token)); //$NON-NLS-2$ //$NON-NLS-1$
		list.add(new SingleLineRule("{@inheritDoc", "}", token)); //$NON-NLS-2$ //$NON-NLS-1$


		// Add generic whitespace rule.
		token= getToken(ResourceProvider.JAVADOC_DEFAULT);
		list.add(new WhitespaceRule(new JavaWhitespaceDetector(), token));


		list.addAll(super.createRules());
		return list;
	}

	/*
	 * @see org.eclipse.jdt.internal.ui.text.JavaCommentScanner#createMatchers()
	 */
	protected List<WordMatcher> createMatchers() {
		List<WordMatcher> list= super.createMatchers();

		// Add word rule for keywords.
		final IToken token= getToken(ResourceProvider.JAVADOC_KEYWORD);
		WordMatcher matcher= new WordMatcher() { 
			public IToken evaluate(ICharacterScanner scanner, CombinedWordRule.CharacterBuffer word) {
				int length= word.length();
				if (length > 1 && word.charAt(0) == '@') {
					int i= 0;
					try {
						for (; i <= length; i++)
							scanner.unread();
						int c= scanner.read();
						i--;
						if (c == '*' || Character.isWhitespace((char)c)) {
							scanner.unread();
							return token;
						}
					} finally {
						for (; i >= 0; i--)
							scanner.read();
					}
				}
				return Token.UNDEFINED;
			}
		};
		list.add(matcher);

		return list;
	}
}