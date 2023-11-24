class Test {
    public class Example {
    public void gen(TokenRefElement atom) {
    	if ( DEBUG_CODE_GENERATOR ) System.out.println("genTokenRef("+atom+")");
    	if ( grammar instanceof LexerGrammar ) {
    	    tool.panic("Token reference found in lexer");
    	}
    	genErrorTryForElement(atom);
    	// Assign Token value to token label variable
    	if ( atom.getLabel()!=null && syntacticPredLevel == 0) {
    	    println(atom.getLabel() + " = " + lt1Value + ";");
    	}
    
    	// AST
    	genElementAST(atom);
    	// matching
    	genMatch(atom);
    	genErrorCatchForElement(atom);
    		
    	// tack on tree cursor motion if doing a tree walker
    	if (grammar instanceof TreeWalkerGrammar) {
    	    println("_t = _t.getNextSibling();");
    	}
        }
        public static com.liferay.commerce.model.CommerceShipmentItem deleteCommerceShipmentItem(
    		long commerceShipmentItemId)
    		throws com.liferay.portal.kernel.exception.PortalException {
    		return getService().deleteCommerceShipmentItem(commerceShipmentItemId);
    	}
        private static Group < ? > addSyncQueuesAndBarrier ( Group < ? > self , String name , List < ? > dependencies ) {
      self . syncQueueCounter ++ ;
      synchronized ( syncQueueDevices ) {
        List < SyncQueue < ? >> syncQueues = new ArrayList < SyncQueue < ? >> ( ) ;
        for ( int i = 0 ;
        i < syncQueues . size ( ) ;
        i ++ ) {
          syncQueues . add ( new SyncQueue < SyncQueue < ? >> ( i , new LinkedBlockingQueue < SyncQueue < ? >> ( ) , new HashSet < SyncQueue < ? >> ( ) , new SharedWorkQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < ? >>>> ( ) ) ) ;
        }
        List < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < ? >>>> > queueOps = new ArrayList < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue < SyncQueue ;
        SyncQueue < SyncQueue < SyncQueue . SyncQueue >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    }
}