class Test {
    public class Example {
    public static void cli ( JSONObject obj ) throws Exception {
      Client client = ( Client ) obj . get ( "client" ) ;
      TimeZone timezone = ( TimeZone ) obj . get ( "timezone" ) ;
      Screen screen = new Screen ( client , timezone ) ;
      screen . run ( ) ;
    }
        public void testInit() {
            System.out.println("init");
            
            SessionBean1 instance = new SessionBean1();
            
            instance.init();
            
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        }
        public static void ensureDirExists ( File directory ) {
      if ( directory . toString ( ) . startsWith ( "gs://" ) ) {
        return ;
      }
      if ( ! directory . exists ( ) ) {
        dbg ( "Making dir {
    }" , directory ) ;
      }
      directory . mkdirs ( ) ;
    }
    }
}