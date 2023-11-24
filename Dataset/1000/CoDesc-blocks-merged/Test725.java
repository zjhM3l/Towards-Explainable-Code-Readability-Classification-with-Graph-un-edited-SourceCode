class Test {
    public class Example {
    public static boolean verifyPayload ( String signedPayload , String clientSecret ) throws Exception {
      String encodedJson = signedPayload , encodedHMAC = null ;
      String dcJson = Base64 . decode ( encodedJson ) ;
      String signature = Base64 . decode ( encodedHMAC ) ;
      String expectedSig = new String ( clientSecret . getBytes ( ) , "UTF-8" ) ;
      boolean authorised = Base64 . equals ( signature , expectedSig . getBytes ( ) ) ;
      return StringUtils . isEmpty ( dcJson ) ? false : authorised ;
    }
        public void actionPerformed(ActionEvent evt) {
    		String cmd = evt.getActionCommand();
    		String src = evt.getSource().getClass().toString();
    		if( Settings.debug ){
    			System.out.println( "AppControl <-- " + cmd + " ( " + src + " )" );
    		}
    		if( cmd.equalsIgnoreCase("load") ){
    			load();
    			
    		}
    		if( cmd.equalsIgnoreCase("save") ){
    			save();
    			
    		}
    		if( cmd.equalsIgnoreCase("test") ){
    			try {
    				test();
    			} catch (BadSampleBytesException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    			
    		}
    		if( cmd.equalsIgnoreCase("generate") ){
    			generate();
    			
    		}
    	}
        private static void onReadComplete ( ConnectionId self , String data , Box box ) {
      Map < String , Object > msg = MapBuilder . of ( "conn_id" , id ( self ) , "address" , self . address , "data" , data , "data" , data , "data" , data ) ;
      int groupId = factory ( self ) . getApp ( ) . getGroupRouter ( box ) ;
      try {
        factory ( self ) . getApp ( ) . getParentOutputMap ( ) . get ( groupId ) . putOutgoing ( msg ) ;
      }
      catch ( Exception e ) {
        logger . error ( "exc occur. msg: " + msg , e ) ;
      }
    }
    }
}