class Test {
    public class Example {
    public PrintConstraints xyCM(double x, double y) {
    		upperLeft.x = transform(x);
    		upperLeft.y = transform(y);
    		return this;
    	}
        public void workerStarted() {
    		isWorkerUp = true;
    		for (WorkerAsyncUIListener listener : listeners) {
    			listener.workerStarted();
    		}
    	}
        private static String downloadedFilename ( URL self ) throws UnsupportedRequirementException {
      URL link = self . isAbsolute ( ) ? self . toExternalForm ( ) : finder . findRequirement ( self . toExternalForm ( ) , false ) ;
      if ( link != null ) {
        String lowerScheme = link . getProtocol ( ) . toLowerCase ( ) ;
        if ( lowerScheme . equals ( "http" ) || lowerScheme . equals ( "https" ) ) {
          String filePath = download ( link ) ;
          return basename ( filePath ) ;
        }
        else if ( lowerScheme . equals ( "file" ) ) {
          String linkPath = UrlUtil . toPath ( link . toExternalForm ( ) ) ;
          if ( isDirectory ( linkPath ) ) {
            throw new UnsupportedRequirementException ( "point to files" + self + " is not a directory" + link . toExternalForm ( ) ) ;
          }
          else {
            copy ( linkPath , tempPath ) ;
            return basename ( linkPath ) ;
          }
        }
        else {
          throw new UnsupportedRequirementException ( "etc." + self + " is not a file" + link . toExternalForm ( ) ) ;
        }
      }
      else {
        throw new UnsupportedRequirementException ( % ( self ) ) ;
      }
    }
    }
}