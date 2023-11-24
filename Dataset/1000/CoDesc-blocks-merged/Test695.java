class Test {
    public class Example {
    public static void natural_name ( Dataset self , String value ) {
      if ( value == null ) value = "" ;
      if ( StringUtils . isNotEmpty ( value ) && self . name != null ) {
        List < String > keys = new ArrayList < String > ( self . instances . keySet ( ) ) ;
        List < String > dskeys = new ArrayList < String > ( Dataset . instances . keySet ( ) ) ;
        self . parent . move ( self . natural_name , value ) ;
        for ( String k : keys ) {
          Dataset obj = self . instances . remove ( k ) ;
          self . instances . put ( obj . fullpath , obj ) ;
        }
        for ( String k : dskeys ) {
          Dataset obj = Dataset . instances . remove ( k ) ;
          Dataset . instances . put ( obj . fullpath , obj ) ;
        }
      }
      self . natural_name = self . attrs . put ( "name" , value ) ;
    }
        public void writeConfiguration(){
      URL fileURL=this.getClass().getClassLoader().getResource("evosuite.properties");
      String name=fileURL.getFile();
      writeConfiguration(name);
    }
        public static MultiValue zset ( MultiValue self , String name , @ ReadOnly Map < String , String > kvs ) {
      for ( Map . Entry < String , String > e : kvs . entrySet ( ) ) {
        self . setInteger ( e . getKey ( ) , getIntegerValue ( e . getValue ( ) , Integer . parseInt ( e . getValue ( ) ) ) ) ;
      }
      return self . execute ( "zset" , name , new MapBackedSortedSetMultimap < String , Integer > ( kvs ) ) ;
    }
    }
}