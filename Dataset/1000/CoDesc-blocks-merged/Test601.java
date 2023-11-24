class Test {
    public class Example {
    private void stopThreads() {
            if (scannerThread != null) {
                scannerThread.shutdown();
                scannerThread = null;
            }
            if (busmonitor != null) {
                busmonitor.shutdown();
                busmonitor=null;
            }
        }
        public void dispatchEvent(CoefficientEvent event){
    		CoefficientEventHandler[] handlers = EventHandlerRegistry.getInstance().getHandlers(event.getClass());
    		if (handlers == null) return;
    		for (int i = 0; i < handlers.length; i++) {			
    			//TODO: think about remote invocation	
    			handlers[i].handleEvent(event);
    		}
    	}
        public static boolean isInstanceOf(final Object object, final Class target) {
    		if (object == null || target == null) {
    			return false;
    		}
    		return target.isInstance(object);
    	}
    }
}