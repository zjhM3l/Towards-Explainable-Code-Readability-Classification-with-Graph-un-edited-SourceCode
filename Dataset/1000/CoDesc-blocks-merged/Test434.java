class Test {
    public class Example {
    public void actionPerformed(ActionEvent e) {
         	if (subMenu!=null){ 
             Object source = e.getSource();   
             subMenu.show((Component) source, 0, 30);
          }
        }
        private static boolean setChannelGain ( GenericHX711Controller self , int num ) throws GenericHX711Exception {
      if ( ! 1 <= num && num <= 3 ) {
        throw new NullPointerException ( ) ;
      }
      for ( ;
      num > 0 ;
      num -- ) {
        LOG . debug ( "setChannelGain called" ) ;
        long startCounter = System . nanoTime ( ) ;
        GPIO . output ( self . getPdScsck ( ) , true ) ;
        GPIO . output ( self . getPdScsck ( ) , false ) ;
        long endCounter = System . nanoTime ( ) ;
        double timeElapsed = ( double ) ( endCounter - startCounter ) ;
        if ( timeElapsed >= 0.00006 ) {
          LOG . warn ( "Time elapsed: {
    :0.8f}" , timeElapsed ) ;
            boolean result = self . getRawData ( times = 6 ) ;
            if ( result == false ) {
              throw new GenericHX711Exception ( "channel was not set properly" ) ;
            }
          }
        }
        return true ;
      }
        public void setRGB(final int r, final int g, final int b) {
    	    assertArgument(r, PROPERTY_RED);
            assertArgument(g, PROPERTY_GREEN);
            assertArgument(b, PROPERTY_BLUE);
    
    		if (red != r || green != g || blue != b) {
    			float[] hsb = new float[3];
    			Color.RGBtoHSB(r, g, b, hsb);
    			setHSB(hsb[0],hsb[1],hsb[2]);
    		}
    	}
    }
}