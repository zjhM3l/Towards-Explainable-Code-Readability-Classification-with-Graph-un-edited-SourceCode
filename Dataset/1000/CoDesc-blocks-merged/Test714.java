class Test {
    public class Example {
    public static Object getItem ( Map < ? , ? > self , String key ) {
      List < String > keys = Arrays . asList ( self . keySet ( ) ) ;
      if ( ! key . contains ( "." ) ) {
        printMessage ( "ERROR: '" + key + "' not found." ) ;
        return null ;
      }
      try {
        Object x = InvokerHelper . getProperty ( self , 1 , keys . indexOf ( key ) ) ;
        return x ;
      }
      catch ( Exception e ) {
        printMessage ( "ERROR: '" + self . getValue ( 1 , keys . indexOf ( key ) ) + "' cannot be evaluated." ) ;
        return null ;
      }
    }
        public void setCGIParams(Map<String, String[]> cgi_params ){
    		/*
    		 * Make a Map copy because it could be altered 
    		 */
    		if( cgi_params != null ) {
    			for( Entry<String, String[]> e: cgi_params.entrySet()) {
    				String v;
    				if( e.getValue().length == 0 ) {
    					v = "";
    				}
    				else  {
    					v = e.getValue()[0];
    				}
    				cgiParams.put(e.getKey().toLowerCase(),v);
    			}
    		}
    	}
        public void show() {
    	setup();
    	internalFrame.pack();
    	internalFrame.setMinimumSize(internalFrame.getSize());
    	internalFrame.addComponentListener(new ComponentAdapter() {
    	    @Override
    	    public void componentResized(ComponentEvent e) {
    		JFrame tmp = (JFrame) e.getSource();
    		if (tmp.getWidth() < internalFrame.getMinimumSize().getWidth()
    			|| tmp.getHeight() < internalFrame.getMinimumSize()
    				.getHeight()) {
    		    tmp.setSize(
    			    (int) internalFrame.getMinimumSize().getWidth(),
    			    (int) internalFrame.getMinimumSize().getHeight());
    		}
    	    }
    	});
    	internalFrame.setVisible(true);
        }
    }
}