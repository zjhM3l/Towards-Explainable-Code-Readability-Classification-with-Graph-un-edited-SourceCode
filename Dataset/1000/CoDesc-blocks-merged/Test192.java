class Test {
    public class Example {
    private void shutdown() throws SocketException, InterruptedException,
                IOException { // System.out.print( "Shutting down..." );
            terminateThreads();
            closeSockets();
            invalidateSessions();
            closeJob();
        }
        public static boolean isEmpty ( String bamFile ) throws IOException {
      bamFile = ObjectStore . clInput ( bamFile ) ;
      String cmd = ( "set -o pipefail;
     " + "samtools view {
    bamFile}
     | head -1 | wc -l" ) ;
        Process p = Runtime . getRuntime ( ) . exec ( cmd . replace ( new String [ ] {
          "-o" , "pipefail;
     " + "samtools view {
    bamFile}
     | head -1 | wc -l" }
            ) ) ;
            BufferedReader reader = new BufferedReader ( new InputStreamReader ( p . getInputStream ( ) ) ) ;
            String line = reader . readLine ( ) ;
            line = line . trim ( ) ;
            if ( ( ( p . waitFor ( ) == 0 || p . waitFor ( ) == 141 ) && ( line . equals ( "" ) || ( line . startsWith ( "gof3r" ) && line . endsWith ( "broken pipe" ) ) ) ) ) {
              return Integer . parseInt ( line ) == 0 ;
            }
            else {
              throw new IOException ( "Failed to check empty status of BAM file: " + String . valueOf ( line ) ) ;
            }
          }
        protected static void inputThread ( Client self ) {
      long lastInput = System . currentTimeMillis ( ) ;
      while ( alive ) {
        String x = JOptionPane . showInputDialog ( Config . prompt ) ;
        self . issueAlert = ( System . currentTimeMillis ( ) - lastInput ) > 10 ;
        lastInput = System . currentTimeMillis ( ) ;
        String msg = self . name + ": " + x ;
        if ( self . mode == Mode . c ) {
          Utils . msg ( msg , self . s ) ;
        }
        else {
          synchronized ( self . clientListLock ) {
            for ( Client com : self . clients ) {
              Utils . msg ( msg , com ) ;
            }
          }
        }
      }
    }
    }
}