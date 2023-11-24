class Test {
    public class Example {
    public IJavaModelStatus getJavaModelStatus() {
    	IStatus status = getStatus();
    	if (status instanceof IJavaModelStatus) {
    		return (IJavaModelStatus)status;
    	} else {
    		// A regular IStatus is created only in the case of a CoreException.
    		// See bug 13492 Should handle JavaModelExceptions that contains CoreException more gracefully
    		return new JavaModelStatus(this.nestedCoreException);
    	}
    }
        @Override
      public synchronized void stop() {
        if (this.stopStatus.isStopInProgress()) {
          return;
        }
    
        this.stopStatus.setStopInprogress(true);
    
        LOGGER.info("Stopping the Gobblin Cluster Manager");
    
        if (this.idleProcessThread != null) {
          try {
            this.idleProcessThread.join();
          } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
          }
        }
    
        // Send a shutdown request to all GobblinTaskRunners unless running in standalone mode.
        // In standalone mode a failing manager should not stop the whole cluster.
        if (!this.isStandaloneMode) {
          sendShutdownRequest();
        }
    
        stopAppLauncherAndServices();
    
        this.multiManager.disconnect();
      }
        private Node removeChildAfter(Node parent, @Nullable Node siblingBefore) {
        if (siblingBefore == null) {
          return parent.removeFirstChild();
        } else {
          return parent.removeChildAfter(siblingBefore);
        }
      }
    }
}