class Test {
    public class Example {
    public static void process ( Logentries self , Metric metric ) {
      self . queue . add ( metric ) ;
      if ( self . queue . size ( ) >= self . queueSize ) {
        LOG . debug ( "Queue is full, sending logs to Logentries" ) ;
        self . send ( ) ;
      }
    }
        protected StringBuffer logOutput() {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            CaptureOutputStream cos = new CaptureOutputStream(baos);
            PrintStream ps = new PrintStream(cos);
    
            System.setOut(ps);
            System.setErr(ps);
    
            StringBuffer buffer = cos.getCapturedOutputBuffer();
            return buffer;
        }
        protected void reduceParseTree(CompilationUnitDeclaration unit) {
    	// remove statements from methods that have no possible matching nodes
    	TypeDeclaration[] types = unit.types;
    	for (int i = 0, l = types.length; i < l; i++)
    		purgeMethodStatements(types[i], true); 
    }
    }
}