package at.bestsolution.efxclipse.tooling.css.ui.highlighting;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class CssDslHighlightingConfiguration extends DefaultHighlightingConfiguration {
	public final static String DECLARATIONNAME = "DeclarationName"; 
	public final static String SELECTOR = "Selector";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(DECLARATIONNAME, "Declaration", crossDeclarationTextStyle());
		acceptor.acceptDefaultHighlighting(SELECTOR, "Selector", crossSelectorTextStyle());
	}

	@Override
	public TextStyle defaultTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}
	
	public TextStyle crossDeclarationTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0,153,0));
		return textStyle;
	}

	public TextStyle crossSelectorTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(206,123,0));
		return textStyle;
	}
}