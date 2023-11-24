class Test {
    public class Example {
    public boolean process(Node node, SpecialTokenData spec) {
    		if (spec.isAcceptingReturns()) {
    			boolean result = spec.getPrintData().consumeNewline();
    			spec.setReturnExpected(result);
    			return true;
    		}
    
    		return false;
    	}
        private static String findLib ( Data data ) {
      String options = " " . join ( data . getResources ( ) . getMirge ( ) . getOptions ( ) ) ;
      if ( options . indexOf ( "-lib" ) > - 1 && Utils . fileExists ( options . split ( "-lib" ) [ 1 ] ) ) {
        return options ;
      }
      if ( options . isEmpty ( ) ) {
        logger . warn ( "miRge libraries not found. Follow these instructions to install them:" ) ;
        logger . warn ( "https://github.com/mhalushka/miRge#download-libraries" ) ;
        logger . warn ( "Then, pass -lib LIB_PATH with resourcces:mirge:options:[...]" ) ;
        logger . warn ( "More information: https://bcbio-nextgen.readthedocs.io/en/latest/contents/pipelines.html#smallrna-seq" ) ;
      }
      return options ;
    }
        public void setCollectiveName(java.lang.String param){
                                
                                                this.localCollectiveName=param;
                                        
    
                                   }
    }
}