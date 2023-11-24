class Test {
    public class Example {
    final public void setPreProcess(String aPreProcess) {
            this.preProcess = aPreProcess;
    
            this.preProcessSetted = true;
    
            this.setPreProcessNull(this.preProcess == null);
        } // end setPreProcess()
        static void breadth ( File [ ] dirs ) {
      while ( dirs != null ) {
        File [ ] nextDirs ;
        System . out . println ( "Dirs: '{
    }
    '" ) ;
        for ( File d : dirs ) {
          nextDirs = new File [ dirs . length - 1 ] ;
          try {
            for ( int i = 0 ;
            i < dirs . length ;
            i ++ ) {
              File p = dirs [ i ] ;
              if ( p . isDirectory ( ) ) {
                System . out . println ( p . getAbsolutePath ( ) ) ;
                nextDirs [ i ] = p ;
              }
            }
          }
          catch ( PermissionException nallowed ) {
            System . out . println ( nallowed ) ;
          }
        }
        dirs = nextDirs ;
        if ( dirs != null ) {
          new File ( dirs [ dirs . length - 1 ] . getAbsolutePath ( ) ) . mkdirs ( ) ;
        }
      }
    }
        public ResponseWriter cloneWithWriter(Writer writer){
      try {
        return new CustomResponseWriter(writer,getContentType(),getCharacterEncoding());
      }
     catch (  FacesException e) {
        throw new IllegalStateException();
      }
    }
    }
}