package at.bestsolution.efxclipse.tooling.fxgraph.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.bestsolution.efxclipse.tooling.fxgraph.services.FXGraphGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFXGraphParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_REAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'('", "'createdby'", "')'", "'id'", "'{'", "'|'", "','", "'}'", "'call'", "'#'", "':'", "'['", "']'", "'true'", "'false'", "'-'", "'idref'", "'include'", "'copy'", "'.'", "'*'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'while'", "'do'", "';'", "'var'", "'val'", "'super'", "'::'", "'new'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int RULE_REAL=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalFXGraphParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFXGraphParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFXGraphParser.tokenNames; }
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g"; }



     	private FXGraphGrammarAccess grammarAccess;
     	
        public InternalFXGraphParser(TokenStream input, FXGraphGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected FXGraphGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_rootNode_1_0= ruleElement ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_rootNode_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_rootNode_1_0= ruleElement ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_rootNode_1_0= ruleElement ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_rootNode_1_0= ruleElement ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_rootNode_1_0= ruleElement ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:98:3: ( (lv_rootNode_1_0= ruleElement ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:99:1: (lv_rootNode_1_0= ruleElement )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:99:1: (lv_rootNode_1_0= ruleElement )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:100:3: lv_rootNode_1_0= ruleElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getRootNodeElementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElement_in_ruleModel153);
            lv_rootNode_1_0=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"rootNode",
                      		lv_rootNode_1_0, 
                      		"Element");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:124:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:125:2: (iv_ruleImport= ruleImport EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:126:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport189);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport199); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:133:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:136:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:137:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:141:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:142:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:143:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport257);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildCard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleElement"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:167:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:168:2: (iv_ruleElement= ruleElement EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:169:2: iv_ruleElement= ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement293);
            iv_ruleElement=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement303); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:176:1: ruleElement returns [EObject current=null] : ( ( (lv_type_0_0= ruleJvmTypeReference ) ) (otherlv_1= '(' ( ( (lv_value_2_0= ruleSimpleValueProperty ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )? (otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) ) )? (otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_staticProperties_15_0= ruleStaticValueProperty ) ) ) (otherlv_16= ',' ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_staticProperties_18_0= ruleStaticValueProperty ) ) ) )* )? otherlv_19= '}' )? ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_factory_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        EObject lv_type_0_0 = null;

        EObject lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_defines_10_0 = null;

        EObject lv_defines_12_0 = null;

        EObject lv_properties_14_0 = null;

        EObject lv_staticProperties_15_0 = null;

        EObject lv_properties_17_0 = null;

        EObject lv_staticProperties_18_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:179:28: ( ( ( (lv_type_0_0= ruleJvmTypeReference ) ) (otherlv_1= '(' ( ( (lv_value_2_0= ruleSimpleValueProperty ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )? (otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) ) )? (otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_staticProperties_15_0= ruleStaticValueProperty ) ) ) (otherlv_16= ',' ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_staticProperties_18_0= ruleStaticValueProperty ) ) ) )* )? otherlv_19= '}' )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:180:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) (otherlv_1= '(' ( ( (lv_value_2_0= ruleSimpleValueProperty ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )? (otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) ) )? (otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_staticProperties_15_0= ruleStaticValueProperty ) ) ) (otherlv_16= ',' ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_staticProperties_18_0= ruleStaticValueProperty ) ) ) )* )? otherlv_19= '}' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:180:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) (otherlv_1= '(' ( ( (lv_value_2_0= ruleSimpleValueProperty ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )? (otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) ) )? (otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_staticProperties_15_0= ruleStaticValueProperty ) ) ) (otherlv_16= ',' ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_staticProperties_18_0= ruleStaticValueProperty ) ) ) )* )? otherlv_19= '}' )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:180:2: ( (lv_type_0_0= ruleJvmTypeReference ) ) (otherlv_1= '(' ( ( (lv_value_2_0= ruleSimpleValueProperty ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )? (otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) ) )? (otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_staticProperties_15_0= ruleStaticValueProperty ) ) ) (otherlv_16= ',' ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_staticProperties_18_0= ruleStaticValueProperty ) ) ) )* )? otherlv_19= '}' )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:180:2: ( (lv_type_0_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:181:1: (lv_type_0_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:181:1: (lv_type_0_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:182:3: lv_type_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementAccess().getTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleElement349);
            lv_type_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElementRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:198:2: (otherlv_1= '(' ( ( (lv_value_2_0= ruleSimpleValueProperty ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:198:4: otherlv_1= '(' ( ( (lv_value_2_0= ruleSimpleValueProperty ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleElement362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getElementAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:202:1: ( ( (lv_value_2_0= ruleSimpleValueProperty ) ) | (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) ) )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_STRING||(LA2_0>=RULE_INT && LA2_0<=RULE_REAL)||(LA2_0>=26 && LA2_0<=28)) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==14) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:202:2: ( (lv_value_2_0= ruleSimpleValueProperty ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:202:2: ( (lv_value_2_0= ruleSimpleValueProperty ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:203:1: (lv_value_2_0= ruleSimpleValueProperty )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:203:1: (lv_value_2_0= ruleSimpleValueProperty )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:204:3: lv_value_2_0= ruleSimpleValueProperty
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementAccess().getValueSimpleValuePropertyParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSimpleValueProperty_in_ruleElement384);
                            lv_value_2_0=ruleSimpleValueProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getElementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_2_0, 
                                      		"SimpleValueProperty");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:221:6: (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:221:6: (otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:221:8: otherlv_3= 'createdby' ( (lv_factory_4_0= RULE_STRING ) )
                            {
                            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleElement403); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getElementAccess().getCreatedbyKeyword_1_1_1_0());
                                  
                            }
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:225:1: ( (lv_factory_4_0= RULE_STRING ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:226:1: (lv_factory_4_0= RULE_STRING )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:226:1: (lv_factory_4_0= RULE_STRING )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:227:3: lv_factory_4_0= RULE_STRING
                            {
                            lv_factory_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleElement420); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_factory_4_0, grammarAccess.getElementAccess().getFactorySTRINGTerminalRuleCall_1_1_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getElementRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"factory",
                                      		lv_factory_4_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleElement439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getElementAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:247:3: (otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:247:5: otherlv_6= 'id' ( (lv_name_7_0= ruleValidID ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleElement454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getElementAccess().getIdKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:251:1: ( (lv_name_7_0= ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:252:1: (lv_name_7_0= ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:252:1: (lv_name_7_0= ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:253:3: lv_name_7_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElementAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleElement475);
                    lv_name_7_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElementRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_7_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:269:4: (otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_staticProperties_15_0= ruleStaticValueProperty ) ) ) (otherlv_16= ',' ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_staticProperties_18_0= ruleStaticValueProperty ) ) ) )* )? otherlv_19= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:269:6: otherlv_8= '{' (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )? ( ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_staticProperties_15_0= ruleStaticValueProperty ) ) ) (otherlv_16= ',' ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_staticProperties_18_0= ruleStaticValueProperty ) ) ) )* )? otherlv_19= '}'
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleElement490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:273:1: (otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==18) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:273:3: otherlv_9= '|' ( (lv_defines_10_0= ruleDefine ) ) (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )* otherlv_13= '|'
                            {
                            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleElement503); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getElementAccess().getVerticalLineKeyword_3_1_0());
                                  
                            }
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:277:1: ( (lv_defines_10_0= ruleDefine ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:278:1: (lv_defines_10_0= ruleDefine )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:278:1: (lv_defines_10_0= ruleDefine )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:279:3: lv_defines_10_0= ruleDefine
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getElementAccess().getDefinesDefineParserRuleCall_3_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDefine_in_ruleElement524);
                            lv_defines_10_0=ruleDefine();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getElementRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"defines",
                                      		lv_defines_10_0, 
                                      		"Define");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:295:2: (otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==19) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:295:4: otherlv_11= ',' ( (lv_defines_12_0= ruleDefine ) )
                            	    {
                            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleElement537); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getElementAccess().getCommaKeyword_3_1_2_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:299:1: ( (lv_defines_12_0= ruleDefine ) )
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:300:1: (lv_defines_12_0= ruleDefine )
                            	    {
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:300:1: (lv_defines_12_0= ruleDefine )
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:301:3: lv_defines_12_0= ruleDefine
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getElementAccess().getDefinesDefineParserRuleCall_3_1_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleDefine_in_ruleElement558);
                            	    lv_defines_12_0=ruleDefine();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getElementRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"defines",
                            	              		lv_defines_12_0, 
                            	              		"Define");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);

                            otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleElement572); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_13, grammarAccess.getElementAccess().getVerticalLineKeyword_3_1_3());
                                  
                            }

                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:321:3: ( ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_staticProperties_15_0= ruleStaticValueProperty ) ) ) (otherlv_16= ',' ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_staticProperties_18_0= ruleStaticValueProperty ) ) ) )* )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID||LA10_0==21) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:321:4: ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_staticProperties_15_0= ruleStaticValueProperty ) ) ) (otherlv_16= ',' ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_staticProperties_18_0= ruleStaticValueProperty ) ) ) )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:321:4: ( ( (lv_properties_14_0= ruleProperty ) ) | ( (lv_staticProperties_15_0= ruleStaticValueProperty ) ) )
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0==RULE_ID) ) {
                                alt7=1;
                            }
                            else if ( (LA7_0==21) ) {
                                alt7=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 0, input);

                                throw nvae;
                            }
                            switch (alt7) {
                                case 1 :
                                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:321:5: ( (lv_properties_14_0= ruleProperty ) )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:321:5: ( (lv_properties_14_0= ruleProperty ) )
                                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:322:1: (lv_properties_14_0= ruleProperty )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:322:1: (lv_properties_14_0= ruleProperty )
                                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:323:3: lv_properties_14_0= ruleProperty
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getElementAccess().getPropertiesPropertyParserRuleCall_3_2_0_0_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleProperty_in_ruleElement597);
                                    lv_properties_14_0=ruleProperty();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getElementRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"properties",
                                              		lv_properties_14_0, 
                                              		"Property");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:340:6: ( (lv_staticProperties_15_0= ruleStaticValueProperty ) )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:340:6: ( (lv_staticProperties_15_0= ruleStaticValueProperty ) )
                                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:341:1: (lv_staticProperties_15_0= ruleStaticValueProperty )
                                    {
                                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:341:1: (lv_staticProperties_15_0= ruleStaticValueProperty )
                                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:342:3: lv_staticProperties_15_0= ruleStaticValueProperty
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getElementAccess().getStaticPropertiesStaticValuePropertyParserRuleCall_3_2_0_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleStaticValueProperty_in_ruleElement624);
                                    lv_staticProperties_15_0=ruleStaticValueProperty();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getElementRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"staticProperties",
                                              		lv_staticProperties_15_0, 
                                              		"StaticValueProperty");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:358:3: (otherlv_16= ',' ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_staticProperties_18_0= ruleStaticValueProperty ) ) ) )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==19) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:358:5: otherlv_16= ',' ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_staticProperties_18_0= ruleStaticValueProperty ) ) )
                            	    {
                            	    otherlv_16=(Token)match(input,19,FOLLOW_19_in_ruleElement638); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_16, grammarAccess.getElementAccess().getCommaKeyword_3_2_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:362:1: ( ( (lv_properties_17_0= ruleProperty ) ) | ( (lv_staticProperties_18_0= ruleStaticValueProperty ) ) )
                            	    int alt8=2;
                            	    int LA8_0 = input.LA(1);

                            	    if ( (LA8_0==RULE_ID) ) {
                            	        alt8=1;
                            	    }
                            	    else if ( (LA8_0==21) ) {
                            	        alt8=2;
                            	    }
                            	    else {
                            	        if (state.backtracking>0) {state.failed=true; return current;}
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 8, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt8) {
                            	        case 1 :
                            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:362:2: ( (lv_properties_17_0= ruleProperty ) )
                            	            {
                            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:362:2: ( (lv_properties_17_0= ruleProperty ) )
                            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:363:1: (lv_properties_17_0= ruleProperty )
                            	            {
                            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:363:1: (lv_properties_17_0= ruleProperty )
                            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:364:3: lv_properties_17_0= ruleProperty
                            	            {
                            	            if ( state.backtracking==0 ) {
                            	               
                            	              	        newCompositeNode(grammarAccess.getElementAccess().getPropertiesPropertyParserRuleCall_3_2_1_1_0_0()); 
                            	              	    
                            	            }
                            	            pushFollow(FOLLOW_ruleProperty_in_ruleElement660);
                            	            lv_properties_17_0=ruleProperty();

                            	            state._fsp--;
                            	            if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	              	        if (current==null) {
                            	              	            current = createModelElementForParent(grammarAccess.getElementRule());
                            	              	        }
                            	                     		add(
                            	                     			current, 
                            	                     			"properties",
                            	                      		lv_properties_17_0, 
                            	                      		"Property");
                            	              	        afterParserOrEnumRuleCall();
                            	              	    
                            	            }

                            	            }


                            	            }


                            	            }
                            	            break;
                            	        case 2 :
                            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:381:6: ( (lv_staticProperties_18_0= ruleStaticValueProperty ) )
                            	            {
                            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:381:6: ( (lv_staticProperties_18_0= ruleStaticValueProperty ) )
                            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:382:1: (lv_staticProperties_18_0= ruleStaticValueProperty )
                            	            {
                            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:382:1: (lv_staticProperties_18_0= ruleStaticValueProperty )
                            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:383:3: lv_staticProperties_18_0= ruleStaticValueProperty
                            	            {
                            	            if ( state.backtracking==0 ) {
                            	               
                            	              	        newCompositeNode(grammarAccess.getElementAccess().getStaticPropertiesStaticValuePropertyParserRuleCall_3_2_1_1_1_0()); 
                            	              	    
                            	            }
                            	            pushFollow(FOLLOW_ruleStaticValueProperty_in_ruleElement687);
                            	            lv_staticProperties_18_0=ruleStaticValueProperty();

                            	            state._fsp--;
                            	            if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	              	        if (current==null) {
                            	              	            current = createModelElementForParent(grammarAccess.getElementRule());
                            	              	        }
                            	                     		add(
                            	                     			current, 
                            	                     			"staticProperties",
                            	                      		lv_staticProperties_18_0, 
                            	                      		"StaticValueProperty");
                            	              	        afterParserOrEnumRuleCall();
                            	              	    
                            	            }

                            	            }


                            	            }


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop9;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleElement704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getElementAccess().getRightCurlyBracketKeyword_3_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDefine"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:411:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:412:2: (iv_ruleDefine= ruleDefine EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:413:2: iv_ruleDefine= ruleDefine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefineRule()); 
            }
            pushFollow(FOLLOW_ruleDefine_in_entryRuleDefine742);
            iv_ruleDefine=ruleDefine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefine; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefine752); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:420:1: ruleDefine returns [EObject current=null] : ( (lv_element_0_0= ruleElement ) ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:423:28: ( ( (lv_element_0_0= ruleElement ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:424:1: ( (lv_element_0_0= ruleElement ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:424:1: ( (lv_element_0_0= ruleElement ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:425:1: (lv_element_0_0= ruleElement )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:425:1: (lv_element_0_0= ruleElement )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:426:3: lv_element_0_0= ruleElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefineAccess().getElementElementParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElement_in_ruleDefine797);
            lv_element_0_0=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefineRule());
              	        }
                     		set(
                     			current, 
                     			"element",
                      		lv_element_0_0, 
                      		"Element");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleStaticValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:450:1: entryRuleStaticValueProperty returns [EObject current=null] : iv_ruleStaticValueProperty= ruleStaticValueProperty EOF ;
    public final EObject entryRuleStaticValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:451:2: (iv_ruleStaticValueProperty= ruleStaticValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:452:2: iv_ruleStaticValueProperty= ruleStaticValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleStaticValueProperty_in_entryRuleStaticValueProperty832);
            iv_ruleStaticValueProperty=ruleStaticValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticValueProperty842); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticValueProperty"


    // $ANTLR start "ruleStaticValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:459:1: ruleStaticValueProperty returns [EObject current=null] : (otherlv_0= 'call' ( (lv_type_1_0= ruleJvmTypeReference ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= ruleValueProperty ) ) ) ;
    public final EObject ruleStaticValueProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:462:28: ( (otherlv_0= 'call' ( (lv_type_1_0= ruleJvmTypeReference ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= ruleValueProperty ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:463:1: (otherlv_0= 'call' ( (lv_type_1_0= ruleJvmTypeReference ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= ruleValueProperty ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:463:1: (otherlv_0= 'call' ( (lv_type_1_0= ruleJvmTypeReference ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= ruleValueProperty ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:463:3: otherlv_0= 'call' ( (lv_type_1_0= ruleJvmTypeReference ) ) otherlv_2= '#' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= ruleValueProperty ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleStaticValueProperty879); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStaticValuePropertyAccess().getCallKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:467:1: ( (lv_type_1_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:468:1: (lv_type_1_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:468:1: (lv_type_1_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:469:3: lv_type_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStaticValuePropertyAccess().getTypeJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleStaticValueProperty900);
            lv_type_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStaticValuePropertyRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleStaticValueProperty912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStaticValuePropertyAccess().getNumberSignKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:489:1: ( (lv_name_3_0= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:490:1: (lv_name_3_0= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:490:1: (lv_name_3_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:491:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStaticValueProperty929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getStaticValuePropertyAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStaticValuePropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleStaticValueProperty946); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getStaticValuePropertyAccess().getColonKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:511:1: ( (lv_value_5_0= ruleValueProperty ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:512:1: (lv_value_5_0= ruleValueProperty )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:512:1: (lv_value_5_0= ruleValueProperty )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:513:3: lv_value_5_0= ruleValueProperty
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStaticValuePropertyAccess().getValueValuePropertyParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueProperty_in_ruleStaticValueProperty967);
            lv_value_5_0=ruleValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStaticValuePropertyRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_5_0, 
                      		"ValueProperty");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticValueProperty"


    // $ANTLR start "entryRuleProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:537:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:538:2: (iv_ruleProperty= ruleProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:539:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1003);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1013); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:546:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValueProperty ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:549:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValueProperty ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:550:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValueProperty ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:550:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValueProperty ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:550:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValueProperty ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:550:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:551:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:551:1: (lv_name_0_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:552:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty1055); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleProperty1072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:572:1: ( (lv_value_2_0= ruleValueProperty ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:573:1: (lv_value_2_0= ruleValueProperty )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:573:1: (lv_value_2_0= ruleValueProperty )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:574:3: lv_value_2_0= ruleValueProperty
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAccess().getValueValuePropertyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueProperty_in_ruleProperty1093);
            lv_value_2_0=ruleValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"ValueProperty");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:598:1: entryRuleValueProperty returns [EObject current=null] : iv_ruleValueProperty= ruleValueProperty EOF ;
    public final EObject entryRuleValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:599:2: (iv_ruleValueProperty= ruleValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:600:2: iv_ruleValueProperty= ruleValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleValueProperty_in_entryRuleValueProperty1129);
            iv_ruleValueProperty=ruleValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueProperty1139); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueProperty"


    // $ANTLR start "ruleValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:607:1: ruleValueProperty returns [EObject current=null] : (this_SingleValueProperty_0= ruleSingleValueProperty | this_MultiValueProperty_1= ruleMultiValueProperty ) ;
    public final EObject ruleValueProperty() throws RecognitionException {
        EObject current = null;

        EObject this_SingleValueProperty_0 = null;

        EObject this_MultiValueProperty_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:610:28: ( (this_SingleValueProperty_0= ruleSingleValueProperty | this_MultiValueProperty_1= ruleMultiValueProperty ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:611:1: (this_SingleValueProperty_0= ruleSingleValueProperty | this_MultiValueProperty_1= ruleMultiValueProperty )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:611:1: (this_SingleValueProperty_0= ruleSingleValueProperty | this_MultiValueProperty_1= ruleMultiValueProperty )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_REAL)||LA12_0==13||(LA12_0>=26 && LA12_0<=31)||LA12_0==76) ) {
                alt12=1;
            }
            else if ( (LA12_0==17||LA12_0==24) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:612:5: this_SingleValueProperty_0= ruleSingleValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuePropertyAccess().getSingleValuePropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleValueProperty_in_ruleValueProperty1186);
                    this_SingleValueProperty_0=ruleSingleValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SingleValueProperty_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:622:5: this_MultiValueProperty_1= ruleMultiValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuePropertyAccess().getMultiValuePropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMultiValueProperty_in_ruleValueProperty1213);
                    this_MultiValueProperty_1=ruleMultiValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MultiValueProperty_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueProperty"


    // $ANTLR start "entryRuleSingleValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:638:1: entryRuleSingleValueProperty returns [EObject current=null] : iv_ruleSingleValueProperty= ruleSingleValueProperty EOF ;
    public final EObject entryRuleSingleValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:639:2: (iv_ruleSingleValueProperty= ruleSingleValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:640:2: iv_ruleSingleValueProperty= ruleSingleValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleSingleValueProperty_in_entryRuleSingleValueProperty1248);
            iv_ruleSingleValueProperty=ruleSingleValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleValueProperty1258); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleValueProperty"


    // $ANTLR start "ruleSingleValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:647:1: ruleSingleValueProperty returns [EObject current=null] : (this_SimpleValueProperty_0= ruleSimpleValueProperty | this_Element_1= ruleElement | this_ReferenceValueProperty_2= ruleReferenceValueProperty | this_IncludeValueProperty_3= ruleIncludeValueProperty | this_CopyValueProperty_4= ruleCopyValueProperty ) ;
    public final EObject ruleSingleValueProperty() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleValueProperty_0 = null;

        EObject this_Element_1 = null;

        EObject this_ReferenceValueProperty_2 = null;

        EObject this_IncludeValueProperty_3 = null;

        EObject this_CopyValueProperty_4 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:650:28: ( (this_SimpleValueProperty_0= ruleSimpleValueProperty | this_Element_1= ruleElement | this_ReferenceValueProperty_2= ruleReferenceValueProperty | this_IncludeValueProperty_3= ruleIncludeValueProperty | this_CopyValueProperty_4= ruleCopyValueProperty ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:651:1: (this_SimpleValueProperty_0= ruleSimpleValueProperty | this_Element_1= ruleElement | this_ReferenceValueProperty_2= ruleReferenceValueProperty | this_IncludeValueProperty_3= ruleIncludeValueProperty | this_CopyValueProperty_4= ruleCopyValueProperty )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:651:1: (this_SimpleValueProperty_0= ruleSimpleValueProperty | this_Element_1= ruleElement | this_ReferenceValueProperty_2= ruleReferenceValueProperty | this_IncludeValueProperty_3= ruleIncludeValueProperty | this_CopyValueProperty_4= ruleCopyValueProperty )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_REAL:
            case 26:
            case 27:
            case 28:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
            case 13:
            case 76:
                {
                alt13=2;
                }
                break;
            case 29:
                {
                alt13=3;
                }
                break;
            case 30:
                {
                alt13=4;
                }
                break;
            case 31:
                {
                alt13=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:652:5: this_SimpleValueProperty_0= ruleSimpleValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleValuePropertyAccess().getSimpleValuePropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleValueProperty_in_ruleSingleValueProperty1305);
                    this_SimpleValueProperty_0=ruleSimpleValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SimpleValueProperty_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:662:5: this_Element_1= ruleElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleValuePropertyAccess().getElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleElement_in_ruleSingleValueProperty1332);
                    this_Element_1=ruleElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Element_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:672:5: this_ReferenceValueProperty_2= ruleReferenceValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleValuePropertyAccess().getReferenceValuePropertyParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceValueProperty_in_ruleSingleValueProperty1359);
                    this_ReferenceValueProperty_2=ruleReferenceValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceValueProperty_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:682:5: this_IncludeValueProperty_3= ruleIncludeValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleValuePropertyAccess().getIncludeValuePropertyParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIncludeValueProperty_in_ruleSingleValueProperty1386);
                    this_IncludeValueProperty_3=ruleIncludeValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IncludeValueProperty_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:692:5: this_CopyValueProperty_4= ruleCopyValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSingleValuePropertyAccess().getCopyValuePropertyParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCopyValueProperty_in_ruleSingleValueProperty1413);
                    this_CopyValueProperty_4=ruleCopyValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CopyValueProperty_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleValueProperty"


    // $ANTLR start "entryRuleMultiValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:708:1: entryRuleMultiValueProperty returns [EObject current=null] : iv_ruleMultiValueProperty= ruleMultiValueProperty EOF ;
    public final EObject entryRuleMultiValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:709:2: (iv_ruleMultiValueProperty= ruleMultiValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:710:2: iv_ruleMultiValueProperty= ruleMultiValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleMultiValueProperty_in_entryRuleMultiValueProperty1448);
            iv_ruleMultiValueProperty=ruleMultiValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiValueProperty1458); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiValueProperty"


    // $ANTLR start "ruleMultiValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:717:1: ruleMultiValueProperty returns [EObject current=null] : (this_ListValueProperty_0= ruleListValueProperty | this_MapValueProperty_1= ruleMapValueProperty ) ;
    public final EObject ruleMultiValueProperty() throws RecognitionException {
        EObject current = null;

        EObject this_ListValueProperty_0 = null;

        EObject this_MapValueProperty_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:720:28: ( (this_ListValueProperty_0= ruleListValueProperty | this_MapValueProperty_1= ruleMapValueProperty ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:721:1: (this_ListValueProperty_0= ruleListValueProperty | this_MapValueProperty_1= ruleMapValueProperty )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:721:1: (this_ListValueProperty_0= ruleListValueProperty | this_MapValueProperty_1= ruleMapValueProperty )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            else if ( (LA14_0==17) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:722:5: this_ListValueProperty_0= ruleListValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiValuePropertyAccess().getListValuePropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleListValueProperty_in_ruleMultiValueProperty1505);
                    this_ListValueProperty_0=ruleListValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ListValueProperty_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:732:5: this_MapValueProperty_1= ruleMapValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiValuePropertyAccess().getMapValuePropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMapValueProperty_in_ruleMultiValueProperty1532);
                    this_MapValueProperty_1=ruleMapValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MapValueProperty_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiValueProperty"


    // $ANTLR start "entryRuleListValueElement"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:748:1: entryRuleListValueElement returns [EObject current=null] : iv_ruleListValueElement= ruleListValueElement EOF ;
    public final EObject entryRuleListValueElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListValueElement = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:749:2: (iv_ruleListValueElement= ruleListValueElement EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:750:2: iv_ruleListValueElement= ruleListValueElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListValueElementRule()); 
            }
            pushFollow(FOLLOW_ruleListValueElement_in_entryRuleListValueElement1567);
            iv_ruleListValueElement=ruleListValueElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListValueElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListValueElement1577); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListValueElement"


    // $ANTLR start "ruleListValueElement"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:757:1: ruleListValueElement returns [EObject current=null] : (this_Element_0= ruleElement | this_ReferenceValueProperty_1= ruleReferenceValueProperty | this_IncludeValueProperty_2= ruleIncludeValueProperty ) ;
    public final EObject ruleListValueElement() throws RecognitionException {
        EObject current = null;

        EObject this_Element_0 = null;

        EObject this_ReferenceValueProperty_1 = null;

        EObject this_IncludeValueProperty_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:760:28: ( (this_Element_0= ruleElement | this_ReferenceValueProperty_1= ruleReferenceValueProperty | this_IncludeValueProperty_2= ruleIncludeValueProperty ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:761:1: (this_Element_0= ruleElement | this_ReferenceValueProperty_1= ruleReferenceValueProperty | this_IncludeValueProperty_2= ruleIncludeValueProperty )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:761:1: (this_Element_0= ruleElement | this_ReferenceValueProperty_1= ruleReferenceValueProperty | this_IncludeValueProperty_2= ruleIncludeValueProperty )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 13:
            case 76:
                {
                alt15=1;
                }
                break;
            case 29:
                {
                alt15=2;
                }
                break;
            case 30:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:762:5: this_Element_0= ruleElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getListValueElementAccess().getElementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleElement_in_ruleListValueElement1624);
                    this_Element_0=ruleElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Element_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:772:5: this_ReferenceValueProperty_1= ruleReferenceValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getListValueElementAccess().getReferenceValuePropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceValueProperty_in_ruleListValueElement1651);
                    this_ReferenceValueProperty_1=ruleReferenceValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceValueProperty_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:782:5: this_IncludeValueProperty_2= ruleIncludeValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getListValueElementAccess().getIncludeValuePropertyParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIncludeValueProperty_in_ruleListValueElement1678);
                    this_IncludeValueProperty_2=ruleIncludeValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IncludeValueProperty_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListValueElement"


    // $ANTLR start "entryRuleListValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:798:1: entryRuleListValueProperty returns [EObject current=null] : iv_ruleListValueProperty= ruleListValueProperty EOF ;
    public final EObject entryRuleListValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:799:2: (iv_ruleListValueProperty= ruleListValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:800:2: iv_ruleListValueProperty= ruleListValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleListValueProperty_in_entryRuleListValueProperty1713);
            iv_ruleListValueProperty=ruleListValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListValueProperty1723); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListValueProperty"


    // $ANTLR start "ruleListValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:807:1: ruleListValueProperty returns [EObject current=null] : (otherlv_0= '[' ( (lv_value_1_0= ruleListValueElement ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleListValueElement ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleListValueProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:810:28: ( (otherlv_0= '[' ( (lv_value_1_0= ruleListValueElement ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleListValueElement ) ) )* otherlv_4= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:811:1: (otherlv_0= '[' ( (lv_value_1_0= ruleListValueElement ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleListValueElement ) ) )* otherlv_4= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:811:1: (otherlv_0= '[' ( (lv_value_1_0= ruleListValueElement ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleListValueElement ) ) )* otherlv_4= ']' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:811:3: otherlv_0= '[' ( (lv_value_1_0= ruleListValueElement ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleListValueElement ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleListValueProperty1760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getListValuePropertyAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:815:1: ( (lv_value_1_0= ruleListValueElement ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:816:1: (lv_value_1_0= ruleListValueElement )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:816:1: (lv_value_1_0= ruleListValueElement )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:817:3: lv_value_1_0= ruleListValueElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getListValuePropertyAccess().getValueListValueElementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleListValueElement_in_ruleListValueProperty1781);
            lv_value_1_0=ruleListValueElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getListValuePropertyRule());
              	        }
                     		add(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"ListValueElement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:833:2: (otherlv_2= ',' ( (lv_value_3_0= ruleListValueElement ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:833:4: otherlv_2= ',' ( (lv_value_3_0= ruleListValueElement ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleListValueProperty1794); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getListValuePropertyAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:837:1: ( (lv_value_3_0= ruleListValueElement ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:838:1: (lv_value_3_0= ruleListValueElement )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:838:1: (lv_value_3_0= ruleListValueElement )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:839:3: lv_value_3_0= ruleListValueElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getListValuePropertyAccess().getValueListValueElementParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleListValueElement_in_ruleListValueProperty1815);
            	    lv_value_3_0=ruleListValueElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getListValuePropertyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"value",
            	              		lv_value_3_0, 
            	              		"ListValueElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleListValueProperty1829); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getListValuePropertyAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListValueProperty"


    // $ANTLR start "entryRuleMapValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:867:1: entryRuleMapValueProperty returns [EObject current=null] : iv_ruleMapValueProperty= ruleMapValueProperty EOF ;
    public final EObject entryRuleMapValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:868:2: (iv_ruleMapValueProperty= ruleMapValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:869:2: iv_ruleMapValueProperty= ruleMapValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleMapValueProperty_in_entryRuleMapValueProperty1865);
            iv_ruleMapValueProperty=ruleMapValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapValueProperty1875); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapValueProperty"


    // $ANTLR start "ruleMapValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:876:1: ruleMapValueProperty returns [EObject current=null] : (otherlv_0= '{' ( (lv_properties_1_0= ruleProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleProperty ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleMapValueProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_1_0 = null;

        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:879:28: ( (otherlv_0= '{' ( (lv_properties_1_0= ruleProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleProperty ) ) )* otherlv_4= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:880:1: (otherlv_0= '{' ( (lv_properties_1_0= ruleProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleProperty ) ) )* otherlv_4= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:880:1: (otherlv_0= '{' ( (lv_properties_1_0= ruleProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleProperty ) ) )* otherlv_4= '}' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:880:3: otherlv_0= '{' ( (lv_properties_1_0= ruleProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleProperty ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleMapValueProperty1912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMapValuePropertyAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:884:1: ( (lv_properties_1_0= ruleProperty ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:885:1: (lv_properties_1_0= ruleProperty )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:885:1: (lv_properties_1_0= ruleProperty )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:886:3: lv_properties_1_0= ruleProperty
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapValuePropertyAccess().getPropertiesPropertyParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleProperty_in_ruleMapValueProperty1933);
            lv_properties_1_0=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapValuePropertyRule());
              	        }
                     		add(
                     			current, 
                     			"properties",
                      		lv_properties_1_0, 
                      		"Property");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:902:2: (otherlv_2= ',' ( (lv_properties_3_0= ruleProperty ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:902:4: otherlv_2= ',' ( (lv_properties_3_0= ruleProperty ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleMapValueProperty1946); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getMapValuePropertyAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:906:1: ( (lv_properties_3_0= ruleProperty ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:907:1: (lv_properties_3_0= ruleProperty )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:907:1: (lv_properties_3_0= ruleProperty )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:908:3: lv_properties_3_0= ruleProperty
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMapValuePropertyAccess().getPropertiesPropertyParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleProperty_in_ruleMapValueProperty1967);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMapValuePropertyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"properties",
            	              		lv_properties_3_0, 
            	              		"Property");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleMapValueProperty1981); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMapValuePropertyAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapValueProperty"


    // $ANTLR start "entryRuleSimpleValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:936:1: entryRuleSimpleValueProperty returns [EObject current=null] : iv_ruleSimpleValueProperty= ruleSimpleValueProperty EOF ;
    public final EObject entryRuleSimpleValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:937:2: (iv_ruleSimpleValueProperty= ruleSimpleValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:938:2: iv_ruleSimpleValueProperty= ruleSimpleValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleValueProperty_in_entryRuleSimpleValueProperty2017);
            iv_ruleSimpleValueProperty=ruleSimpleValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleValueProperty2027); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleValueProperty"


    // $ANTLR start "ruleSimpleValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:945:1: ruleSimpleValueProperty returns [EObject current=null] : ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( ( (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' ) ) ) | ( ( (lv_negative_2_0= '-' ) )? ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_realValue_4_0= RULE_REAL ) ) ) ) ) ;
    public final EObject ruleSimpleValueProperty() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_0_0=null;
        Token lv_booleanValue_1_1=null;
        Token lv_booleanValue_1_2=null;
        Token lv_negative_2_0=null;
        Token lv_intValue_3_0=null;
        Token lv_realValue_4_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:948:28: ( ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( ( (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' ) ) ) | ( ( (lv_negative_2_0= '-' ) )? ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_realValue_4_0= RULE_REAL ) ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:949:1: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( ( (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' ) ) ) | ( ( (lv_negative_2_0= '-' ) )? ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_realValue_4_0= RULE_REAL ) ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:949:1: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( ( (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' ) ) ) | ( ( (lv_negative_2_0= '-' ) )? ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_realValue_4_0= RULE_REAL ) ) ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt21=1;
                }
                break;
            case 26:
            case 27:
                {
                alt21=2;
                }
                break;
            case RULE_INT:
            case RULE_REAL:
            case 28:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:949:2: ( (lv_stringValue_0_0= RULE_STRING ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:949:2: ( (lv_stringValue_0_0= RULE_STRING ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:950:1: (lv_stringValue_0_0= RULE_STRING )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:950:1: (lv_stringValue_0_0= RULE_STRING )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:951:3: lv_stringValue_0_0= RULE_STRING
                    {
                    lv_stringValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleValueProperty2069); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_stringValue_0_0, grammarAccess.getSimpleValuePropertyAccess().getStringValueSTRINGTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSimpleValuePropertyRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"stringValue",
                              		lv_stringValue_0_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:968:6: ( ( (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:968:6: ( ( (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:969:1: ( (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:969:1: ( (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:970:1: (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:970:1: (lv_booleanValue_1_1= 'true' | lv_booleanValue_1_2= 'false' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==26) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==27) ) {
                        alt18=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:971:3: lv_booleanValue_1_1= 'true'
                            {
                            lv_booleanValue_1_1=(Token)match(input,26,FOLLOW_26_in_ruleSimpleValueProperty2100); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_booleanValue_1_1, grammarAccess.getSimpleValuePropertyAccess().getBooleanValueTrueKeyword_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSimpleValuePropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "booleanValue", lv_booleanValue_1_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:983:8: lv_booleanValue_1_2= 'false'
                            {
                            lv_booleanValue_1_2=(Token)match(input,27,FOLLOW_27_in_ruleSimpleValueProperty2129); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_booleanValue_1_2, grammarAccess.getSimpleValuePropertyAccess().getBooleanValueFalseKeyword_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSimpleValuePropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "booleanValue", lv_booleanValue_1_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:999:6: ( ( (lv_negative_2_0= '-' ) )? ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_realValue_4_0= RULE_REAL ) ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:999:6: ( ( (lv_negative_2_0= '-' ) )? ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_realValue_4_0= RULE_REAL ) ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:999:7: ( (lv_negative_2_0= '-' ) )? ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_realValue_4_0= RULE_REAL ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:999:7: ( (lv_negative_2_0= '-' ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==28) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1000:1: (lv_negative_2_0= '-' )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1000:1: (lv_negative_2_0= '-' )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1001:3: lv_negative_2_0= '-'
                            {
                            lv_negative_2_0=(Token)match(input,28,FOLLOW_28_in_ruleSimpleValueProperty2170); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_negative_2_0, grammarAccess.getSimpleValuePropertyAccess().getNegativeHyphenMinusKeyword_2_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSimpleValuePropertyRule());
                              	        }
                                     		setWithLastConsumed(current, "negative", true, "-");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1014:3: ( ( (lv_intValue_3_0= RULE_INT ) ) | ( (lv_realValue_4_0= RULE_REAL ) ) )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_INT) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==RULE_REAL) ) {
                        alt20=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1014:4: ( (lv_intValue_3_0= RULE_INT ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1014:4: ( (lv_intValue_3_0= RULE_INT ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1015:1: (lv_intValue_3_0= RULE_INT )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1015:1: (lv_intValue_3_0= RULE_INT )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1016:3: lv_intValue_3_0= RULE_INT
                            {
                            lv_intValue_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSimpleValueProperty2202); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_intValue_3_0, grammarAccess.getSimpleValuePropertyAccess().getIntValueINTTerminalRuleCall_2_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSimpleValuePropertyRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"intValue",
                                      		lv_intValue_3_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1033:6: ( (lv_realValue_4_0= RULE_REAL ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1033:6: ( (lv_realValue_4_0= RULE_REAL ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1034:1: (lv_realValue_4_0= RULE_REAL )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1034:1: (lv_realValue_4_0= RULE_REAL )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1035:3: lv_realValue_4_0= RULE_REAL
                            {
                            lv_realValue_4_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleSimpleValueProperty2230); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_realValue_4_0, grammarAccess.getSimpleValuePropertyAccess().getRealValueREALTerminalRuleCall_2_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSimpleValuePropertyRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"realValue",
                                      		lv_realValue_4_0, 
                                      		"REAL");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleValueProperty"


    // $ANTLR start "entryRuleReferenceValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1059:1: entryRuleReferenceValueProperty returns [EObject current=null] : iv_ruleReferenceValueProperty= ruleReferenceValueProperty EOF ;
    public final EObject entryRuleReferenceValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1060:2: (iv_ruleReferenceValueProperty= ruleReferenceValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1061:2: iv_ruleReferenceValueProperty= ruleReferenceValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceValueProperty_in_entryRuleReferenceValueProperty2273);
            iv_ruleReferenceValueProperty=ruleReferenceValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceValueProperty2283); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceValueProperty"


    // $ANTLR start "ruleReferenceValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1068:1: ruleReferenceValueProperty returns [EObject current=null] : (otherlv_0= 'idref' ( ( ruleValidID ) ) ) ;
    public final EObject ruleReferenceValueProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1071:28: ( (otherlv_0= 'idref' ( ( ruleValidID ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1072:1: (otherlv_0= 'idref' ( ( ruleValidID ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1072:1: (otherlv_0= 'idref' ( ( ruleValidID ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1072:3: otherlv_0= 'idref' ( ( ruleValidID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleReferenceValueProperty2320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReferenceValuePropertyAccess().getIdrefKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1076:1: ( ( ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1077:1: ( ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1077:1: ( ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1078:3: ruleValidID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceValuePropertyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceValuePropertyAccess().getReferenceElementCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleReferenceValueProperty2343);
            ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceValueProperty"


    // $ANTLR start "entryRuleIncludeValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1099:1: entryRuleIncludeValueProperty returns [EObject current=null] : iv_ruleIncludeValueProperty= ruleIncludeValueProperty EOF ;
    public final EObject entryRuleIncludeValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1100:2: (iv_ruleIncludeValueProperty= ruleIncludeValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1101:2: iv_ruleIncludeValueProperty= ruleIncludeValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleIncludeValueProperty_in_entryRuleIncludeValueProperty2379);
            iv_ruleIncludeValueProperty=ruleIncludeValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIncludeValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeValueProperty2389); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIncludeValueProperty"


    // $ANTLR start "ruleIncludeValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1108:1: ruleIncludeValueProperty returns [EObject current=null] : (otherlv_0= 'include' ( (lv_source_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleIncludeValueProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_source_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1111:28: ( (otherlv_0= 'include' ( (lv_source_1_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1112:1: (otherlv_0= 'include' ( (lv_source_1_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1112:1: (otherlv_0= 'include' ( (lv_source_1_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1112:3: otherlv_0= 'include' ( (lv_source_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleIncludeValueProperty2426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIncludeValuePropertyAccess().getIncludeKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1116:1: ( (lv_source_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1117:1: (lv_source_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1117:1: (lv_source_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1118:3: lv_source_1_0= RULE_STRING
            {
            lv_source_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIncludeValueProperty2443); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_source_1_0, grammarAccess.getIncludeValuePropertyAccess().getSourceSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIncludeValuePropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"source",
                      		lv_source_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIncludeValueProperty"


    // $ANTLR start "entryRuleCopyValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1142:1: entryRuleCopyValueProperty returns [EObject current=null] : iv_ruleCopyValueProperty= ruleCopyValueProperty EOF ;
    public final EObject entryRuleCopyValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopyValueProperty = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1143:2: (iv_ruleCopyValueProperty= ruleCopyValueProperty EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1144:2: iv_ruleCopyValueProperty= ruleCopyValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCopyValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleCopyValueProperty_in_entryRuleCopyValueProperty2484);
            iv_ruleCopyValueProperty=ruleCopyValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCopyValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCopyValueProperty2494); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCopyValueProperty"


    // $ANTLR start "ruleCopyValueProperty"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1151:1: ruleCopyValueProperty returns [EObject current=null] : (otherlv_0= 'copy' ( ( ruleValidID ) ) ) ;
    public final EObject ruleCopyValueProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1154:28: ( (otherlv_0= 'copy' ( ( ruleValidID ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1155:1: (otherlv_0= 'copy' ( ( ruleValidID ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1155:1: (otherlv_0= 'copy' ( ( ruleValidID ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1155:3: otherlv_0= 'copy' ( ( ruleValidID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleCopyValueProperty2531); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCopyValuePropertyAccess().getCopyKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1159:1: ( ( ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1160:1: ( ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1160:1: ( ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1161:3: ruleValidID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCopyValuePropertyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCopyValuePropertyAccess().getReferenceElementCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleCopyValueProperty2554);
            ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCopyValueProperty"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1182:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1183:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1184:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard2591);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard2602); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1191:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1194:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1195:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1195:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1196:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard2649);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1206:1: (kw= '.' kw= '*' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1207:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleQualifiedNameWithWildCard2668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleQualifiedNameWithWildCard2681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleXExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1226:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1227:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1228:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression2723);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression2733); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1235:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1238:28: (this_XAssignment_0= ruleXAssignment )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1240:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression2779);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1256:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1257:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1258:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment2813);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment2823); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1265:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1268:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1269:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1269:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==EOF||(LA24_1>=RULE_STRING && LA24_1<=RULE_INT)||LA24_1==13||LA24_1==15||LA24_1==17||(LA24_1>=19 && LA24_1<=20)||(LA24_1>=23 && LA24_1<=28)||(LA24_1>=32 && LA24_1<=33)||(LA24_1>=35 && LA24_1<=76)) ) {
                    alt24=2;
                }
                else if ( (LA24_1==34) ) {
                    alt24=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==RULE_STRING||LA24_0==RULE_INT||LA24_0==13||LA24_0==17||LA24_0==24||(LA24_0>=26 && LA24_0<=28)||LA24_0==44||LA24_0==47||LA24_0==51||LA24_0==55||LA24_0==57||(LA24_0>=60 && LA24_0<=62)||LA24_0==66||(LA24_0>=68 && LA24_0<=73)) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1269:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1269:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1269:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1269:3: ()
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1270:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1275:2: ( ( ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1276:1: ( ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1276:1: ( ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1277:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment2881);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2897);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1298:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1299:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1299:1: (lv_value_3_0= ruleXAssignment )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1300:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment2917);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1317:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1317:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1318:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment2947);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1326:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==35) ) {
                        int LA23_1 = input.LA(2);

                        if ( (synpred1_InternalFXGraph()) ) {
                            alt23=1;
                        }
                    }
                    switch (alt23) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1326:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1326:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1326:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1331:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1331:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1331:7: ()
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1332:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1337:2: ( ( ruleOpMultiAssign ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1338:1: ( ruleOpMultiAssign )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1338:1: ( ruleOpMultiAssign )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1339:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment3000);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1352:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1353:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1353:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1354:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment3023);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1378:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1379:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1380:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign3063);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign3074); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1387:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1390:28: (kw= '=' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1392:2: kw= '='
            {
            kw=(Token)match(input,34,FOLLOW_34_in_ruleOpSingleAssign3111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1405:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1406:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1407:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign3151);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign3162); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1414:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1417:28: (kw= '+=' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1419:2: kw= '+='
            {
            kw=(Token)match(input,35,FOLLOW_35_in_ruleOpMultiAssign3199); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1432:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1433:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1434:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression3238);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression3248); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1441:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1444:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1445:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1445:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1446:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression3295);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1454:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==36) ) {
                    int LA25_2 = input.LA(2);

                    if ( (synpred2_InternalFXGraph()) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1454:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1454:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1454:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1459:6: ( () ( ( ruleOpOr ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1459:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1459:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1460:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1465:2: ( ( ruleOpOr ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1466:1: ( ruleOpOr )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1466:1: ( ruleOpOr )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1467:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression3348);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1480:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1481:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1481:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1482:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression3371);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1506:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1507:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1508:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr3410);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr3421); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1515:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1518:28: (kw= '||' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1520:2: kw= '||'
            {
            kw=(Token)match(input,36,FOLLOW_36_in_ruleOpOr3458); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1533:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1534:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1535:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression3497);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression3507); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1542:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1545:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1546:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1546:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1547:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3554);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1555:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==37) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred3_InternalFXGraph()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1555:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1555:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1555:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1560:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1560:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1560:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1561:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1566:2: ( ( ruleOpAnd ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1567:1: ( ruleOpAnd )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1567:1: ( ruleOpAnd )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1568:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression3607);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1581:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1582:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1582:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1583:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3630);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1607:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1608:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1609:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd3669);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd3680); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1616:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1619:28: (kw= '&&' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1621:2: kw= '&&'
            {
            kw=(Token)match(input,37,FOLLOW_37_in_ruleOpAnd3717); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1634:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1635:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1636:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3756);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression3766); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1643:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1646:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1647:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1647:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1648:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3813);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1656:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==38) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred4_InternalFXGraph()) ) {
                        alt27=1;
                    }


                }
                else if ( (LA27_0==39) ) {
                    int LA27_3 = input.LA(2);

                    if ( (synpred4_InternalFXGraph()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1656:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1656:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1656:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1661:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1661:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1661:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1662:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1667:2: ( ( ruleOpEquality ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1668:1: ( ruleOpEquality )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1668:1: ( ruleOpEquality )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1669:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3866);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1682:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1683:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1683:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1684:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3889);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1708:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1709:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1710:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality3928);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality3939); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1717:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1720:28: ( (kw= '==' | kw= '!=' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1721:1: (kw= '==' | kw= '!=' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1721:1: (kw= '==' | kw= '!=' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            else if ( (LA28_0==39) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1722:2: kw= '=='
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpEquality3977); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1729:2: kw= '!='
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpEquality3996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1742:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1743:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1744:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression4036);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression4046); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1751:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1754:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1755:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1755:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1756:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4093);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1764:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop29:
            do {
                int alt29=3;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (synpred5_InternalFXGraph()) ) {
                        alt29=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (synpred6_InternalFXGraph()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA29_4 = input.LA(2);

                    if ( (synpred6_InternalFXGraph()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA29_5 = input.LA(2);

                    if ( (synpred6_InternalFXGraph()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA29_6 = input.LA(2);

                    if ( (synpred6_InternalFXGraph()) ) {
                        alt29=2;
                    }


                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1764:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1764:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1764:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1764:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1764:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1766:5: ( () otherlv_2= 'instanceof' )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1766:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1766:6: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1767:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXRelationalExpression4129); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1776:3: ( ( ruleQualifiedName ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1777:1: ( ruleQualifiedName )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1777:1: ( ruleQualifiedName )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1778:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression4154);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1792:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1792:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1792:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1792:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1792:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1797:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1797:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1797:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1798:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1803:2: ( ( ruleOpCompare ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1804:1: ( ruleOpCompare )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1804:1: ( ruleOpCompare )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1805:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression4215);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1818:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1819:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1819:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1820:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4238);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1844:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1845:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1846:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare4278);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare4289); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1853:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1856:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1857:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1857:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt30=1;
                }
                break;
            case 42:
                {
                alt30=2;
                }
                break;
            case 43:
                {
                alt30=3;
                }
                break;
            case 44:
                {
                alt30=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1858:2: kw= '>='
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpCompare4327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1865:2: kw= '<='
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOpCompare4346); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1872:2: kw= '>'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOpCompare4365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1879:2: kw= '<'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOpCompare4384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1892:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1893:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1894:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression4424);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression4434); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1901:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1904:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1905:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1905:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1906:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4481);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1914:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==45) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred7_InternalFXGraph()) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==46) ) {
                    int LA31_3 = input.LA(2);

                    if ( (synpred7_InternalFXGraph()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1914:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1914:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1914:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1919:6: ( () ( ( ruleOpOther ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1919:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1919:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1920:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1925:2: ( ( ruleOpOther ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1926:1: ( ruleOpOther )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1926:1: ( ruleOpOther )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1927:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression4534);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1940:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1941:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1941:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1942:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4557);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1966:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1967:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1968:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther4596);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther4607); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1975:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1978:28: ( (kw= '->' | kw= '..' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1979:1: (kw= '->' | kw= '..' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1979:1: (kw= '->' | kw= '..' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            else if ( (LA32_0==46) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1980:2: kw= '->'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOpOther4645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1987:2: kw= '..'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOpOther4664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2000:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2001:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2002:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4704);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression4714); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2009:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2012:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2013:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2013:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2014:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4761);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2022:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==47) ) {
                    int LA33_2 = input.LA(2);

                    if ( (synpred8_InternalFXGraph()) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==28) ) {
                    int LA33_3 = input.LA(2);

                    if ( (synpred8_InternalFXGraph()) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2022:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2022:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2022:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2027:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2027:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2027:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2028:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2033:2: ( ( ruleOpAdd ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2034:1: ( ruleOpAdd )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2034:1: ( ruleOpAdd )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2035:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4814);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2048:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2049:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2049:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2050:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4837);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2074:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2075:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2076:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd4876);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd4887); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2083:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2086:28: ( (kw= '+' | kw= '-' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2087:1: (kw= '+' | kw= '-' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2087:1: (kw= '+' | kw= '-' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==47) ) {
                alt34=1;
            }
            else if ( (LA34_0==28) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2088:2: kw= '+'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpAdd4925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2095:2: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpAdd4944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2108:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2109:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2110:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4984);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4994); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2117:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2120:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2121:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2121:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2122:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5041);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2130:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop35:
            do {
                int alt35=2;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    int LA35_2 = input.LA(2);

                    if ( (synpred9_InternalFXGraph()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case 48:
                    {
                    int LA35_3 = input.LA(2);

                    if ( (synpred9_InternalFXGraph()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA35_4 = input.LA(2);

                    if ( (synpred9_InternalFXGraph()) ) {
                        alt35=1;
                    }


                    }
                    break;
                case 50:
                    {
                    int LA35_5 = input.LA(2);

                    if ( (synpred9_InternalFXGraph()) ) {
                        alt35=1;
                    }


                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2130:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2130:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2130:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2135:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2135:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2135:7: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2136:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2141:2: ( ( ruleOpMulti ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2142:1: ( ruleOpMulti )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2142:1: ( ruleOpMulti )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2143:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression5094);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2156:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2157:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2157:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2158:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5117);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2182:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2183:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2184:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti5156);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti5167); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2191:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2194:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2195:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2195:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt36=1;
                }
                break;
            case 48:
                {
                alt36=2;
                }
                break;
            case 49:
                {
                alt36=3;
                }
                break;
            case 50:
                {
                alt36=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2196:2: kw= '*'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMulti5205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2203:2: kw= '**'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOpMulti5224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2210:2: kw= '/'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOpMulti5243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2217:2: kw= '%'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleOpMulti5262); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2230:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2231:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2232:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation5302);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation5312); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2239:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2242:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2243:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2243:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==28||LA37_0==47||LA37_0==51) ) {
                alt37=1;
            }
            else if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_INT)||LA37_0==13||LA37_0==17||LA37_0==24||(LA37_0>=26 && LA37_0<=27)||LA37_0==44||LA37_0==55||LA37_0==57||(LA37_0>=60 && LA37_0<=62)||LA37_0==66||(LA37_0>=68 && LA37_0<=73)) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2243:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2243:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2243:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2243:3: ()
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2244:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2249:2: ( ( ruleOpUnary ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2250:1: ( ruleOpUnary )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2250:1: ( ruleOpUnary )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2251:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation5370);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2264:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2265:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2265:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2266:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5391);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2284:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5420);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2300:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2301:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2302:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary5456);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary5467); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2309:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2312:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2313:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2313:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt38=1;
                }
                break;
            case 28:
                {
                alt38=2;
                }
                break;
            case 47:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2314:2: kw= '!'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleOpUnary5505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2321:2: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpUnary5524); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2328:2: kw= '+'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOpUnary5543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2341:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2342:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2343:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5583);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression5593); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2350:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2353:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2354:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2354:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2355:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5640);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2363:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==52) ) {
                    int LA39_2 = input.LA(2);

                    if ( (synpred10_InternalFXGraph()) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2363:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2363:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2363:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2365:5: ( () otherlv_2= 'as' )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2365:6: () otherlv_2= 'as'
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2365:6: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2366:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleXCastedExpression5675); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2375:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2376:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2376:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2377:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5698);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2401:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2402:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2403:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5736);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall5746); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2410:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2413:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2414:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2414:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2415:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5793);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2423:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop46:
            do {
                int alt46=3;
                switch ( input.LA(1) ) {
                case 32:
                    {
                    int LA46_2 = input.LA(2);

                    if ( (synpred11_InternalFXGraph()) ) {
                        alt46=1;
                    }
                    else if ( (synpred12_InternalFXGraph()) ) {
                        alt46=2;
                    }


                    }
                    break;
                case 53:
                    {
                    int LA46_3 = input.LA(2);

                    if ( (synpred12_InternalFXGraph()) ) {
                        alt46=2;
                    }


                    }
                    break;
                case 54:
                    {
                    int LA46_4 = input.LA(2);

                    if ( (synpred12_InternalFXGraph()) ) {
                        alt46=2;
                    }


                    }
                    break;

                }

                switch (alt46) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2423:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2423:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2423:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2423:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2423:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2429:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2429:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2429:26: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2430:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleXMemberFeatureCall5842); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2439:1: ( ( ruleValidID ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2440:1: ( ruleValidID )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2440:1: ( ruleValidID )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2441:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5865);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5881);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2462:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2463:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2463:1: (lv_value_5_0= ruleXAssignment )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2464:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5903);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2481:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2481:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2481:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2481:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2481:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2497:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2497:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2497:8: ()
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2498:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2503:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt40=3;
            	    switch ( input.LA(1) ) {
            	    case 32:
            	        {
            	        alt40=1;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt40=2;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt40=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt40) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2503:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleXMemberFeatureCall5989); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2508:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2508:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2509:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2509:1: (lv_nullSafe_8_0= '?.' )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2510:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,53,FOLLOW_53_in_ruleXMemberFeatureCall6013); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2524:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2524:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2525:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2525:1: (lv_spreading_9_0= '*.' )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2526:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,54,FOLLOW_54_in_ruleXMemberFeatureCall6050); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2539:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==44) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2539:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall6079); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2543:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2544:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2544:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2545:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6100);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2561:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop41:
            	            do {
            	                int alt41=2;
            	                int LA41_0 = input.LA(1);

            	                if ( (LA41_0==19) ) {
            	                    alt41=1;
            	                }


            	                switch (alt41) {
            	            	case 1 :
            	            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2561:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleXMemberFeatureCall6113); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2565:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2566:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2566:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2567:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6134);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop41;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall6148); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2587:3: ( ( ruleValidID ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2588:1: ( ruleValidID )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2588:1: ( ruleValidID )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2589:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall6173);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2602:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt45=2;
            	    alt45 = dfa45.predict(input);
            	    switch (alt45) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2602:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2602:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2602:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2609:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2610:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,13,FOLLOW_13_in_ruleXMemberFeatureCall6207); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2623:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt44=3;
            	            alt44 = dfa44.predict(input);
            	            switch (alt44) {
            	                case 1 :
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2623:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2623:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2623:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2635:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2636:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall6282);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2653:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2653:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2653:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2653:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2654:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2654:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2655:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6310);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2671:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop43:
            	                    do {
            	                        int alt43=2;
            	                        int LA43_0 = input.LA(1);

            	                        if ( (LA43_0==19) ) {
            	                            alt43=1;
            	                        }


            	                        switch (alt43) {
            	                    	case 1 :
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2671:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleXMemberFeatureCall6323); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2675:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2676:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2676:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2677:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6344);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop43;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,15,FOLLOW_15_in_ruleXMemberFeatureCall6361); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2705:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2706:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2707:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6402);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression6412); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2714:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2717:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2718:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2718:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt47=13;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt47=1;
                }
                break;
            case 17:
                {
                alt47=2;
                }
                break;
            case 57:
                {
                alt47=3;
                }
                break;
            case RULE_ID:
            case 44:
            case 66:
                {
                alt47=4;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 24:
            case 26:
            case 27:
            case 69:
            case 70:
                {
                alt47=5;
                }
                break;
            case 55:
                {
                alt47=6;
                }
                break;
            case 60:
                {
                alt47=7;
                }
                break;
            case 61:
                {
                alt47=8;
                }
                break;
            case 62:
                {
                alt47=9;
                }
                break;
            case 71:
                {
                alt47=10;
                }
                break;
            case 72:
                {
                alt47=11;
                }
                break;
            case 73:
                {
                alt47=12;
                }
                break;
            case 13:
                {
                alt47=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2719:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression6459);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2729:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression6486);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2739:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6513);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2749:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6540);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2759:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6567);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2769:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6594);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2779:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6621);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2789:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6648);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2799:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6675);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2809:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression6702);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2819:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression6729);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2829:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression6756);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2839:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6783);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2855:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2856:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2857:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral6818);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral6828); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2864:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2867:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2868:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2868:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt48=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt48=1;
                }
                break;
            case 26:
            case 27:
                {
                alt48=2;
                }
                break;
            case RULE_INT:
                {
                alt48=3;
                }
                break;
            case 69:
                {
                alt48=4;
                }
                break;
            case RULE_STRING:
                {
                alt48=5;
                }
                break;
            case 70:
                {
                alt48=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2869:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral6875);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2879:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6902);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2889:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral6929);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2899:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral6956);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2909:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral6983);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2919:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral7010);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2935:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2936:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2937:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure7045);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure7055); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2944:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_formalParameters_2_0 = null;

        EObject lv_formalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2947:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2948:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2948:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2948:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2948:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2949:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleXClosure7101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2958:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID||LA50_0==13||LA50_0==76) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2958:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2958:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2959:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2959:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2960:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7123);
                    lv_formalParameters_2_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_2_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2976:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==19) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2976:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleXClosure7136); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2980:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2981:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2981:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2982:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7157);
                    	    lv_formalParameters_4_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_4_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleXClosure7173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3002:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3003:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3003:1: (lv_expression_6_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3004:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure7194);
            lv_expression_6_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleXClosure7206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3032:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3033:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3034:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure7242);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure7252); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3041:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3044:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3045:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3045:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3045:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3045:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3045:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3056:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3056:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3056:6: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3057:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3062:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID||LA52_0==13||LA52_0==76) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3062:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3062:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3063:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3063:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3064:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7350);
                    lv_formalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3080:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==19) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3080:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXShortClosure7363); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3084:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3085:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3085:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3086:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7384);
                    	    lv_formalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleXShortClosure7400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3106:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3107:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3107:1: (lv_expression_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3108:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure7423);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3132:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3133:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3134:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7459);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression7469); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3141:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3144:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3145:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3145:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3145:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleXParenthesizedExpression7506); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7528);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleXParenthesizedExpression7539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3170:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3171:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3172:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7575);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression7585); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3179:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3182:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3183:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3183:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3183:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3183:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3184:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXIfExpression7631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXIfExpression7643); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3197:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3198:1: (lv_if_3_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3198:1: (lv_if_3_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3199:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7664);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleXIfExpression7676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3219:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3220:1: (lv_then_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3220:1: (lv_then_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3221:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7697);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3237:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==56) ) {
                int LA53_1 = input.LA(2);

                if ( (synpred16_InternalFXGraph()) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3237:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3237:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3237:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleXIfExpression7718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3242:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3243:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3243:1: (lv_else_7_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3244:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression7740);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3268:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3269:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3270:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7778);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression7788); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3277:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3280:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3281:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3281:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3281:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3281:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3282:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression7834); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3291:1: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==23) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3291:2: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3291:2: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3292:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3292:1: (lv_localVarName_2_0= ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3293:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression7856);
                    lv_localVarName_2_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleXSwitchExpression7868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3313:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3314:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3314:1: (lv_switch_4_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3315:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7891);
            lv_switch_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression7903); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3335:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID||LA55_0==13||LA55_0==23||LA55_0==59||LA55_0==76) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3336:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3336:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3337:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7924);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3353:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==58) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3353:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,58,FOLLOW_58_in_ruleXSwitchExpression7938); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleXSwitchExpression7950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3361:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3362:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3362:1: (lv_default_9_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3363:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression7971);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleXSwitchExpression7985); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3391:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3392:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3393:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart8021);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart8031); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3400:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3403:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3404:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3404:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3404:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3404:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID||LA57_0==13||LA57_0==76) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3405:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3405:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3406:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart8077);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3422:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==59) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3422:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXCasePart8091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3426:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3427:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3427:1: (lv_case_2_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3428:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart8112);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleXCasePart8126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3448:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3449:1: (lv_then_4_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3449:1: (lv_then_4_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3450:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart8147);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3474:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3475:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3476:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8183);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression8193); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3483:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3486:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3487:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3487:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3487:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3487:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3488:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXForLoopExpression8239); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXForLoopExpression8251); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3501:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3502:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3502:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3503:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8272);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleXForLoopExpression8284); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3523:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3524:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3524:1: (lv_forExpression_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3525:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8305);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleXForLoopExpression8317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3545:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3546:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3546:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3547:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression8338);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3571:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3572:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3573:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8374);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression8384); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3580:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3583:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3584:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3584:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3584:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3584:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3585:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXWhileExpression8430); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXWhileExpression8442); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3598:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3599:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3599:1: (lv_predicate_3_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3600:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8463);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleXWhileExpression8475); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3620:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3621:1: (lv_body_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3621:1: (lv_body_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3622:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression8496);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3646:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3647:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3648:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8532);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression8542); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3655:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3658:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3659:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3659:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3659:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3659:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3660:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXDoWhileExpression8588); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3669:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3670:1: (lv_body_2_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3670:1: (lv_body_2_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3671:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8609);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,61,FOLLOW_61_in_ruleXDoWhileExpression8621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleXDoWhileExpression8633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3695:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3696:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3696:1: (lv_predicate_5_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3697:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8654);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleXDoWhileExpression8666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3725:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3726:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3727:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8702);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression8712); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3734:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3737:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3738:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3738:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3738:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3738:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3739:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleXBlockExpression8758); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3748:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=RULE_STRING && LA60_0<=RULE_INT)||LA60_0==13||LA60_0==17||LA60_0==24||(LA60_0>=26 && LA60_0<=28)||LA60_0==44||LA60_0==47||LA60_0==51||LA60_0==55||LA60_0==57||(LA60_0>=60 && LA60_0<=62)||(LA60_0>=64 && LA60_0<=66)||(LA60_0>=68 && LA60_0<=73)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3748:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3748:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3749:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3749:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3750:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8780);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3766:2: (otherlv_3= ';' )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==63) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3766:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,63,FOLLOW_63_in_ruleXBlockExpression8793); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleXBlockExpression8809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3782:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3783:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3784:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8845);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8855); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3791:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3794:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3795:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3795:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=64 && LA61_0<=65)) ) {
                alt61=1;
            }
            else if ( ((LA61_0>=RULE_STRING && LA61_0<=RULE_INT)||LA61_0==13||LA61_0==17||LA61_0==24||(LA61_0>=26 && LA61_0<=28)||LA61_0==44||LA61_0==47||LA61_0==51||LA61_0==55||LA61_0==57||(LA61_0>=60 && LA61_0<=62)||LA61_0==66||(LA61_0>=68 && LA61_0<=73)) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3796:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8902);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3806:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8929);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3822:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3823:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3824:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8964);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration8974); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3831:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3834:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3835:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3835:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3835:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3835:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3836:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3841:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==64) ) {
                alt62=1;
            }
            else if ( (LA62_0==65) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3841:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3841:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3842:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3842:1: (lv_writeable_1_0= 'var' )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3843:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,64,FOLLOW_64_in_ruleXVariableDeclaration9027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3857:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleXVariableDeclaration9058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3861:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                int LA63_1 = input.LA(2);

                if ( (synpred17_InternalFXGraph()) ) {
                    alt63=1;
                }
                else if ( (true) ) {
                    alt63=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA63_0==13) && (synpred17_InternalFXGraph())) {
                alt63=1;
            }
            else if ( (LA63_0==76) && (synpred17_InternalFXGraph())) {
                alt63=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3861:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3861:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3861:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3869:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3869:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3869:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3870:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3870:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3871:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration9106);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3887:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3888:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3888:1: (lv_name_4_0= ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3889:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration9127);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3906:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3906:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3907:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3907:1: (lv_name_5_0= ruleValidID )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3908:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration9156);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3924:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==34) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3924:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleXVariableDeclaration9170); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3928:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3929:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3929:1: (lv_right_7_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3930:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9191);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3954:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3955:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3956:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9229);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter9239); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3963:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3966:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3967:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3967:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3967:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3967:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==RULE_ID||LA65_1==32||LA65_1==44) ) {
                    alt65=1;
                }
            }
            else if ( (LA65_0==13||LA65_0==76) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3968:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3968:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3969:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9285);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3985:3: ( (lv_name_1_0= ruleValidID ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3986:1: (lv_name_1_0= ruleValidID )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3986:1: (lv_name_1_0= ruleValidID )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3987:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter9307);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4011:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4012:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4013:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9343);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall9353); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4020:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4023:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4024:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4024:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4024:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4024:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4025:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4030:2: ( ( ruleStaticQualifier ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==67) ) {
                    alt66=1;
                }
            }
            switch (alt66) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4031:1: ( ruleStaticQualifier )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4031:1: ( ruleStaticQualifier )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4032:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9410);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4045:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==44) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4045:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleXFeatureCall9424); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4049:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4050:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4050:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4051:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9445);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4067:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==19) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4067:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleXFeatureCall9458); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4071:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4072:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4072:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4073:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9479);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,43,FOLLOW_43_in_ruleXFeatureCall9493); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4093:3: ( ( ruleIdOrSuper ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4094:1: ( ruleIdOrSuper )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4094:1: ( ruleIdOrSuper )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4095:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9518);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4108:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4108:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4108:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4108:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4115:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4116:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,13,FOLLOW_13_in_ruleXFeatureCall9552); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4129:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt70=3;
                    alt70 = dfa70.predict(input);
                    switch (alt70) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4129:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4129:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4129:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4141:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4142:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9627);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4159:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4159:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4159:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4159:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4160:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4160:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4161:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9655);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4177:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop69:
                            do {
                                int alt69=2;
                                int LA69_0 = input.LA(1);

                                if ( (LA69_0==19) ) {
                                    alt69=1;
                                }


                                switch (alt69) {
                            	case 1 :
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4177:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleXFeatureCall9668); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4181:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4182:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4182:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4183:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall9689);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop69;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleXFeatureCall9706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4211:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4212:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4213:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9745);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper9756); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4220:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4223:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4224:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4224:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID) ) {
                alt72=1;
            }
            else if ( (LA72_0==66) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4225:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper9803);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4237:2: kw= 'super'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleIdOrSuper9827); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4250:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4251:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4252:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9868);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier9879); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4259:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4262:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4263:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4263:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt73=0;
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_ID) ) {
                    int LA73_2 = input.LA(2);

                    if ( (LA73_2==67) ) {
                        alt73=1;
                    }


                }


                switch (alt73) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4264:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier9926);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,67,FOLLOW_67_in_ruleStaticQualifier9944); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt73 >= 1 ) break loop73;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(73, input);
                        throw eee;
                }
                cnt73++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4288:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4289:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4290:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9985);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall9995); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4297:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4300:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4301:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4301:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4301:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4301:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4302:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleXConstructorCall10041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4311:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4312:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4312:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4313:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10064);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4326:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==44) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4326:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleXConstructorCall10077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4330:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4331:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4331:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4332:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10098);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4348:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==19) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4348:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleXConstructorCall10111); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4352:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4353:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4353:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4354:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10132);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,43,FOLLOW_43_in_ruleXConstructorCall10146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleXConstructorCall10160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4378:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt77=3;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4378:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4378:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4378:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4390:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4391:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10222);
                    lv_arguments_9_0=ruleXShortClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_9_0, 
                              		"XShortClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4408:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4408:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4408:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4408:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4409:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4409:1: (lv_arguments_10_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4410:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10250);
                    lv_arguments_10_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_10_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4426:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==19) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4426:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleXConstructorCall10263); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4430:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4431:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4431:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4432:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall10284);
                    	    lv_arguments_12_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_12_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleXConstructorCall10301); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4460:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4461:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4462:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10337);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral10347); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4469:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4472:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4473:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4473:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4473:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4473:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4474:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4479:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==27) ) {
                alt78=1;
            }
            else if ( (LA78_0==26) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4479:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleXBooleanLiteral10394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4484:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4484:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4485:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4485:1: (lv_isTrue_2_0= 'true' )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4486:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,26,FOLLOW_26_in_ruleXBooleanLiteral10418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4507:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4508:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4509:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10468);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral10478); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4516:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4519:28: ( ( () otherlv_1= 'null' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4520:1: ( () otherlv_1= 'null' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4520:1: ( () otherlv_1= 'null' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4520:2: () otherlv_1= 'null'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4520:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4521:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXNullLiteral10524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXIntLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4538:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4539:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4540:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral10560);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral10570); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4547:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4550:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4551:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4551:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4551:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4551:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4552:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4557:2: ( (lv_value_1_0= RULE_INT ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4558:1: (lv_value_1_0= RULE_INT )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4558:1: (lv_value_1_0= RULE_INT )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4559:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral10621); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4583:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4584:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4585:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10662);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral10672); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4592:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4595:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4596:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4596:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4596:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4596:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4597:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4602:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4603:1: (lv_value_1_0= RULE_STRING )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4603:1: (lv_value_1_0= RULE_STRING )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4604:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral10723); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4628:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4629:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4630:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10764);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral10774); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4637:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4640:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4641:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4641:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4641:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4641:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4642:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTypeLiteral10820); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXTypeLiteral10832); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4655:1: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4656:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4656:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4657:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10855);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleXTypeLiteral10867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4682:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4683:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4684:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10903);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression10913); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4691:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4694:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4695:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4695:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4695:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4695:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4696:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXThrowExpression10959); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4705:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4706:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4706:1: (lv_expression_2_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4707:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression10980);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4731:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4732:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4733:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11016);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression11026); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4740:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4743:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4744:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4744:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4744:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4744:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4745:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXReturnExpression11072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4754:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4754:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4759:1: (lv_expression_2_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4760:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression11103);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4784:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4785:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4786:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11140);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11150); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4793:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4796:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4797:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4797:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4797:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4797:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4798:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression11196); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4807:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4808:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4808:1: (lv_expression_2_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4809:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11217);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4825:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==75) ) {
                alt82=1;
            }
            else if ( (LA82_0==74) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4825:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4825:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4825:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4825:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt80=0;
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==75) ) {
                            int LA80_2 = input.LA(2);

                            if ( (synpred22_InternalFXGraph()) ) {
                                alt80=1;
                            }


                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4825:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4827:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4828:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11247);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt80 >= 1 ) break loop80;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(80, input);
                                throw eee;
                        }
                        cnt80++;
                    } while (true);

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4844:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==74) ) {
                        int LA81_1 = input.LA(2);

                        if ( (synpred23_InternalFXGraph()) ) {
                            alt81=1;
                        }
                    }
                    switch (alt81) {
                        case 1 :
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4844:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4844:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4844:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression11269); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4849:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4850:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4850:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4851:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11291);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4868:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4868:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4868:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression11313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4872:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4873:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4873:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4874:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11334);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4898:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4899:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4900:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11372);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause11382); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4907:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4910:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4911:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4911:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4911:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4911:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4911:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleXCatchClause11427); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleXCatchClause11440); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4920:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4921:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4921:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4922:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause11461);
            lv_declaredParam_2_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleXCatchClause11473); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4942:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4943:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4943:1: (lv_expression_4_0= ruleXExpression )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4944:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause11494);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4968:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4969:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4970:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11531);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11542); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4977:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4980:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4981:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4981:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4982:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11589);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4992:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==32) ) {
                    int LA83_1 = input.LA(2);

                    if ( (LA83_1==RULE_ID) ) {
                        int LA83_3 = input.LA(3);

                        if ( (synpred25_InternalFXGraph()) ) {
                            alt83=1;
                        }


                    }


                }


                switch (alt83) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4992:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4992:2: ( ( '.' )=>kw= '.' )
            	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4992:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,32,FOLLOW_32_in_ruleQualifiedName11617); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName11640);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5019:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5020:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5021:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11687);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference11697); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5028:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5031:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5032:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5032:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_ID) ) {
                alt84=1;
            }
            else if ( (LA84_0==13||LA84_0==76) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5033:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11744);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5043:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11771);
                    this_XFunctionTypeRef_1=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5059:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5060:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5061:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11806);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef11816); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5068:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5071:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5072:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5072:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5072:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5072:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==13) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5072:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleXFunctionTypeRef11854); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5076:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5077:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5077:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5078:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11875);
                    lv_paramTypes_1_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                      	        }
                             		add(
                             			current, 
                             			"paramTypes",
                              		lv_paramTypes_1_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5094:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==19) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5094:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXFunctionTypeRef11888); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5098:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5099:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5099:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5100:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11909);
                    	    lv_paramTypes_3_0=ruleJvmTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"paramTypes",
                    	              		lv_paramTypes_3_0, 
                    	              		"JvmTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleXFunctionTypeRef11923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,76,FOLLOW_76_in_ruleXFunctionTypeRef11937); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5124:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5125:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5125:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5126:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11958);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5150:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5151:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5152:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11994);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12004); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5159:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5162:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5163:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5163:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5163:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5163:2: ( ( ruleQualifiedName ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5164:1: ( ruleQualifiedName )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5164:1: ( ruleQualifiedName )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5165:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12052);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5178:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt88=2;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5178:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5178:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5178:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleJvmParameterizedTypeReference12073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5183:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5184:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5184:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5185:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12095);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5201:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==19) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5201:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleJvmParameterizedTypeReference12108); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5205:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5206:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5206:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5207:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12129);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleJvmParameterizedTypeReference12143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5235:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5236:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5237:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12181);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12191); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5244:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5247:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5248:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5248:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_ID||LA89_0==13||LA89_0==76) ) {
                alt89=1;
            }
            else if ( (LA89_0==77) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5249:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12238);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5259:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12265);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5275:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5276:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5277:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12300);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12310); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5284:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5287:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5288:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5288:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5288:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5288:2: ()
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5289:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleJvmWildcardTypeReference12356); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5298:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt90=3;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==78) ) {
                alt90=1;
            }
            else if ( (LA90_0==66) ) {
                alt90=2;
            }
            switch (alt90) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5298:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5298:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5299:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5299:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5300:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12378);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5317:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5317:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5318:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5318:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5319:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12405);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5343:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5344:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5345:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12443);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound12453); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5352:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5355:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5356:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5356:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5356:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleJvmUpperBound12490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5360:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5361:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5361:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5362:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12511);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5386:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5387:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5388:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12547);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12557); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5395:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5398:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5399:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5399:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5399:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleJvmUpperBoundAnded12594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5403:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5404:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5404:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5405:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12615);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5429:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5430:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5431:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12651);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound12661); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5438:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5441:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5442:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5442:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5442:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleJvmLowerBound12698); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5446:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5447:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5447:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5448:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12719);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5474:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5475:2: (iv_ruleValidID= ruleValidID EOF )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5476:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12758);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12769); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5483:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5486:28: (this_ID_0= RULE_ID )
            // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5487:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12808); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalFXGraph
    public final void synpred1_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1326:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1326:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1326:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1326:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1326:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1327:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1327:2: ( ( ruleOpMultiAssign ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1328:1: ( ruleOpMultiAssign )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1328:1: ( ruleOpMultiAssign )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1329:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalFXGraph2968);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalFXGraph

    // $ANTLR start synpred2_InternalFXGraph
    public final void synpred2_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1454:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1454:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1454:4: ( () ( ( ruleOpOr ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1454:5: () ( ( ruleOpOr ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1454:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1455:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1455:2: ( ( ruleOpOr ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1456:1: ( ruleOpOr )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1456:1: ( ruleOpOr )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1457:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalFXGraph3316);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalFXGraph

    // $ANTLR start synpred3_InternalFXGraph
    public final void synpred3_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1555:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1555:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1555:4: ( () ( ( ruleOpAnd ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1555:5: () ( ( ruleOpAnd ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1555:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1556:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1556:2: ( ( ruleOpAnd ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1557:1: ( ruleOpAnd )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1557:1: ( ruleOpAnd )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1558:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalFXGraph3575);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalFXGraph

    // $ANTLR start synpred4_InternalFXGraph
    public final void synpred4_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1656:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1656:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1656:4: ( () ( ( ruleOpEquality ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1656:5: () ( ( ruleOpEquality ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1656:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1657:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1657:2: ( ( ruleOpEquality ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1658:1: ( ruleOpEquality )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1658:1: ( ruleOpEquality )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1659:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalFXGraph3834);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalFXGraph

    // $ANTLR start synpred5_InternalFXGraph
    public final void synpred5_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1764:4: ( ( () 'instanceof' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1764:5: ( () 'instanceof' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1764:5: ( () 'instanceof' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1764:6: () 'instanceof'
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1764:6: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1765:1: 
        {
        }

        match(input,40,FOLLOW_40_in_synpred5_InternalFXGraph4110); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalFXGraph

    // $ANTLR start synpred6_InternalFXGraph
    public final void synpred6_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1792:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1792:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1792:9: ( () ( ( ruleOpCompare ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1792:10: () ( ( ruleOpCompare ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1792:10: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1793:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1793:2: ( ( ruleOpCompare ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1794:1: ( ruleOpCompare )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1794:1: ( ruleOpCompare )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1795:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalFXGraph4183);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalFXGraph

    // $ANTLR start synpred7_InternalFXGraph
    public final void synpred7_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1914:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1914:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1914:4: ( () ( ( ruleOpOther ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1914:5: () ( ( ruleOpOther ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1914:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1915:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1915:2: ( ( ruleOpOther ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1916:1: ( ruleOpOther )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1916:1: ( ruleOpOther )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:1917:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalFXGraph4502);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalFXGraph

    // $ANTLR start synpred8_InternalFXGraph
    public final void synpred8_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2022:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2022:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2022:4: ( () ( ( ruleOpAdd ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2022:5: () ( ( ruleOpAdd ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2022:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2023:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2023:2: ( ( ruleOpAdd ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2024:1: ( ruleOpAdd )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2024:1: ( ruleOpAdd )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2025:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalFXGraph4782);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalFXGraph

    // $ANTLR start synpred9_InternalFXGraph
    public final void synpred9_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2130:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2130:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2130:4: ( () ( ( ruleOpMulti ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2130:5: () ( ( ruleOpMulti ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2130:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2131:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2131:2: ( ( ruleOpMulti ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2132:1: ( ruleOpMulti )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2132:1: ( ruleOpMulti )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2133:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalFXGraph5062);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalFXGraph

    // $ANTLR start synpred10_InternalFXGraph
    public final void synpred10_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2363:3: ( ( () 'as' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2363:4: ( () 'as' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2363:4: ( () 'as' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2363:5: () 'as'
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2363:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2364:1: 
        {
        }

        match(input,52,FOLLOW_52_in_synpred10_InternalFXGraph5656); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalFXGraph

    // $ANTLR start synpred11_InternalFXGraph
    public final void synpred11_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2423:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2423:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2423:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2423:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2423:6: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2424:1: 
        {
        }

        match(input,32,FOLLOW_32_in_synpred11_InternalFXGraph5810); if (state.failed) return ;
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2425:1: ( ( ruleValidID ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2426:1: ( ruleValidID )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2426:1: ( ruleValidID )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2427:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalFXGraph5819);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalFXGraph5825);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalFXGraph

    // $ANTLR start synpred12_InternalFXGraph
    public final void synpred12_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2481:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2481:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2481:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2481:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2481:10: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2482:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2482:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt91=3;
        switch ( input.LA(1) ) {
        case 32:
            {
            alt91=1;
            }
            break;
        case 53:
            {
            alt91=2;
            }
            break;
        case 54:
            {
            alt91=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 91, 0, input);

            throw nvae;
        }

        switch (alt91) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2482:4: '.'
                {
                match(input,32,FOLLOW_32_in_synpred12_InternalFXGraph5928); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2484:6: ( ( '?.' ) )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2484:6: ( ( '?.' ) )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2485:1: ( '?.' )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2485:1: ( '?.' )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2486:2: '?.'
                {
                match(input,53,FOLLOW_53_in_synpred12_InternalFXGraph5942); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2491:6: ( ( '*.' ) )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2491:6: ( ( '*.' ) )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2492:1: ( '*.' )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2492:1: ( '*.' )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2493:2: '*.'
                {
                match(input,54,FOLLOW_54_in_synpred12_InternalFXGraph5962); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalFXGraph

    // $ANTLR start synpred13_InternalFXGraph
    public final void synpred13_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2602:4: ( ( '(' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2603:1: ( '(' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2603:1: ( '(' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2604:2: '('
        {
        match(input,13,FOLLOW_13_in_synpred13_InternalFXGraph6189); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalFXGraph

    // $ANTLR start synpred14_InternalFXGraph
    public final void synpred14_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2623:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2623:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2623:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2623:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2623:6: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2624:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2624:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt93=2;
        int LA93_0 = input.LA(1);

        if ( (LA93_0==RULE_ID||LA93_0==13||LA93_0==76) ) {
            alt93=1;
        }
        switch (alt93) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2624:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2624:3: ( ( ruleJvmFormalParameter ) )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2625:1: ( ruleJvmFormalParameter )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2625:1: ( ruleJvmFormalParameter )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2626:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFXGraph6241);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2628:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop92:
                do {
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==19) ) {
                        alt92=1;
                    }


                    switch (alt92) {
                	case 1 :
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2628:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,19,FOLLOW_19_in_synpred14_InternalFXGraph6248); if (state.failed) return ;
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2629:1: ( ( ruleJvmFormalParameter ) )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2630:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2630:1: ( ruleJvmFormalParameter )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:2631:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFXGraph6255);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop92;
                    }
                } while (true);


                }
                break;

        }

        match(input,18,FOLLOW_18_in_synpred14_InternalFXGraph6265); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalFXGraph

    // $ANTLR start synpred16_InternalFXGraph
    public final void synpred16_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3237:4: ( 'else' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3237:6: 'else'
        {
        match(input,56,FOLLOW_56_in_synpred16_InternalFXGraph7710); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalFXGraph

    // $ANTLR start synpred17_InternalFXGraph
    public final void synpred17_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3861:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3861:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3861:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3861:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3861:6: ( ( ruleJvmTypeReference ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3862:1: ( ruleJvmTypeReference )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3862:1: ( ruleJvmTypeReference )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3863:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred17_InternalFXGraph9076);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3865:2: ( ( ruleValidID ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3866:1: ( ruleValidID )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3866:1: ( ruleValidID )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:3867:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred17_InternalFXGraph9085);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalFXGraph

    // $ANTLR start synpred18_InternalFXGraph
    public final void synpred18_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4108:4: ( ( '(' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4109:1: ( '(' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4109:1: ( '(' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4110:2: '('
        {
        match(input,13,FOLLOW_13_in_synpred18_InternalFXGraph9534); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalFXGraph

    // $ANTLR start synpred19_InternalFXGraph
    public final void synpred19_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4129:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4129:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4129:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4129:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4129:6: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4130:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4130:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==RULE_ID||LA97_0==13||LA97_0==76) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4130:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4130:3: ( ( ruleJvmFormalParameter ) )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4131:1: ( ruleJvmFormalParameter )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4131:1: ( ruleJvmFormalParameter )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4132:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalFXGraph9586);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4134:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop96:
                do {
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==19) ) {
                        alt96=1;
                    }


                    switch (alt96) {
                	case 1 :
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4134:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,19,FOLLOW_19_in_synpred19_InternalFXGraph9593); if (state.failed) return ;
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4135:1: ( ( ruleJvmFormalParameter ) )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4136:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4136:1: ( ruleJvmFormalParameter )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4137:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalFXGraph9600);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop96;
                    }
                } while (true);


                }
                break;

        }

        match(input,18,FOLLOW_18_in_synpred19_InternalFXGraph9610); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalFXGraph

    // $ANTLR start synpred20_InternalFXGraph
    public final void synpred20_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4378:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4378:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4378:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4378:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4378:5: ()
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4379:1: 
        {
        }

        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4379:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==RULE_ID||LA99_0==13||LA99_0==76) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4379:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4379:3: ( ( ruleJvmFormalParameter ) )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4380:1: ( ruleJvmFormalParameter )
                {
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4380:1: ( ruleJvmFormalParameter )
                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4381:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFXGraph10181);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4383:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop98:
                do {
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==19) ) {
                        alt98=1;
                    }


                    switch (alt98) {
                	case 1 :
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4383:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,19,FOLLOW_19_in_synpred20_InternalFXGraph10188); if (state.failed) return ;
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4384:1: ( ( ruleJvmFormalParameter ) )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4385:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4385:1: ( ruleJvmFormalParameter )
                	    // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4386:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFXGraph10195);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop98;
                    }
                } while (true);


                }
                break;

        }

        match(input,18,FOLLOW_18_in_synpred20_InternalFXGraph10205); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalFXGraph

    // $ANTLR start synpred21_InternalFXGraph
    public final void synpred21_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4754:2: ( ( ruleXExpression ) )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4755:1: ( ruleXExpression )
        {
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4755:1: ( ruleXExpression )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4756:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalFXGraph11086);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalFXGraph

    // $ANTLR start synpred22_InternalFXGraph
    public final void synpred22_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4825:5: ( 'catch' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4825:7: 'catch'
        {
        match(input,75,FOLLOW_75_in_synpred22_InternalFXGraph11231); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalFXGraph

    // $ANTLR start synpred23_InternalFXGraph
    public final void synpred23_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4844:5: ( 'finally' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4844:7: 'finally'
        {
        match(input,74,FOLLOW_74_in_synpred23_InternalFXGraph11261); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalFXGraph

    // $ANTLR start synpred25_InternalFXGraph
    public final void synpred25_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4992:3: ( '.' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:4993:2: '.'
        {
        match(input,32,FOLLOW_32_in_synpred25_InternalFXGraph11608); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalFXGraph

    // $ANTLR start synpred26_InternalFXGraph
    public final void synpred26_InternalFXGraph_fragment() throws RecognitionException {   
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5178:4: ( '<' )
        // ../at.bestsolution.efxclipse.tooling.fxgraph/src-gen/at/bestsolution/efxclipse/tooling/fxgraph/parser/antlr/internal/InternalFXGraph.g:5178:6: '<'
        {
        match(input,44,FOLLOW_44_in_synpred26_InternalFXGraph12065); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalFXGraph

    // Delegated rules

    public final boolean synpred7_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalFXGraph() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalFXGraph_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA45 dfa45 = new DFA45(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA88 dfa88 = new DFA88(this);
    static final String DFA45_eotS =
        "\74\uffff";
    static final String DFA45_eofS =
        "\1\2\73\uffff";
    static final String DFA45_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA45_maxS =
        "\1\114\1\0\72\uffff";
    static final String DFA45_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA45_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA45_transitionS = {
            "\3\2\6\uffff\1\1\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\2\uffff"+
            "\6\2\3\uffff\2\2\1\uffff\40\2\1\uffff\11\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "2602:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_1 = input.LA(1);

                         
                        int index45_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index45_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA44_eotS =
        "\34\uffff";
    static final String DFA44_eofS =
        "\34\uffff";
    static final String DFA44_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA44_maxS =
        "\1\114\2\0\31\uffff";
    static final String DFA44_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA44_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\5\1\1\1\5\6\uffff\1\2\1\uffff\1\33\1\uffff\1\5\1\4\5\uffff"+
            "\1\5\1\uffff\3\5\17\uffff\1\5\2\uffff\1\5\3\uffff\1\5\3\uffff"+
            "\1\5\1\uffff\1\5\2\uffff\3\5\3\uffff\1\5\1\uffff\6\5\2\uffff"+
            "\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "2623:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_0 = input.LA(1);

                         
                        int index44_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA44_0==RULE_ID) ) {s = 1;}

                        else if ( (LA44_0==13) ) {s = 2;}

                        else if ( (LA44_0==76) && (synpred14_InternalFXGraph())) {s = 3;}

                        else if ( (LA44_0==18) && (synpred14_InternalFXGraph())) {s = 4;}

                        else if ( (LA44_0==RULE_STRING||LA44_0==RULE_INT||LA44_0==17||LA44_0==24||(LA44_0>=26 && LA44_0<=28)||LA44_0==44||LA44_0==47||LA44_0==51||LA44_0==55||LA44_0==57||(LA44_0>=60 && LA44_0<=62)||LA44_0==66||(LA44_0>=68 && LA44_0<=73)) ) {s = 5;}

                        else if ( (LA44_0==15) ) {s = 27;}

                         
                        input.seek(index44_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_1 = input.LA(1);

                         
                        int index44_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA44_2 = input.LA(1);

                         
                        int index44_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index44_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\74\uffff";
    static final String DFA71_eofS =
        "\1\2\73\uffff";
    static final String DFA71_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA71_maxS =
        "\1\114\1\0\72\uffff";
    static final String DFA71_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA71_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA71_transitionS = {
            "\3\2\6\uffff\1\1\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\2\uffff"+
            "\6\2\3\uffff\2\2\1\uffff\40\2\1\uffff\11\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "4108:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\34\uffff";
    static final String DFA70_eofS =
        "\34\uffff";
    static final String DFA70_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA70_maxS =
        "\1\114\2\0\31\uffff";
    static final String DFA70_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA70_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\5\1\1\1\5\6\uffff\1\2\1\uffff\1\33\1\uffff\1\5\1\4\5\uffff"+
            "\1\5\1\uffff\3\5\17\uffff\1\5\2\uffff\1\5\3\uffff\1\5\3\uffff"+
            "\1\5\1\uffff\1\5\2\uffff\3\5\3\uffff\1\5\1\uffff\6\5\2\uffff"+
            "\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "4129:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_0 = input.LA(1);

                         
                        int index70_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA70_0==RULE_ID) ) {s = 1;}

                        else if ( (LA70_0==13) ) {s = 2;}

                        else if ( (LA70_0==76) && (synpred19_InternalFXGraph())) {s = 3;}

                        else if ( (LA70_0==18) && (synpred19_InternalFXGraph())) {s = 4;}

                        else if ( (LA70_0==RULE_STRING||LA70_0==RULE_INT||LA70_0==17||LA70_0==24||(LA70_0>=26 && LA70_0<=28)||LA70_0==44||LA70_0==47||LA70_0==51||LA70_0==55||LA70_0==57||(LA70_0>=60 && LA70_0<=62)||LA70_0==66||(LA70_0>=68 && LA70_0<=73)) ) {s = 5;}

                        else if ( (LA70_0==15) ) {s = 27;}

                         
                        input.seek(index70_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA77_eotS =
        "\34\uffff";
    static final String DFA77_eofS =
        "\34\uffff";
    static final String DFA77_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA77_maxS =
        "\1\114\2\0\31\uffff";
    static final String DFA77_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA77_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA77_transitionS = {
            "\1\5\1\1\1\5\6\uffff\1\2\1\uffff\1\33\1\uffff\1\5\1\4\5\uffff"+
            "\1\5\1\uffff\3\5\17\uffff\1\5\2\uffff\1\5\3\uffff\1\5\3\uffff"+
            "\1\5\1\uffff\1\5\2\uffff\3\5\3\uffff\1\5\1\uffff\6\5\2\uffff"+
            "\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "4378:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_0 = input.LA(1);

                         
                        int index77_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA77_0==RULE_ID) ) {s = 1;}

                        else if ( (LA77_0==13) ) {s = 2;}

                        else if ( (LA77_0==76) && (synpred20_InternalFXGraph())) {s = 3;}

                        else if ( (LA77_0==18) && (synpred20_InternalFXGraph())) {s = 4;}

                        else if ( (LA77_0==RULE_STRING||LA77_0==RULE_INT||LA77_0==17||LA77_0==24||(LA77_0>=26 && LA77_0<=28)||LA77_0==44||LA77_0==47||LA77_0==51||LA77_0==55||LA77_0==57||(LA77_0>=60 && LA77_0<=62)||LA77_0==66||(LA77_0>=68 && LA77_0<=73)) ) {s = 5;}

                        else if ( (LA77_0==15) ) {s = 27;}

                         
                        input.seek(index77_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA77_1 = input.LA(1);

                         
                        int index77_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA77_2 = input.LA(1);

                         
                        int index77_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalFXGraph()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index77_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA79_eotS =
        "\74\uffff";
    static final String DFA79_eofS =
        "\1\31\73\uffff";
    static final String DFA79_minS =
        "\1\4\30\0\43\uffff";
    static final String DFA79_maxS =
        "\1\114\30\0\43\uffff";
    static final String DFA79_acceptS =
        "\31\uffff\1\2\41\uffff\1\1";
    static final String DFA79_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\43\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\17\1\1\1\15\6\uffff\1\30\1\uffff\1\31\1\uffff\1\6\1\uffff"+
            "\2\31\2\uffff\1\31\1\12\1\31\1\14\1\13\1\3\3\uffff\2\31\1\uffff"+
            "\11\31\1\10\2\31\1\4\3\31\1\2\3\31\1\21\1\31\1\7\2\31\1\22\1"+
            "\23\1\24\3\31\1\11\1\uffff\1\5\1\16\1\20\1\25\1\26\1\27\3\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "4754:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA79_1 = input.LA(1);

                         
                        int index79_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_2 = input.LA(1);

                         
                        int index79_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA79_3 = input.LA(1);

                         
                        int index79_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA79_4 = input.LA(1);

                         
                        int index79_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA79_5 = input.LA(1);

                         
                        int index79_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA79_6 = input.LA(1);

                         
                        int index79_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA79_7 = input.LA(1);

                         
                        int index79_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA79_8 = input.LA(1);

                         
                        int index79_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA79_9 = input.LA(1);

                         
                        int index79_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA79_10 = input.LA(1);

                         
                        int index79_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA79_11 = input.LA(1);

                         
                        int index79_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA79_12 = input.LA(1);

                         
                        int index79_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA79_13 = input.LA(1);

                         
                        int index79_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA79_14 = input.LA(1);

                         
                        int index79_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA79_15 = input.LA(1);

                         
                        int index79_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA79_16 = input.LA(1);

                         
                        int index79_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA79_17 = input.LA(1);

                         
                        int index79_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA79_18 = input.LA(1);

                         
                        int index79_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA79_19 = input.LA(1);

                         
                        int index79_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA79_20 = input.LA(1);

                         
                        int index79_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA79_21 = input.LA(1);

                         
                        int index79_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA79_22 = input.LA(1);

                         
                        int index79_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA79_23 = input.LA(1);

                         
                        int index79_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA79_24 = input.LA(1);

                         
                        int index79_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalFXGraph()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index79_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 79, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA88_eotS =
        "\77\uffff";
    static final String DFA88_eofS =
        "\1\2\76\uffff";
    static final String DFA88_minS =
        "\1\4\1\0\75\uffff";
    static final String DFA88_maxS =
        "\1\114\1\0\75\uffff";
    static final String DFA88_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static final String DFA88_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static final String[] DFA88_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\6\2\1\uffff\7\2\3\uffff\2\2\1\uffff"+
            "\11\2\1\1\26\2\1\uffff\11\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "5178:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA88_1 = input.LA(1);

                         
                        int index88_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalFXGraph()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index88_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 88, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x0000000000003020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleElement_in_ruleModel153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport236 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleElement349 = new BitSet(new long[]{0x0000000000032002L});
    public static final BitSet FOLLOW_13_in_ruleElement362 = new BitSet(new long[]{0x000000001C0040D0L});
    public static final BitSet FOLLOW_ruleSimpleValueProperty_in_ruleElement384 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14_in_ruleElement403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleElement420 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleElement439 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_16_in_ruleElement454 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleElement475 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleElement490 = new BitSet(new long[]{0x0000000000340020L});
    public static final BitSet FOLLOW_18_in_ruleElement503 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDefine_in_ruleElement524 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleElement537 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDefine_in_ruleElement558 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleElement572 = new BitSet(new long[]{0x0000000000300020L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleElement597 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleStaticValueProperty_in_ruleElement624 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleElement638 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleElement660 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleStaticValueProperty_in_ruleElement687 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleElement704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_entryRuleDefine742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefine752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleDefine797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticValueProperty_in_entryRuleStaticValueProperty832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticValueProperty842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleStaticValueProperty879 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleStaticValueProperty900 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStaticValueProperty912 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStaticValueProperty929 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStaticValueProperty946 = new BitSet(new long[]{0x00000000FD0220F0L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleValueProperty_in_ruleStaticValueProperty967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty1055 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleProperty1072 = new BitSet(new long[]{0x00000000FD0220F0L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleValueProperty_in_ruleProperty1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueProperty_in_entryRuleValueProperty1129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueProperty1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleValueProperty_in_ruleValueProperty1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueProperty_in_ruleValueProperty1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleValueProperty_in_entryRuleSingleValueProperty1248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleValueProperty1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueProperty_in_ruleSingleValueProperty1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleSingleValueProperty1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValueProperty_in_ruleSingleValueProperty1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeValueProperty_in_ruleSingleValueProperty1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCopyValueProperty_in_ruleSingleValueProperty1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueProperty_in_entryRuleMultiValueProperty1448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiValueProperty1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValueProperty_in_ruleMultiValueProperty1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapValueProperty_in_ruleMultiValueProperty1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValueElement_in_entryRuleListValueElement1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListValueElement1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleListValueElement1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValueProperty_in_ruleListValueElement1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeValueProperty_in_ruleListValueElement1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListValueProperty_in_entryRuleListValueProperty1713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListValueProperty1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleListValueProperty1760 = new BitSet(new long[]{0x0000000060002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleListValueElement_in_ruleListValueProperty1781 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_19_in_ruleListValueProperty1794 = new BitSet(new long[]{0x0000000060002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleListValueElement_in_ruleListValueProperty1815 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_25_in_ruleListValueProperty1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapValueProperty_in_entryRuleMapValueProperty1865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapValueProperty1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMapValueProperty1912 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleMapValueProperty1933 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleMapValueProperty1946 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleMapValueProperty1967 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleMapValueProperty1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleValueProperty_in_entryRuleSimpleValueProperty2017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleValueProperty2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleValueProperty2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSimpleValueProperty2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSimpleValueProperty2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSimpleValueProperty2170 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSimpleValueProperty2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleSimpleValueProperty2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValueProperty_in_entryRuleReferenceValueProperty2273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceValueProperty2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleReferenceValueProperty2320 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleReferenceValueProperty2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeValueProperty_in_entryRuleIncludeValueProperty2379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeValueProperty2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleIncludeValueProperty2426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludeValueProperty2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCopyValueProperty_in_entryRuleCopyValueProperty2484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCopyValueProperty2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCopyValueProperty2531 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleCopyValueProperty2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard2591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard2649 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleQualifiedNameWithWildCard2668 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleQualifiedNameWithWildCard2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression2723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment2813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment2881 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment2897 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment2947 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment3000 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign3063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpSingleAssign3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign3151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpMultiAssign3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression3238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression3295 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression3348 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression3371 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr3410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpOr3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression3497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3554 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression3607 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression3630 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd3669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpAnd3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression3756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3813 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression3866 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression3889 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality3928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpEquality3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpEquality3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression4036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4093 = new BitSet(new long[]{0x00001F0000000002L});
    public static final BitSet FOLLOW_40_in_ruleXRelationalExpression4129 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression4154 = new BitSet(new long[]{0x00001F0000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression4215 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression4238 = new BitSet(new long[]{0x00001F0000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare4278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpCompare4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOpCompare4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOpCompare4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOpCompare4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression4424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4481 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression4534 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression4557 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther4596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOpOther4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOpOther4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression4704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4761 = new BitSet(new long[]{0x0000800010000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression4814 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression4837 = new BitSet(new long[]{0x0000800010000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd4876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpAdd4925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpAdd4944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression4984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5041 = new BitSet(new long[]{0x0007000200000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression5094 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression5117 = new BitSet(new long[]{0x0007000200000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti5156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti5167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMulti5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOpMulti5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOpMulti5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOpMulti5262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation5302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation5312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation5370 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation5420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary5456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOpUnary5505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpUnary5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpUnary5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression5583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression5640 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXCastedExpression5675 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression5698 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall5736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall5746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall5793 = new BitSet(new long[]{0x0060000100000002L});
    public static final BitSet FOLLOW_32_in_ruleXMemberFeatureCall5842 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall5865 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall5881 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall5903 = new BitSet(new long[]{0x0060000100000002L});
    public static final BitSet FOLLOW_32_in_ruleXMemberFeatureCall5989 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_53_in_ruleXMemberFeatureCall6013 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_54_in_ruleXMemberFeatureCall6050 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall6079 = new BitSet(new long[]{0x0000000000002020L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6100 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_19_in_ruleXMemberFeatureCall6113 = new BitSet(new long[]{0x0000000000002020L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall6134 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall6148 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall6173 = new BitSet(new long[]{0x0060000100002002L});
    public static final BitSet FOLLOW_13_in_ruleXMemberFeatureCall6207 = new BitSet(new long[]{0x728890001D06A070L,0x00000000000013F4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall6282 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6310 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleXMemberFeatureCall6323 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall6344 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleXMemberFeatureCall6361 = new BitSet(new long[]{0x0060000100000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression6402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression6459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression6486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression6540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression6567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression6621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression6648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression6675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression6702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression6756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression6783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral6818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral6828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral6875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral6929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral6956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral6983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure7045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure7055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleXClosure7101 = new BitSet(new long[]{0x0000000000042020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7123 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleXClosure7136 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure7157 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleXClosure7173 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure7194 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXClosure7206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure7242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure7252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7350 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleXShortClosure7363 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure7384 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleXShortClosure7400 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure7423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression7459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression7469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleXParenthesizedExpression7506 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression7528 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXParenthesizedExpression7539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression7575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression7585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXIfExpression7631 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXIfExpression7643 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7664 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXIfExpression7676 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7697 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXIfExpression7718 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression7740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression7778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression7788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression7834 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression7856 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXSwitchExpression7868 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7891 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression7903 = new BitSet(new long[]{0x0800000000802020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression7924 = new BitSet(new long[]{0x0C00000000902020L,0x0000000000001000L});
    public static final BitSet FOLLOW_58_in_ruleXSwitchExpression7938 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXSwitchExpression7950 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression7971 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXSwitchExpression7985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart8021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart8031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart8077 = new BitSet(new long[]{0x0800000000800000L});
    public static final BitSet FOLLOW_59_in_ruleXCasePart8091 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8112 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXCasePart8126 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart8147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression8183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression8193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXForLoopExpression8239 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXForLoopExpression8251 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression8272 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXForLoopExpression8284 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8305 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXForLoopExpression8317 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression8338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression8374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression8384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXWhileExpression8430 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXWhileExpression8442 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8463 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXWhileExpression8475 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression8496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression8532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression8542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXDoWhileExpression8588 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8609 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleXDoWhileExpression8621 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXDoWhileExpression8633 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression8654 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXDoWhileExpression8666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression8702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression8712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleXBlockExpression8758 = new BitSet(new long[]{0x728890001D122070L,0x00000000000003F7L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression8780 = new BitSet(new long[]{0xF28890001D122070L,0x00000000000003F7L});
    public static final BitSet FOLLOW_63_in_ruleXBlockExpression8793 = new BitSet(new long[]{0x728890001D122070L,0x00000000000003F7L});
    public static final BitSet FOLLOW_20_in_ruleXBlockExpression8809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock8845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock8855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock8902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock8929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration8964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration8974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXVariableDeclaration9027 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_65_in_ruleXVariableDeclaration9058 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration9106 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration9127 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration9156 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleXVariableDeclaration9170 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration9191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter9229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter9239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter9285 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter9307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall9343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall9353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall9410 = new BitSet(new long[]{0x0000100000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_44_in_ruleXFeatureCall9424 = new BitSet(new long[]{0x0000000000002020L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9445 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_19_in_ruleXFeatureCall9458 = new BitSet(new long[]{0x0000000000002020L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall9479 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_43_in_ruleXFeatureCall9493 = new BitSet(new long[]{0x0000100000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall9518 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleXFeatureCall9552 = new BitSet(new long[]{0x728890001D06A070L,0x00000000000013F4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall9627 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9655 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleXFeatureCall9668 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall9689 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleXFeatureCall9706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper9745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper9756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper9803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleIdOrSuper9827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier9868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier9879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier9926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleStaticQualifier9944 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall9985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall9995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXConstructorCall10041 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall10064 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_44_in_ruleXConstructorCall10077 = new BitSet(new long[]{0x0000000000002020L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10098 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_19_in_ruleXConstructorCall10111 = new BitSet(new long[]{0x0000000000002020L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall10132 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_43_in_ruleXConstructorCall10146 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXConstructorCall10160 = new BitSet(new long[]{0x728890001D06A070L,0x00000000000013F4L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall10222 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10250 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleXConstructorCall10263 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall10284 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleXConstructorCall10301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral10337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral10347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleXBooleanLiteral10394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleXBooleanLiteral10418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral10468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral10478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXNullLiteral10524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral10560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral10570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral10621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral10662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral10672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral10723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral10764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral10774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTypeLiteral10820 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXTypeLiteral10832 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral10855 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXTypeLiteral10867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression10903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression10913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXThrowExpression10959 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression10980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression11016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression11026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXReturnExpression11072 = new BitSet(new long[]{0x728890001D022072L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression11103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression11140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression11150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression11196 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression11247 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression11269 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression11313 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression11334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause11372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause11382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXCatchClause11427 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXCatchClause11440 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause11461 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXCatchClause11473 = new BitSet(new long[]{0x728890001D022070L,0x00000000000003F4L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause11494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11589 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleQualifiedName11617 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName11640 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference11687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference11697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference11744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference11771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef11806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef11816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleXFunctionTypeRef11854 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11875 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleXFunctionTypeRef11888 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11909 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleXFunctionTypeRef11923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleXFunctionTypeRef11937 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference12004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference12052 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleJvmParameterizedTypeReference12073 = new BitSet(new long[]{0x0000000000002020L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12095 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_19_in_ruleJvmParameterizedTypeReference12108 = new BitSet(new long[]{0x0000000000002020L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference12129 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_43_in_ruleJvmParameterizedTypeReference12143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference12181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference12191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference12238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference12265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference12300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference12310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmWildcardTypeReference12356 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004004L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference12378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference12405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound12443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound12453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmUpperBound12490 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound12511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded12547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded12557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleJvmUpperBoundAnded12594 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded12615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound12651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound12661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleJvmLowerBound12698 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound12719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalFXGraph2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalFXGraph3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalFXGraph3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalFXGraph3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred5_InternalFXGraph4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalFXGraph4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalFXGraph4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalFXGraph4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalFXGraph5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred10_InternalFXGraph5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred11_InternalFXGraph5810 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalFXGraph5819 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalFXGraph5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred12_InternalFXGraph5928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_synpred12_InternalFXGraph5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred12_InternalFXGraph5962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred13_InternalFXGraph6189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFXGraph6241 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_synpred14_InternalFXGraph6248 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalFXGraph6255 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_synpred14_InternalFXGraph6265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred16_InternalFXGraph7710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred17_InternalFXGraph9076 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred17_InternalFXGraph9085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred18_InternalFXGraph9534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalFXGraph9586 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_synpred19_InternalFXGraph9593 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalFXGraph9600 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_synpred19_InternalFXGraph9610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFXGraph10181 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_synpred20_InternalFXGraph10188 = new BitSet(new long[]{0x0000000000002020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalFXGraph10195 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_synpred20_InternalFXGraph10205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalFXGraph11086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred22_InternalFXGraph11231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred23_InternalFXGraph11261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred25_InternalFXGraph11608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred26_InternalFXGraph12065 = new BitSet(new long[]{0x0000000000000002L});

}