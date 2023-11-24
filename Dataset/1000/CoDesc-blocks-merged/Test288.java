class Test {
    public class Example {
    public void stopServer() {
    		try {
    			server.stop();
    		} catch (final Exception e) {
    			logger.error("Problem detected stopping Jetty6 server :: "+e.getMessage());
    			if (logger.isInfoEnabled()) {
    				logger.info("Exception arised stopping Jetty6 WEB Container.", e);
    			}
    		}
    	}
        private double scanlong( int base, int start, int end ) {
    		long x = 0;
    		boolean neg = (m_bytes[start] == '-');
    		for ( int i=(neg?start+1:start); i<end; i++ ) {
    			int digit = m_bytes[i] - (base<=10||(m_bytes[i]>='0'&&m_bytes[i]<='9')? '0':
    					m_bytes[i]>='A'&&m_bytes[i]<='Z'? ('A'-10): ('a'-10));
    			if ( digit < 0 || digit >= base )
    				return Double.NaN;		
    			x = x * base + digit;
    		}
    		return neg? -x: x;
    	}
        public Integer getExpirationCache()
       {
          if (childNode.getTextValueForPatternName("expiration-cache") != null && !childNode.getTextValueForPatternName("expiration-cache").equals("null")) {
             return Integer.valueOf(childNode.getTextValueForPatternName("expiration-cache"));
          }
          return null;
       }
    }
}