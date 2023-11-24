class Test {
    public class Example {
    static long jitterInterval(long intervalMillis){
      if (USE_JITTER) {
        return adjustIntervalIfJitterIsEnabled(intervalMillis);
      }
     else {
        return intervalMillis;
      }
    }
        public static float castToFloat ( String x ) {
      try {
        float x = Float . parseFloat ( x ) ;
        if ( x == null ) {
          try {
            x = x . trim ( ) ;
          }
          catch ( NumberFormatException e ) {
            LoggerMisc . warn ( "parseStr: NumberFormatException: String not number or word, {
    }, {
    }" , x , e ) ;
        }
      }
      return x ;
    }
    catch ( NumberFormatException e ) {
      try {
        x = x . trim ( ) ;
      }
      catch ( NumberFormatException e2 ) {
        LoggerMisc . warn ( "parseStr: NumberFormatException: String not number or word, {
    }, {
    }" , x , e ) ;
    }
    }
    return x ;
    }
        public static void main ( String [ ] args ) {
      double [ ] A = new double [ ] {
        4.30213466 - 6.01593490e-08j , 0.23531802 + 9.34386156e-01j };
        double t = 0.358166 * Math . PI ;
        int registerSize = 4 ;
        int [ ] inputPrepGates = {
          new cirq . Rx ( 1.276359 ) , new cirq . Rz ( 1.276359 ) };
          double [ ] expected = {
            0.144130 , 0.413217 , - 0.899154 };
            double C = 2 * Math . PI / ( 2 * registerSize * t ) ;
            System . out . println ( "Expected observable outputs:" ) ;
            System . out . println ( "X =" + expected [ 0 ] ) ;
            System . out . println ( "Y =" + expected [ 1 ] ) ;
            System . out . println ( "Z =" + expected [ 2 ] ) ;
            System . out . println ( "Actual: " ) ;
            simulate ( new hhl_circuit ( A , C , t , registerSize , new int [ ] {
              1 , 2 , 3 }
              ) ) ;
            }
    }
}