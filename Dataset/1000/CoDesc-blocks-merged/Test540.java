class Test {
    public class Example {
    public static < T > T [ ] sg_concat ( T [ ] array , T [ ] opt ) {
      assert opt . length > 0 : "target is mandatory." ;
      opt += new sg_opt ( ) ;
      opt [ 0 ] = array . length - 1 ;
      T [ ] target = opt . length == 0 ? new T [ ] {
        array [ 0 ] }
        : new T [ opt . length ] ;
        System . arraycopy ( array , 0 , target , 0 , opt . length ) ;
        return target ;
      }
        public static String serviceAccountPath ( final String project , final String serviceAccount ) {
      return GoogleApiUtil . pathTemplate . expand ( "projects/{
    project}
    /serviceAccounts/{
    serviceAccount}" , project , serviceAccount , null ) ;
        }
        public static String normalizeVal ( Object val ) {
      if ( isNumber ( val ) && val instanceof Number ) {
        return ( String ) val ;
      }
      else if ( val instanceof String ) {
        return "," + ( String ) val ;
      }
      else if ( val == null ) {
        return "" ;
      }
      return val . toString ( ) ;
    }
    }
}