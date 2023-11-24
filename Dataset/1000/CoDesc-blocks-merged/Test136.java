class Test {
    public class Example {
    private static final ProcessHandler POSTPROCESS = new ProcessHandler ( ) {
      @ Override public void execute ( Process self , String result ) {
        Map < String , String > map = parseReturnedData ( result ) ;
        if ( "stdout" . equals ( result ) && "stdout_lines" . equals ( map . get ( "stdout" ) ) ) {
          self . getOutputStream ( ) . write ( ( map . get ( "stdout" ) != null ) ? map . get ( "stdout" ) . getBytes ( ) : String . valueOf ( result ) ) ;
        }
        if ( "stderr" . equals ( result ) && "stderr_lines" . equals ( map . get ( "stderr" ) ) ) {
          self . getOutputStream ( ) . write ( ( map . get ( "stderr" ) != null ) ? map . get ( "stderr" ) . getBytes ( ) : String . valueOf ( result ) ) ;
        }
      }
    }
        public static Object runInteraction ( Object self , Object interaction , Context context ) {
      try {
        return ( ( ConnectionPoolImpl ) self ) . runInteraction ( interaction , context ) ;
      }
      catch ( Exception e ) {
        d = new DeferredException ( e ) ;
        d . printStackTrace ( ) ;
        return d ;
      }
    }
        public void init() {
            // Perform initializations inherited from our superclass
            super.init();
            // Perform application initialization that must complete
            // *before* managed components are initialized
            // TODO - add your own initialiation code here
    
            // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">
            // Initialize automatically managed components
            // *Note* - this logic should NOT be modified
            try {
                _init();
            } catch (Exception e) {
                log("RestrictedStudyUsersPage Initialization Failure", e);
                throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
            }
            // </editor-fold>
            // Perform application initialization that must complete
            // *after* managed components are initialized
            // TODO - add your own initialization code here
    
        }
    }
}