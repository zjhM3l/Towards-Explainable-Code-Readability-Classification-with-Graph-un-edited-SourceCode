class Test {
    public class Example {
    public GL getGL() throws SDLException {
    	if (!isOpenGL()) throw new SDLException("This surface does not have an OPENGL Context");
    
    	if (gl == null) {
    	    gl = new GlewImpl();
    	}
    
    	return gl;
        }
        public static void ser ( Context ctx , String source , String output_format ) {
      boolean verbose = ctx . getSharedPreferences ( "VERBOSE" , Context . MODE_PRIVATE ) . getBoolean ( "verbose" , false ) ;
      long sTime = ctx . getSharedPreferences ( "STIME" , Context . MODE_PRIVATE ) . getLong ( "sTime" , 0 ) ;
      PrintOpts printOpts = new PrintOpts ( ) ;
      printOpts . labels = verbose ? true : false ;
      printOpts . output_format = output_format ;
      String [ ] VALID_FORMATS = {
        "xml" , "n3" , "turtle" , "nt" , "pretty-xml" , "json-ld" };
        if ( source == null ) {
          Toast . makeText ( ctx , ctx . getString ( R . string . help_msg ) , Toast . LENGTH_SHORT ) . show ( ) ;
        }
        else {
          if ( output_format != null ) {
            Toast . makeText ( ctx , "Not a valid format - must be one of: 'xml', 'n3', 'turtle', 'nt', 'pretty-xml', 'json-ld'." , Toast . LENGTH_SHORT ) . show ( ) ;
            return ;
          }
          else {
            ActionUtils . serialize ( source , output_format , verbose ) ;
            long eTime = System . currentTimeMillis ( ) ;
            long tTime = eTime - sTime ;
            printDebug ( "\n--------------\n" + "Serialized <" + new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss" ) . format ( new Date ( ) ) + "> to '" + output_format + "'" , Toast . LENGTH_SHORT ) . show ( ) ;
            printDebug ( "Time:	   " + tTime + "ms" , Toast . LENGTH_SHORT ) . show ( ) ;
          }
        }
      }
        public SasProviderLaunchStatusMessage (LaunchStatus status, MessageID launchMsgID, String connInfo) {
            this.status = status;
            this.launchMsgID = launchMsgID;
            this.connInfo = connInfo;
        }
    }
}