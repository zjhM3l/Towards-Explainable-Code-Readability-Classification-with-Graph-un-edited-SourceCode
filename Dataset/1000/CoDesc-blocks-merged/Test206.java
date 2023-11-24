class Test {
    public class Example {
    public static final void renameRegions ( Country self , Map < String , String > regions ) {
      if ( StringUtils . isEmpty ( regions ) ) {
        return ;
      }
      for ( Map . Entry < String , String > entry : regions . entrySet ( ) ) {
        entry . setValue ( old , new String ( old ) ) ;
      }
      try {
        for ( Extension ext : self . getExtensions ( Data . class ) ) {
          for ( Map . Entry < String , String > entry : ext . getExtensions ( Data . class ) . entrySet ( ) ) {
            entry . setValue ( entry . getValue ( ) , new String ( old ) ) ;
          }
        }
      }
      catch ( Exception e ) {
        e . printStackTrace ( ) ;
      }
      self . meta . addModify ( "Changed country names" ) ;
    }
        private String formatDouble(double d, int dec) {
    		if (dec <= 0)
    			return String.valueOf(Math.round(d));
    
    		StringBuffer res = new StringBuffer();
    		long aprox = (int) Math.round(d * Math.pow(10, dec));
    		if (d < 0) {
    			aprox = -aprox;
    			res.append('-');
    		}
    
    		String num = String.valueOf(aprox);
    		int n = num.length() - dec;
    		if (n <= 0) {
    			res.append("0.");
    
    			for (int i = 0; i < -n; i++)
    				res.append('0');
    
    			res.append(num);
    		} else {
    			char[] array = num.toCharArray();
    			res.append(array, 0, n).append('.').append(array, n, dec);
    		}
    
    		return res.toString();
    	}
        public String newSessionId() {
    		byte[] b = new byte[32];
    		random.nextBytes(b);
    		return HexUtil.conventBytesToHexString(b);
    	}
    }
}