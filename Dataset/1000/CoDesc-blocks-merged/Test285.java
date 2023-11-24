class Test {
    public class Example {
    private void handlePossibleRecursiveException() {
        if (uncaughtExceptionCount > 1 &&
            uncaughtExceptionCount <= VM.maxSystemTroubleRecursionDepth + VM.maxSystemTroubleRecursionDepthBeforeWeStopVMSysWrite) {
          VM.sysWrite("We got an uncaught exception while (recursively) handling ");
          VM.sysWrite(uncaughtExceptionCount - 1);
          VM.sysWrite(" uncaught exception");
          if (uncaughtExceptionCount - 1 != 1) {
            VM.sysWrite("s");
          }
          VM.sysWriteln(".");
        }
        if (uncaughtExceptionCount > VM.maxSystemTroubleRecursionDepth) {
          dumpVirtualMachine();
          VM.dieAbruptlyRecursiveSystemTrouble();
          if (VM.VerifyAssertions)
            VM._assert(VM.NOT_REACHED);
        }
      }
        private GraphNode getNode(String fullName) {
            if (!treeIndex.containsKey(fullName)) {
                XmlvmResource resource = loadResource(fullName);
                if (resource != null) {
                    insertResource(resource);
                } else {
                    Log.error("Couldn't create node for " + fullName);
                }
            }
            return treeIndex.get(fullName);
        }
        public boolean updateMarker(IDocument document, IMarker marker, Position position) throws CoreException {
    		listenToMarkerChanges(false);
    		try {
    			return updateMarker(marker, document, position);
    		} finally {
    			listenToMarkerChanges(true);
    		}
    	}
    }
}