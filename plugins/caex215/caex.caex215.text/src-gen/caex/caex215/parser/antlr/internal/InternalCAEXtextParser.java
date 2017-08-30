package caex.caex215.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import caex.caex215.services.CAEXtextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCAEXtextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CAEXFile'", "'['", "'changeMode'", "','", "']'", "'{'", "'fileName'", "'schemaVersion'", "'}'", "'Description'", "'value'", "'Version'", "'Revision'", "'revisionDate'", "'oldVersion'", "'newVersion'", "'authorName'", "'comment'", "'Copyright'", "'AdditionalInformation'", "'ExternalReference'", "'alias'", "'path'", "'IH'", "':'", "'icLib'", "'iD'", "'name'", "'rcLib'", "'sucLib'", "'DateTime'", "'Element'", "'nestedElements'", "'attributes'", "'='", "'IE'", "'atts'", "'provides'", "'supports'", "'isA'", "'values:'", "'current'", "'default'", "'in'", "'id'", "'refSemantic'", "'constraint'", "'InterfaceClass'", "'refBaseClassPath'", "'baseClass'", "'description'", "'version'", "'revision'", "'copyright'", "'additionalInformation'", "'attribute'", "'interfaceClass'", "'SupportedRoleClass'", "'refRoleClassPath'", "'roleClass'", "'mappingObject'", "'IL'", "'from'", "'to'", "'SystemUnitClass'", "'externalInterface'", "'internalElement'", "'supportedRoleClass'", "'internalLink'", "'systemUnitClass'", "'Mapping'", "'attributeNameMapping'", "'interfaceNameMapping'", "'RefSemantic'", "'correspondingAttributePath'", "'AttributeValueRequirement'", "'ordinalScaledType'", "'nominalScaledType'", "'unknownType'", "'AttributeDataType'", "'OrdinalScaled'", "'requiredMaxValue'", "'requiredValue'", "'requiredMinValue'", "'NominalScaled'", "'UnknownType'", "'requirements'", "'ExternalInterface'", "'RoleClass'", "'AttributeNameMapping'", "'roleAttributeName'", "'systemUnitAttributeName'", "'InterfaceNameMapping'", "'roleInterfaceName'", "'systemUnitInterfaceName'", "'state'", "'create'", "'delete'", "'change'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalCAEXtextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCAEXtextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCAEXtextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCAEXtext.g"; }



     	private CAEXtextGrammarAccess grammarAccess;

        public InternalCAEXtextParser(TokenStream input, CAEXtextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CAEXFile";
       	}

       	@Override
       	protected CAEXtextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCAEXFile"
    // InternalCAEXtext.g:65:1: entryRuleCAEXFile returns [EObject current=null] : iv_ruleCAEXFile= ruleCAEXFile EOF ;
    public final EObject entryRuleCAEXFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCAEXFile = null;


        try {
            // InternalCAEXtext.g:65:49: (iv_ruleCAEXFile= ruleCAEXFile EOF )
            // InternalCAEXtext.g:66:2: iv_ruleCAEXFile= ruleCAEXFile EOF
            {
             newCompositeNode(grammarAccess.getCAEXFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCAEXFile=ruleCAEXFile();

            state._fsp--;

             current =iv_ruleCAEXFile; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCAEXFile"


    // $ANTLR start "ruleCAEXFile"
    // InternalCAEXtext.g:72:1: ruleCAEXFile returns [EObject current=null] : (otherlv_0= 'CAEXFile' otherlv_1= '[' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? ( (lv_description_4_0= ruleDescription ) )? ( (lv_version_5_0= ruleVersion ) )? ( ( (lv_revision_6_0= ruleRevision ) ) (otherlv_7= ',' ( (lv_revision_8_0= ruleRevision ) ) )* )? ( (lv_copyright_9_0= ruleCopyright ) )? ( ( (lv_additionalInformation_10_0= ruleAdditionalInformation ) ) (otherlv_11= ',' ( (lv_additionalInformation_12_0= ruleAdditionalInformation ) ) )* )? otherlv_13= ']' otherlv_14= '{' otherlv_15= 'fileName' ( (lv_fileName_16_0= ruleEString ) ) otherlv_17= 'schemaVersion' ( (lv_schemaVersion_18_0= ruleEString ) ) ( ( (lv_externalReference_19_0= ruleExternalReference ) ) (otherlv_20= ',' ( (lv_externalReference_21_0= ruleExternalReference ) ) )* )? ( ( (lv_instanceHierarchy_22_0= ruleInstanceHierarchy ) ) (otherlv_23= ',' ( (lv_instanceHierarchy_24_0= ruleInstanceHierarchy ) ) )* )? ( ( (lv_interfaceClassLib_25_0= ruleInterfaceClassLib ) ) (otherlv_26= ',' ( (lv_interfaceClassLib_27_0= ruleInterfaceClassLib ) ) )* )? ( ( (lv_roleClassLib_28_0= ruleRoleClassLib ) ) (otherlv_29= ',' ( (lv_roleClassLib_30_0= ruleRoleClassLib ) ) )* )? ( ( (lv_systemUnitClassLib_31_0= ruleSystemUnitClassLib ) ) (otherlv_32= ',' ( (lv_systemUnitClassLib_33_0= ruleSystemUnitClassLib ) ) )* )? otherlv_34= '}' ) ;
    public final EObject ruleCAEXFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Token otherlv_29=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Enumerator lv_changeMode_3_0 = null;

        EObject lv_description_4_0 = null;

        EObject lv_version_5_0 = null;

        EObject lv_revision_6_0 = null;

        EObject lv_revision_8_0 = null;

        EObject lv_copyright_9_0 = null;

        EObject lv_additionalInformation_10_0 = null;

        EObject lv_additionalInformation_12_0 = null;

        AntlrDatatypeRuleToken lv_fileName_16_0 = null;

        AntlrDatatypeRuleToken lv_schemaVersion_18_0 = null;

        EObject lv_externalReference_19_0 = null;

        EObject lv_externalReference_21_0 = null;

        EObject lv_instanceHierarchy_22_0 = null;

        EObject lv_instanceHierarchy_24_0 = null;

        EObject lv_interfaceClassLib_25_0 = null;

        EObject lv_interfaceClassLib_27_0 = null;

        EObject lv_roleClassLib_28_0 = null;

        EObject lv_roleClassLib_30_0 = null;

        EObject lv_systemUnitClassLib_31_0 = null;

        EObject lv_systemUnitClassLib_33_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:78:2: ( (otherlv_0= 'CAEXFile' otherlv_1= '[' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? ( (lv_description_4_0= ruleDescription ) )? ( (lv_version_5_0= ruleVersion ) )? ( ( (lv_revision_6_0= ruleRevision ) ) (otherlv_7= ',' ( (lv_revision_8_0= ruleRevision ) ) )* )? ( (lv_copyright_9_0= ruleCopyright ) )? ( ( (lv_additionalInformation_10_0= ruleAdditionalInformation ) ) (otherlv_11= ',' ( (lv_additionalInformation_12_0= ruleAdditionalInformation ) ) )* )? otherlv_13= ']' otherlv_14= '{' otherlv_15= 'fileName' ( (lv_fileName_16_0= ruleEString ) ) otherlv_17= 'schemaVersion' ( (lv_schemaVersion_18_0= ruleEString ) ) ( ( (lv_externalReference_19_0= ruleExternalReference ) ) (otherlv_20= ',' ( (lv_externalReference_21_0= ruleExternalReference ) ) )* )? ( ( (lv_instanceHierarchy_22_0= ruleInstanceHierarchy ) ) (otherlv_23= ',' ( (lv_instanceHierarchy_24_0= ruleInstanceHierarchy ) ) )* )? ( ( (lv_interfaceClassLib_25_0= ruleInterfaceClassLib ) ) (otherlv_26= ',' ( (lv_interfaceClassLib_27_0= ruleInterfaceClassLib ) ) )* )? ( ( (lv_roleClassLib_28_0= ruleRoleClassLib ) ) (otherlv_29= ',' ( (lv_roleClassLib_30_0= ruleRoleClassLib ) ) )* )? ( ( (lv_systemUnitClassLib_31_0= ruleSystemUnitClassLib ) ) (otherlv_32= ',' ( (lv_systemUnitClassLib_33_0= ruleSystemUnitClassLib ) ) )* )? otherlv_34= '}' ) )
            // InternalCAEXtext.g:79:2: (otherlv_0= 'CAEXFile' otherlv_1= '[' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? ( (lv_description_4_0= ruleDescription ) )? ( (lv_version_5_0= ruleVersion ) )? ( ( (lv_revision_6_0= ruleRevision ) ) (otherlv_7= ',' ( (lv_revision_8_0= ruleRevision ) ) )* )? ( (lv_copyright_9_0= ruleCopyright ) )? ( ( (lv_additionalInformation_10_0= ruleAdditionalInformation ) ) (otherlv_11= ',' ( (lv_additionalInformation_12_0= ruleAdditionalInformation ) ) )* )? otherlv_13= ']' otherlv_14= '{' otherlv_15= 'fileName' ( (lv_fileName_16_0= ruleEString ) ) otherlv_17= 'schemaVersion' ( (lv_schemaVersion_18_0= ruleEString ) ) ( ( (lv_externalReference_19_0= ruleExternalReference ) ) (otherlv_20= ',' ( (lv_externalReference_21_0= ruleExternalReference ) ) )* )? ( ( (lv_instanceHierarchy_22_0= ruleInstanceHierarchy ) ) (otherlv_23= ',' ( (lv_instanceHierarchy_24_0= ruleInstanceHierarchy ) ) )* )? ( ( (lv_interfaceClassLib_25_0= ruleInterfaceClassLib ) ) (otherlv_26= ',' ( (lv_interfaceClassLib_27_0= ruleInterfaceClassLib ) ) )* )? ( ( (lv_roleClassLib_28_0= ruleRoleClassLib ) ) (otherlv_29= ',' ( (lv_roleClassLib_30_0= ruleRoleClassLib ) ) )* )? ( ( (lv_systemUnitClassLib_31_0= ruleSystemUnitClassLib ) ) (otherlv_32= ',' ( (lv_systemUnitClassLib_33_0= ruleSystemUnitClassLib ) ) )* )? otherlv_34= '}' )
            {
            // InternalCAEXtext.g:79:2: (otherlv_0= 'CAEXFile' otherlv_1= '[' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? ( (lv_description_4_0= ruleDescription ) )? ( (lv_version_5_0= ruleVersion ) )? ( ( (lv_revision_6_0= ruleRevision ) ) (otherlv_7= ',' ( (lv_revision_8_0= ruleRevision ) ) )* )? ( (lv_copyright_9_0= ruleCopyright ) )? ( ( (lv_additionalInformation_10_0= ruleAdditionalInformation ) ) (otherlv_11= ',' ( (lv_additionalInformation_12_0= ruleAdditionalInformation ) ) )* )? otherlv_13= ']' otherlv_14= '{' otherlv_15= 'fileName' ( (lv_fileName_16_0= ruleEString ) ) otherlv_17= 'schemaVersion' ( (lv_schemaVersion_18_0= ruleEString ) ) ( ( (lv_externalReference_19_0= ruleExternalReference ) ) (otherlv_20= ',' ( (lv_externalReference_21_0= ruleExternalReference ) ) )* )? ( ( (lv_instanceHierarchy_22_0= ruleInstanceHierarchy ) ) (otherlv_23= ',' ( (lv_instanceHierarchy_24_0= ruleInstanceHierarchy ) ) )* )? ( ( (lv_interfaceClassLib_25_0= ruleInterfaceClassLib ) ) (otherlv_26= ',' ( (lv_interfaceClassLib_27_0= ruleInterfaceClassLib ) ) )* )? ( ( (lv_roleClassLib_28_0= ruleRoleClassLib ) ) (otherlv_29= ',' ( (lv_roleClassLib_30_0= ruleRoleClassLib ) ) )* )? ( ( (lv_systemUnitClassLib_31_0= ruleSystemUnitClassLib ) ) (otherlv_32= ',' ( (lv_systemUnitClassLib_33_0= ruleSystemUnitClassLib ) ) )* )? otherlv_34= '}' )
            // InternalCAEXtext.g:80:3: otherlv_0= 'CAEXFile' otherlv_1= '[' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? ( (lv_description_4_0= ruleDescription ) )? ( (lv_version_5_0= ruleVersion ) )? ( ( (lv_revision_6_0= ruleRevision ) ) (otherlv_7= ',' ( (lv_revision_8_0= ruleRevision ) ) )* )? ( (lv_copyright_9_0= ruleCopyright ) )? ( ( (lv_additionalInformation_10_0= ruleAdditionalInformation ) ) (otherlv_11= ',' ( (lv_additionalInformation_12_0= ruleAdditionalInformation ) ) )* )? otherlv_13= ']' otherlv_14= '{' otherlv_15= 'fileName' ( (lv_fileName_16_0= ruleEString ) ) otherlv_17= 'schemaVersion' ( (lv_schemaVersion_18_0= ruleEString ) ) ( ( (lv_externalReference_19_0= ruleExternalReference ) ) (otherlv_20= ',' ( (lv_externalReference_21_0= ruleExternalReference ) ) )* )? ( ( (lv_instanceHierarchy_22_0= ruleInstanceHierarchy ) ) (otherlv_23= ',' ( (lv_instanceHierarchy_24_0= ruleInstanceHierarchy ) ) )* )? ( ( (lv_interfaceClassLib_25_0= ruleInterfaceClassLib ) ) (otherlv_26= ',' ( (lv_interfaceClassLib_27_0= ruleInterfaceClassLib ) ) )* )? ( ( (lv_roleClassLib_28_0= ruleRoleClassLib ) ) (otherlv_29= ',' ( (lv_roleClassLib_30_0= ruleRoleClassLib ) ) )* )? ( ( (lv_systemUnitClassLib_31_0= ruleSystemUnitClassLib ) ) (otherlv_32= ',' ( (lv_systemUnitClassLib_33_0= ruleSystemUnitClassLib ) ) )* )? otherlv_34= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCAEXFileAccess().getCAEXFileKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCAEXFileAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalCAEXtext.g:88:3: (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCAEXtext.g:89:4: otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getCAEXFileAccess().getChangeModeKeyword_2_0());
                    			
                    // InternalCAEXtext.g:93:4: ( (lv_changeMode_3_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:94:5: (lv_changeMode_3_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:94:5: (lv_changeMode_3_0= ruleChangeMode )
                    // InternalCAEXtext.g:95:6: lv_changeMode_3_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getCAEXFileAccess().getChangeModeChangeModeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_changeMode_3_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_3_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:113:3: ( (lv_description_4_0= ruleDescription ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCAEXtext.g:114:4: (lv_description_4_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:114:4: (lv_description_4_0= ruleDescription )
                    // InternalCAEXtext.g:115:5: lv_description_4_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getCAEXFileAccess().getDescriptionDescriptionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_description_4_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_4_0,
                    						"caex.caex215.CAEXtext.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:132:3: ( (lv_version_5_0= ruleVersion ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCAEXtext.g:133:4: (lv_version_5_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:133:4: (lv_version_5_0= ruleVersion )
                    // InternalCAEXtext.g:134:5: lv_version_5_0= ruleVersion
                    {

                    					newCompositeNode(grammarAccess.getCAEXFileAccess().getVersionVersionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_version_5_0=ruleVersion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    					}
                    					set(
                    						current,
                    						"version",
                    						lv_version_5_0,
                    						"caex.caex215.CAEXtext.Version");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:151:3: ( ( (lv_revision_6_0= ruleRevision ) ) (otherlv_7= ',' ( (lv_revision_8_0= ruleRevision ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCAEXtext.g:152:4: ( (lv_revision_6_0= ruleRevision ) ) (otherlv_7= ',' ( (lv_revision_8_0= ruleRevision ) ) )*
                    {
                    // InternalCAEXtext.g:152:4: ( (lv_revision_6_0= ruleRevision ) )
                    // InternalCAEXtext.g:153:5: (lv_revision_6_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:153:5: (lv_revision_6_0= ruleRevision )
                    // InternalCAEXtext.g:154:6: lv_revision_6_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getCAEXFileAccess().getRevisionRevisionParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_revision_6_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_6_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:171:4: (otherlv_7= ',' ( (lv_revision_8_0= ruleRevision ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCAEXtext.g:172:5: otherlv_7= ',' ( (lv_revision_8_0= ruleRevision ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCAEXFileAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalCAEXtext.g:176:5: ( (lv_revision_8_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:177:6: (lv_revision_8_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:177:6: (lv_revision_8_0= ruleRevision )
                    	    // InternalCAEXtext.g:178:7: lv_revision_8_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getCAEXFileAccess().getRevisionRevisionParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_revision_8_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_8_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCAEXtext.g:197:3: ( (lv_copyright_9_0= ruleCopyright ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCAEXtext.g:198:4: (lv_copyright_9_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:198:4: (lv_copyright_9_0= ruleCopyright )
                    // InternalCAEXtext.g:199:5: lv_copyright_9_0= ruleCopyright
                    {

                    					newCompositeNode(grammarAccess.getCAEXFileAccess().getCopyrightCopyrightParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_copyright_9_0=ruleCopyright();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    					}
                    					set(
                    						current,
                    						"copyright",
                    						lv_copyright_9_0,
                    						"caex.caex215.CAEXtext.Copyright");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:216:3: ( ( (lv_additionalInformation_10_0= ruleAdditionalInformation ) ) (otherlv_11= ',' ( (lv_additionalInformation_12_0= ruleAdditionalInformation ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCAEXtext.g:217:4: ( (lv_additionalInformation_10_0= ruleAdditionalInformation ) ) (otherlv_11= ',' ( (lv_additionalInformation_12_0= ruleAdditionalInformation ) ) )*
                    {
                    // InternalCAEXtext.g:217:4: ( (lv_additionalInformation_10_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:218:5: (lv_additionalInformation_10_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:218:5: (lv_additionalInformation_10_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:219:6: lv_additionalInformation_10_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getCAEXFileAccess().getAdditionalInformationAdditionalInformationParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_additionalInformation_10_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_10_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:236:4: (otherlv_11= ',' ( (lv_additionalInformation_12_0= ruleAdditionalInformation ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalCAEXtext.g:237:5: otherlv_11= ',' ( (lv_additionalInformation_12_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getCAEXFileAccess().getCommaKeyword_7_1_0());
                    	    				
                    	    // InternalCAEXtext.g:241:5: ( (lv_additionalInformation_12_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:242:6: (lv_additionalInformation_12_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:242:6: (lv_additionalInformation_12_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:243:7: lv_additionalInformation_12_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getCAEXFileAccess().getAdditionalInformationAdditionalInformationParserRuleCall_7_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_additionalInformation_12_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_12_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_13, grammarAccess.getCAEXFileAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_14=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_14, grammarAccess.getCAEXFileAccess().getLeftCurlyBracketKeyword_9());
            		
            otherlv_15=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_15, grammarAccess.getCAEXFileAccess().getFileNameKeyword_10());
            		
            // InternalCAEXtext.g:274:3: ( (lv_fileName_16_0= ruleEString ) )
            // InternalCAEXtext.g:275:4: (lv_fileName_16_0= ruleEString )
            {
            // InternalCAEXtext.g:275:4: (lv_fileName_16_0= ruleEString )
            // InternalCAEXtext.g:276:5: lv_fileName_16_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCAEXFileAccess().getFileNameEStringParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_17);
            lv_fileName_16_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCAEXFileRule());
            					}
            					set(
            						current,
            						"fileName",
            						lv_fileName_16_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_17, grammarAccess.getCAEXFileAccess().getSchemaVersionKeyword_12());
            		
            // InternalCAEXtext.g:297:3: ( (lv_schemaVersion_18_0= ruleEString ) )
            // InternalCAEXtext.g:298:4: (lv_schemaVersion_18_0= ruleEString )
            {
            // InternalCAEXtext.g:298:4: (lv_schemaVersion_18_0= ruleEString )
            // InternalCAEXtext.g:299:5: lv_schemaVersion_18_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCAEXFileAccess().getSchemaVersionEStringParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_18);
            lv_schemaVersion_18_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCAEXFileRule());
            					}
            					set(
            						current,
            						"schemaVersion",
            						lv_schemaVersion_18_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCAEXtext.g:316:3: ( ( (lv_externalReference_19_0= ruleExternalReference ) ) (otherlv_20= ',' ( (lv_externalReference_21_0= ruleExternalReference ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCAEXtext.g:317:4: ( (lv_externalReference_19_0= ruleExternalReference ) ) (otherlv_20= ',' ( (lv_externalReference_21_0= ruleExternalReference ) ) )*
                    {
                    // InternalCAEXtext.g:317:4: ( (lv_externalReference_19_0= ruleExternalReference ) )
                    // InternalCAEXtext.g:318:5: (lv_externalReference_19_0= ruleExternalReference )
                    {
                    // InternalCAEXtext.g:318:5: (lv_externalReference_19_0= ruleExternalReference )
                    // InternalCAEXtext.g:319:6: lv_externalReference_19_0= ruleExternalReference
                    {

                    						newCompositeNode(grammarAccess.getCAEXFileAccess().getExternalReferenceExternalReferenceParserRuleCall_14_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_externalReference_19_0=ruleExternalReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    						}
                    						add(
                    							current,
                    							"externalReference",
                    							lv_externalReference_19_0,
                    							"caex.caex215.CAEXtext.ExternalReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:336:4: (otherlv_20= ',' ( (lv_externalReference_21_0= ruleExternalReference ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalCAEXtext.g:337:5: otherlv_20= ',' ( (lv_externalReference_21_0= ruleExternalReference ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FOLLOW_20); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getCAEXFileAccess().getCommaKeyword_14_1_0());
                    	    				
                    	    // InternalCAEXtext.g:341:5: ( (lv_externalReference_21_0= ruleExternalReference ) )
                    	    // InternalCAEXtext.g:342:6: (lv_externalReference_21_0= ruleExternalReference )
                    	    {
                    	    // InternalCAEXtext.g:342:6: (lv_externalReference_21_0= ruleExternalReference )
                    	    // InternalCAEXtext.g:343:7: lv_externalReference_21_0= ruleExternalReference
                    	    {

                    	    							newCompositeNode(grammarAccess.getCAEXFileAccess().getExternalReferenceExternalReferenceParserRuleCall_14_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_externalReference_21_0=ruleExternalReference();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"externalReference",
                    	    								lv_externalReference_21_0,
                    	    								"caex.caex215.CAEXtext.ExternalReference");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


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

            // InternalCAEXtext.g:362:3: ( ( (lv_instanceHierarchy_22_0= ruleInstanceHierarchy ) ) (otherlv_23= ',' ( (lv_instanceHierarchy_24_0= ruleInstanceHierarchy ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCAEXtext.g:363:4: ( (lv_instanceHierarchy_22_0= ruleInstanceHierarchy ) ) (otherlv_23= ',' ( (lv_instanceHierarchy_24_0= ruleInstanceHierarchy ) ) )*
                    {
                    // InternalCAEXtext.g:363:4: ( (lv_instanceHierarchy_22_0= ruleInstanceHierarchy ) )
                    // InternalCAEXtext.g:364:5: (lv_instanceHierarchy_22_0= ruleInstanceHierarchy )
                    {
                    // InternalCAEXtext.g:364:5: (lv_instanceHierarchy_22_0= ruleInstanceHierarchy )
                    // InternalCAEXtext.g:365:6: lv_instanceHierarchy_22_0= ruleInstanceHierarchy
                    {

                    						newCompositeNode(grammarAccess.getCAEXFileAccess().getInstanceHierarchyInstanceHierarchyParserRuleCall_15_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_instanceHierarchy_22_0=ruleInstanceHierarchy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    						}
                    						add(
                    							current,
                    							"instanceHierarchy",
                    							lv_instanceHierarchy_22_0,
                    							"caex.caex215.CAEXtext.InstanceHierarchy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:382:4: (otherlv_23= ',' ( (lv_instanceHierarchy_24_0= ruleInstanceHierarchy ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalCAEXtext.g:383:5: otherlv_23= ',' ( (lv_instanceHierarchy_24_0= ruleInstanceHierarchy ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FOLLOW_22); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getCAEXFileAccess().getCommaKeyword_15_1_0());
                    	    				
                    	    // InternalCAEXtext.g:387:5: ( (lv_instanceHierarchy_24_0= ruleInstanceHierarchy ) )
                    	    // InternalCAEXtext.g:388:6: (lv_instanceHierarchy_24_0= ruleInstanceHierarchy )
                    	    {
                    	    // InternalCAEXtext.g:388:6: (lv_instanceHierarchy_24_0= ruleInstanceHierarchy )
                    	    // InternalCAEXtext.g:389:7: lv_instanceHierarchy_24_0= ruleInstanceHierarchy
                    	    {

                    	    							newCompositeNode(grammarAccess.getCAEXFileAccess().getInstanceHierarchyInstanceHierarchyParserRuleCall_15_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_instanceHierarchy_24_0=ruleInstanceHierarchy();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"instanceHierarchy",
                    	    								lv_instanceHierarchy_24_0,
                    	    								"caex.caex215.CAEXtext.InstanceHierarchy");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCAEXtext.g:408:3: ( ( (lv_interfaceClassLib_25_0= ruleInterfaceClassLib ) ) (otherlv_26= ',' ( (lv_interfaceClassLib_27_0= ruleInterfaceClassLib ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCAEXtext.g:409:4: ( (lv_interfaceClassLib_25_0= ruleInterfaceClassLib ) ) (otherlv_26= ',' ( (lv_interfaceClassLib_27_0= ruleInterfaceClassLib ) ) )*
                    {
                    // InternalCAEXtext.g:409:4: ( (lv_interfaceClassLib_25_0= ruleInterfaceClassLib ) )
                    // InternalCAEXtext.g:410:5: (lv_interfaceClassLib_25_0= ruleInterfaceClassLib )
                    {
                    // InternalCAEXtext.g:410:5: (lv_interfaceClassLib_25_0= ruleInterfaceClassLib )
                    // InternalCAEXtext.g:411:6: lv_interfaceClassLib_25_0= ruleInterfaceClassLib
                    {

                    						newCompositeNode(grammarAccess.getCAEXFileAccess().getInterfaceClassLibInterfaceClassLibParserRuleCall_16_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_interfaceClassLib_25_0=ruleInterfaceClassLib();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    						}
                    						add(
                    							current,
                    							"interfaceClassLib",
                    							lv_interfaceClassLib_25_0,
                    							"caex.caex215.CAEXtext.InterfaceClassLib");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:428:4: (otherlv_26= ',' ( (lv_interfaceClassLib_27_0= ruleInterfaceClassLib ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalCAEXtext.g:429:5: otherlv_26= ',' ( (lv_interfaceClassLib_27_0= ruleInterfaceClassLib ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_24); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getCAEXFileAccess().getCommaKeyword_16_1_0());
                    	    				
                    	    // InternalCAEXtext.g:433:5: ( (lv_interfaceClassLib_27_0= ruleInterfaceClassLib ) )
                    	    // InternalCAEXtext.g:434:6: (lv_interfaceClassLib_27_0= ruleInterfaceClassLib )
                    	    {
                    	    // InternalCAEXtext.g:434:6: (lv_interfaceClassLib_27_0= ruleInterfaceClassLib )
                    	    // InternalCAEXtext.g:435:7: lv_interfaceClassLib_27_0= ruleInterfaceClassLib
                    	    {

                    	    							newCompositeNode(grammarAccess.getCAEXFileAccess().getInterfaceClassLibInterfaceClassLibParserRuleCall_16_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_interfaceClassLib_27_0=ruleInterfaceClassLib();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaceClassLib",
                    	    								lv_interfaceClassLib_27_0,
                    	    								"caex.caex215.CAEXtext.InterfaceClassLib");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCAEXtext.g:454:3: ( ( (lv_roleClassLib_28_0= ruleRoleClassLib ) ) (otherlv_29= ',' ( (lv_roleClassLib_30_0= ruleRoleClassLib ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCAEXtext.g:455:4: ( (lv_roleClassLib_28_0= ruleRoleClassLib ) ) (otherlv_29= ',' ( (lv_roleClassLib_30_0= ruleRoleClassLib ) ) )*
                    {
                    // InternalCAEXtext.g:455:4: ( (lv_roleClassLib_28_0= ruleRoleClassLib ) )
                    // InternalCAEXtext.g:456:5: (lv_roleClassLib_28_0= ruleRoleClassLib )
                    {
                    // InternalCAEXtext.g:456:5: (lv_roleClassLib_28_0= ruleRoleClassLib )
                    // InternalCAEXtext.g:457:6: lv_roleClassLib_28_0= ruleRoleClassLib
                    {

                    						newCompositeNode(grammarAccess.getCAEXFileAccess().getRoleClassLibRoleClassLibParserRuleCall_17_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_roleClassLib_28_0=ruleRoleClassLib();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    						}
                    						add(
                    							current,
                    							"roleClassLib",
                    							lv_roleClassLib_28_0,
                    							"caex.caex215.CAEXtext.RoleClassLib");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:474:4: (otherlv_29= ',' ( (lv_roleClassLib_30_0= ruleRoleClassLib ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalCAEXtext.g:475:5: otherlv_29= ',' ( (lv_roleClassLib_30_0= ruleRoleClassLib ) )
                    	    {
                    	    otherlv_29=(Token)match(input,14,FOLLOW_26); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getCAEXFileAccess().getCommaKeyword_17_1_0());
                    	    				
                    	    // InternalCAEXtext.g:479:5: ( (lv_roleClassLib_30_0= ruleRoleClassLib ) )
                    	    // InternalCAEXtext.g:480:6: (lv_roleClassLib_30_0= ruleRoleClassLib )
                    	    {
                    	    // InternalCAEXtext.g:480:6: (lv_roleClassLib_30_0= ruleRoleClassLib )
                    	    // InternalCAEXtext.g:481:7: lv_roleClassLib_30_0= ruleRoleClassLib
                    	    {

                    	    							newCompositeNode(grammarAccess.getCAEXFileAccess().getRoleClassLibRoleClassLibParserRuleCall_17_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_roleClassLib_30_0=ruleRoleClassLib();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"roleClassLib",
                    	    								lv_roleClassLib_30_0,
                    	    								"caex.caex215.CAEXtext.RoleClassLib");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCAEXtext.g:500:3: ( ( (lv_systemUnitClassLib_31_0= ruleSystemUnitClassLib ) ) (otherlv_32= ',' ( (lv_systemUnitClassLib_33_0= ruleSystemUnitClassLib ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCAEXtext.g:501:4: ( (lv_systemUnitClassLib_31_0= ruleSystemUnitClassLib ) ) (otherlv_32= ',' ( (lv_systemUnitClassLib_33_0= ruleSystemUnitClassLib ) ) )*
                    {
                    // InternalCAEXtext.g:501:4: ( (lv_systemUnitClassLib_31_0= ruleSystemUnitClassLib ) )
                    // InternalCAEXtext.g:502:5: (lv_systemUnitClassLib_31_0= ruleSystemUnitClassLib )
                    {
                    // InternalCAEXtext.g:502:5: (lv_systemUnitClassLib_31_0= ruleSystemUnitClassLib )
                    // InternalCAEXtext.g:503:6: lv_systemUnitClassLib_31_0= ruleSystemUnitClassLib
                    {

                    						newCompositeNode(grammarAccess.getCAEXFileAccess().getSystemUnitClassLibSystemUnitClassLibParserRuleCall_18_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_systemUnitClassLib_31_0=ruleSystemUnitClassLib();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    						}
                    						add(
                    							current,
                    							"systemUnitClassLib",
                    							lv_systemUnitClassLib_31_0,
                    							"caex.caex215.CAEXtext.SystemUnitClassLib");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:520:4: (otherlv_32= ',' ( (lv_systemUnitClassLib_33_0= ruleSystemUnitClassLib ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalCAEXtext.g:521:5: otherlv_32= ',' ( (lv_systemUnitClassLib_33_0= ruleSystemUnitClassLib ) )
                    	    {
                    	    otherlv_32=(Token)match(input,14,FOLLOW_28); 

                    	    					newLeafNode(otherlv_32, grammarAccess.getCAEXFileAccess().getCommaKeyword_18_1_0());
                    	    				
                    	    // InternalCAEXtext.g:525:5: ( (lv_systemUnitClassLib_33_0= ruleSystemUnitClassLib ) )
                    	    // InternalCAEXtext.g:526:6: (lv_systemUnitClassLib_33_0= ruleSystemUnitClassLib )
                    	    {
                    	    // InternalCAEXtext.g:526:6: (lv_systemUnitClassLib_33_0= ruleSystemUnitClassLib )
                    	    // InternalCAEXtext.g:527:7: lv_systemUnitClassLib_33_0= ruleSystemUnitClassLib
                    	    {

                    	    							newCompositeNode(grammarAccess.getCAEXFileAccess().getSystemUnitClassLibSystemUnitClassLibParserRuleCall_18_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_systemUnitClassLib_33_0=ruleSystemUnitClassLib();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCAEXFileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"systemUnitClassLib",
                    	    								lv_systemUnitClassLib_33_0,
                    	    								"caex.caex215.CAEXtext.SystemUnitClassLib");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_34=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_34, grammarAccess.getCAEXFileAccess().getRightCurlyBracketKeyword_19());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCAEXFile"


    // $ANTLR start "entryRuleRoleClass"
    // InternalCAEXtext.g:554:1: entryRuleRoleClass returns [EObject current=null] : iv_ruleRoleClass= ruleRoleClass EOF ;
    public final EObject entryRuleRoleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleClass = null;


        try {
            // InternalCAEXtext.g:554:50: (iv_ruleRoleClass= ruleRoleClass EOF )
            // InternalCAEXtext.g:555:2: iv_ruleRoleClass= ruleRoleClass EOF
            {
             newCompositeNode(grammarAccess.getRoleClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleClass=ruleRoleClass();

            state._fsp--;

             current =iv_ruleRoleClass; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoleClass"


    // $ANTLR start "ruleRoleClass"
    // InternalCAEXtext.g:561:1: ruleRoleClass returns [EObject current=null] : this_RoleClass_Impl_0= ruleRoleClass_Impl ;
    public final EObject ruleRoleClass() throws RecognitionException {
        EObject current = null;

        EObject this_RoleClass_Impl_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:567:2: (this_RoleClass_Impl_0= ruleRoleClass_Impl )
            // InternalCAEXtext.g:568:2: this_RoleClass_Impl_0= ruleRoleClass_Impl
            {

            		newCompositeNode(grammarAccess.getRoleClassAccess().getRoleClass_ImplParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_RoleClass_Impl_0=ruleRoleClass_Impl();

            state._fsp--;


            		current = this_RoleClass_Impl_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoleClass"


    // $ANTLR start "entryRuleSystemUnitClass"
    // InternalCAEXtext.g:579:1: entryRuleSystemUnitClass returns [EObject current=null] : iv_ruleSystemUnitClass= ruleSystemUnitClass EOF ;
    public final EObject entryRuleSystemUnitClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemUnitClass = null;


        try {
            // InternalCAEXtext.g:579:56: (iv_ruleSystemUnitClass= ruleSystemUnitClass EOF )
            // InternalCAEXtext.g:580:2: iv_ruleSystemUnitClass= ruleSystemUnitClass EOF
            {
             newCompositeNode(grammarAccess.getSystemUnitClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemUnitClass=ruleSystemUnitClass();

            state._fsp--;

             current =iv_ruleSystemUnitClass; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSystemUnitClass"


    // $ANTLR start "ruleSystemUnitClass"
    // InternalCAEXtext.g:586:1: ruleSystemUnitClass returns [EObject current=null] : (this_SystemUnitClass_Impl_0= ruleSystemUnitClass_Impl | this_InternalElement_1= ruleInternalElement ) ;
    public final EObject ruleSystemUnitClass() throws RecognitionException {
        EObject current = null;

        EObject this_SystemUnitClass_Impl_0 = null;

        EObject this_InternalElement_1 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:592:2: ( (this_SystemUnitClass_Impl_0= ruleSystemUnitClass_Impl | this_InternalElement_1= ruleInternalElement ) )
            // InternalCAEXtext.g:593:2: (this_SystemUnitClass_Impl_0= ruleSystemUnitClass_Impl | this_InternalElement_1= ruleInternalElement )
            {
            // InternalCAEXtext.g:593:2: (this_SystemUnitClass_Impl_0= ruleSystemUnitClass_Impl | this_InternalElement_1= ruleInternalElement )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==75) ) {
                alt19=1;
            }
            else if ( (LA19_0==46) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalCAEXtext.g:594:3: this_SystemUnitClass_Impl_0= ruleSystemUnitClass_Impl
                    {

                    			newCompositeNode(grammarAccess.getSystemUnitClassAccess().getSystemUnitClass_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemUnitClass_Impl_0=ruleSystemUnitClass_Impl();

                    state._fsp--;


                    			current = this_SystemUnitClass_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCAEXtext.g:603:3: this_InternalElement_1= ruleInternalElement
                    {

                    			newCompositeNode(grammarAccess.getSystemUnitClassAccess().getInternalElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InternalElement_1=ruleInternalElement();

                    state._fsp--;


                    			current = this_InternalElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemUnitClass"


    // $ANTLR start "entryRuleInterfaceClass"
    // InternalCAEXtext.g:615:1: entryRuleInterfaceClass returns [EObject current=null] : iv_ruleInterfaceClass= ruleInterfaceClass EOF ;
    public final EObject entryRuleInterfaceClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceClass = null;


        try {
            // InternalCAEXtext.g:615:55: (iv_ruleInterfaceClass= ruleInterfaceClass EOF )
            // InternalCAEXtext.g:616:2: iv_ruleInterfaceClass= ruleInterfaceClass EOF
            {
             newCompositeNode(grammarAccess.getInterfaceClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceClass=ruleInterfaceClass();

            state._fsp--;

             current =iv_ruleInterfaceClass; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInterfaceClass"


    // $ANTLR start "ruleInterfaceClass"
    // InternalCAEXtext.g:622:1: ruleInterfaceClass returns [EObject current=null] : (this_InterfaceClass_Impl_0= ruleInterfaceClass_Impl | this_ExternalInterface_1= ruleExternalInterface ) ;
    public final EObject ruleInterfaceClass() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceClass_Impl_0 = null;

        EObject this_ExternalInterface_1 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:628:2: ( (this_InterfaceClass_Impl_0= ruleInterfaceClass_Impl | this_ExternalInterface_1= ruleExternalInterface ) )
            // InternalCAEXtext.g:629:2: (this_InterfaceClass_Impl_0= ruleInterfaceClass_Impl | this_ExternalInterface_1= ruleExternalInterface )
            {
            // InternalCAEXtext.g:629:2: (this_InterfaceClass_Impl_0= ruleInterfaceClass_Impl | this_ExternalInterface_1= ruleExternalInterface )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==58) ) {
                alt20=1;
            }
            else if ( (LA20_0==98) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalCAEXtext.g:630:3: this_InterfaceClass_Impl_0= ruleInterfaceClass_Impl
                    {

                    			newCompositeNode(grammarAccess.getInterfaceClassAccess().getInterfaceClass_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InterfaceClass_Impl_0=ruleInterfaceClass_Impl();

                    state._fsp--;


                    			current = this_InterfaceClass_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCAEXtext.g:639:3: this_ExternalInterface_1= ruleExternalInterface
                    {

                    			newCompositeNode(grammarAccess.getInterfaceClassAccess().getExternalInterfaceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalInterface_1=ruleExternalInterface();

                    state._fsp--;


                    			current = this_ExternalInterface_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceClass"


    // $ANTLR start "entryRuleDescription"
    // InternalCAEXtext.g:651:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalCAEXtext.g:651:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalCAEXtext.g:652:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalCAEXtext.g:658:1: ruleDescription returns [EObject current=null] : ( () otherlv_1= 'Description' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        Enumerator lv_changeMode_6_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:664:2: ( ( () otherlv_1= 'Description' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? otherlv_7= '}' ) )
            // InternalCAEXtext.g:665:2: ( () otherlv_1= 'Description' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? otherlv_7= '}' )
            {
            // InternalCAEXtext.g:665:2: ( () otherlv_1= 'Description' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? otherlv_7= '}' )
            // InternalCAEXtext.g:666:3: () otherlv_1= 'Description' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? otherlv_7= '}'
            {
            // InternalCAEXtext.g:666:3: ()
            // InternalCAEXtext.g:667:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDescriptionAccess().getDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptionAccess().getDescriptionKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getDescriptionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCAEXtext.g:681:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCAEXtext.g:682:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getDescriptionAccess().getValueKeyword_3_0());
                    			
                    // InternalCAEXtext.g:686:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalCAEXtext.g:687:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalCAEXtext.g:687:5: (lv_value_4_0= ruleEString )
                    // InternalCAEXtext.g:688:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDescriptionAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDescriptionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:706:3: (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCAEXtext.g:707:4: otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getDescriptionAccess().getChangeModeKeyword_4_0());
                    			
                    // InternalCAEXtext.g:711:4: ( (lv_changeMode_6_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:712:5: (lv_changeMode_6_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:712:5: (lv_changeMode_6_0= ruleChangeMode )
                    // InternalCAEXtext.g:713:6: lv_changeMode_6_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getDescriptionAccess().getChangeModeChangeModeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_changeMode_6_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDescriptionRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_6_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleVersion"
    // InternalCAEXtext.g:739:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // InternalCAEXtext.g:739:48: (iv_ruleVersion= ruleVersion EOF )
            // InternalCAEXtext.g:740:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalCAEXtext.g:746:1: ruleVersion returns [EObject current=null] : ( () otherlv_1= 'Version' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        Enumerator lv_changeMode_6_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:752:2: ( ( () otherlv_1= 'Version' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? otherlv_7= '}' ) )
            // InternalCAEXtext.g:753:2: ( () otherlv_1= 'Version' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? otherlv_7= '}' )
            {
            // InternalCAEXtext.g:753:2: ( () otherlv_1= 'Version' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? otherlv_7= '}' )
            // InternalCAEXtext.g:754:3: () otherlv_1= 'Version' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? otherlv_7= '}'
            {
            // InternalCAEXtext.g:754:3: ()
            // InternalCAEXtext.g:755:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVersionAccess().getVersionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getVersionKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getVersionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCAEXtext.g:769:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCAEXtext.g:770:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getVersionAccess().getValueKeyword_3_0());
                    			
                    // InternalCAEXtext.g:774:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalCAEXtext.g:775:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalCAEXtext.g:775:5: (lv_value_4_0= ruleEString )
                    // InternalCAEXtext.g:776:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVersionAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVersionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:794:3: (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCAEXtext.g:795:4: otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getVersionAccess().getChangeModeKeyword_4_0());
                    			
                    // InternalCAEXtext.g:799:4: ( (lv_changeMode_6_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:800:5: (lv_changeMode_6_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:800:5: (lv_changeMode_6_0= ruleChangeMode )
                    // InternalCAEXtext.g:801:6: lv_changeMode_6_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getVersionAccess().getChangeModeChangeModeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_changeMode_6_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVersionRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_6_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVersionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleRevision"
    // InternalCAEXtext.g:827:1: entryRuleRevision returns [EObject current=null] : iv_ruleRevision= ruleRevision EOF ;
    public final EObject entryRuleRevision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRevision = null;


        try {
            // InternalCAEXtext.g:827:49: (iv_ruleRevision= ruleRevision EOF )
            // InternalCAEXtext.g:828:2: iv_ruleRevision= ruleRevision EOF
            {
             newCompositeNode(grammarAccess.getRevisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRevision=ruleRevision();

            state._fsp--;

             current =iv_ruleRevision; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRevision"


    // $ANTLR start "ruleRevision"
    // InternalCAEXtext.g:834:1: ruleRevision returns [EObject current=null] : (otherlv_0= 'Revision' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'revisionDate' ( (lv_revisionDate_5_0= ruleDateTime ) ) (otherlv_6= 'oldVersion' ( (lv_oldVersion_7_0= ruleEString ) ) )? (otherlv_8= 'newVersion' ( (lv_newVersion_9_0= ruleEString ) ) )? otherlv_10= 'authorName' ( (lv_authorName_11_0= ruleEString ) ) (otherlv_12= 'comment' ( (lv_comment_13_0= ruleEString ) ) )? ( (lv_description_14_0= ruleDescription ) )? ( (lv_version_15_0= ruleVersion ) )? ( ( (lv_revision_16_0= ruleRevision ) ) (otherlv_17= ',' ( (lv_revision_18_0= ruleRevision ) ) )* )? ( (lv_copyright_19_0= ruleCopyright ) )? ( ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* )? otherlv_23= '}' ) ;
    public final EObject ruleRevision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_17=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Enumerator lv_changeMode_3_0 = null;

        AntlrDatatypeRuleToken lv_revisionDate_5_0 = null;

        AntlrDatatypeRuleToken lv_oldVersion_7_0 = null;

        AntlrDatatypeRuleToken lv_newVersion_9_0 = null;

        AntlrDatatypeRuleToken lv_authorName_11_0 = null;

        AntlrDatatypeRuleToken lv_comment_13_0 = null;

        EObject lv_description_14_0 = null;

        EObject lv_version_15_0 = null;

        EObject lv_revision_16_0 = null;

        EObject lv_revision_18_0 = null;

        EObject lv_copyright_19_0 = null;

        EObject lv_additionalInformation_20_0 = null;

        EObject lv_additionalInformation_22_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:840:2: ( (otherlv_0= 'Revision' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'revisionDate' ( (lv_revisionDate_5_0= ruleDateTime ) ) (otherlv_6= 'oldVersion' ( (lv_oldVersion_7_0= ruleEString ) ) )? (otherlv_8= 'newVersion' ( (lv_newVersion_9_0= ruleEString ) ) )? otherlv_10= 'authorName' ( (lv_authorName_11_0= ruleEString ) ) (otherlv_12= 'comment' ( (lv_comment_13_0= ruleEString ) ) )? ( (lv_description_14_0= ruleDescription ) )? ( (lv_version_15_0= ruleVersion ) )? ( ( (lv_revision_16_0= ruleRevision ) ) (otherlv_17= ',' ( (lv_revision_18_0= ruleRevision ) ) )* )? ( (lv_copyright_19_0= ruleCopyright ) )? ( ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* )? otherlv_23= '}' ) )
            // InternalCAEXtext.g:841:2: (otherlv_0= 'Revision' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'revisionDate' ( (lv_revisionDate_5_0= ruleDateTime ) ) (otherlv_6= 'oldVersion' ( (lv_oldVersion_7_0= ruleEString ) ) )? (otherlv_8= 'newVersion' ( (lv_newVersion_9_0= ruleEString ) ) )? otherlv_10= 'authorName' ( (lv_authorName_11_0= ruleEString ) ) (otherlv_12= 'comment' ( (lv_comment_13_0= ruleEString ) ) )? ( (lv_description_14_0= ruleDescription ) )? ( (lv_version_15_0= ruleVersion ) )? ( ( (lv_revision_16_0= ruleRevision ) ) (otherlv_17= ',' ( (lv_revision_18_0= ruleRevision ) ) )* )? ( (lv_copyright_19_0= ruleCopyright ) )? ( ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* )? otherlv_23= '}' )
            {
            // InternalCAEXtext.g:841:2: (otherlv_0= 'Revision' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'revisionDate' ( (lv_revisionDate_5_0= ruleDateTime ) ) (otherlv_6= 'oldVersion' ( (lv_oldVersion_7_0= ruleEString ) ) )? (otherlv_8= 'newVersion' ( (lv_newVersion_9_0= ruleEString ) ) )? otherlv_10= 'authorName' ( (lv_authorName_11_0= ruleEString ) ) (otherlv_12= 'comment' ( (lv_comment_13_0= ruleEString ) ) )? ( (lv_description_14_0= ruleDescription ) )? ( (lv_version_15_0= ruleVersion ) )? ( ( (lv_revision_16_0= ruleRevision ) ) (otherlv_17= ',' ( (lv_revision_18_0= ruleRevision ) ) )* )? ( (lv_copyright_19_0= ruleCopyright ) )? ( ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* )? otherlv_23= '}' )
            // InternalCAEXtext.g:842:3: otherlv_0= 'Revision' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'revisionDate' ( (lv_revisionDate_5_0= ruleDateTime ) ) (otherlv_6= 'oldVersion' ( (lv_oldVersion_7_0= ruleEString ) ) )? (otherlv_8= 'newVersion' ( (lv_newVersion_9_0= ruleEString ) ) )? otherlv_10= 'authorName' ( (lv_authorName_11_0= ruleEString ) ) (otherlv_12= 'comment' ( (lv_comment_13_0= ruleEString ) ) )? ( (lv_description_14_0= ruleDescription ) )? ( (lv_version_15_0= ruleVersion ) )? ( ( (lv_revision_16_0= ruleRevision ) ) (otherlv_17= ',' ( (lv_revision_18_0= ruleRevision ) ) )* )? ( (lv_copyright_19_0= ruleCopyright ) )? ( ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRevisionAccess().getRevisionKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getRevisionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCAEXtext.g:850:3: (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCAEXtext.g:851:4: otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getRevisionAccess().getChangeModeKeyword_2_0());
                    			
                    // InternalCAEXtext.g:855:4: ( (lv_changeMode_3_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:856:5: (lv_changeMode_3_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:856:5: (lv_changeMode_3_0= ruleChangeMode )
                    // InternalCAEXtext.g:857:6: lv_changeMode_3_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getRevisionAccess().getChangeModeChangeModeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_changeMode_3_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRevisionRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_3_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_34); 

            			newLeafNode(otherlv_4, grammarAccess.getRevisionAccess().getRevisionDateKeyword_3());
            		
            // InternalCAEXtext.g:879:3: ( (lv_revisionDate_5_0= ruleDateTime ) )
            // InternalCAEXtext.g:880:4: (lv_revisionDate_5_0= ruleDateTime )
            {
            // InternalCAEXtext.g:880:4: (lv_revisionDate_5_0= ruleDateTime )
            // InternalCAEXtext.g:881:5: lv_revisionDate_5_0= ruleDateTime
            {

            					newCompositeNode(grammarAccess.getRevisionAccess().getRevisionDateDateTimeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_35);
            lv_revisionDate_5_0=ruleDateTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRevisionRule());
            					}
            					set(
            						current,
            						"revisionDate",
            						lv_revisionDate_5_0,
            						"caex.caex215.CAEXtext.DateTime");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCAEXtext.g:898:3: (otherlv_6= 'oldVersion' ( (lv_oldVersion_7_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCAEXtext.g:899:4: otherlv_6= 'oldVersion' ( (lv_oldVersion_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getRevisionAccess().getOldVersionKeyword_5_0());
                    			
                    // InternalCAEXtext.g:903:4: ( (lv_oldVersion_7_0= ruleEString ) )
                    // InternalCAEXtext.g:904:5: (lv_oldVersion_7_0= ruleEString )
                    {
                    // InternalCAEXtext.g:904:5: (lv_oldVersion_7_0= ruleEString )
                    // InternalCAEXtext.g:905:6: lv_oldVersion_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRevisionAccess().getOldVersionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_oldVersion_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRevisionRule());
                    						}
                    						set(
                    							current,
                    							"oldVersion",
                    							lv_oldVersion_7_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:923:3: (otherlv_8= 'newVersion' ( (lv_newVersion_9_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCAEXtext.g:924:4: otherlv_8= 'newVersion' ( (lv_newVersion_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getRevisionAccess().getNewVersionKeyword_6_0());
                    			
                    // InternalCAEXtext.g:928:4: ( (lv_newVersion_9_0= ruleEString ) )
                    // InternalCAEXtext.g:929:5: (lv_newVersion_9_0= ruleEString )
                    {
                    // InternalCAEXtext.g:929:5: (lv_newVersion_9_0= ruleEString )
                    // InternalCAEXtext.g:930:6: lv_newVersion_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRevisionAccess().getNewVersionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_newVersion_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRevisionRule());
                    						}
                    						set(
                    							current,
                    							"newVersion",
                    							lv_newVersion_9_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getRevisionAccess().getAuthorNameKeyword_7());
            		
            // InternalCAEXtext.g:952:3: ( (lv_authorName_11_0= ruleEString ) )
            // InternalCAEXtext.g:953:4: (lv_authorName_11_0= ruleEString )
            {
            // InternalCAEXtext.g:953:4: (lv_authorName_11_0= ruleEString )
            // InternalCAEXtext.g:954:5: lv_authorName_11_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRevisionAccess().getAuthorNameEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_38);
            lv_authorName_11_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRevisionRule());
            					}
            					set(
            						current,
            						"authorName",
            						lv_authorName_11_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCAEXtext.g:971:3: (otherlv_12= 'comment' ( (lv_comment_13_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCAEXtext.g:972:4: otherlv_12= 'comment' ( (lv_comment_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getRevisionAccess().getCommentKeyword_9_0());
                    			
                    // InternalCAEXtext.g:976:4: ( (lv_comment_13_0= ruleEString ) )
                    // InternalCAEXtext.g:977:5: (lv_comment_13_0= ruleEString )
                    {
                    // InternalCAEXtext.g:977:5: (lv_comment_13_0= ruleEString )
                    // InternalCAEXtext.g:978:6: lv_comment_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRevisionAccess().getCommentEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_comment_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRevisionRule());
                    						}
                    						set(
                    							current,
                    							"comment",
                    							lv_comment_13_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:996:3: ( (lv_description_14_0= ruleDescription ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCAEXtext.g:997:4: (lv_description_14_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:997:4: (lv_description_14_0= ruleDescription )
                    // InternalCAEXtext.g:998:5: lv_description_14_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getRevisionAccess().getDescriptionDescriptionParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_40);
                    lv_description_14_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRevisionRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_14_0,
                    						"caex.caex215.CAEXtext.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:1015:3: ( (lv_version_15_0= ruleVersion ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCAEXtext.g:1016:4: (lv_version_15_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:1016:4: (lv_version_15_0= ruleVersion )
                    // InternalCAEXtext.g:1017:5: lv_version_15_0= ruleVersion
                    {

                    					newCompositeNode(grammarAccess.getRevisionAccess().getVersionVersionParserRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_41);
                    lv_version_15_0=ruleVersion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRevisionRule());
                    					}
                    					set(
                    						current,
                    						"version",
                    						lv_version_15_0,
                    						"caex.caex215.CAEXtext.Version");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:1034:3: ( ( (lv_revision_16_0= ruleRevision ) ) (otherlv_17= ',' ( (lv_revision_18_0= ruleRevision ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCAEXtext.g:1035:4: ( (lv_revision_16_0= ruleRevision ) ) (otherlv_17= ',' ( (lv_revision_18_0= ruleRevision ) ) )*
                    {
                    // InternalCAEXtext.g:1035:4: ( (lv_revision_16_0= ruleRevision ) )
                    // InternalCAEXtext.g:1036:5: (lv_revision_16_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:1036:5: (lv_revision_16_0= ruleRevision )
                    // InternalCAEXtext.g:1037:6: lv_revision_16_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getRevisionAccess().getRevisionRevisionParserRuleCall_12_0_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_revision_16_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRevisionRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_16_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:1054:4: (otherlv_17= ',' ( (lv_revision_18_0= ruleRevision ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalCAEXtext.g:1055:5: otherlv_17= ',' ( (lv_revision_18_0= ruleRevision ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getRevisionAccess().getCommaKeyword_12_1_0());
                    	    				
                    	    // InternalCAEXtext.g:1059:5: ( (lv_revision_18_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:1060:6: (lv_revision_18_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:1060:6: (lv_revision_18_0= ruleRevision )
                    	    // InternalCAEXtext.g:1061:7: lv_revision_18_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getRevisionAccess().getRevisionRevisionParserRuleCall_12_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
                    	    lv_revision_18_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRevisionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_18_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCAEXtext.g:1080:3: ( (lv_copyright_19_0= ruleCopyright ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==29) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCAEXtext.g:1081:4: (lv_copyright_19_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:1081:4: (lv_copyright_19_0= ruleCopyright )
                    // InternalCAEXtext.g:1082:5: lv_copyright_19_0= ruleCopyright
                    {

                    					newCompositeNode(grammarAccess.getRevisionAccess().getCopyrightCopyrightParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_43);
                    lv_copyright_19_0=ruleCopyright();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRevisionRule());
                    					}
                    					set(
                    						current,
                    						"copyright",
                    						lv_copyright_19_0,
                    						"caex.caex215.CAEXtext.Copyright");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:1099:3: ( ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==30) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCAEXtext.g:1100:4: ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )*
                    {
                    // InternalCAEXtext.g:1100:4: ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:1101:5: (lv_additionalInformation_20_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:1101:5: (lv_additionalInformation_20_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:1102:6: lv_additionalInformation_20_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getRevisionAccess().getAdditionalInformationAdditionalInformationParserRuleCall_14_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_additionalInformation_20_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRevisionRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_20_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:1119:4: (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==14) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalCAEXtext.g:1120:5: otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getRevisionAccess().getCommaKeyword_14_1_0());
                    	    				
                    	    // InternalCAEXtext.g:1124:5: ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:1125:6: (lv_additionalInformation_22_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:1125:6: (lv_additionalInformation_22_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:1126:7: lv_additionalInformation_22_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRevisionAccess().getAdditionalInformationAdditionalInformationParserRuleCall_14_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_additionalInformation_22_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRevisionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_22_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_23=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getRevisionAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRevision"


    // $ANTLR start "entryRuleCopyright"
    // InternalCAEXtext.g:1153:1: entryRuleCopyright returns [EObject current=null] : iv_ruleCopyright= ruleCopyright EOF ;
    public final EObject entryRuleCopyright() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopyright = null;


        try {
            // InternalCAEXtext.g:1153:50: (iv_ruleCopyright= ruleCopyright EOF )
            // InternalCAEXtext.g:1154:2: iv_ruleCopyright= ruleCopyright EOF
            {
             newCompositeNode(grammarAccess.getCopyrightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCopyright=ruleCopyright();

            state._fsp--;

             current =iv_ruleCopyright; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCopyright"


    // $ANTLR start "ruleCopyright"
    // InternalCAEXtext.g:1160:1: ruleCopyright returns [EObject current=null] : ( () otherlv_1= 'Copyright' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleCopyright() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        Enumerator lv_changeMode_6_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:1166:2: ( ( () otherlv_1= 'Copyright' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? otherlv_7= '}' ) )
            // InternalCAEXtext.g:1167:2: ( () otherlv_1= 'Copyright' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? otherlv_7= '}' )
            {
            // InternalCAEXtext.g:1167:2: ( () otherlv_1= 'Copyright' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? otherlv_7= '}' )
            // InternalCAEXtext.g:1168:3: () otherlv_1= 'Copyright' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? otherlv_7= '}'
            {
            // InternalCAEXtext.g:1168:3: ()
            // InternalCAEXtext.g:1169:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCopyrightAccess().getCopyrightAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getCopyrightAccess().getCopyrightKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getCopyrightAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCAEXtext.g:1183:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==21) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCAEXtext.g:1184:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getCopyrightAccess().getValueKeyword_3_0());
                    			
                    // InternalCAEXtext.g:1188:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalCAEXtext.g:1189:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalCAEXtext.g:1189:5: (lv_value_4_0= ruleEString )
                    // InternalCAEXtext.g:1190:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCopyrightAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCopyrightRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:1208:3: (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==13) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCAEXtext.g:1209:4: otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getCopyrightAccess().getChangeModeKeyword_4_0());
                    			
                    // InternalCAEXtext.g:1213:4: ( (lv_changeMode_6_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:1214:5: (lv_changeMode_6_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:1214:5: (lv_changeMode_6_0= ruleChangeMode )
                    // InternalCAEXtext.g:1215:6: lv_changeMode_6_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getCopyrightAccess().getChangeModeChangeModeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_changeMode_6_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCopyrightRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_6_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCopyrightAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCopyright"


    // $ANTLR start "entryRuleAdditionalInformation"
    // InternalCAEXtext.g:1241:1: entryRuleAdditionalInformation returns [EObject current=null] : iv_ruleAdditionalInformation= ruleAdditionalInformation EOF ;
    public final EObject entryRuleAdditionalInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalInformation = null;


        try {
            // InternalCAEXtext.g:1241:62: (iv_ruleAdditionalInformation= ruleAdditionalInformation EOF )
            // InternalCAEXtext.g:1242:2: iv_ruleAdditionalInformation= ruleAdditionalInformation EOF
            {
             newCompositeNode(grammarAccess.getAdditionalInformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditionalInformation=ruleAdditionalInformation();

            state._fsp--;

             current =iv_ruleAdditionalInformation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdditionalInformation"


    // $ANTLR start "ruleAdditionalInformation"
    // InternalCAEXtext.g:1248:1: ruleAdditionalInformation returns [EObject current=null] : ( () otherlv_1= 'AdditionalInformation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAdditionalInformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:1254:2: ( ( () otherlv_1= 'AdditionalInformation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalCAEXtext.g:1255:2: ( () otherlv_1= 'AdditionalInformation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalCAEXtext.g:1255:2: ( () otherlv_1= 'AdditionalInformation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalCAEXtext.g:1256:3: () otherlv_1= 'AdditionalInformation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalCAEXtext.g:1256:3: ()
            // InternalCAEXtext.g:1257:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAdditionalInformationAccess().getAdditionalInformationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getAdditionalInformationAccess().getAdditionalInformationKeyword_1());
            		
            // InternalCAEXtext.g:1267:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCAEXtext.g:1268:4: (lv_name_2_0= ruleEString )
            {
            // InternalCAEXtext.g:1268:4: (lv_name_2_0= ruleEString )
            // InternalCAEXtext.g:1269:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAdditionalInformationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdditionalInformationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_44); 

            			newLeafNode(otherlv_3, grammarAccess.getAdditionalInformationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCAEXtext.g:1290:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==21) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCAEXtext.g:1291:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getAdditionalInformationAccess().getValueKeyword_4_0());
                    			
                    // InternalCAEXtext.g:1295:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalCAEXtext.g:1296:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalCAEXtext.g:1296:5: (lv_value_5_0= ruleEString )
                    // InternalCAEXtext.g:1297:6: lv_value_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAdditionalInformationAccess().getValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_value_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAdditionalInformationRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAdditionalInformationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionalInformation"


    // $ANTLR start "entryRuleExternalReference"
    // InternalCAEXtext.g:1323:1: entryRuleExternalReference returns [EObject current=null] : iv_ruleExternalReference= ruleExternalReference EOF ;
    public final EObject entryRuleExternalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalReference = null;


        try {
            // InternalCAEXtext.g:1323:58: (iv_ruleExternalReference= ruleExternalReference EOF )
            // InternalCAEXtext.g:1324:2: iv_ruleExternalReference= ruleExternalReference EOF
            {
             newCompositeNode(grammarAccess.getExternalReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalReference=ruleExternalReference();

            state._fsp--;

             current =iv_ruleExternalReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExternalReference"


    // $ANTLR start "ruleExternalReference"
    // InternalCAEXtext.g:1330:1: ruleExternalReference returns [EObject current=null] : (otherlv_0= 'ExternalReference' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) ) otherlv_6= 'path' ( (lv_path_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? otherlv_17= '}' ) ;
    public final EObject ruleExternalReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Enumerator lv_changeMode_3_0 = null;

        AntlrDatatypeRuleToken lv_alias_5_0 = null;

        AntlrDatatypeRuleToken lv_path_7_0 = null;

        EObject lv_description_8_0 = null;

        EObject lv_version_9_0 = null;

        EObject lv_revision_10_0 = null;

        EObject lv_revision_12_0 = null;

        EObject lv_copyright_13_0 = null;

        EObject lv_additionalInformation_14_0 = null;

        EObject lv_additionalInformation_16_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:1336:2: ( (otherlv_0= 'ExternalReference' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) ) otherlv_6= 'path' ( (lv_path_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? otherlv_17= '}' ) )
            // InternalCAEXtext.g:1337:2: (otherlv_0= 'ExternalReference' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) ) otherlv_6= 'path' ( (lv_path_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? otherlv_17= '}' )
            {
            // InternalCAEXtext.g:1337:2: (otherlv_0= 'ExternalReference' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) ) otherlv_6= 'path' ( (lv_path_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? otherlv_17= '}' )
            // InternalCAEXtext.g:1338:3: otherlv_0= 'ExternalReference' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'alias' ( (lv_alias_5_0= ruleEString ) ) otherlv_6= 'path' ( (lv_path_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalReferenceAccess().getExternalReferenceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalReferenceAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCAEXtext.g:1346:3: (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==13) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCAEXtext.g:1347:4: otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getExternalReferenceAccess().getChangeModeKeyword_2_0());
                    			
                    // InternalCAEXtext.g:1351:4: ( (lv_changeMode_3_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:1352:5: (lv_changeMode_3_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:1352:5: (lv_changeMode_3_0= ruleChangeMode )
                    // InternalCAEXtext.g:1353:6: lv_changeMode_3_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getExternalReferenceAccess().getChangeModeChangeModeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_changeMode_3_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalReferenceRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_3_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getExternalReferenceAccess().getAliasKeyword_3());
            		
            // InternalCAEXtext.g:1375:3: ( (lv_alias_5_0= ruleEString ) )
            // InternalCAEXtext.g:1376:4: (lv_alias_5_0= ruleEString )
            {
            // InternalCAEXtext.g:1376:4: (lv_alias_5_0= ruleEString )
            // InternalCAEXtext.g:1377:5: lv_alias_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalReferenceAccess().getAliasEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_47);
            lv_alias_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalReferenceRule());
            					}
            					set(
            						current,
            						"alias",
            						lv_alias_5_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getExternalReferenceAccess().getPathKeyword_5());
            		
            // InternalCAEXtext.g:1398:3: ( (lv_path_7_0= ruleEString ) )
            // InternalCAEXtext.g:1399:4: (lv_path_7_0= ruleEString )
            {
            // InternalCAEXtext.g:1399:4: (lv_path_7_0= ruleEString )
            // InternalCAEXtext.g:1400:5: lv_path_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalReferenceAccess().getPathEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_39);
            lv_path_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalReferenceRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_7_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCAEXtext.g:1417:3: ( (lv_description_8_0= ruleDescription ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==20) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCAEXtext.g:1418:4: (lv_description_8_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:1418:4: (lv_description_8_0= ruleDescription )
                    // InternalCAEXtext.g:1419:5: lv_description_8_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getExternalReferenceAccess().getDescriptionDescriptionParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_40);
                    lv_description_8_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExternalReferenceRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_8_0,
                    						"caex.caex215.CAEXtext.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:1436:3: ( (lv_version_9_0= ruleVersion ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==22) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCAEXtext.g:1437:4: (lv_version_9_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:1437:4: (lv_version_9_0= ruleVersion )
                    // InternalCAEXtext.g:1438:5: lv_version_9_0= ruleVersion
                    {

                    					newCompositeNode(grammarAccess.getExternalReferenceAccess().getVersionVersionParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_41);
                    lv_version_9_0=ruleVersion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExternalReferenceRule());
                    					}
                    					set(
                    						current,
                    						"version",
                    						lv_version_9_0,
                    						"caex.caex215.CAEXtext.Version");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:1455:3: ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==23) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCAEXtext.g:1456:4: ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )*
                    {
                    // InternalCAEXtext.g:1456:4: ( (lv_revision_10_0= ruleRevision ) )
                    // InternalCAEXtext.g:1457:5: (lv_revision_10_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:1457:5: (lv_revision_10_0= ruleRevision )
                    // InternalCAEXtext.g:1458:6: lv_revision_10_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getExternalReferenceAccess().getRevisionRevisionParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_revision_10_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalReferenceRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_10_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:1475:4: (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==14) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalCAEXtext.g:1476:5: otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getExternalReferenceAccess().getCommaKeyword_9_1_0());
                    	    				
                    	    // InternalCAEXtext.g:1480:5: ( (lv_revision_12_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:1481:6: (lv_revision_12_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:1481:6: (lv_revision_12_0= ruleRevision )
                    	    // InternalCAEXtext.g:1482:7: lv_revision_12_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalReferenceAccess().getRevisionRevisionParserRuleCall_9_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
                    	    lv_revision_12_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalReferenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_12_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCAEXtext.g:1501:3: ( (lv_copyright_13_0= ruleCopyright ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==29) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCAEXtext.g:1502:4: (lv_copyright_13_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:1502:4: (lv_copyright_13_0= ruleCopyright )
                    // InternalCAEXtext.g:1503:5: lv_copyright_13_0= ruleCopyright
                    {

                    					newCompositeNode(grammarAccess.getExternalReferenceAccess().getCopyrightCopyrightParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_43);
                    lv_copyright_13_0=ruleCopyright();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExternalReferenceRule());
                    					}
                    					set(
                    						current,
                    						"copyright",
                    						lv_copyright_13_0,
                    						"caex.caex215.CAEXtext.Copyright");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:1520:3: ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==30) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCAEXtext.g:1521:4: ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )*
                    {
                    // InternalCAEXtext.g:1521:4: ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:1522:5: (lv_additionalInformation_14_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:1522:5: (lv_additionalInformation_14_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:1523:6: lv_additionalInformation_14_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getExternalReferenceAccess().getAdditionalInformationAdditionalInformationParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_additionalInformation_14_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalReferenceRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_14_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:1540:4: (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==14) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalCAEXtext.g:1541:5: otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getExternalReferenceAccess().getCommaKeyword_11_1_0());
                    	    				
                    	    // InternalCAEXtext.g:1545:5: ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:1546:6: (lv_additionalInformation_16_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:1546:6: (lv_additionalInformation_16_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:1547:7: lv_additionalInformation_16_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalReferenceAccess().getAdditionalInformationAdditionalInformationParserRuleCall_11_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_additionalInformation_16_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalReferenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_16_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getExternalReferenceAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalReference"


    // $ANTLR start "entryRuleInstanceHierarchy"
    // InternalCAEXtext.g:1574:1: entryRuleInstanceHierarchy returns [EObject current=null] : iv_ruleInstanceHierarchy= ruleInstanceHierarchy EOF ;
    public final EObject entryRuleInstanceHierarchy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceHierarchy = null;


        try {
            // InternalCAEXtext.g:1574:58: (iv_ruleInstanceHierarchy= ruleInstanceHierarchy EOF )
            // InternalCAEXtext.g:1575:2: iv_ruleInstanceHierarchy= ruleInstanceHierarchy EOF
            {
             newCompositeNode(grammarAccess.getInstanceHierarchyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceHierarchy=ruleInstanceHierarchy();

            state._fsp--;

             current =iv_ruleInstanceHierarchy; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInstanceHierarchy"


    // $ANTLR start "ruleInstanceHierarchy"
    // InternalCAEXtext.g:1581:1: ruleInstanceHierarchy returns [EObject current=null] : (otherlv_0= 'IH' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_iD_3_0= ruleEString ) ) )? otherlv_4= '[' (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? ( (lv_description_7_0= ruleDescription ) )? ( (lv_version_8_0= ruleVersion ) )? ( ( (lv_revision_9_0= ruleRevision ) ) (otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) ) )* )? ( (lv_copyright_12_0= ruleCopyright ) )? ( ( (lv_additionalInformation_13_0= ruleAdditionalInformation ) ) (otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) ) )* )? otherlv_16= ']' otherlv_17= '{' ( ( (lv_internalElement_18_0= ruleInternalElement ) ) (otherlv_19= ',' ( (lv_internalElement_20_0= ruleInternalElement ) ) )* )? otherlv_21= '}' ) ;
    public final EObject ruleInstanceHierarchy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_iD_3_0 = null;

        Enumerator lv_changeMode_6_0 = null;

        EObject lv_description_7_0 = null;

        EObject lv_version_8_0 = null;

        EObject lv_revision_9_0 = null;

        EObject lv_revision_11_0 = null;

        EObject lv_copyright_12_0 = null;

        EObject lv_additionalInformation_13_0 = null;

        EObject lv_additionalInformation_15_0 = null;

        EObject lv_internalElement_18_0 = null;

        EObject lv_internalElement_20_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:1587:2: ( (otherlv_0= 'IH' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_iD_3_0= ruleEString ) ) )? otherlv_4= '[' (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? ( (lv_description_7_0= ruleDescription ) )? ( (lv_version_8_0= ruleVersion ) )? ( ( (lv_revision_9_0= ruleRevision ) ) (otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) ) )* )? ( (lv_copyright_12_0= ruleCopyright ) )? ( ( (lv_additionalInformation_13_0= ruleAdditionalInformation ) ) (otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) ) )* )? otherlv_16= ']' otherlv_17= '{' ( ( (lv_internalElement_18_0= ruleInternalElement ) ) (otherlv_19= ',' ( (lv_internalElement_20_0= ruleInternalElement ) ) )* )? otherlv_21= '}' ) )
            // InternalCAEXtext.g:1588:2: (otherlv_0= 'IH' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_iD_3_0= ruleEString ) ) )? otherlv_4= '[' (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? ( (lv_description_7_0= ruleDescription ) )? ( (lv_version_8_0= ruleVersion ) )? ( ( (lv_revision_9_0= ruleRevision ) ) (otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) ) )* )? ( (lv_copyright_12_0= ruleCopyright ) )? ( ( (lv_additionalInformation_13_0= ruleAdditionalInformation ) ) (otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) ) )* )? otherlv_16= ']' otherlv_17= '{' ( ( (lv_internalElement_18_0= ruleInternalElement ) ) (otherlv_19= ',' ( (lv_internalElement_20_0= ruleInternalElement ) ) )* )? otherlv_21= '}' )
            {
            // InternalCAEXtext.g:1588:2: (otherlv_0= 'IH' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_iD_3_0= ruleEString ) ) )? otherlv_4= '[' (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? ( (lv_description_7_0= ruleDescription ) )? ( (lv_version_8_0= ruleVersion ) )? ( ( (lv_revision_9_0= ruleRevision ) ) (otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) ) )* )? ( (lv_copyright_12_0= ruleCopyright ) )? ( ( (lv_additionalInformation_13_0= ruleAdditionalInformation ) ) (otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) ) )* )? otherlv_16= ']' otherlv_17= '{' ( ( (lv_internalElement_18_0= ruleInternalElement ) ) (otherlv_19= ',' ( (lv_internalElement_20_0= ruleInternalElement ) ) )* )? otherlv_21= '}' )
            // InternalCAEXtext.g:1589:3: otherlv_0= 'IH' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_iD_3_0= ruleEString ) ) )? otherlv_4= '[' (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? ( (lv_description_7_0= ruleDescription ) )? ( (lv_version_8_0= ruleVersion ) )? ( ( (lv_revision_9_0= ruleRevision ) ) (otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) ) )* )? ( (lv_copyright_12_0= ruleCopyright ) )? ( ( (lv_additionalInformation_13_0= ruleAdditionalInformation ) ) (otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) ) )* )? otherlv_16= ']' otherlv_17= '{' ( ( (lv_internalElement_18_0= ruleInternalElement ) ) (otherlv_19= ',' ( (lv_internalElement_20_0= ruleInternalElement ) ) )* )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceHierarchyAccess().getIHKeyword_0());
            		
            // InternalCAEXtext.g:1593:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCAEXtext.g:1594:4: (lv_name_1_0= ruleEString )
            {
            // InternalCAEXtext.g:1594:4: (lv_name_1_0= ruleEString )
            // InternalCAEXtext.g:1595:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInstanceHierarchyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstanceHierarchyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCAEXtext.g:1612:3: (otherlv_2= ':' ( (lv_iD_3_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==35) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCAEXtext.g:1613:4: otherlv_2= ':' ( (lv_iD_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getInstanceHierarchyAccess().getColonKeyword_2_0());
                    			
                    // InternalCAEXtext.g:1617:4: ( (lv_iD_3_0= ruleEString ) )
                    // InternalCAEXtext.g:1618:5: (lv_iD_3_0= ruleEString )
                    {
                    // InternalCAEXtext.g:1618:5: (lv_iD_3_0= ruleEString )
                    // InternalCAEXtext.g:1619:6: lv_iD_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInstanceHierarchyAccess().getIDEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_iD_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceHierarchyRule());
                    						}
                    						set(
                    							current,
                    							"iD",
                    							lv_iD_3_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getInstanceHierarchyAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalCAEXtext.g:1641:3: (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==13) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCAEXtext.g:1642:4: otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getInstanceHierarchyAccess().getChangeModeKeyword_4_0());
                    			
                    // InternalCAEXtext.g:1646:4: ( (lv_changeMode_6_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:1647:5: (lv_changeMode_6_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:1647:5: (lv_changeMode_6_0= ruleChangeMode )
                    // InternalCAEXtext.g:1648:6: lv_changeMode_6_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getInstanceHierarchyAccess().getChangeModeChangeModeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_changeMode_6_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceHierarchyRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_6_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:1666:3: ( (lv_description_7_0= ruleDescription ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==20) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCAEXtext.g:1667:4: (lv_description_7_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:1667:4: (lv_description_7_0= ruleDescription )
                    // InternalCAEXtext.g:1668:5: lv_description_7_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getInstanceHierarchyAccess().getDescriptionDescriptionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_description_7_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstanceHierarchyRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"caex.caex215.CAEXtext.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:1685:3: ( (lv_version_8_0= ruleVersion ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==22) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCAEXtext.g:1686:4: (lv_version_8_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:1686:4: (lv_version_8_0= ruleVersion )
                    // InternalCAEXtext.g:1687:5: lv_version_8_0= ruleVersion
                    {

                    					newCompositeNode(grammarAccess.getInstanceHierarchyAccess().getVersionVersionParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_version_8_0=ruleVersion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstanceHierarchyRule());
                    					}
                    					set(
                    						current,
                    						"version",
                    						lv_version_8_0,
                    						"caex.caex215.CAEXtext.Version");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:1704:3: ( ( (lv_revision_9_0= ruleRevision ) ) (otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==23) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCAEXtext.g:1705:4: ( (lv_revision_9_0= ruleRevision ) ) (otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) ) )*
                    {
                    // InternalCAEXtext.g:1705:4: ( (lv_revision_9_0= ruleRevision ) )
                    // InternalCAEXtext.g:1706:5: (lv_revision_9_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:1706:5: (lv_revision_9_0= ruleRevision )
                    // InternalCAEXtext.g:1707:6: lv_revision_9_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getInstanceHierarchyAccess().getRevisionRevisionParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_revision_9_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceHierarchyRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_9_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:1724:4: (otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==14) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalCAEXtext.g:1725:5: otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getInstanceHierarchyAccess().getCommaKeyword_7_1_0());
                    	    				
                    	    // InternalCAEXtext.g:1729:5: ( (lv_revision_11_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:1730:6: (lv_revision_11_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:1730:6: (lv_revision_11_0= ruleRevision )
                    	    // InternalCAEXtext.g:1731:7: lv_revision_11_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getInstanceHierarchyAccess().getRevisionRevisionParserRuleCall_7_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_revision_11_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInstanceHierarchyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_11_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

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

            // InternalCAEXtext.g:1750:3: ( (lv_copyright_12_0= ruleCopyright ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==29) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCAEXtext.g:1751:4: (lv_copyright_12_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:1751:4: (lv_copyright_12_0= ruleCopyright )
                    // InternalCAEXtext.g:1752:5: lv_copyright_12_0= ruleCopyright
                    {

                    					newCompositeNode(grammarAccess.getInstanceHierarchyAccess().getCopyrightCopyrightParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_copyright_12_0=ruleCopyright();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstanceHierarchyRule());
                    					}
                    					set(
                    						current,
                    						"copyright",
                    						lv_copyright_12_0,
                    						"caex.caex215.CAEXtext.Copyright");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:1769:3: ( ( (lv_additionalInformation_13_0= ruleAdditionalInformation ) ) (otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) ) )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==30) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCAEXtext.g:1770:4: ( (lv_additionalInformation_13_0= ruleAdditionalInformation ) ) (otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) ) )*
                    {
                    // InternalCAEXtext.g:1770:4: ( (lv_additionalInformation_13_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:1771:5: (lv_additionalInformation_13_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:1771:5: (lv_additionalInformation_13_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:1772:6: lv_additionalInformation_13_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getInstanceHierarchyAccess().getAdditionalInformationAdditionalInformationParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_additionalInformation_13_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceHierarchyRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_13_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:1789:4: (otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==14) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalCAEXtext.g:1790:5: otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getInstanceHierarchyAccess().getCommaKeyword_9_1_0());
                    	    				
                    	    // InternalCAEXtext.g:1794:5: ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:1795:6: (lv_additionalInformation_15_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:1795:6: (lv_additionalInformation_15_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:1796:7: lv_additionalInformation_15_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getInstanceHierarchyAccess().getAdditionalInformationAdditionalInformationParserRuleCall_9_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_additionalInformation_15_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInstanceHierarchyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_15_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_16, grammarAccess.getInstanceHierarchyAccess().getRightSquareBracketKeyword_10());
            		
            otherlv_17=(Token)match(input,16,FOLLOW_49); 

            			newLeafNode(otherlv_17, grammarAccess.getInstanceHierarchyAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalCAEXtext.g:1823:3: ( ( (lv_internalElement_18_0= ruleInternalElement ) ) (otherlv_19= ',' ( (lv_internalElement_20_0= ruleInternalElement ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==46) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCAEXtext.g:1824:4: ( (lv_internalElement_18_0= ruleInternalElement ) ) (otherlv_19= ',' ( (lv_internalElement_20_0= ruleInternalElement ) ) )*
                    {
                    // InternalCAEXtext.g:1824:4: ( (lv_internalElement_18_0= ruleInternalElement ) )
                    // InternalCAEXtext.g:1825:5: (lv_internalElement_18_0= ruleInternalElement )
                    {
                    // InternalCAEXtext.g:1825:5: (lv_internalElement_18_0= ruleInternalElement )
                    // InternalCAEXtext.g:1826:6: lv_internalElement_18_0= ruleInternalElement
                    {

                    						newCompositeNode(grammarAccess.getInstanceHierarchyAccess().getInternalElementInternalElementParserRuleCall_12_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_internalElement_18_0=ruleInternalElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceHierarchyRule());
                    						}
                    						add(
                    							current,
                    							"internalElement",
                    							lv_internalElement_18_0,
                    							"caex.caex215.CAEXtext.InternalElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:1843:4: (otherlv_19= ',' ( (lv_internalElement_20_0= ruleInternalElement ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==14) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalCAEXtext.g:1844:5: otherlv_19= ',' ( (lv_internalElement_20_0= ruleInternalElement ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getInstanceHierarchyAccess().getCommaKeyword_12_1_0());
                    	    				
                    	    // InternalCAEXtext.g:1848:5: ( (lv_internalElement_20_0= ruleInternalElement ) )
                    	    // InternalCAEXtext.g:1849:6: (lv_internalElement_20_0= ruleInternalElement )
                    	    {
                    	    // InternalCAEXtext.g:1849:6: (lv_internalElement_20_0= ruleInternalElement )
                    	    // InternalCAEXtext.g:1850:7: lv_internalElement_20_0= ruleInternalElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getInstanceHierarchyAccess().getInternalElementInternalElementParserRuleCall_12_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_internalElement_20_0=ruleInternalElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInstanceHierarchyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"internalElement",
                    	    								lv_internalElement_20_0,
                    	    								"caex.caex215.CAEXtext.InternalElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getInstanceHierarchyAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceHierarchy"


    // $ANTLR start "entryRuleInterfaceClassLib"
    // InternalCAEXtext.g:1877:1: entryRuleInterfaceClassLib returns [EObject current=null] : iv_ruleInterfaceClassLib= ruleInterfaceClassLib EOF ;
    public final EObject entryRuleInterfaceClassLib() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceClassLib = null;


        try {
            // InternalCAEXtext.g:1877:58: (iv_ruleInterfaceClassLib= ruleInterfaceClassLib EOF )
            // InternalCAEXtext.g:1878:2: iv_ruleInterfaceClassLib= ruleInterfaceClassLib EOF
            {
             newCompositeNode(grammarAccess.getInterfaceClassLibRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceClassLib=ruleInterfaceClassLib();

            state._fsp--;

             current =iv_ruleInterfaceClassLib; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInterfaceClassLib"


    // $ANTLR start "ruleInterfaceClassLib"
    // InternalCAEXtext.g:1884:1: ruleInterfaceClassLib returns [EObject current=null] : (otherlv_0= 'icLib' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? ( ( (lv_interfaceClass_17_0= ruleInterfaceClass ) ) (otherlv_18= ',' ( (lv_interfaceClass_19_0= ruleInterfaceClass ) ) )* )? otherlv_20= '}' ) ;
    public final EObject ruleInterfaceClassLib() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Enumerator lv_changeMode_3_0 = null;

        AntlrDatatypeRuleToken lv_iD_5_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_description_8_0 = null;

        EObject lv_version_9_0 = null;

        EObject lv_revision_10_0 = null;

        EObject lv_revision_12_0 = null;

        EObject lv_copyright_13_0 = null;

        EObject lv_additionalInformation_14_0 = null;

        EObject lv_additionalInformation_16_0 = null;

        EObject lv_interfaceClass_17_0 = null;

        EObject lv_interfaceClass_19_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:1890:2: ( (otherlv_0= 'icLib' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? ( ( (lv_interfaceClass_17_0= ruleInterfaceClass ) ) (otherlv_18= ',' ( (lv_interfaceClass_19_0= ruleInterfaceClass ) ) )* )? otherlv_20= '}' ) )
            // InternalCAEXtext.g:1891:2: (otherlv_0= 'icLib' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? ( ( (lv_interfaceClass_17_0= ruleInterfaceClass ) ) (otherlv_18= ',' ( (lv_interfaceClass_19_0= ruleInterfaceClass ) ) )* )? otherlv_20= '}' )
            {
            // InternalCAEXtext.g:1891:2: (otherlv_0= 'icLib' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? ( ( (lv_interfaceClass_17_0= ruleInterfaceClass ) ) (otherlv_18= ',' ( (lv_interfaceClass_19_0= ruleInterfaceClass ) ) )* )? otherlv_20= '}' )
            // InternalCAEXtext.g:1892:3: otherlv_0= 'icLib' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? ( ( (lv_interfaceClass_17_0= ruleInterfaceClass ) ) (otherlv_18= ',' ( (lv_interfaceClass_19_0= ruleInterfaceClass ) ) )* )? otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceClassLibAccess().getIcLibKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceClassLibAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCAEXtext.g:1900:3: (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==13) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalCAEXtext.g:1901:4: otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getInterfaceClassLibAccess().getChangeModeKeyword_2_0());
                    			
                    // InternalCAEXtext.g:1905:4: ( (lv_changeMode_3_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:1906:5: (lv_changeMode_3_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:1906:5: (lv_changeMode_3_0= ruleChangeMode )
                    // InternalCAEXtext.g:1907:6: lv_changeMode_3_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getInterfaceClassLibAccess().getChangeModeChangeModeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_changeMode_3_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceClassLibRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_3_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:1925:3: (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==37) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalCAEXtext.g:1926:4: otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterfaceClassLibAccess().getIDKeyword_3_0());
                    			
                    // InternalCAEXtext.g:1930:4: ( (lv_iD_5_0= ruleEString ) )
                    // InternalCAEXtext.g:1931:5: (lv_iD_5_0= ruleEString )
                    {
                    // InternalCAEXtext.g:1931:5: (lv_iD_5_0= ruleEString )
                    // InternalCAEXtext.g:1932:6: lv_iD_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInterfaceClassLibAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_iD_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceClassLibRule());
                    						}
                    						set(
                    							current,
                    							"iD",
                    							lv_iD_5_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getInterfaceClassLibAccess().getNameKeyword_4());
            		
            // InternalCAEXtext.g:1954:3: ( (lv_name_7_0= ruleEString ) )
            // InternalCAEXtext.g:1955:4: (lv_name_7_0= ruleEString )
            {
            // InternalCAEXtext.g:1955:4: (lv_name_7_0= ruleEString )
            // InternalCAEXtext.g:1956:5: lv_name_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterfaceClassLibAccess().getNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_54);
            lv_name_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterfaceClassLibRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCAEXtext.g:1973:3: ( (lv_description_8_0= ruleDescription ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==20) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCAEXtext.g:1974:4: (lv_description_8_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:1974:4: (lv_description_8_0= ruleDescription )
                    // InternalCAEXtext.g:1975:5: lv_description_8_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getInterfaceClassLibAccess().getDescriptionDescriptionParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_55);
                    lv_description_8_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInterfaceClassLibRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_8_0,
                    						"caex.caex215.CAEXtext.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:1992:3: ( (lv_version_9_0= ruleVersion ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==22) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalCAEXtext.g:1993:4: (lv_version_9_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:1993:4: (lv_version_9_0= ruleVersion )
                    // InternalCAEXtext.g:1994:5: lv_version_9_0= ruleVersion
                    {

                    					newCompositeNode(grammarAccess.getInterfaceClassLibAccess().getVersionVersionParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_56);
                    lv_version_9_0=ruleVersion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInterfaceClassLibRule());
                    					}
                    					set(
                    						current,
                    						"version",
                    						lv_version_9_0,
                    						"caex.caex215.CAEXtext.Version");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:2011:3: ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==23) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalCAEXtext.g:2012:4: ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )*
                    {
                    // InternalCAEXtext.g:2012:4: ( (lv_revision_10_0= ruleRevision ) )
                    // InternalCAEXtext.g:2013:5: (lv_revision_10_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:2013:5: (lv_revision_10_0= ruleRevision )
                    // InternalCAEXtext.g:2014:6: lv_revision_10_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getInterfaceClassLibAccess().getRevisionRevisionParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_revision_10_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceClassLibRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_10_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:2031:4: (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==14) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalCAEXtext.g:2032:5: otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getInterfaceClassLibAccess().getCommaKeyword_8_1_0());
                    	    				
                    	    // InternalCAEXtext.g:2036:5: ( (lv_revision_12_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:2037:6: (lv_revision_12_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:2037:6: (lv_revision_12_0= ruleRevision )
                    	    // InternalCAEXtext.g:2038:7: lv_revision_12_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceClassLibAccess().getRevisionRevisionParserRuleCall_8_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_57);
                    	    lv_revision_12_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceClassLibRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_12_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCAEXtext.g:2057:3: ( (lv_copyright_13_0= ruleCopyright ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==29) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalCAEXtext.g:2058:4: (lv_copyright_13_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:2058:4: (lv_copyright_13_0= ruleCopyright )
                    // InternalCAEXtext.g:2059:5: lv_copyright_13_0= ruleCopyright
                    {

                    					newCompositeNode(grammarAccess.getInterfaceClassLibAccess().getCopyrightCopyrightParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_58);
                    lv_copyright_13_0=ruleCopyright();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInterfaceClassLibRule());
                    					}
                    					set(
                    						current,
                    						"copyright",
                    						lv_copyright_13_0,
                    						"caex.caex215.CAEXtext.Copyright");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:2076:3: ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==30) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalCAEXtext.g:2077:4: ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )*
                    {
                    // InternalCAEXtext.g:2077:4: ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:2078:5: (lv_additionalInformation_14_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:2078:5: (lv_additionalInformation_14_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:2079:6: lv_additionalInformation_14_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getInterfaceClassLibAccess().getAdditionalInformationAdditionalInformationParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_additionalInformation_14_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceClassLibRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_14_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:2096:4: (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==14) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalCAEXtext.g:2097:5: otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getInterfaceClassLibAccess().getCommaKeyword_10_1_0());
                    	    				
                    	    // InternalCAEXtext.g:2101:5: ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:2102:6: (lv_additionalInformation_16_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:2102:6: (lv_additionalInformation_16_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:2103:7: lv_additionalInformation_16_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceClassLibAccess().getAdditionalInformationAdditionalInformationParserRuleCall_10_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_59);
                    	    lv_additionalInformation_16_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceClassLibRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_16_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCAEXtext.g:2122:3: ( ( (lv_interfaceClass_17_0= ruleInterfaceClass ) ) (otherlv_18= ',' ( (lv_interfaceClass_19_0= ruleInterfaceClass ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==58||LA68_0==98) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalCAEXtext.g:2123:4: ( (lv_interfaceClass_17_0= ruleInterfaceClass ) ) (otherlv_18= ',' ( (lv_interfaceClass_19_0= ruleInterfaceClass ) ) )*
                    {
                    // InternalCAEXtext.g:2123:4: ( (lv_interfaceClass_17_0= ruleInterfaceClass ) )
                    // InternalCAEXtext.g:2124:5: (lv_interfaceClass_17_0= ruleInterfaceClass )
                    {
                    // InternalCAEXtext.g:2124:5: (lv_interfaceClass_17_0= ruleInterfaceClass )
                    // InternalCAEXtext.g:2125:6: lv_interfaceClass_17_0= ruleInterfaceClass
                    {

                    						newCompositeNode(grammarAccess.getInterfaceClassLibAccess().getInterfaceClassInterfaceClassParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_interfaceClass_17_0=ruleInterfaceClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceClassLibRule());
                    						}
                    						add(
                    							current,
                    							"interfaceClass",
                    							lv_interfaceClass_17_0,
                    							"caex.caex215.CAEXtext.InterfaceClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:2142:4: (otherlv_18= ',' ( (lv_interfaceClass_19_0= ruleInterfaceClass ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==14) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalCAEXtext.g:2143:5: otherlv_18= ',' ( (lv_interfaceClass_19_0= ruleInterfaceClass ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_60); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getInterfaceClassLibAccess().getCommaKeyword_11_1_0());
                    	    				
                    	    // InternalCAEXtext.g:2147:5: ( (lv_interfaceClass_19_0= ruleInterfaceClass ) )
                    	    // InternalCAEXtext.g:2148:6: (lv_interfaceClass_19_0= ruleInterfaceClass )
                    	    {
                    	    // InternalCAEXtext.g:2148:6: (lv_interfaceClass_19_0= ruleInterfaceClass )
                    	    // InternalCAEXtext.g:2149:7: lv_interfaceClass_19_0= ruleInterfaceClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceClassLibAccess().getInterfaceClassInterfaceClassParserRuleCall_11_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_interfaceClass_19_0=ruleInterfaceClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceClassLibRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaceClass",
                    	    								lv_interfaceClass_19_0,
                    	    								"caex.caex215.CAEXtext.InterfaceClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_20=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getInterfaceClassLibAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceClassLib"


    // $ANTLR start "entryRuleRoleClassLib"
    // InternalCAEXtext.g:2176:1: entryRuleRoleClassLib returns [EObject current=null] : iv_ruleRoleClassLib= ruleRoleClassLib EOF ;
    public final EObject entryRuleRoleClassLib() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleClassLib = null;


        try {
            // InternalCAEXtext.g:2176:53: (iv_ruleRoleClassLib= ruleRoleClassLib EOF )
            // InternalCAEXtext.g:2177:2: iv_ruleRoleClassLib= ruleRoleClassLib EOF
            {
             newCompositeNode(grammarAccess.getRoleClassLibRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleClassLib=ruleRoleClassLib();

            state._fsp--;

             current =iv_ruleRoleClassLib; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoleClassLib"


    // $ANTLR start "ruleRoleClassLib"
    // InternalCAEXtext.g:2183:1: ruleRoleClassLib returns [EObject current=null] : (otherlv_0= 'rcLib' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? ( ( (lv_roleClass_17_0= ruleRoleClass ) ) (otherlv_18= ',' ( (lv_roleClass_19_0= ruleRoleClass ) ) )* )? otherlv_20= '}' ) ;
    public final EObject ruleRoleClassLib() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Enumerator lv_changeMode_3_0 = null;

        AntlrDatatypeRuleToken lv_iD_5_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_description_8_0 = null;

        EObject lv_version_9_0 = null;

        EObject lv_revision_10_0 = null;

        EObject lv_revision_12_0 = null;

        EObject lv_copyright_13_0 = null;

        EObject lv_additionalInformation_14_0 = null;

        EObject lv_additionalInformation_16_0 = null;

        EObject lv_roleClass_17_0 = null;

        EObject lv_roleClass_19_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:2189:2: ( (otherlv_0= 'rcLib' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? ( ( (lv_roleClass_17_0= ruleRoleClass ) ) (otherlv_18= ',' ( (lv_roleClass_19_0= ruleRoleClass ) ) )* )? otherlv_20= '}' ) )
            // InternalCAEXtext.g:2190:2: (otherlv_0= 'rcLib' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? ( ( (lv_roleClass_17_0= ruleRoleClass ) ) (otherlv_18= ',' ( (lv_roleClass_19_0= ruleRoleClass ) ) )* )? otherlv_20= '}' )
            {
            // InternalCAEXtext.g:2190:2: (otherlv_0= 'rcLib' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? ( ( (lv_roleClass_17_0= ruleRoleClass ) ) (otherlv_18= ',' ( (lv_roleClass_19_0= ruleRoleClass ) ) )* )? otherlv_20= '}' )
            // InternalCAEXtext.g:2191:3: otherlv_0= 'rcLib' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? ( ( (lv_roleClass_17_0= ruleRoleClass ) ) (otherlv_18= ',' ( (lv_roleClass_19_0= ruleRoleClass ) ) )* )? otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleClassLibAccess().getRcLibKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleClassLibAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCAEXtext.g:2199:3: (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==13) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalCAEXtext.g:2200:4: otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getRoleClassLibAccess().getChangeModeKeyword_2_0());
                    			
                    // InternalCAEXtext.g:2204:4: ( (lv_changeMode_3_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:2205:5: (lv_changeMode_3_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:2205:5: (lv_changeMode_3_0= ruleChangeMode )
                    // InternalCAEXtext.g:2206:6: lv_changeMode_3_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getRoleClassLibAccess().getChangeModeChangeModeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_changeMode_3_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleClassLibRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_3_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:2224:3: (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==37) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalCAEXtext.g:2225:4: otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getRoleClassLibAccess().getIDKeyword_3_0());
                    			
                    // InternalCAEXtext.g:2229:4: ( (lv_iD_5_0= ruleEString ) )
                    // InternalCAEXtext.g:2230:5: (lv_iD_5_0= ruleEString )
                    {
                    // InternalCAEXtext.g:2230:5: (lv_iD_5_0= ruleEString )
                    // InternalCAEXtext.g:2231:6: lv_iD_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRoleClassLibAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_iD_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleClassLibRule());
                    						}
                    						set(
                    							current,
                    							"iD",
                    							lv_iD_5_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getRoleClassLibAccess().getNameKeyword_4());
            		
            // InternalCAEXtext.g:2253:3: ( (lv_name_7_0= ruleEString ) )
            // InternalCAEXtext.g:2254:4: (lv_name_7_0= ruleEString )
            {
            // InternalCAEXtext.g:2254:4: (lv_name_7_0= ruleEString )
            // InternalCAEXtext.g:2255:5: lv_name_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleClassLibAccess().getNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_61);
            lv_name_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleClassLibRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCAEXtext.g:2272:3: ( (lv_description_8_0= ruleDescription ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==20) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalCAEXtext.g:2273:4: (lv_description_8_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:2273:4: (lv_description_8_0= ruleDescription )
                    // InternalCAEXtext.g:2274:5: lv_description_8_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getRoleClassLibAccess().getDescriptionDescriptionParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_62);
                    lv_description_8_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRoleClassLibRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_8_0,
                    						"caex.caex215.CAEXtext.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:2291:3: ( (lv_version_9_0= ruleVersion ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==22) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalCAEXtext.g:2292:4: (lv_version_9_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:2292:4: (lv_version_9_0= ruleVersion )
                    // InternalCAEXtext.g:2293:5: lv_version_9_0= ruleVersion
                    {

                    					newCompositeNode(grammarAccess.getRoleClassLibAccess().getVersionVersionParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_63);
                    lv_version_9_0=ruleVersion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRoleClassLibRule());
                    					}
                    					set(
                    						current,
                    						"version",
                    						lv_version_9_0,
                    						"caex.caex215.CAEXtext.Version");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:2310:3: ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==23) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalCAEXtext.g:2311:4: ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )*
                    {
                    // InternalCAEXtext.g:2311:4: ( (lv_revision_10_0= ruleRevision ) )
                    // InternalCAEXtext.g:2312:5: (lv_revision_10_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:2312:5: (lv_revision_10_0= ruleRevision )
                    // InternalCAEXtext.g:2313:6: lv_revision_10_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getRoleClassLibAccess().getRevisionRevisionParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_revision_10_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleClassLibRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_10_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:2330:4: (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==14) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalCAEXtext.g:2331:5: otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getRoleClassLibAccess().getCommaKeyword_8_1_0());
                    	    				
                    	    // InternalCAEXtext.g:2335:5: ( (lv_revision_12_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:2336:6: (lv_revision_12_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:2336:6: (lv_revision_12_0= ruleRevision )
                    	    // InternalCAEXtext.g:2337:7: lv_revision_12_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleClassLibAccess().getRevisionRevisionParserRuleCall_8_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_64);
                    	    lv_revision_12_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoleClassLibRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_12_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCAEXtext.g:2356:3: ( (lv_copyright_13_0= ruleCopyright ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==29) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalCAEXtext.g:2357:4: (lv_copyright_13_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:2357:4: (lv_copyright_13_0= ruleCopyright )
                    // InternalCAEXtext.g:2358:5: lv_copyright_13_0= ruleCopyright
                    {

                    					newCompositeNode(grammarAccess.getRoleClassLibAccess().getCopyrightCopyrightParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_65);
                    lv_copyright_13_0=ruleCopyright();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRoleClassLibRule());
                    					}
                    					set(
                    						current,
                    						"copyright",
                    						lv_copyright_13_0,
                    						"caex.caex215.CAEXtext.Copyright");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:2375:3: ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==30) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalCAEXtext.g:2376:4: ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )*
                    {
                    // InternalCAEXtext.g:2376:4: ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:2377:5: (lv_additionalInformation_14_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:2377:5: (lv_additionalInformation_14_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:2378:6: lv_additionalInformation_14_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getRoleClassLibAccess().getAdditionalInformationAdditionalInformationParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_additionalInformation_14_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleClassLibRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_14_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:2395:4: (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==14) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalCAEXtext.g:2396:5: otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getRoleClassLibAccess().getCommaKeyword_10_1_0());
                    	    				
                    	    // InternalCAEXtext.g:2400:5: ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:2401:6: (lv_additionalInformation_16_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:2401:6: (lv_additionalInformation_16_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:2402:7: lv_additionalInformation_16_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleClassLibAccess().getAdditionalInformationAdditionalInformationParserRuleCall_10_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_66);
                    	    lv_additionalInformation_16_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoleClassLibRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_16_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCAEXtext.g:2421:3: ( ( (lv_roleClass_17_0= ruleRoleClass ) ) (otherlv_18= ',' ( (lv_roleClass_19_0= ruleRoleClass ) ) )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==99) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalCAEXtext.g:2422:4: ( (lv_roleClass_17_0= ruleRoleClass ) ) (otherlv_18= ',' ( (lv_roleClass_19_0= ruleRoleClass ) ) )*
                    {
                    // InternalCAEXtext.g:2422:4: ( (lv_roleClass_17_0= ruleRoleClass ) )
                    // InternalCAEXtext.g:2423:5: (lv_roleClass_17_0= ruleRoleClass )
                    {
                    // InternalCAEXtext.g:2423:5: (lv_roleClass_17_0= ruleRoleClass )
                    // InternalCAEXtext.g:2424:6: lv_roleClass_17_0= ruleRoleClass
                    {

                    						newCompositeNode(grammarAccess.getRoleClassLibAccess().getRoleClassRoleClassParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_roleClass_17_0=ruleRoleClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleClassLibRule());
                    						}
                    						add(
                    							current,
                    							"roleClass",
                    							lv_roleClass_17_0,
                    							"caex.caex215.CAEXtext.RoleClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:2441:4: (otherlv_18= ',' ( (lv_roleClass_19_0= ruleRoleClass ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==14) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalCAEXtext.g:2442:5: otherlv_18= ',' ( (lv_roleClass_19_0= ruleRoleClass ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_67); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getRoleClassLibAccess().getCommaKeyword_11_1_0());
                    	    				
                    	    // InternalCAEXtext.g:2446:5: ( (lv_roleClass_19_0= ruleRoleClass ) )
                    	    // InternalCAEXtext.g:2447:6: (lv_roleClass_19_0= ruleRoleClass )
                    	    {
                    	    // InternalCAEXtext.g:2447:6: (lv_roleClass_19_0= ruleRoleClass )
                    	    // InternalCAEXtext.g:2448:7: lv_roleClass_19_0= ruleRoleClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleClassLibAccess().getRoleClassRoleClassParserRuleCall_11_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_roleClass_19_0=ruleRoleClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoleClassLibRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"roleClass",
                    	    								lv_roleClass_19_0,
                    	    								"caex.caex215.CAEXtext.RoleClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_20=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getRoleClassLibAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoleClassLib"


    // $ANTLR start "entryRuleSystemUnitClassLib"
    // InternalCAEXtext.g:2475:1: entryRuleSystemUnitClassLib returns [EObject current=null] : iv_ruleSystemUnitClassLib= ruleSystemUnitClassLib EOF ;
    public final EObject entryRuleSystemUnitClassLib() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemUnitClassLib = null;


        try {
            // InternalCAEXtext.g:2475:59: (iv_ruleSystemUnitClassLib= ruleSystemUnitClassLib EOF )
            // InternalCAEXtext.g:2476:2: iv_ruleSystemUnitClassLib= ruleSystemUnitClassLib EOF
            {
             newCompositeNode(grammarAccess.getSystemUnitClassLibRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemUnitClassLib=ruleSystemUnitClassLib();

            state._fsp--;

             current =iv_ruleSystemUnitClassLib; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSystemUnitClassLib"


    // $ANTLR start "ruleSystemUnitClassLib"
    // InternalCAEXtext.g:2482:1: ruleSystemUnitClassLib returns [EObject current=null] : (otherlv_0= 'sucLib' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? ( ( (lv_systemUnitClass_17_0= ruleSystemUnitClass ) ) (otherlv_18= ',' ( (lv_systemUnitClass_19_0= ruleSystemUnitClass ) ) )* )? otherlv_20= '}' ) ;
    public final EObject ruleSystemUnitClassLib() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Enumerator lv_changeMode_3_0 = null;

        AntlrDatatypeRuleToken lv_iD_5_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_description_8_0 = null;

        EObject lv_version_9_0 = null;

        EObject lv_revision_10_0 = null;

        EObject lv_revision_12_0 = null;

        EObject lv_copyright_13_0 = null;

        EObject lv_additionalInformation_14_0 = null;

        EObject lv_additionalInformation_16_0 = null;

        EObject lv_systemUnitClass_17_0 = null;

        EObject lv_systemUnitClass_19_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:2488:2: ( (otherlv_0= 'sucLib' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? ( ( (lv_systemUnitClass_17_0= ruleSystemUnitClass ) ) (otherlv_18= ',' ( (lv_systemUnitClass_19_0= ruleSystemUnitClass ) ) )* )? otherlv_20= '}' ) )
            // InternalCAEXtext.g:2489:2: (otherlv_0= 'sucLib' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? ( ( (lv_systemUnitClass_17_0= ruleSystemUnitClass ) ) (otherlv_18= ',' ( (lv_systemUnitClass_19_0= ruleSystemUnitClass ) ) )* )? otherlv_20= '}' )
            {
            // InternalCAEXtext.g:2489:2: (otherlv_0= 'sucLib' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? ( ( (lv_systemUnitClass_17_0= ruleSystemUnitClass ) ) (otherlv_18= ',' ( (lv_systemUnitClass_19_0= ruleSystemUnitClass ) ) )* )? otherlv_20= '}' )
            // InternalCAEXtext.g:2490:3: otherlv_0= 'sucLib' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) ( (lv_description_8_0= ruleDescription ) )? ( (lv_version_9_0= ruleVersion ) )? ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )? ( (lv_copyright_13_0= ruleCopyright ) )? ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )? ( ( (lv_systemUnitClass_17_0= ruleSystemUnitClass ) ) (otherlv_18= ',' ( (lv_systemUnitClass_19_0= ruleSystemUnitClass ) ) )* )? otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemUnitClassLibAccess().getSucLibKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemUnitClassLibAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCAEXtext.g:2498:3: (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==13) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalCAEXtext.g:2499:4: otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getSystemUnitClassLibAccess().getChangeModeKeyword_2_0());
                    			
                    // InternalCAEXtext.g:2503:4: ( (lv_changeMode_3_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:2504:5: (lv_changeMode_3_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:2504:5: (lv_changeMode_3_0= ruleChangeMode )
                    // InternalCAEXtext.g:2505:6: lv_changeMode_3_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClassLibAccess().getChangeModeChangeModeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_changeMode_3_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClassLibRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_3_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:2523:3: (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==37) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalCAEXtext.g:2524:4: otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getSystemUnitClassLibAccess().getIDKeyword_3_0());
                    			
                    // InternalCAEXtext.g:2528:4: ( (lv_iD_5_0= ruleEString ) )
                    // InternalCAEXtext.g:2529:5: (lv_iD_5_0= ruleEString )
                    {
                    // InternalCAEXtext.g:2529:5: (lv_iD_5_0= ruleEString )
                    // InternalCAEXtext.g:2530:6: lv_iD_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClassLibAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_iD_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClassLibRule());
                    						}
                    						set(
                    							current,
                    							"iD",
                    							lv_iD_5_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getSystemUnitClassLibAccess().getNameKeyword_4());
            		
            // InternalCAEXtext.g:2552:3: ( (lv_name_7_0= ruleEString ) )
            // InternalCAEXtext.g:2553:4: (lv_name_7_0= ruleEString )
            {
            // InternalCAEXtext.g:2553:4: (lv_name_7_0= ruleEString )
            // InternalCAEXtext.g:2554:5: lv_name_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSystemUnitClassLibAccess().getNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_68);
            lv_name_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemUnitClassLibRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCAEXtext.g:2571:3: ( (lv_description_8_0= ruleDescription ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==20) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalCAEXtext.g:2572:4: (lv_description_8_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:2572:4: (lv_description_8_0= ruleDescription )
                    // InternalCAEXtext.g:2573:5: lv_description_8_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getSystemUnitClassLibAccess().getDescriptionDescriptionParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_69);
                    lv_description_8_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSystemUnitClassLibRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_8_0,
                    						"caex.caex215.CAEXtext.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:2590:3: ( (lv_version_9_0= ruleVersion ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==22) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalCAEXtext.g:2591:4: (lv_version_9_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:2591:4: (lv_version_9_0= ruleVersion )
                    // InternalCAEXtext.g:2592:5: lv_version_9_0= ruleVersion
                    {

                    					newCompositeNode(grammarAccess.getSystemUnitClassLibAccess().getVersionVersionParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_70);
                    lv_version_9_0=ruleVersion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSystemUnitClassLibRule());
                    					}
                    					set(
                    						current,
                    						"version",
                    						lv_version_9_0,
                    						"caex.caex215.CAEXtext.Version");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:2609:3: ( ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==23) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalCAEXtext.g:2610:4: ( (lv_revision_10_0= ruleRevision ) ) (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )*
                    {
                    // InternalCAEXtext.g:2610:4: ( (lv_revision_10_0= ruleRevision ) )
                    // InternalCAEXtext.g:2611:5: (lv_revision_10_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:2611:5: (lv_revision_10_0= ruleRevision )
                    // InternalCAEXtext.g:2612:6: lv_revision_10_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClassLibAccess().getRevisionRevisionParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_71);
                    lv_revision_10_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClassLibRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_10_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:2629:4: (otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==14) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalCAEXtext.g:2630:5: otherlv_11= ',' ( (lv_revision_12_0= ruleRevision ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getSystemUnitClassLibAccess().getCommaKeyword_8_1_0());
                    	    				
                    	    // InternalCAEXtext.g:2634:5: ( (lv_revision_12_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:2635:6: (lv_revision_12_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:2635:6: (lv_revision_12_0= ruleRevision )
                    	    // InternalCAEXtext.g:2636:7: lv_revision_12_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemUnitClassLibAccess().getRevisionRevisionParserRuleCall_8_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_71);
                    	    lv_revision_12_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemUnitClassLibRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_12_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCAEXtext.g:2655:3: ( (lv_copyright_13_0= ruleCopyright ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==29) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalCAEXtext.g:2656:4: (lv_copyright_13_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:2656:4: (lv_copyright_13_0= ruleCopyright )
                    // InternalCAEXtext.g:2657:5: lv_copyright_13_0= ruleCopyright
                    {

                    					newCompositeNode(grammarAccess.getSystemUnitClassLibAccess().getCopyrightCopyrightParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_72);
                    lv_copyright_13_0=ruleCopyright();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSystemUnitClassLibRule());
                    					}
                    					set(
                    						current,
                    						"copyright",
                    						lv_copyright_13_0,
                    						"caex.caex215.CAEXtext.Copyright");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:2674:3: ( ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )* )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==30) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalCAEXtext.g:2675:4: ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) ) (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )*
                    {
                    // InternalCAEXtext.g:2675:4: ( (lv_additionalInformation_14_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:2676:5: (lv_additionalInformation_14_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:2676:5: (lv_additionalInformation_14_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:2677:6: lv_additionalInformation_14_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClassLibAccess().getAdditionalInformationAdditionalInformationParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_73);
                    lv_additionalInformation_14_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClassLibRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_14_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:2694:4: (otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==14) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalCAEXtext.g:2695:5: otherlv_15= ',' ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getSystemUnitClassLibAccess().getCommaKeyword_10_1_0());
                    	    				
                    	    // InternalCAEXtext.g:2699:5: ( (lv_additionalInformation_16_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:2700:6: (lv_additionalInformation_16_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:2700:6: (lv_additionalInformation_16_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:2701:7: lv_additionalInformation_16_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemUnitClassLibAccess().getAdditionalInformationAdditionalInformationParserRuleCall_10_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_73);
                    	    lv_additionalInformation_16_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemUnitClassLibRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_16_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCAEXtext.g:2720:3: ( ( (lv_systemUnitClass_17_0= ruleSystemUnitClass ) ) (otherlv_18= ',' ( (lv_systemUnitClass_19_0= ruleSystemUnitClass ) ) )* )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==46||LA90_0==75) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalCAEXtext.g:2721:4: ( (lv_systemUnitClass_17_0= ruleSystemUnitClass ) ) (otherlv_18= ',' ( (lv_systemUnitClass_19_0= ruleSystemUnitClass ) ) )*
                    {
                    // InternalCAEXtext.g:2721:4: ( (lv_systemUnitClass_17_0= ruleSystemUnitClass ) )
                    // InternalCAEXtext.g:2722:5: (lv_systemUnitClass_17_0= ruleSystemUnitClass )
                    {
                    // InternalCAEXtext.g:2722:5: (lv_systemUnitClass_17_0= ruleSystemUnitClass )
                    // InternalCAEXtext.g:2723:6: lv_systemUnitClass_17_0= ruleSystemUnitClass
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClassLibAccess().getSystemUnitClassSystemUnitClassParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_systemUnitClass_17_0=ruleSystemUnitClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClassLibRule());
                    						}
                    						add(
                    							current,
                    							"systemUnitClass",
                    							lv_systemUnitClass_17_0,
                    							"caex.caex215.CAEXtext.SystemUnitClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:2740:4: (otherlv_18= ',' ( (lv_systemUnitClass_19_0= ruleSystemUnitClass ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==14) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalCAEXtext.g:2741:5: otherlv_18= ',' ( (lv_systemUnitClass_19_0= ruleSystemUnitClass ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_74); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getSystemUnitClassLibAccess().getCommaKeyword_11_1_0());
                    	    				
                    	    // InternalCAEXtext.g:2745:5: ( (lv_systemUnitClass_19_0= ruleSystemUnitClass ) )
                    	    // InternalCAEXtext.g:2746:6: (lv_systemUnitClass_19_0= ruleSystemUnitClass )
                    	    {
                    	    // InternalCAEXtext.g:2746:6: (lv_systemUnitClass_19_0= ruleSystemUnitClass )
                    	    // InternalCAEXtext.g:2747:7: lv_systemUnitClass_19_0= ruleSystemUnitClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemUnitClassLibAccess().getSystemUnitClassSystemUnitClassParserRuleCall_11_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_systemUnitClass_19_0=ruleSystemUnitClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemUnitClassLibRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"systemUnitClass",
                    	    								lv_systemUnitClass_19_0,
                    	    								"caex.caex215.CAEXtext.SystemUnitClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_20=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getSystemUnitClassLibAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemUnitClassLib"


    // $ANTLR start "entryRuleDateTime"
    // InternalCAEXtext.g:2774:1: entryRuleDateTime returns [String current=null] : iv_ruleDateTime= ruleDateTime EOF ;
    public final String entryRuleDateTime() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime = null;


        try {
            // InternalCAEXtext.g:2774:48: (iv_ruleDateTime= ruleDateTime EOF )
            // InternalCAEXtext.g:2775:2: iv_ruleDateTime= ruleDateTime EOF
            {
             newCompositeNode(grammarAccess.getDateTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateTime=ruleDateTime();

            state._fsp--;

             current =iv_ruleDateTime.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDateTime"


    // $ANTLR start "ruleDateTime"
    // InternalCAEXtext.g:2781:1: ruleDateTime returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DateTime' ;
    public final AntlrDatatypeRuleToken ruleDateTime() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCAEXtext.g:2787:2: (kw= 'DateTime' )
            // InternalCAEXtext.g:2788:2: kw= 'DateTime'
            {
            kw=(Token)match(input,41,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDateTimeAccess().getDateTimeKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateTime"


    // $ANTLR start "entryRuleEString"
    // InternalCAEXtext.g:2796:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCAEXtext.g:2796:47: (iv_ruleEString= ruleEString EOF )
            // InternalCAEXtext.g:2797:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCAEXtext.g:2803:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCAEXtext.g:2809:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCAEXtext.g:2810:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCAEXtext.g:2810:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_STRING) ) {
                alt91=1;
            }
            else if ( (LA91_0==RULE_ID) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalCAEXtext.g:2811:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCAEXtext.g:2819:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleGenericElement"
    // InternalCAEXtext.g:2830:1: entryRuleGenericElement returns [EObject current=null] : iv_ruleGenericElement= ruleGenericElement EOF ;
    public final EObject entryRuleGenericElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericElement = null;


        try {
            // InternalCAEXtext.g:2830:55: (iv_ruleGenericElement= ruleGenericElement EOF )
            // InternalCAEXtext.g:2831:2: iv_ruleGenericElement= ruleGenericElement EOF
            {
             newCompositeNode(grammarAccess.getGenericElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenericElement=ruleGenericElement();

            state._fsp--;

             current =iv_ruleGenericElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGenericElement"


    // $ANTLR start "ruleGenericElement"
    // InternalCAEXtext.g:2837:1: ruleGenericElement returns [EObject current=null] : ( () otherlv_1= 'Element' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? (otherlv_6= 'nestedElements' otherlv_7= '{' ( (lv_nestedElements_8_0= ruleGenericElement ) ) (otherlv_9= ',' ( (lv_nestedElements_10_0= ruleGenericElement ) ) )* otherlv_11= '}' )? (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleGenericAttribute ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleGenericAttribute ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleGenericElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        EObject lv_nestedElements_8_0 = null;

        EObject lv_nestedElements_10_0 = null;

        EObject lv_attributes_14_0 = null;

        EObject lv_attributes_16_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:2843:2: ( ( () otherlv_1= 'Element' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? (otherlv_6= 'nestedElements' otherlv_7= '{' ( (lv_nestedElements_8_0= ruleGenericElement ) ) (otherlv_9= ',' ( (lv_nestedElements_10_0= ruleGenericElement ) ) )* otherlv_11= '}' )? (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleGenericAttribute ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleGenericAttribute ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalCAEXtext.g:2844:2: ( () otherlv_1= 'Element' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? (otherlv_6= 'nestedElements' otherlv_7= '{' ( (lv_nestedElements_8_0= ruleGenericElement ) ) (otherlv_9= ',' ( (lv_nestedElements_10_0= ruleGenericElement ) ) )* otherlv_11= '}' )? (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleGenericAttribute ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleGenericAttribute ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalCAEXtext.g:2844:2: ( () otherlv_1= 'Element' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? (otherlv_6= 'nestedElements' otherlv_7= '{' ( (lv_nestedElements_8_0= ruleGenericElement ) ) (otherlv_9= ',' ( (lv_nestedElements_10_0= ruleGenericElement ) ) )* otherlv_11= '}' )? (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleGenericAttribute ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleGenericAttribute ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalCAEXtext.g:2845:3: () otherlv_1= 'Element' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )? (otherlv_6= 'nestedElements' otherlv_7= '{' ( (lv_nestedElements_8_0= ruleGenericElement ) ) (otherlv_9= ',' ( (lv_nestedElements_10_0= ruleGenericElement ) ) )* otherlv_11= '}' )? (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleGenericAttribute ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleGenericAttribute ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalCAEXtext.g:2845:3: ()
            // InternalCAEXtext.g:2846:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenericElementAccess().getGenericElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getGenericElementAccess().getElementKeyword_1());
            		
            // InternalCAEXtext.g:2856:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCAEXtext.g:2857:4: (lv_name_2_0= ruleEString )
            {
            // InternalCAEXtext.g:2857:4: (lv_name_2_0= ruleEString )
            // InternalCAEXtext.g:2858:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGenericElementAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenericElementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_75); 

            			newLeafNode(otherlv_3, grammarAccess.getGenericElementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCAEXtext.g:2879:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==21) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalCAEXtext.g:2880:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getGenericElementAccess().getValueKeyword_4_0());
                    			
                    // InternalCAEXtext.g:2884:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalCAEXtext.g:2885:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalCAEXtext.g:2885:5: (lv_value_5_0= ruleEString )
                    // InternalCAEXtext.g:2886:6: lv_value_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGenericElementAccess().getValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    lv_value_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGenericElementRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:2904:3: (otherlv_6= 'nestedElements' otherlv_7= '{' ( (lv_nestedElements_8_0= ruleGenericElement ) ) (otherlv_9= ',' ( (lv_nestedElements_10_0= ruleGenericElement ) ) )* otherlv_11= '}' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==43) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalCAEXtext.g:2905:4: otherlv_6= 'nestedElements' otherlv_7= '{' ( (lv_nestedElements_8_0= ruleGenericElement ) ) (otherlv_9= ',' ( (lv_nestedElements_10_0= ruleGenericElement ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getGenericElementAccess().getNestedElementsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,16,FOLLOW_77); 

                    				newLeafNode(otherlv_7, grammarAccess.getGenericElementAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCAEXtext.g:2913:4: ( (lv_nestedElements_8_0= ruleGenericElement ) )
                    // InternalCAEXtext.g:2914:5: (lv_nestedElements_8_0= ruleGenericElement )
                    {
                    // InternalCAEXtext.g:2914:5: (lv_nestedElements_8_0= ruleGenericElement )
                    // InternalCAEXtext.g:2915:6: lv_nestedElements_8_0= ruleGenericElement
                    {

                    						newCompositeNode(grammarAccess.getGenericElementAccess().getNestedElementsGenericElementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_nestedElements_8_0=ruleGenericElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGenericElementRule());
                    						}
                    						add(
                    							current,
                    							"nestedElements",
                    							lv_nestedElements_8_0,
                    							"caex.caex215.CAEXtext.GenericElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:2932:4: (otherlv_9= ',' ( (lv_nestedElements_10_0= ruleGenericElement ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==14) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalCAEXtext.g:2933:5: otherlv_9= ',' ( (lv_nestedElements_10_0= ruleGenericElement ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_77); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getGenericElementAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCAEXtext.g:2937:5: ( (lv_nestedElements_10_0= ruleGenericElement ) )
                    	    // InternalCAEXtext.g:2938:6: (lv_nestedElements_10_0= ruleGenericElement )
                    	    {
                    	    // InternalCAEXtext.g:2938:6: (lv_nestedElements_10_0= ruleGenericElement )
                    	    // InternalCAEXtext.g:2939:7: lv_nestedElements_10_0= ruleGenericElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getGenericElementAccess().getNestedElementsGenericElementParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_nestedElements_10_0=ruleGenericElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGenericElementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nestedElements",
                    	    								lv_nestedElements_10_0,
                    	    								"caex.caex215.CAEXtext.GenericElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_78); 

                    				newLeafNode(otherlv_11, grammarAccess.getGenericElementAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:2962:3: (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleGenericAttribute ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleGenericAttribute ) ) )* otherlv_17= '}' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==44) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalCAEXtext.g:2963:4: otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleGenericAttribute ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleGenericAttribute ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,44,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getGenericElementAccess().getAttributesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getGenericElementAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCAEXtext.g:2971:4: ( (lv_attributes_14_0= ruleGenericAttribute ) )
                    // InternalCAEXtext.g:2972:5: (lv_attributes_14_0= ruleGenericAttribute )
                    {
                    // InternalCAEXtext.g:2972:5: (lv_attributes_14_0= ruleGenericAttribute )
                    // InternalCAEXtext.g:2973:6: lv_attributes_14_0= ruleGenericAttribute
                    {

                    						newCompositeNode(grammarAccess.getGenericElementAccess().getAttributesGenericAttributeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_attributes_14_0=ruleGenericAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGenericElementRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_14_0,
                    							"caex.caex215.CAEXtext.GenericAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:2990:4: (otherlv_15= ',' ( (lv_attributes_16_0= ruleGenericAttribute ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==14) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalCAEXtext.g:2991:5: otherlv_15= ',' ( (lv_attributes_16_0= ruleGenericAttribute ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getGenericElementAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCAEXtext.g:2995:5: ( (lv_attributes_16_0= ruleGenericAttribute ) )
                    	    // InternalCAEXtext.g:2996:6: (lv_attributes_16_0= ruleGenericAttribute )
                    	    {
                    	    // InternalCAEXtext.g:2996:6: (lv_attributes_16_0= ruleGenericAttribute )
                    	    // InternalCAEXtext.g:2997:7: lv_attributes_16_0= ruleGenericAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getGenericElementAccess().getAttributesGenericAttributeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_attributes_16_0=ruleGenericAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGenericElementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_16_0,
                    	    								"caex.caex215.CAEXtext.GenericAttribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_31); 

                    				newLeafNode(otherlv_17, grammarAccess.getGenericElementAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getGenericElementAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenericElement"


    // $ANTLR start "entryRuleGenericAttribute"
    // InternalCAEXtext.g:3028:1: entryRuleGenericAttribute returns [EObject current=null] : iv_ruleGenericAttribute= ruleGenericAttribute EOF ;
    public final EObject entryRuleGenericAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericAttribute = null;


        try {
            // InternalCAEXtext.g:3028:57: (iv_ruleGenericAttribute= ruleGenericAttribute EOF )
            // InternalCAEXtext.g:3029:2: iv_ruleGenericAttribute= ruleGenericAttribute EOF
            {
             newCompositeNode(grammarAccess.getGenericAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenericAttribute=ruleGenericAttribute();

            state._fsp--;

             current =iv_ruleGenericAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGenericAttribute"


    // $ANTLR start "ruleGenericAttribute"
    // InternalCAEXtext.g:3035:1: ruleGenericAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleGenericAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:3041:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )? ) )
            // InternalCAEXtext.g:3042:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )? )
            {
            // InternalCAEXtext.g:3042:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )? )
            // InternalCAEXtext.g:3043:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )?
            {
            // InternalCAEXtext.g:3043:3: ()
            // InternalCAEXtext.g:3044:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGenericAttributeAccess().getGenericAttributeAction_0(),
            					current);
            			

            }

            // InternalCAEXtext.g:3050:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCAEXtext.g:3051:4: (lv_name_1_0= ruleEString )
            {
            // InternalCAEXtext.g:3051:4: (lv_name_1_0= ruleEString )
            // InternalCAEXtext.g:3052:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGenericAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_79);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenericAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCAEXtext.g:3069:3: (otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==45) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalCAEXtext.g:3070:4: otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getGenericAttributeAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalCAEXtext.g:3074:4: ( (lv_value_3_0= ruleEString ) )
                    // InternalCAEXtext.g:3075:5: (lv_value_3_0= ruleEString )
                    {
                    // InternalCAEXtext.g:3075:5: (lv_value_3_0= ruleEString )
                    // InternalCAEXtext.g:3076:6: lv_value_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGenericAttributeAccess().getValueEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGenericAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenericAttribute"


    // $ANTLR start "entryRuleInternalElement"
    // InternalCAEXtext.g:3098:1: entryRuleInternalElement returns [EObject current=null] : iv_ruleInternalElement= ruleInternalElement EOF ;
    public final EObject entryRuleInternalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalElement = null;


        try {
            // InternalCAEXtext.g:3098:56: (iv_ruleInternalElement= ruleInternalElement EOF )
            // InternalCAEXtext.g:3099:2: iv_ruleInternalElement= ruleInternalElement EOF
            {
             newCompositeNode(grammarAccess.getInternalElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalElement=ruleInternalElement();

            state._fsp--;

             current =iv_ruleInternalElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInternalElement"


    // $ANTLR start "ruleInternalElement"
    // InternalCAEXtext.g:3105:1: ruleInternalElement returns [EObject current=null] : (otherlv_0= 'IE' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_iD_3_0= ruleEString ) ) )? otherlv_4= '[' (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? ( (lv_description_7_0= ruleDescription ) )? ( (lv_version_8_0= ruleVersion ) )? ( ( (lv_revision_9_0= ruleRevision ) ) (otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) ) )* )? ( (lv_copyright_12_0= ruleCopyright ) )? ( ( (lv_additionalInformation_13_0= ruleAdditionalInformation ) ) (otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) ) )* )? otherlv_16= ']' otherlv_17= '{' (otherlv_18= 'atts' otherlv_19= '{' ( (lv_attribute_20_0= ruleAttribute ) ) (otherlv_21= ',' ( (lv_attribute_22_0= ruleAttribute ) ) )* otherlv_23= '}' )? (otherlv_24= 'provides' otherlv_25= '{' ( (lv_externalInterface_26_0= ruleExternalInterface ) ) (otherlv_27= ',' ( (lv_externalInterface_28_0= ruleExternalInterface ) ) )* otherlv_29= '}' )? ( ( (lv_internalElement_30_0= ruleInternalElement ) ) (otherlv_31= ',' ( (lv_internalElement_32_0= ruleInternalElement ) ) )* )? (otherlv_33= 'supports' otherlv_34= '{' ( (lv_supportedRoleClass_35_0= ruleSupportedRoleClass ) ) (otherlv_36= ',' ( (lv_supportedRoleClass_37_0= ruleSupportedRoleClass ) ) )* otherlv_38= '}' )? ( ( (lv_internalLink_39_0= ruleInternalLink ) ) (otherlv_40= ',' ( (lv_internalLink_41_0= ruleInternalLink ) ) )* )? (otherlv_42= 'isA' otherlv_43= '{' ( (lv_systemUnitClass_44_0= ruleSystemUnitClass ) ) (otherlv_45= ',' ( (lv_systemUnitClass_46_0= ruleSystemUnitClass ) ) )* otherlv_47= '}' )? otherlv_48= '}' ) ;
    public final EObject ruleInternalElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_iD_3_0 = null;

        Enumerator lv_changeMode_6_0 = null;

        EObject lv_description_7_0 = null;

        EObject lv_version_8_0 = null;

        EObject lv_revision_9_0 = null;

        EObject lv_revision_11_0 = null;

        EObject lv_copyright_12_0 = null;

        EObject lv_additionalInformation_13_0 = null;

        EObject lv_additionalInformation_15_0 = null;

        EObject lv_attribute_20_0 = null;

        EObject lv_attribute_22_0 = null;

        EObject lv_externalInterface_26_0 = null;

        EObject lv_externalInterface_28_0 = null;

        EObject lv_internalElement_30_0 = null;

        EObject lv_internalElement_32_0 = null;

        EObject lv_supportedRoleClass_35_0 = null;

        EObject lv_supportedRoleClass_37_0 = null;

        EObject lv_internalLink_39_0 = null;

        EObject lv_internalLink_41_0 = null;

        EObject lv_systemUnitClass_44_0 = null;

        EObject lv_systemUnitClass_46_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:3111:2: ( (otherlv_0= 'IE' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_iD_3_0= ruleEString ) ) )? otherlv_4= '[' (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? ( (lv_description_7_0= ruleDescription ) )? ( (lv_version_8_0= ruleVersion ) )? ( ( (lv_revision_9_0= ruleRevision ) ) (otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) ) )* )? ( (lv_copyright_12_0= ruleCopyright ) )? ( ( (lv_additionalInformation_13_0= ruleAdditionalInformation ) ) (otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) ) )* )? otherlv_16= ']' otherlv_17= '{' (otherlv_18= 'atts' otherlv_19= '{' ( (lv_attribute_20_0= ruleAttribute ) ) (otherlv_21= ',' ( (lv_attribute_22_0= ruleAttribute ) ) )* otherlv_23= '}' )? (otherlv_24= 'provides' otherlv_25= '{' ( (lv_externalInterface_26_0= ruleExternalInterface ) ) (otherlv_27= ',' ( (lv_externalInterface_28_0= ruleExternalInterface ) ) )* otherlv_29= '}' )? ( ( (lv_internalElement_30_0= ruleInternalElement ) ) (otherlv_31= ',' ( (lv_internalElement_32_0= ruleInternalElement ) ) )* )? (otherlv_33= 'supports' otherlv_34= '{' ( (lv_supportedRoleClass_35_0= ruleSupportedRoleClass ) ) (otherlv_36= ',' ( (lv_supportedRoleClass_37_0= ruleSupportedRoleClass ) ) )* otherlv_38= '}' )? ( ( (lv_internalLink_39_0= ruleInternalLink ) ) (otherlv_40= ',' ( (lv_internalLink_41_0= ruleInternalLink ) ) )* )? (otherlv_42= 'isA' otherlv_43= '{' ( (lv_systemUnitClass_44_0= ruleSystemUnitClass ) ) (otherlv_45= ',' ( (lv_systemUnitClass_46_0= ruleSystemUnitClass ) ) )* otherlv_47= '}' )? otherlv_48= '}' ) )
            // InternalCAEXtext.g:3112:2: (otherlv_0= 'IE' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_iD_3_0= ruleEString ) ) )? otherlv_4= '[' (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? ( (lv_description_7_0= ruleDescription ) )? ( (lv_version_8_0= ruleVersion ) )? ( ( (lv_revision_9_0= ruleRevision ) ) (otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) ) )* )? ( (lv_copyright_12_0= ruleCopyright ) )? ( ( (lv_additionalInformation_13_0= ruleAdditionalInformation ) ) (otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) ) )* )? otherlv_16= ']' otherlv_17= '{' (otherlv_18= 'atts' otherlv_19= '{' ( (lv_attribute_20_0= ruleAttribute ) ) (otherlv_21= ',' ( (lv_attribute_22_0= ruleAttribute ) ) )* otherlv_23= '}' )? (otherlv_24= 'provides' otherlv_25= '{' ( (lv_externalInterface_26_0= ruleExternalInterface ) ) (otherlv_27= ',' ( (lv_externalInterface_28_0= ruleExternalInterface ) ) )* otherlv_29= '}' )? ( ( (lv_internalElement_30_0= ruleInternalElement ) ) (otherlv_31= ',' ( (lv_internalElement_32_0= ruleInternalElement ) ) )* )? (otherlv_33= 'supports' otherlv_34= '{' ( (lv_supportedRoleClass_35_0= ruleSupportedRoleClass ) ) (otherlv_36= ',' ( (lv_supportedRoleClass_37_0= ruleSupportedRoleClass ) ) )* otherlv_38= '}' )? ( ( (lv_internalLink_39_0= ruleInternalLink ) ) (otherlv_40= ',' ( (lv_internalLink_41_0= ruleInternalLink ) ) )* )? (otherlv_42= 'isA' otherlv_43= '{' ( (lv_systemUnitClass_44_0= ruleSystemUnitClass ) ) (otherlv_45= ',' ( (lv_systemUnitClass_46_0= ruleSystemUnitClass ) ) )* otherlv_47= '}' )? otherlv_48= '}' )
            {
            // InternalCAEXtext.g:3112:2: (otherlv_0= 'IE' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_iD_3_0= ruleEString ) ) )? otherlv_4= '[' (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? ( (lv_description_7_0= ruleDescription ) )? ( (lv_version_8_0= ruleVersion ) )? ( ( (lv_revision_9_0= ruleRevision ) ) (otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) ) )* )? ( (lv_copyright_12_0= ruleCopyright ) )? ( ( (lv_additionalInformation_13_0= ruleAdditionalInformation ) ) (otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) ) )* )? otherlv_16= ']' otherlv_17= '{' (otherlv_18= 'atts' otherlv_19= '{' ( (lv_attribute_20_0= ruleAttribute ) ) (otherlv_21= ',' ( (lv_attribute_22_0= ruleAttribute ) ) )* otherlv_23= '}' )? (otherlv_24= 'provides' otherlv_25= '{' ( (lv_externalInterface_26_0= ruleExternalInterface ) ) (otherlv_27= ',' ( (lv_externalInterface_28_0= ruleExternalInterface ) ) )* otherlv_29= '}' )? ( ( (lv_internalElement_30_0= ruleInternalElement ) ) (otherlv_31= ',' ( (lv_internalElement_32_0= ruleInternalElement ) ) )* )? (otherlv_33= 'supports' otherlv_34= '{' ( (lv_supportedRoleClass_35_0= ruleSupportedRoleClass ) ) (otherlv_36= ',' ( (lv_supportedRoleClass_37_0= ruleSupportedRoleClass ) ) )* otherlv_38= '}' )? ( ( (lv_internalLink_39_0= ruleInternalLink ) ) (otherlv_40= ',' ( (lv_internalLink_41_0= ruleInternalLink ) ) )* )? (otherlv_42= 'isA' otherlv_43= '{' ( (lv_systemUnitClass_44_0= ruleSystemUnitClass ) ) (otherlv_45= ',' ( (lv_systemUnitClass_46_0= ruleSystemUnitClass ) ) )* otherlv_47= '}' )? otherlv_48= '}' )
            // InternalCAEXtext.g:3113:3: otherlv_0= 'IE' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_iD_3_0= ruleEString ) ) )? otherlv_4= '[' (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )? ( (lv_description_7_0= ruleDescription ) )? ( (lv_version_8_0= ruleVersion ) )? ( ( (lv_revision_9_0= ruleRevision ) ) (otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) ) )* )? ( (lv_copyright_12_0= ruleCopyright ) )? ( ( (lv_additionalInformation_13_0= ruleAdditionalInformation ) ) (otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) ) )* )? otherlv_16= ']' otherlv_17= '{' (otherlv_18= 'atts' otherlv_19= '{' ( (lv_attribute_20_0= ruleAttribute ) ) (otherlv_21= ',' ( (lv_attribute_22_0= ruleAttribute ) ) )* otherlv_23= '}' )? (otherlv_24= 'provides' otherlv_25= '{' ( (lv_externalInterface_26_0= ruleExternalInterface ) ) (otherlv_27= ',' ( (lv_externalInterface_28_0= ruleExternalInterface ) ) )* otherlv_29= '}' )? ( ( (lv_internalElement_30_0= ruleInternalElement ) ) (otherlv_31= ',' ( (lv_internalElement_32_0= ruleInternalElement ) ) )* )? (otherlv_33= 'supports' otherlv_34= '{' ( (lv_supportedRoleClass_35_0= ruleSupportedRoleClass ) ) (otherlv_36= ',' ( (lv_supportedRoleClass_37_0= ruleSupportedRoleClass ) ) )* otherlv_38= '}' )? ( ( (lv_internalLink_39_0= ruleInternalLink ) ) (otherlv_40= ',' ( (lv_internalLink_41_0= ruleInternalLink ) ) )* )? (otherlv_42= 'isA' otherlv_43= '{' ( (lv_systemUnitClass_44_0= ruleSystemUnitClass ) ) (otherlv_45= ',' ( (lv_systemUnitClass_46_0= ruleSystemUnitClass ) ) )* otherlv_47= '}' )? otherlv_48= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getInternalElementAccess().getIEKeyword_0());
            		
            // InternalCAEXtext.g:3117:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCAEXtext.g:3118:4: (lv_name_1_0= ruleEString )
            {
            // InternalCAEXtext.g:3118:4: (lv_name_1_0= ruleEString )
            // InternalCAEXtext.g:3119:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInternalElementAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInternalElementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCAEXtext.g:3136:3: (otherlv_2= ':' ( (lv_iD_3_0= ruleEString ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==35) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalCAEXtext.g:3137:4: otherlv_2= ':' ( (lv_iD_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getInternalElementAccess().getColonKeyword_2_0());
                    			
                    // InternalCAEXtext.g:3141:4: ( (lv_iD_3_0= ruleEString ) )
                    // InternalCAEXtext.g:3142:5: (lv_iD_3_0= ruleEString )
                    {
                    // InternalCAEXtext.g:3142:5: (lv_iD_3_0= ruleEString )
                    // InternalCAEXtext.g:3143:6: lv_iD_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInternalElementAccess().getIDEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_iD_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    						}
                    						set(
                    							current,
                    							"iD",
                    							lv_iD_3_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getInternalElementAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalCAEXtext.g:3165:3: (otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==13) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalCAEXtext.g:3166:4: otherlv_5= 'changeMode' ( (lv_changeMode_6_0= ruleChangeMode ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getInternalElementAccess().getChangeModeKeyword_4_0());
                    			
                    // InternalCAEXtext.g:3170:4: ( (lv_changeMode_6_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:3171:5: (lv_changeMode_6_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:3171:5: (lv_changeMode_6_0= ruleChangeMode )
                    // InternalCAEXtext.g:3172:6: lv_changeMode_6_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getInternalElementAccess().getChangeModeChangeModeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_changeMode_6_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_6_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:3190:3: ( (lv_description_7_0= ruleDescription ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==20) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalCAEXtext.g:3191:4: (lv_description_7_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:3191:4: (lv_description_7_0= ruleDescription )
                    // InternalCAEXtext.g:3192:5: lv_description_7_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getInternalElementAccess().getDescriptionDescriptionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_description_7_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_7_0,
                    						"caex.caex215.CAEXtext.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:3209:3: ( (lv_version_8_0= ruleVersion ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==22) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalCAEXtext.g:3210:4: (lv_version_8_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:3210:4: (lv_version_8_0= ruleVersion )
                    // InternalCAEXtext.g:3211:5: lv_version_8_0= ruleVersion
                    {

                    					newCompositeNode(grammarAccess.getInternalElementAccess().getVersionVersionParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_version_8_0=ruleVersion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    					}
                    					set(
                    						current,
                    						"version",
                    						lv_version_8_0,
                    						"caex.caex215.CAEXtext.Version");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:3228:3: ( ( (lv_revision_9_0= ruleRevision ) ) (otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) ) )* )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==23) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalCAEXtext.g:3229:4: ( (lv_revision_9_0= ruleRevision ) ) (otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) ) )*
                    {
                    // InternalCAEXtext.g:3229:4: ( (lv_revision_9_0= ruleRevision ) )
                    // InternalCAEXtext.g:3230:5: (lv_revision_9_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:3230:5: (lv_revision_9_0= ruleRevision )
                    // InternalCAEXtext.g:3231:6: lv_revision_9_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getInternalElementAccess().getRevisionRevisionParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_revision_9_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_9_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:3248:4: (otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) ) )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==14) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // InternalCAEXtext.g:3249:5: otherlv_10= ',' ( (lv_revision_11_0= ruleRevision ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getInternalElementAccess().getCommaKeyword_7_1_0());
                    	    				
                    	    // InternalCAEXtext.g:3253:5: ( (lv_revision_11_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:3254:6: (lv_revision_11_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:3254:6: (lv_revision_11_0= ruleRevision )
                    	    // InternalCAEXtext.g:3255:7: lv_revision_11_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getInternalElementAccess().getRevisionRevisionParserRuleCall_7_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_revision_11_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_11_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCAEXtext.g:3274:3: ( (lv_copyright_12_0= ruleCopyright ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==29) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalCAEXtext.g:3275:4: (lv_copyright_12_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:3275:4: (lv_copyright_12_0= ruleCopyright )
                    // InternalCAEXtext.g:3276:5: lv_copyright_12_0= ruleCopyright
                    {

                    					newCompositeNode(grammarAccess.getInternalElementAccess().getCopyrightCopyrightParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_copyright_12_0=ruleCopyright();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    					}
                    					set(
                    						current,
                    						"copyright",
                    						lv_copyright_12_0,
                    						"caex.caex215.CAEXtext.Copyright");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:3293:3: ( ( (lv_additionalInformation_13_0= ruleAdditionalInformation ) ) (otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) ) )* )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==30) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalCAEXtext.g:3294:4: ( (lv_additionalInformation_13_0= ruleAdditionalInformation ) ) (otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) ) )*
                    {
                    // InternalCAEXtext.g:3294:4: ( (lv_additionalInformation_13_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:3295:5: (lv_additionalInformation_13_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:3295:5: (lv_additionalInformation_13_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:3296:6: lv_additionalInformation_13_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getInternalElementAccess().getAdditionalInformationAdditionalInformationParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_additionalInformation_13_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_13_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:3313:4: (otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==14) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalCAEXtext.g:3314:5: otherlv_14= ',' ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getInternalElementAccess().getCommaKeyword_9_1_0());
                    	    				
                    	    // InternalCAEXtext.g:3318:5: ( (lv_additionalInformation_15_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:3319:6: (lv_additionalInformation_15_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:3319:6: (lv_additionalInformation_15_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:3320:7: lv_additionalInformation_15_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getInternalElementAccess().getAdditionalInformationAdditionalInformationParserRuleCall_9_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_additionalInformation_15_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_15_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_16, grammarAccess.getInternalElementAccess().getRightSquareBracketKeyword_10());
            		
            otherlv_17=(Token)match(input,16,FOLLOW_80); 

            			newLeafNode(otherlv_17, grammarAccess.getInternalElementAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalCAEXtext.g:3347:3: (otherlv_18= 'atts' otherlv_19= '{' ( (lv_attribute_20_0= ruleAttribute ) ) (otherlv_21= ',' ( (lv_attribute_22_0= ruleAttribute ) ) )* otherlv_23= '}' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==47) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalCAEXtext.g:3348:4: otherlv_18= 'atts' otherlv_19= '{' ( (lv_attribute_20_0= ruleAttribute ) ) (otherlv_21= ',' ( (lv_attribute_22_0= ruleAttribute ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,47,FOLLOW_14); 

                    				newLeafNode(otherlv_18, grammarAccess.getInternalElementAccess().getAttsKeyword_12_0());
                    			
                    otherlv_19=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_19, grammarAccess.getInternalElementAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalCAEXtext.g:3356:4: ( (lv_attribute_20_0= ruleAttribute ) )
                    // InternalCAEXtext.g:3357:5: (lv_attribute_20_0= ruleAttribute )
                    {
                    // InternalCAEXtext.g:3357:5: (lv_attribute_20_0= ruleAttribute )
                    // InternalCAEXtext.g:3358:6: lv_attribute_20_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getInternalElementAccess().getAttributeAttributeParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_attribute_20_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    						}
                    						add(
                    							current,
                    							"attribute",
                    							lv_attribute_20_0,
                    							"caex.caex215.CAEXtext.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:3375:4: (otherlv_21= ',' ( (lv_attribute_22_0= ruleAttribute ) ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==14) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // InternalCAEXtext.g:3376:5: otherlv_21= ',' ( (lv_attribute_22_0= ruleAttribute ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getInternalElementAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalCAEXtext.g:3380:5: ( (lv_attribute_22_0= ruleAttribute ) )
                    	    // InternalCAEXtext.g:3381:6: (lv_attribute_22_0= ruleAttribute )
                    	    {
                    	    // InternalCAEXtext.g:3381:6: (lv_attribute_22_0= ruleAttribute )
                    	    // InternalCAEXtext.g:3382:7: lv_attribute_22_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getInternalElementAccess().getAttributeAttributeParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_attribute_22_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attribute",
                    	    								lv_attribute_22_0,
                    	    								"caex.caex215.CAEXtext.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop107;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,19,FOLLOW_81); 

                    				newLeafNode(otherlv_23, grammarAccess.getInternalElementAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:3405:3: (otherlv_24= 'provides' otherlv_25= '{' ( (lv_externalInterface_26_0= ruleExternalInterface ) ) (otherlv_27= ',' ( (lv_externalInterface_28_0= ruleExternalInterface ) ) )* otherlv_29= '}' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==48) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalCAEXtext.g:3406:4: otherlv_24= 'provides' otherlv_25= '{' ( (lv_externalInterface_26_0= ruleExternalInterface ) ) (otherlv_27= ',' ( (lv_externalInterface_28_0= ruleExternalInterface ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,48,FOLLOW_14); 

                    				newLeafNode(otherlv_24, grammarAccess.getInternalElementAccess().getProvidesKeyword_13_0());
                    			
                    otherlv_25=(Token)match(input,16,FOLLOW_60); 

                    				newLeafNode(otherlv_25, grammarAccess.getInternalElementAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalCAEXtext.g:3414:4: ( (lv_externalInterface_26_0= ruleExternalInterface ) )
                    // InternalCAEXtext.g:3415:5: (lv_externalInterface_26_0= ruleExternalInterface )
                    {
                    // InternalCAEXtext.g:3415:5: (lv_externalInterface_26_0= ruleExternalInterface )
                    // InternalCAEXtext.g:3416:6: lv_externalInterface_26_0= ruleExternalInterface
                    {

                    						newCompositeNode(grammarAccess.getInternalElementAccess().getExternalInterfaceExternalInterfaceParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_externalInterface_26_0=ruleExternalInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    						}
                    						add(
                    							current,
                    							"externalInterface",
                    							lv_externalInterface_26_0,
                    							"caex.caex215.CAEXtext.ExternalInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:3433:4: (otherlv_27= ',' ( (lv_externalInterface_28_0= ruleExternalInterface ) ) )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==14) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // InternalCAEXtext.g:3434:5: otherlv_27= ',' ( (lv_externalInterface_28_0= ruleExternalInterface ) )
                    	    {
                    	    otherlv_27=(Token)match(input,14,FOLLOW_60); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getInternalElementAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalCAEXtext.g:3438:5: ( (lv_externalInterface_28_0= ruleExternalInterface ) )
                    	    // InternalCAEXtext.g:3439:6: (lv_externalInterface_28_0= ruleExternalInterface )
                    	    {
                    	    // InternalCAEXtext.g:3439:6: (lv_externalInterface_28_0= ruleExternalInterface )
                    	    // InternalCAEXtext.g:3440:7: lv_externalInterface_28_0= ruleExternalInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getInternalElementAccess().getExternalInterfaceExternalInterfaceParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_externalInterface_28_0=ruleExternalInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"externalInterface",
                    	    								lv_externalInterface_28_0,
                    	    								"caex.caex215.CAEXtext.ExternalInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop109;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,19,FOLLOW_82); 

                    				newLeafNode(otherlv_29, grammarAccess.getInternalElementAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:3463:3: ( ( (lv_internalElement_30_0= ruleInternalElement ) ) (otherlv_31= ',' ( (lv_internalElement_32_0= ruleInternalElement ) ) )* )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==46) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalCAEXtext.g:3464:4: ( (lv_internalElement_30_0= ruleInternalElement ) ) (otherlv_31= ',' ( (lv_internalElement_32_0= ruleInternalElement ) ) )*
                    {
                    // InternalCAEXtext.g:3464:4: ( (lv_internalElement_30_0= ruleInternalElement ) )
                    // InternalCAEXtext.g:3465:5: (lv_internalElement_30_0= ruleInternalElement )
                    {
                    // InternalCAEXtext.g:3465:5: (lv_internalElement_30_0= ruleInternalElement )
                    // InternalCAEXtext.g:3466:6: lv_internalElement_30_0= ruleInternalElement
                    {

                    						newCompositeNode(grammarAccess.getInternalElementAccess().getInternalElementInternalElementParserRuleCall_14_0_0());
                    					
                    pushFollow(FOLLOW_83);
                    lv_internalElement_30_0=ruleInternalElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    						}
                    						add(
                    							current,
                    							"internalElement",
                    							lv_internalElement_30_0,
                    							"caex.caex215.CAEXtext.InternalElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:3483:4: (otherlv_31= ',' ( (lv_internalElement_32_0= ruleInternalElement ) ) )*
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==14) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // InternalCAEXtext.g:3484:5: otherlv_31= ',' ( (lv_internalElement_32_0= ruleInternalElement ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getInternalElementAccess().getCommaKeyword_14_1_0());
                    	    				
                    	    // InternalCAEXtext.g:3488:5: ( (lv_internalElement_32_0= ruleInternalElement ) )
                    	    // InternalCAEXtext.g:3489:6: (lv_internalElement_32_0= ruleInternalElement )
                    	    {
                    	    // InternalCAEXtext.g:3489:6: (lv_internalElement_32_0= ruleInternalElement )
                    	    // InternalCAEXtext.g:3490:7: lv_internalElement_32_0= ruleInternalElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getInternalElementAccess().getInternalElementInternalElementParserRuleCall_14_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
                    	    lv_internalElement_32_0=ruleInternalElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"internalElement",
                    	    								lv_internalElement_32_0,
                    	    								"caex.caex215.CAEXtext.InternalElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop111;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCAEXtext.g:3509:3: (otherlv_33= 'supports' otherlv_34= '{' ( (lv_supportedRoleClass_35_0= ruleSupportedRoleClass ) ) (otherlv_36= ',' ( (lv_supportedRoleClass_37_0= ruleSupportedRoleClass ) ) )* otherlv_38= '}' )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==49) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalCAEXtext.g:3510:4: otherlv_33= 'supports' otherlv_34= '{' ( (lv_supportedRoleClass_35_0= ruleSupportedRoleClass ) ) (otherlv_36= ',' ( (lv_supportedRoleClass_37_0= ruleSupportedRoleClass ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,49,FOLLOW_14); 

                    				newLeafNode(otherlv_33, grammarAccess.getInternalElementAccess().getSupportsKeyword_15_0());
                    			
                    otherlv_34=(Token)match(input,16,FOLLOW_84); 

                    				newLeafNode(otherlv_34, grammarAccess.getInternalElementAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalCAEXtext.g:3518:4: ( (lv_supportedRoleClass_35_0= ruleSupportedRoleClass ) )
                    // InternalCAEXtext.g:3519:5: (lv_supportedRoleClass_35_0= ruleSupportedRoleClass )
                    {
                    // InternalCAEXtext.g:3519:5: (lv_supportedRoleClass_35_0= ruleSupportedRoleClass )
                    // InternalCAEXtext.g:3520:6: lv_supportedRoleClass_35_0= ruleSupportedRoleClass
                    {

                    						newCompositeNode(grammarAccess.getInternalElementAccess().getSupportedRoleClassSupportedRoleClassParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_supportedRoleClass_35_0=ruleSupportedRoleClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    						}
                    						add(
                    							current,
                    							"supportedRoleClass",
                    							lv_supportedRoleClass_35_0,
                    							"caex.caex215.CAEXtext.SupportedRoleClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:3537:4: (otherlv_36= ',' ( (lv_supportedRoleClass_37_0= ruleSupportedRoleClass ) ) )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==14) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalCAEXtext.g:3538:5: otherlv_36= ',' ( (lv_supportedRoleClass_37_0= ruleSupportedRoleClass ) )
                    	    {
                    	    otherlv_36=(Token)match(input,14,FOLLOW_84); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getInternalElementAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalCAEXtext.g:3542:5: ( (lv_supportedRoleClass_37_0= ruleSupportedRoleClass ) )
                    	    // InternalCAEXtext.g:3543:6: (lv_supportedRoleClass_37_0= ruleSupportedRoleClass )
                    	    {
                    	    // InternalCAEXtext.g:3543:6: (lv_supportedRoleClass_37_0= ruleSupportedRoleClass )
                    	    // InternalCAEXtext.g:3544:7: lv_supportedRoleClass_37_0= ruleSupportedRoleClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getInternalElementAccess().getSupportedRoleClassSupportedRoleClassParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_supportedRoleClass_37_0=ruleSupportedRoleClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"supportedRoleClass",
                    	    								lv_supportedRoleClass_37_0,
                    	    								"caex.caex215.CAEXtext.SupportedRoleClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,19,FOLLOW_85); 

                    				newLeafNode(otherlv_38, grammarAccess.getInternalElementAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:3567:3: ( ( (lv_internalLink_39_0= ruleInternalLink ) ) (otherlv_40= ',' ( (lv_internalLink_41_0= ruleInternalLink ) ) )* )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==72) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalCAEXtext.g:3568:4: ( (lv_internalLink_39_0= ruleInternalLink ) ) (otherlv_40= ',' ( (lv_internalLink_41_0= ruleInternalLink ) ) )*
                    {
                    // InternalCAEXtext.g:3568:4: ( (lv_internalLink_39_0= ruleInternalLink ) )
                    // InternalCAEXtext.g:3569:5: (lv_internalLink_39_0= ruleInternalLink )
                    {
                    // InternalCAEXtext.g:3569:5: (lv_internalLink_39_0= ruleInternalLink )
                    // InternalCAEXtext.g:3570:6: lv_internalLink_39_0= ruleInternalLink
                    {

                    						newCompositeNode(grammarAccess.getInternalElementAccess().getInternalLinkInternalLinkParserRuleCall_16_0_0());
                    					
                    pushFollow(FOLLOW_86);
                    lv_internalLink_39_0=ruleInternalLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    						}
                    						add(
                    							current,
                    							"internalLink",
                    							lv_internalLink_39_0,
                    							"caex.caex215.CAEXtext.InternalLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:3587:4: (otherlv_40= ',' ( (lv_internalLink_41_0= ruleInternalLink ) ) )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==14) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // InternalCAEXtext.g:3588:5: otherlv_40= ',' ( (lv_internalLink_41_0= ruleInternalLink ) )
                    	    {
                    	    otherlv_40=(Token)match(input,14,FOLLOW_87); 

                    	    					newLeafNode(otherlv_40, grammarAccess.getInternalElementAccess().getCommaKeyword_16_1_0());
                    	    				
                    	    // InternalCAEXtext.g:3592:5: ( (lv_internalLink_41_0= ruleInternalLink ) )
                    	    // InternalCAEXtext.g:3593:6: (lv_internalLink_41_0= ruleInternalLink )
                    	    {
                    	    // InternalCAEXtext.g:3593:6: (lv_internalLink_41_0= ruleInternalLink )
                    	    // InternalCAEXtext.g:3594:7: lv_internalLink_41_0= ruleInternalLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getInternalElementAccess().getInternalLinkInternalLinkParserRuleCall_16_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_86);
                    	    lv_internalLink_41_0=ruleInternalLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"internalLink",
                    	    								lv_internalLink_41_0,
                    	    								"caex.caex215.CAEXtext.InternalLink");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCAEXtext.g:3613:3: (otherlv_42= 'isA' otherlv_43= '{' ( (lv_systemUnitClass_44_0= ruleSystemUnitClass ) ) (otherlv_45= ',' ( (lv_systemUnitClass_46_0= ruleSystemUnitClass ) ) )* otherlv_47= '}' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==50) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalCAEXtext.g:3614:4: otherlv_42= 'isA' otherlv_43= '{' ( (lv_systemUnitClass_44_0= ruleSystemUnitClass ) ) (otherlv_45= ',' ( (lv_systemUnitClass_46_0= ruleSystemUnitClass ) ) )* otherlv_47= '}'
                    {
                    otherlv_42=(Token)match(input,50,FOLLOW_14); 

                    				newLeafNode(otherlv_42, grammarAccess.getInternalElementAccess().getIsAKeyword_17_0());
                    			
                    otherlv_43=(Token)match(input,16,FOLLOW_74); 

                    				newLeafNode(otherlv_43, grammarAccess.getInternalElementAccess().getLeftCurlyBracketKeyword_17_1());
                    			
                    // InternalCAEXtext.g:3622:4: ( (lv_systemUnitClass_44_0= ruleSystemUnitClass ) )
                    // InternalCAEXtext.g:3623:5: (lv_systemUnitClass_44_0= ruleSystemUnitClass )
                    {
                    // InternalCAEXtext.g:3623:5: (lv_systemUnitClass_44_0= ruleSystemUnitClass )
                    // InternalCAEXtext.g:3624:6: lv_systemUnitClass_44_0= ruleSystemUnitClass
                    {

                    						newCompositeNode(grammarAccess.getInternalElementAccess().getSystemUnitClassSystemUnitClassParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_systemUnitClass_44_0=ruleSystemUnitClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    						}
                    						add(
                    							current,
                    							"systemUnitClass",
                    							lv_systemUnitClass_44_0,
                    							"caex.caex215.CAEXtext.SystemUnitClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:3641:4: (otherlv_45= ',' ( (lv_systemUnitClass_46_0= ruleSystemUnitClass ) ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==14) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // InternalCAEXtext.g:3642:5: otherlv_45= ',' ( (lv_systemUnitClass_46_0= ruleSystemUnitClass ) )
                    	    {
                    	    otherlv_45=(Token)match(input,14,FOLLOW_74); 

                    	    					newLeafNode(otherlv_45, grammarAccess.getInternalElementAccess().getCommaKeyword_17_3_0());
                    	    				
                    	    // InternalCAEXtext.g:3646:5: ( (lv_systemUnitClass_46_0= ruleSystemUnitClass ) )
                    	    // InternalCAEXtext.g:3647:6: (lv_systemUnitClass_46_0= ruleSystemUnitClass )
                    	    {
                    	    // InternalCAEXtext.g:3647:6: (lv_systemUnitClass_46_0= ruleSystemUnitClass )
                    	    // InternalCAEXtext.g:3648:7: lv_systemUnitClass_46_0= ruleSystemUnitClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getInternalElementAccess().getSystemUnitClassSystemUnitClassParserRuleCall_17_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_systemUnitClass_46_0=ruleSystemUnitClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInternalElementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"systemUnitClass",
                    	    								lv_systemUnitClass_46_0,
                    	    								"caex.caex215.CAEXtext.SystemUnitClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    otherlv_47=(Token)match(input,19,FOLLOW_31); 

                    				newLeafNode(otherlv_47, grammarAccess.getInternalElementAccess().getRightCurlyBracketKeyword_17_4());
                    			

                    }
                    break;

            }

            otherlv_48=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_48, grammarAccess.getInternalElementAccess().getRightCurlyBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternalElement"


    // $ANTLR start "entryRuleAttribute"
    // InternalCAEXtext.g:3679:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalCAEXtext.g:3679:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalCAEXtext.g:3680:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalCAEXtext.g:3686:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_attributeDataType_2_0= ruleAttributeDataType ) ) )? otherlv_3= 'values:' (otherlv_4= 'current' ( (lv_value_5_0= ruleEString ) ) )? (otherlv_6= 'default' ( (lv_defaultValue_7_0= ruleEString ) ) )? (otherlv_8= 'in' ( (lv_unit_9_0= ruleEString ) ) )? otherlv_10= '[' (otherlv_11= 'id' ( (lv_iD_12_0= ruleEString ) ) )? (otherlv_13= 'changeMode' ( (lv_changeMode_14_0= ruleChangeMode ) ) )? ( (lv_description_15_0= ruleDescription ) )? ( (lv_version_16_0= ruleVersion ) )? ( ( (lv_revision_17_0= ruleRevision ) ) (otherlv_18= ',' ( (lv_revision_19_0= ruleRevision ) ) )* )? ( (lv_copyright_20_0= ruleCopyright ) )? ( ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) ) (otherlv_22= ',' ( (lv_additionalInformation_23_0= ruleAdditionalInformation ) ) )* )? otherlv_24= ']' otherlv_25= '{' (otherlv_26= 'refSemantic' otherlv_27= '{' ( (lv_refSemantic_28_0= ruleRefSemantic ) ) (otherlv_29= ',' ( (lv_refSemantic_30_0= ruleRefSemantic ) ) )* otherlv_31= '}' )? (otherlv_32= 'constraint' otherlv_33= '{' ( (lv_constraint_34_0= ruleAttributeValueRequirement ) ) (otherlv_35= ',' ( (lv_constraint_36_0= ruleAttributeValueRequirement ) ) )* otherlv_37= '}' )? (otherlv_38= 'attributes' otherlv_39= '{' ( (lv_attribute_40_0= ruleAttribute ) ) (otherlv_41= ',' ( (lv_attribute_42_0= ruleAttribute ) ) )* otherlv_43= '}' )? otherlv_44= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_18=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_attributeDataType_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_7_0 = null;

        AntlrDatatypeRuleToken lv_unit_9_0 = null;

        AntlrDatatypeRuleToken lv_iD_12_0 = null;

        Enumerator lv_changeMode_14_0 = null;

        EObject lv_description_15_0 = null;

        EObject lv_version_16_0 = null;

        EObject lv_revision_17_0 = null;

        EObject lv_revision_19_0 = null;

        EObject lv_copyright_20_0 = null;

        EObject lv_additionalInformation_21_0 = null;

        EObject lv_additionalInformation_23_0 = null;

        EObject lv_refSemantic_28_0 = null;

        EObject lv_refSemantic_30_0 = null;

        EObject lv_constraint_34_0 = null;

        EObject lv_constraint_36_0 = null;

        EObject lv_attribute_40_0 = null;

        EObject lv_attribute_42_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:3692:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_attributeDataType_2_0= ruleAttributeDataType ) ) )? otherlv_3= 'values:' (otherlv_4= 'current' ( (lv_value_5_0= ruleEString ) ) )? (otherlv_6= 'default' ( (lv_defaultValue_7_0= ruleEString ) ) )? (otherlv_8= 'in' ( (lv_unit_9_0= ruleEString ) ) )? otherlv_10= '[' (otherlv_11= 'id' ( (lv_iD_12_0= ruleEString ) ) )? (otherlv_13= 'changeMode' ( (lv_changeMode_14_0= ruleChangeMode ) ) )? ( (lv_description_15_0= ruleDescription ) )? ( (lv_version_16_0= ruleVersion ) )? ( ( (lv_revision_17_0= ruleRevision ) ) (otherlv_18= ',' ( (lv_revision_19_0= ruleRevision ) ) )* )? ( (lv_copyright_20_0= ruleCopyright ) )? ( ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) ) (otherlv_22= ',' ( (lv_additionalInformation_23_0= ruleAdditionalInformation ) ) )* )? otherlv_24= ']' otherlv_25= '{' (otherlv_26= 'refSemantic' otherlv_27= '{' ( (lv_refSemantic_28_0= ruleRefSemantic ) ) (otherlv_29= ',' ( (lv_refSemantic_30_0= ruleRefSemantic ) ) )* otherlv_31= '}' )? (otherlv_32= 'constraint' otherlv_33= '{' ( (lv_constraint_34_0= ruleAttributeValueRequirement ) ) (otherlv_35= ',' ( (lv_constraint_36_0= ruleAttributeValueRequirement ) ) )* otherlv_37= '}' )? (otherlv_38= 'attributes' otherlv_39= '{' ( (lv_attribute_40_0= ruleAttribute ) ) (otherlv_41= ',' ( (lv_attribute_42_0= ruleAttribute ) ) )* otherlv_43= '}' )? otherlv_44= '}' ) )
            // InternalCAEXtext.g:3693:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_attributeDataType_2_0= ruleAttributeDataType ) ) )? otherlv_3= 'values:' (otherlv_4= 'current' ( (lv_value_5_0= ruleEString ) ) )? (otherlv_6= 'default' ( (lv_defaultValue_7_0= ruleEString ) ) )? (otherlv_8= 'in' ( (lv_unit_9_0= ruleEString ) ) )? otherlv_10= '[' (otherlv_11= 'id' ( (lv_iD_12_0= ruleEString ) ) )? (otherlv_13= 'changeMode' ( (lv_changeMode_14_0= ruleChangeMode ) ) )? ( (lv_description_15_0= ruleDescription ) )? ( (lv_version_16_0= ruleVersion ) )? ( ( (lv_revision_17_0= ruleRevision ) ) (otherlv_18= ',' ( (lv_revision_19_0= ruleRevision ) ) )* )? ( (lv_copyright_20_0= ruleCopyright ) )? ( ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) ) (otherlv_22= ',' ( (lv_additionalInformation_23_0= ruleAdditionalInformation ) ) )* )? otherlv_24= ']' otherlv_25= '{' (otherlv_26= 'refSemantic' otherlv_27= '{' ( (lv_refSemantic_28_0= ruleRefSemantic ) ) (otherlv_29= ',' ( (lv_refSemantic_30_0= ruleRefSemantic ) ) )* otherlv_31= '}' )? (otherlv_32= 'constraint' otherlv_33= '{' ( (lv_constraint_34_0= ruleAttributeValueRequirement ) ) (otherlv_35= ',' ( (lv_constraint_36_0= ruleAttributeValueRequirement ) ) )* otherlv_37= '}' )? (otherlv_38= 'attributes' otherlv_39= '{' ( (lv_attribute_40_0= ruleAttribute ) ) (otherlv_41= ',' ( (lv_attribute_42_0= ruleAttribute ) ) )* otherlv_43= '}' )? otherlv_44= '}' )
            {
            // InternalCAEXtext.g:3693:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_attributeDataType_2_0= ruleAttributeDataType ) ) )? otherlv_3= 'values:' (otherlv_4= 'current' ( (lv_value_5_0= ruleEString ) ) )? (otherlv_6= 'default' ( (lv_defaultValue_7_0= ruleEString ) ) )? (otherlv_8= 'in' ( (lv_unit_9_0= ruleEString ) ) )? otherlv_10= '[' (otherlv_11= 'id' ( (lv_iD_12_0= ruleEString ) ) )? (otherlv_13= 'changeMode' ( (lv_changeMode_14_0= ruleChangeMode ) ) )? ( (lv_description_15_0= ruleDescription ) )? ( (lv_version_16_0= ruleVersion ) )? ( ( (lv_revision_17_0= ruleRevision ) ) (otherlv_18= ',' ( (lv_revision_19_0= ruleRevision ) ) )* )? ( (lv_copyright_20_0= ruleCopyright ) )? ( ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) ) (otherlv_22= ',' ( (lv_additionalInformation_23_0= ruleAdditionalInformation ) ) )* )? otherlv_24= ']' otherlv_25= '{' (otherlv_26= 'refSemantic' otherlv_27= '{' ( (lv_refSemantic_28_0= ruleRefSemantic ) ) (otherlv_29= ',' ( (lv_refSemantic_30_0= ruleRefSemantic ) ) )* otherlv_31= '}' )? (otherlv_32= 'constraint' otherlv_33= '{' ( (lv_constraint_34_0= ruleAttributeValueRequirement ) ) (otherlv_35= ',' ( (lv_constraint_36_0= ruleAttributeValueRequirement ) ) )* otherlv_37= '}' )? (otherlv_38= 'attributes' otherlv_39= '{' ( (lv_attribute_40_0= ruleAttribute ) ) (otherlv_41= ',' ( (lv_attribute_42_0= ruleAttribute ) ) )* otherlv_43= '}' )? otherlv_44= '}' )
            // InternalCAEXtext.g:3694:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_attributeDataType_2_0= ruleAttributeDataType ) ) )? otherlv_3= 'values:' (otherlv_4= 'current' ( (lv_value_5_0= ruleEString ) ) )? (otherlv_6= 'default' ( (lv_defaultValue_7_0= ruleEString ) ) )? (otherlv_8= 'in' ( (lv_unit_9_0= ruleEString ) ) )? otherlv_10= '[' (otherlv_11= 'id' ( (lv_iD_12_0= ruleEString ) ) )? (otherlv_13= 'changeMode' ( (lv_changeMode_14_0= ruleChangeMode ) ) )? ( (lv_description_15_0= ruleDescription ) )? ( (lv_version_16_0= ruleVersion ) )? ( ( (lv_revision_17_0= ruleRevision ) ) (otherlv_18= ',' ( (lv_revision_19_0= ruleRevision ) ) )* )? ( (lv_copyright_20_0= ruleCopyright ) )? ( ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) ) (otherlv_22= ',' ( (lv_additionalInformation_23_0= ruleAdditionalInformation ) ) )* )? otherlv_24= ']' otherlv_25= '{' (otherlv_26= 'refSemantic' otherlv_27= '{' ( (lv_refSemantic_28_0= ruleRefSemantic ) ) (otherlv_29= ',' ( (lv_refSemantic_30_0= ruleRefSemantic ) ) )* otherlv_31= '}' )? (otherlv_32= 'constraint' otherlv_33= '{' ( (lv_constraint_34_0= ruleAttributeValueRequirement ) ) (otherlv_35= ',' ( (lv_constraint_36_0= ruleAttributeValueRequirement ) ) )* otherlv_37= '}' )? (otherlv_38= 'attributes' otherlv_39= '{' ( (lv_attribute_40_0= ruleAttribute ) ) (otherlv_41= ',' ( (lv_attribute_42_0= ruleAttribute ) ) )* otherlv_43= '}' )? otherlv_44= '}'
            {
            // InternalCAEXtext.g:3694:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCAEXtext.g:3695:4: (lv_name_0_0= ruleEString )
            {
            // InternalCAEXtext.g:3695:4: (lv_name_0_0= ruleEString )
            // InternalCAEXtext.g:3696:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_88);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCAEXtext.g:3713:3: (otherlv_1= ':' ( (lv_attributeDataType_2_0= ruleAttributeDataType ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==35) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalCAEXtext.g:3714:4: otherlv_1= ':' ( (lv_attributeDataType_2_0= ruleAttributeDataType ) )
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_89); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1_0());
                    			
                    // InternalCAEXtext.g:3718:4: ( (lv_attributeDataType_2_0= ruleAttributeDataType ) )
                    // InternalCAEXtext.g:3719:5: (lv_attributeDataType_2_0= ruleAttributeDataType )
                    {
                    // InternalCAEXtext.g:3719:5: (lv_attributeDataType_2_0= ruleAttributeDataType )
                    // InternalCAEXtext.g:3720:6: lv_attributeDataType_2_0= ruleAttributeDataType
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getAttributeDataTypeAttributeDataTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_90);
                    lv_attributeDataType_2_0=ruleAttributeDataType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"attributeDataType",
                    							lv_attributeDataType_2_0,
                    							"caex.caex215.CAEXtext.AttributeDataType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,51,FOLLOW_91); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getValuesKeyword_2());
            		
            // InternalCAEXtext.g:3742:3: (otherlv_4= 'current' ( (lv_value_5_0= ruleEString ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==52) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalCAEXtext.g:3743:4: otherlv_4= 'current' ( (lv_value_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getCurrentKeyword_3_0());
                    			
                    // InternalCAEXtext.g:3747:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalCAEXtext.g:3748:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalCAEXtext.g:3748:5: (lv_value_5_0= ruleEString )
                    // InternalCAEXtext.g:3749:6: lv_value_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_92);
                    lv_value_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:3767:3: (otherlv_6= 'default' ( (lv_defaultValue_7_0= ruleEString ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==53) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalCAEXtext.g:3768:4: otherlv_6= 'default' ( (lv_defaultValue_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getDefaultKeyword_4_0());
                    			
                    // InternalCAEXtext.g:3772:4: ( (lv_defaultValue_7_0= ruleEString ) )
                    // InternalCAEXtext.g:3773:5: (lv_defaultValue_7_0= ruleEString )
                    {
                    // InternalCAEXtext.g:3773:5: (lv_defaultValue_7_0= ruleEString )
                    // InternalCAEXtext.g:3774:6: lv_defaultValue_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getDefaultValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_93);
                    lv_defaultValue_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"defaultValue",
                    							lv_defaultValue_7_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:3792:3: (otherlv_8= 'in' ( (lv_unit_9_0= ruleEString ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==54) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalCAEXtext.g:3793:4: otherlv_8= 'in' ( (lv_unit_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,54,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getInKeyword_5_0());
                    			
                    // InternalCAEXtext.g:3797:4: ( (lv_unit_9_0= ruleEString ) )
                    // InternalCAEXtext.g:3798:5: (lv_unit_9_0= ruleEString )
                    {
                    // InternalCAEXtext.g:3798:5: (lv_unit_9_0= ruleEString )
                    // InternalCAEXtext.g:3799:6: lv_unit_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getUnitEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_unit_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_9_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,12,FOLLOW_94); 

            			newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalCAEXtext.g:3821:3: (otherlv_11= 'id' ( (lv_iD_12_0= ruleEString ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==55) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalCAEXtext.g:3822:4: otherlv_11= 'id' ( (lv_iD_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,55,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getIdKeyword_7_0());
                    			
                    // InternalCAEXtext.g:3826:4: ( (lv_iD_12_0= ruleEString ) )
                    // InternalCAEXtext.g:3827:5: (lv_iD_12_0= ruleEString )
                    {
                    // InternalCAEXtext.g:3827:5: (lv_iD_12_0= ruleEString )
                    // InternalCAEXtext.g:3828:6: lv_iD_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getIDEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_iD_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"iD",
                    							lv_iD_12_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:3846:3: (otherlv_13= 'changeMode' ( (lv_changeMode_14_0= ruleChangeMode ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==13) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalCAEXtext.g:3847:4: otherlv_13= 'changeMode' ( (lv_changeMode_14_0= ruleChangeMode ) )
                    {
                    otherlv_13=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getAttributeAccess().getChangeModeKeyword_8_0());
                    			
                    // InternalCAEXtext.g:3851:4: ( (lv_changeMode_14_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:3852:5: (lv_changeMode_14_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:3852:5: (lv_changeMode_14_0= ruleChangeMode )
                    // InternalCAEXtext.g:3853:6: lv_changeMode_14_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getChangeModeChangeModeEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_changeMode_14_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_14_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:3871:3: ( (lv_description_15_0= ruleDescription ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==20) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalCAEXtext.g:3872:4: (lv_description_15_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:3872:4: (lv_description_15_0= ruleDescription )
                    // InternalCAEXtext.g:3873:5: lv_description_15_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getDescriptionDescriptionParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_description_15_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_15_0,
                    						"caex.caex215.CAEXtext.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:3890:3: ( (lv_version_16_0= ruleVersion ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==22) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalCAEXtext.g:3891:4: (lv_version_16_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:3891:4: (lv_version_16_0= ruleVersion )
                    // InternalCAEXtext.g:3892:5: lv_version_16_0= ruleVersion
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getVersionVersionParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_version_16_0=ruleVersion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"version",
                    						lv_version_16_0,
                    						"caex.caex215.CAEXtext.Version");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:3909:3: ( ( (lv_revision_17_0= ruleRevision ) ) (otherlv_18= ',' ( (lv_revision_19_0= ruleRevision ) ) )* )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==23) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalCAEXtext.g:3910:4: ( (lv_revision_17_0= ruleRevision ) ) (otherlv_18= ',' ( (lv_revision_19_0= ruleRevision ) ) )*
                    {
                    // InternalCAEXtext.g:3910:4: ( (lv_revision_17_0= ruleRevision ) )
                    // InternalCAEXtext.g:3911:5: (lv_revision_17_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:3911:5: (lv_revision_17_0= ruleRevision )
                    // InternalCAEXtext.g:3912:6: lv_revision_17_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getRevisionRevisionParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_revision_17_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_17_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:3929:4: (otherlv_18= ',' ( (lv_revision_19_0= ruleRevision ) ) )*
                    loop127:
                    do {
                        int alt127=2;
                        int LA127_0 = input.LA(1);

                        if ( (LA127_0==14) ) {
                            alt127=1;
                        }


                        switch (alt127) {
                    	case 1 :
                    	    // InternalCAEXtext.g:3930:5: otherlv_18= ',' ( (lv_revision_19_0= ruleRevision ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getAttributeAccess().getCommaKeyword_11_1_0());
                    	    				
                    	    // InternalCAEXtext.g:3934:5: ( (lv_revision_19_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:3935:6: (lv_revision_19_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:3935:6: (lv_revision_19_0= ruleRevision )
                    	    // InternalCAEXtext.g:3936:7: lv_revision_19_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getRevisionRevisionParserRuleCall_11_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_revision_19_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_19_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop127;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCAEXtext.g:3955:3: ( (lv_copyright_20_0= ruleCopyright ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==29) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalCAEXtext.g:3956:4: (lv_copyright_20_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:3956:4: (lv_copyright_20_0= ruleCopyright )
                    // InternalCAEXtext.g:3957:5: lv_copyright_20_0= ruleCopyright
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getCopyrightCopyrightParserRuleCall_12_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_copyright_20_0=ruleCopyright();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"copyright",
                    						lv_copyright_20_0,
                    						"caex.caex215.CAEXtext.Copyright");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:3974:3: ( ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) ) (otherlv_22= ',' ( (lv_additionalInformation_23_0= ruleAdditionalInformation ) ) )* )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==30) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalCAEXtext.g:3975:4: ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) ) (otherlv_22= ',' ( (lv_additionalInformation_23_0= ruleAdditionalInformation ) ) )*
                    {
                    // InternalCAEXtext.g:3975:4: ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:3976:5: (lv_additionalInformation_21_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:3976:5: (lv_additionalInformation_21_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:3977:6: lv_additionalInformation_21_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getAdditionalInformationAdditionalInformationParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_additionalInformation_21_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_21_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:3994:4: (otherlv_22= ',' ( (lv_additionalInformation_23_0= ruleAdditionalInformation ) ) )*
                    loop130:
                    do {
                        int alt130=2;
                        int LA130_0 = input.LA(1);

                        if ( (LA130_0==14) ) {
                            alt130=1;
                        }


                        switch (alt130) {
                    	case 1 :
                    	    // InternalCAEXtext.g:3995:5: otherlv_22= ',' ( (lv_additionalInformation_23_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_22=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getAttributeAccess().getCommaKeyword_13_1_0());
                    	    				
                    	    // InternalCAEXtext.g:3999:5: ( (lv_additionalInformation_23_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:4000:6: (lv_additionalInformation_23_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:4000:6: (lv_additionalInformation_23_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:4001:7: lv_additionalInformation_23_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getAdditionalInformationAdditionalInformationParserRuleCall_13_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_additionalInformation_23_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_23_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop130;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_24=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_24, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_14());
            		
            otherlv_25=(Token)match(input,16,FOLLOW_95); 

            			newLeafNode(otherlv_25, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalCAEXtext.g:4028:3: (otherlv_26= 'refSemantic' otherlv_27= '{' ( (lv_refSemantic_28_0= ruleRefSemantic ) ) (otherlv_29= ',' ( (lv_refSemantic_30_0= ruleRefSemantic ) ) )* otherlv_31= '}' )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==56) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalCAEXtext.g:4029:4: otherlv_26= 'refSemantic' otherlv_27= '{' ( (lv_refSemantic_28_0= ruleRefSemantic ) ) (otherlv_29= ',' ( (lv_refSemantic_30_0= ruleRefSemantic ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,56,FOLLOW_14); 

                    				newLeafNode(otherlv_26, grammarAccess.getAttributeAccess().getRefSemanticKeyword_16_0());
                    			
                    otherlv_27=(Token)match(input,16,FOLLOW_96); 

                    				newLeafNode(otherlv_27, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalCAEXtext.g:4037:4: ( (lv_refSemantic_28_0= ruleRefSemantic ) )
                    // InternalCAEXtext.g:4038:5: (lv_refSemantic_28_0= ruleRefSemantic )
                    {
                    // InternalCAEXtext.g:4038:5: (lv_refSemantic_28_0= ruleRefSemantic )
                    // InternalCAEXtext.g:4039:6: lv_refSemantic_28_0= ruleRefSemantic
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getRefSemanticRefSemanticParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_refSemantic_28_0=ruleRefSemantic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						add(
                    							current,
                    							"refSemantic",
                    							lv_refSemantic_28_0,
                    							"caex.caex215.CAEXtext.RefSemantic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:4056:4: (otherlv_29= ',' ( (lv_refSemantic_30_0= ruleRefSemantic ) ) )*
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==14) ) {
                            alt132=1;
                        }


                        switch (alt132) {
                    	case 1 :
                    	    // InternalCAEXtext.g:4057:5: otherlv_29= ',' ( (lv_refSemantic_30_0= ruleRefSemantic ) )
                    	    {
                    	    otherlv_29=(Token)match(input,14,FOLLOW_96); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getAttributeAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalCAEXtext.g:4061:5: ( (lv_refSemantic_30_0= ruleRefSemantic ) )
                    	    // InternalCAEXtext.g:4062:6: (lv_refSemantic_30_0= ruleRefSemantic )
                    	    {
                    	    // InternalCAEXtext.g:4062:6: (lv_refSemantic_30_0= ruleRefSemantic )
                    	    // InternalCAEXtext.g:4063:7: lv_refSemantic_30_0= ruleRefSemantic
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getRefSemanticRefSemanticParserRuleCall_16_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_refSemantic_30_0=ruleRefSemantic();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"refSemantic",
                    	    								lv_refSemantic_30_0,
                    	    								"caex.caex215.CAEXtext.RefSemantic");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop132;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,19,FOLLOW_97); 

                    				newLeafNode(otherlv_31, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:4086:3: (otherlv_32= 'constraint' otherlv_33= '{' ( (lv_constraint_34_0= ruleAttributeValueRequirement ) ) (otherlv_35= ',' ( (lv_constraint_36_0= ruleAttributeValueRequirement ) ) )* otherlv_37= '}' )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==57) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalCAEXtext.g:4087:4: otherlv_32= 'constraint' otherlv_33= '{' ( (lv_constraint_34_0= ruleAttributeValueRequirement ) ) (otherlv_35= ',' ( (lv_constraint_36_0= ruleAttributeValueRequirement ) ) )* otherlv_37= '}'
                    {
                    otherlv_32=(Token)match(input,57,FOLLOW_14); 

                    				newLeafNode(otherlv_32, grammarAccess.getAttributeAccess().getConstraintKeyword_17_0());
                    			
                    otherlv_33=(Token)match(input,16,FOLLOW_98); 

                    				newLeafNode(otherlv_33, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_17_1());
                    			
                    // InternalCAEXtext.g:4095:4: ( (lv_constraint_34_0= ruleAttributeValueRequirement ) )
                    // InternalCAEXtext.g:4096:5: (lv_constraint_34_0= ruleAttributeValueRequirement )
                    {
                    // InternalCAEXtext.g:4096:5: (lv_constraint_34_0= ruleAttributeValueRequirement )
                    // InternalCAEXtext.g:4097:6: lv_constraint_34_0= ruleAttributeValueRequirement
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getConstraintAttributeValueRequirementParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_constraint_34_0=ruleAttributeValueRequirement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						add(
                    							current,
                    							"constraint",
                    							lv_constraint_34_0,
                    							"caex.caex215.CAEXtext.AttributeValueRequirement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:4114:4: (otherlv_35= ',' ( (lv_constraint_36_0= ruleAttributeValueRequirement ) ) )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==14) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // InternalCAEXtext.g:4115:5: otherlv_35= ',' ( (lv_constraint_36_0= ruleAttributeValueRequirement ) )
                    	    {
                    	    otherlv_35=(Token)match(input,14,FOLLOW_98); 

                    	    					newLeafNode(otherlv_35, grammarAccess.getAttributeAccess().getCommaKeyword_17_3_0());
                    	    				
                    	    // InternalCAEXtext.g:4119:5: ( (lv_constraint_36_0= ruleAttributeValueRequirement ) )
                    	    // InternalCAEXtext.g:4120:6: (lv_constraint_36_0= ruleAttributeValueRequirement )
                    	    {
                    	    // InternalCAEXtext.g:4120:6: (lv_constraint_36_0= ruleAttributeValueRequirement )
                    	    // InternalCAEXtext.g:4121:7: lv_constraint_36_0= ruleAttributeValueRequirement
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getConstraintAttributeValueRequirementParserRuleCall_17_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_constraint_36_0=ruleAttributeValueRequirement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constraint",
                    	    								lv_constraint_36_0,
                    	    								"caex.caex215.CAEXtext.AttributeValueRequirement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop134;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,19,FOLLOW_78); 

                    				newLeafNode(otherlv_37, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_17_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:4144:3: (otherlv_38= 'attributes' otherlv_39= '{' ( (lv_attribute_40_0= ruleAttribute ) ) (otherlv_41= ',' ( (lv_attribute_42_0= ruleAttribute ) ) )* otherlv_43= '}' )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==44) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalCAEXtext.g:4145:4: otherlv_38= 'attributes' otherlv_39= '{' ( (lv_attribute_40_0= ruleAttribute ) ) (otherlv_41= ',' ( (lv_attribute_42_0= ruleAttribute ) ) )* otherlv_43= '}'
                    {
                    otherlv_38=(Token)match(input,44,FOLLOW_14); 

                    				newLeafNode(otherlv_38, grammarAccess.getAttributeAccess().getAttributesKeyword_18_0());
                    			
                    otherlv_39=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_39, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_18_1());
                    			
                    // InternalCAEXtext.g:4153:4: ( (lv_attribute_40_0= ruleAttribute ) )
                    // InternalCAEXtext.g:4154:5: (lv_attribute_40_0= ruleAttribute )
                    {
                    // InternalCAEXtext.g:4154:5: (lv_attribute_40_0= ruleAttribute )
                    // InternalCAEXtext.g:4155:6: lv_attribute_40_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getAttributeAttributeParserRuleCall_18_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_attribute_40_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						add(
                    							current,
                    							"attribute",
                    							lv_attribute_40_0,
                    							"caex.caex215.CAEXtext.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:4172:4: (otherlv_41= ',' ( (lv_attribute_42_0= ruleAttribute ) ) )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==14) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // InternalCAEXtext.g:4173:5: otherlv_41= ',' ( (lv_attribute_42_0= ruleAttribute ) )
                    	    {
                    	    otherlv_41=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_41, grammarAccess.getAttributeAccess().getCommaKeyword_18_3_0());
                    	    				
                    	    // InternalCAEXtext.g:4177:5: ( (lv_attribute_42_0= ruleAttribute ) )
                    	    // InternalCAEXtext.g:4178:6: (lv_attribute_42_0= ruleAttribute )
                    	    {
                    	    // InternalCAEXtext.g:4178:6: (lv_attribute_42_0= ruleAttribute )
                    	    // InternalCAEXtext.g:4179:7: lv_attribute_42_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getAttributeAttributeParserRuleCall_18_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_attribute_42_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attribute",
                    	    								lv_attribute_42_0,
                    	    								"caex.caex215.CAEXtext.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);

                    otherlv_43=(Token)match(input,19,FOLLOW_31); 

                    				newLeafNode(otherlv_43, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_18_4());
                    			

                    }
                    break;

            }

            otherlv_44=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_44, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_19());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleInterfaceClass_Impl"
    // InternalCAEXtext.g:4210:1: entryRuleInterfaceClass_Impl returns [EObject current=null] : iv_ruleInterfaceClass_Impl= ruleInterfaceClass_Impl EOF ;
    public final EObject entryRuleInterfaceClass_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceClass_Impl = null;


        try {
            // InternalCAEXtext.g:4210:60: (iv_ruleInterfaceClass_Impl= ruleInterfaceClass_Impl EOF )
            // InternalCAEXtext.g:4211:2: iv_ruleInterfaceClass_Impl= ruleInterfaceClass_Impl EOF
            {
             newCompositeNode(grammarAccess.getInterfaceClass_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceClass_Impl=ruleInterfaceClass_Impl();

            state._fsp--;

             current =iv_ruleInterfaceClass_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInterfaceClass_Impl"


    // $ANTLR start "ruleInterfaceClass_Impl"
    // InternalCAEXtext.g:4217:1: ruleInterfaceClass_Impl returns [EObject current=null] : (otherlv_0= 'InterfaceClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'interfaceClass' otherlv_37= '{' ( (lv_interfaceClass_38_0= ruleInterfaceClass ) ) (otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) ) )* otherlv_41= '}' )? otherlv_42= '}' ) ;
    public final EObject ruleInterfaceClass_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Enumerator lv_changeMode_3_0 = null;

        AntlrDatatypeRuleToken lv_iD_5_0 = null;

        AntlrDatatypeRuleToken lv_refBaseClassPath_9_0 = null;

        EObject lv_description_13_0 = null;

        EObject lv_version_15_0 = null;

        EObject lv_revision_18_0 = null;

        EObject lv_revision_20_0 = null;

        EObject lv_copyright_23_0 = null;

        EObject lv_additionalInformation_26_0 = null;

        EObject lv_additionalInformation_28_0 = null;

        EObject lv_attribute_32_0 = null;

        EObject lv_attribute_34_0 = null;

        EObject lv_interfaceClass_38_0 = null;

        EObject lv_interfaceClass_40_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:4223:2: ( (otherlv_0= 'InterfaceClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'interfaceClass' otherlv_37= '{' ( (lv_interfaceClass_38_0= ruleInterfaceClass ) ) (otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) ) )* otherlv_41= '}' )? otherlv_42= '}' ) )
            // InternalCAEXtext.g:4224:2: (otherlv_0= 'InterfaceClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'interfaceClass' otherlv_37= '{' ( (lv_interfaceClass_38_0= ruleInterfaceClass ) ) (otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) ) )* otherlv_41= '}' )? otherlv_42= '}' )
            {
            // InternalCAEXtext.g:4224:2: (otherlv_0= 'InterfaceClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'interfaceClass' otherlv_37= '{' ( (lv_interfaceClass_38_0= ruleInterfaceClass ) ) (otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) ) )* otherlv_41= '}' )? otherlv_42= '}' )
            // InternalCAEXtext.g:4225:3: otherlv_0= 'InterfaceClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'interfaceClass' otherlv_37= '{' ( (lv_interfaceClass_38_0= ruleInterfaceClass ) ) (otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) ) )* otherlv_41= '}' )? otherlv_42= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceClass_ImplAccess().getInterfaceClassKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceClass_ImplAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCAEXtext.g:4233:3: (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==13) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalCAEXtext.g:4234:4: otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getInterfaceClass_ImplAccess().getChangeModeKeyword_2_0());
                    			
                    // InternalCAEXtext.g:4238:4: ( (lv_changeMode_3_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:4239:5: (lv_changeMode_3_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:4239:5: (lv_changeMode_3_0= ruleChangeMode )
                    // InternalCAEXtext.g:4240:6: lv_changeMode_3_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getInterfaceClass_ImplAccess().getChangeModeChangeModeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_changeMode_3_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_3_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:4258:3: (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==37) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalCAEXtext.g:4259:4: otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getInterfaceClass_ImplAccess().getIDKeyword_3_0());
                    			
                    // InternalCAEXtext.g:4263:4: ( (lv_iD_5_0= ruleEString ) )
                    // InternalCAEXtext.g:4264:5: (lv_iD_5_0= ruleEString )
                    {
                    // InternalCAEXtext.g:4264:5: (lv_iD_5_0= ruleEString )
                    // InternalCAEXtext.g:4265:6: lv_iD_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInterfaceClass_ImplAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_iD_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"iD",
                    							lv_iD_5_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,38,FOLLOW_99); 

            			newLeafNode(otherlv_6, grammarAccess.getInterfaceClass_ImplAccess().getNameKeyword_4());
            		
            // InternalCAEXtext.g:4287:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalCAEXtext.g:4288:4: (lv_name_7_0= RULE_ID )
            {
            // InternalCAEXtext.g:4288:4: (lv_name_7_0= RULE_ID )
            // InternalCAEXtext.g:4289:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_100); 

            					newLeafNode(lv_name_7_0, grammarAccess.getInterfaceClass_ImplAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceClass_ImplRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCAEXtext.g:4305:3: (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==59) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalCAEXtext.g:4306:4: otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getInterfaceClass_ImplAccess().getRefBaseClassPathKeyword_6_0());
                    			
                    // InternalCAEXtext.g:4310:4: ( (lv_refBaseClassPath_9_0= ruleEString ) )
                    // InternalCAEXtext.g:4311:5: (lv_refBaseClassPath_9_0= ruleEString )
                    {
                    // InternalCAEXtext.g:4311:5: (lv_refBaseClassPath_9_0= ruleEString )
                    // InternalCAEXtext.g:4312:6: lv_refBaseClassPath_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInterfaceClass_ImplAccess().getRefBaseClassPathEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_101);
                    lv_refBaseClassPath_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"refBaseClassPath",
                    							lv_refBaseClassPath_9_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:4330:3: (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==60) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalCAEXtext.g:4331:4: otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,60,FOLLOW_99); 

                    				newLeafNode(otherlv_10, grammarAccess.getInterfaceClass_ImplAccess().getBaseClassKeyword_7_0());
                    			
                    // InternalCAEXtext.g:4335:4: ( (otherlv_11= RULE_ID ) )
                    // InternalCAEXtext.g:4336:5: (otherlv_11= RULE_ID )
                    {
                    // InternalCAEXtext.g:4336:5: (otherlv_11= RULE_ID )
                    // InternalCAEXtext.g:4337:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInterfaceClass_ImplRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_102); 

                    						newLeafNode(otherlv_11, grammarAccess.getInterfaceClass_ImplAccess().getBaseClassInterfaceClassCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:4349:3: (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==61) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalCAEXtext.g:4350:4: otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) )
                    {
                    otherlv_12=(Token)match(input,61,FOLLOW_103); 

                    				newLeafNode(otherlv_12, grammarAccess.getInterfaceClass_ImplAccess().getDescriptionKeyword_8_0());
                    			
                    // InternalCAEXtext.g:4354:4: ( (lv_description_13_0= ruleDescription ) )
                    // InternalCAEXtext.g:4355:5: (lv_description_13_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:4355:5: (lv_description_13_0= ruleDescription )
                    // InternalCAEXtext.g:4356:6: lv_description_13_0= ruleDescription
                    {

                    						newCompositeNode(grammarAccess.getInterfaceClass_ImplAccess().getDescriptionDescriptionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_104);
                    lv_description_13_0=ruleDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_13_0,
                    							"caex.caex215.CAEXtext.Description");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:4374:3: (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==62) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalCAEXtext.g:4375:4: otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) )
                    {
                    otherlv_14=(Token)match(input,62,FOLLOW_105); 

                    				newLeafNode(otherlv_14, grammarAccess.getInterfaceClass_ImplAccess().getVersionKeyword_9_0());
                    			
                    // InternalCAEXtext.g:4379:4: ( (lv_version_15_0= ruleVersion ) )
                    // InternalCAEXtext.g:4380:5: (lv_version_15_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:4380:5: (lv_version_15_0= ruleVersion )
                    // InternalCAEXtext.g:4381:6: lv_version_15_0= ruleVersion
                    {

                    						newCompositeNode(grammarAccess.getInterfaceClass_ImplAccess().getVersionVersionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_106);
                    lv_version_15_0=ruleVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_15_0,
                    							"caex.caex215.CAEXtext.Version");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:4399:3: (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==63) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalCAEXtext.g:4400:4: otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,63,FOLLOW_14); 

                    				newLeafNode(otherlv_16, grammarAccess.getInterfaceClass_ImplAccess().getRevisionKeyword_10_0());
                    			
                    otherlv_17=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_17, grammarAccess.getInterfaceClass_ImplAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalCAEXtext.g:4408:4: ( (lv_revision_18_0= ruleRevision ) )
                    // InternalCAEXtext.g:4409:5: (lv_revision_18_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:4409:5: (lv_revision_18_0= ruleRevision )
                    // InternalCAEXtext.g:4410:6: lv_revision_18_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getInterfaceClass_ImplAccess().getRevisionRevisionParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_revision_18_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceClass_ImplRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_18_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:4427:4: (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )*
                    loop144:
                    do {
                        int alt144=2;
                        int LA144_0 = input.LA(1);

                        if ( (LA144_0==14) ) {
                            alt144=1;
                        }


                        switch (alt144) {
                    	case 1 :
                    	    // InternalCAEXtext.g:4428:5: otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getInterfaceClass_ImplAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalCAEXtext.g:4432:5: ( (lv_revision_20_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:4433:6: (lv_revision_20_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:4433:6: (lv_revision_20_0= ruleRevision )
                    	    // InternalCAEXtext.g:4434:7: lv_revision_20_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceClass_ImplAccess().getRevisionRevisionParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_revision_20_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceClass_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_20_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop144;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,19,FOLLOW_107); 

                    				newLeafNode(otherlv_21, grammarAccess.getInterfaceClass_ImplAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:4457:3: (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==64) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalCAEXtext.g:4458:4: otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) )
                    {
                    otherlv_22=(Token)match(input,64,FOLLOW_108); 

                    				newLeafNode(otherlv_22, grammarAccess.getInterfaceClass_ImplAccess().getCopyrightKeyword_11_0());
                    			
                    // InternalCAEXtext.g:4462:4: ( (lv_copyright_23_0= ruleCopyright ) )
                    // InternalCAEXtext.g:4463:5: (lv_copyright_23_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:4463:5: (lv_copyright_23_0= ruleCopyright )
                    // InternalCAEXtext.g:4464:6: lv_copyright_23_0= ruleCopyright
                    {

                    						newCompositeNode(grammarAccess.getInterfaceClass_ImplAccess().getCopyrightCopyrightParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_109);
                    lv_copyright_23_0=ruleCopyright();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"copyright",
                    							lv_copyright_23_0,
                    							"caex.caex215.CAEXtext.Copyright");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:4482:3: (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==65) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalCAEXtext.g:4483:4: otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,65,FOLLOW_14); 

                    				newLeafNode(otherlv_24, grammarAccess.getInterfaceClass_ImplAccess().getAdditionalInformationKeyword_12_0());
                    			
                    otherlv_25=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_25, grammarAccess.getInterfaceClass_ImplAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalCAEXtext.g:4491:4: ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:4492:5: (lv_additionalInformation_26_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:4492:5: (lv_additionalInformation_26_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:4493:6: lv_additionalInformation_26_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getInterfaceClass_ImplAccess().getAdditionalInformationAdditionalInformationParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_additionalInformation_26_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceClass_ImplRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_26_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:4510:4: (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )*
                    loop147:
                    do {
                        int alt147=2;
                        int LA147_0 = input.LA(1);

                        if ( (LA147_0==14) ) {
                            alt147=1;
                        }


                        switch (alt147) {
                    	case 1 :
                    	    // InternalCAEXtext.g:4511:5: otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_27=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getInterfaceClass_ImplAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalCAEXtext.g:4515:5: ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:4516:6: (lv_additionalInformation_28_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:4516:6: (lv_additionalInformation_28_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:4517:7: lv_additionalInformation_28_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceClass_ImplAccess().getAdditionalInformationAdditionalInformationParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_additionalInformation_28_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceClass_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_28_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop147;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,19,FOLLOW_110); 

                    				newLeafNode(otherlv_29, grammarAccess.getInterfaceClass_ImplAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:4540:3: (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==66) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalCAEXtext.g:4541:4: otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,66,FOLLOW_14); 

                    				newLeafNode(otherlv_30, grammarAccess.getInterfaceClass_ImplAccess().getAttributeKeyword_13_0());
                    			
                    otherlv_31=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_31, grammarAccess.getInterfaceClass_ImplAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalCAEXtext.g:4549:4: ( (lv_attribute_32_0= ruleAttribute ) )
                    // InternalCAEXtext.g:4550:5: (lv_attribute_32_0= ruleAttribute )
                    {
                    // InternalCAEXtext.g:4550:5: (lv_attribute_32_0= ruleAttribute )
                    // InternalCAEXtext.g:4551:6: lv_attribute_32_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getInterfaceClass_ImplAccess().getAttributeAttributeParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_attribute_32_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceClass_ImplRule());
                    						}
                    						add(
                    							current,
                    							"attribute",
                    							lv_attribute_32_0,
                    							"caex.caex215.CAEXtext.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:4568:4: (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )*
                    loop149:
                    do {
                        int alt149=2;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==14) ) {
                            alt149=1;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // InternalCAEXtext.g:4569:5: otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) )
                    	    {
                    	    otherlv_33=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getInterfaceClass_ImplAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalCAEXtext.g:4573:5: ( (lv_attribute_34_0= ruleAttribute ) )
                    	    // InternalCAEXtext.g:4574:6: (lv_attribute_34_0= ruleAttribute )
                    	    {
                    	    // InternalCAEXtext.g:4574:6: (lv_attribute_34_0= ruleAttribute )
                    	    // InternalCAEXtext.g:4575:7: lv_attribute_34_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceClass_ImplAccess().getAttributeAttributeParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_attribute_34_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceClass_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attribute",
                    	    								lv_attribute_34_0,
                    	    								"caex.caex215.CAEXtext.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop149;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,19,FOLLOW_111); 

                    				newLeafNode(otherlv_35, grammarAccess.getInterfaceClass_ImplAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:4598:3: (otherlv_36= 'interfaceClass' otherlv_37= '{' ( (lv_interfaceClass_38_0= ruleInterfaceClass ) ) (otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) ) )* otherlv_41= '}' )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==67) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalCAEXtext.g:4599:4: otherlv_36= 'interfaceClass' otherlv_37= '{' ( (lv_interfaceClass_38_0= ruleInterfaceClass ) ) (otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) ) )* otherlv_41= '}'
                    {
                    otherlv_36=(Token)match(input,67,FOLLOW_14); 

                    				newLeafNode(otherlv_36, grammarAccess.getInterfaceClass_ImplAccess().getInterfaceClassKeyword_14_0());
                    			
                    otherlv_37=(Token)match(input,16,FOLLOW_60); 

                    				newLeafNode(otherlv_37, grammarAccess.getInterfaceClass_ImplAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalCAEXtext.g:4607:4: ( (lv_interfaceClass_38_0= ruleInterfaceClass ) )
                    // InternalCAEXtext.g:4608:5: (lv_interfaceClass_38_0= ruleInterfaceClass )
                    {
                    // InternalCAEXtext.g:4608:5: (lv_interfaceClass_38_0= ruleInterfaceClass )
                    // InternalCAEXtext.g:4609:6: lv_interfaceClass_38_0= ruleInterfaceClass
                    {

                    						newCompositeNode(grammarAccess.getInterfaceClass_ImplAccess().getInterfaceClassInterfaceClassParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_interfaceClass_38_0=ruleInterfaceClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceClass_ImplRule());
                    						}
                    						add(
                    							current,
                    							"interfaceClass",
                    							lv_interfaceClass_38_0,
                    							"caex.caex215.CAEXtext.InterfaceClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:4626:4: (otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) ) )*
                    loop151:
                    do {
                        int alt151=2;
                        int LA151_0 = input.LA(1);

                        if ( (LA151_0==14) ) {
                            alt151=1;
                        }


                        switch (alt151) {
                    	case 1 :
                    	    // InternalCAEXtext.g:4627:5: otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) )
                    	    {
                    	    otherlv_39=(Token)match(input,14,FOLLOW_60); 

                    	    					newLeafNode(otherlv_39, grammarAccess.getInterfaceClass_ImplAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalCAEXtext.g:4631:5: ( (lv_interfaceClass_40_0= ruleInterfaceClass ) )
                    	    // InternalCAEXtext.g:4632:6: (lv_interfaceClass_40_0= ruleInterfaceClass )
                    	    {
                    	    // InternalCAEXtext.g:4632:6: (lv_interfaceClass_40_0= ruleInterfaceClass )
                    	    // InternalCAEXtext.g:4633:7: lv_interfaceClass_40_0= ruleInterfaceClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceClass_ImplAccess().getInterfaceClassInterfaceClassParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_interfaceClass_40_0=ruleInterfaceClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceClass_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaceClass",
                    	    								lv_interfaceClass_40_0,
                    	    								"caex.caex215.CAEXtext.InterfaceClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop151;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,19,FOLLOW_31); 

                    				newLeafNode(otherlv_41, grammarAccess.getInterfaceClass_ImplAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            otherlv_42=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_42, grammarAccess.getInterfaceClass_ImplAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceClass_Impl"


    // $ANTLR start "entryRuleSupportedRoleClass"
    // InternalCAEXtext.g:4664:1: entryRuleSupportedRoleClass returns [EObject current=null] : iv_ruleSupportedRoleClass= ruleSupportedRoleClass EOF ;
    public final EObject entryRuleSupportedRoleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportedRoleClass = null;


        try {
            // InternalCAEXtext.g:4664:59: (iv_ruleSupportedRoleClass= ruleSupportedRoleClass EOF )
            // InternalCAEXtext.g:4665:2: iv_ruleSupportedRoleClass= ruleSupportedRoleClass EOF
            {
             newCompositeNode(grammarAccess.getSupportedRoleClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSupportedRoleClass=ruleSupportedRoleClass();

            state._fsp--;

             current =iv_ruleSupportedRoleClass; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSupportedRoleClass"


    // $ANTLR start "ruleSupportedRoleClass"
    // InternalCAEXtext.g:4671:1: ruleSupportedRoleClass returns [EObject current=null] : (otherlv_0= 'SupportedRoleClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'refRoleClassPath' ( (lv_refRoleClassPath_5_0= ruleEString ) ) otherlv_6= 'roleClass' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )? (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )? (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )? (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )? (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )? (otherlv_26= 'mappingObject' ( (lv_mappingObject_27_0= ruleMapping ) ) )? otherlv_28= '}' ) ;
    public final EObject ruleSupportedRoleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Enumerator lv_changeMode_3_0 = null;

        AntlrDatatypeRuleToken lv_refRoleClassPath_5_0 = null;

        EObject lv_description_9_0 = null;

        EObject lv_version_11_0 = null;

        EObject lv_revision_14_0 = null;

        EObject lv_revision_16_0 = null;

        EObject lv_copyright_19_0 = null;

        EObject lv_additionalInformation_22_0 = null;

        EObject lv_additionalInformation_24_0 = null;

        EObject lv_mappingObject_27_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:4677:2: ( (otherlv_0= 'SupportedRoleClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'refRoleClassPath' ( (lv_refRoleClassPath_5_0= ruleEString ) ) otherlv_6= 'roleClass' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )? (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )? (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )? (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )? (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )? (otherlv_26= 'mappingObject' ( (lv_mappingObject_27_0= ruleMapping ) ) )? otherlv_28= '}' ) )
            // InternalCAEXtext.g:4678:2: (otherlv_0= 'SupportedRoleClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'refRoleClassPath' ( (lv_refRoleClassPath_5_0= ruleEString ) ) otherlv_6= 'roleClass' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )? (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )? (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )? (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )? (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )? (otherlv_26= 'mappingObject' ( (lv_mappingObject_27_0= ruleMapping ) ) )? otherlv_28= '}' )
            {
            // InternalCAEXtext.g:4678:2: (otherlv_0= 'SupportedRoleClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'refRoleClassPath' ( (lv_refRoleClassPath_5_0= ruleEString ) ) otherlv_6= 'roleClass' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )? (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )? (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )? (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )? (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )? (otherlv_26= 'mappingObject' ( (lv_mappingObject_27_0= ruleMapping ) ) )? otherlv_28= '}' )
            // InternalCAEXtext.g:4679:3: otherlv_0= 'SupportedRoleClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'refRoleClassPath' ( (lv_refRoleClassPath_5_0= ruleEString ) ) otherlv_6= 'roleClass' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )? (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )? (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )? (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )? (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )? (otherlv_26= 'mappingObject' ( (lv_mappingObject_27_0= ruleMapping ) ) )? otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSupportedRoleClassAccess().getSupportedRoleClassKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_112); 

            			newLeafNode(otherlv_1, grammarAccess.getSupportedRoleClassAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCAEXtext.g:4687:3: (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==13) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalCAEXtext.g:4688:4: otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getSupportedRoleClassAccess().getChangeModeKeyword_2_0());
                    			
                    // InternalCAEXtext.g:4692:4: ( (lv_changeMode_3_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:4693:5: (lv_changeMode_3_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:4693:5: (lv_changeMode_3_0= ruleChangeMode )
                    // InternalCAEXtext.g:4694:6: lv_changeMode_3_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getSupportedRoleClassAccess().getChangeModeChangeModeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_113);
                    lv_changeMode_3_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSupportedRoleClassRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_3_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,69,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getSupportedRoleClassAccess().getRefRoleClassPathKeyword_3());
            		
            // InternalCAEXtext.g:4716:3: ( (lv_refRoleClassPath_5_0= ruleEString ) )
            // InternalCAEXtext.g:4717:4: (lv_refRoleClassPath_5_0= ruleEString )
            {
            // InternalCAEXtext.g:4717:4: (lv_refRoleClassPath_5_0= ruleEString )
            // InternalCAEXtext.g:4718:5: lv_refRoleClassPath_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSupportedRoleClassAccess().getRefRoleClassPathEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_114);
            lv_refRoleClassPath_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSupportedRoleClassRule());
            					}
            					set(
            						current,
            						"refRoleClassPath",
            						lv_refRoleClassPath_5_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,70,FOLLOW_99); 

            			newLeafNode(otherlv_6, grammarAccess.getSupportedRoleClassAccess().getRoleClassKeyword_5());
            		
            // InternalCAEXtext.g:4739:3: ( (otherlv_7= RULE_ID ) )
            // InternalCAEXtext.g:4740:4: (otherlv_7= RULE_ID )
            {
            // InternalCAEXtext.g:4740:4: (otherlv_7= RULE_ID )
            // InternalCAEXtext.g:4741:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSupportedRoleClassRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_115); 

            					newLeafNode(otherlv_7, grammarAccess.getSupportedRoleClassAccess().getRoleClassRoleClassCrossReference_6_0());
            				

            }


            }

            // InternalCAEXtext.g:4752:3: (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==61) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalCAEXtext.g:4753:4: otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) )
                    {
                    otherlv_8=(Token)match(input,61,FOLLOW_103); 

                    				newLeafNode(otherlv_8, grammarAccess.getSupportedRoleClassAccess().getDescriptionKeyword_7_0());
                    			
                    // InternalCAEXtext.g:4757:4: ( (lv_description_9_0= ruleDescription ) )
                    // InternalCAEXtext.g:4758:5: (lv_description_9_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:4758:5: (lv_description_9_0= ruleDescription )
                    // InternalCAEXtext.g:4759:6: lv_description_9_0= ruleDescription
                    {

                    						newCompositeNode(grammarAccess.getSupportedRoleClassAccess().getDescriptionDescriptionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_116);
                    lv_description_9_0=ruleDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSupportedRoleClassRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"caex.caex215.CAEXtext.Description");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:4777:3: (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==62) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalCAEXtext.g:4778:4: otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) )
                    {
                    otherlv_10=(Token)match(input,62,FOLLOW_105); 

                    				newLeafNode(otherlv_10, grammarAccess.getSupportedRoleClassAccess().getVersionKeyword_8_0());
                    			
                    // InternalCAEXtext.g:4782:4: ( (lv_version_11_0= ruleVersion ) )
                    // InternalCAEXtext.g:4783:5: (lv_version_11_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:4783:5: (lv_version_11_0= ruleVersion )
                    // InternalCAEXtext.g:4784:6: lv_version_11_0= ruleVersion
                    {

                    						newCompositeNode(grammarAccess.getSupportedRoleClassAccess().getVersionVersionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_117);
                    lv_version_11_0=ruleVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSupportedRoleClassRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_11_0,
                    							"caex.caex215.CAEXtext.Version");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:4802:3: (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==63) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalCAEXtext.g:4803:4: otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,63,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getSupportedRoleClassAccess().getRevisionKeyword_9_0());
                    			
                    otherlv_13=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getSupportedRoleClassAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalCAEXtext.g:4811:4: ( (lv_revision_14_0= ruleRevision ) )
                    // InternalCAEXtext.g:4812:5: (lv_revision_14_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:4812:5: (lv_revision_14_0= ruleRevision )
                    // InternalCAEXtext.g:4813:6: lv_revision_14_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getSupportedRoleClassAccess().getRevisionRevisionParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_revision_14_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSupportedRoleClassRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_14_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:4830:4: (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )*
                    loop156:
                    do {
                        int alt156=2;
                        int LA156_0 = input.LA(1);

                        if ( (LA156_0==14) ) {
                            alt156=1;
                        }


                        switch (alt156) {
                    	case 1 :
                    	    // InternalCAEXtext.g:4831:5: otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getSupportedRoleClassAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalCAEXtext.g:4835:5: ( (lv_revision_16_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:4836:6: (lv_revision_16_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:4836:6: (lv_revision_16_0= ruleRevision )
                    	    // InternalCAEXtext.g:4837:7: lv_revision_16_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getSupportedRoleClassAccess().getRevisionRevisionParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_revision_16_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSupportedRoleClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_16_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop156;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_118); 

                    				newLeafNode(otherlv_17, grammarAccess.getSupportedRoleClassAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:4860:3: (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==64) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalCAEXtext.g:4861:4: otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) )
                    {
                    otherlv_18=(Token)match(input,64,FOLLOW_108); 

                    				newLeafNode(otherlv_18, grammarAccess.getSupportedRoleClassAccess().getCopyrightKeyword_10_0());
                    			
                    // InternalCAEXtext.g:4865:4: ( (lv_copyright_19_0= ruleCopyright ) )
                    // InternalCAEXtext.g:4866:5: (lv_copyright_19_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:4866:5: (lv_copyright_19_0= ruleCopyright )
                    // InternalCAEXtext.g:4867:6: lv_copyright_19_0= ruleCopyright
                    {

                    						newCompositeNode(grammarAccess.getSupportedRoleClassAccess().getCopyrightCopyrightParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_119);
                    lv_copyright_19_0=ruleCopyright();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSupportedRoleClassRule());
                    						}
                    						set(
                    							current,
                    							"copyright",
                    							lv_copyright_19_0,
                    							"caex.caex215.CAEXtext.Copyright");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:4885:3: (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==65) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // InternalCAEXtext.g:4886:4: otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,65,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getSupportedRoleClassAccess().getAdditionalInformationKeyword_11_0());
                    			
                    otherlv_21=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getSupportedRoleClassAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalCAEXtext.g:4894:4: ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:4895:5: (lv_additionalInformation_22_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:4895:5: (lv_additionalInformation_22_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:4896:6: lv_additionalInformation_22_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getSupportedRoleClassAccess().getAdditionalInformationAdditionalInformationParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_additionalInformation_22_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSupportedRoleClassRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_22_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:4913:4: (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )*
                    loop159:
                    do {
                        int alt159=2;
                        int LA159_0 = input.LA(1);

                        if ( (LA159_0==14) ) {
                            alt159=1;
                        }


                        switch (alt159) {
                    	case 1 :
                    	    // InternalCAEXtext.g:4914:5: otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getSupportedRoleClassAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalCAEXtext.g:4918:5: ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:4919:6: (lv_additionalInformation_24_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:4919:6: (lv_additionalInformation_24_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:4920:7: lv_additionalInformation_24_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getSupportedRoleClassAccess().getAdditionalInformationAdditionalInformationParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_additionalInformation_24_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSupportedRoleClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_24_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop159;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,19,FOLLOW_120); 

                    				newLeafNode(otherlv_25, grammarAccess.getSupportedRoleClassAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:4943:3: (otherlv_26= 'mappingObject' ( (lv_mappingObject_27_0= ruleMapping ) ) )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==71) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // InternalCAEXtext.g:4944:4: otherlv_26= 'mappingObject' ( (lv_mappingObject_27_0= ruleMapping ) )
                    {
                    otherlv_26=(Token)match(input,71,FOLLOW_121); 

                    				newLeafNode(otherlv_26, grammarAccess.getSupportedRoleClassAccess().getMappingObjectKeyword_12_0());
                    			
                    // InternalCAEXtext.g:4948:4: ( (lv_mappingObject_27_0= ruleMapping ) )
                    // InternalCAEXtext.g:4949:5: (lv_mappingObject_27_0= ruleMapping )
                    {
                    // InternalCAEXtext.g:4949:5: (lv_mappingObject_27_0= ruleMapping )
                    // InternalCAEXtext.g:4950:6: lv_mappingObject_27_0= ruleMapping
                    {

                    						newCompositeNode(grammarAccess.getSupportedRoleClassAccess().getMappingObjectMappingParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_mappingObject_27_0=ruleMapping();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSupportedRoleClassRule());
                    						}
                    						set(
                    							current,
                    							"mappingObject",
                    							lv_mappingObject_27_0,
                    							"caex.caex215.CAEXtext.Mapping");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_28=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getSupportedRoleClassAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSupportedRoleClass"


    // $ANTLR start "entryRuleInternalLink"
    // InternalCAEXtext.g:4976:1: entryRuleInternalLink returns [EObject current=null] : iv_ruleInternalLink= ruleInternalLink EOF ;
    public final EObject entryRuleInternalLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalLink = null;


        try {
            // InternalCAEXtext.g:4976:53: (iv_ruleInternalLink= ruleInternalLink EOF )
            // InternalCAEXtext.g:4977:2: iv_ruleInternalLink= ruleInternalLink EOF
            {
             newCompositeNode(grammarAccess.getInternalLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalLink=ruleInternalLink();

            state._fsp--;

             current =iv_ruleInternalLink; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInternalLink"


    // $ANTLR start "ruleInternalLink"
    // InternalCAEXtext.g:4983:1: ruleInternalLink returns [EObject current=null] : (otherlv_0= 'IL' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '[' (otherlv_7= 'changeMode' ( (lv_changeMode_8_0= ruleChangeMode ) ) )? (otherlv_9= 'id' ( (lv_iD_10_0= RULE_ID ) ) )? ( (lv_description_11_0= ruleDescription ) )? ( (lv_version_12_0= ruleVersion ) )? ( ( (lv_revision_13_0= ruleRevision ) ) (otherlv_14= ',' ( (lv_revision_15_0= ruleRevision ) ) )* )? ( (lv_copyright_16_0= ruleCopyright ) )? ( ( (lv_additionalInformation_17_0= ruleAdditionalInformation ) ) (otherlv_18= ',' ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) ) )* )? otherlv_20= ']' ) ;
    public final EObject ruleInternalLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_iD_10_0=null;
        Token otherlv_14=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_changeMode_8_0 = null;

        EObject lv_description_11_0 = null;

        EObject lv_version_12_0 = null;

        EObject lv_revision_13_0 = null;

        EObject lv_revision_15_0 = null;

        EObject lv_copyright_16_0 = null;

        EObject lv_additionalInformation_17_0 = null;

        EObject lv_additionalInformation_19_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:4989:2: ( (otherlv_0= 'IL' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '[' (otherlv_7= 'changeMode' ( (lv_changeMode_8_0= ruleChangeMode ) ) )? (otherlv_9= 'id' ( (lv_iD_10_0= RULE_ID ) ) )? ( (lv_description_11_0= ruleDescription ) )? ( (lv_version_12_0= ruleVersion ) )? ( ( (lv_revision_13_0= ruleRevision ) ) (otherlv_14= ',' ( (lv_revision_15_0= ruleRevision ) ) )* )? ( (lv_copyright_16_0= ruleCopyright ) )? ( ( (lv_additionalInformation_17_0= ruleAdditionalInformation ) ) (otherlv_18= ',' ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) ) )* )? otherlv_20= ']' ) )
            // InternalCAEXtext.g:4990:2: (otherlv_0= 'IL' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '[' (otherlv_7= 'changeMode' ( (lv_changeMode_8_0= ruleChangeMode ) ) )? (otherlv_9= 'id' ( (lv_iD_10_0= RULE_ID ) ) )? ( (lv_description_11_0= ruleDescription ) )? ( (lv_version_12_0= ruleVersion ) )? ( ( (lv_revision_13_0= ruleRevision ) ) (otherlv_14= ',' ( (lv_revision_15_0= ruleRevision ) ) )* )? ( (lv_copyright_16_0= ruleCopyright ) )? ( ( (lv_additionalInformation_17_0= ruleAdditionalInformation ) ) (otherlv_18= ',' ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) ) )* )? otherlv_20= ']' )
            {
            // InternalCAEXtext.g:4990:2: (otherlv_0= 'IL' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '[' (otherlv_7= 'changeMode' ( (lv_changeMode_8_0= ruleChangeMode ) ) )? (otherlv_9= 'id' ( (lv_iD_10_0= RULE_ID ) ) )? ( (lv_description_11_0= ruleDescription ) )? ( (lv_version_12_0= ruleVersion ) )? ( ( (lv_revision_13_0= ruleRevision ) ) (otherlv_14= ',' ( (lv_revision_15_0= ruleRevision ) ) )* )? ( (lv_copyright_16_0= ruleCopyright ) )? ( ( (lv_additionalInformation_17_0= ruleAdditionalInformation ) ) (otherlv_18= ',' ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) ) )* )? otherlv_20= ']' )
            // InternalCAEXtext.g:4991:3: otherlv_0= 'IL' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '[' (otherlv_7= 'changeMode' ( (lv_changeMode_8_0= ruleChangeMode ) ) )? (otherlv_9= 'id' ( (lv_iD_10_0= RULE_ID ) ) )? ( (lv_description_11_0= ruleDescription ) )? ( (lv_version_12_0= ruleVersion ) )? ( ( (lv_revision_13_0= ruleRevision ) ) (otherlv_14= ',' ( (lv_revision_15_0= ruleRevision ) ) )* )? ( (lv_copyright_16_0= ruleCopyright ) )? ( ( (lv_additionalInformation_17_0= ruleAdditionalInformation ) ) (otherlv_18= ',' ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) ) )* )? otherlv_20= ']'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getInternalLinkAccess().getILKeyword_0());
            		
            // InternalCAEXtext.g:4995:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCAEXtext.g:4996:4: (lv_name_1_0= ruleEString )
            {
            // InternalCAEXtext.g:4996:4: (lv_name_1_0= ruleEString )
            // InternalCAEXtext.g:4997:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInternalLinkAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_122);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInternalLinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCAEXtext.g:5014:3: (otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==73) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // InternalCAEXtext.g:5015:4: otherlv_2= 'from' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,73,FOLLOW_99); 

                    				newLeafNode(otherlv_2, grammarAccess.getInternalLinkAccess().getFromKeyword_2_0());
                    			
                    // InternalCAEXtext.g:5019:4: ( (otherlv_3= RULE_ID ) )
                    // InternalCAEXtext.g:5020:5: (otherlv_3= RULE_ID )
                    {
                    // InternalCAEXtext.g:5020:5: (otherlv_3= RULE_ID )
                    // InternalCAEXtext.g:5021:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInternalLinkRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_123); 

                    						newLeafNode(otherlv_3, grammarAccess.getInternalLinkAccess().getPartnerSideAInterfaceClassCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:5033:3: (otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==74) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // InternalCAEXtext.g:5034:4: otherlv_4= 'to' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,74,FOLLOW_99); 

                    				newLeafNode(otherlv_4, grammarAccess.getInternalLinkAccess().getToKeyword_3_0());
                    			
                    // InternalCAEXtext.g:5038:4: ( (otherlv_5= RULE_ID ) )
                    // InternalCAEXtext.g:5039:5: (otherlv_5= RULE_ID )
                    {
                    // InternalCAEXtext.g:5039:5: (otherlv_5= RULE_ID )
                    // InternalCAEXtext.g:5040:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInternalLinkRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_3); 

                    						newLeafNode(otherlv_5, grammarAccess.getInternalLinkAccess().getPartnerSideBInterfaceClassCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_94); 

            			newLeafNode(otherlv_6, grammarAccess.getInternalLinkAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalCAEXtext.g:5056:3: (otherlv_7= 'changeMode' ( (lv_changeMode_8_0= ruleChangeMode ) ) )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==13) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // InternalCAEXtext.g:5057:4: otherlv_7= 'changeMode' ( (lv_changeMode_8_0= ruleChangeMode ) )
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getInternalLinkAccess().getChangeModeKeyword_5_0());
                    			
                    // InternalCAEXtext.g:5061:4: ( (lv_changeMode_8_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:5062:5: (lv_changeMode_8_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:5062:5: (lv_changeMode_8_0= ruleChangeMode )
                    // InternalCAEXtext.g:5063:6: lv_changeMode_8_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getInternalLinkAccess().getChangeModeChangeModeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_124);
                    lv_changeMode_8_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternalLinkRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_8_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:5081:3: (otherlv_9= 'id' ( (lv_iD_10_0= RULE_ID ) ) )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==55) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // InternalCAEXtext.g:5082:4: otherlv_9= 'id' ( (lv_iD_10_0= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,55,FOLLOW_99); 

                    				newLeafNode(otherlv_9, grammarAccess.getInternalLinkAccess().getIdKeyword_6_0());
                    			
                    // InternalCAEXtext.g:5086:4: ( (lv_iD_10_0= RULE_ID ) )
                    // InternalCAEXtext.g:5087:5: (lv_iD_10_0= RULE_ID )
                    {
                    // InternalCAEXtext.g:5087:5: (lv_iD_10_0= RULE_ID )
                    // InternalCAEXtext.g:5088:6: lv_iD_10_0= RULE_ID
                    {
                    lv_iD_10_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_iD_10_0, grammarAccess.getInternalLinkAccess().getIDIDTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInternalLinkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"iD",
                    							lv_iD_10_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:5105:3: ( (lv_description_11_0= ruleDescription ) )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==20) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // InternalCAEXtext.g:5106:4: (lv_description_11_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:5106:4: (lv_description_11_0= ruleDescription )
                    // InternalCAEXtext.g:5107:5: lv_description_11_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getInternalLinkAccess().getDescriptionDescriptionParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_description_11_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInternalLinkRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_11_0,
                    						"caex.caex215.CAEXtext.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:5124:3: ( (lv_version_12_0= ruleVersion ) )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==22) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // InternalCAEXtext.g:5125:4: (lv_version_12_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:5125:4: (lv_version_12_0= ruleVersion )
                    // InternalCAEXtext.g:5126:5: lv_version_12_0= ruleVersion
                    {

                    					newCompositeNode(grammarAccess.getInternalLinkAccess().getVersionVersionParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_version_12_0=ruleVersion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInternalLinkRule());
                    					}
                    					set(
                    						current,
                    						"version",
                    						lv_version_12_0,
                    						"caex.caex215.CAEXtext.Version");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:5143:3: ( ( (lv_revision_13_0= ruleRevision ) ) (otherlv_14= ',' ( (lv_revision_15_0= ruleRevision ) ) )* )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==23) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // InternalCAEXtext.g:5144:4: ( (lv_revision_13_0= ruleRevision ) ) (otherlv_14= ',' ( (lv_revision_15_0= ruleRevision ) ) )*
                    {
                    // InternalCAEXtext.g:5144:4: ( (lv_revision_13_0= ruleRevision ) )
                    // InternalCAEXtext.g:5145:5: (lv_revision_13_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:5145:5: (lv_revision_13_0= ruleRevision )
                    // InternalCAEXtext.g:5146:6: lv_revision_13_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getInternalLinkAccess().getRevisionRevisionParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_revision_13_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternalLinkRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_13_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:5163:4: (otherlv_14= ',' ( (lv_revision_15_0= ruleRevision ) ) )*
                    loop168:
                    do {
                        int alt168=2;
                        int LA168_0 = input.LA(1);

                        if ( (LA168_0==14) ) {
                            alt168=1;
                        }


                        switch (alt168) {
                    	case 1 :
                    	    // InternalCAEXtext.g:5164:5: otherlv_14= ',' ( (lv_revision_15_0= ruleRevision ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getInternalLinkAccess().getCommaKeyword_9_1_0());
                    	    				
                    	    // InternalCAEXtext.g:5168:5: ( (lv_revision_15_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:5169:6: (lv_revision_15_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:5169:6: (lv_revision_15_0= ruleRevision )
                    	    // InternalCAEXtext.g:5170:7: lv_revision_15_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getInternalLinkAccess().getRevisionRevisionParserRuleCall_9_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_revision_15_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInternalLinkRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_15_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop168;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCAEXtext.g:5189:3: ( (lv_copyright_16_0= ruleCopyright ) )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==29) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // InternalCAEXtext.g:5190:4: (lv_copyright_16_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:5190:4: (lv_copyright_16_0= ruleCopyright )
                    // InternalCAEXtext.g:5191:5: lv_copyright_16_0= ruleCopyright
                    {

                    					newCompositeNode(grammarAccess.getInternalLinkAccess().getCopyrightCopyrightParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_copyright_16_0=ruleCopyright();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInternalLinkRule());
                    					}
                    					set(
                    						current,
                    						"copyright",
                    						lv_copyright_16_0,
                    						"caex.caex215.CAEXtext.Copyright");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:5208:3: ( ( (lv_additionalInformation_17_0= ruleAdditionalInformation ) ) (otherlv_18= ',' ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) ) )* )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==30) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // InternalCAEXtext.g:5209:4: ( (lv_additionalInformation_17_0= ruleAdditionalInformation ) ) (otherlv_18= ',' ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) ) )*
                    {
                    // InternalCAEXtext.g:5209:4: ( (lv_additionalInformation_17_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:5210:5: (lv_additionalInformation_17_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:5210:5: (lv_additionalInformation_17_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:5211:6: lv_additionalInformation_17_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getInternalLinkAccess().getAdditionalInformationAdditionalInformationParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_additionalInformation_17_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternalLinkRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_17_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:5228:4: (otherlv_18= ',' ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) ) )*
                    loop171:
                    do {
                        int alt171=2;
                        int LA171_0 = input.LA(1);

                        if ( (LA171_0==14) ) {
                            alt171=1;
                        }


                        switch (alt171) {
                    	case 1 :
                    	    // InternalCAEXtext.g:5229:5: otherlv_18= ',' ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getInternalLinkAccess().getCommaKeyword_11_1_0());
                    	    				
                    	    // InternalCAEXtext.g:5233:5: ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:5234:6: (lv_additionalInformation_19_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:5234:6: (lv_additionalInformation_19_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:5235:7: lv_additionalInformation_19_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getInternalLinkAccess().getAdditionalInformationAdditionalInformationParserRuleCall_11_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_additionalInformation_19_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInternalLinkRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_19_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop171;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_20=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getInternalLinkAccess().getRightSquareBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternalLink"


    // $ANTLR start "entryRuleSystemUnitClass_Impl"
    // InternalCAEXtext.g:5262:1: entryRuleSystemUnitClass_Impl returns [EObject current=null] : iv_ruleSystemUnitClass_Impl= ruleSystemUnitClass_Impl EOF ;
    public final EObject entryRuleSystemUnitClass_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemUnitClass_Impl = null;


        try {
            // InternalCAEXtext.g:5262:61: (iv_ruleSystemUnitClass_Impl= ruleSystemUnitClass_Impl EOF )
            // InternalCAEXtext.g:5263:2: iv_ruleSystemUnitClass_Impl= ruleSystemUnitClass_Impl EOF
            {
             newCompositeNode(grammarAccess.getSystemUnitClass_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemUnitClass_Impl=ruleSystemUnitClass_Impl();

            state._fsp--;

             current =iv_ruleSystemUnitClass_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSystemUnitClass_Impl"


    // $ANTLR start "ruleSystemUnitClass_Impl"
    // InternalCAEXtext.g:5269:1: ruleSystemUnitClass_Impl returns [EObject current=null] : (otherlv_0= 'SystemUnitClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'externalInterface' otherlv_37= '{' ( (lv_externalInterface_38_0= ruleExternalInterface ) ) (otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) ) )* otherlv_41= '}' )? (otherlv_42= 'internalElement' otherlv_43= '{' ( (lv_internalElement_44_0= ruleInternalElement ) ) (otherlv_45= ',' ( (lv_internalElement_46_0= ruleInternalElement ) ) )* otherlv_47= '}' )? (otherlv_48= 'supportedRoleClass' otherlv_49= '{' ( (lv_supportedRoleClass_50_0= ruleSupportedRoleClass ) ) (otherlv_51= ',' ( (lv_supportedRoleClass_52_0= ruleSupportedRoleClass ) ) )* otherlv_53= '}' )? (otherlv_54= 'internalLink' otherlv_55= '{' ( (lv_internalLink_56_0= ruleInternalLink ) ) (otherlv_57= ',' ( (lv_internalLink_58_0= ruleInternalLink ) ) )* otherlv_59= '}' )? (otherlv_60= 'systemUnitClass' otherlv_61= '{' ( (lv_systemUnitClass_62_0= ruleSystemUnitClass ) ) (otherlv_63= ',' ( (lv_systemUnitClass_64_0= ruleSystemUnitClass ) ) )* otherlv_65= '}' )? otherlv_66= '}' ) ;
    public final EObject ruleSystemUnitClass_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_57=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        Token otherlv_65=null;
        Token otherlv_66=null;
        Enumerator lv_changeMode_3_0 = null;

        AntlrDatatypeRuleToken lv_iD_5_0 = null;

        AntlrDatatypeRuleToken lv_refBaseClassPath_9_0 = null;

        EObject lv_description_13_0 = null;

        EObject lv_version_15_0 = null;

        EObject lv_revision_18_0 = null;

        EObject lv_revision_20_0 = null;

        EObject lv_copyright_23_0 = null;

        EObject lv_additionalInformation_26_0 = null;

        EObject lv_additionalInformation_28_0 = null;

        EObject lv_attribute_32_0 = null;

        EObject lv_attribute_34_0 = null;

        EObject lv_externalInterface_38_0 = null;

        EObject lv_externalInterface_40_0 = null;

        EObject lv_internalElement_44_0 = null;

        EObject lv_internalElement_46_0 = null;

        EObject lv_supportedRoleClass_50_0 = null;

        EObject lv_supportedRoleClass_52_0 = null;

        EObject lv_internalLink_56_0 = null;

        EObject lv_internalLink_58_0 = null;

        EObject lv_systemUnitClass_62_0 = null;

        EObject lv_systemUnitClass_64_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:5275:2: ( (otherlv_0= 'SystemUnitClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'externalInterface' otherlv_37= '{' ( (lv_externalInterface_38_0= ruleExternalInterface ) ) (otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) ) )* otherlv_41= '}' )? (otherlv_42= 'internalElement' otherlv_43= '{' ( (lv_internalElement_44_0= ruleInternalElement ) ) (otherlv_45= ',' ( (lv_internalElement_46_0= ruleInternalElement ) ) )* otherlv_47= '}' )? (otherlv_48= 'supportedRoleClass' otherlv_49= '{' ( (lv_supportedRoleClass_50_0= ruleSupportedRoleClass ) ) (otherlv_51= ',' ( (lv_supportedRoleClass_52_0= ruleSupportedRoleClass ) ) )* otherlv_53= '}' )? (otherlv_54= 'internalLink' otherlv_55= '{' ( (lv_internalLink_56_0= ruleInternalLink ) ) (otherlv_57= ',' ( (lv_internalLink_58_0= ruleInternalLink ) ) )* otherlv_59= '}' )? (otherlv_60= 'systemUnitClass' otherlv_61= '{' ( (lv_systemUnitClass_62_0= ruleSystemUnitClass ) ) (otherlv_63= ',' ( (lv_systemUnitClass_64_0= ruleSystemUnitClass ) ) )* otherlv_65= '}' )? otherlv_66= '}' ) )
            // InternalCAEXtext.g:5276:2: (otherlv_0= 'SystemUnitClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'externalInterface' otherlv_37= '{' ( (lv_externalInterface_38_0= ruleExternalInterface ) ) (otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) ) )* otherlv_41= '}' )? (otherlv_42= 'internalElement' otherlv_43= '{' ( (lv_internalElement_44_0= ruleInternalElement ) ) (otherlv_45= ',' ( (lv_internalElement_46_0= ruleInternalElement ) ) )* otherlv_47= '}' )? (otherlv_48= 'supportedRoleClass' otherlv_49= '{' ( (lv_supportedRoleClass_50_0= ruleSupportedRoleClass ) ) (otherlv_51= ',' ( (lv_supportedRoleClass_52_0= ruleSupportedRoleClass ) ) )* otherlv_53= '}' )? (otherlv_54= 'internalLink' otherlv_55= '{' ( (lv_internalLink_56_0= ruleInternalLink ) ) (otherlv_57= ',' ( (lv_internalLink_58_0= ruleInternalLink ) ) )* otherlv_59= '}' )? (otherlv_60= 'systemUnitClass' otherlv_61= '{' ( (lv_systemUnitClass_62_0= ruleSystemUnitClass ) ) (otherlv_63= ',' ( (lv_systemUnitClass_64_0= ruleSystemUnitClass ) ) )* otherlv_65= '}' )? otherlv_66= '}' )
            {
            // InternalCAEXtext.g:5276:2: (otherlv_0= 'SystemUnitClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'externalInterface' otherlv_37= '{' ( (lv_externalInterface_38_0= ruleExternalInterface ) ) (otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) ) )* otherlv_41= '}' )? (otherlv_42= 'internalElement' otherlv_43= '{' ( (lv_internalElement_44_0= ruleInternalElement ) ) (otherlv_45= ',' ( (lv_internalElement_46_0= ruleInternalElement ) ) )* otherlv_47= '}' )? (otherlv_48= 'supportedRoleClass' otherlv_49= '{' ( (lv_supportedRoleClass_50_0= ruleSupportedRoleClass ) ) (otherlv_51= ',' ( (lv_supportedRoleClass_52_0= ruleSupportedRoleClass ) ) )* otherlv_53= '}' )? (otherlv_54= 'internalLink' otherlv_55= '{' ( (lv_internalLink_56_0= ruleInternalLink ) ) (otherlv_57= ',' ( (lv_internalLink_58_0= ruleInternalLink ) ) )* otherlv_59= '}' )? (otherlv_60= 'systemUnitClass' otherlv_61= '{' ( (lv_systemUnitClass_62_0= ruleSystemUnitClass ) ) (otherlv_63= ',' ( (lv_systemUnitClass_64_0= ruleSystemUnitClass ) ) )* otherlv_65= '}' )? otherlv_66= '}' )
            // InternalCAEXtext.g:5277:3: otherlv_0= 'SystemUnitClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'externalInterface' otherlv_37= '{' ( (lv_externalInterface_38_0= ruleExternalInterface ) ) (otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) ) )* otherlv_41= '}' )? (otherlv_42= 'internalElement' otherlv_43= '{' ( (lv_internalElement_44_0= ruleInternalElement ) ) (otherlv_45= ',' ( (lv_internalElement_46_0= ruleInternalElement ) ) )* otherlv_47= '}' )? (otherlv_48= 'supportedRoleClass' otherlv_49= '{' ( (lv_supportedRoleClass_50_0= ruleSupportedRoleClass ) ) (otherlv_51= ',' ( (lv_supportedRoleClass_52_0= ruleSupportedRoleClass ) ) )* otherlv_53= '}' )? (otherlv_54= 'internalLink' otherlv_55= '{' ( (lv_internalLink_56_0= ruleInternalLink ) ) (otherlv_57= ',' ( (lv_internalLink_58_0= ruleInternalLink ) ) )* otherlv_59= '}' )? (otherlv_60= 'systemUnitClass' otherlv_61= '{' ( (lv_systemUnitClass_62_0= ruleSystemUnitClass ) ) (otherlv_63= ',' ( (lv_systemUnitClass_64_0= ruleSystemUnitClass ) ) )* otherlv_65= '}' )? otherlv_66= '}'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemUnitClass_ImplAccess().getSystemUnitClassKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemUnitClass_ImplAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCAEXtext.g:5285:3: (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==13) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // InternalCAEXtext.g:5286:4: otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getSystemUnitClass_ImplAccess().getChangeModeKeyword_2_0());
                    			
                    // InternalCAEXtext.g:5290:4: ( (lv_changeMode_3_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:5291:5: (lv_changeMode_3_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:5291:5: (lv_changeMode_3_0= ruleChangeMode )
                    // InternalCAEXtext.g:5292:6: lv_changeMode_3_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getChangeModeChangeModeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_changeMode_3_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_3_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:5310:3: (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==37) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // InternalCAEXtext.g:5311:4: otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getSystemUnitClass_ImplAccess().getIDKeyword_3_0());
                    			
                    // InternalCAEXtext.g:5315:4: ( (lv_iD_5_0= ruleEString ) )
                    // InternalCAEXtext.g:5316:5: (lv_iD_5_0= ruleEString )
                    {
                    // InternalCAEXtext.g:5316:5: (lv_iD_5_0= ruleEString )
                    // InternalCAEXtext.g:5317:6: lv_iD_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_iD_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"iD",
                    							lv_iD_5_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,38,FOLLOW_99); 

            			newLeafNode(otherlv_6, grammarAccess.getSystemUnitClass_ImplAccess().getNameKeyword_4());
            		
            // InternalCAEXtext.g:5339:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalCAEXtext.g:5340:4: (lv_name_7_0= RULE_ID )
            {
            // InternalCAEXtext.g:5340:4: (lv_name_7_0= RULE_ID )
            // InternalCAEXtext.g:5341:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_125); 

            					newLeafNode(lv_name_7_0, grammarAccess.getSystemUnitClass_ImplAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemUnitClass_ImplRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCAEXtext.g:5357:3: (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )?
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==59) ) {
                alt175=1;
            }
            switch (alt175) {
                case 1 :
                    // InternalCAEXtext.g:5358:4: otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getSystemUnitClass_ImplAccess().getRefBaseClassPathKeyword_6_0());
                    			
                    // InternalCAEXtext.g:5362:4: ( (lv_refBaseClassPath_9_0= ruleEString ) )
                    // InternalCAEXtext.g:5363:5: (lv_refBaseClassPath_9_0= ruleEString )
                    {
                    // InternalCAEXtext.g:5363:5: (lv_refBaseClassPath_9_0= ruleEString )
                    // InternalCAEXtext.g:5364:6: lv_refBaseClassPath_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getRefBaseClassPathEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_126);
                    lv_refBaseClassPath_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"refBaseClassPath",
                    							lv_refBaseClassPath_9_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:5382:3: (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==60) ) {
                alt176=1;
            }
            switch (alt176) {
                case 1 :
                    // InternalCAEXtext.g:5383:4: otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,60,FOLLOW_99); 

                    				newLeafNode(otherlv_10, grammarAccess.getSystemUnitClass_ImplAccess().getBaseClassKeyword_7_0());
                    			
                    // InternalCAEXtext.g:5387:4: ( (otherlv_11= RULE_ID ) )
                    // InternalCAEXtext.g:5388:5: (otherlv_11= RULE_ID )
                    {
                    // InternalCAEXtext.g:5388:5: (otherlv_11= RULE_ID )
                    // InternalCAEXtext.g:5389:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemUnitClass_ImplRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_127); 

                    						newLeafNode(otherlv_11, grammarAccess.getSystemUnitClass_ImplAccess().getBaseClassSystemUnitClassCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:5401:3: (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==61) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // InternalCAEXtext.g:5402:4: otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) )
                    {
                    otherlv_12=(Token)match(input,61,FOLLOW_103); 

                    				newLeafNode(otherlv_12, grammarAccess.getSystemUnitClass_ImplAccess().getDescriptionKeyword_8_0());
                    			
                    // InternalCAEXtext.g:5406:4: ( (lv_description_13_0= ruleDescription ) )
                    // InternalCAEXtext.g:5407:5: (lv_description_13_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:5407:5: (lv_description_13_0= ruleDescription )
                    // InternalCAEXtext.g:5408:6: lv_description_13_0= ruleDescription
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getDescriptionDescriptionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_128);
                    lv_description_13_0=ruleDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_13_0,
                    							"caex.caex215.CAEXtext.Description");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:5426:3: (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==62) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // InternalCAEXtext.g:5427:4: otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) )
                    {
                    otherlv_14=(Token)match(input,62,FOLLOW_105); 

                    				newLeafNode(otherlv_14, grammarAccess.getSystemUnitClass_ImplAccess().getVersionKeyword_9_0());
                    			
                    // InternalCAEXtext.g:5431:4: ( (lv_version_15_0= ruleVersion ) )
                    // InternalCAEXtext.g:5432:5: (lv_version_15_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:5432:5: (lv_version_15_0= ruleVersion )
                    // InternalCAEXtext.g:5433:6: lv_version_15_0= ruleVersion
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getVersionVersionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_129);
                    lv_version_15_0=ruleVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_15_0,
                    							"caex.caex215.CAEXtext.Version");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:5451:3: (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==63) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // InternalCAEXtext.g:5452:4: otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,63,FOLLOW_14); 

                    				newLeafNode(otherlv_16, grammarAccess.getSystemUnitClass_ImplAccess().getRevisionKeyword_10_0());
                    			
                    otherlv_17=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_17, grammarAccess.getSystemUnitClass_ImplAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalCAEXtext.g:5460:4: ( (lv_revision_18_0= ruleRevision ) )
                    // InternalCAEXtext.g:5461:5: (lv_revision_18_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:5461:5: (lv_revision_18_0= ruleRevision )
                    // InternalCAEXtext.g:5462:6: lv_revision_18_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getRevisionRevisionParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_revision_18_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_18_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:5479:4: (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )*
                    loop179:
                    do {
                        int alt179=2;
                        int LA179_0 = input.LA(1);

                        if ( (LA179_0==14) ) {
                            alt179=1;
                        }


                        switch (alt179) {
                    	case 1 :
                    	    // InternalCAEXtext.g:5480:5: otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getSystemUnitClass_ImplAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalCAEXtext.g:5484:5: ( (lv_revision_20_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:5485:6: (lv_revision_20_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:5485:6: (lv_revision_20_0= ruleRevision )
                    	    // InternalCAEXtext.g:5486:7: lv_revision_20_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getRevisionRevisionParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_revision_20_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_20_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop179;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,19,FOLLOW_130); 

                    				newLeafNode(otherlv_21, grammarAccess.getSystemUnitClass_ImplAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:5509:3: (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )?
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( (LA181_0==64) ) {
                alt181=1;
            }
            switch (alt181) {
                case 1 :
                    // InternalCAEXtext.g:5510:4: otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) )
                    {
                    otherlv_22=(Token)match(input,64,FOLLOW_108); 

                    				newLeafNode(otherlv_22, grammarAccess.getSystemUnitClass_ImplAccess().getCopyrightKeyword_11_0());
                    			
                    // InternalCAEXtext.g:5514:4: ( (lv_copyright_23_0= ruleCopyright ) )
                    // InternalCAEXtext.g:5515:5: (lv_copyright_23_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:5515:5: (lv_copyright_23_0= ruleCopyright )
                    // InternalCAEXtext.g:5516:6: lv_copyright_23_0= ruleCopyright
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getCopyrightCopyrightParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_131);
                    lv_copyright_23_0=ruleCopyright();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"copyright",
                    							lv_copyright_23_0,
                    							"caex.caex215.CAEXtext.Copyright");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:5534:3: (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )?
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==65) ) {
                alt183=1;
            }
            switch (alt183) {
                case 1 :
                    // InternalCAEXtext.g:5535:4: otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,65,FOLLOW_14); 

                    				newLeafNode(otherlv_24, grammarAccess.getSystemUnitClass_ImplAccess().getAdditionalInformationKeyword_12_0());
                    			
                    otherlv_25=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_25, grammarAccess.getSystemUnitClass_ImplAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalCAEXtext.g:5543:4: ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:5544:5: (lv_additionalInformation_26_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:5544:5: (lv_additionalInformation_26_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:5545:6: lv_additionalInformation_26_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getAdditionalInformationAdditionalInformationParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_additionalInformation_26_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_26_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:5562:4: (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )*
                    loop182:
                    do {
                        int alt182=2;
                        int LA182_0 = input.LA(1);

                        if ( (LA182_0==14) ) {
                            alt182=1;
                        }


                        switch (alt182) {
                    	case 1 :
                    	    // InternalCAEXtext.g:5563:5: otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_27=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getSystemUnitClass_ImplAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalCAEXtext.g:5567:5: ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:5568:6: (lv_additionalInformation_28_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:5568:6: (lv_additionalInformation_28_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:5569:7: lv_additionalInformation_28_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getAdditionalInformationAdditionalInformationParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_additionalInformation_28_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_28_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop182;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,19,FOLLOW_132); 

                    				newLeafNode(otherlv_29, grammarAccess.getSystemUnitClass_ImplAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:5592:3: (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )?
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==66) ) {
                alt185=1;
            }
            switch (alt185) {
                case 1 :
                    // InternalCAEXtext.g:5593:4: otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,66,FOLLOW_14); 

                    				newLeafNode(otherlv_30, grammarAccess.getSystemUnitClass_ImplAccess().getAttributeKeyword_13_0());
                    			
                    otherlv_31=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_31, grammarAccess.getSystemUnitClass_ImplAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalCAEXtext.g:5601:4: ( (lv_attribute_32_0= ruleAttribute ) )
                    // InternalCAEXtext.g:5602:5: (lv_attribute_32_0= ruleAttribute )
                    {
                    // InternalCAEXtext.g:5602:5: (lv_attribute_32_0= ruleAttribute )
                    // InternalCAEXtext.g:5603:6: lv_attribute_32_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getAttributeAttributeParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_attribute_32_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    						}
                    						add(
                    							current,
                    							"attribute",
                    							lv_attribute_32_0,
                    							"caex.caex215.CAEXtext.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:5620:4: (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )*
                    loop184:
                    do {
                        int alt184=2;
                        int LA184_0 = input.LA(1);

                        if ( (LA184_0==14) ) {
                            alt184=1;
                        }


                        switch (alt184) {
                    	case 1 :
                    	    // InternalCAEXtext.g:5621:5: otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) )
                    	    {
                    	    otherlv_33=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getSystemUnitClass_ImplAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalCAEXtext.g:5625:5: ( (lv_attribute_34_0= ruleAttribute ) )
                    	    // InternalCAEXtext.g:5626:6: (lv_attribute_34_0= ruleAttribute )
                    	    {
                    	    // InternalCAEXtext.g:5626:6: (lv_attribute_34_0= ruleAttribute )
                    	    // InternalCAEXtext.g:5627:7: lv_attribute_34_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getAttributeAttributeParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_attribute_34_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attribute",
                    	    								lv_attribute_34_0,
                    	    								"caex.caex215.CAEXtext.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop184;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,19,FOLLOW_133); 

                    				newLeafNode(otherlv_35, grammarAccess.getSystemUnitClass_ImplAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:5650:3: (otherlv_36= 'externalInterface' otherlv_37= '{' ( (lv_externalInterface_38_0= ruleExternalInterface ) ) (otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) ) )* otherlv_41= '}' )?
            int alt187=2;
            int LA187_0 = input.LA(1);

            if ( (LA187_0==76) ) {
                alt187=1;
            }
            switch (alt187) {
                case 1 :
                    // InternalCAEXtext.g:5651:4: otherlv_36= 'externalInterface' otherlv_37= '{' ( (lv_externalInterface_38_0= ruleExternalInterface ) ) (otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) ) )* otherlv_41= '}'
                    {
                    otherlv_36=(Token)match(input,76,FOLLOW_14); 

                    				newLeafNode(otherlv_36, grammarAccess.getSystemUnitClass_ImplAccess().getExternalInterfaceKeyword_14_0());
                    			
                    otherlv_37=(Token)match(input,16,FOLLOW_60); 

                    				newLeafNode(otherlv_37, grammarAccess.getSystemUnitClass_ImplAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalCAEXtext.g:5659:4: ( (lv_externalInterface_38_0= ruleExternalInterface ) )
                    // InternalCAEXtext.g:5660:5: (lv_externalInterface_38_0= ruleExternalInterface )
                    {
                    // InternalCAEXtext.g:5660:5: (lv_externalInterface_38_0= ruleExternalInterface )
                    // InternalCAEXtext.g:5661:6: lv_externalInterface_38_0= ruleExternalInterface
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getExternalInterfaceExternalInterfaceParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_externalInterface_38_0=ruleExternalInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    						}
                    						add(
                    							current,
                    							"externalInterface",
                    							lv_externalInterface_38_0,
                    							"caex.caex215.CAEXtext.ExternalInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:5678:4: (otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) ) )*
                    loop186:
                    do {
                        int alt186=2;
                        int LA186_0 = input.LA(1);

                        if ( (LA186_0==14) ) {
                            alt186=1;
                        }


                        switch (alt186) {
                    	case 1 :
                    	    // InternalCAEXtext.g:5679:5: otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) )
                    	    {
                    	    otherlv_39=(Token)match(input,14,FOLLOW_60); 

                    	    					newLeafNode(otherlv_39, grammarAccess.getSystemUnitClass_ImplAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalCAEXtext.g:5683:5: ( (lv_externalInterface_40_0= ruleExternalInterface ) )
                    	    // InternalCAEXtext.g:5684:6: (lv_externalInterface_40_0= ruleExternalInterface )
                    	    {
                    	    // InternalCAEXtext.g:5684:6: (lv_externalInterface_40_0= ruleExternalInterface )
                    	    // InternalCAEXtext.g:5685:7: lv_externalInterface_40_0= ruleExternalInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getExternalInterfaceExternalInterfaceParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_externalInterface_40_0=ruleExternalInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"externalInterface",
                    	    								lv_externalInterface_40_0,
                    	    								"caex.caex215.CAEXtext.ExternalInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop186;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,19,FOLLOW_134); 

                    				newLeafNode(otherlv_41, grammarAccess.getSystemUnitClass_ImplAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:5708:3: (otherlv_42= 'internalElement' otherlv_43= '{' ( (lv_internalElement_44_0= ruleInternalElement ) ) (otherlv_45= ',' ( (lv_internalElement_46_0= ruleInternalElement ) ) )* otherlv_47= '}' )?
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( (LA189_0==77) ) {
                alt189=1;
            }
            switch (alt189) {
                case 1 :
                    // InternalCAEXtext.g:5709:4: otherlv_42= 'internalElement' otherlv_43= '{' ( (lv_internalElement_44_0= ruleInternalElement ) ) (otherlv_45= ',' ( (lv_internalElement_46_0= ruleInternalElement ) ) )* otherlv_47= '}'
                    {
                    otherlv_42=(Token)match(input,77,FOLLOW_14); 

                    				newLeafNode(otherlv_42, grammarAccess.getSystemUnitClass_ImplAccess().getInternalElementKeyword_15_0());
                    			
                    otherlv_43=(Token)match(input,16,FOLLOW_50); 

                    				newLeafNode(otherlv_43, grammarAccess.getSystemUnitClass_ImplAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalCAEXtext.g:5717:4: ( (lv_internalElement_44_0= ruleInternalElement ) )
                    // InternalCAEXtext.g:5718:5: (lv_internalElement_44_0= ruleInternalElement )
                    {
                    // InternalCAEXtext.g:5718:5: (lv_internalElement_44_0= ruleInternalElement )
                    // InternalCAEXtext.g:5719:6: lv_internalElement_44_0= ruleInternalElement
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getInternalElementInternalElementParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_internalElement_44_0=ruleInternalElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    						}
                    						add(
                    							current,
                    							"internalElement",
                    							lv_internalElement_44_0,
                    							"caex.caex215.CAEXtext.InternalElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:5736:4: (otherlv_45= ',' ( (lv_internalElement_46_0= ruleInternalElement ) ) )*
                    loop188:
                    do {
                        int alt188=2;
                        int LA188_0 = input.LA(1);

                        if ( (LA188_0==14) ) {
                            alt188=1;
                        }


                        switch (alt188) {
                    	case 1 :
                    	    // InternalCAEXtext.g:5737:5: otherlv_45= ',' ( (lv_internalElement_46_0= ruleInternalElement ) )
                    	    {
                    	    otherlv_45=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_45, grammarAccess.getSystemUnitClass_ImplAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalCAEXtext.g:5741:5: ( (lv_internalElement_46_0= ruleInternalElement ) )
                    	    // InternalCAEXtext.g:5742:6: (lv_internalElement_46_0= ruleInternalElement )
                    	    {
                    	    // InternalCAEXtext.g:5742:6: (lv_internalElement_46_0= ruleInternalElement )
                    	    // InternalCAEXtext.g:5743:7: lv_internalElement_46_0= ruleInternalElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getInternalElementInternalElementParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_internalElement_46_0=ruleInternalElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"internalElement",
                    	    								lv_internalElement_46_0,
                    	    								"caex.caex215.CAEXtext.InternalElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop188;
                        }
                    } while (true);

                    otherlv_47=(Token)match(input,19,FOLLOW_135); 

                    				newLeafNode(otherlv_47, grammarAccess.getSystemUnitClass_ImplAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:5766:3: (otherlv_48= 'supportedRoleClass' otherlv_49= '{' ( (lv_supportedRoleClass_50_0= ruleSupportedRoleClass ) ) (otherlv_51= ',' ( (lv_supportedRoleClass_52_0= ruleSupportedRoleClass ) ) )* otherlv_53= '}' )?
            int alt191=2;
            int LA191_0 = input.LA(1);

            if ( (LA191_0==78) ) {
                alt191=1;
            }
            switch (alt191) {
                case 1 :
                    // InternalCAEXtext.g:5767:4: otherlv_48= 'supportedRoleClass' otherlv_49= '{' ( (lv_supportedRoleClass_50_0= ruleSupportedRoleClass ) ) (otherlv_51= ',' ( (lv_supportedRoleClass_52_0= ruleSupportedRoleClass ) ) )* otherlv_53= '}'
                    {
                    otherlv_48=(Token)match(input,78,FOLLOW_14); 

                    				newLeafNode(otherlv_48, grammarAccess.getSystemUnitClass_ImplAccess().getSupportedRoleClassKeyword_16_0());
                    			
                    otherlv_49=(Token)match(input,16,FOLLOW_84); 

                    				newLeafNode(otherlv_49, grammarAccess.getSystemUnitClass_ImplAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalCAEXtext.g:5775:4: ( (lv_supportedRoleClass_50_0= ruleSupportedRoleClass ) )
                    // InternalCAEXtext.g:5776:5: (lv_supportedRoleClass_50_0= ruleSupportedRoleClass )
                    {
                    // InternalCAEXtext.g:5776:5: (lv_supportedRoleClass_50_0= ruleSupportedRoleClass )
                    // InternalCAEXtext.g:5777:6: lv_supportedRoleClass_50_0= ruleSupportedRoleClass
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getSupportedRoleClassSupportedRoleClassParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_supportedRoleClass_50_0=ruleSupportedRoleClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    						}
                    						add(
                    							current,
                    							"supportedRoleClass",
                    							lv_supportedRoleClass_50_0,
                    							"caex.caex215.CAEXtext.SupportedRoleClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:5794:4: (otherlv_51= ',' ( (lv_supportedRoleClass_52_0= ruleSupportedRoleClass ) ) )*
                    loop190:
                    do {
                        int alt190=2;
                        int LA190_0 = input.LA(1);

                        if ( (LA190_0==14) ) {
                            alt190=1;
                        }


                        switch (alt190) {
                    	case 1 :
                    	    // InternalCAEXtext.g:5795:5: otherlv_51= ',' ( (lv_supportedRoleClass_52_0= ruleSupportedRoleClass ) )
                    	    {
                    	    otherlv_51=(Token)match(input,14,FOLLOW_84); 

                    	    					newLeafNode(otherlv_51, grammarAccess.getSystemUnitClass_ImplAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalCAEXtext.g:5799:5: ( (lv_supportedRoleClass_52_0= ruleSupportedRoleClass ) )
                    	    // InternalCAEXtext.g:5800:6: (lv_supportedRoleClass_52_0= ruleSupportedRoleClass )
                    	    {
                    	    // InternalCAEXtext.g:5800:6: (lv_supportedRoleClass_52_0= ruleSupportedRoleClass )
                    	    // InternalCAEXtext.g:5801:7: lv_supportedRoleClass_52_0= ruleSupportedRoleClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getSupportedRoleClassSupportedRoleClassParserRuleCall_16_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_supportedRoleClass_52_0=ruleSupportedRoleClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"supportedRoleClass",
                    	    								lv_supportedRoleClass_52_0,
                    	    								"caex.caex215.CAEXtext.SupportedRoleClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop190;
                        }
                    } while (true);

                    otherlv_53=(Token)match(input,19,FOLLOW_136); 

                    				newLeafNode(otherlv_53, grammarAccess.getSystemUnitClass_ImplAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:5824:3: (otherlv_54= 'internalLink' otherlv_55= '{' ( (lv_internalLink_56_0= ruleInternalLink ) ) (otherlv_57= ',' ( (lv_internalLink_58_0= ruleInternalLink ) ) )* otherlv_59= '}' )?
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( (LA193_0==79) ) {
                alt193=1;
            }
            switch (alt193) {
                case 1 :
                    // InternalCAEXtext.g:5825:4: otherlv_54= 'internalLink' otherlv_55= '{' ( (lv_internalLink_56_0= ruleInternalLink ) ) (otherlv_57= ',' ( (lv_internalLink_58_0= ruleInternalLink ) ) )* otherlv_59= '}'
                    {
                    otherlv_54=(Token)match(input,79,FOLLOW_14); 

                    				newLeafNode(otherlv_54, grammarAccess.getSystemUnitClass_ImplAccess().getInternalLinkKeyword_17_0());
                    			
                    otherlv_55=(Token)match(input,16,FOLLOW_87); 

                    				newLeafNode(otherlv_55, grammarAccess.getSystemUnitClass_ImplAccess().getLeftCurlyBracketKeyword_17_1());
                    			
                    // InternalCAEXtext.g:5833:4: ( (lv_internalLink_56_0= ruleInternalLink ) )
                    // InternalCAEXtext.g:5834:5: (lv_internalLink_56_0= ruleInternalLink )
                    {
                    // InternalCAEXtext.g:5834:5: (lv_internalLink_56_0= ruleInternalLink )
                    // InternalCAEXtext.g:5835:6: lv_internalLink_56_0= ruleInternalLink
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getInternalLinkInternalLinkParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_internalLink_56_0=ruleInternalLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    						}
                    						add(
                    							current,
                    							"internalLink",
                    							lv_internalLink_56_0,
                    							"caex.caex215.CAEXtext.InternalLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:5852:4: (otherlv_57= ',' ( (lv_internalLink_58_0= ruleInternalLink ) ) )*
                    loop192:
                    do {
                        int alt192=2;
                        int LA192_0 = input.LA(1);

                        if ( (LA192_0==14) ) {
                            alt192=1;
                        }


                        switch (alt192) {
                    	case 1 :
                    	    // InternalCAEXtext.g:5853:5: otherlv_57= ',' ( (lv_internalLink_58_0= ruleInternalLink ) )
                    	    {
                    	    otherlv_57=(Token)match(input,14,FOLLOW_87); 

                    	    					newLeafNode(otherlv_57, grammarAccess.getSystemUnitClass_ImplAccess().getCommaKeyword_17_3_0());
                    	    				
                    	    // InternalCAEXtext.g:5857:5: ( (lv_internalLink_58_0= ruleInternalLink ) )
                    	    // InternalCAEXtext.g:5858:6: (lv_internalLink_58_0= ruleInternalLink )
                    	    {
                    	    // InternalCAEXtext.g:5858:6: (lv_internalLink_58_0= ruleInternalLink )
                    	    // InternalCAEXtext.g:5859:7: lv_internalLink_58_0= ruleInternalLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getInternalLinkInternalLinkParserRuleCall_17_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_internalLink_58_0=ruleInternalLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"internalLink",
                    	    								lv_internalLink_58_0,
                    	    								"caex.caex215.CAEXtext.InternalLink");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop192;
                        }
                    } while (true);

                    otherlv_59=(Token)match(input,19,FOLLOW_137); 

                    				newLeafNode(otherlv_59, grammarAccess.getSystemUnitClass_ImplAccess().getRightCurlyBracketKeyword_17_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:5882:3: (otherlv_60= 'systemUnitClass' otherlv_61= '{' ( (lv_systemUnitClass_62_0= ruleSystemUnitClass ) ) (otherlv_63= ',' ( (lv_systemUnitClass_64_0= ruleSystemUnitClass ) ) )* otherlv_65= '}' )?
            int alt195=2;
            int LA195_0 = input.LA(1);

            if ( (LA195_0==80) ) {
                alt195=1;
            }
            switch (alt195) {
                case 1 :
                    // InternalCAEXtext.g:5883:4: otherlv_60= 'systemUnitClass' otherlv_61= '{' ( (lv_systemUnitClass_62_0= ruleSystemUnitClass ) ) (otherlv_63= ',' ( (lv_systemUnitClass_64_0= ruleSystemUnitClass ) ) )* otherlv_65= '}'
                    {
                    otherlv_60=(Token)match(input,80,FOLLOW_14); 

                    				newLeafNode(otherlv_60, grammarAccess.getSystemUnitClass_ImplAccess().getSystemUnitClassKeyword_18_0());
                    			
                    otherlv_61=(Token)match(input,16,FOLLOW_74); 

                    				newLeafNode(otherlv_61, grammarAccess.getSystemUnitClass_ImplAccess().getLeftCurlyBracketKeyword_18_1());
                    			
                    // InternalCAEXtext.g:5891:4: ( (lv_systemUnitClass_62_0= ruleSystemUnitClass ) )
                    // InternalCAEXtext.g:5892:5: (lv_systemUnitClass_62_0= ruleSystemUnitClass )
                    {
                    // InternalCAEXtext.g:5892:5: (lv_systemUnitClass_62_0= ruleSystemUnitClass )
                    // InternalCAEXtext.g:5893:6: lv_systemUnitClass_62_0= ruleSystemUnitClass
                    {

                    						newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getSystemUnitClassSystemUnitClassParserRuleCall_18_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_systemUnitClass_62_0=ruleSystemUnitClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    						}
                    						add(
                    							current,
                    							"systemUnitClass",
                    							lv_systemUnitClass_62_0,
                    							"caex.caex215.CAEXtext.SystemUnitClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:5910:4: (otherlv_63= ',' ( (lv_systemUnitClass_64_0= ruleSystemUnitClass ) ) )*
                    loop194:
                    do {
                        int alt194=2;
                        int LA194_0 = input.LA(1);

                        if ( (LA194_0==14) ) {
                            alt194=1;
                        }


                        switch (alt194) {
                    	case 1 :
                    	    // InternalCAEXtext.g:5911:5: otherlv_63= ',' ( (lv_systemUnitClass_64_0= ruleSystemUnitClass ) )
                    	    {
                    	    otherlv_63=(Token)match(input,14,FOLLOW_74); 

                    	    					newLeafNode(otherlv_63, grammarAccess.getSystemUnitClass_ImplAccess().getCommaKeyword_18_3_0());
                    	    				
                    	    // InternalCAEXtext.g:5915:5: ( (lv_systemUnitClass_64_0= ruleSystemUnitClass ) )
                    	    // InternalCAEXtext.g:5916:6: (lv_systemUnitClass_64_0= ruleSystemUnitClass )
                    	    {
                    	    // InternalCAEXtext.g:5916:6: (lv_systemUnitClass_64_0= ruleSystemUnitClass )
                    	    // InternalCAEXtext.g:5917:7: lv_systemUnitClass_64_0= ruleSystemUnitClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemUnitClass_ImplAccess().getSystemUnitClassSystemUnitClassParserRuleCall_18_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_systemUnitClass_64_0=ruleSystemUnitClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemUnitClass_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"systemUnitClass",
                    	    								lv_systemUnitClass_64_0,
                    	    								"caex.caex215.CAEXtext.SystemUnitClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop194;
                        }
                    } while (true);

                    otherlv_65=(Token)match(input,19,FOLLOW_31); 

                    				newLeafNode(otherlv_65, grammarAccess.getSystemUnitClass_ImplAccess().getRightCurlyBracketKeyword_18_4());
                    			

                    }
                    break;

            }

            otherlv_66=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_66, grammarAccess.getSystemUnitClass_ImplAccess().getRightCurlyBracketKeyword_19());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemUnitClass_Impl"


    // $ANTLR start "entryRuleMapping"
    // InternalCAEXtext.g:5948:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalCAEXtext.g:5948:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalCAEXtext.g:5949:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalCAEXtext.g:5955:1: ruleMapping returns [EObject current=null] : ( () otherlv_1= 'Mapping' otherlv_2= '{' (otherlv_3= 'changeMode' ( (lv_changeMode_4_0= ruleChangeMode ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleDescription ) ) )? (otherlv_7= 'version' ( (lv_version_8_0= ruleVersion ) ) )? (otherlv_9= 'revision' otherlv_10= '{' ( (lv_revision_11_0= ruleRevision ) ) (otherlv_12= ',' ( (lv_revision_13_0= ruleRevision ) ) )* otherlv_14= '}' )? (otherlv_15= 'copyright' ( (lv_copyright_16_0= ruleCopyright ) ) )? (otherlv_17= 'additionalInformation' otherlv_18= '{' ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) ) (otherlv_20= ',' ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributeNameMapping' otherlv_24= '{' ( (lv_attributeNameMapping_25_0= ruleAttributeNameMapping ) ) (otherlv_26= ',' ( (lv_attributeNameMapping_27_0= ruleAttributeNameMapping ) ) )* otherlv_28= '}' )? (otherlv_29= 'interfaceNameMapping' otherlv_30= '{' ( (lv_interfaceNameMapping_31_0= ruleInterfaceNameMapping ) ) (otherlv_32= ',' ( (lv_interfaceNameMapping_33_0= ruleInterfaceNameMapping ) ) )* otherlv_34= '}' )? otherlv_35= '}' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Enumerator lv_changeMode_4_0 = null;

        EObject lv_description_6_0 = null;

        EObject lv_version_8_0 = null;

        EObject lv_revision_11_0 = null;

        EObject lv_revision_13_0 = null;

        EObject lv_copyright_16_0 = null;

        EObject lv_additionalInformation_19_0 = null;

        EObject lv_additionalInformation_21_0 = null;

        EObject lv_attributeNameMapping_25_0 = null;

        EObject lv_attributeNameMapping_27_0 = null;

        EObject lv_interfaceNameMapping_31_0 = null;

        EObject lv_interfaceNameMapping_33_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:5961:2: ( ( () otherlv_1= 'Mapping' otherlv_2= '{' (otherlv_3= 'changeMode' ( (lv_changeMode_4_0= ruleChangeMode ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleDescription ) ) )? (otherlv_7= 'version' ( (lv_version_8_0= ruleVersion ) ) )? (otherlv_9= 'revision' otherlv_10= '{' ( (lv_revision_11_0= ruleRevision ) ) (otherlv_12= ',' ( (lv_revision_13_0= ruleRevision ) ) )* otherlv_14= '}' )? (otherlv_15= 'copyright' ( (lv_copyright_16_0= ruleCopyright ) ) )? (otherlv_17= 'additionalInformation' otherlv_18= '{' ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) ) (otherlv_20= ',' ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributeNameMapping' otherlv_24= '{' ( (lv_attributeNameMapping_25_0= ruleAttributeNameMapping ) ) (otherlv_26= ',' ( (lv_attributeNameMapping_27_0= ruleAttributeNameMapping ) ) )* otherlv_28= '}' )? (otherlv_29= 'interfaceNameMapping' otherlv_30= '{' ( (lv_interfaceNameMapping_31_0= ruleInterfaceNameMapping ) ) (otherlv_32= ',' ( (lv_interfaceNameMapping_33_0= ruleInterfaceNameMapping ) ) )* otherlv_34= '}' )? otherlv_35= '}' ) )
            // InternalCAEXtext.g:5962:2: ( () otherlv_1= 'Mapping' otherlv_2= '{' (otherlv_3= 'changeMode' ( (lv_changeMode_4_0= ruleChangeMode ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleDescription ) ) )? (otherlv_7= 'version' ( (lv_version_8_0= ruleVersion ) ) )? (otherlv_9= 'revision' otherlv_10= '{' ( (lv_revision_11_0= ruleRevision ) ) (otherlv_12= ',' ( (lv_revision_13_0= ruleRevision ) ) )* otherlv_14= '}' )? (otherlv_15= 'copyright' ( (lv_copyright_16_0= ruleCopyright ) ) )? (otherlv_17= 'additionalInformation' otherlv_18= '{' ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) ) (otherlv_20= ',' ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributeNameMapping' otherlv_24= '{' ( (lv_attributeNameMapping_25_0= ruleAttributeNameMapping ) ) (otherlv_26= ',' ( (lv_attributeNameMapping_27_0= ruleAttributeNameMapping ) ) )* otherlv_28= '}' )? (otherlv_29= 'interfaceNameMapping' otherlv_30= '{' ( (lv_interfaceNameMapping_31_0= ruleInterfaceNameMapping ) ) (otherlv_32= ',' ( (lv_interfaceNameMapping_33_0= ruleInterfaceNameMapping ) ) )* otherlv_34= '}' )? otherlv_35= '}' )
            {
            // InternalCAEXtext.g:5962:2: ( () otherlv_1= 'Mapping' otherlv_2= '{' (otherlv_3= 'changeMode' ( (lv_changeMode_4_0= ruleChangeMode ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleDescription ) ) )? (otherlv_7= 'version' ( (lv_version_8_0= ruleVersion ) ) )? (otherlv_9= 'revision' otherlv_10= '{' ( (lv_revision_11_0= ruleRevision ) ) (otherlv_12= ',' ( (lv_revision_13_0= ruleRevision ) ) )* otherlv_14= '}' )? (otherlv_15= 'copyright' ( (lv_copyright_16_0= ruleCopyright ) ) )? (otherlv_17= 'additionalInformation' otherlv_18= '{' ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) ) (otherlv_20= ',' ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributeNameMapping' otherlv_24= '{' ( (lv_attributeNameMapping_25_0= ruleAttributeNameMapping ) ) (otherlv_26= ',' ( (lv_attributeNameMapping_27_0= ruleAttributeNameMapping ) ) )* otherlv_28= '}' )? (otherlv_29= 'interfaceNameMapping' otherlv_30= '{' ( (lv_interfaceNameMapping_31_0= ruleInterfaceNameMapping ) ) (otherlv_32= ',' ( (lv_interfaceNameMapping_33_0= ruleInterfaceNameMapping ) ) )* otherlv_34= '}' )? otherlv_35= '}' )
            // InternalCAEXtext.g:5963:3: () otherlv_1= 'Mapping' otherlv_2= '{' (otherlv_3= 'changeMode' ( (lv_changeMode_4_0= ruleChangeMode ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= ruleDescription ) ) )? (otherlv_7= 'version' ( (lv_version_8_0= ruleVersion ) ) )? (otherlv_9= 'revision' otherlv_10= '{' ( (lv_revision_11_0= ruleRevision ) ) (otherlv_12= ',' ( (lv_revision_13_0= ruleRevision ) ) )* otherlv_14= '}' )? (otherlv_15= 'copyright' ( (lv_copyright_16_0= ruleCopyright ) ) )? (otherlv_17= 'additionalInformation' otherlv_18= '{' ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) ) (otherlv_20= ',' ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) ) )* otherlv_22= '}' )? (otherlv_23= 'attributeNameMapping' otherlv_24= '{' ( (lv_attributeNameMapping_25_0= ruleAttributeNameMapping ) ) (otherlv_26= ',' ( (lv_attributeNameMapping_27_0= ruleAttributeNameMapping ) ) )* otherlv_28= '}' )? (otherlv_29= 'interfaceNameMapping' otherlv_30= '{' ( (lv_interfaceNameMapping_31_0= ruleInterfaceNameMapping ) ) (otherlv_32= ',' ( (lv_interfaceNameMapping_33_0= ruleInterfaceNameMapping ) ) )* otherlv_34= '}' )? otherlv_35= '}'
            {
            // InternalCAEXtext.g:5963:3: ()
            // InternalCAEXtext.g:5964:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMappingAccess().getMappingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getMappingKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_138); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCAEXtext.g:5978:3: (otherlv_3= 'changeMode' ( (lv_changeMode_4_0= ruleChangeMode ) ) )?
            int alt196=2;
            int LA196_0 = input.LA(1);

            if ( (LA196_0==13) ) {
                alt196=1;
            }
            switch (alt196) {
                case 1 :
                    // InternalCAEXtext.g:5979:4: otherlv_3= 'changeMode' ( (lv_changeMode_4_0= ruleChangeMode ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getChangeModeKeyword_3_0());
                    			
                    // InternalCAEXtext.g:5983:4: ( (lv_changeMode_4_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:5984:5: (lv_changeMode_4_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:5984:5: (lv_changeMode_4_0= ruleChangeMode )
                    // InternalCAEXtext.g:5985:6: lv_changeMode_4_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getMappingAccess().getChangeModeChangeModeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_139);
                    lv_changeMode_4_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_4_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:6003:3: (otherlv_5= 'description' ( (lv_description_6_0= ruleDescription ) ) )?
            int alt197=2;
            int LA197_0 = input.LA(1);

            if ( (LA197_0==61) ) {
                alt197=1;
            }
            switch (alt197) {
                case 1 :
                    // InternalCAEXtext.g:6004:4: otherlv_5= 'description' ( (lv_description_6_0= ruleDescription ) )
                    {
                    otherlv_5=(Token)match(input,61,FOLLOW_103); 

                    				newLeafNode(otherlv_5, grammarAccess.getMappingAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalCAEXtext.g:6008:4: ( (lv_description_6_0= ruleDescription ) )
                    // InternalCAEXtext.g:6009:5: (lv_description_6_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:6009:5: (lv_description_6_0= ruleDescription )
                    // InternalCAEXtext.g:6010:6: lv_description_6_0= ruleDescription
                    {

                    						newCompositeNode(grammarAccess.getMappingAccess().getDescriptionDescriptionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_140);
                    lv_description_6_0=ruleDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"caex.caex215.CAEXtext.Description");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:6028:3: (otherlv_7= 'version' ( (lv_version_8_0= ruleVersion ) ) )?
            int alt198=2;
            int LA198_0 = input.LA(1);

            if ( (LA198_0==62) ) {
                alt198=1;
            }
            switch (alt198) {
                case 1 :
                    // InternalCAEXtext.g:6029:4: otherlv_7= 'version' ( (lv_version_8_0= ruleVersion ) )
                    {
                    otherlv_7=(Token)match(input,62,FOLLOW_105); 

                    				newLeafNode(otherlv_7, grammarAccess.getMappingAccess().getVersionKeyword_5_0());
                    			
                    // InternalCAEXtext.g:6033:4: ( (lv_version_8_0= ruleVersion ) )
                    // InternalCAEXtext.g:6034:5: (lv_version_8_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:6034:5: (lv_version_8_0= ruleVersion )
                    // InternalCAEXtext.g:6035:6: lv_version_8_0= ruleVersion
                    {

                    						newCompositeNode(grammarAccess.getMappingAccess().getVersionVersionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_141);
                    lv_version_8_0=ruleVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_8_0,
                    							"caex.caex215.CAEXtext.Version");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:6053:3: (otherlv_9= 'revision' otherlv_10= '{' ( (lv_revision_11_0= ruleRevision ) ) (otherlv_12= ',' ( (lv_revision_13_0= ruleRevision ) ) )* otherlv_14= '}' )?
            int alt200=2;
            int LA200_0 = input.LA(1);

            if ( (LA200_0==63) ) {
                alt200=1;
            }
            switch (alt200) {
                case 1 :
                    // InternalCAEXtext.g:6054:4: otherlv_9= 'revision' otherlv_10= '{' ( (lv_revision_11_0= ruleRevision ) ) (otherlv_12= ',' ( (lv_revision_13_0= ruleRevision ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,63,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getMappingAccess().getRevisionKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalCAEXtext.g:6062:4: ( (lv_revision_11_0= ruleRevision ) )
                    // InternalCAEXtext.g:6063:5: (lv_revision_11_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:6063:5: (lv_revision_11_0= ruleRevision )
                    // InternalCAEXtext.g:6064:6: lv_revision_11_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getMappingAccess().getRevisionRevisionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_revision_11_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_11_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:6081:4: (otherlv_12= ',' ( (lv_revision_13_0= ruleRevision ) ) )*
                    loop199:
                    do {
                        int alt199=2;
                        int LA199_0 = input.LA(1);

                        if ( (LA199_0==14) ) {
                            alt199=1;
                        }


                        switch (alt199) {
                    	case 1 :
                    	    // InternalCAEXtext.g:6082:5: otherlv_12= ',' ( (lv_revision_13_0= ruleRevision ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getMappingAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCAEXtext.g:6086:5: ( (lv_revision_13_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:6087:6: (lv_revision_13_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:6087:6: (lv_revision_13_0= ruleRevision )
                    	    // InternalCAEXtext.g:6088:7: lv_revision_13_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getMappingAccess().getRevisionRevisionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_revision_13_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMappingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_13_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop199;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_142); 

                    				newLeafNode(otherlv_14, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:6111:3: (otherlv_15= 'copyright' ( (lv_copyright_16_0= ruleCopyright ) ) )?
            int alt201=2;
            int LA201_0 = input.LA(1);

            if ( (LA201_0==64) ) {
                alt201=1;
            }
            switch (alt201) {
                case 1 :
                    // InternalCAEXtext.g:6112:4: otherlv_15= 'copyright' ( (lv_copyright_16_0= ruleCopyright ) )
                    {
                    otherlv_15=(Token)match(input,64,FOLLOW_108); 

                    				newLeafNode(otherlv_15, grammarAccess.getMappingAccess().getCopyrightKeyword_7_0());
                    			
                    // InternalCAEXtext.g:6116:4: ( (lv_copyright_16_0= ruleCopyright ) )
                    // InternalCAEXtext.g:6117:5: (lv_copyright_16_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:6117:5: (lv_copyright_16_0= ruleCopyright )
                    // InternalCAEXtext.g:6118:6: lv_copyright_16_0= ruleCopyright
                    {

                    						newCompositeNode(grammarAccess.getMappingAccess().getCopyrightCopyrightParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_143);
                    lv_copyright_16_0=ruleCopyright();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    						}
                    						set(
                    							current,
                    							"copyright",
                    							lv_copyright_16_0,
                    							"caex.caex215.CAEXtext.Copyright");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:6136:3: (otherlv_17= 'additionalInformation' otherlv_18= '{' ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) ) (otherlv_20= ',' ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) ) )* otherlv_22= '}' )?
            int alt203=2;
            int LA203_0 = input.LA(1);

            if ( (LA203_0==65) ) {
                alt203=1;
            }
            switch (alt203) {
                case 1 :
                    // InternalCAEXtext.g:6137:4: otherlv_17= 'additionalInformation' otherlv_18= '{' ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) ) (otherlv_20= ',' ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,65,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getMappingAccess().getAdditionalInformationKeyword_8_0());
                    			
                    otherlv_18=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalCAEXtext.g:6145:4: ( (lv_additionalInformation_19_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:6146:5: (lv_additionalInformation_19_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:6146:5: (lv_additionalInformation_19_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:6147:6: lv_additionalInformation_19_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getMappingAccess().getAdditionalInformationAdditionalInformationParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_additionalInformation_19_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_19_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:6164:4: (otherlv_20= ',' ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) ) )*
                    loop202:
                    do {
                        int alt202=2;
                        int LA202_0 = input.LA(1);

                        if ( (LA202_0==14) ) {
                            alt202=1;
                        }


                        switch (alt202) {
                    	case 1 :
                    	    // InternalCAEXtext.g:6165:5: otherlv_20= ',' ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getMappingAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalCAEXtext.g:6169:5: ( (lv_additionalInformation_21_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:6170:6: (lv_additionalInformation_21_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:6170:6: (lv_additionalInformation_21_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:6171:7: lv_additionalInformation_21_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getMappingAccess().getAdditionalInformationAdditionalInformationParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_additionalInformation_21_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMappingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_21_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop202;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,19,FOLLOW_144); 

                    				newLeafNode(otherlv_22, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:6194:3: (otherlv_23= 'attributeNameMapping' otherlv_24= '{' ( (lv_attributeNameMapping_25_0= ruleAttributeNameMapping ) ) (otherlv_26= ',' ( (lv_attributeNameMapping_27_0= ruleAttributeNameMapping ) ) )* otherlv_28= '}' )?
            int alt205=2;
            int LA205_0 = input.LA(1);

            if ( (LA205_0==82) ) {
                alt205=1;
            }
            switch (alt205) {
                case 1 :
                    // InternalCAEXtext.g:6195:4: otherlv_23= 'attributeNameMapping' otherlv_24= '{' ( (lv_attributeNameMapping_25_0= ruleAttributeNameMapping ) ) (otherlv_26= ',' ( (lv_attributeNameMapping_27_0= ruleAttributeNameMapping ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,82,FOLLOW_14); 

                    				newLeafNode(otherlv_23, grammarAccess.getMappingAccess().getAttributeNameMappingKeyword_9_0());
                    			
                    otherlv_24=(Token)match(input,16,FOLLOW_145); 

                    				newLeafNode(otherlv_24, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalCAEXtext.g:6203:4: ( (lv_attributeNameMapping_25_0= ruleAttributeNameMapping ) )
                    // InternalCAEXtext.g:6204:5: (lv_attributeNameMapping_25_0= ruleAttributeNameMapping )
                    {
                    // InternalCAEXtext.g:6204:5: (lv_attributeNameMapping_25_0= ruleAttributeNameMapping )
                    // InternalCAEXtext.g:6205:6: lv_attributeNameMapping_25_0= ruleAttributeNameMapping
                    {

                    						newCompositeNode(grammarAccess.getMappingAccess().getAttributeNameMappingAttributeNameMappingParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_attributeNameMapping_25_0=ruleAttributeNameMapping();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    						}
                    						add(
                    							current,
                    							"attributeNameMapping",
                    							lv_attributeNameMapping_25_0,
                    							"caex.caex215.CAEXtext.AttributeNameMapping");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:6222:4: (otherlv_26= ',' ( (lv_attributeNameMapping_27_0= ruleAttributeNameMapping ) ) )*
                    loop204:
                    do {
                        int alt204=2;
                        int LA204_0 = input.LA(1);

                        if ( (LA204_0==14) ) {
                            alt204=1;
                        }


                        switch (alt204) {
                    	case 1 :
                    	    // InternalCAEXtext.g:6223:5: otherlv_26= ',' ( (lv_attributeNameMapping_27_0= ruleAttributeNameMapping ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_145); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getMappingAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalCAEXtext.g:6227:5: ( (lv_attributeNameMapping_27_0= ruleAttributeNameMapping ) )
                    	    // InternalCAEXtext.g:6228:6: (lv_attributeNameMapping_27_0= ruleAttributeNameMapping )
                    	    {
                    	    // InternalCAEXtext.g:6228:6: (lv_attributeNameMapping_27_0= ruleAttributeNameMapping )
                    	    // InternalCAEXtext.g:6229:7: lv_attributeNameMapping_27_0= ruleAttributeNameMapping
                    	    {

                    	    							newCompositeNode(grammarAccess.getMappingAccess().getAttributeNameMappingAttributeNameMappingParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_attributeNameMapping_27_0=ruleAttributeNameMapping();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMappingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributeNameMapping",
                    	    								lv_attributeNameMapping_27_0,
                    	    								"caex.caex215.CAEXtext.AttributeNameMapping");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop204;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,19,FOLLOW_146); 

                    				newLeafNode(otherlv_28, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:6252:3: (otherlv_29= 'interfaceNameMapping' otherlv_30= '{' ( (lv_interfaceNameMapping_31_0= ruleInterfaceNameMapping ) ) (otherlv_32= ',' ( (lv_interfaceNameMapping_33_0= ruleInterfaceNameMapping ) ) )* otherlv_34= '}' )?
            int alt207=2;
            int LA207_0 = input.LA(1);

            if ( (LA207_0==83) ) {
                alt207=1;
            }
            switch (alt207) {
                case 1 :
                    // InternalCAEXtext.g:6253:4: otherlv_29= 'interfaceNameMapping' otherlv_30= '{' ( (lv_interfaceNameMapping_31_0= ruleInterfaceNameMapping ) ) (otherlv_32= ',' ( (lv_interfaceNameMapping_33_0= ruleInterfaceNameMapping ) ) )* otherlv_34= '}'
                    {
                    otherlv_29=(Token)match(input,83,FOLLOW_14); 

                    				newLeafNode(otherlv_29, grammarAccess.getMappingAccess().getInterfaceNameMappingKeyword_10_0());
                    			
                    otherlv_30=(Token)match(input,16,FOLLOW_147); 

                    				newLeafNode(otherlv_30, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalCAEXtext.g:6261:4: ( (lv_interfaceNameMapping_31_0= ruleInterfaceNameMapping ) )
                    // InternalCAEXtext.g:6262:5: (lv_interfaceNameMapping_31_0= ruleInterfaceNameMapping )
                    {
                    // InternalCAEXtext.g:6262:5: (lv_interfaceNameMapping_31_0= ruleInterfaceNameMapping )
                    // InternalCAEXtext.g:6263:6: lv_interfaceNameMapping_31_0= ruleInterfaceNameMapping
                    {

                    						newCompositeNode(grammarAccess.getMappingAccess().getInterfaceNameMappingInterfaceNameMappingParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_interfaceNameMapping_31_0=ruleInterfaceNameMapping();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    						}
                    						add(
                    							current,
                    							"interfaceNameMapping",
                    							lv_interfaceNameMapping_31_0,
                    							"caex.caex215.CAEXtext.InterfaceNameMapping");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:6280:4: (otherlv_32= ',' ( (lv_interfaceNameMapping_33_0= ruleInterfaceNameMapping ) ) )*
                    loop206:
                    do {
                        int alt206=2;
                        int LA206_0 = input.LA(1);

                        if ( (LA206_0==14) ) {
                            alt206=1;
                        }


                        switch (alt206) {
                    	case 1 :
                    	    // InternalCAEXtext.g:6281:5: otherlv_32= ',' ( (lv_interfaceNameMapping_33_0= ruleInterfaceNameMapping ) )
                    	    {
                    	    otherlv_32=(Token)match(input,14,FOLLOW_147); 

                    	    					newLeafNode(otherlv_32, grammarAccess.getMappingAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalCAEXtext.g:6285:5: ( (lv_interfaceNameMapping_33_0= ruleInterfaceNameMapping ) )
                    	    // InternalCAEXtext.g:6286:6: (lv_interfaceNameMapping_33_0= ruleInterfaceNameMapping )
                    	    {
                    	    // InternalCAEXtext.g:6286:6: (lv_interfaceNameMapping_33_0= ruleInterfaceNameMapping )
                    	    // InternalCAEXtext.g:6287:7: lv_interfaceNameMapping_33_0= ruleInterfaceNameMapping
                    	    {

                    	    							newCompositeNode(grammarAccess.getMappingAccess().getInterfaceNameMappingInterfaceNameMappingParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_interfaceNameMapping_33_0=ruleInterfaceNameMapping();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMappingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaceNameMapping",
                    	    								lv_interfaceNameMapping_33_0,
                    	    								"caex.caex215.CAEXtext.InterfaceNameMapping");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop206;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,19,FOLLOW_31); 

                    				newLeafNode(otherlv_34, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_35=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_35, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleRefSemantic"
    // InternalCAEXtext.g:6318:1: entryRuleRefSemantic returns [EObject current=null] : iv_ruleRefSemantic= ruleRefSemantic EOF ;
    public final EObject entryRuleRefSemantic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefSemantic = null;


        try {
            // InternalCAEXtext.g:6318:52: (iv_ruleRefSemantic= ruleRefSemantic EOF )
            // InternalCAEXtext.g:6319:2: iv_ruleRefSemantic= ruleRefSemantic EOF
            {
             newCompositeNode(grammarAccess.getRefSemanticRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefSemantic=ruleRefSemantic();

            state._fsp--;

             current =iv_ruleRefSemantic; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRefSemantic"


    // $ANTLR start "ruleRefSemantic"
    // InternalCAEXtext.g:6325:1: ruleRefSemantic returns [EObject current=null] : (otherlv_0= 'RefSemantic' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'correspondingAttributePath' ( (lv_correspondingAttributePath_5_0= ruleEString ) ) (otherlv_6= 'description' ( (lv_description_7_0= ruleDescription ) ) )? (otherlv_8= 'version' ( (lv_version_9_0= ruleVersion ) ) )? (otherlv_10= 'revision' otherlv_11= '{' ( (lv_revision_12_0= ruleRevision ) ) (otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) ) )* otherlv_15= '}' )? (otherlv_16= 'copyright' ( (lv_copyright_17_0= ruleCopyright ) ) )? (otherlv_18= 'additionalInformation' otherlv_19= '{' ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleRefSemantic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Enumerator lv_changeMode_3_0 = null;

        AntlrDatatypeRuleToken lv_correspondingAttributePath_5_0 = null;

        EObject lv_description_7_0 = null;

        EObject lv_version_9_0 = null;

        EObject lv_revision_12_0 = null;

        EObject lv_revision_14_0 = null;

        EObject lv_copyright_17_0 = null;

        EObject lv_additionalInformation_20_0 = null;

        EObject lv_additionalInformation_22_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:6331:2: ( (otherlv_0= 'RefSemantic' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'correspondingAttributePath' ( (lv_correspondingAttributePath_5_0= ruleEString ) ) (otherlv_6= 'description' ( (lv_description_7_0= ruleDescription ) ) )? (otherlv_8= 'version' ( (lv_version_9_0= ruleVersion ) ) )? (otherlv_10= 'revision' otherlv_11= '{' ( (lv_revision_12_0= ruleRevision ) ) (otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) ) )* otherlv_15= '}' )? (otherlv_16= 'copyright' ( (lv_copyright_17_0= ruleCopyright ) ) )? (otherlv_18= 'additionalInformation' otherlv_19= '{' ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalCAEXtext.g:6332:2: (otherlv_0= 'RefSemantic' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'correspondingAttributePath' ( (lv_correspondingAttributePath_5_0= ruleEString ) ) (otherlv_6= 'description' ( (lv_description_7_0= ruleDescription ) ) )? (otherlv_8= 'version' ( (lv_version_9_0= ruleVersion ) ) )? (otherlv_10= 'revision' otherlv_11= '{' ( (lv_revision_12_0= ruleRevision ) ) (otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) ) )* otherlv_15= '}' )? (otherlv_16= 'copyright' ( (lv_copyright_17_0= ruleCopyright ) ) )? (otherlv_18= 'additionalInformation' otherlv_19= '{' ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalCAEXtext.g:6332:2: (otherlv_0= 'RefSemantic' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'correspondingAttributePath' ( (lv_correspondingAttributePath_5_0= ruleEString ) ) (otherlv_6= 'description' ( (lv_description_7_0= ruleDescription ) ) )? (otherlv_8= 'version' ( (lv_version_9_0= ruleVersion ) ) )? (otherlv_10= 'revision' otherlv_11= '{' ( (lv_revision_12_0= ruleRevision ) ) (otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) ) )* otherlv_15= '}' )? (otherlv_16= 'copyright' ( (lv_copyright_17_0= ruleCopyright ) ) )? (otherlv_18= 'additionalInformation' otherlv_19= '{' ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalCAEXtext.g:6333:3: otherlv_0= 'RefSemantic' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'correspondingAttributePath' ( (lv_correspondingAttributePath_5_0= ruleEString ) ) (otherlv_6= 'description' ( (lv_description_7_0= ruleDescription ) ) )? (otherlv_8= 'version' ( (lv_version_9_0= ruleVersion ) ) )? (otherlv_10= 'revision' otherlv_11= '{' ( (lv_revision_12_0= ruleRevision ) ) (otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) ) )* otherlv_15= '}' )? (otherlv_16= 'copyright' ( (lv_copyright_17_0= ruleCopyright ) ) )? (otherlv_18= 'additionalInformation' otherlv_19= '{' ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRefSemanticAccess().getRefSemanticKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_148); 

            			newLeafNode(otherlv_1, grammarAccess.getRefSemanticAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCAEXtext.g:6341:3: (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )?
            int alt208=2;
            int LA208_0 = input.LA(1);

            if ( (LA208_0==13) ) {
                alt208=1;
            }
            switch (alt208) {
                case 1 :
                    // InternalCAEXtext.g:6342:4: otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getRefSemanticAccess().getChangeModeKeyword_2_0());
                    			
                    // InternalCAEXtext.g:6346:4: ( (lv_changeMode_3_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:6347:5: (lv_changeMode_3_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:6347:5: (lv_changeMode_3_0= ruleChangeMode )
                    // InternalCAEXtext.g:6348:6: lv_changeMode_3_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getRefSemanticAccess().getChangeModeChangeModeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_149);
                    lv_changeMode_3_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefSemanticRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_3_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,85,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getRefSemanticAccess().getCorrespondingAttributePathKeyword_3());
            		
            // InternalCAEXtext.g:6370:3: ( (lv_correspondingAttributePath_5_0= ruleEString ) )
            // InternalCAEXtext.g:6371:4: (lv_correspondingAttributePath_5_0= ruleEString )
            {
            // InternalCAEXtext.g:6371:4: (lv_correspondingAttributePath_5_0= ruleEString )
            // InternalCAEXtext.g:6372:5: lv_correspondingAttributePath_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRefSemanticAccess().getCorrespondingAttributePathEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_150);
            lv_correspondingAttributePath_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRefSemanticRule());
            					}
            					set(
            						current,
            						"correspondingAttributePath",
            						lv_correspondingAttributePath_5_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCAEXtext.g:6389:3: (otherlv_6= 'description' ( (lv_description_7_0= ruleDescription ) ) )?
            int alt209=2;
            int LA209_0 = input.LA(1);

            if ( (LA209_0==61) ) {
                alt209=1;
            }
            switch (alt209) {
                case 1 :
                    // InternalCAEXtext.g:6390:4: otherlv_6= 'description' ( (lv_description_7_0= ruleDescription ) )
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_103); 

                    				newLeafNode(otherlv_6, grammarAccess.getRefSemanticAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalCAEXtext.g:6394:4: ( (lv_description_7_0= ruleDescription ) )
                    // InternalCAEXtext.g:6395:5: (lv_description_7_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:6395:5: (lv_description_7_0= ruleDescription )
                    // InternalCAEXtext.g:6396:6: lv_description_7_0= ruleDescription
                    {

                    						newCompositeNode(grammarAccess.getRefSemanticAccess().getDescriptionDescriptionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_151);
                    lv_description_7_0=ruleDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefSemanticRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"caex.caex215.CAEXtext.Description");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:6414:3: (otherlv_8= 'version' ( (lv_version_9_0= ruleVersion ) ) )?
            int alt210=2;
            int LA210_0 = input.LA(1);

            if ( (LA210_0==62) ) {
                alt210=1;
            }
            switch (alt210) {
                case 1 :
                    // InternalCAEXtext.g:6415:4: otherlv_8= 'version' ( (lv_version_9_0= ruleVersion ) )
                    {
                    otherlv_8=(Token)match(input,62,FOLLOW_105); 

                    				newLeafNode(otherlv_8, grammarAccess.getRefSemanticAccess().getVersionKeyword_6_0());
                    			
                    // InternalCAEXtext.g:6419:4: ( (lv_version_9_0= ruleVersion ) )
                    // InternalCAEXtext.g:6420:5: (lv_version_9_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:6420:5: (lv_version_9_0= ruleVersion )
                    // InternalCAEXtext.g:6421:6: lv_version_9_0= ruleVersion
                    {

                    						newCompositeNode(grammarAccess.getRefSemanticAccess().getVersionVersionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_152);
                    lv_version_9_0=ruleVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefSemanticRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_9_0,
                    							"caex.caex215.CAEXtext.Version");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:6439:3: (otherlv_10= 'revision' otherlv_11= '{' ( (lv_revision_12_0= ruleRevision ) ) (otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) ) )* otherlv_15= '}' )?
            int alt212=2;
            int LA212_0 = input.LA(1);

            if ( (LA212_0==63) ) {
                alt212=1;
            }
            switch (alt212) {
                case 1 :
                    // InternalCAEXtext.g:6440:4: otherlv_10= 'revision' otherlv_11= '{' ( (lv_revision_12_0= ruleRevision ) ) (otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,63,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getRefSemanticAccess().getRevisionKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getRefSemanticAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalCAEXtext.g:6448:4: ( (lv_revision_12_0= ruleRevision ) )
                    // InternalCAEXtext.g:6449:5: (lv_revision_12_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:6449:5: (lv_revision_12_0= ruleRevision )
                    // InternalCAEXtext.g:6450:6: lv_revision_12_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getRefSemanticAccess().getRevisionRevisionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_revision_12_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefSemanticRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_12_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:6467:4: (otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) ) )*
                    loop211:
                    do {
                        int alt211=2;
                        int LA211_0 = input.LA(1);

                        if ( (LA211_0==14) ) {
                            alt211=1;
                        }


                        switch (alt211) {
                    	case 1 :
                    	    // InternalCAEXtext.g:6468:5: otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getRefSemanticAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCAEXtext.g:6472:5: ( (lv_revision_14_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:6473:6: (lv_revision_14_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:6473:6: (lv_revision_14_0= ruleRevision )
                    	    // InternalCAEXtext.g:6474:7: lv_revision_14_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefSemanticAccess().getRevisionRevisionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_revision_14_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefSemanticRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_14_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop211;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,19,FOLLOW_153); 

                    				newLeafNode(otherlv_15, grammarAccess.getRefSemanticAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:6497:3: (otherlv_16= 'copyright' ( (lv_copyright_17_0= ruleCopyright ) ) )?
            int alt213=2;
            int LA213_0 = input.LA(1);

            if ( (LA213_0==64) ) {
                alt213=1;
            }
            switch (alt213) {
                case 1 :
                    // InternalCAEXtext.g:6498:4: otherlv_16= 'copyright' ( (lv_copyright_17_0= ruleCopyright ) )
                    {
                    otherlv_16=(Token)match(input,64,FOLLOW_108); 

                    				newLeafNode(otherlv_16, grammarAccess.getRefSemanticAccess().getCopyrightKeyword_8_0());
                    			
                    // InternalCAEXtext.g:6502:4: ( (lv_copyright_17_0= ruleCopyright ) )
                    // InternalCAEXtext.g:6503:5: (lv_copyright_17_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:6503:5: (lv_copyright_17_0= ruleCopyright )
                    // InternalCAEXtext.g:6504:6: lv_copyright_17_0= ruleCopyright
                    {

                    						newCompositeNode(grammarAccess.getRefSemanticAccess().getCopyrightCopyrightParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_154);
                    lv_copyright_17_0=ruleCopyright();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefSemanticRule());
                    						}
                    						set(
                    							current,
                    							"copyright",
                    							lv_copyright_17_0,
                    							"caex.caex215.CAEXtext.Copyright");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:6522:3: (otherlv_18= 'additionalInformation' otherlv_19= '{' ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* otherlv_23= '}' )?
            int alt215=2;
            int LA215_0 = input.LA(1);

            if ( (LA215_0==65) ) {
                alt215=1;
            }
            switch (alt215) {
                case 1 :
                    // InternalCAEXtext.g:6523:4: otherlv_18= 'additionalInformation' otherlv_19= '{' ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,65,FOLLOW_14); 

                    				newLeafNode(otherlv_18, grammarAccess.getRefSemanticAccess().getAdditionalInformationKeyword_9_0());
                    			
                    otherlv_19=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getRefSemanticAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalCAEXtext.g:6531:4: ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:6532:5: (lv_additionalInformation_20_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:6532:5: (lv_additionalInformation_20_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:6533:6: lv_additionalInformation_20_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getRefSemanticAccess().getAdditionalInformationAdditionalInformationParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_additionalInformation_20_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefSemanticRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_20_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:6550:4: (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )*
                    loop214:
                    do {
                        int alt214=2;
                        int LA214_0 = input.LA(1);

                        if ( (LA214_0==14) ) {
                            alt214=1;
                        }


                        switch (alt214) {
                    	case 1 :
                    	    // InternalCAEXtext.g:6551:5: otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getRefSemanticAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalCAEXtext.g:6555:5: ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:6556:6: (lv_additionalInformation_22_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:6556:6: (lv_additionalInformation_22_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:6557:7: lv_additionalInformation_22_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRefSemanticAccess().getAdditionalInformationAdditionalInformationParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_additionalInformation_22_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRefSemanticRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_22_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop214;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,19,FOLLOW_31); 

                    				newLeafNode(otherlv_23, grammarAccess.getRefSemanticAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getRefSemanticAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefSemantic"


    // $ANTLR start "entryRuleAttributeValueRequirement"
    // InternalCAEXtext.g:6588:1: entryRuleAttributeValueRequirement returns [EObject current=null] : iv_ruleAttributeValueRequirement= ruleAttributeValueRequirement EOF ;
    public final EObject entryRuleAttributeValueRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValueRequirement = null;


        try {
            // InternalCAEXtext.g:6588:66: (iv_ruleAttributeValueRequirement= ruleAttributeValueRequirement EOF )
            // InternalCAEXtext.g:6589:2: iv_ruleAttributeValueRequirement= ruleAttributeValueRequirement EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValueRequirement=ruleAttributeValueRequirement();

            state._fsp--;

             current =iv_ruleAttributeValueRequirement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeValueRequirement"


    // $ANTLR start "ruleAttributeValueRequirement"
    // InternalCAEXtext.g:6595:1: ruleAttributeValueRequirement returns [EObject current=null] : (otherlv_0= 'AttributeValueRequirement' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'description' ( (lv_description_7_0= ruleDescription ) ) )? (otherlv_8= 'version' ( (lv_version_9_0= ruleVersion ) ) )? (otherlv_10= 'revision' otherlv_11= '{' ( (lv_revision_12_0= ruleRevision ) ) (otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) ) )* otherlv_15= '}' )? (otherlv_16= 'copyright' ( (lv_copyright_17_0= ruleCopyright ) ) )? (otherlv_18= 'additionalInformation' otherlv_19= '{' ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* otherlv_23= '}' )? (otherlv_24= 'ordinalScaledType' ( (lv_ordinalScaledType_25_0= ruleOrdinalScaled ) ) )? (otherlv_26= 'nominalScaledType' ( (lv_nominalScaledType_27_0= ruleNominalScaled ) ) )? (otherlv_28= 'unknownType' ( (lv_unknownType_29_0= ruleUnknownType ) ) )? otherlv_30= '}' ) ;
    public final EObject ruleAttributeValueRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Enumerator lv_changeMode_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_description_7_0 = null;

        EObject lv_version_9_0 = null;

        EObject lv_revision_12_0 = null;

        EObject lv_revision_14_0 = null;

        EObject lv_copyright_17_0 = null;

        EObject lv_additionalInformation_20_0 = null;

        EObject lv_additionalInformation_22_0 = null;

        EObject lv_ordinalScaledType_25_0 = null;

        EObject lv_nominalScaledType_27_0 = null;

        EObject lv_unknownType_29_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:6601:2: ( (otherlv_0= 'AttributeValueRequirement' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'description' ( (lv_description_7_0= ruleDescription ) ) )? (otherlv_8= 'version' ( (lv_version_9_0= ruleVersion ) ) )? (otherlv_10= 'revision' otherlv_11= '{' ( (lv_revision_12_0= ruleRevision ) ) (otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) ) )* otherlv_15= '}' )? (otherlv_16= 'copyright' ( (lv_copyright_17_0= ruleCopyright ) ) )? (otherlv_18= 'additionalInformation' otherlv_19= '{' ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* otherlv_23= '}' )? (otherlv_24= 'ordinalScaledType' ( (lv_ordinalScaledType_25_0= ruleOrdinalScaled ) ) )? (otherlv_26= 'nominalScaledType' ( (lv_nominalScaledType_27_0= ruleNominalScaled ) ) )? (otherlv_28= 'unknownType' ( (lv_unknownType_29_0= ruleUnknownType ) ) )? otherlv_30= '}' ) )
            // InternalCAEXtext.g:6602:2: (otherlv_0= 'AttributeValueRequirement' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'description' ( (lv_description_7_0= ruleDescription ) ) )? (otherlv_8= 'version' ( (lv_version_9_0= ruleVersion ) ) )? (otherlv_10= 'revision' otherlv_11= '{' ( (lv_revision_12_0= ruleRevision ) ) (otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) ) )* otherlv_15= '}' )? (otherlv_16= 'copyright' ( (lv_copyright_17_0= ruleCopyright ) ) )? (otherlv_18= 'additionalInformation' otherlv_19= '{' ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* otherlv_23= '}' )? (otherlv_24= 'ordinalScaledType' ( (lv_ordinalScaledType_25_0= ruleOrdinalScaled ) ) )? (otherlv_26= 'nominalScaledType' ( (lv_nominalScaledType_27_0= ruleNominalScaled ) ) )? (otherlv_28= 'unknownType' ( (lv_unknownType_29_0= ruleUnknownType ) ) )? otherlv_30= '}' )
            {
            // InternalCAEXtext.g:6602:2: (otherlv_0= 'AttributeValueRequirement' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'description' ( (lv_description_7_0= ruleDescription ) ) )? (otherlv_8= 'version' ( (lv_version_9_0= ruleVersion ) ) )? (otherlv_10= 'revision' otherlv_11= '{' ( (lv_revision_12_0= ruleRevision ) ) (otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) ) )* otherlv_15= '}' )? (otherlv_16= 'copyright' ( (lv_copyright_17_0= ruleCopyright ) ) )? (otherlv_18= 'additionalInformation' otherlv_19= '{' ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* otherlv_23= '}' )? (otherlv_24= 'ordinalScaledType' ( (lv_ordinalScaledType_25_0= ruleOrdinalScaled ) ) )? (otherlv_26= 'nominalScaledType' ( (lv_nominalScaledType_27_0= ruleNominalScaled ) ) )? (otherlv_28= 'unknownType' ( (lv_unknownType_29_0= ruleUnknownType ) ) )? otherlv_30= '}' )
            // InternalCAEXtext.g:6603:3: otherlv_0= 'AttributeValueRequirement' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'name' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'description' ( (lv_description_7_0= ruleDescription ) ) )? (otherlv_8= 'version' ( (lv_version_9_0= ruleVersion ) ) )? (otherlv_10= 'revision' otherlv_11= '{' ( (lv_revision_12_0= ruleRevision ) ) (otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) ) )* otherlv_15= '}' )? (otherlv_16= 'copyright' ( (lv_copyright_17_0= ruleCopyright ) ) )? (otherlv_18= 'additionalInformation' otherlv_19= '{' ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* otherlv_23= '}' )? (otherlv_24= 'ordinalScaledType' ( (lv_ordinalScaledType_25_0= ruleOrdinalScaled ) ) )? (otherlv_26= 'nominalScaledType' ( (lv_nominalScaledType_27_0= ruleNominalScaled ) ) )? (otherlv_28= 'unknownType' ( (lv_unknownType_29_0= ruleUnknownType ) ) )? otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeValueRequirementAccess().getAttributeValueRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_155); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeValueRequirementAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCAEXtext.g:6611:3: (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )?
            int alt216=2;
            int LA216_0 = input.LA(1);

            if ( (LA216_0==13) ) {
                alt216=1;
            }
            switch (alt216) {
                case 1 :
                    // InternalCAEXtext.g:6612:4: otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeValueRequirementAccess().getChangeModeKeyword_2_0());
                    			
                    // InternalCAEXtext.g:6616:4: ( (lv_changeMode_3_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:6617:5: (lv_changeMode_3_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:6617:5: (lv_changeMode_3_0= ruleChangeMode )
                    // InternalCAEXtext.g:6618:6: lv_changeMode_3_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getAttributeValueRequirementAccess().getChangeModeChangeModeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_changeMode_3_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValueRequirementRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_3_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeValueRequirementAccess().getNameKeyword_3());
            		
            // InternalCAEXtext.g:6640:3: ( (lv_name_5_0= ruleEString ) )
            // InternalCAEXtext.g:6641:4: (lv_name_5_0= ruleEString )
            {
            // InternalCAEXtext.g:6641:4: (lv_name_5_0= ruleEString )
            // InternalCAEXtext.g:6642:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeValueRequirementAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_156);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeValueRequirementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCAEXtext.g:6659:3: (otherlv_6= 'description' ( (lv_description_7_0= ruleDescription ) ) )?
            int alt217=2;
            int LA217_0 = input.LA(1);

            if ( (LA217_0==61) ) {
                alt217=1;
            }
            switch (alt217) {
                case 1 :
                    // InternalCAEXtext.g:6660:4: otherlv_6= 'description' ( (lv_description_7_0= ruleDescription ) )
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_103); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeValueRequirementAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalCAEXtext.g:6664:4: ( (lv_description_7_0= ruleDescription ) )
                    // InternalCAEXtext.g:6665:5: (lv_description_7_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:6665:5: (lv_description_7_0= ruleDescription )
                    // InternalCAEXtext.g:6666:6: lv_description_7_0= ruleDescription
                    {

                    						newCompositeNode(grammarAccess.getAttributeValueRequirementAccess().getDescriptionDescriptionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_157);
                    lv_description_7_0=ruleDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValueRequirementRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"caex.caex215.CAEXtext.Description");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:6684:3: (otherlv_8= 'version' ( (lv_version_9_0= ruleVersion ) ) )?
            int alt218=2;
            int LA218_0 = input.LA(1);

            if ( (LA218_0==62) ) {
                alt218=1;
            }
            switch (alt218) {
                case 1 :
                    // InternalCAEXtext.g:6685:4: otherlv_8= 'version' ( (lv_version_9_0= ruleVersion ) )
                    {
                    otherlv_8=(Token)match(input,62,FOLLOW_105); 

                    				newLeafNode(otherlv_8, grammarAccess.getAttributeValueRequirementAccess().getVersionKeyword_6_0());
                    			
                    // InternalCAEXtext.g:6689:4: ( (lv_version_9_0= ruleVersion ) )
                    // InternalCAEXtext.g:6690:5: (lv_version_9_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:6690:5: (lv_version_9_0= ruleVersion )
                    // InternalCAEXtext.g:6691:6: lv_version_9_0= ruleVersion
                    {

                    						newCompositeNode(grammarAccess.getAttributeValueRequirementAccess().getVersionVersionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_158);
                    lv_version_9_0=ruleVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValueRequirementRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_9_0,
                    							"caex.caex215.CAEXtext.Version");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:6709:3: (otherlv_10= 'revision' otherlv_11= '{' ( (lv_revision_12_0= ruleRevision ) ) (otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) ) )* otherlv_15= '}' )?
            int alt220=2;
            int LA220_0 = input.LA(1);

            if ( (LA220_0==63) ) {
                alt220=1;
            }
            switch (alt220) {
                case 1 :
                    // InternalCAEXtext.g:6710:4: otherlv_10= 'revision' otherlv_11= '{' ( (lv_revision_12_0= ruleRevision ) ) (otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,63,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getAttributeValueRequirementAccess().getRevisionKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getAttributeValueRequirementAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalCAEXtext.g:6718:4: ( (lv_revision_12_0= ruleRevision ) )
                    // InternalCAEXtext.g:6719:5: (lv_revision_12_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:6719:5: (lv_revision_12_0= ruleRevision )
                    // InternalCAEXtext.g:6720:6: lv_revision_12_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getAttributeValueRequirementAccess().getRevisionRevisionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_revision_12_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValueRequirementRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_12_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:6737:4: (otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) ) )*
                    loop219:
                    do {
                        int alt219=2;
                        int LA219_0 = input.LA(1);

                        if ( (LA219_0==14) ) {
                            alt219=1;
                        }


                        switch (alt219) {
                    	case 1 :
                    	    // InternalCAEXtext.g:6738:5: otherlv_13= ',' ( (lv_revision_14_0= ruleRevision ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAttributeValueRequirementAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCAEXtext.g:6742:5: ( (lv_revision_14_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:6743:6: (lv_revision_14_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:6743:6: (lv_revision_14_0= ruleRevision )
                    	    // InternalCAEXtext.g:6744:7: lv_revision_14_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeValueRequirementAccess().getRevisionRevisionParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_revision_14_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAttributeValueRequirementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_14_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop219;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,19,FOLLOW_159); 

                    				newLeafNode(otherlv_15, grammarAccess.getAttributeValueRequirementAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:6767:3: (otherlv_16= 'copyright' ( (lv_copyright_17_0= ruleCopyright ) ) )?
            int alt221=2;
            int LA221_0 = input.LA(1);

            if ( (LA221_0==64) ) {
                alt221=1;
            }
            switch (alt221) {
                case 1 :
                    // InternalCAEXtext.g:6768:4: otherlv_16= 'copyright' ( (lv_copyright_17_0= ruleCopyright ) )
                    {
                    otherlv_16=(Token)match(input,64,FOLLOW_108); 

                    				newLeafNode(otherlv_16, grammarAccess.getAttributeValueRequirementAccess().getCopyrightKeyword_8_0());
                    			
                    // InternalCAEXtext.g:6772:4: ( (lv_copyright_17_0= ruleCopyright ) )
                    // InternalCAEXtext.g:6773:5: (lv_copyright_17_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:6773:5: (lv_copyright_17_0= ruleCopyright )
                    // InternalCAEXtext.g:6774:6: lv_copyright_17_0= ruleCopyright
                    {

                    						newCompositeNode(grammarAccess.getAttributeValueRequirementAccess().getCopyrightCopyrightParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_160);
                    lv_copyright_17_0=ruleCopyright();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValueRequirementRule());
                    						}
                    						set(
                    							current,
                    							"copyright",
                    							lv_copyright_17_0,
                    							"caex.caex215.CAEXtext.Copyright");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:6792:3: (otherlv_18= 'additionalInformation' otherlv_19= '{' ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* otherlv_23= '}' )?
            int alt223=2;
            int LA223_0 = input.LA(1);

            if ( (LA223_0==65) ) {
                alt223=1;
            }
            switch (alt223) {
                case 1 :
                    // InternalCAEXtext.g:6793:4: otherlv_18= 'additionalInformation' otherlv_19= '{' ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) ) (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,65,FOLLOW_14); 

                    				newLeafNode(otherlv_18, grammarAccess.getAttributeValueRequirementAccess().getAdditionalInformationKeyword_9_0());
                    			
                    otherlv_19=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getAttributeValueRequirementAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalCAEXtext.g:6801:4: ( (lv_additionalInformation_20_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:6802:5: (lv_additionalInformation_20_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:6802:5: (lv_additionalInformation_20_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:6803:6: lv_additionalInformation_20_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getAttributeValueRequirementAccess().getAdditionalInformationAdditionalInformationParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_additionalInformation_20_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValueRequirementRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_20_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:6820:4: (otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) )*
                    loop222:
                    do {
                        int alt222=2;
                        int LA222_0 = input.LA(1);

                        if ( (LA222_0==14) ) {
                            alt222=1;
                        }


                        switch (alt222) {
                    	case 1 :
                    	    // InternalCAEXtext.g:6821:5: otherlv_21= ',' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getAttributeValueRequirementAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalCAEXtext.g:6825:5: ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:6826:6: (lv_additionalInformation_22_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:6826:6: (lv_additionalInformation_22_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:6827:7: lv_additionalInformation_22_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeValueRequirementAccess().getAdditionalInformationAdditionalInformationParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_additionalInformation_22_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAttributeValueRequirementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_22_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop222;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,19,FOLLOW_161); 

                    				newLeafNode(otherlv_23, grammarAccess.getAttributeValueRequirementAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:6850:3: (otherlv_24= 'ordinalScaledType' ( (lv_ordinalScaledType_25_0= ruleOrdinalScaled ) ) )?
            int alt224=2;
            int LA224_0 = input.LA(1);

            if ( (LA224_0==87) ) {
                alt224=1;
            }
            switch (alt224) {
                case 1 :
                    // InternalCAEXtext.g:6851:4: otherlv_24= 'ordinalScaledType' ( (lv_ordinalScaledType_25_0= ruleOrdinalScaled ) )
                    {
                    otherlv_24=(Token)match(input,87,FOLLOW_162); 

                    				newLeafNode(otherlv_24, grammarAccess.getAttributeValueRequirementAccess().getOrdinalScaledTypeKeyword_10_0());
                    			
                    // InternalCAEXtext.g:6855:4: ( (lv_ordinalScaledType_25_0= ruleOrdinalScaled ) )
                    // InternalCAEXtext.g:6856:5: (lv_ordinalScaledType_25_0= ruleOrdinalScaled )
                    {
                    // InternalCAEXtext.g:6856:5: (lv_ordinalScaledType_25_0= ruleOrdinalScaled )
                    // InternalCAEXtext.g:6857:6: lv_ordinalScaledType_25_0= ruleOrdinalScaled
                    {

                    						newCompositeNode(grammarAccess.getAttributeValueRequirementAccess().getOrdinalScaledTypeOrdinalScaledParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_163);
                    lv_ordinalScaledType_25_0=ruleOrdinalScaled();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValueRequirementRule());
                    						}
                    						set(
                    							current,
                    							"ordinalScaledType",
                    							lv_ordinalScaledType_25_0,
                    							"caex.caex215.CAEXtext.OrdinalScaled");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:6875:3: (otherlv_26= 'nominalScaledType' ( (lv_nominalScaledType_27_0= ruleNominalScaled ) ) )?
            int alt225=2;
            int LA225_0 = input.LA(1);

            if ( (LA225_0==88) ) {
                alt225=1;
            }
            switch (alt225) {
                case 1 :
                    // InternalCAEXtext.g:6876:4: otherlv_26= 'nominalScaledType' ( (lv_nominalScaledType_27_0= ruleNominalScaled ) )
                    {
                    otherlv_26=(Token)match(input,88,FOLLOW_164); 

                    				newLeafNode(otherlv_26, grammarAccess.getAttributeValueRequirementAccess().getNominalScaledTypeKeyword_11_0());
                    			
                    // InternalCAEXtext.g:6880:4: ( (lv_nominalScaledType_27_0= ruleNominalScaled ) )
                    // InternalCAEXtext.g:6881:5: (lv_nominalScaledType_27_0= ruleNominalScaled )
                    {
                    // InternalCAEXtext.g:6881:5: (lv_nominalScaledType_27_0= ruleNominalScaled )
                    // InternalCAEXtext.g:6882:6: lv_nominalScaledType_27_0= ruleNominalScaled
                    {

                    						newCompositeNode(grammarAccess.getAttributeValueRequirementAccess().getNominalScaledTypeNominalScaledParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_165);
                    lv_nominalScaledType_27_0=ruleNominalScaled();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValueRequirementRule());
                    						}
                    						set(
                    							current,
                    							"nominalScaledType",
                    							lv_nominalScaledType_27_0,
                    							"caex.caex215.CAEXtext.NominalScaled");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:6900:3: (otherlv_28= 'unknownType' ( (lv_unknownType_29_0= ruleUnknownType ) ) )?
            int alt226=2;
            int LA226_0 = input.LA(1);

            if ( (LA226_0==89) ) {
                alt226=1;
            }
            switch (alt226) {
                case 1 :
                    // InternalCAEXtext.g:6901:4: otherlv_28= 'unknownType' ( (lv_unknownType_29_0= ruleUnknownType ) )
                    {
                    otherlv_28=(Token)match(input,89,FOLLOW_166); 

                    				newLeafNode(otherlv_28, grammarAccess.getAttributeValueRequirementAccess().getUnknownTypeKeyword_12_0());
                    			
                    // InternalCAEXtext.g:6905:4: ( (lv_unknownType_29_0= ruleUnknownType ) )
                    // InternalCAEXtext.g:6906:5: (lv_unknownType_29_0= ruleUnknownType )
                    {
                    // InternalCAEXtext.g:6906:5: (lv_unknownType_29_0= ruleUnknownType )
                    // InternalCAEXtext.g:6907:6: lv_unknownType_29_0= ruleUnknownType
                    {

                    						newCompositeNode(grammarAccess.getAttributeValueRequirementAccess().getUnknownTypeUnknownTypeParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_unknownType_29_0=ruleUnknownType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValueRequirementRule());
                    						}
                    						set(
                    							current,
                    							"unknownType",
                    							lv_unknownType_29_0,
                    							"caex.caex215.CAEXtext.UnknownType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_30=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getAttributeValueRequirementAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeValueRequirement"


    // $ANTLR start "entryRuleAttributeDataType"
    // InternalCAEXtext.g:6933:1: entryRuleAttributeDataType returns [String current=null] : iv_ruleAttributeDataType= ruleAttributeDataType EOF ;
    public final String entryRuleAttributeDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeDataType = null;


        try {
            // InternalCAEXtext.g:6933:57: (iv_ruleAttributeDataType= ruleAttributeDataType EOF )
            // InternalCAEXtext.g:6934:2: iv_ruleAttributeDataType= ruleAttributeDataType EOF
            {
             newCompositeNode(grammarAccess.getAttributeDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeDataType=ruleAttributeDataType();

            state._fsp--;

             current =iv_ruleAttributeDataType.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeDataType"


    // $ANTLR start "ruleAttributeDataType"
    // InternalCAEXtext.g:6940:1: ruleAttributeDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AttributeDataType' ;
    public final AntlrDatatypeRuleToken ruleAttributeDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCAEXtext.g:6946:2: (kw= 'AttributeDataType' )
            // InternalCAEXtext.g:6947:2: kw= 'AttributeDataType'
            {
            kw=(Token)match(input,90,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAttributeDataTypeAccess().getAttributeDataTypeKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeDataType"


    // $ANTLR start "entryRuleOrdinalScaled"
    // InternalCAEXtext.g:6955:1: entryRuleOrdinalScaled returns [EObject current=null] : iv_ruleOrdinalScaled= ruleOrdinalScaled EOF ;
    public final EObject entryRuleOrdinalScaled() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdinalScaled = null;


        try {
            // InternalCAEXtext.g:6955:54: (iv_ruleOrdinalScaled= ruleOrdinalScaled EOF )
            // InternalCAEXtext.g:6956:2: iv_ruleOrdinalScaled= ruleOrdinalScaled EOF
            {
             newCompositeNode(grammarAccess.getOrdinalScaledRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrdinalScaled=ruleOrdinalScaled();

            state._fsp--;

             current =iv_ruleOrdinalScaled; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrdinalScaled"


    // $ANTLR start "ruleOrdinalScaled"
    // InternalCAEXtext.g:6962:1: ruleOrdinalScaled returns [EObject current=null] : ( () otherlv_1= 'OrdinalScaled' otherlv_2= '{' (otherlv_3= 'requiredMaxValue' ( (lv_requiredMaxValue_4_0= ruleEString ) ) )? (otherlv_5= 'requiredValue' ( (lv_requiredValue_6_0= ruleEString ) ) )? (otherlv_7= 'requiredMinValue' ( (lv_requiredMinValue_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleOrdinalScaled() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_requiredMaxValue_4_0 = null;

        AntlrDatatypeRuleToken lv_requiredValue_6_0 = null;

        AntlrDatatypeRuleToken lv_requiredMinValue_8_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:6968:2: ( ( () otherlv_1= 'OrdinalScaled' otherlv_2= '{' (otherlv_3= 'requiredMaxValue' ( (lv_requiredMaxValue_4_0= ruleEString ) ) )? (otherlv_5= 'requiredValue' ( (lv_requiredValue_6_0= ruleEString ) ) )? (otherlv_7= 'requiredMinValue' ( (lv_requiredMinValue_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalCAEXtext.g:6969:2: ( () otherlv_1= 'OrdinalScaled' otherlv_2= '{' (otherlv_3= 'requiredMaxValue' ( (lv_requiredMaxValue_4_0= ruleEString ) ) )? (otherlv_5= 'requiredValue' ( (lv_requiredValue_6_0= ruleEString ) ) )? (otherlv_7= 'requiredMinValue' ( (lv_requiredMinValue_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalCAEXtext.g:6969:2: ( () otherlv_1= 'OrdinalScaled' otherlv_2= '{' (otherlv_3= 'requiredMaxValue' ( (lv_requiredMaxValue_4_0= ruleEString ) ) )? (otherlv_5= 'requiredValue' ( (lv_requiredValue_6_0= ruleEString ) ) )? (otherlv_7= 'requiredMinValue' ( (lv_requiredMinValue_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalCAEXtext.g:6970:3: () otherlv_1= 'OrdinalScaled' otherlv_2= '{' (otherlv_3= 'requiredMaxValue' ( (lv_requiredMaxValue_4_0= ruleEString ) ) )? (otherlv_5= 'requiredValue' ( (lv_requiredValue_6_0= ruleEString ) ) )? (otherlv_7= 'requiredMinValue' ( (lv_requiredMinValue_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalCAEXtext.g:6970:3: ()
            // InternalCAEXtext.g:6971:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOrdinalScaledAccess().getOrdinalScaledAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,91,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getOrdinalScaledAccess().getOrdinalScaledKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_167); 

            			newLeafNode(otherlv_2, grammarAccess.getOrdinalScaledAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCAEXtext.g:6985:3: (otherlv_3= 'requiredMaxValue' ( (lv_requiredMaxValue_4_0= ruleEString ) ) )?
            int alt227=2;
            int LA227_0 = input.LA(1);

            if ( (LA227_0==92) ) {
                alt227=1;
            }
            switch (alt227) {
                case 1 :
                    // InternalCAEXtext.g:6986:4: otherlv_3= 'requiredMaxValue' ( (lv_requiredMaxValue_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,92,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getOrdinalScaledAccess().getRequiredMaxValueKeyword_3_0());
                    			
                    // InternalCAEXtext.g:6990:4: ( (lv_requiredMaxValue_4_0= ruleEString ) )
                    // InternalCAEXtext.g:6991:5: (lv_requiredMaxValue_4_0= ruleEString )
                    {
                    // InternalCAEXtext.g:6991:5: (lv_requiredMaxValue_4_0= ruleEString )
                    // InternalCAEXtext.g:6992:6: lv_requiredMaxValue_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOrdinalScaledAccess().getRequiredMaxValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_168);
                    lv_requiredMaxValue_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrdinalScaledRule());
                    						}
                    						set(
                    							current,
                    							"requiredMaxValue",
                    							lv_requiredMaxValue_4_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:7010:3: (otherlv_5= 'requiredValue' ( (lv_requiredValue_6_0= ruleEString ) ) )?
            int alt228=2;
            int LA228_0 = input.LA(1);

            if ( (LA228_0==93) ) {
                alt228=1;
            }
            switch (alt228) {
                case 1 :
                    // InternalCAEXtext.g:7011:4: otherlv_5= 'requiredValue' ( (lv_requiredValue_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,93,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getOrdinalScaledAccess().getRequiredValueKeyword_4_0());
                    			
                    // InternalCAEXtext.g:7015:4: ( (lv_requiredValue_6_0= ruleEString ) )
                    // InternalCAEXtext.g:7016:5: (lv_requiredValue_6_0= ruleEString )
                    {
                    // InternalCAEXtext.g:7016:5: (lv_requiredValue_6_0= ruleEString )
                    // InternalCAEXtext.g:7017:6: lv_requiredValue_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOrdinalScaledAccess().getRequiredValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_169);
                    lv_requiredValue_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrdinalScaledRule());
                    						}
                    						set(
                    							current,
                    							"requiredValue",
                    							lv_requiredValue_6_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:7035:3: (otherlv_7= 'requiredMinValue' ( (lv_requiredMinValue_8_0= ruleEString ) ) )?
            int alt229=2;
            int LA229_0 = input.LA(1);

            if ( (LA229_0==94) ) {
                alt229=1;
            }
            switch (alt229) {
                case 1 :
                    // InternalCAEXtext.g:7036:4: otherlv_7= 'requiredMinValue' ( (lv_requiredMinValue_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,94,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getOrdinalScaledAccess().getRequiredMinValueKeyword_5_0());
                    			
                    // InternalCAEXtext.g:7040:4: ( (lv_requiredMinValue_8_0= ruleEString ) )
                    // InternalCAEXtext.g:7041:5: (lv_requiredMinValue_8_0= ruleEString )
                    {
                    // InternalCAEXtext.g:7041:5: (lv_requiredMinValue_8_0= ruleEString )
                    // InternalCAEXtext.g:7042:6: lv_requiredMinValue_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOrdinalScaledAccess().getRequiredMinValueEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_requiredMinValue_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrdinalScaledRule());
                    						}
                    						set(
                    							current,
                    							"requiredMinValue",
                    							lv_requiredMinValue_8_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getOrdinalScaledAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrdinalScaled"


    // $ANTLR start "entryRuleNominalScaled"
    // InternalCAEXtext.g:7068:1: entryRuleNominalScaled returns [EObject current=null] : iv_ruleNominalScaled= ruleNominalScaled EOF ;
    public final EObject entryRuleNominalScaled() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNominalScaled = null;


        try {
            // InternalCAEXtext.g:7068:54: (iv_ruleNominalScaled= ruleNominalScaled EOF )
            // InternalCAEXtext.g:7069:2: iv_ruleNominalScaled= ruleNominalScaled EOF
            {
             newCompositeNode(grammarAccess.getNominalScaledRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNominalScaled=ruleNominalScaled();

            state._fsp--;

             current =iv_ruleNominalScaled; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNominalScaled"


    // $ANTLR start "ruleNominalScaled"
    // InternalCAEXtext.g:7075:1: ruleNominalScaled returns [EObject current=null] : ( () otherlv_1= 'NominalScaled' otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleNominalScaled() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCAEXtext.g:7081:2: ( ( () otherlv_1= 'NominalScaled' otherlv_2= '{' otherlv_3= '}' ) )
            // InternalCAEXtext.g:7082:2: ( () otherlv_1= 'NominalScaled' otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalCAEXtext.g:7082:2: ( () otherlv_1= 'NominalScaled' otherlv_2= '{' otherlv_3= '}' )
            // InternalCAEXtext.g:7083:3: () otherlv_1= 'NominalScaled' otherlv_2= '{' otherlv_3= '}'
            {
            // InternalCAEXtext.g:7083:3: ()
            // InternalCAEXtext.g:7084:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNominalScaledAccess().getNominalScaledAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,95,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getNominalScaledAccess().getNominalScaledKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getNominalScaledAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNominalScaledAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNominalScaled"


    // $ANTLR start "entryRuleUnknownType"
    // InternalCAEXtext.g:7106:1: entryRuleUnknownType returns [EObject current=null] : iv_ruleUnknownType= ruleUnknownType EOF ;
    public final EObject entryRuleUnknownType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnknownType = null;


        try {
            // InternalCAEXtext.g:7106:52: (iv_ruleUnknownType= ruleUnknownType EOF )
            // InternalCAEXtext.g:7107:2: iv_ruleUnknownType= ruleUnknownType EOF
            {
             newCompositeNode(grammarAccess.getUnknownTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnknownType=ruleUnknownType();

            state._fsp--;

             current =iv_ruleUnknownType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnknownType"


    // $ANTLR start "ruleUnknownType"
    // InternalCAEXtext.g:7113:1: ruleUnknownType returns [EObject current=null] : ( () otherlv_1= 'UnknownType' otherlv_2= '{' (otherlv_3= 'requirements' ( (lv_requirements_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleUnknownType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_requirements_4_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:7119:2: ( ( () otherlv_1= 'UnknownType' otherlv_2= '{' (otherlv_3= 'requirements' ( (lv_requirements_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalCAEXtext.g:7120:2: ( () otherlv_1= 'UnknownType' otherlv_2= '{' (otherlv_3= 'requirements' ( (lv_requirements_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalCAEXtext.g:7120:2: ( () otherlv_1= 'UnknownType' otherlv_2= '{' (otherlv_3= 'requirements' ( (lv_requirements_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalCAEXtext.g:7121:3: () otherlv_1= 'UnknownType' otherlv_2= '{' (otherlv_3= 'requirements' ( (lv_requirements_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalCAEXtext.g:7121:3: ()
            // InternalCAEXtext.g:7122:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnknownTypeAccess().getUnknownTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,96,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getUnknownTypeAccess().getUnknownTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_170); 

            			newLeafNode(otherlv_2, grammarAccess.getUnknownTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCAEXtext.g:7136:3: (otherlv_3= 'requirements' ( (lv_requirements_4_0= ruleEString ) ) )?
            int alt230=2;
            int LA230_0 = input.LA(1);

            if ( (LA230_0==97) ) {
                alt230=1;
            }
            switch (alt230) {
                case 1 :
                    // InternalCAEXtext.g:7137:4: otherlv_3= 'requirements' ( (lv_requirements_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,97,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getUnknownTypeAccess().getRequirementsKeyword_3_0());
                    			
                    // InternalCAEXtext.g:7141:4: ( (lv_requirements_4_0= ruleEString ) )
                    // InternalCAEXtext.g:7142:5: (lv_requirements_4_0= ruleEString )
                    {
                    // InternalCAEXtext.g:7142:5: (lv_requirements_4_0= ruleEString )
                    // InternalCAEXtext.g:7143:6: lv_requirements_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUnknownTypeAccess().getRequirementsEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_requirements_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnknownTypeRule());
                    						}
                    						set(
                    							current,
                    							"requirements",
                    							lv_requirements_4_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getUnknownTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnknownType"


    // $ANTLR start "entryRuleExternalInterface"
    // InternalCAEXtext.g:7169:1: entryRuleExternalInterface returns [EObject current=null] : iv_ruleExternalInterface= ruleExternalInterface EOF ;
    public final EObject entryRuleExternalInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalInterface = null;


        try {
            // InternalCAEXtext.g:7169:58: (iv_ruleExternalInterface= ruleExternalInterface EOF )
            // InternalCAEXtext.g:7170:2: iv_ruleExternalInterface= ruleExternalInterface EOF
            {
             newCompositeNode(grammarAccess.getExternalInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalInterface=ruleExternalInterface();

            state._fsp--;

             current =iv_ruleExternalInterface; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExternalInterface"


    // $ANTLR start "ruleExternalInterface"
    // InternalCAEXtext.g:7176:1: ruleExternalInterface returns [EObject current=null] : (otherlv_0= 'ExternalInterface' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'interfaceClass' otherlv_37= '{' ( (lv_interfaceClass_38_0= ruleInterfaceClass ) ) (otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) ) )* otherlv_41= '}' )? otherlv_42= '}' ) ;
    public final EObject ruleExternalInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Enumerator lv_changeMode_3_0 = null;

        AntlrDatatypeRuleToken lv_iD_5_0 = null;

        AntlrDatatypeRuleToken lv_refBaseClassPath_9_0 = null;

        EObject lv_description_13_0 = null;

        EObject lv_version_15_0 = null;

        EObject lv_revision_18_0 = null;

        EObject lv_revision_20_0 = null;

        EObject lv_copyright_23_0 = null;

        EObject lv_additionalInformation_26_0 = null;

        EObject lv_additionalInformation_28_0 = null;

        EObject lv_attribute_32_0 = null;

        EObject lv_attribute_34_0 = null;

        EObject lv_interfaceClass_38_0 = null;

        EObject lv_interfaceClass_40_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:7182:2: ( (otherlv_0= 'ExternalInterface' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'interfaceClass' otherlv_37= '{' ( (lv_interfaceClass_38_0= ruleInterfaceClass ) ) (otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) ) )* otherlv_41= '}' )? otherlv_42= '}' ) )
            // InternalCAEXtext.g:7183:2: (otherlv_0= 'ExternalInterface' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'interfaceClass' otherlv_37= '{' ( (lv_interfaceClass_38_0= ruleInterfaceClass ) ) (otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) ) )* otherlv_41= '}' )? otherlv_42= '}' )
            {
            // InternalCAEXtext.g:7183:2: (otherlv_0= 'ExternalInterface' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'interfaceClass' otherlv_37= '{' ( (lv_interfaceClass_38_0= ruleInterfaceClass ) ) (otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) ) )* otherlv_41= '}' )? otherlv_42= '}' )
            // InternalCAEXtext.g:7184:3: otherlv_0= 'ExternalInterface' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'interfaceClass' otherlv_37= '{' ( (lv_interfaceClass_38_0= ruleInterfaceClass ) ) (otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) ) )* otherlv_41= '}' )? otherlv_42= '}'
            {
            otherlv_0=(Token)match(input,98,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalInterfaceAccess().getExternalInterfaceKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalInterfaceAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCAEXtext.g:7192:3: (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )?
            int alt231=2;
            int LA231_0 = input.LA(1);

            if ( (LA231_0==13) ) {
                alt231=1;
            }
            switch (alt231) {
                case 1 :
                    // InternalCAEXtext.g:7193:4: otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getExternalInterfaceAccess().getChangeModeKeyword_2_0());
                    			
                    // InternalCAEXtext.g:7197:4: ( (lv_changeMode_3_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:7198:5: (lv_changeMode_3_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:7198:5: (lv_changeMode_3_0= ruleChangeMode )
                    // InternalCAEXtext.g:7199:6: lv_changeMode_3_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getExternalInterfaceAccess().getChangeModeChangeModeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_changeMode_3_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_3_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:7217:3: (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )?
            int alt232=2;
            int LA232_0 = input.LA(1);

            if ( (LA232_0==37) ) {
                alt232=1;
            }
            switch (alt232) {
                case 1 :
                    // InternalCAEXtext.g:7218:4: otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getExternalInterfaceAccess().getIDKeyword_3_0());
                    			
                    // InternalCAEXtext.g:7222:4: ( (lv_iD_5_0= ruleEString ) )
                    // InternalCAEXtext.g:7223:5: (lv_iD_5_0= ruleEString )
                    {
                    // InternalCAEXtext.g:7223:5: (lv_iD_5_0= ruleEString )
                    // InternalCAEXtext.g:7224:6: lv_iD_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExternalInterfaceAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_iD_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"iD",
                    							lv_iD_5_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,38,FOLLOW_99); 

            			newLeafNode(otherlv_6, grammarAccess.getExternalInterfaceAccess().getNameKeyword_4());
            		
            // InternalCAEXtext.g:7246:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalCAEXtext.g:7247:4: (lv_name_7_0= RULE_ID )
            {
            // InternalCAEXtext.g:7247:4: (lv_name_7_0= RULE_ID )
            // InternalCAEXtext.g:7248:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_100); 

            					newLeafNode(lv_name_7_0, grammarAccess.getExternalInterfaceAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalInterfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCAEXtext.g:7264:3: (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )?
            int alt233=2;
            int LA233_0 = input.LA(1);

            if ( (LA233_0==59) ) {
                alt233=1;
            }
            switch (alt233) {
                case 1 :
                    // InternalCAEXtext.g:7265:4: otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getExternalInterfaceAccess().getRefBaseClassPathKeyword_6_0());
                    			
                    // InternalCAEXtext.g:7269:4: ( (lv_refBaseClassPath_9_0= ruleEString ) )
                    // InternalCAEXtext.g:7270:5: (lv_refBaseClassPath_9_0= ruleEString )
                    {
                    // InternalCAEXtext.g:7270:5: (lv_refBaseClassPath_9_0= ruleEString )
                    // InternalCAEXtext.g:7271:6: lv_refBaseClassPath_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExternalInterfaceAccess().getRefBaseClassPathEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_101);
                    lv_refBaseClassPath_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"refBaseClassPath",
                    							lv_refBaseClassPath_9_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:7289:3: (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )?
            int alt234=2;
            int LA234_0 = input.LA(1);

            if ( (LA234_0==60) ) {
                alt234=1;
            }
            switch (alt234) {
                case 1 :
                    // InternalCAEXtext.g:7290:4: otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,60,FOLLOW_99); 

                    				newLeafNode(otherlv_10, grammarAccess.getExternalInterfaceAccess().getBaseClassKeyword_7_0());
                    			
                    // InternalCAEXtext.g:7294:4: ( (otherlv_11= RULE_ID ) )
                    // InternalCAEXtext.g:7295:5: (otherlv_11= RULE_ID )
                    {
                    // InternalCAEXtext.g:7295:5: (otherlv_11= RULE_ID )
                    // InternalCAEXtext.g:7296:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExternalInterfaceRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_102); 

                    						newLeafNode(otherlv_11, grammarAccess.getExternalInterfaceAccess().getBaseClassInterfaceClassCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:7308:3: (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )?
            int alt235=2;
            int LA235_0 = input.LA(1);

            if ( (LA235_0==61) ) {
                alt235=1;
            }
            switch (alt235) {
                case 1 :
                    // InternalCAEXtext.g:7309:4: otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) )
                    {
                    otherlv_12=(Token)match(input,61,FOLLOW_103); 

                    				newLeafNode(otherlv_12, grammarAccess.getExternalInterfaceAccess().getDescriptionKeyword_8_0());
                    			
                    // InternalCAEXtext.g:7313:4: ( (lv_description_13_0= ruleDescription ) )
                    // InternalCAEXtext.g:7314:5: (lv_description_13_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:7314:5: (lv_description_13_0= ruleDescription )
                    // InternalCAEXtext.g:7315:6: lv_description_13_0= ruleDescription
                    {

                    						newCompositeNode(grammarAccess.getExternalInterfaceAccess().getDescriptionDescriptionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_104);
                    lv_description_13_0=ruleDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_13_0,
                    							"caex.caex215.CAEXtext.Description");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:7333:3: (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )?
            int alt236=2;
            int LA236_0 = input.LA(1);

            if ( (LA236_0==62) ) {
                alt236=1;
            }
            switch (alt236) {
                case 1 :
                    // InternalCAEXtext.g:7334:4: otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) )
                    {
                    otherlv_14=(Token)match(input,62,FOLLOW_105); 

                    				newLeafNode(otherlv_14, grammarAccess.getExternalInterfaceAccess().getVersionKeyword_9_0());
                    			
                    // InternalCAEXtext.g:7338:4: ( (lv_version_15_0= ruleVersion ) )
                    // InternalCAEXtext.g:7339:5: (lv_version_15_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:7339:5: (lv_version_15_0= ruleVersion )
                    // InternalCAEXtext.g:7340:6: lv_version_15_0= ruleVersion
                    {

                    						newCompositeNode(grammarAccess.getExternalInterfaceAccess().getVersionVersionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_106);
                    lv_version_15_0=ruleVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_15_0,
                    							"caex.caex215.CAEXtext.Version");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:7358:3: (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )?
            int alt238=2;
            int LA238_0 = input.LA(1);

            if ( (LA238_0==63) ) {
                alt238=1;
            }
            switch (alt238) {
                case 1 :
                    // InternalCAEXtext.g:7359:4: otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,63,FOLLOW_14); 

                    				newLeafNode(otherlv_16, grammarAccess.getExternalInterfaceAccess().getRevisionKeyword_10_0());
                    			
                    otherlv_17=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_17, grammarAccess.getExternalInterfaceAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalCAEXtext.g:7367:4: ( (lv_revision_18_0= ruleRevision ) )
                    // InternalCAEXtext.g:7368:5: (lv_revision_18_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:7368:5: (lv_revision_18_0= ruleRevision )
                    // InternalCAEXtext.g:7369:6: lv_revision_18_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getExternalInterfaceAccess().getRevisionRevisionParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_revision_18_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_18_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:7386:4: (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )*
                    loop237:
                    do {
                        int alt237=2;
                        int LA237_0 = input.LA(1);

                        if ( (LA237_0==14) ) {
                            alt237=1;
                        }


                        switch (alt237) {
                    	case 1 :
                    	    // InternalCAEXtext.g:7387:5: otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getExternalInterfaceAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalCAEXtext.g:7391:5: ( (lv_revision_20_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:7392:6: (lv_revision_20_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:7392:6: (lv_revision_20_0= ruleRevision )
                    	    // InternalCAEXtext.g:7393:7: lv_revision_20_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalInterfaceAccess().getRevisionRevisionParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_revision_20_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_20_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop237;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,19,FOLLOW_107); 

                    				newLeafNode(otherlv_21, grammarAccess.getExternalInterfaceAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:7416:3: (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )?
            int alt239=2;
            int LA239_0 = input.LA(1);

            if ( (LA239_0==64) ) {
                alt239=1;
            }
            switch (alt239) {
                case 1 :
                    // InternalCAEXtext.g:7417:4: otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) )
                    {
                    otherlv_22=(Token)match(input,64,FOLLOW_108); 

                    				newLeafNode(otherlv_22, grammarAccess.getExternalInterfaceAccess().getCopyrightKeyword_11_0());
                    			
                    // InternalCAEXtext.g:7421:4: ( (lv_copyright_23_0= ruleCopyright ) )
                    // InternalCAEXtext.g:7422:5: (lv_copyright_23_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:7422:5: (lv_copyright_23_0= ruleCopyright )
                    // InternalCAEXtext.g:7423:6: lv_copyright_23_0= ruleCopyright
                    {

                    						newCompositeNode(grammarAccess.getExternalInterfaceAccess().getCopyrightCopyrightParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_109);
                    lv_copyright_23_0=ruleCopyright();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"copyright",
                    							lv_copyright_23_0,
                    							"caex.caex215.CAEXtext.Copyright");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:7441:3: (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )?
            int alt241=2;
            int LA241_0 = input.LA(1);

            if ( (LA241_0==65) ) {
                alt241=1;
            }
            switch (alt241) {
                case 1 :
                    // InternalCAEXtext.g:7442:4: otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,65,FOLLOW_14); 

                    				newLeafNode(otherlv_24, grammarAccess.getExternalInterfaceAccess().getAdditionalInformationKeyword_12_0());
                    			
                    otherlv_25=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_25, grammarAccess.getExternalInterfaceAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalCAEXtext.g:7450:4: ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:7451:5: (lv_additionalInformation_26_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:7451:5: (lv_additionalInformation_26_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:7452:6: lv_additionalInformation_26_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getExternalInterfaceAccess().getAdditionalInformationAdditionalInformationParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_additionalInformation_26_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_26_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:7469:4: (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )*
                    loop240:
                    do {
                        int alt240=2;
                        int LA240_0 = input.LA(1);

                        if ( (LA240_0==14) ) {
                            alt240=1;
                        }


                        switch (alt240) {
                    	case 1 :
                    	    // InternalCAEXtext.g:7470:5: otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_27=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getExternalInterfaceAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalCAEXtext.g:7474:5: ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:7475:6: (lv_additionalInformation_28_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:7475:6: (lv_additionalInformation_28_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:7476:7: lv_additionalInformation_28_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalInterfaceAccess().getAdditionalInformationAdditionalInformationParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_additionalInformation_28_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_28_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop240;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,19,FOLLOW_110); 

                    				newLeafNode(otherlv_29, grammarAccess.getExternalInterfaceAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:7499:3: (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )?
            int alt243=2;
            int LA243_0 = input.LA(1);

            if ( (LA243_0==66) ) {
                alt243=1;
            }
            switch (alt243) {
                case 1 :
                    // InternalCAEXtext.g:7500:4: otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,66,FOLLOW_14); 

                    				newLeafNode(otherlv_30, grammarAccess.getExternalInterfaceAccess().getAttributeKeyword_13_0());
                    			
                    otherlv_31=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_31, grammarAccess.getExternalInterfaceAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalCAEXtext.g:7508:4: ( (lv_attribute_32_0= ruleAttribute ) )
                    // InternalCAEXtext.g:7509:5: (lv_attribute_32_0= ruleAttribute )
                    {
                    // InternalCAEXtext.g:7509:5: (lv_attribute_32_0= ruleAttribute )
                    // InternalCAEXtext.g:7510:6: lv_attribute_32_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getExternalInterfaceAccess().getAttributeAttributeParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_attribute_32_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"attribute",
                    							lv_attribute_32_0,
                    							"caex.caex215.CAEXtext.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:7527:4: (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )*
                    loop242:
                    do {
                        int alt242=2;
                        int LA242_0 = input.LA(1);

                        if ( (LA242_0==14) ) {
                            alt242=1;
                        }


                        switch (alt242) {
                    	case 1 :
                    	    // InternalCAEXtext.g:7528:5: otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) )
                    	    {
                    	    otherlv_33=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getExternalInterfaceAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalCAEXtext.g:7532:5: ( (lv_attribute_34_0= ruleAttribute ) )
                    	    // InternalCAEXtext.g:7533:6: (lv_attribute_34_0= ruleAttribute )
                    	    {
                    	    // InternalCAEXtext.g:7533:6: (lv_attribute_34_0= ruleAttribute )
                    	    // InternalCAEXtext.g:7534:7: lv_attribute_34_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalInterfaceAccess().getAttributeAttributeParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_attribute_34_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attribute",
                    	    								lv_attribute_34_0,
                    	    								"caex.caex215.CAEXtext.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop242;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,19,FOLLOW_111); 

                    				newLeafNode(otherlv_35, grammarAccess.getExternalInterfaceAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:7557:3: (otherlv_36= 'interfaceClass' otherlv_37= '{' ( (lv_interfaceClass_38_0= ruleInterfaceClass ) ) (otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) ) )* otherlv_41= '}' )?
            int alt245=2;
            int LA245_0 = input.LA(1);

            if ( (LA245_0==67) ) {
                alt245=1;
            }
            switch (alt245) {
                case 1 :
                    // InternalCAEXtext.g:7558:4: otherlv_36= 'interfaceClass' otherlv_37= '{' ( (lv_interfaceClass_38_0= ruleInterfaceClass ) ) (otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) ) )* otherlv_41= '}'
                    {
                    otherlv_36=(Token)match(input,67,FOLLOW_14); 

                    				newLeafNode(otherlv_36, grammarAccess.getExternalInterfaceAccess().getInterfaceClassKeyword_14_0());
                    			
                    otherlv_37=(Token)match(input,16,FOLLOW_60); 

                    				newLeafNode(otherlv_37, grammarAccess.getExternalInterfaceAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalCAEXtext.g:7566:4: ( (lv_interfaceClass_38_0= ruleInterfaceClass ) )
                    // InternalCAEXtext.g:7567:5: (lv_interfaceClass_38_0= ruleInterfaceClass )
                    {
                    // InternalCAEXtext.g:7567:5: (lv_interfaceClass_38_0= ruleInterfaceClass )
                    // InternalCAEXtext.g:7568:6: lv_interfaceClass_38_0= ruleInterfaceClass
                    {

                    						newCompositeNode(grammarAccess.getExternalInterfaceAccess().getInterfaceClassInterfaceClassParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_interfaceClass_38_0=ruleInterfaceClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"interfaceClass",
                    							lv_interfaceClass_38_0,
                    							"caex.caex215.CAEXtext.InterfaceClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:7585:4: (otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) ) )*
                    loop244:
                    do {
                        int alt244=2;
                        int LA244_0 = input.LA(1);

                        if ( (LA244_0==14) ) {
                            alt244=1;
                        }


                        switch (alt244) {
                    	case 1 :
                    	    // InternalCAEXtext.g:7586:5: otherlv_39= ',' ( (lv_interfaceClass_40_0= ruleInterfaceClass ) )
                    	    {
                    	    otherlv_39=(Token)match(input,14,FOLLOW_60); 

                    	    					newLeafNode(otherlv_39, grammarAccess.getExternalInterfaceAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalCAEXtext.g:7590:5: ( (lv_interfaceClass_40_0= ruleInterfaceClass ) )
                    	    // InternalCAEXtext.g:7591:6: (lv_interfaceClass_40_0= ruleInterfaceClass )
                    	    {
                    	    // InternalCAEXtext.g:7591:6: (lv_interfaceClass_40_0= ruleInterfaceClass )
                    	    // InternalCAEXtext.g:7592:7: lv_interfaceClass_40_0= ruleInterfaceClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalInterfaceAccess().getInterfaceClassInterfaceClassParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_interfaceClass_40_0=ruleInterfaceClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interfaceClass",
                    	    								lv_interfaceClass_40_0,
                    	    								"caex.caex215.CAEXtext.InterfaceClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop244;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,19,FOLLOW_31); 

                    				newLeafNode(otherlv_41, grammarAccess.getExternalInterfaceAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            otherlv_42=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_42, grammarAccess.getExternalInterfaceAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalInterface"


    // $ANTLR start "entryRuleRoleClass_Impl"
    // InternalCAEXtext.g:7623:1: entryRuleRoleClass_Impl returns [EObject current=null] : iv_ruleRoleClass_Impl= ruleRoleClass_Impl EOF ;
    public final EObject entryRuleRoleClass_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleClass_Impl = null;


        try {
            // InternalCAEXtext.g:7623:55: (iv_ruleRoleClass_Impl= ruleRoleClass_Impl EOF )
            // InternalCAEXtext.g:7624:2: iv_ruleRoleClass_Impl= ruleRoleClass_Impl EOF
            {
             newCompositeNode(grammarAccess.getRoleClass_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleClass_Impl=ruleRoleClass_Impl();

            state._fsp--;

             current =iv_ruleRoleClass_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRoleClass_Impl"


    // $ANTLR start "ruleRoleClass_Impl"
    // InternalCAEXtext.g:7630:1: ruleRoleClass_Impl returns [EObject current=null] : (otherlv_0= 'RoleClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'externalInterface' otherlv_37= '{' ( (lv_externalInterface_38_0= ruleExternalInterface ) ) (otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) ) )* otherlv_41= '}' )? (otherlv_42= 'roleClass' otherlv_43= '{' ( (lv_roleClass_44_0= ruleRoleClass ) ) (otherlv_45= ',' ( (lv_roleClass_46_0= ruleRoleClass ) ) )* otherlv_47= '}' )? otherlv_48= '}' ) ;
    public final EObject ruleRoleClass_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Enumerator lv_changeMode_3_0 = null;

        AntlrDatatypeRuleToken lv_iD_5_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        AntlrDatatypeRuleToken lv_refBaseClassPath_9_0 = null;

        EObject lv_description_13_0 = null;

        EObject lv_version_15_0 = null;

        EObject lv_revision_18_0 = null;

        EObject lv_revision_20_0 = null;

        EObject lv_copyright_23_0 = null;

        EObject lv_additionalInformation_26_0 = null;

        EObject lv_additionalInformation_28_0 = null;

        EObject lv_attribute_32_0 = null;

        EObject lv_attribute_34_0 = null;

        EObject lv_externalInterface_38_0 = null;

        EObject lv_externalInterface_40_0 = null;

        EObject lv_roleClass_44_0 = null;

        EObject lv_roleClass_46_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:7636:2: ( (otherlv_0= 'RoleClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'externalInterface' otherlv_37= '{' ( (lv_externalInterface_38_0= ruleExternalInterface ) ) (otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) ) )* otherlv_41= '}' )? (otherlv_42= 'roleClass' otherlv_43= '{' ( (lv_roleClass_44_0= ruleRoleClass ) ) (otherlv_45= ',' ( (lv_roleClass_46_0= ruleRoleClass ) ) )* otherlv_47= '}' )? otherlv_48= '}' ) )
            // InternalCAEXtext.g:7637:2: (otherlv_0= 'RoleClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'externalInterface' otherlv_37= '{' ( (lv_externalInterface_38_0= ruleExternalInterface ) ) (otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) ) )* otherlv_41= '}' )? (otherlv_42= 'roleClass' otherlv_43= '{' ( (lv_roleClass_44_0= ruleRoleClass ) ) (otherlv_45= ',' ( (lv_roleClass_46_0= ruleRoleClass ) ) )* otherlv_47= '}' )? otherlv_48= '}' )
            {
            // InternalCAEXtext.g:7637:2: (otherlv_0= 'RoleClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'externalInterface' otherlv_37= '{' ( (lv_externalInterface_38_0= ruleExternalInterface ) ) (otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) ) )* otherlv_41= '}' )? (otherlv_42= 'roleClass' otherlv_43= '{' ( (lv_roleClass_44_0= ruleRoleClass ) ) (otherlv_45= ',' ( (lv_roleClass_46_0= ruleRoleClass ) ) )* otherlv_47= '}' )? otherlv_48= '}' )
            // InternalCAEXtext.g:7638:3: otherlv_0= 'RoleClass' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )? otherlv_6= 'name' ( (lv_name_7_0= ruleEString ) ) (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )? (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )? (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )? (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )? (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )? (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )? (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )? (otherlv_36= 'externalInterface' otherlv_37= '{' ( (lv_externalInterface_38_0= ruleExternalInterface ) ) (otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) ) )* otherlv_41= '}' )? (otherlv_42= 'roleClass' otherlv_43= '{' ( (lv_roleClass_44_0= ruleRoleClass ) ) (otherlv_45= ',' ( (lv_roleClass_46_0= ruleRoleClass ) ) )* otherlv_47= '}' )? otherlv_48= '}'
            {
            otherlv_0=(Token)match(input,99,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleClass_ImplAccess().getRoleClassKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleClass_ImplAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCAEXtext.g:7646:3: (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )?
            int alt246=2;
            int LA246_0 = input.LA(1);

            if ( (LA246_0==13) ) {
                alt246=1;
            }
            switch (alt246) {
                case 1 :
                    // InternalCAEXtext.g:7647:4: otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getRoleClass_ImplAccess().getChangeModeKeyword_2_0());
                    			
                    // InternalCAEXtext.g:7651:4: ( (lv_changeMode_3_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:7652:5: (lv_changeMode_3_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:7652:5: (lv_changeMode_3_0= ruleChangeMode )
                    // InternalCAEXtext.g:7653:6: lv_changeMode_3_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getRoleClass_ImplAccess().getChangeModeChangeModeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_changeMode_3_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_3_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:7671:3: (otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) ) )?
            int alt247=2;
            int LA247_0 = input.LA(1);

            if ( (LA247_0==37) ) {
                alt247=1;
            }
            switch (alt247) {
                case 1 :
                    // InternalCAEXtext.g:7672:4: otherlv_4= 'iD' ( (lv_iD_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getRoleClass_ImplAccess().getIDKeyword_3_0());
                    			
                    // InternalCAEXtext.g:7676:4: ( (lv_iD_5_0= ruleEString ) )
                    // InternalCAEXtext.g:7677:5: (lv_iD_5_0= ruleEString )
                    {
                    // InternalCAEXtext.g:7677:5: (lv_iD_5_0= ruleEString )
                    // InternalCAEXtext.g:7678:6: lv_iD_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRoleClass_ImplAccess().getIDEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_iD_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"iD",
                    							lv_iD_5_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getRoleClass_ImplAccess().getNameKeyword_4());
            		
            // InternalCAEXtext.g:7700:3: ( (lv_name_7_0= ruleEString ) )
            // InternalCAEXtext.g:7701:4: (lv_name_7_0= ruleEString )
            {
            // InternalCAEXtext.g:7701:4: (lv_name_7_0= ruleEString )
            // InternalCAEXtext.g:7702:5: lv_name_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleClass_ImplAccess().getNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_171);
            lv_name_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleClass_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCAEXtext.g:7719:3: (otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) ) )?
            int alt248=2;
            int LA248_0 = input.LA(1);

            if ( (LA248_0==59) ) {
                alt248=1;
            }
            switch (alt248) {
                case 1 :
                    // InternalCAEXtext.g:7720:4: otherlv_8= 'refBaseClassPath' ( (lv_refBaseClassPath_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getRoleClass_ImplAccess().getRefBaseClassPathKeyword_6_0());
                    			
                    // InternalCAEXtext.g:7724:4: ( (lv_refBaseClassPath_9_0= ruleEString ) )
                    // InternalCAEXtext.g:7725:5: (lv_refBaseClassPath_9_0= ruleEString )
                    {
                    // InternalCAEXtext.g:7725:5: (lv_refBaseClassPath_9_0= ruleEString )
                    // InternalCAEXtext.g:7726:6: lv_refBaseClassPath_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRoleClass_ImplAccess().getRefBaseClassPathEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_172);
                    lv_refBaseClassPath_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"refBaseClassPath",
                    							lv_refBaseClassPath_9_0,
                    							"caex.caex215.CAEXtext.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:7744:3: (otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) ) )?
            int alt249=2;
            int LA249_0 = input.LA(1);

            if ( (LA249_0==60) ) {
                alt249=1;
            }
            switch (alt249) {
                case 1 :
                    // InternalCAEXtext.g:7745:4: otherlv_10= 'baseClass' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,60,FOLLOW_99); 

                    				newLeafNode(otherlv_10, grammarAccess.getRoleClass_ImplAccess().getBaseClassKeyword_7_0());
                    			
                    // InternalCAEXtext.g:7749:4: ( (otherlv_11= RULE_ID ) )
                    // InternalCAEXtext.g:7750:5: (otherlv_11= RULE_ID )
                    {
                    // InternalCAEXtext.g:7750:5: (otherlv_11= RULE_ID )
                    // InternalCAEXtext.g:7751:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRoleClass_ImplRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_173); 

                    						newLeafNode(otherlv_11, grammarAccess.getRoleClass_ImplAccess().getBaseClassRoleClassCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:7763:3: (otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) ) )?
            int alt250=2;
            int LA250_0 = input.LA(1);

            if ( (LA250_0==61) ) {
                alt250=1;
            }
            switch (alt250) {
                case 1 :
                    // InternalCAEXtext.g:7764:4: otherlv_12= 'description' ( (lv_description_13_0= ruleDescription ) )
                    {
                    otherlv_12=(Token)match(input,61,FOLLOW_103); 

                    				newLeafNode(otherlv_12, grammarAccess.getRoleClass_ImplAccess().getDescriptionKeyword_8_0());
                    			
                    // InternalCAEXtext.g:7768:4: ( (lv_description_13_0= ruleDescription ) )
                    // InternalCAEXtext.g:7769:5: (lv_description_13_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:7769:5: (lv_description_13_0= ruleDescription )
                    // InternalCAEXtext.g:7770:6: lv_description_13_0= ruleDescription
                    {

                    						newCompositeNode(grammarAccess.getRoleClass_ImplAccess().getDescriptionDescriptionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_174);
                    lv_description_13_0=ruleDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_13_0,
                    							"caex.caex215.CAEXtext.Description");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:7788:3: (otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) ) )?
            int alt251=2;
            int LA251_0 = input.LA(1);

            if ( (LA251_0==62) ) {
                alt251=1;
            }
            switch (alt251) {
                case 1 :
                    // InternalCAEXtext.g:7789:4: otherlv_14= 'version' ( (lv_version_15_0= ruleVersion ) )
                    {
                    otherlv_14=(Token)match(input,62,FOLLOW_105); 

                    				newLeafNode(otherlv_14, grammarAccess.getRoleClass_ImplAccess().getVersionKeyword_9_0());
                    			
                    // InternalCAEXtext.g:7793:4: ( (lv_version_15_0= ruleVersion ) )
                    // InternalCAEXtext.g:7794:5: (lv_version_15_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:7794:5: (lv_version_15_0= ruleVersion )
                    // InternalCAEXtext.g:7795:6: lv_version_15_0= ruleVersion
                    {

                    						newCompositeNode(grammarAccess.getRoleClass_ImplAccess().getVersionVersionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_175);
                    lv_version_15_0=ruleVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_15_0,
                    							"caex.caex215.CAEXtext.Version");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:7813:3: (otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}' )?
            int alt253=2;
            int LA253_0 = input.LA(1);

            if ( (LA253_0==63) ) {
                alt253=1;
            }
            switch (alt253) {
                case 1 :
                    // InternalCAEXtext.g:7814:4: otherlv_16= 'revision' otherlv_17= '{' ( (lv_revision_18_0= ruleRevision ) ) (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,63,FOLLOW_14); 

                    				newLeafNode(otherlv_16, grammarAccess.getRoleClass_ImplAccess().getRevisionKeyword_10_0());
                    			
                    otherlv_17=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_17, grammarAccess.getRoleClass_ImplAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalCAEXtext.g:7822:4: ( (lv_revision_18_0= ruleRevision ) )
                    // InternalCAEXtext.g:7823:5: (lv_revision_18_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:7823:5: (lv_revision_18_0= ruleRevision )
                    // InternalCAEXtext.g:7824:6: lv_revision_18_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getRoleClass_ImplAccess().getRevisionRevisionParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_revision_18_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleClass_ImplRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_18_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:7841:4: (otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) ) )*
                    loop252:
                    do {
                        int alt252=2;
                        int LA252_0 = input.LA(1);

                        if ( (LA252_0==14) ) {
                            alt252=1;
                        }


                        switch (alt252) {
                    	case 1 :
                    	    // InternalCAEXtext.g:7842:5: otherlv_19= ',' ( (lv_revision_20_0= ruleRevision ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getRoleClass_ImplAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalCAEXtext.g:7846:5: ( (lv_revision_20_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:7847:6: (lv_revision_20_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:7847:6: (lv_revision_20_0= ruleRevision )
                    	    // InternalCAEXtext.g:7848:7: lv_revision_20_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleClass_ImplAccess().getRevisionRevisionParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_revision_20_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoleClass_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_20_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop252;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,19,FOLLOW_176); 

                    				newLeafNode(otherlv_21, grammarAccess.getRoleClass_ImplAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:7871:3: (otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) ) )?
            int alt254=2;
            int LA254_0 = input.LA(1);

            if ( (LA254_0==64) ) {
                alt254=1;
            }
            switch (alt254) {
                case 1 :
                    // InternalCAEXtext.g:7872:4: otherlv_22= 'copyright' ( (lv_copyright_23_0= ruleCopyright ) )
                    {
                    otherlv_22=(Token)match(input,64,FOLLOW_108); 

                    				newLeafNode(otherlv_22, grammarAccess.getRoleClass_ImplAccess().getCopyrightKeyword_11_0());
                    			
                    // InternalCAEXtext.g:7876:4: ( (lv_copyright_23_0= ruleCopyright ) )
                    // InternalCAEXtext.g:7877:5: (lv_copyright_23_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:7877:5: (lv_copyright_23_0= ruleCopyright )
                    // InternalCAEXtext.g:7878:6: lv_copyright_23_0= ruleCopyright
                    {

                    						newCompositeNode(grammarAccess.getRoleClass_ImplAccess().getCopyrightCopyrightParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_177);
                    lv_copyright_23_0=ruleCopyright();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleClass_ImplRule());
                    						}
                    						set(
                    							current,
                    							"copyright",
                    							lv_copyright_23_0,
                    							"caex.caex215.CAEXtext.Copyright");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:7896:3: (otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}' )?
            int alt256=2;
            int LA256_0 = input.LA(1);

            if ( (LA256_0==65) ) {
                alt256=1;
            }
            switch (alt256) {
                case 1 :
                    // InternalCAEXtext.g:7897:4: otherlv_24= 'additionalInformation' otherlv_25= '{' ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) ) (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,65,FOLLOW_14); 

                    				newLeafNode(otherlv_24, grammarAccess.getRoleClass_ImplAccess().getAdditionalInformationKeyword_12_0());
                    			
                    otherlv_25=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_25, grammarAccess.getRoleClass_ImplAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalCAEXtext.g:7905:4: ( (lv_additionalInformation_26_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:7906:5: (lv_additionalInformation_26_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:7906:5: (lv_additionalInformation_26_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:7907:6: lv_additionalInformation_26_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getRoleClass_ImplAccess().getAdditionalInformationAdditionalInformationParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_additionalInformation_26_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleClass_ImplRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_26_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:7924:4: (otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) ) )*
                    loop255:
                    do {
                        int alt255=2;
                        int LA255_0 = input.LA(1);

                        if ( (LA255_0==14) ) {
                            alt255=1;
                        }


                        switch (alt255) {
                    	case 1 :
                    	    // InternalCAEXtext.g:7925:5: otherlv_27= ',' ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_27=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getRoleClass_ImplAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalCAEXtext.g:7929:5: ( (lv_additionalInformation_28_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:7930:6: (lv_additionalInformation_28_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:7930:6: (lv_additionalInformation_28_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:7931:7: lv_additionalInformation_28_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleClass_ImplAccess().getAdditionalInformationAdditionalInformationParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_additionalInformation_28_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoleClass_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_28_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop255;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,19,FOLLOW_178); 

                    				newLeafNode(otherlv_29, grammarAccess.getRoleClass_ImplAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:7954:3: (otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}' )?
            int alt258=2;
            int LA258_0 = input.LA(1);

            if ( (LA258_0==66) ) {
                alt258=1;
            }
            switch (alt258) {
                case 1 :
                    // InternalCAEXtext.g:7955:4: otherlv_30= 'attribute' otherlv_31= '{' ( (lv_attribute_32_0= ruleAttribute ) ) (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,66,FOLLOW_14); 

                    				newLeafNode(otherlv_30, grammarAccess.getRoleClass_ImplAccess().getAttributeKeyword_13_0());
                    			
                    otherlv_31=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_31, grammarAccess.getRoleClass_ImplAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalCAEXtext.g:7963:4: ( (lv_attribute_32_0= ruleAttribute ) )
                    // InternalCAEXtext.g:7964:5: (lv_attribute_32_0= ruleAttribute )
                    {
                    // InternalCAEXtext.g:7964:5: (lv_attribute_32_0= ruleAttribute )
                    // InternalCAEXtext.g:7965:6: lv_attribute_32_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getRoleClass_ImplAccess().getAttributeAttributeParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_attribute_32_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleClass_ImplRule());
                    						}
                    						add(
                    							current,
                    							"attribute",
                    							lv_attribute_32_0,
                    							"caex.caex215.CAEXtext.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:7982:4: (otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) ) )*
                    loop257:
                    do {
                        int alt257=2;
                        int LA257_0 = input.LA(1);

                        if ( (LA257_0==14) ) {
                            alt257=1;
                        }


                        switch (alt257) {
                    	case 1 :
                    	    // InternalCAEXtext.g:7983:5: otherlv_33= ',' ( (lv_attribute_34_0= ruleAttribute ) )
                    	    {
                    	    otherlv_33=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getRoleClass_ImplAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalCAEXtext.g:7987:5: ( (lv_attribute_34_0= ruleAttribute ) )
                    	    // InternalCAEXtext.g:7988:6: (lv_attribute_34_0= ruleAttribute )
                    	    {
                    	    // InternalCAEXtext.g:7988:6: (lv_attribute_34_0= ruleAttribute )
                    	    // InternalCAEXtext.g:7989:7: lv_attribute_34_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleClass_ImplAccess().getAttributeAttributeParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_attribute_34_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoleClass_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attribute",
                    	    								lv_attribute_34_0,
                    	    								"caex.caex215.CAEXtext.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop257;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,19,FOLLOW_179); 

                    				newLeafNode(otherlv_35, grammarAccess.getRoleClass_ImplAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:8012:3: (otherlv_36= 'externalInterface' otherlv_37= '{' ( (lv_externalInterface_38_0= ruleExternalInterface ) ) (otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) ) )* otherlv_41= '}' )?
            int alt260=2;
            int LA260_0 = input.LA(1);

            if ( (LA260_0==76) ) {
                alt260=1;
            }
            switch (alt260) {
                case 1 :
                    // InternalCAEXtext.g:8013:4: otherlv_36= 'externalInterface' otherlv_37= '{' ( (lv_externalInterface_38_0= ruleExternalInterface ) ) (otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) ) )* otherlv_41= '}'
                    {
                    otherlv_36=(Token)match(input,76,FOLLOW_14); 

                    				newLeafNode(otherlv_36, grammarAccess.getRoleClass_ImplAccess().getExternalInterfaceKeyword_14_0());
                    			
                    otherlv_37=(Token)match(input,16,FOLLOW_60); 

                    				newLeafNode(otherlv_37, grammarAccess.getRoleClass_ImplAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalCAEXtext.g:8021:4: ( (lv_externalInterface_38_0= ruleExternalInterface ) )
                    // InternalCAEXtext.g:8022:5: (lv_externalInterface_38_0= ruleExternalInterface )
                    {
                    // InternalCAEXtext.g:8022:5: (lv_externalInterface_38_0= ruleExternalInterface )
                    // InternalCAEXtext.g:8023:6: lv_externalInterface_38_0= ruleExternalInterface
                    {

                    						newCompositeNode(grammarAccess.getRoleClass_ImplAccess().getExternalInterfaceExternalInterfaceParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_externalInterface_38_0=ruleExternalInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleClass_ImplRule());
                    						}
                    						add(
                    							current,
                    							"externalInterface",
                    							lv_externalInterface_38_0,
                    							"caex.caex215.CAEXtext.ExternalInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:8040:4: (otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) ) )*
                    loop259:
                    do {
                        int alt259=2;
                        int LA259_0 = input.LA(1);

                        if ( (LA259_0==14) ) {
                            alt259=1;
                        }


                        switch (alt259) {
                    	case 1 :
                    	    // InternalCAEXtext.g:8041:5: otherlv_39= ',' ( (lv_externalInterface_40_0= ruleExternalInterface ) )
                    	    {
                    	    otherlv_39=(Token)match(input,14,FOLLOW_60); 

                    	    					newLeafNode(otherlv_39, grammarAccess.getRoleClass_ImplAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalCAEXtext.g:8045:5: ( (lv_externalInterface_40_0= ruleExternalInterface ) )
                    	    // InternalCAEXtext.g:8046:6: (lv_externalInterface_40_0= ruleExternalInterface )
                    	    {
                    	    // InternalCAEXtext.g:8046:6: (lv_externalInterface_40_0= ruleExternalInterface )
                    	    // InternalCAEXtext.g:8047:7: lv_externalInterface_40_0= ruleExternalInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleClass_ImplAccess().getExternalInterfaceExternalInterfaceParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_externalInterface_40_0=ruleExternalInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoleClass_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"externalInterface",
                    	    								lv_externalInterface_40_0,
                    	    								"caex.caex215.CAEXtext.ExternalInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop259;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,19,FOLLOW_180); 

                    				newLeafNode(otherlv_41, grammarAccess.getRoleClass_ImplAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:8070:3: (otherlv_42= 'roleClass' otherlv_43= '{' ( (lv_roleClass_44_0= ruleRoleClass ) ) (otherlv_45= ',' ( (lv_roleClass_46_0= ruleRoleClass ) ) )* otherlv_47= '}' )?
            int alt262=2;
            int LA262_0 = input.LA(1);

            if ( (LA262_0==70) ) {
                alt262=1;
            }
            switch (alt262) {
                case 1 :
                    // InternalCAEXtext.g:8071:4: otherlv_42= 'roleClass' otherlv_43= '{' ( (lv_roleClass_44_0= ruleRoleClass ) ) (otherlv_45= ',' ( (lv_roleClass_46_0= ruleRoleClass ) ) )* otherlv_47= '}'
                    {
                    otherlv_42=(Token)match(input,70,FOLLOW_14); 

                    				newLeafNode(otherlv_42, grammarAccess.getRoleClass_ImplAccess().getRoleClassKeyword_15_0());
                    			
                    otherlv_43=(Token)match(input,16,FOLLOW_67); 

                    				newLeafNode(otherlv_43, grammarAccess.getRoleClass_ImplAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalCAEXtext.g:8079:4: ( (lv_roleClass_44_0= ruleRoleClass ) )
                    // InternalCAEXtext.g:8080:5: (lv_roleClass_44_0= ruleRoleClass )
                    {
                    // InternalCAEXtext.g:8080:5: (lv_roleClass_44_0= ruleRoleClass )
                    // InternalCAEXtext.g:8081:6: lv_roleClass_44_0= ruleRoleClass
                    {

                    						newCompositeNode(grammarAccess.getRoleClass_ImplAccess().getRoleClassRoleClassParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_roleClass_44_0=ruleRoleClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoleClass_ImplRule());
                    						}
                    						add(
                    							current,
                    							"roleClass",
                    							lv_roleClass_44_0,
                    							"caex.caex215.CAEXtext.RoleClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:8098:4: (otherlv_45= ',' ( (lv_roleClass_46_0= ruleRoleClass ) ) )*
                    loop261:
                    do {
                        int alt261=2;
                        int LA261_0 = input.LA(1);

                        if ( (LA261_0==14) ) {
                            alt261=1;
                        }


                        switch (alt261) {
                    	case 1 :
                    	    // InternalCAEXtext.g:8099:5: otherlv_45= ',' ( (lv_roleClass_46_0= ruleRoleClass ) )
                    	    {
                    	    otherlv_45=(Token)match(input,14,FOLLOW_67); 

                    	    					newLeafNode(otherlv_45, grammarAccess.getRoleClass_ImplAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalCAEXtext.g:8103:5: ( (lv_roleClass_46_0= ruleRoleClass ) )
                    	    // InternalCAEXtext.g:8104:6: (lv_roleClass_46_0= ruleRoleClass )
                    	    {
                    	    // InternalCAEXtext.g:8104:6: (lv_roleClass_46_0= ruleRoleClass )
                    	    // InternalCAEXtext.g:8105:7: lv_roleClass_46_0= ruleRoleClass
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoleClass_ImplAccess().getRoleClassRoleClassParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_roleClass_46_0=ruleRoleClass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoleClass_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"roleClass",
                    	    								lv_roleClass_46_0,
                    	    								"caex.caex215.CAEXtext.RoleClass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop261;
                        }
                    } while (true);

                    otherlv_47=(Token)match(input,19,FOLLOW_31); 

                    				newLeafNode(otherlv_47, grammarAccess.getRoleClass_ImplAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            otherlv_48=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_48, grammarAccess.getRoleClass_ImplAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoleClass_Impl"


    // $ANTLR start "entryRuleAttributeNameMapping"
    // InternalCAEXtext.g:8136:1: entryRuleAttributeNameMapping returns [EObject current=null] : iv_ruleAttributeNameMapping= ruleAttributeNameMapping EOF ;
    public final EObject entryRuleAttributeNameMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeNameMapping = null;


        try {
            // InternalCAEXtext.g:8136:61: (iv_ruleAttributeNameMapping= ruleAttributeNameMapping EOF )
            // InternalCAEXtext.g:8137:2: iv_ruleAttributeNameMapping= ruleAttributeNameMapping EOF
            {
             newCompositeNode(grammarAccess.getAttributeNameMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeNameMapping=ruleAttributeNameMapping();

            state._fsp--;

             current =iv_ruleAttributeNameMapping; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeNameMapping"


    // $ANTLR start "ruleAttributeNameMapping"
    // InternalCAEXtext.g:8143:1: ruleAttributeNameMapping returns [EObject current=null] : (otherlv_0= 'AttributeNameMapping' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'roleAttributeName' ( (lv_roleAttributeName_5_0= ruleEString ) ) otherlv_6= 'systemUnitAttributeName' ( (lv_systemUnitAttributeName_7_0= ruleEString ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )? (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )? (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )? (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )? (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) ;
    public final EObject ruleAttributeNameMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Enumerator lv_changeMode_3_0 = null;

        AntlrDatatypeRuleToken lv_roleAttributeName_5_0 = null;

        AntlrDatatypeRuleToken lv_systemUnitAttributeName_7_0 = null;

        EObject lv_description_9_0 = null;

        EObject lv_version_11_0 = null;

        EObject lv_revision_14_0 = null;

        EObject lv_revision_16_0 = null;

        EObject lv_copyright_19_0 = null;

        EObject lv_additionalInformation_22_0 = null;

        EObject lv_additionalInformation_24_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:8149:2: ( (otherlv_0= 'AttributeNameMapping' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'roleAttributeName' ( (lv_roleAttributeName_5_0= ruleEString ) ) otherlv_6= 'systemUnitAttributeName' ( (lv_systemUnitAttributeName_7_0= ruleEString ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )? (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )? (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )? (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )? (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) )
            // InternalCAEXtext.g:8150:2: (otherlv_0= 'AttributeNameMapping' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'roleAttributeName' ( (lv_roleAttributeName_5_0= ruleEString ) ) otherlv_6= 'systemUnitAttributeName' ( (lv_systemUnitAttributeName_7_0= ruleEString ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )? (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )? (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )? (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )? (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            {
            // InternalCAEXtext.g:8150:2: (otherlv_0= 'AttributeNameMapping' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'roleAttributeName' ( (lv_roleAttributeName_5_0= ruleEString ) ) otherlv_6= 'systemUnitAttributeName' ( (lv_systemUnitAttributeName_7_0= ruleEString ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )? (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )? (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )? (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )? (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            // InternalCAEXtext.g:8151:3: otherlv_0= 'AttributeNameMapping' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'roleAttributeName' ( (lv_roleAttributeName_5_0= ruleEString ) ) otherlv_6= 'systemUnitAttributeName' ( (lv_systemUnitAttributeName_7_0= ruleEString ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )? (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )? (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )? (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )? (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )? otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,100,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeNameMappingAccess().getAttributeNameMappingKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_181); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeNameMappingAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCAEXtext.g:8159:3: (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )?
            int alt263=2;
            int LA263_0 = input.LA(1);

            if ( (LA263_0==13) ) {
                alt263=1;
            }
            switch (alt263) {
                case 1 :
                    // InternalCAEXtext.g:8160:4: otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeNameMappingAccess().getChangeModeKeyword_2_0());
                    			
                    // InternalCAEXtext.g:8164:4: ( (lv_changeMode_3_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:8165:5: (lv_changeMode_3_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:8165:5: (lv_changeMode_3_0= ruleChangeMode )
                    // InternalCAEXtext.g:8166:6: lv_changeMode_3_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getAttributeNameMappingAccess().getChangeModeChangeModeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_182);
                    lv_changeMode_3_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeNameMappingRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_3_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,101,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeNameMappingAccess().getRoleAttributeNameKeyword_3());
            		
            // InternalCAEXtext.g:8188:3: ( (lv_roleAttributeName_5_0= ruleEString ) )
            // InternalCAEXtext.g:8189:4: (lv_roleAttributeName_5_0= ruleEString )
            {
            // InternalCAEXtext.g:8189:4: (lv_roleAttributeName_5_0= ruleEString )
            // InternalCAEXtext.g:8190:5: lv_roleAttributeName_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeNameMappingAccess().getRoleAttributeNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_183);
            lv_roleAttributeName_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeNameMappingRule());
            					}
            					set(
            						current,
            						"roleAttributeName",
            						lv_roleAttributeName_5_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,102,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getAttributeNameMappingAccess().getSystemUnitAttributeNameKeyword_5());
            		
            // InternalCAEXtext.g:8211:3: ( (lv_systemUnitAttributeName_7_0= ruleEString ) )
            // InternalCAEXtext.g:8212:4: (lv_systemUnitAttributeName_7_0= ruleEString )
            {
            // InternalCAEXtext.g:8212:4: (lv_systemUnitAttributeName_7_0= ruleEString )
            // InternalCAEXtext.g:8213:5: lv_systemUnitAttributeName_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeNameMappingAccess().getSystemUnitAttributeNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_150);
            lv_systemUnitAttributeName_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeNameMappingRule());
            					}
            					set(
            						current,
            						"systemUnitAttributeName",
            						lv_systemUnitAttributeName_7_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCAEXtext.g:8230:3: (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )?
            int alt264=2;
            int LA264_0 = input.LA(1);

            if ( (LA264_0==61) ) {
                alt264=1;
            }
            switch (alt264) {
                case 1 :
                    // InternalCAEXtext.g:8231:4: otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) )
                    {
                    otherlv_8=(Token)match(input,61,FOLLOW_103); 

                    				newLeafNode(otherlv_8, grammarAccess.getAttributeNameMappingAccess().getDescriptionKeyword_7_0());
                    			
                    // InternalCAEXtext.g:8235:4: ( (lv_description_9_0= ruleDescription ) )
                    // InternalCAEXtext.g:8236:5: (lv_description_9_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:8236:5: (lv_description_9_0= ruleDescription )
                    // InternalCAEXtext.g:8237:6: lv_description_9_0= ruleDescription
                    {

                    						newCompositeNode(grammarAccess.getAttributeNameMappingAccess().getDescriptionDescriptionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_151);
                    lv_description_9_0=ruleDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeNameMappingRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"caex.caex215.CAEXtext.Description");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:8255:3: (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )?
            int alt265=2;
            int LA265_0 = input.LA(1);

            if ( (LA265_0==62) ) {
                alt265=1;
            }
            switch (alt265) {
                case 1 :
                    // InternalCAEXtext.g:8256:4: otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) )
                    {
                    otherlv_10=(Token)match(input,62,FOLLOW_105); 

                    				newLeafNode(otherlv_10, grammarAccess.getAttributeNameMappingAccess().getVersionKeyword_8_0());
                    			
                    // InternalCAEXtext.g:8260:4: ( (lv_version_11_0= ruleVersion ) )
                    // InternalCAEXtext.g:8261:5: (lv_version_11_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:8261:5: (lv_version_11_0= ruleVersion )
                    // InternalCAEXtext.g:8262:6: lv_version_11_0= ruleVersion
                    {

                    						newCompositeNode(grammarAccess.getAttributeNameMappingAccess().getVersionVersionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_152);
                    lv_version_11_0=ruleVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeNameMappingRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_11_0,
                    							"caex.caex215.CAEXtext.Version");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:8280:3: (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )?
            int alt267=2;
            int LA267_0 = input.LA(1);

            if ( (LA267_0==63) ) {
                alt267=1;
            }
            switch (alt267) {
                case 1 :
                    // InternalCAEXtext.g:8281:4: otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,63,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getAttributeNameMappingAccess().getRevisionKeyword_9_0());
                    			
                    otherlv_13=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getAttributeNameMappingAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalCAEXtext.g:8289:4: ( (lv_revision_14_0= ruleRevision ) )
                    // InternalCAEXtext.g:8290:5: (lv_revision_14_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:8290:5: (lv_revision_14_0= ruleRevision )
                    // InternalCAEXtext.g:8291:6: lv_revision_14_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getAttributeNameMappingAccess().getRevisionRevisionParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_revision_14_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeNameMappingRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_14_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:8308:4: (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )*
                    loop266:
                    do {
                        int alt266=2;
                        int LA266_0 = input.LA(1);

                        if ( (LA266_0==14) ) {
                            alt266=1;
                        }


                        switch (alt266) {
                    	case 1 :
                    	    // InternalCAEXtext.g:8309:5: otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getAttributeNameMappingAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalCAEXtext.g:8313:5: ( (lv_revision_16_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:8314:6: (lv_revision_16_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:8314:6: (lv_revision_16_0= ruleRevision )
                    	    // InternalCAEXtext.g:8315:7: lv_revision_16_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeNameMappingAccess().getRevisionRevisionParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_revision_16_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAttributeNameMappingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_16_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop266;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_153); 

                    				newLeafNode(otherlv_17, grammarAccess.getAttributeNameMappingAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:8338:3: (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )?
            int alt268=2;
            int LA268_0 = input.LA(1);

            if ( (LA268_0==64) ) {
                alt268=1;
            }
            switch (alt268) {
                case 1 :
                    // InternalCAEXtext.g:8339:4: otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) )
                    {
                    otherlv_18=(Token)match(input,64,FOLLOW_108); 

                    				newLeafNode(otherlv_18, grammarAccess.getAttributeNameMappingAccess().getCopyrightKeyword_10_0());
                    			
                    // InternalCAEXtext.g:8343:4: ( (lv_copyright_19_0= ruleCopyright ) )
                    // InternalCAEXtext.g:8344:5: (lv_copyright_19_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:8344:5: (lv_copyright_19_0= ruleCopyright )
                    // InternalCAEXtext.g:8345:6: lv_copyright_19_0= ruleCopyright
                    {

                    						newCompositeNode(grammarAccess.getAttributeNameMappingAccess().getCopyrightCopyrightParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_154);
                    lv_copyright_19_0=ruleCopyright();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeNameMappingRule());
                    						}
                    						set(
                    							current,
                    							"copyright",
                    							lv_copyright_19_0,
                    							"caex.caex215.CAEXtext.Copyright");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:8363:3: (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )?
            int alt270=2;
            int LA270_0 = input.LA(1);

            if ( (LA270_0==65) ) {
                alt270=1;
            }
            switch (alt270) {
                case 1 :
                    // InternalCAEXtext.g:8364:4: otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,65,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getAttributeNameMappingAccess().getAdditionalInformationKeyword_11_0());
                    			
                    otherlv_21=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getAttributeNameMappingAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalCAEXtext.g:8372:4: ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:8373:5: (lv_additionalInformation_22_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:8373:5: (lv_additionalInformation_22_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:8374:6: lv_additionalInformation_22_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getAttributeNameMappingAccess().getAdditionalInformationAdditionalInformationParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_additionalInformation_22_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeNameMappingRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_22_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:8391:4: (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )*
                    loop269:
                    do {
                        int alt269=2;
                        int LA269_0 = input.LA(1);

                        if ( (LA269_0==14) ) {
                            alt269=1;
                        }


                        switch (alt269) {
                    	case 1 :
                    	    // InternalCAEXtext.g:8392:5: otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getAttributeNameMappingAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalCAEXtext.g:8396:5: ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:8397:6: (lv_additionalInformation_24_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:8397:6: (lv_additionalInformation_24_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:8398:7: lv_additionalInformation_24_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeNameMappingAccess().getAdditionalInformationAdditionalInformationParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_additionalInformation_24_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAttributeNameMappingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_24_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop269;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,19,FOLLOW_31); 

                    				newLeafNode(otherlv_25, grammarAccess.getAttributeNameMappingAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getAttributeNameMappingAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeNameMapping"


    // $ANTLR start "entryRuleInterfaceNameMapping"
    // InternalCAEXtext.g:8429:1: entryRuleInterfaceNameMapping returns [EObject current=null] : iv_ruleInterfaceNameMapping= ruleInterfaceNameMapping EOF ;
    public final EObject entryRuleInterfaceNameMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceNameMapping = null;


        try {
            // InternalCAEXtext.g:8429:61: (iv_ruleInterfaceNameMapping= ruleInterfaceNameMapping EOF )
            // InternalCAEXtext.g:8430:2: iv_ruleInterfaceNameMapping= ruleInterfaceNameMapping EOF
            {
             newCompositeNode(grammarAccess.getInterfaceNameMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceNameMapping=ruleInterfaceNameMapping();

            state._fsp--;

             current =iv_ruleInterfaceNameMapping; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInterfaceNameMapping"


    // $ANTLR start "ruleInterfaceNameMapping"
    // InternalCAEXtext.g:8436:1: ruleInterfaceNameMapping returns [EObject current=null] : (otherlv_0= 'InterfaceNameMapping' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'roleInterfaceName' ( (lv_roleInterfaceName_5_0= ruleEString ) ) otherlv_6= 'systemUnitInterfaceName' ( (lv_systemUnitInterfaceName_7_0= ruleEString ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )? (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )? (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )? (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )? (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) ;
    public final EObject ruleInterfaceNameMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Enumerator lv_changeMode_3_0 = null;

        AntlrDatatypeRuleToken lv_roleInterfaceName_5_0 = null;

        AntlrDatatypeRuleToken lv_systemUnitInterfaceName_7_0 = null;

        EObject lv_description_9_0 = null;

        EObject lv_version_11_0 = null;

        EObject lv_revision_14_0 = null;

        EObject lv_revision_16_0 = null;

        EObject lv_copyright_19_0 = null;

        EObject lv_additionalInformation_22_0 = null;

        EObject lv_additionalInformation_24_0 = null;



        	enterRule();

        try {
            // InternalCAEXtext.g:8442:2: ( (otherlv_0= 'InterfaceNameMapping' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'roleInterfaceName' ( (lv_roleInterfaceName_5_0= ruleEString ) ) otherlv_6= 'systemUnitInterfaceName' ( (lv_systemUnitInterfaceName_7_0= ruleEString ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )? (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )? (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )? (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )? (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) )
            // InternalCAEXtext.g:8443:2: (otherlv_0= 'InterfaceNameMapping' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'roleInterfaceName' ( (lv_roleInterfaceName_5_0= ruleEString ) ) otherlv_6= 'systemUnitInterfaceName' ( (lv_systemUnitInterfaceName_7_0= ruleEString ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )? (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )? (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )? (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )? (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            {
            // InternalCAEXtext.g:8443:2: (otherlv_0= 'InterfaceNameMapping' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'roleInterfaceName' ( (lv_roleInterfaceName_5_0= ruleEString ) ) otherlv_6= 'systemUnitInterfaceName' ( (lv_systemUnitInterfaceName_7_0= ruleEString ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )? (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )? (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )? (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )? (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            // InternalCAEXtext.g:8444:3: otherlv_0= 'InterfaceNameMapping' otherlv_1= '{' (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )? otherlv_4= 'roleInterfaceName' ( (lv_roleInterfaceName_5_0= ruleEString ) ) otherlv_6= 'systemUnitInterfaceName' ( (lv_systemUnitInterfaceName_7_0= ruleEString ) ) (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )? (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )? (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )? (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )? (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )? otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,103,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceNameMappingAccess().getInterfaceNameMappingKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_184); 

            			newLeafNode(otherlv_1, grammarAccess.getInterfaceNameMappingAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCAEXtext.g:8452:3: (otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) ) )?
            int alt271=2;
            int LA271_0 = input.LA(1);

            if ( (LA271_0==13) ) {
                alt271=1;
            }
            switch (alt271) {
                case 1 :
                    // InternalCAEXtext.g:8453:4: otherlv_2= 'changeMode' ( (lv_changeMode_3_0= ruleChangeMode ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getInterfaceNameMappingAccess().getChangeModeKeyword_2_0());
                    			
                    // InternalCAEXtext.g:8457:4: ( (lv_changeMode_3_0= ruleChangeMode ) )
                    // InternalCAEXtext.g:8458:5: (lv_changeMode_3_0= ruleChangeMode )
                    {
                    // InternalCAEXtext.g:8458:5: (lv_changeMode_3_0= ruleChangeMode )
                    // InternalCAEXtext.g:8459:6: lv_changeMode_3_0= ruleChangeMode
                    {

                    						newCompositeNode(grammarAccess.getInterfaceNameMappingAccess().getChangeModeChangeModeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_185);
                    lv_changeMode_3_0=ruleChangeMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceNameMappingRule());
                    						}
                    						set(
                    							current,
                    							"changeMode",
                    							lv_changeMode_3_0,
                    							"caex.caex215.CAEXtext.ChangeMode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,104,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getInterfaceNameMappingAccess().getRoleInterfaceNameKeyword_3());
            		
            // InternalCAEXtext.g:8481:3: ( (lv_roleInterfaceName_5_0= ruleEString ) )
            // InternalCAEXtext.g:8482:4: (lv_roleInterfaceName_5_0= ruleEString )
            {
            // InternalCAEXtext.g:8482:4: (lv_roleInterfaceName_5_0= ruleEString )
            // InternalCAEXtext.g:8483:5: lv_roleInterfaceName_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterfaceNameMappingAccess().getRoleInterfaceNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_186);
            lv_roleInterfaceName_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterfaceNameMappingRule());
            					}
            					set(
            						current,
            						"roleInterfaceName",
            						lv_roleInterfaceName_5_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,105,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getInterfaceNameMappingAccess().getSystemUnitInterfaceNameKeyword_5());
            		
            // InternalCAEXtext.g:8504:3: ( (lv_systemUnitInterfaceName_7_0= ruleEString ) )
            // InternalCAEXtext.g:8505:4: (lv_systemUnitInterfaceName_7_0= ruleEString )
            {
            // InternalCAEXtext.g:8505:4: (lv_systemUnitInterfaceName_7_0= ruleEString )
            // InternalCAEXtext.g:8506:5: lv_systemUnitInterfaceName_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterfaceNameMappingAccess().getSystemUnitInterfaceNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_150);
            lv_systemUnitInterfaceName_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterfaceNameMappingRule());
            					}
            					set(
            						current,
            						"systemUnitInterfaceName",
            						lv_systemUnitInterfaceName_7_0,
            						"caex.caex215.CAEXtext.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCAEXtext.g:8523:3: (otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) ) )?
            int alt272=2;
            int LA272_0 = input.LA(1);

            if ( (LA272_0==61) ) {
                alt272=1;
            }
            switch (alt272) {
                case 1 :
                    // InternalCAEXtext.g:8524:4: otherlv_8= 'description' ( (lv_description_9_0= ruleDescription ) )
                    {
                    otherlv_8=(Token)match(input,61,FOLLOW_103); 

                    				newLeafNode(otherlv_8, grammarAccess.getInterfaceNameMappingAccess().getDescriptionKeyword_7_0());
                    			
                    // InternalCAEXtext.g:8528:4: ( (lv_description_9_0= ruleDescription ) )
                    // InternalCAEXtext.g:8529:5: (lv_description_9_0= ruleDescription )
                    {
                    // InternalCAEXtext.g:8529:5: (lv_description_9_0= ruleDescription )
                    // InternalCAEXtext.g:8530:6: lv_description_9_0= ruleDescription
                    {

                    						newCompositeNode(grammarAccess.getInterfaceNameMappingAccess().getDescriptionDescriptionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_151);
                    lv_description_9_0=ruleDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceNameMappingRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"caex.caex215.CAEXtext.Description");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:8548:3: (otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) ) )?
            int alt273=2;
            int LA273_0 = input.LA(1);

            if ( (LA273_0==62) ) {
                alt273=1;
            }
            switch (alt273) {
                case 1 :
                    // InternalCAEXtext.g:8549:4: otherlv_10= 'version' ( (lv_version_11_0= ruleVersion ) )
                    {
                    otherlv_10=(Token)match(input,62,FOLLOW_105); 

                    				newLeafNode(otherlv_10, grammarAccess.getInterfaceNameMappingAccess().getVersionKeyword_8_0());
                    			
                    // InternalCAEXtext.g:8553:4: ( (lv_version_11_0= ruleVersion ) )
                    // InternalCAEXtext.g:8554:5: (lv_version_11_0= ruleVersion )
                    {
                    // InternalCAEXtext.g:8554:5: (lv_version_11_0= ruleVersion )
                    // InternalCAEXtext.g:8555:6: lv_version_11_0= ruleVersion
                    {

                    						newCompositeNode(grammarAccess.getInterfaceNameMappingAccess().getVersionVersionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_152);
                    lv_version_11_0=ruleVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceNameMappingRule());
                    						}
                    						set(
                    							current,
                    							"version",
                    							lv_version_11_0,
                    							"caex.caex215.CAEXtext.Version");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:8573:3: (otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}' )?
            int alt275=2;
            int LA275_0 = input.LA(1);

            if ( (LA275_0==63) ) {
                alt275=1;
            }
            switch (alt275) {
                case 1 :
                    // InternalCAEXtext.g:8574:4: otherlv_12= 'revision' otherlv_13= '{' ( (lv_revision_14_0= ruleRevision ) ) (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,63,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getInterfaceNameMappingAccess().getRevisionKeyword_9_0());
                    			
                    otherlv_13=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getInterfaceNameMappingAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalCAEXtext.g:8582:4: ( (lv_revision_14_0= ruleRevision ) )
                    // InternalCAEXtext.g:8583:5: (lv_revision_14_0= ruleRevision )
                    {
                    // InternalCAEXtext.g:8583:5: (lv_revision_14_0= ruleRevision )
                    // InternalCAEXtext.g:8584:6: lv_revision_14_0= ruleRevision
                    {

                    						newCompositeNode(grammarAccess.getInterfaceNameMappingAccess().getRevisionRevisionParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_revision_14_0=ruleRevision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceNameMappingRule());
                    						}
                    						add(
                    							current,
                    							"revision",
                    							lv_revision_14_0,
                    							"caex.caex215.CAEXtext.Revision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:8601:4: (otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) ) )*
                    loop274:
                    do {
                        int alt274=2;
                        int LA274_0 = input.LA(1);

                        if ( (LA274_0==14) ) {
                            alt274=1;
                        }


                        switch (alt274) {
                    	case 1 :
                    	    // InternalCAEXtext.g:8602:5: otherlv_15= ',' ( (lv_revision_16_0= ruleRevision ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getInterfaceNameMappingAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalCAEXtext.g:8606:5: ( (lv_revision_16_0= ruleRevision ) )
                    	    // InternalCAEXtext.g:8607:6: (lv_revision_16_0= ruleRevision )
                    	    {
                    	    // InternalCAEXtext.g:8607:6: (lv_revision_16_0= ruleRevision )
                    	    // InternalCAEXtext.g:8608:7: lv_revision_16_0= ruleRevision
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceNameMappingAccess().getRevisionRevisionParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_revision_16_0=ruleRevision();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceNameMappingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"revision",
                    	    								lv_revision_16_0,
                    	    								"caex.caex215.CAEXtext.Revision");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop274;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_153); 

                    				newLeafNode(otherlv_17, grammarAccess.getInterfaceNameMappingAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalCAEXtext.g:8631:3: (otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) ) )?
            int alt276=2;
            int LA276_0 = input.LA(1);

            if ( (LA276_0==64) ) {
                alt276=1;
            }
            switch (alt276) {
                case 1 :
                    // InternalCAEXtext.g:8632:4: otherlv_18= 'copyright' ( (lv_copyright_19_0= ruleCopyright ) )
                    {
                    otherlv_18=(Token)match(input,64,FOLLOW_108); 

                    				newLeafNode(otherlv_18, grammarAccess.getInterfaceNameMappingAccess().getCopyrightKeyword_10_0());
                    			
                    // InternalCAEXtext.g:8636:4: ( (lv_copyright_19_0= ruleCopyright ) )
                    // InternalCAEXtext.g:8637:5: (lv_copyright_19_0= ruleCopyright )
                    {
                    // InternalCAEXtext.g:8637:5: (lv_copyright_19_0= ruleCopyright )
                    // InternalCAEXtext.g:8638:6: lv_copyright_19_0= ruleCopyright
                    {

                    						newCompositeNode(grammarAccess.getInterfaceNameMappingAccess().getCopyrightCopyrightParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_154);
                    lv_copyright_19_0=ruleCopyright();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceNameMappingRule());
                    						}
                    						set(
                    							current,
                    							"copyright",
                    							lv_copyright_19_0,
                    							"caex.caex215.CAEXtext.Copyright");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCAEXtext.g:8656:3: (otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}' )?
            int alt278=2;
            int LA278_0 = input.LA(1);

            if ( (LA278_0==65) ) {
                alt278=1;
            }
            switch (alt278) {
                case 1 :
                    // InternalCAEXtext.g:8657:4: otherlv_20= 'additionalInformation' otherlv_21= '{' ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) ) (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,65,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getInterfaceNameMappingAccess().getAdditionalInformationKeyword_11_0());
                    			
                    otherlv_21=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getInterfaceNameMappingAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalCAEXtext.g:8665:4: ( (lv_additionalInformation_22_0= ruleAdditionalInformation ) )
                    // InternalCAEXtext.g:8666:5: (lv_additionalInformation_22_0= ruleAdditionalInformation )
                    {
                    // InternalCAEXtext.g:8666:5: (lv_additionalInformation_22_0= ruleAdditionalInformation )
                    // InternalCAEXtext.g:8667:6: lv_additionalInformation_22_0= ruleAdditionalInformation
                    {

                    						newCompositeNode(grammarAccess.getInterfaceNameMappingAccess().getAdditionalInformationAdditionalInformationParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_additionalInformation_22_0=ruleAdditionalInformation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterfaceNameMappingRule());
                    						}
                    						add(
                    							current,
                    							"additionalInformation",
                    							lv_additionalInformation_22_0,
                    							"caex.caex215.CAEXtext.AdditionalInformation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCAEXtext.g:8684:4: (otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) ) )*
                    loop277:
                    do {
                        int alt277=2;
                        int LA277_0 = input.LA(1);

                        if ( (LA277_0==14) ) {
                            alt277=1;
                        }


                        switch (alt277) {
                    	case 1 :
                    	    // InternalCAEXtext.g:8685:5: otherlv_23= ',' ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FOLLOW_13); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getInterfaceNameMappingAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalCAEXtext.g:8689:5: ( (lv_additionalInformation_24_0= ruleAdditionalInformation ) )
                    	    // InternalCAEXtext.g:8690:6: (lv_additionalInformation_24_0= ruleAdditionalInformation )
                    	    {
                    	    // InternalCAEXtext.g:8690:6: (lv_additionalInformation_24_0= ruleAdditionalInformation )
                    	    // InternalCAEXtext.g:8691:7: lv_additionalInformation_24_0= ruleAdditionalInformation
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterfaceNameMappingAccess().getAdditionalInformationAdditionalInformationParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_additionalInformation_24_0=ruleAdditionalInformation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterfaceNameMappingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalInformation",
                    	    								lv_additionalInformation_24_0,
                    	    								"caex.caex215.CAEXtext.AdditionalInformation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop277;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,19,FOLLOW_31); 

                    				newLeafNode(otherlv_25, grammarAccess.getInterfaceNameMappingAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getInterfaceNameMappingAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceNameMapping"


    // $ANTLR start "ruleChangeMode"
    // InternalCAEXtext.g:8722:1: ruleChangeMode returns [Enumerator current=null] : ( (enumLiteral_0= 'state' ) | (enumLiteral_1= 'create' ) | (enumLiteral_2= 'delete' ) | (enumLiteral_3= 'change' ) ) ;
    public final Enumerator ruleChangeMode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCAEXtext.g:8728:2: ( ( (enumLiteral_0= 'state' ) | (enumLiteral_1= 'create' ) | (enumLiteral_2= 'delete' ) | (enumLiteral_3= 'change' ) ) )
            // InternalCAEXtext.g:8729:2: ( (enumLiteral_0= 'state' ) | (enumLiteral_1= 'create' ) | (enumLiteral_2= 'delete' ) | (enumLiteral_3= 'change' ) )
            {
            // InternalCAEXtext.g:8729:2: ( (enumLiteral_0= 'state' ) | (enumLiteral_1= 'create' ) | (enumLiteral_2= 'delete' ) | (enumLiteral_3= 'change' ) )
            int alt279=4;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt279=1;
                }
                break;
            case 107:
                {
                alt279=2;
                }
                break;
            case 108:
                {
                alt279=3;
                }
                break;
            case 109:
                {
                alt279=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 279, 0, input);

                throw nvae;
            }

            switch (alt279) {
                case 1 :
                    // InternalCAEXtext.g:8730:3: (enumLiteral_0= 'state' )
                    {
                    // InternalCAEXtext.g:8730:3: (enumLiteral_0= 'state' )
                    // InternalCAEXtext.g:8731:4: enumLiteral_0= 'state'
                    {
                    enumLiteral_0=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getChangeModeAccess().getStateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getChangeModeAccess().getStateEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCAEXtext.g:8738:3: (enumLiteral_1= 'create' )
                    {
                    // InternalCAEXtext.g:8738:3: (enumLiteral_1= 'create' )
                    // InternalCAEXtext.g:8739:4: enumLiteral_1= 'create'
                    {
                    enumLiteral_1=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getChangeModeAccess().getCreateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getChangeModeAccess().getCreateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCAEXtext.g:8746:3: (enumLiteral_2= 'delete' )
                    {
                    // InternalCAEXtext.g:8746:3: (enumLiteral_2= 'delete' )
                    // InternalCAEXtext.g:8747:4: enumLiteral_2= 'delete'
                    {
                    enumLiteral_2=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getChangeModeAccess().getDeleteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getChangeModeAccess().getDeleteEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCAEXtext.g:8754:3: (enumLiteral_3= 'change' )
                    {
                    // InternalCAEXtext.g:8754:3: (enumLiteral_3= 'change' )
                    // InternalCAEXtext.g:8755:4: enumLiteral_3= 'change'
                    {
                    enumLiteral_3=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getChangeModeAccess().getChangeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getChangeModeAccess().getChangeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChangeMode"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000060D0A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x00003C0000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000060D08000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000060C08000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000060808000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000006000C000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000019480080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000019400084000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000019000084000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000018000084000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000084000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000282000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000070D80000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000060D80000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000060C80000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000060880000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000060084000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000800001000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000400000080000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000006000002000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0400000060D80000L,0x0000000400000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0400000060C80000L,0x0000000400000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0400000060880000L,0x0000000400000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0400000060084000L,0x0000000400000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0400000040080000L,0x0000000400000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400000000084000L,0x0000000400000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0400000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000060D80000L,0x0000000800000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000060C80000L,0x0000000800000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000060880000L,0x0000000800000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000060084000L,0x0000000800000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000040080000L,0x0000000800000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000084000L,0x0000000800000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000400060D80000L,0x0000000000000800L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000400060C80000L,0x0000000000000800L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000400060880000L,0x0000000000000800L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000400060084000L,0x0000000000000800L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000400040080000L,0x0000000000000800L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000400000084000L,0x0000000000000800L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000180000280000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000180000080000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0007C00000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0007400000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0006400000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0006000000084000L,0x0000000000000100L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0004000000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0004000000084000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0008000800000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0070000000001000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0060000000001000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0040000000001000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0080000060D0A000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0300100000080000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0200100000080000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0xF800000000080000L,0x000000000000000FL});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0xF000000000080000L,0x000000000000000FL});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0xE000000000080000L,0x000000000000000FL});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0xC000000000080000L,0x000000000000000FL});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x8000000000080000L,0x000000000000000FL});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000080000L,0x000000000000000FL});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000080000L,0x000000000000000EL});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000080000L,0x000000000000000CL});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000020L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0xE000000000080000L,0x0000000000000083L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0xC000000000080000L,0x0000000000000083L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x8000000000080000L,0x0000000000000083L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000083L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000082L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000080L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000600L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000400L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0080000060D08000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0xF800000000080000L,0x000000000001F007L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0xF000000000080000L,0x000000000001F007L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0xE000000000080000L,0x000000000001F007L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0xC000000000080000L,0x000000000001F007L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x8000000000080000L,0x000000000001F007L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000080000L,0x000000000001F007L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000080000L,0x000000000001F006L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000080000L,0x000000000001F004L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000080000L,0x000000000001F000L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000080000L,0x000000000001E000L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000080000L,0x000000000001C000L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x0000000000080000L,0x0000000000018000L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x0000000000080000L,0x0000000000010000L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0xE000000000082000L,0x00000000000C0003L});
    public static final BitSet FOLLOW_139 = new BitSet(new long[]{0xE000000000080000L,0x00000000000C0003L});
    public static final BitSet FOLLOW_140 = new BitSet(new long[]{0xC000000000080000L,0x00000000000C0003L});
    public static final BitSet FOLLOW_141 = new BitSet(new long[]{0x8000000000080000L,0x00000000000C0003L});
    public static final BitSet FOLLOW_142 = new BitSet(new long[]{0x0000000000080000L,0x00000000000C0003L});
    public static final BitSet FOLLOW_143 = new BitSet(new long[]{0x0000000000080000L,0x00000000000C0002L});
    public static final BitSet FOLLOW_144 = new BitSet(new long[]{0x0000000000080000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_145 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_146 = new BitSet(new long[]{0x0000000000080000L,0x0000000000080000L});
    public static final BitSet FOLLOW_147 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_148 = new BitSet(new long[]{0x0000000000002000L,0x0000000000200000L});
    public static final BitSet FOLLOW_149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_150 = new BitSet(new long[]{0xE000000000080000L,0x0000000000000003L});
    public static final BitSet FOLLOW_151 = new BitSet(new long[]{0xC000000000080000L,0x0000000000000003L});
    public static final BitSet FOLLOW_152 = new BitSet(new long[]{0x8000000000080000L,0x0000000000000003L});
    public static final BitSet FOLLOW_153 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000003L});
    public static final BitSet FOLLOW_154 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_155 = new BitSet(new long[]{0x0000004000002000L});
    public static final BitSet FOLLOW_156 = new BitSet(new long[]{0xE000000000080000L,0x0000000003800003L});
    public static final BitSet FOLLOW_157 = new BitSet(new long[]{0xC000000000080000L,0x0000000003800003L});
    public static final BitSet FOLLOW_158 = new BitSet(new long[]{0x8000000000080000L,0x0000000003800003L});
    public static final BitSet FOLLOW_159 = new BitSet(new long[]{0x0000000000080000L,0x0000000003800003L});
    public static final BitSet FOLLOW_160 = new BitSet(new long[]{0x0000000000080000L,0x0000000003800002L});
    public static final BitSet FOLLOW_161 = new BitSet(new long[]{0x0000000000080000L,0x0000000003800000L});
    public static final BitSet FOLLOW_162 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_163 = new BitSet(new long[]{0x0000000000080000L,0x0000000003000000L});
    public static final BitSet FOLLOW_164 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_165 = new BitSet(new long[]{0x0000000000080000L,0x0000000002000000L});
    public static final BitSet FOLLOW_166 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_167 = new BitSet(new long[]{0x0000000000080000L,0x0000000070000000L});
    public static final BitSet FOLLOW_168 = new BitSet(new long[]{0x0000000000080000L,0x0000000060000000L});
    public static final BitSet FOLLOW_169 = new BitSet(new long[]{0x0000000000080000L,0x0000000040000000L});
    public static final BitSet FOLLOW_170 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
    public static final BitSet FOLLOW_171 = new BitSet(new long[]{0xF800000000080000L,0x0000000000001047L});
    public static final BitSet FOLLOW_172 = new BitSet(new long[]{0xF000000000080000L,0x0000000000001047L});
    public static final BitSet FOLLOW_173 = new BitSet(new long[]{0xE000000000080000L,0x0000000000001047L});
    public static final BitSet FOLLOW_174 = new BitSet(new long[]{0xC000000000080000L,0x0000000000001047L});
    public static final BitSet FOLLOW_175 = new BitSet(new long[]{0x8000000000080000L,0x0000000000001047L});
    public static final BitSet FOLLOW_176 = new BitSet(new long[]{0x0000000000080000L,0x0000000000001047L});
    public static final BitSet FOLLOW_177 = new BitSet(new long[]{0x0000000000080000L,0x0000000000001046L});
    public static final BitSet FOLLOW_178 = new BitSet(new long[]{0x0000000000080000L,0x0000000000001044L});
    public static final BitSet FOLLOW_179 = new BitSet(new long[]{0x0000000000080000L,0x0000000000001040L});
    public static final BitSet FOLLOW_180 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_181 = new BitSet(new long[]{0x0000000000002000L,0x0000002000000000L});
    public static final BitSet FOLLOW_182 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_183 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_184 = new BitSet(new long[]{0x0000000000002000L,0x0000010000000000L});
    public static final BitSet FOLLOW_185 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_186 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});

}