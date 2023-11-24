class Test {
    public class Example {
    public void setGoogleKey(String googleKey) {
    		if (googleKey == null || googleKey.length() == 0) {
    			this.googleKey = null;
    		} else {
    			this.googleKey = googleKey;
    		}
    	}
        public long getTotalTime() {
    		// Returns the difference between the values specified in the 
    		// startTimestamp and endTimestamp fields.
    		return endTimestamp.getTime() - startTimestamp.getTime();
    	}
        public static Tensor addEdgeBias ( Tensor x , int [ ] filterSize ) {
      int [ ] xShape = CommonLayers . shapeList ( x ) ;
      if ( filterSize [ 0 ] == 1 && filterSize [ 1 ] == 1 ) {
        return x ;
      }
      int a = ( filterSize [ 0 ] - 1 ) / 2 ;
      int b = ( filterSize [ 1 ] - 1 ) / 2 ;
      int [ ] padding = {
        new int [ ] {
          0 , 0 }, new int [ ] {
            a , a }, new int [ ] {
              b , b }, new int [ ] {
                0 , 0 }
              };
              Tensor xBias = Tensor . create ( xShape [ 0 ] + 1 , 1 ) ;
              x = Tensor . create ( x , padding ) ;
              Tensor xPad = Tensor . create ( xBias , padding , 1 ) ;
              return Tensor . create ( x , xPad ) ;
            }
    }
}