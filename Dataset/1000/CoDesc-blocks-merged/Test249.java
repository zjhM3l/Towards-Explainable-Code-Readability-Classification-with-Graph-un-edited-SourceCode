class Test {
    public class Example {
    public boolean contains(NumericalInterval other) {
    
    		if (this.getLeft() > other.getLeft()) {
    			return false;
    		}
    		if (this.getRight() < other.getRight()) {
    			return false;
    		}
    
    		if (this.getLeft() == other.getLeft()) {
    			if (this.isLeftOpen() && !other.isLeftOpen()) {
    				return false;
    			}
    		}
    
    		if (this.getRight() == other.getRight()) {
    			if (this.isRightOpen() && !other.isRightOpen()) {
    				return false;
    			}
    		}
    
    		return true;
    
    	}
        private void doJmxValue(HttpServletResponse httpResponse, String jmxValueParameter)
    
    			throws IOException {
    
    		httpResponse.setContentType("text/plain");
    
    		httpResponse.getWriter().write(MBeans.getConvertedAttributes(jmxValueParameter));
    
    		httpResponse.flushBuffer();
    
    	}
        public static String getResponse ( HttpClient self , String url , int timeout ) {
      if ( timeout == 0 ) timeout = self . getDefaultTimeout ( ) ;
      if ( self . getDefaultSleeptime ( ) > 0 ) TimeUnit . MILLISECONDS . sleep ( self . getDefaultSleeptime ( ) ) ;
      try {
        return self . auth . get ( url , new Header [ ] {
          new Header ( "Accept" , "application/json" ) }, timeout ) ;
        }
        catch ( Exception e ) {
          return null ;
        }
      }
    }
}