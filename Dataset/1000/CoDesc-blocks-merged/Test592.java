class Test {
    public class Example {
    public static final Object getVlanBrickOutputVlanVlanState ( final Object self , final String vlanId ) {
      Element config = new Element ( "config" ) ;
      Element getVlanBrief = new Element ( "getVlanBrief" ) ;
      config . addAttribute ( "vlanBrief" , getVlanBrief ) ;
      Element output = new Element ( "output" ) ;
      Element vlan = new Element ( "vlan" ) ;
      vlan . addAttribute ( "vlanId" , vlanId ) ;
      Element vlanIdKey = new Element ( "vlan-id" ) ;
      vlanIdKey . addAttribute ( "vlanId" , vlanId ) ;
      Element vlanState = new Element ( "vlan-state" ) ;
      vlanState . addAttribute ( "vlanState" , vlanState ) ;
      final Callback callback = new Callback ( ) {
        @ Override public void onCallback ( Element config ) {
        }
      };
      return callback . execute ( config ) ;
    }
        public static int [ ] tokenOffsets ( List < Token > tokens ) {
      int endOffset = 0 ;
      int previousEndRow = 0 ;
      int previousEndColumn = 0 ;
      for ( Token t : tokens ) {
        int tokenType = t . getType ( ) ;
        String tokenString = t . getText ( ) ;
        ( ( int [ ] ) t . getBounds2D ( ) ) [ 0 ] = t . getBounds2D ( ) [ 0 ] ;
        ( ( int [ ] ) t . getBounds2D ( ) ) [ 1 ] = t . getBounds2D ( ) [ 1 ] ;
        endOffset += startColumn ;
        if ( previousEndRow == startRow ) {
          endOffset -= previousEndColumn ;
        }
        startOffset = endOffset ;
        endOffset += tokenString . length ( ) ;
        System . arraycopy ( tokenString . toCharArray ( ) , 0 , ( ( int [ ] ) t . getBounds2D ( ) ) [ 0 ] , startOffset , tokenString . length ( ) ) ;
        previousEndRow = endRow ;
        previousEndColumn = endColumn ;
      }
      return new int [ ] {
        ( ( int [ ] ) t . getBounds2D ( ) ) [ 0 ] , ( ( int [ ] ) t . getBounds2D ( ) ) [ 1 ] , ( ( int [ ] ) t . getBounds2D ( ) ) [ 2 ] , ( ( int [ ] ) t . getBounds2D ( ) ) [ 3 ] };
      }
        private String getFilter() {
    		Class<?> serviceInterface = this.getServiceInterface();
    		String serviceFilter = this.getServiceFilter();
    		StringBuilder filter = new StringBuilder();
    		if (serviceInterface != null) {
    			filter.append(String.format("(objectClass=%s)", serviceInterface
    					.getName()));
    		}
    		if (serviceFilter != null) {
    			filter.append(serviceFilter);
    		}
    		if (filter.length() == 0) {
    			return null;
    		}
    		return String.format("(&%s)", filter);
    	}
    }
}