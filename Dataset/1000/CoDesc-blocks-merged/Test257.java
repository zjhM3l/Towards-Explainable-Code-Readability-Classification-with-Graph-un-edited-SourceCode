class Test {
    public class Example {
    public static void renderSource ( String outputDir , PackageSpec packageSpec ) throws IOException {
      String path = packageSpec . getFilePath ( ) ;
      String name = packageSpec . getFilePath ( ) ;
      String modulePrefix = "SwiftNav.SBP" ;
      String moduleName = CamelUtils . camelCase ( name ) ;
      String fullModuleName = "." + modulePrefix + moduleName ;
      String destinationFilename = outputDir + "/src/SwiftNav/SBP/" + moduleName + ".hs" ;
      Template javaTemplate = JENV . getTemplate ( MESSAGES_TEMPLATE_NAME ) ;
      List < String > moduleIncludes = new ArrayList < String > ( ) ;
      moduleIncludes . add ( "." + modulePrefix ) ;
      moduleIncludes . add ( CamelUtils . camelCase ( moduleName ) ) ;
      moduleIncludes . add ( fullModuleName ) ;
      moduleIncludes . add ( moduleIncludes . isEmpty ( ) ? "" : "." + fullModuleName ) ;
      File file = new File ( destinationFilename ) ;
      file . getParentFile ( ) . mkdirs ( ) ;
      file . write ( javaTemplate . render ( msgs , packageSpec . getDefinitions ( ) , packageSpec . getDescription ( ) , fullModuleName , moduleIncludes ) ) ;
    }
        protected void assure(String msg, boolean s, boolean cont) {
            state &= s;
            if (!s) {
                message += msg + "\r\n";
                log.println(msg);
                if (!cont) {
                    throw new AssureException(msg);
                }
            }
        }
        public void process( Socket socket )
    	{ 
    		try{
    			BufferedReader in = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );
    			PrintStream out = new PrintStream( socket.getOutputStream() );
    
    			setFirstLine(in);
    			setRequest();			
    			
    			logger.debug((r.toString()));
    
    			this.sendResponse(out, r);
    
    			out.close();
    			in.close();
    			socket.close();
    		}
    		catch( Exception e )
    		{
    			logger.debug( e.getMessage());
    		}
    	}
    }
}