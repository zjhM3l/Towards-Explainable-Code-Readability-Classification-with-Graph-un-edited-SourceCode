class Test {
    public class Example {
    public Controller setValue(String theValue) {
    		myTextline = new StringBuffer(theValue);
    		// myPosition = myTextline.length() - 1;
    		_myStringValue = theValue;
    		myPosition = myTextline.length();
    		_myValueLabel.setWithCursorPosition(myTextline.toString(), myPosition);
    		broadcast(_myBroadcastType);
    		return this;
    	}
        public boolean accept(java.io.File dir, String name) {
             for (int n = 0; n < extensions.length; n++) {
                if (name.endsWith(extensions[n])) {
                   return true;
                }
             }
             return false;
          }
        public static double moment_magnitude_scalar ( Object moment ) {
      if ( moment instanceof BigDecimal ) {
        return ( 2. / 3. ) * ( Math . log10 ( ( BigDecimal ) moment ) . doubleValue ( ) - 9.05 ) ;
      }
      else {
        return ( 2. / 3. ) * ( Math . log10 ( ( Number ) moment ) . doubleValue ( ) - 9.05 ) ;
      }
    }
    }
}