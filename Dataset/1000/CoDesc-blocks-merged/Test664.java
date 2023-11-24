class Test {
    public class Example {
    public static void updateIntensities ( FeatureContainer self , FeatureContainer fiContainer , String iKey ) {
      for ( FeatureContainer fgi : listvalues ( self . getContainer ( ) ) ) {
        List intensities = Lists . newArrayList ( ) ;
        Map < Integer , Integer > specfileIds = new HashMap < Integer , Integer > ( ) ;
        for ( int i = 0 , j = fgi . getSpecFiles ( ) . size ( ) ;
        i < j ;
        i ++ ) {
          specfileIds . put ( i , j ) ;
        }
        for ( int i = 0 ;
        i < self . getMatrixTemplate ( ) . size ( ) ;
        i ++ ) {
          if ( self . getMatrixTemplate ( ) . get ( i ) . containsKey ( iKey ) ) {
            FeatureContainer fi = fiContainer . getItem ( self . getMatrixTemplate ( ) . get ( i ) , specfileIds . get ( i ) ) ;
            intensities . add ( ( ( FeatureContainer ) fi ) . get ( iKey ) ) ;
          }
          else {
            intensities . add ( null ) ;
          }
        }
        fgi . setIntensities ( intensities ) ;
      }
    }
        protected JDateTimeInput getDateTimeInput() {
            if (this.dateTimeInput == null) {
                this.dateTimeInput = new JDateTimeInput();
            }
            return this.dateTimeInput;
        }
        final protected int get_enumeration(int value) throws SdaiException {
    //		synchronized (syncObject) {
    		if (owning_model == null) {
    			throw new SdaiException(SdaiException.EI_NEXS);
    		}
    		if (value == 0) {
    			throw new SdaiException(SdaiException.VA_NSET);
    		}
    		return value;
    //		} // syncObject
    	}
    }
}