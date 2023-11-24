class Test {
    public class Example {
    public String filterProjectLangNS(String projectName, String language, String ns) {
            String nsDbCode = "NULL";
            FilteredWMProject pr = projects.get(projectName.toUpperCase());
            if (pr != null) {
                nsDbCode = pr.filterLangNS(language.toUpperCase(), ns.toUpperCase());
            }
            return nsDbCode;
        }
        public static MDAdvisorDevicesProto convert ( ) {
      Set < String > devices = new HashSet < String > ( ) ;
      try {
        try ( InputStream mdstat = salt . utils . Files . fopen ( "/proc/mdstat" , "r" ) ) {
          BufferedReader reader = new BufferedReader ( new InputStreamReader ( mdstat ) ) ;
          String line ;
          while ( ( line = reader . readLine ( ) ) != null ) {
            line = salt . utils . Strings . toString ( line ) ;
            if ( line . startsWith ( "Personalities : " ) ) continue ;
            if ( line . startsWith ( "unused devices:" ) ) continue ;
            if ( " : " . equals ( line ) ) devices . add ( line . substring ( " : " . length ( ) ) ) ;
          }
        }
        catch ( IOException e ) {
          return null ;
        }
        devices = Collections . unmodifiableSet ( devices ) ;
      }
      catch ( FileNotFoundException e ) {
        return null ;
      }
      if ( devices . size ( ) > 0 ) {
        log . trace ( "mdadm devices detected: " + Joiner . on ( ", " ) . join ( devices ) ) ;
      }
      return new MDAdvisorDevicesProto ( devices ) ;
    }
        public OutputBuffer getCurrentBuffer(boolean create) {
            
            if(logger.isDebugEnabled()){
                logger.debug("Getting "+(create?"or creating":"")+" buffer with " +
                        "index " + index.toString());
            }
    
        	// Shortcut to return the output buffer if we have a regular pane
        	// i.e. one that is not enclosed by a format iterator.
            if (create && zeroDOutputBuffer == null) {
                    zeroDOutputBuffer = context.allocateOutputBuffer();
                    // Make sure that the content buffer trims any leading and                 
                    // trailing spaces off the final content.
                    zeroDOutputBuffer.setTrim(true);
            }
            return zeroDOutputBuffer;
        }
    }
}