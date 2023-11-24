class Test {
    public class Example {
    public int getStates(int x, int y){
    		if (x < 0) x = 0; else if (x > columns - 1) x = columns - 1;
    		if (y < 0) y = 0; else if (y > rows - 1) y = rows - 1;
    		return states[x][y];
    	}
        public static AppReverseFragment newInstance ( String viewName , String urlconf ) {
      AppReverseFragment fragment = new AppReverseFragment ( ) ;
      Bundle args = new Bundle ( ) ;
      args . putString ( KEY_VIEW_NAME , viewName ) ;
      args . putString ( KEY_urlconf , urlconf ) ;
      args . putInt ( KEY_APP_MODULE , "" ) ;
      args . putInt ( KEY_APP_VERSION , "" ) ;
      Bundle bundle = new Bundle ( ) ;
      bundle . putString ( KEY_APP_MODULE , "" ) ;
      bundle . putString ( KEY_APP_VERSION , "" ) ;
      Bundle asvar = null ;
      args . putSerializable ( KEY_AS_VAR , asvar ) ;
      if ( args . containsKey ( KEY_APP_MODULE ) && args . containsKey ( KEY_APP_VERSION ) ) {
        asvar = args . getBundle ( KEY_APP_MODULE ) ;
        args . putSerializable ( KEY_APP_VERSION , asvar ) ;
      }
      if ( args . containsKey ( KEY_APP_MODULE ) ) {
        for ( String key : args . keySet ( ) ) {
          bundle . putString ( key , args . getString ( key ) ) ;
        }
      }
      fragment . setArguments ( args ) ;
      return fragment ;
    }
        public void fullClose() {
    
         super.fullClose();
    
         closeStatement(delAllRecordFields);
    
     }
    }
}