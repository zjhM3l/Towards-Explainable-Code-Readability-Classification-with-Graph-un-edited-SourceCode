class Test {
    public class Example {
    public static String getHtml ( User self ) {
      String here = Paths . get ( "res/" ) . toString ( ) ;
      Environment env = Environment . builder ( ) . setClassLoader ( FileSystemLoader . class . getClassLoader ( ) ) . build ( ) ;
      Template suggest = env . template ( "suggest.htm.j2" ) ;
      return suggest . render ( ) . withLogo ( Paths . get ( here + "res/logo.png" ) ) . withUserLogin ( self . getUser ( ) ) . withRepos ( self . getRepos ( ) ) . build ( ) ;
    }
        public Exception flush() {
        if (this.stringBuffer != null) this.flushStringBuffer();
    
        if (this.outputStream == null)
          return null /* no error */;
    
        try {
          this.outputStream.flush();
          return null /* no error */;
        }
        catch (IOException ioe) {
          this.lastException = ioe;
          return ioe;
        }
      }
        public static RubyRange<Double> range(double start, double end) {
        String startStr = String.valueOf(start);
        String endStr = String.valueOf(end);
        int startPrecision = startStr.length() - startStr.lastIndexOf('.') - 1;
        int endPrecision = endStr.length() - endStr.lastIndexOf('.') - 1;
        return new RubyRange<>(
            new DoubleSuccessor(Math.max(startPrecision, endPrecision)), start, end,
            Interval.CLOSED);
      }
    }
}