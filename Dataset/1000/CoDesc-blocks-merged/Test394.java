class Test {
    public class Example {
    protected A newInstance() {
            
            return delegate.getInstance();
            
        }
        private Node getIthElementChild(int i){
    		int count=-1;
    		for (int j=0; j<this.domNode.getChildNodes().getLength(); j++){
    			if (this.domNode.getChildNodes().item(j).getNodeType()==1){
    				if (++count==i) return this.domNode.getChildNodes().item(j);
    			}
    		}
    		return null;
    	}
        private void doShutdown() {
          LoggingService.getInstance().serverLog("\nShutting down...");
          stopRunning();
          LoggingService.getInstance().writeObject();
          Statistics.writeObject();
          CronService.writeObject();
          
          //stop all active libraries
          if (libraries != null) {
             for (SoundLibrary library : libraries) {
                library.stopActiveLibrary();
             }
          }
          //stop services
          if (inputServices != null) {
             for (InputService inputService : inputServices) {
                inputService.stopRunning();
             }
          }
          try {
             mainThread.interrupt();
          } catch (Exception e) {
             LoggingService.getInstance().serverLog("Error releasing the server: ");
             e.printStackTrace(LoggingService.getInstance().getServerLog());
          }
       }
    }
}