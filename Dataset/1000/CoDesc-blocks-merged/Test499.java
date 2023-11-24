class Test {
    public class Example {
    public int min() {
            if (size() == 0) {
                throw new IllegalStateException("cannot find minimum of an empty list");
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < _pos; i++ ) {
            	if ( _data[i] < min ) {
            		min = _data[i];
            	}
            }
            return min;
        }
        static public String getString(String msg) {
            return msg;
    //        if (bundle == null)
    //            return msg;
    //        try {
    //            return bundle.getString(msg);
    //        } catch (MissingResourceException e) {
    //            return "Missing message: " + msg; //$NON-NLS-1$
    //        }
        }
        public static void doStopCluster ( Cluster self , String clusterName ) {
      try {
        cluster = api . getCluster ( clusterName ) ;
        cluster . stop ( ) ;
        System . out . println ( "Stopping Cluster" ) ;
      }
      catch ( ApiException e ) {
        System . out . println ( "Cluster not found" ) ;
        return ;
      }
    }
    }
}