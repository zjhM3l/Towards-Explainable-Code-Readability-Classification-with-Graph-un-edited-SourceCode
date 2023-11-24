class Test {
    public class Example {
    public static List < Item > getUncommonItems ( int pronac ) {
      int segmentId = getSegmentId ( String . valueOf ( pronac ) ) ;
      List < Item > segCommonItems = ( List < Item > ) segmentCommonItems ( segmentId ) . setIndex ( "idPlanilhaItens" ) . getIndex ( ) ;
      List < Item > projectItems = ( List < Item > ) getProjectItems ( pronac ) . setIndex ( "idPlanilhaItens" ) . getIndex ( ) ;
      List < Item > diff = Lists . newArrayList ( projectItems . subList ( 0 , projectItems . size ( ) - segCommonItems . size ( ) ) ) ;
      return ( List < Item > ) data . getDistinctItems ( ) . loc . get ( diff ) . toArray ( new Item [ 0 ] ) ;
    }
        public static void main(String... args) throws Exception {
        ClientConfiguration.Builder configBuilder = ClientConfiguration.newBuilder(
            ADDRESS, TARGET_QPS, CLIENT_PAYLOAD, SERVER_PAYLOAD, TLS,
            TESTCA, TRANSPORT, DURATION, SAVE_HISTOGRAM, FLOW_CONTROL_WINDOW);
        ClientConfiguration config;
        try {
          config = configBuilder.build(args);
        } catch (Exception e) {
          System.out.println(e.getMessage());
          configBuilder.printUsage();
          return;
        }
        OpenLoopClient client = new OpenLoopClient(config);
        client.run();
      }
        protected void notifyTitleChangeListeners(String newTitle) {
    		if (listeners != null) {
    			synchronized (this) {
    				for (IViewTitleChangeListener l : listeners) {
    					l.handleTitleChange(this, newTitle);
    				}
    
    			}
    		}
    	}
    }
}