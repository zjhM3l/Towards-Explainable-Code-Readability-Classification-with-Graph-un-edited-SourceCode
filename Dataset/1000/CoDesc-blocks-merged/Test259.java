class Test {
    public class Example {
    private String getCurrentDir() throws IOException {
    
            String currentDir = new java.io.File(".").getCanonicalPath();
    
            currentDir = currentDir.replace(File.separatorChar, '/');
            currentDir = "file:///" + currentDir + "/";
    
            return currentDir;
        }
        static long headerSize ( Header self ) {
      if ( self . header == null ) return 0 ;
      Entry maxEntry = Collections . max ( self . header . values ( ) , new Comparator < Entry > ( ) {
        public int compare ( Entry val , Entry other ) {
          return val . offset - other . offset ;
        }
      }
      ) ;
      return maxEntry . offset + maxEntry . value . nbytes ;
    }
        public double lengthsquared() {
    
        return x * x + y * y;
    
      }
    }
}