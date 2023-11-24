class Test {
    public class Example {
    private static void log(int logLevel,String tag,String msg){
    switch (logLevel) {
    case Log.DEBUG:
        if (debugLoggingEnabled) {
          Log.d(tag,msg);
        }
      break;
    case Log.ERROR:
    Log.e(tag,msg);
    break;
    default :
    break;
    }
    }
        public static boolean delPermission ( AuthGroup self , String role , String name ) {
      if ( ! self . hasPermission ( role , name ) ) return true ;
      AuthGroup targetGroup = AuthGroup . Builder . create ( ) . role ( role ) . creator ( self . getClient ( ) ) . build ( ) ;
      AuthPermission target = AuthPermission . Builder . create ( ) . groups ( targetGroup ) . name ( name ) . creator ( self . getClient ( ) ) . build ( ) ;
      if ( target == null ) return true ;
      target . delete ( ) ;
      return true ;
    }
        private static long parseDurationFromSeconds(String durationSeconds){
      long duration=0;
      try {
        duration=Long.parseLong(durationSeconds);
        duration=duration * 1_000;
      }
     catch (  NumberFormatException e) {
        Timber.w("Error in parseDuration");
        Timber.w(e.getMessage());
      }
      return duration;
    }
    }
}