package org.xtext.parser.antlr.internal;

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
import org.xtext.services.StateMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'{'", "'states'", "'}'", "'starts'", "'with'", "'historyState'", "'events'", "','", "'transitions'", "'State'", "'InitialState'", "'references'", "'HistoryState'", "'Event'", "'Transition'", "'from'", "'to'", "'on'", "'CompositeState'", "'Action'", "'('", "')'", "'returns'", "'call'", "';'", "'onError'", "'then'", "'methodException'", "'other'", "'unknownNamespace'", "'objectNotFound'", "'methodNotFound'", "'parametersNotMatching'", "'returnTypeNotMatching'", "'continue'", "'skip'", "'exit'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalStateMachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateMachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateMachineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateMachine.g"; }



     	private StateMachineGrammarAccess grammarAccess;

        public InternalStateMachineParser(TokenStream input, StateMachineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";
       	}

       	@Override
       	protected StateMachineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStateMachine"
    // InternalStateMachine.g:65:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalStateMachine.g:65:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalStateMachine.g:66:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalStateMachine.g:72:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' otherlv_7= 'starts' otherlv_8= 'with' ( ( ruleEString ) ) (otherlv_10= 'historyState' ( ( ruleEString ) ) )? (otherlv_12= 'events' otherlv_13= '{' ( (lv_events_14_0= ruleEvent ) ) (otherlv_15= ',' ( (lv_events_16_0= ruleEvent ) ) )* otherlv_17= '}' )? (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_transitions_20_0= ruleTransition ) ) (otherlv_21= ',' ( (lv_transitions_22_0= ruleTransition ) ) )* otherlv_23= '}' )? ( ( (lv_actions_24_0= ruleXmod_Action ) ) (otherlv_25= ',' ( (lv_actions_26_0= ruleXmod_Action ) ) )* )? otherlv_27= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
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
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_states_5_0 = null;

        EObject lv_events_14_0 = null;

        EObject lv_events_16_0 = null;

        EObject lv_transitions_20_0 = null;

        EObject lv_transitions_22_0 = null;

        EObject lv_actions_24_0 = null;

        EObject lv_actions_26_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:78:2: ( (otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' otherlv_7= 'starts' otherlv_8= 'with' ( ( ruleEString ) ) (otherlv_10= 'historyState' ( ( ruleEString ) ) )? (otherlv_12= 'events' otherlv_13= '{' ( (lv_events_14_0= ruleEvent ) ) (otherlv_15= ',' ( (lv_events_16_0= ruleEvent ) ) )* otherlv_17= '}' )? (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_transitions_20_0= ruleTransition ) ) (otherlv_21= ',' ( (lv_transitions_22_0= ruleTransition ) ) )* otherlv_23= '}' )? ( ( (lv_actions_24_0= ruleXmod_Action ) ) (otherlv_25= ',' ( (lv_actions_26_0= ruleXmod_Action ) ) )* )? otherlv_27= '}' ) )
            // InternalStateMachine.g:79:2: (otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' otherlv_7= 'starts' otherlv_8= 'with' ( ( ruleEString ) ) (otherlv_10= 'historyState' ( ( ruleEString ) ) )? (otherlv_12= 'events' otherlv_13= '{' ( (lv_events_14_0= ruleEvent ) ) (otherlv_15= ',' ( (lv_events_16_0= ruleEvent ) ) )* otherlv_17= '}' )? (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_transitions_20_0= ruleTransition ) ) (otherlv_21= ',' ( (lv_transitions_22_0= ruleTransition ) ) )* otherlv_23= '}' )? ( ( (lv_actions_24_0= ruleXmod_Action ) ) (otherlv_25= ',' ( (lv_actions_26_0= ruleXmod_Action ) ) )* )? otherlv_27= '}' )
            {
            // InternalStateMachine.g:79:2: (otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' otherlv_7= 'starts' otherlv_8= 'with' ( ( ruleEString ) ) (otherlv_10= 'historyState' ( ( ruleEString ) ) )? (otherlv_12= 'events' otherlv_13= '{' ( (lv_events_14_0= ruleEvent ) ) (otherlv_15= ',' ( (lv_events_16_0= ruleEvent ) ) )* otherlv_17= '}' )? (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_transitions_20_0= ruleTransition ) ) (otherlv_21= ',' ( (lv_transitions_22_0= ruleTransition ) ) )* otherlv_23= '}' )? ( ( (lv_actions_24_0= ruleXmod_Action ) ) (otherlv_25= ',' ( (lv_actions_26_0= ruleXmod_Action ) ) )* )? otherlv_27= '}' )
            // InternalStateMachine.g:80:3: otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' otherlv_7= 'starts' otherlv_8= 'with' ( ( ruleEString ) ) (otherlv_10= 'historyState' ( ( ruleEString ) ) )? (otherlv_12= 'events' otherlv_13= '{' ( (lv_events_14_0= ruleEvent ) ) (otherlv_15= ',' ( (lv_events_16_0= ruleEvent ) ) )* otherlv_17= '}' )? (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_transitions_20_0= ruleTransition ) ) (otherlv_21= ',' ( (lv_transitions_22_0= ruleTransition ) ) )* otherlv_23= '}' )? ( ( (lv_actions_24_0= ruleXmod_Action ) ) (otherlv_25= ',' ( (lv_actions_26_0= ruleXmod_Action ) ) )* )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getStateMachineKeyword_0());
            		
            // InternalStateMachine.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalStateMachine.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalStateMachine.g:85:4: (lv_name_1_0= ruleEString )
            // InternalStateMachine.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.StateMachine.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getStatesKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalStateMachine.g:115:3: ( (lv_states_5_0= ruleState ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=21 && LA1_0<=22)||LA1_0==24||LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStateMachine.g:116:4: (lv_states_5_0= ruleState )
            	    {
            	    // InternalStateMachine.g:116:4: (lv_states_5_0= ruleState )
            	    // InternalStateMachine.g:117:5: lv_states_5_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_states_5_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_5_0,
            	    						"org.xtext.StateMachine.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getStartsKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getStateMachineAccess().getWithKeyword_8());
            		
            // InternalStateMachine.g:146:3: ( ( ruleEString ) )
            // InternalStateMachine.g:147:4: ( ruleEString )
            {
            // InternalStateMachine.g:147:4: ( ruleEString )
            // InternalStateMachine.g:148:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateMachineRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStateMachineAccess().getInitialStateInitialStateCrossReference_9_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateMachine.g:162:3: (otherlv_10= 'historyState' ( ( ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalStateMachine.g:163:4: otherlv_10= 'historyState' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getHistoryStateKeyword_10_0());
                    			
                    // InternalStateMachine.g:167:4: ( ( ruleEString ) )
                    // InternalStateMachine.g:168:5: ( ruleEString )
                    {
                    // InternalStateMachine.g:168:5: ( ruleEString )
                    // InternalStateMachine.g:169:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateMachineRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStateMachineAccess().getHistoryStateHistoryStateCrossReference_10_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStateMachine.g:184:3: (otherlv_12= 'events' otherlv_13= '{' ( (lv_events_14_0= ruleEvent ) ) (otherlv_15= ',' ( (lv_events_16_0= ruleEvent ) ) )* otherlv_17= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalStateMachine.g:185:4: otherlv_12= 'events' otherlv_13= '{' ( (lv_events_14_0= ruleEvent ) ) (otherlv_15= ',' ( (lv_events_16_0= ruleEvent ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getStateMachineAccess().getEventsKeyword_11_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalStateMachine.g:193:4: ( (lv_events_14_0= ruleEvent ) )
                    // InternalStateMachine.g:194:5: (lv_events_14_0= ruleEvent )
                    {
                    // InternalStateMachine.g:194:5: (lv_events_14_0= ruleEvent )
                    // InternalStateMachine.g:195:6: lv_events_14_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_events_14_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    						}
                    						add(
                    							current,
                    							"events",
                    							lv_events_14_0,
                    							"org.xtext.StateMachine.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalStateMachine.g:212:4: (otherlv_15= ',' ( (lv_events_16_0= ruleEvent ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==19) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalStateMachine.g:213:5: otherlv_15= ',' ( (lv_events_16_0= ruleEvent ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FOLLOW_11); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getStateMachineAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalStateMachine.g:217:5: ( (lv_events_16_0= ruleEvent ) )
                    	    // InternalStateMachine.g:218:6: (lv_events_16_0= ruleEvent )
                    	    {
                    	    // InternalStateMachine.g:218:6: (lv_events_16_0= ruleEvent )
                    	    // InternalStateMachine.g:219:7: lv_events_16_0= ruleEvent
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateMachineAccess().getEventsEventParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_events_16_0=ruleEvent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"events",
                    	    								lv_events_16_0,
                    	    								"org.xtext.StateMachine.Event");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_17, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalStateMachine.g:242:3: (otherlv_18= 'transitions' otherlv_19= '{' ( (lv_transitions_20_0= ruleTransition ) ) (otherlv_21= ',' ( (lv_transitions_22_0= ruleTransition ) ) )* otherlv_23= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStateMachine.g:243:4: otherlv_18= 'transitions' otherlv_19= '{' ( (lv_transitions_20_0= ruleTransition ) ) (otherlv_21= ',' ( (lv_transitions_22_0= ruleTransition ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getStateMachineAccess().getTransitionsKeyword_12_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_19, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalStateMachine.g:251:4: ( (lv_transitions_20_0= ruleTransition ) )
                    // InternalStateMachine.g:252:5: (lv_transitions_20_0= ruleTransition )
                    {
                    // InternalStateMachine.g:252:5: (lv_transitions_20_0= ruleTransition )
                    // InternalStateMachine.g:253:6: lv_transitions_20_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_transitions_20_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    						}
                    						add(
                    							current,
                    							"transitions",
                    							lv_transitions_20_0,
                    							"org.xtext.StateMachine.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalStateMachine.g:270:4: (otherlv_21= ',' ( (lv_transitions_22_0= ruleTransition ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==19) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalStateMachine.g:271:5: otherlv_21= ',' ( (lv_transitions_22_0= ruleTransition ) )
                    	    {
                    	    otherlv_21=(Token)match(input,19,FOLLOW_14); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getStateMachineAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalStateMachine.g:275:5: ( (lv_transitions_22_0= ruleTransition ) )
                    	    // InternalStateMachine.g:276:6: (lv_transitions_22_0= ruleTransition )
                    	    {
                    	    // InternalStateMachine.g:276:6: (lv_transitions_22_0= ruleTransition )
                    	    // InternalStateMachine.g:277:7: lv_transitions_22_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_transitions_22_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transitions",
                    	    								lv_transitions_22_0,
                    	    								"org.xtext.StateMachine.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,14,FOLLOW_15); 

                    				newLeafNode(otherlv_23, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalStateMachine.g:300:3: ( ( (lv_actions_24_0= ruleXmod_Action ) ) (otherlv_25= ',' ( (lv_actions_26_0= ruleXmod_Action ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalStateMachine.g:301:4: ( (lv_actions_24_0= ruleXmod_Action ) ) (otherlv_25= ',' ( (lv_actions_26_0= ruleXmod_Action ) ) )*
                    {
                    // InternalStateMachine.g:301:4: ( (lv_actions_24_0= ruleXmod_Action ) )
                    // InternalStateMachine.g:302:5: (lv_actions_24_0= ruleXmod_Action )
                    {
                    // InternalStateMachine.g:302:5: (lv_actions_24_0= ruleXmod_Action )
                    // InternalStateMachine.g:303:6: lv_actions_24_0= ruleXmod_Action
                    {

                    						newCompositeNode(grammarAccess.getStateMachineAccess().getActionsXmod_ActionParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_actions_24_0=ruleXmod_Action();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_24_0,
                    							"org.xtext.StateMachine.Xmod_Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalStateMachine.g:320:4: (otherlv_25= ',' ( (lv_actions_26_0= ruleXmod_Action ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==19) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalStateMachine.g:321:5: otherlv_25= ',' ( (lv_actions_26_0= ruleXmod_Action ) )
                    	    {
                    	    otherlv_25=(Token)match(input,19,FOLLOW_16); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getStateMachineAccess().getCommaKeyword_13_1_0());
                    	    				
                    	    // InternalStateMachine.g:325:5: ( (lv_actions_26_0= ruleXmod_Action ) )
                    	    // InternalStateMachine.g:326:6: (lv_actions_26_0= ruleXmod_Action )
                    	    {
                    	    // InternalStateMachine.g:326:6: (lv_actions_26_0= ruleXmod_Action )
                    	    // InternalStateMachine.g:327:7: lv_actions_26_0= ruleXmod_Action
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateMachineAccess().getActionsXmod_ActionParserRuleCall_13_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_actions_26_0=ruleXmod_Action();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_26_0,
                    	    								"org.xtext.StateMachine.Xmod_Action");
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

            otherlv_27=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // InternalStateMachine.g:354:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateMachine.g:354:46: (iv_ruleState= ruleState EOF )
            // InternalStateMachine.g:355:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateMachine.g:361:1: ruleState returns [EObject current=null] : (this_State_Impl_0= ruleState_Impl | this_StateMachine_1= ruleStateMachine | this_CompositeState_Impl_2= ruleCompositeState_Impl | this_InitialState_3= ruleInitialState | this_HistoryState_4= ruleHistoryState ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        EObject this_State_Impl_0 = null;

        EObject this_StateMachine_1 = null;

        EObject this_CompositeState_Impl_2 = null;

        EObject this_InitialState_3 = null;

        EObject this_HistoryState_4 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:367:2: ( (this_State_Impl_0= ruleState_Impl | this_StateMachine_1= ruleStateMachine | this_CompositeState_Impl_2= ruleCompositeState_Impl | this_InitialState_3= ruleInitialState | this_HistoryState_4= ruleHistoryState ) )
            // InternalStateMachine.g:368:2: (this_State_Impl_0= ruleState_Impl | this_StateMachine_1= ruleStateMachine | this_CompositeState_Impl_2= ruleCompositeState_Impl | this_InitialState_3= ruleInitialState | this_HistoryState_4= ruleHistoryState )
            {
            // InternalStateMachine.g:368:2: (this_State_Impl_0= ruleState_Impl | this_StateMachine_1= ruleStateMachine | this_CompositeState_Impl_2= ruleCompositeState_Impl | this_InitialState_3= ruleInitialState | this_HistoryState_4= ruleHistoryState )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 11:
                {
                alt9=2;
                }
                break;
            case 30:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case 24:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalStateMachine.g:369:3: this_State_Impl_0= ruleState_Impl
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getState_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_State_Impl_0=ruleState_Impl();

                    state._fsp--;


                    			current = this_State_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:378:3: this_StateMachine_1= ruleStateMachine
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getStateMachineParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StateMachine_1=ruleStateMachine();

                    state._fsp--;


                    			current = this_StateMachine_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalStateMachine.g:387:3: this_CompositeState_Impl_2= ruleCompositeState_Impl
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getCompositeState_ImplParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeState_Impl_2=ruleCompositeState_Impl();

                    state._fsp--;


                    			current = this_CompositeState_Impl_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalStateMachine.g:396:3: this_InitialState_3= ruleInitialState
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getInitialStateParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_InitialState_3=ruleInitialState();

                    state._fsp--;


                    			current = this_InitialState_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalStateMachine.g:405:3: this_HistoryState_4= ruleHistoryState
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getHistoryStateParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_HistoryState_4=ruleHistoryState();

                    state._fsp--;


                    			current = this_HistoryState_4;
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleState_Impl"
    // InternalStateMachine.g:417:1: entryRuleState_Impl returns [EObject current=null] : iv_ruleState_Impl= ruleState_Impl EOF ;
    public final EObject entryRuleState_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState_Impl = null;


        try {
            // InternalStateMachine.g:417:51: (iv_ruleState_Impl= ruleState_Impl EOF )
            // InternalStateMachine.g:418:2: iv_ruleState_Impl= ruleState_Impl EOF
            {
             newCompositeNode(grammarAccess.getState_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState_Impl=ruleState_Impl();

            state._fsp--;

             current =iv_ruleState_Impl; 
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
    // $ANTLR end "entryRuleState_Impl"


    // $ANTLR start "ruleState_Impl"
    // InternalStateMachine.g:424:1: ruleState_Impl returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( (lv_actions_3_0= ruleXmod_Action ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleXmod_Action ) ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleState_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_actions_5_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:430:2: ( (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( (lv_actions_3_0= ruleXmod_Action ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleXmod_Action ) ) )* otherlv_6= '}' )? ) )
            // InternalStateMachine.g:431:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( (lv_actions_3_0= ruleXmod_Action ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleXmod_Action ) ) )* otherlv_6= '}' )? )
            {
            // InternalStateMachine.g:431:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( (lv_actions_3_0= ruleXmod_Action ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleXmod_Action ) ) )* otherlv_6= '}' )? )
            // InternalStateMachine.g:432:3: otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '{' ( (lv_actions_3_0= ruleXmod_Action ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleXmod_Action ) ) )* otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getState_ImplAccess().getStateKeyword_0());
            		
            // InternalStateMachine.g:436:3: ( (lv_name_1_0= ruleEString ) )
            // InternalStateMachine.g:437:4: (lv_name_1_0= ruleEString )
            {
            // InternalStateMachine.g:437:4: (lv_name_1_0= ruleEString )
            // InternalStateMachine.g:438:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getState_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getState_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.StateMachine.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateMachine.g:455:3: (otherlv_2= '{' ( (lv_actions_3_0= ruleXmod_Action ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleXmod_Action ) ) )* otherlv_6= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalStateMachine.g:456:4: otherlv_2= '{' ( (lv_actions_3_0= ruleXmod_Action ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleXmod_Action ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getState_ImplAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalStateMachine.g:460:4: ( (lv_actions_3_0= ruleXmod_Action ) )
                    // InternalStateMachine.g:461:5: (lv_actions_3_0= ruleXmod_Action )
                    {
                    // InternalStateMachine.g:461:5: (lv_actions_3_0= ruleXmod_Action )
                    // InternalStateMachine.g:462:6: lv_actions_3_0= ruleXmod_Action
                    {

                    						newCompositeNode(grammarAccess.getState_ImplAccess().getActionsXmod_ActionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_actions_3_0=ruleXmod_Action();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getState_ImplRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_3_0,
                    							"org.xtext.StateMachine.Xmod_Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalStateMachine.g:479:4: (otherlv_4= ',' ( (lv_actions_5_0= ruleXmod_Action ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==19) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalStateMachine.g:480:5: otherlv_4= ',' ( (lv_actions_5_0= ruleXmod_Action ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_16); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getState_ImplAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalStateMachine.g:484:5: ( (lv_actions_5_0= ruleXmod_Action ) )
                    	    // InternalStateMachine.g:485:6: (lv_actions_5_0= ruleXmod_Action )
                    	    {
                    	    // InternalStateMachine.g:485:6: (lv_actions_5_0= ruleXmod_Action )
                    	    // InternalStateMachine.g:486:7: lv_actions_5_0= ruleXmod_Action
                    	    {

                    	    							newCompositeNode(grammarAccess.getState_ImplAccess().getActionsXmod_ActionParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_actions_5_0=ruleXmod_Action();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getState_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_5_0,
                    	    								"org.xtext.StateMachine.Xmod_Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getState_ImplAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleState_Impl"


    // $ANTLR start "entryRuleInitialState"
    // InternalStateMachine.g:513:1: entryRuleInitialState returns [EObject current=null] : iv_ruleInitialState= ruleInitialState EOF ;
    public final EObject entryRuleInitialState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialState = null;


        try {
            // InternalStateMachine.g:513:53: (iv_ruleInitialState= ruleInitialState EOF )
            // InternalStateMachine.g:514:2: iv_ruleInitialState= ruleInitialState EOF
            {
             newCompositeNode(grammarAccess.getInitialStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialState=ruleInitialState();

            state._fsp--;

             current =iv_ruleInitialState; 
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
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // InternalStateMachine.g:520:1: ruleInitialState returns [EObject current=null] : (otherlv_0= 'InitialState' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'references' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleInitialState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:526:2: ( (otherlv_0= 'InitialState' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'references' ( ( ruleEString ) ) )? ) )
            // InternalStateMachine.g:527:2: (otherlv_0= 'InitialState' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'references' ( ( ruleEString ) ) )? )
            {
            // InternalStateMachine.g:527:2: (otherlv_0= 'InitialState' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'references' ( ( ruleEString ) ) )? )
            // InternalStateMachine.g:528:3: otherlv_0= 'InitialState' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'references' ( ( ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialStateAccess().getInitialStateKeyword_0());
            		
            // InternalStateMachine.g:532:3: ( (lv_name_1_0= ruleEString ) )
            // InternalStateMachine.g:533:4: (lv_name_1_0= ruleEString )
            {
            // InternalStateMachine.g:533:4: (lv_name_1_0= ruleEString )
            // InternalStateMachine.g:534:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInitialStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.StateMachine.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateMachine.g:551:3: (otherlv_2= 'references' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalStateMachine.g:552:4: otherlv_2= 'references' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getInitialStateAccess().getReferencesKeyword_2_0());
                    			
                    // InternalStateMachine.g:556:4: ( ( ruleEString ) )
                    // InternalStateMachine.g:557:5: ( ruleEString )
                    {
                    // InternalStateMachine.g:557:5: ( ruleEString )
                    // InternalStateMachine.g:558:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInitialStateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInitialStateAccess().getReferencedStateStateCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


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
    // $ANTLR end "ruleInitialState"


    // $ANTLR start "entryRuleHistoryState"
    // InternalStateMachine.g:577:1: entryRuleHistoryState returns [EObject current=null] : iv_ruleHistoryState= ruleHistoryState EOF ;
    public final EObject entryRuleHistoryState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHistoryState = null;


        try {
            // InternalStateMachine.g:577:53: (iv_ruleHistoryState= ruleHistoryState EOF )
            // InternalStateMachine.g:578:2: iv_ruleHistoryState= ruleHistoryState EOF
            {
             newCompositeNode(grammarAccess.getHistoryStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHistoryState=ruleHistoryState();

            state._fsp--;

             current =iv_ruleHistoryState; 
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
    // $ANTLR end "entryRuleHistoryState"


    // $ANTLR start "ruleHistoryState"
    // InternalStateMachine.g:584:1: ruleHistoryState returns [EObject current=null] : (otherlv_0= 'HistoryState' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleHistoryState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:590:2: ( (otherlv_0= 'HistoryState' ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalStateMachine.g:591:2: (otherlv_0= 'HistoryState' ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalStateMachine.g:591:2: (otherlv_0= 'HistoryState' ( (lv_name_1_0= ruleEString ) ) )
            // InternalStateMachine.g:592:3: otherlv_0= 'HistoryState' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHistoryStateAccess().getHistoryStateKeyword_0());
            		
            // InternalStateMachine.g:596:3: ( (lv_name_1_0= ruleEString ) )
            // InternalStateMachine.g:597:4: (lv_name_1_0= ruleEString )
            {
            // InternalStateMachine.g:597:4: (lv_name_1_0= ruleEString )
            // InternalStateMachine.g:598:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHistoryStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHistoryStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.StateMachine.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleHistoryState"


    // $ANTLR start "entryRuleEvent"
    // InternalStateMachine.g:619:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalStateMachine.g:619:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalStateMachine.g:620:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalStateMachine.g:626:1: ruleEvent returns [EObject current=null] : ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:632:2: ( ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalStateMachine.g:633:2: ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalStateMachine.g:633:2: ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) )
            // InternalStateMachine.g:634:3: () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalStateMachine.g:634:3: ()
            // InternalStateMachine.g:635:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
            		
            // InternalStateMachine.g:645:3: ( (lv_name_2_0= ruleEString ) )
            // InternalStateMachine.g:646:4: (lv_name_2_0= ruleEString )
            {
            // InternalStateMachine.g:646:4: (lv_name_2_0= ruleEString )
            // InternalStateMachine.g:647:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.StateMachine.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleTransition"
    // InternalStateMachine.g:668:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStateMachine.g:668:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStateMachine.g:669:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalStateMachine.g:675:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( ( ruleEString ) ) otherlv_5= 'on' ( ( ruleEString ) ) (otherlv_7= '{' ( (lv_actions_8_0= ruleXmod_Action ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleXmod_Action ) ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_actions_8_0 = null;

        EObject lv_actions_10_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:681:2: ( (otherlv_0= 'Transition' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( ( ruleEString ) ) otherlv_5= 'on' ( ( ruleEString ) ) (otherlv_7= '{' ( (lv_actions_8_0= ruleXmod_Action ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleXmod_Action ) ) )* otherlv_11= '}' )? ) )
            // InternalStateMachine.g:682:2: (otherlv_0= 'Transition' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( ( ruleEString ) ) otherlv_5= 'on' ( ( ruleEString ) ) (otherlv_7= '{' ( (lv_actions_8_0= ruleXmod_Action ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleXmod_Action ) ) )* otherlv_11= '}' )? )
            {
            // InternalStateMachine.g:682:2: (otherlv_0= 'Transition' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( ( ruleEString ) ) otherlv_5= 'on' ( ( ruleEString ) ) (otherlv_7= '{' ( (lv_actions_8_0= ruleXmod_Action ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleXmod_Action ) ) )* otherlv_11= '}' )? )
            // InternalStateMachine.g:683:3: otherlv_0= 'Transition' otherlv_1= 'from' ( ( ruleEString ) ) otherlv_3= 'to' ( ( ruleEString ) ) otherlv_5= 'on' ( ( ruleEString ) ) (otherlv_7= '{' ( (lv_actions_8_0= ruleXmod_Action ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleXmod_Action ) ) )* otherlv_11= '}' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getFromKeyword_1());
            		
            // InternalStateMachine.g:691:3: ( ( ruleEString ) )
            // InternalStateMachine.g:692:4: ( ruleEString )
            {
            // InternalStateMachine.g:692:4: ( ruleEString )
            // InternalStateMachine.g:693:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_2_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getToKeyword_3());
            		
            // InternalStateMachine.g:711:3: ( ( ruleEString ) )
            // InternalStateMachine.g:712:4: ( ruleEString )
            {
            // InternalStateMachine.g:712:4: ( ruleEString )
            // InternalStateMachine.g:713:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getOnKeyword_5());
            		
            // InternalStateMachine.g:731:3: ( ( ruleEString ) )
            // InternalStateMachine.g:732:4: ( ruleEString )
            {
            // InternalStateMachine.g:732:4: ( ruleEString )
            // InternalStateMachine.g:733:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getEventEventCrossReference_6_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateMachine.g:747:3: (otherlv_7= '{' ( (lv_actions_8_0= ruleXmod_Action ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleXmod_Action ) ) )* otherlv_11= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalStateMachine.g:748:4: otherlv_7= '{' ( (lv_actions_8_0= ruleXmod_Action ) ) (otherlv_9= ',' ( (lv_actions_10_0= ruleXmod_Action ) ) )* otherlv_11= '}'
                    {
                    otherlv_7=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_7_0());
                    			
                    // InternalStateMachine.g:752:4: ( (lv_actions_8_0= ruleXmod_Action ) )
                    // InternalStateMachine.g:753:5: (lv_actions_8_0= ruleXmod_Action )
                    {
                    // InternalStateMachine.g:753:5: (lv_actions_8_0= ruleXmod_Action )
                    // InternalStateMachine.g:754:6: lv_actions_8_0= ruleXmod_Action
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getActionsXmod_ActionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_actions_8_0=ruleXmod_Action();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_8_0,
                    							"org.xtext.StateMachine.Xmod_Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalStateMachine.g:771:4: (otherlv_9= ',' ( (lv_actions_10_0= ruleXmod_Action ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==19) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalStateMachine.g:772:5: otherlv_9= ',' ( (lv_actions_10_0= ruleXmod_Action ) )
                    	    {
                    	    otherlv_9=(Token)match(input,19,FOLLOW_16); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalStateMachine.g:776:5: ( (lv_actions_10_0= ruleXmod_Action ) )
                    	    // InternalStateMachine.g:777:6: (lv_actions_10_0= ruleXmod_Action )
                    	    {
                    	    // InternalStateMachine.g:777:6: (lv_actions_10_0= ruleXmod_Action )
                    	    // InternalStateMachine.g:778:7: lv_actions_10_0= ruleXmod_Action
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransitionAccess().getActionsXmod_ActionParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_actions_10_0=ruleXmod_Action();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_10_0,
                    	    								"org.xtext.StateMachine.Xmod_Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleCompositeState_Impl"
    // InternalStateMachine.g:805:1: entryRuleCompositeState_Impl returns [EObject current=null] : iv_ruleCompositeState_Impl= ruleCompositeState_Impl EOF ;
    public final EObject entryRuleCompositeState_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeState_Impl = null;


        try {
            // InternalStateMachine.g:805:60: (iv_ruleCompositeState_Impl= ruleCompositeState_Impl EOF )
            // InternalStateMachine.g:806:2: iv_ruleCompositeState_Impl= ruleCompositeState_Impl EOF
            {
             newCompositeNode(grammarAccess.getCompositeState_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeState_Impl=ruleCompositeState_Impl();

            state._fsp--;

             current =iv_ruleCompositeState_Impl; 
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
    // $ANTLR end "entryRuleCompositeState_Impl"


    // $ANTLR start "ruleCompositeState_Impl"
    // InternalStateMachine.g:812:1: ruleCompositeState_Impl returns [EObject current=null] : (otherlv_0= 'CompositeState' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' otherlv_7= 'starts' otherlv_8= 'with' ( ( ruleEString ) ) (otherlv_10= 'historyState' ( ( ruleEString ) ) )? ( ( (lv_actions_12_0= ruleXmod_Action ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleXmod_Action ) ) )* )? otherlv_15= '}' ) ;
    public final EObject ruleCompositeState_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_states_5_0 = null;

        EObject lv_actions_12_0 = null;

        EObject lv_actions_14_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:818:2: ( (otherlv_0= 'CompositeState' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' otherlv_7= 'starts' otherlv_8= 'with' ( ( ruleEString ) ) (otherlv_10= 'historyState' ( ( ruleEString ) ) )? ( ( (lv_actions_12_0= ruleXmod_Action ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleXmod_Action ) ) )* )? otherlv_15= '}' ) )
            // InternalStateMachine.g:819:2: (otherlv_0= 'CompositeState' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' otherlv_7= 'starts' otherlv_8= 'with' ( ( ruleEString ) ) (otherlv_10= 'historyState' ( ( ruleEString ) ) )? ( ( (lv_actions_12_0= ruleXmod_Action ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleXmod_Action ) ) )* )? otherlv_15= '}' )
            {
            // InternalStateMachine.g:819:2: (otherlv_0= 'CompositeState' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' otherlv_7= 'starts' otherlv_8= 'with' ( ( ruleEString ) ) (otherlv_10= 'historyState' ( ( ruleEString ) ) )? ( ( (lv_actions_12_0= ruleXmod_Action ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleXmod_Action ) ) )* )? otherlv_15= '}' )
            // InternalStateMachine.g:820:3: otherlv_0= 'CompositeState' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' otherlv_7= 'starts' otherlv_8= 'with' ( ( ruleEString ) ) (otherlv_10= 'historyState' ( ( ruleEString ) ) )? ( ( (lv_actions_12_0= ruleXmod_Action ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleXmod_Action ) ) )* )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeState_ImplAccess().getCompositeStateKeyword_0());
            		
            // InternalStateMachine.g:824:3: ( (lv_name_1_0= ruleEString ) )
            // InternalStateMachine.g:825:4: (lv_name_1_0= ruleEString )
            {
            // InternalStateMachine.g:825:4: (lv_name_1_0= ruleEString )
            // InternalStateMachine.g:826:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeState_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.StateMachine.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeState_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositeState_ImplAccess().getStatesKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getCompositeState_ImplAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalStateMachine.g:855:3: ( (lv_states_5_0= ruleState ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==11||(LA15_0>=21 && LA15_0<=22)||LA15_0==24||LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalStateMachine.g:856:4: (lv_states_5_0= ruleState )
            	    {
            	    // InternalStateMachine.g:856:4: (lv_states_5_0= ruleState )
            	    // InternalStateMachine.g:857:5: lv_states_5_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getStatesStateParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_states_5_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompositeState_ImplRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_5_0,
            	    						"org.xtext.StateMachine.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getCompositeState_ImplAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getCompositeState_ImplAccess().getStartsKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getCompositeState_ImplAccess().getWithKeyword_8());
            		
            // InternalStateMachine.g:886:3: ( ( ruleEString ) )
            // InternalStateMachine.g:887:4: ( ruleEString )
            {
            // InternalStateMachine.g:887:4: ( ruleEString )
            // InternalStateMachine.g:888:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeState_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getInitialStateInitialStateCrossReference_9_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateMachine.g:902:3: (otherlv_10= 'historyState' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalStateMachine.g:903:4: otherlv_10= 'historyState' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getCompositeState_ImplAccess().getHistoryStateKeyword_10_0());
                    			
                    // InternalStateMachine.g:907:4: ( ( ruleEString ) )
                    // InternalStateMachine.g:908:5: ( ruleEString )
                    {
                    // InternalStateMachine.g:908:5: ( ruleEString )
                    // InternalStateMachine.g:909:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeState_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getHistoryStateHistoryStateCrossReference_10_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStateMachine.g:924:3: ( ( (lv_actions_12_0= ruleXmod_Action ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleXmod_Action ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalStateMachine.g:925:4: ( (lv_actions_12_0= ruleXmod_Action ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleXmod_Action ) ) )*
                    {
                    // InternalStateMachine.g:925:4: ( (lv_actions_12_0= ruleXmod_Action ) )
                    // InternalStateMachine.g:926:5: (lv_actions_12_0= ruleXmod_Action )
                    {
                    // InternalStateMachine.g:926:5: (lv_actions_12_0= ruleXmod_Action )
                    // InternalStateMachine.g:927:6: lv_actions_12_0= ruleXmod_Action
                    {

                    						newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getActionsXmod_ActionParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_actions_12_0=ruleXmod_Action();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeState_ImplRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_12_0,
                    							"org.xtext.StateMachine.Xmod_Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalStateMachine.g:944:4: (otherlv_13= ',' ( (lv_actions_14_0= ruleXmod_Action ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==19) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalStateMachine.g:945:5: otherlv_13= ',' ( (lv_actions_14_0= ruleXmod_Action ) )
                    	    {
                    	    otherlv_13=(Token)match(input,19,FOLLOW_16); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getCompositeState_ImplAccess().getCommaKeyword_11_1_0());
                    	    				
                    	    // InternalStateMachine.g:949:5: ( (lv_actions_14_0= ruleXmod_Action ) )
                    	    // InternalStateMachine.g:950:6: (lv_actions_14_0= ruleXmod_Action )
                    	    {
                    	    // InternalStateMachine.g:950:6: (lv_actions_14_0= ruleXmod_Action )
                    	    // InternalStateMachine.g:951:7: lv_actions_14_0= ruleXmod_Action
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeState_ImplAccess().getActionsXmod_ActionParserRuleCall_11_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_actions_14_0=ruleXmod_Action();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeState_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_14_0,
                    	    								"org.xtext.StateMachine.Xmod_Action");
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

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getCompositeState_ImplAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleCompositeState_Impl"


    // $ANTLR start "entryRuleXmod_Action"
    // InternalStateMachine.g:978:1: entryRuleXmod_Action returns [EObject current=null] : iv_ruleXmod_Action= ruleXmod_Action EOF ;
    public final EObject entryRuleXmod_Action() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmod_Action = null;


        try {
            // InternalStateMachine.g:978:52: (iv_ruleXmod_Action= ruleXmod_Action EOF )
            // InternalStateMachine.g:979:2: iv_ruleXmod_Action= ruleXmod_Action EOF
            {
             newCompositeNode(grammarAccess.getXmod_ActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXmod_Action=ruleXmod_Action();

            state._fsp--;

             current =iv_ruleXmod_Action; 
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
    // $ANTLR end "entryRuleXmod_Action"


    // $ANTLR start "ruleXmod_Action"
    // InternalStateMachine.g:985:1: ruleXmod_Action returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleXmod_OperationCall ) ) ( (lv_operations_4_0= ruleXmod_OperationCall ) )* otherlv_5= '}' ) ;
    public final EObject ruleXmod_Action() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_operations_3_0 = null;

        EObject lv_operations_4_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:991:2: ( (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleXmod_OperationCall ) ) ( (lv_operations_4_0= ruleXmod_OperationCall ) )* otherlv_5= '}' ) )
            // InternalStateMachine.g:992:2: (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleXmod_OperationCall ) ) ( (lv_operations_4_0= ruleXmod_OperationCall ) )* otherlv_5= '}' )
            {
            // InternalStateMachine.g:992:2: (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleXmod_OperationCall ) ) ( (lv_operations_4_0= ruleXmod_OperationCall ) )* otherlv_5= '}' )
            // InternalStateMachine.g:993:3: otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleXmod_OperationCall ) ) ( (lv_operations_4_0= ruleXmod_OperationCall ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getXmod_ActionAccess().getActionKeyword_0());
            		
            // InternalStateMachine.g:997:3: ( (lv_name_1_0= ruleEString ) )
            // InternalStateMachine.g:998:4: (lv_name_1_0= ruleEString )
            {
            // InternalStateMachine.g:998:4: (lv_name_1_0= ruleEString )
            // InternalStateMachine.g:999:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getXmod_ActionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXmod_ActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.StateMachine.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getXmod_ActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStateMachine.g:1020:3: ( (lv_operations_3_0= ruleXmod_OperationCall ) )
            // InternalStateMachine.g:1021:4: (lv_operations_3_0= ruleXmod_OperationCall )
            {
            // InternalStateMachine.g:1021:4: (lv_operations_3_0= ruleXmod_OperationCall )
            // InternalStateMachine.g:1022:5: lv_operations_3_0= ruleXmod_OperationCall
            {

            					newCompositeNode(grammarAccess.getXmod_ActionAccess().getOperationsXmod_OperationCallParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_operations_3_0=ruleXmod_OperationCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXmod_ActionRule());
            					}
            					add(
            						current,
            						"operations",
            						lv_operations_3_0,
            						"org.xtext.StateMachine.Xmod_OperationCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateMachine.g:1039:3: ( (lv_operations_4_0= ruleXmod_OperationCall ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalStateMachine.g:1040:4: (lv_operations_4_0= ruleXmod_OperationCall )
            	    {
            	    // InternalStateMachine.g:1040:4: (lv_operations_4_0= ruleXmod_OperationCall )
            	    // InternalStateMachine.g:1041:5: lv_operations_4_0= ruleXmod_OperationCall
            	    {

            	    					newCompositeNode(grammarAccess.getXmod_ActionAccess().getOperationsXmod_OperationCallParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_operations_4_0=ruleXmod_OperationCall();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXmod_ActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_4_0,
            	    						"org.xtext.StateMachine.Xmod_OperationCall");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getXmod_ActionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleXmod_Action"


    // $ANTLR start "entryRuleXmod_OperationDef"
    // InternalStateMachine.g:1066:1: entryRuleXmod_OperationDef returns [EObject current=null] : iv_ruleXmod_OperationDef= ruleXmod_OperationDef EOF ;
    public final EObject entryRuleXmod_OperationDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmod_OperationDef = null;


        try {
            // InternalStateMachine.g:1066:58: (iv_ruleXmod_OperationDef= ruleXmod_OperationDef EOF )
            // InternalStateMachine.g:1067:2: iv_ruleXmod_OperationDef= ruleXmod_OperationDef EOF
            {
             newCompositeNode(grammarAccess.getXmod_OperationDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXmod_OperationDef=ruleXmod_OperationDef();

            state._fsp--;

             current =iv_ruleXmod_OperationDef; 
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
    // $ANTLR end "entryRuleXmod_OperationDef"


    // $ANTLR start "ruleXmod_OperationDef"
    // InternalStateMachine.g:1073:1: ruleXmod_OperationDef returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_parametersTag_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) ) )* )? otherlv_5= ')' otherlv_6= 'on' ( (lv_objectTag_7_0= ruleEString ) ) (otherlv_8= 'returns' ( (lv_returnTag_9_0= ruleEString ) ) )? ( ( (lv_exceptions_10_0= ruleXmod_Exception ) ) ( (lv_exceptions_11_0= ruleXmod_Exception ) )* )? ) ;
    public final EObject ruleXmod_OperationDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_parametersTag_2_0 = null;

        AntlrDatatypeRuleToken lv_parametersTag_4_0 = null;

        AntlrDatatypeRuleToken lv_objectTag_7_0 = null;

        AntlrDatatypeRuleToken lv_returnTag_9_0 = null;

        EObject lv_exceptions_10_0 = null;

        EObject lv_exceptions_11_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1079:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_parametersTag_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) ) )* )? otherlv_5= ')' otherlv_6= 'on' ( (lv_objectTag_7_0= ruleEString ) ) (otherlv_8= 'returns' ( (lv_returnTag_9_0= ruleEString ) ) )? ( ( (lv_exceptions_10_0= ruleXmod_Exception ) ) ( (lv_exceptions_11_0= ruleXmod_Exception ) )* )? ) )
            // InternalStateMachine.g:1080:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_parametersTag_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) ) )* )? otherlv_5= ')' otherlv_6= 'on' ( (lv_objectTag_7_0= ruleEString ) ) (otherlv_8= 'returns' ( (lv_returnTag_9_0= ruleEString ) ) )? ( ( (lv_exceptions_10_0= ruleXmod_Exception ) ) ( (lv_exceptions_11_0= ruleXmod_Exception ) )* )? )
            {
            // InternalStateMachine.g:1080:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_parametersTag_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) ) )* )? otherlv_5= ')' otherlv_6= 'on' ( (lv_objectTag_7_0= ruleEString ) ) (otherlv_8= 'returns' ( (lv_returnTag_9_0= ruleEString ) ) )? ( ( (lv_exceptions_10_0= ruleXmod_Exception ) ) ( (lv_exceptions_11_0= ruleXmod_Exception ) )* )? )
            // InternalStateMachine.g:1081:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_parametersTag_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) ) )* )? otherlv_5= ')' otherlv_6= 'on' ( (lv_objectTag_7_0= ruleEString ) ) (otherlv_8= 'returns' ( (lv_returnTag_9_0= ruleEString ) ) )? ( ( (lv_exceptions_10_0= ruleXmod_Exception ) ) ( (lv_exceptions_11_0= ruleXmod_Exception ) )* )?
            {
            // InternalStateMachine.g:1081:3: ( (lv_name_0_0= ruleEString ) )
            // InternalStateMachine.g:1082:4: (lv_name_0_0= ruleEString )
            {
            // InternalStateMachine.g:1082:4: (lv_name_0_0= ruleEString )
            // InternalStateMachine.g:1083:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getXmod_OperationDefAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXmod_OperationDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.StateMachine.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getXmod_OperationDefAccess().getLeftParenthesisKeyword_1());
            		
            // InternalStateMachine.g:1104:3: ( ( (lv_parametersTag_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalStateMachine.g:1105:4: ( (lv_parametersTag_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) ) )*
                    {
                    // InternalStateMachine.g:1105:4: ( (lv_parametersTag_2_0= ruleEString ) )
                    // InternalStateMachine.g:1106:5: (lv_parametersTag_2_0= ruleEString )
                    {
                    // InternalStateMachine.g:1106:5: (lv_parametersTag_2_0= ruleEString )
                    // InternalStateMachine.g:1107:6: lv_parametersTag_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getXmod_OperationDefAccess().getParametersTagEStringParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_parametersTag_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXmod_OperationDefRule());
                    						}
                    						add(
                    							current,
                    							"parametersTag",
                    							lv_parametersTag_2_0,
                    							"org.xtext.StateMachine.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalStateMachine.g:1124:4: (otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==19) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalStateMachine.g:1125:5: otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getXmod_OperationDefAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalStateMachine.g:1129:5: ( (lv_parametersTag_4_0= ruleEString ) )
                    	    // InternalStateMachine.g:1130:6: (lv_parametersTag_4_0= ruleEString )
                    	    {
                    	    // InternalStateMachine.g:1130:6: (lv_parametersTag_4_0= ruleEString )
                    	    // InternalStateMachine.g:1131:7: lv_parametersTag_4_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getXmod_OperationDefAccess().getParametersTagEStringParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_parametersTag_4_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXmod_OperationDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parametersTag",
                    	    								lv_parametersTag_4_0,
                    	    								"org.xtext.StateMachine.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,33,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getXmod_OperationDefAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getXmod_OperationDefAccess().getOnKeyword_4());
            		
            // InternalStateMachine.g:1158:3: ( (lv_objectTag_7_0= ruleEString ) )
            // InternalStateMachine.g:1159:4: (lv_objectTag_7_0= ruleEString )
            {
            // InternalStateMachine.g:1159:4: (lv_objectTag_7_0= ruleEString )
            // InternalStateMachine.g:1160:5: lv_objectTag_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getXmod_OperationDefAccess().getObjectTagEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_28);
            lv_objectTag_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXmod_OperationDefRule());
            					}
            					set(
            						current,
            						"objectTag",
            						lv_objectTag_7_0,
            						"org.xtext.StateMachine.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateMachine.g:1177:3: (otherlv_8= 'returns' ( (lv_returnTag_9_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalStateMachine.g:1178:4: otherlv_8= 'returns' ( (lv_returnTag_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getXmod_OperationDefAccess().getReturnsKeyword_6_0());
                    			
                    // InternalStateMachine.g:1182:4: ( (lv_returnTag_9_0= ruleEString ) )
                    // InternalStateMachine.g:1183:5: (lv_returnTag_9_0= ruleEString )
                    {
                    // InternalStateMachine.g:1183:5: (lv_returnTag_9_0= ruleEString )
                    // InternalStateMachine.g:1184:6: lv_returnTag_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getXmod_OperationDefAccess().getReturnTagEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_returnTag_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXmod_OperationDefRule());
                    						}
                    						set(
                    							current,
                    							"returnTag",
                    							lv_returnTag_9_0,
                    							"org.xtext.StateMachine.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalStateMachine.g:1202:3: ( ( (lv_exceptions_10_0= ruleXmod_Exception ) ) ( (lv_exceptions_11_0= ruleXmod_Exception ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalStateMachine.g:1203:4: ( (lv_exceptions_10_0= ruleXmod_Exception ) ) ( (lv_exceptions_11_0= ruleXmod_Exception ) )*
                    {
                    // InternalStateMachine.g:1203:4: ( (lv_exceptions_10_0= ruleXmod_Exception ) )
                    // InternalStateMachine.g:1204:5: (lv_exceptions_10_0= ruleXmod_Exception )
                    {
                    // InternalStateMachine.g:1204:5: (lv_exceptions_10_0= ruleXmod_Exception )
                    // InternalStateMachine.g:1205:6: lv_exceptions_10_0= ruleXmod_Exception
                    {

                    						newCompositeNode(grammarAccess.getXmod_OperationDefAccess().getExceptionsXmod_ExceptionParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_exceptions_10_0=ruleXmod_Exception();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXmod_OperationDefRule());
                    						}
                    						add(
                    							current,
                    							"exceptions",
                    							lv_exceptions_10_0,
                    							"org.xtext.StateMachine.Xmod_Exception");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalStateMachine.g:1222:4: ( (lv_exceptions_11_0= ruleXmod_Exception ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==37) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalStateMachine.g:1223:5: (lv_exceptions_11_0= ruleXmod_Exception )
                    	    {
                    	    // InternalStateMachine.g:1223:5: (lv_exceptions_11_0= ruleXmod_Exception )
                    	    // InternalStateMachine.g:1224:6: lv_exceptions_11_0= ruleXmod_Exception
                    	    {

                    	    						newCompositeNode(grammarAccess.getXmod_OperationDefAccess().getExceptionsXmod_ExceptionParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_29);
                    	    lv_exceptions_11_0=ruleXmod_Exception();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXmod_OperationDefRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"exceptions",
                    	    							lv_exceptions_11_0,
                    	    							"org.xtext.StateMachine.Xmod_Exception");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


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
    // $ANTLR end "ruleXmod_OperationDef"


    // $ANTLR start "entryRuleXmod_OperationCall"
    // InternalStateMachine.g:1246:1: entryRuleXmod_OperationCall returns [EObject current=null] : iv_ruleXmod_OperationCall= ruleXmod_OperationCall EOF ;
    public final EObject entryRuleXmod_OperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmod_OperationCall = null;


        try {
            // InternalStateMachine.g:1246:59: (iv_ruleXmod_OperationCall= ruleXmod_OperationCall EOF )
            // InternalStateMachine.g:1247:2: iv_ruleXmod_OperationCall= ruleXmod_OperationCall EOF
            {
             newCompositeNode(grammarAccess.getXmod_OperationCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXmod_OperationCall=ruleXmod_OperationCall();

            state._fsp--;

             current =iv_ruleXmod_OperationCall; 
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
    // $ANTLR end "entryRuleXmod_OperationCall"


    // $ANTLR start "ruleXmod_OperationCall"
    // InternalStateMachine.g:1253:1: ruleXmod_OperationCall returns [EObject current=null] : (otherlv_0= 'call' this_Xmod_OperationDef_1= ruleXmod_OperationDef otherlv_2= ';' ) ;
    public final EObject ruleXmod_OperationCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Xmod_OperationDef_1 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1259:2: ( (otherlv_0= 'call' this_Xmod_OperationDef_1= ruleXmod_OperationDef otherlv_2= ';' ) )
            // InternalStateMachine.g:1260:2: (otherlv_0= 'call' this_Xmod_OperationDef_1= ruleXmod_OperationDef otherlv_2= ';' )
            {
            // InternalStateMachine.g:1260:2: (otherlv_0= 'call' this_Xmod_OperationDef_1= ruleXmod_OperationDef otherlv_2= ';' )
            // InternalStateMachine.g:1261:3: otherlv_0= 'call' this_Xmod_OperationDef_1= ruleXmod_OperationDef otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getXmod_OperationCallAccess().getCallKeyword_0());
            		

            			newCompositeNode(grammarAccess.getXmod_OperationCallAccess().getXmod_OperationDefParserRuleCall_1());
            		
            pushFollow(FOLLOW_30);
            this_Xmod_OperationDef_1=ruleXmod_OperationDef();

            state._fsp--;


            			current = this_Xmod_OperationDef_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getXmod_OperationCallAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleXmod_OperationCall"


    // $ANTLR start "entryRuleXmod_Exception"
    // InternalStateMachine.g:1281:1: entryRuleXmod_Exception returns [EObject current=null] : iv_ruleXmod_Exception= ruleXmod_Exception EOF ;
    public final EObject entryRuleXmod_Exception() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmod_Exception = null;


        try {
            // InternalStateMachine.g:1281:55: (iv_ruleXmod_Exception= ruleXmod_Exception EOF )
            // InternalStateMachine.g:1282:2: iv_ruleXmod_Exception= ruleXmod_Exception EOF
            {
             newCompositeNode(grammarAccess.getXmod_ExceptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXmod_Exception=ruleXmod_Exception();

            state._fsp--;

             current =iv_ruleXmod_Exception; 
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
    // $ANTLR end "entryRuleXmod_Exception"


    // $ANTLR start "ruleXmod_Exception"
    // InternalStateMachine.g:1288:1: ruleXmod_Exception returns [EObject current=null] : (otherlv_0= 'onError' ( ( (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered ) ) | ( ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')' ) ) (otherlv_6= 'call' ( (lv_calledOperation_7_0= ruleXmod_OperationDef ) ) )? otherlv_8= 'then' ( (lv_reaction_9_0= ruleXmod_ExceptionReaction ) ) ) ;
    public final EObject ruleXmod_Exception() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_kind_1_0 = null;

        AntlrDatatypeRuleToken lv_kind_2_0 = null;

        AntlrDatatypeRuleToken lv_filter_4_0 = null;

        EObject lv_calledOperation_7_0 = null;

        Enumerator lv_reaction_9_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:1294:2: ( (otherlv_0= 'onError' ( ( (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered ) ) | ( ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')' ) ) (otherlv_6= 'call' ( (lv_calledOperation_7_0= ruleXmod_OperationDef ) ) )? otherlv_8= 'then' ( (lv_reaction_9_0= ruleXmod_ExceptionReaction ) ) ) )
            // InternalStateMachine.g:1295:2: (otherlv_0= 'onError' ( ( (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered ) ) | ( ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')' ) ) (otherlv_6= 'call' ( (lv_calledOperation_7_0= ruleXmod_OperationDef ) ) )? otherlv_8= 'then' ( (lv_reaction_9_0= ruleXmod_ExceptionReaction ) ) )
            {
            // InternalStateMachine.g:1295:2: (otherlv_0= 'onError' ( ( (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered ) ) | ( ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')' ) ) (otherlv_6= 'call' ( (lv_calledOperation_7_0= ruleXmod_OperationDef ) ) )? otherlv_8= 'then' ( (lv_reaction_9_0= ruleXmod_ExceptionReaction ) ) )
            // InternalStateMachine.g:1296:3: otherlv_0= 'onError' ( ( (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered ) ) | ( ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')' ) ) (otherlv_6= 'call' ( (lv_calledOperation_7_0= ruleXmod_OperationDef ) ) )? otherlv_8= 'then' ( (lv_reaction_9_0= ruleXmod_ExceptionReaction ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getXmod_ExceptionAccess().getOnErrorKeyword_0());
            		
            // InternalStateMachine.g:1300:3: ( ( (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered ) ) | ( ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=40 && LA25_0<=45)) ) {
                alt25=1;
            }
            else if ( (LA25_0==39) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalStateMachine.g:1301:4: ( (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered ) )
                    {
                    // InternalStateMachine.g:1301:4: ( (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered ) )
                    // InternalStateMachine.g:1302:5: (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered )
                    {
                    // InternalStateMachine.g:1302:5: (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered )
                    // InternalStateMachine.g:1303:6: lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered
                    {

                    						newCompositeNode(grammarAccess.getXmod_ExceptionAccess().getKindXmod_ExceptionKind_UnfilteredParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_kind_1_0=ruleXmod_ExceptionKind_Unfiltered();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXmod_ExceptionRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_1_0,
                    							"org.xtext.StateMachine.Xmod_ExceptionKind_Unfiltered");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:1321:4: ( ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')' )
                    {
                    // InternalStateMachine.g:1321:4: ( ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')' )
                    // InternalStateMachine.g:1322:5: ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')'
                    {
                    // InternalStateMachine.g:1322:5: ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) )
                    // InternalStateMachine.g:1323:6: (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered )
                    {
                    // InternalStateMachine.g:1323:6: (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered )
                    // InternalStateMachine.g:1324:7: lv_kind_2_0= ruleXmod_ExceptionKind_Filtered
                    {

                    							newCompositeNode(grammarAccess.getXmod_ExceptionAccess().getKindXmod_ExceptionKind_FilteredParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_25);
                    lv_kind_2_0=ruleXmod_ExceptionKind_Filtered();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getXmod_ExceptionRule());
                    							}
                    							set(
                    								current,
                    								"kind",
                    								lv_kind_2_0,
                    								"org.xtext.StateMachine.Xmod_ExceptionKind_Filtered");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,32,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getXmod_ExceptionAccess().getLeftParenthesisKeyword_1_1_1());
                    				
                    // InternalStateMachine.g:1345:5: ( (lv_filter_4_0= ruleEString ) )
                    // InternalStateMachine.g:1346:6: (lv_filter_4_0= ruleEString )
                    {
                    // InternalStateMachine.g:1346:6: (lv_filter_4_0= ruleEString )
                    // InternalStateMachine.g:1347:7: lv_filter_4_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getXmod_ExceptionAccess().getFilterEStringParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_33);
                    lv_filter_4_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getXmod_ExceptionRule());
                    							}
                    							set(
                    								current,
                    								"filter",
                    								lv_filter_4_0,
                    								"org.xtext.StateMachine.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,33,FOLLOW_32); 

                    					newLeafNode(otherlv_5, grammarAccess.getXmod_ExceptionAccess().getRightParenthesisKeyword_1_1_3());
                    				

                    }


                    }
                    break;

            }

            // InternalStateMachine.g:1370:3: (otherlv_6= 'call' ( (lv_calledOperation_7_0= ruleXmod_OperationDef ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalStateMachine.g:1371:4: otherlv_6= 'call' ( (lv_calledOperation_7_0= ruleXmod_OperationDef ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getXmod_ExceptionAccess().getCallKeyword_2_0());
                    			
                    // InternalStateMachine.g:1375:4: ( (lv_calledOperation_7_0= ruleXmod_OperationDef ) )
                    // InternalStateMachine.g:1376:5: (lv_calledOperation_7_0= ruleXmod_OperationDef )
                    {
                    // InternalStateMachine.g:1376:5: (lv_calledOperation_7_0= ruleXmod_OperationDef )
                    // InternalStateMachine.g:1377:6: lv_calledOperation_7_0= ruleXmod_OperationDef
                    {

                    						newCompositeNode(grammarAccess.getXmod_ExceptionAccess().getCalledOperationXmod_OperationDefParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_calledOperation_7_0=ruleXmod_OperationDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXmod_ExceptionRule());
                    						}
                    						set(
                    							current,
                    							"calledOperation",
                    							lv_calledOperation_7_0,
                    							"org.xtext.StateMachine.Xmod_OperationDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,38,FOLLOW_35); 

            			newLeafNode(otherlv_8, grammarAccess.getXmod_ExceptionAccess().getThenKeyword_3());
            		
            // InternalStateMachine.g:1399:3: ( (lv_reaction_9_0= ruleXmod_ExceptionReaction ) )
            // InternalStateMachine.g:1400:4: (lv_reaction_9_0= ruleXmod_ExceptionReaction )
            {
            // InternalStateMachine.g:1400:4: (lv_reaction_9_0= ruleXmod_ExceptionReaction )
            // InternalStateMachine.g:1401:5: lv_reaction_9_0= ruleXmod_ExceptionReaction
            {

            					newCompositeNode(grammarAccess.getXmod_ExceptionAccess().getReactionXmod_ExceptionReactionEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_reaction_9_0=ruleXmod_ExceptionReaction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXmod_ExceptionRule());
            					}
            					set(
            						current,
            						"reaction",
            						lv_reaction_9_0,
            						"org.xtext.StateMachine.Xmod_ExceptionReaction");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleXmod_Exception"


    // $ANTLR start "entryRuleXmod_ExceptionKind_Filtered"
    // InternalStateMachine.g:1422:1: entryRuleXmod_ExceptionKind_Filtered returns [String current=null] : iv_ruleXmod_ExceptionKind_Filtered= ruleXmod_ExceptionKind_Filtered EOF ;
    public final String entryRuleXmod_ExceptionKind_Filtered() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXmod_ExceptionKind_Filtered = null;


        try {
            // InternalStateMachine.g:1422:67: (iv_ruleXmod_ExceptionKind_Filtered= ruleXmod_ExceptionKind_Filtered EOF )
            // InternalStateMachine.g:1423:2: iv_ruleXmod_ExceptionKind_Filtered= ruleXmod_ExceptionKind_Filtered EOF
            {
             newCompositeNode(grammarAccess.getXmod_ExceptionKind_FilteredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXmod_ExceptionKind_Filtered=ruleXmod_ExceptionKind_Filtered();

            state._fsp--;

             current =iv_ruleXmod_ExceptionKind_Filtered.getText(); 
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
    // $ANTLR end "entryRuleXmod_ExceptionKind_Filtered"


    // $ANTLR start "ruleXmod_ExceptionKind_Filtered"
    // InternalStateMachine.g:1429:1: ruleXmod_ExceptionKind_Filtered returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'methodException' ;
    public final AntlrDatatypeRuleToken ruleXmod_ExceptionKind_Filtered() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalStateMachine.g:1435:2: (kw= 'methodException' )
            // InternalStateMachine.g:1436:2: kw= 'methodException'
            {
            kw=(Token)match(input,39,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getXmod_ExceptionKind_FilteredAccess().getMethodExceptionKeyword());
            	

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
    // $ANTLR end "ruleXmod_ExceptionKind_Filtered"


    // $ANTLR start "entryRuleXmod_ExceptionKind_Unfiltered"
    // InternalStateMachine.g:1444:1: entryRuleXmod_ExceptionKind_Unfiltered returns [String current=null] : iv_ruleXmod_ExceptionKind_Unfiltered= ruleXmod_ExceptionKind_Unfiltered EOF ;
    public final String entryRuleXmod_ExceptionKind_Unfiltered() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXmod_ExceptionKind_Unfiltered = null;


        try {
            // InternalStateMachine.g:1444:69: (iv_ruleXmod_ExceptionKind_Unfiltered= ruleXmod_ExceptionKind_Unfiltered EOF )
            // InternalStateMachine.g:1445:2: iv_ruleXmod_ExceptionKind_Unfiltered= ruleXmod_ExceptionKind_Unfiltered EOF
            {
             newCompositeNode(grammarAccess.getXmod_ExceptionKind_UnfilteredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXmod_ExceptionKind_Unfiltered=ruleXmod_ExceptionKind_Unfiltered();

            state._fsp--;

             current =iv_ruleXmod_ExceptionKind_Unfiltered.getText(); 
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
    // $ANTLR end "entryRuleXmod_ExceptionKind_Unfiltered"


    // $ANTLR start "ruleXmod_ExceptionKind_Unfiltered"
    // InternalStateMachine.g:1451:1: ruleXmod_ExceptionKind_Unfiltered returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'other' | kw= 'unknownNamespace' | kw= 'objectNotFound' | kw= 'methodNotFound' | kw= 'parametersNotMatching' | kw= 'returnTypeNotMatching' ) ;
    public final AntlrDatatypeRuleToken ruleXmod_ExceptionKind_Unfiltered() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalStateMachine.g:1457:2: ( (kw= 'other' | kw= 'unknownNamespace' | kw= 'objectNotFound' | kw= 'methodNotFound' | kw= 'parametersNotMatching' | kw= 'returnTypeNotMatching' ) )
            // InternalStateMachine.g:1458:2: (kw= 'other' | kw= 'unknownNamespace' | kw= 'objectNotFound' | kw= 'methodNotFound' | kw= 'parametersNotMatching' | kw= 'returnTypeNotMatching' )
            {
            // InternalStateMachine.g:1458:2: (kw= 'other' | kw= 'unknownNamespace' | kw= 'objectNotFound' | kw= 'methodNotFound' | kw= 'parametersNotMatching' | kw= 'returnTypeNotMatching' )
            int alt27=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt27=1;
                }
                break;
            case 41:
                {
                alt27=2;
                }
                break;
            case 42:
                {
                alt27=3;
                }
                break;
            case 43:
                {
                alt27=4;
                }
                break;
            case 44:
                {
                alt27=5;
                }
                break;
            case 45:
                {
                alt27=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalStateMachine.g:1459:3: kw= 'other'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getOtherKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:1465:3: kw= 'unknownNamespace'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getUnknownNamespaceKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalStateMachine.g:1471:3: kw= 'objectNotFound'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getObjectNotFoundKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalStateMachine.g:1477:3: kw= 'methodNotFound'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getMethodNotFoundKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalStateMachine.g:1483:3: kw= 'parametersNotMatching'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getParametersNotMatchingKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalStateMachine.g:1489:3: kw= 'returnTypeNotMatching'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getReturnTypeNotMatchingKeyword_5());
                    		

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
    // $ANTLR end "ruleXmod_ExceptionKind_Unfiltered"


    // $ANTLR start "entryRuleEString"
    // InternalStateMachine.g:1498:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalStateMachine.g:1498:47: (iv_ruleEString= ruleEString EOF )
            // InternalStateMachine.g:1499:2: iv_ruleEString= ruleEString EOF
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
    // InternalStateMachine.g:1505:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalStateMachine.g:1511:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalStateMachine.g:1512:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalStateMachine.g:1512:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalStateMachine.g:1513:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:1521:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleXmod_ExceptionReaction"
    // InternalStateMachine.g:1532:1: ruleXmod_ExceptionReaction returns [Enumerator current=null] : ( (enumLiteral_0= 'continue' ) | (enumLiteral_1= 'skip' ) | (enumLiteral_2= 'exit' ) ) ;
    public final Enumerator ruleXmod_ExceptionReaction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalStateMachine.g:1538:2: ( ( (enumLiteral_0= 'continue' ) | (enumLiteral_1= 'skip' ) | (enumLiteral_2= 'exit' ) ) )
            // InternalStateMachine.g:1539:2: ( (enumLiteral_0= 'continue' ) | (enumLiteral_1= 'skip' ) | (enumLiteral_2= 'exit' ) )
            {
            // InternalStateMachine.g:1539:2: ( (enumLiteral_0= 'continue' ) | (enumLiteral_1= 'skip' ) | (enumLiteral_2= 'exit' ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt29=1;
                }
                break;
            case 47:
                {
                alt29=2;
                }
                break;
            case 48:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalStateMachine.g:1540:3: (enumLiteral_0= 'continue' )
                    {
                    // InternalStateMachine.g:1540:3: (enumLiteral_0= 'continue' )
                    // InternalStateMachine.g:1541:4: enumLiteral_0= 'continue'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getXmod_ExceptionReactionAccess().getContinueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getXmod_ExceptionReactionAccess().getContinueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:1548:3: (enumLiteral_1= 'skip' )
                    {
                    // InternalStateMachine.g:1548:3: (enumLiteral_1= 'skip' )
                    // InternalStateMachine.g:1549:4: enumLiteral_1= 'skip'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getXmod_ExceptionReactionAccess().getSkipEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getXmod_ExceptionReactionAccess().getSkipEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalStateMachine.g:1556:3: (enumLiteral_2= 'exit' )
                    {
                    // InternalStateMachine.g:1556:3: (enumLiteral_2= 'exit' )
                    // InternalStateMachine.g:1557:4: enumLiteral_2= 'exit'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getXmod_ExceptionReactionAccess().getExitEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getXmod_ExceptionReactionAccess().getExitEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleXmod_ExceptionReaction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000041604800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080164000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080144000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080104000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080024000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002400000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00003F8000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001C00000000000L});

}