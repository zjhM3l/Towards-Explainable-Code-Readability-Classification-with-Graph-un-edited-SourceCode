class Test {
    public class Example {
    public static int currentDbVersion ( UpgradesDatabase self ) {
      String query = "SELECT version from {
    }
     WHERE success = TRUE ORDER BY version DESC" ;
      self . cursor . execute ( query ) ;
      return self . cursor . getInt ( 0 ) ;
    }
        public void addParameter(String parameterName, String parameterValue) {
                    if (parameterName != null && parameterValue != null) {
                            parameters.put(parameterName, parameterValue);
                    }
            }
        public void drawBorder() {
    		boolean b = plotControls.isBorderSelected();
    		UIParameterConfig.getInstance().setDrawBorder(b);
    		loadImages();
    	}
    }
}