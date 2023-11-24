class Test {
    public class Example {
    private static Address GetPrimitiveArrayCritical(JNIEnvironment env,int arrayJREF,Address isCopyAddress){
      if (traceJNI)   VM.sysWrite("JNI called: GetPrimitiveArrayCritical \n");
      RuntimeEntrypoints.checkJNICountDownToGC();
      try {
        Object primitiveArray=env.getJNIRef(arrayJREF);
        if (!primitiveArray.getClass().isArray()) {
          return Address.zero();
        }
        JNIGenericHelpers.setBoolStar(isCopyAddress,false);
        VM.disableGC(true);
        return Magic.objectAsAddress(primitiveArray);
      }
     catch (  Throwable unexpected) {
        if (traceJNI)     unexpected.printStackTrace(System.err);
        env.recordException(unexpected);
        return Address.zero();
      }
    }
        public void discard() {
            history.setSize(0);
            historyIndex = -1;
            fireHistoryChanged(this,false,false);
        }
        public String getService() {
            if (service == null) {
                return "http://www.opengis.net/cat/csw";
            } else {
                return service;
            }
        }
    }
}