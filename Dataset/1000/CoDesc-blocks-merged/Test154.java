class Test {
    public class Example {
    private static Trace simWA ( Trace trace , boolean PAZ , boolean seedresp , double waterLevel , boolean velocity ) {
      PAZ_WA PAZ_WA = new PAZ_WA ( ) ;
      PAZ_WA . poles = new double [ ] {
        - 6.283 + 4.7124j , - 6.283 - 4.7124j };
        PAZ_WA . zeros = new double [ ] {
          0 + 0j };
          PAZ_WA . gain = 1.0 ;
          PAZ_WA . sensitivity = 2080 ;
          if ( velocity ) PAZ_WA . zeros = new double [ ] {
            0 + 0j , 0 + 0j };
            trace . detrend ( "simple" ) ;
            if ( PAZ ) trace . data = SeisSim . simulatePA ( trace . data , trace . stats . samplingRate , PAZ , PAZ_WA , waterLevel , true ) ;
            else if ( seedresp ) trace . data = SeisSim . simulatePA ( trace . data , trace . stats . samplingRate , null , PAZ_WA , waterLevel , seedresp ) ;
            else {
              UserWarning . warn ( "No response given to remove, will just simulate WA" ) ;
              trace . data = SeisSim . simulatePA ( trace . data , trace . stats . samplingRate , null , PAZ_WA , waterLevel ) ;
            }
            return trace ;
          }
        public IConfig getConfig() {
    		if (config == null)
    			return getDriver().getConfig();
    		return config;
    	}
        @Override public NotificationChain eInverseRemove(InternalEObject otherEnd,int featureID,NotificationChain msgs){
    switch (featureID) {
    case ExpressionsPackage.TYPE_CAST_EXPRESSION__OPERAND:
        return basicSetOperand(null,msgs);
    }
    return super.eInverseRemove(otherEnd,featureID,msgs);
    }
    }
}