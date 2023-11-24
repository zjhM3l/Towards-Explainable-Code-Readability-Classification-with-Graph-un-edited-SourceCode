class Test {
    public class Example {
    public static Group group ( Group self , int index , boolean chunked ) {
      if ( index < 0 || index > self . pattern . groups . length ) throw new IndexOutOfBoundsException ( "no such group" ) ;
      if ( index > 0 && index <= self . pattern . groups . length ) g = self . pattern . groups [ index - 1 ] ;
      if ( index == 0 ) g = self . pattern . sequence ;
      if ( chunked == true ) return new Group ( self , self . constituents ( constraint -> new Constraint ( self . pattern . sequence . indexOf ( x ) ) ) ) ;
      return new Group ( self , new List < String > ( ) {
        @ Override public String [ ] words ( ) {
          return self . pattern . words ;
        }
        @ Override public Constraint constraint ( String w ) {
          return new Constraint ( w ) ;
        }
      }
      ) ) ;
    }
        protected Map<String, String> convertParameters(WikiParameters params)
        {
            Map<String, String> xwikiParams;
    
            if (params.getSize() > 0) {
                xwikiParams = new LinkedHashMap<String, String>();
                for (WikiParameter wikiParameter : params.toList()) {
                    xwikiParams.put(wikiParameter.getKey(), wikiParameter.getValue());
                }
            } else {
                xwikiParams = Listener.EMPTY_PARAMETERS;
            }
    
            return xwikiParams;
        }
        public String getIdentMessage() {
    		String s = ("This is " + id + "\n");
    		try {
    			s += "Version " + getVersion() + "\n";
    			s += "running on " + getHostName();
    		} catch (Exception exc) {
    			s += "Can't get identifikation info";
    		}
    		return s;
    	}
    }
}