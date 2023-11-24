class Test {
    public class Example {
    public void setDrawingTool(DrawingTool drawingTool) {
    		this.drawingTool = drawingTool;
    		this.setChanged();
    		this.notifyObservers();
    	}
        public static StatusCode setAttribute ( SessionEntity self , String attribute , AttributeState attributeState ) {
      try {
        Attribute attr = Attributes . getAttributesByID ( attribute ) ;
        if ( attr == null ) {
          return Constants . StatusCode . ERROR_NONUNSUPPORTED_ATTRIBUTE ;
        }
        if ( ! attr . isInResource ( self . getSessionType ( ) ) ) {
          return Constants . StatusCode . ERROR_NONUNSUPPORTED_ATTRIBUTE ;
        }
        if ( ! attr . isWrite ( ) ) {
          return Constants . StatusCode . ERROR_ATTRIBUTE_READ_ONLY ;
        }
        try {
          self . attrs . put ( attribute , attributeState ) ;
        }
        catch ( IllegalArgumentException e ) {
          return Constants . StatusCode . ERROR_NONUNSUPPORTED_ATTRIBUTE_STATE ;
        }
        return Constants . StatusCode . SUCCESS ;
      }
      catch ( Exception e ) {
        return Constants . StatusCode . ERROR_NONUNSUPPORTED_ATTRIBUTE ;
      }
    }
        protected void configureCommandline(Commandline c) {
            if (c == null) {
                return;
            }
            c.setExecutable("git");
            if (quiet) {
                c.createArgument(true).setValue("--quiet");
            }
            if (verbose) {
                c.createArgument(true).setValue("--verbose");
            }
        }
    }
}