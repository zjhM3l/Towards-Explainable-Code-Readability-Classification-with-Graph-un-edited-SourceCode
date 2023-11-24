class Test {
    public class Example {
    public static void setInputScoreStartRange ( InputScoreStartRange self , double score ) {
      if ( self . getInputScoreStartRangeMetadata ( ) . isReadOnly ( ) ) {
        throw new DMLRuntimeException ( "Input ScoreStartRange is not read-only" ) ;
      }
      try {
        score = Double . valueOf ( score ) ;
      }
      catch ( NumberFormatException e ) {
        throw new DMLRuntimeException ( "Invalid score value for inputScoreStartRange" , e ) ;
      }
      if ( ! isValidDecimalValue ( score , self . getInputScoreStartRangeMetadata ( ) ) ) {
        throw new DMLRuntimeException ( "Invalid score value for inputScoreStartRange" , e ) ;
      }
      self . getMy_map ( ) . put ( "inputScoreStartRange" , score ) ;
    }
        public static Map < String , String > getGoal ( String path , String opts ) {
      String cmd = "mfsgetgoal" ;
      Map < String , String > ret = new HashMap < String , String > ( ) ;
      if ( opts != null ) {
        cmd += " -" + opts ;
      }
      else {
        opts = "" ;
      }
      cmd += "" + path ;
      out = __cmd . run ( cmd , JavaShell . class ) ;
      String output = out . getStdout ( ) . toString ( ) ;
      if ( "r" . equals ( opts ) ) {
        String [ ] goal = output . split ( ": " ) ;
        ret . put ( goal [ 1 ] , "" ) ;
      }
      else {
        for ( String line : output . split ( "\n" ) ) {
          if ( line . isEmpty ( ) ) continue ;
          if ( path . contains ( line ) ) continue ;
          String [ ] comps = line . split ( "" ) ;
          String keytext = comps [ 0 ] + " with goal" ;
          if ( keytext != null ) ret . put ( keytext , comps [ 3 ] ) ;
        }
      }
      return ret ;
    }
        public String toString() {
    		String result = "";
    		for (int i = 0; i < program.size(); i++) {
    			result += program.get(i).toString() + "\n";
    		}
    		return result;
    	}
    }
}