class Test {
    public class Example {
    public static SubdomFunctions onPageScaleFactor ( Emulation self , float pageScaleFactor ) {
      Preconditions . checkArgument ( pageScaleFactor > 0 , "Argument 'pageScaleFactor' must be of type '['float', 'int']'. Received type: '%s'" , pageScaleFactor ) ;
      SubdomFunctions subdomFuncs = self . synchronousCommand ( "Emulation.setPageScaleFactor" , pageScaleFactor ) ;
      return subdomFuncs ;
    }
        public ResourceBundle getResources() {
    		if (resources == null) {
                resources = new FreemindResourceBundle();
    		}
    		return resources;
    	}
        public void stop() {
    
            this.interrupt();
            cancel = true;
        }
    }
}