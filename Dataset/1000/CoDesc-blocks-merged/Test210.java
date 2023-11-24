class Test {
    public class Example {
    private void checkThread() {
        if (!SwingUtilities.isEventDispatchThread()) {
          // outputs error if current thread is not the EDT
          System.out.println("Wrong Thread (not EDT):");
          Thread.dumpStack();
        }
      }
        public ReliableConduit waitForConnection(float timeOutSeconds) throws java.io.IOException {
    
    	int milliseconds = Math.round(timeOutSeconds * 1000);
    
    	// Blocking select
    	int numReady = 0;
    
    	if (timeOutSeconds > 0) {
    	    numReady = selector.select(milliseconds);
     	} else {
    	    numReady = selector.select();
    	}
    
            if (numReady == 0) {
    	    // Timed out
    	    return null;
            }
    
            SocketChannel clientChannel = channel.accept();
    
    	if (clientChannel == null) {
                throw new java.io.IOException("Accepted clientChannel was null" +
    					  " in channel.accept()");
    	}
    
            return new ReliableConduit(clientChannel);
        }
        public void init(IWorkbench workbench, IStructuredSelection selection) {
    		this.workbench = workbench;
    		this.selection = selection;
    		setWindowTitle(RPCMonEditPlugin.INSTANCE.getString("_UI_Wizard_label"));
    		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(RPCMonEditPlugin.INSTANCE.getImage("full/wizban/NewModel")));
    	}
    }
}