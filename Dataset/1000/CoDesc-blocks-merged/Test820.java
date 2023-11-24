class Test {
    public class Example {
    public void setCellRenderer(ListCellRenderer newValue) {
    		if (newValue == null)
    			throw new IllegalArgumentException("The list cell renderer must be non null");
    			
    		ListCellRenderer oldValue = cellRenderer;
    		cellRenderer = newValue;
    		firePropertyChange(CELL_RENDERER_CHANGED_PROPERTY, oldValue, newValue);
    	}
        @Override
        public CmsException createException(CmsMessageContainer container, Throwable cause) {
    
            return new CmsDbIoException(container, cause);
        }
        public void destroy() {
    		
    		//super.destroy();
    		
    		System.out.println("destroy agent...");
    		
    		this.listenerIsRunning = false;
    		this.listener = null;
    		
    		// unregister agent
    		UnregisterMessage um = new UnregisterMessage(info.getID());	
    		ReplyMessage rm = send(um);
    
    
    		if(rm.getReply() != ReplyMessage.OK) 
    			System.out.println("not able to unregister: " + rm.getReply());
    	}
    }
}