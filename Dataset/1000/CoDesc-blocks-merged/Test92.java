class Test {
    public class Example {
    private void checkValidity() {
            if (invalid) {
                throw new IllegalStateException(
                    "Cannot execute desired operation " +
                    "because pooled connection has invalid state.");
            }
        }
        public String getQualifiedSwitchValue(String id) {
        	Object result = null;
        	List al = (List) allResults.get(id);
        	if ((al != null) && (al.size() == 2)) {
        		result = al.get(1);
        	}
        	return(String)result;
        }
        public static void interruptKernel ( Kernel self ) {
      if ( customInterrupt ) {
        mReading = false ;
        customInterruptRequested . emit ( ) ;
      }
      else if ( kernelManager . hasKernel ( ) ) {
        mReading = false ;
        kernelManager . interruptKernel ( ) ;
      }
      else {
        appendPlainText ( "Kernel process is either remote or " + "unspecified. Cannot interrupt.\n" ) ;
      }
    }
    }
}