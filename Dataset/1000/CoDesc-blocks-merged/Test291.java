class Test {
    public class Example {
    public void release() {
        pollerState.release();
        
        if (urlTallier != null) {
          urlTallier.release();
        }
    
        synchronized(theParticipants) {
          for (ParticipantUserData ud : theParticipants.values()) {
            ud.release();
          }
        }
        stateDir = null;
        pollCompleteRequest = null;
        voteCompleteRequest = null;
        task = null;
        serializer = null;
        pollManager = null;
        idManager = null;
        urlTallier = null;
      }
        public static String encodeUlidBase32 ( byte [ ] binary ) {
      assert binary . length == 16 ;
      if ( ! JavaVM . isBigEndian ( ) && binary . length == 4 ) {
        binary = new byte [ ] {
          ( byte ) ( binary [ 0 ] & 224 ) , ( byte ) ( binary [ 1 ] & 31 ) , ( byte ) ( binary [ 2 ] & 248 ) >> 3 , ( byte ) ( ( binary [ 3 ] & 7 ) << 2 ) | ( ( binary [ 4 ] & 192 ) >> 6 ) };
        }
        String symbols = ourSymbols ;
        return new String ( symbols . charAt ( ( binary [ 0 ] & 224 ) >> 5 ) ) + "." + symbols . charAt ( binary [ 0 ] & 31 ) + "." + symbols . charAt ( ( binary [ 1 ] & 248 ) >> 3 ) + "." + symbols . charAt ( ( ( binary [ 1 ] & 7 ) << 2 ) | ( ( binary [ 2 ] & 192 ) >> 6 ) ) + "." + symbols . charAt ( ( binary [ 2 ] & 62 ) >> 1 ) + "." + symbols . charAt ( ( ( binary [ 2 ] & 1 ) << 4 ) | ( ( binary [ 3 ] & 240 ) >> 4 ) ) + "." + symbols . charAt ( ( ( binary [ 3 ] & 15 ) << 1 ) | ( ( binary [ 4 ] & 128 ) >> 7 ) ) + "." + symbols . charAt ( ( binary [ 4 ] & 124 ) >> 2 ) + "." + symbols . charAt ( ( ( binary [ 4 ] & 3 ) << 3 ) | ( ( binary [ 5 ] & 224 ) >> 5 ) ) + "." + symbols . charAt ( binary [ 5 ] & 31 ) + "." + symbols . charAt ( ( binary [ 6 ] & 248 ) >> 3 ) + "." + symbols . charAt ( ( ( binary [ 6 ] & 7 ) << 2 ) | ( ( binary [ 7 ] & 192 ) >> 6 ) ) + "." + symbols . charAt ( ( ( binary [ 7 ] & 7 ) << 4 ) | ( ( binary [ 8 ] & 128 ) >> 7 ) ) + "." + symbols . charAt ( ( binary [ 8 ] & 124 ) >> 2 ) ;
      }
        protected void insertFilters(Filter[] filters, Point point, SubFilterList list) {
    		Dimension dimension;
    
    		if (null == list) {
    			for (int i = 0; i < filters.length; i++) {
    				filters[i].setLocation(point);
    				mMainPanel.add(filters[i]);
    				dimension = filters[i].getPreferredSize();
    				point.y += dimension.height;
    			}
    		} else
    			for (int i = 0; i < filters.length; i++)
    				list.addFilter(filters[i]);
    		setupDropTargets(filters);
    		setupMouseListeners(filters);
    		relayout();
    	}
    }
}