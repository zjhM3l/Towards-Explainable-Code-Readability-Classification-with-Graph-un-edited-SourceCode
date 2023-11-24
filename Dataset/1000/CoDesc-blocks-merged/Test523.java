class Test {
    public class Example {
    private void processLogin() {
          log.debug("Process the login ...");
    
          String userid = useridField.getText();
          String password = passwordField.getText();
    
          useridField.setText("");
          passwordField.setText("");
          WebAutoDeployApplication.getActive().setFocusedComponent(useridField);
    
          WebAutoDeployApplication.getApplication().connect(userid, password);
       }
        public void setInfoProperty(String key, String value){
    		if(value != null){
    			_infoMap.put(key, value.trim());
    		}
    
    	}
        private static < K , V > void mergeMap ( Map < K , V > a , Map < K , V > b ) {
      for ( Map . Entry < K , V > p : b . entrySet ( ) ) {
        if ( p . getValue ( ) == null ) {
          if ( ! ( p . getValue ( ) instanceof Map ) ) continue ;
          mergeMap ( a . get ( p . getKey ( ) ) , ( Map < K , V > ) p . getValue ( ) ) ;
        }
        else {
          a . put ( p . getKey ( ) , p . getValue ( ) ) ;
        }
      }
    }
    }
}