class Test {
    public class Example {
    public void setSize(int newSize) {
    		int oldSize = size;
    		size = newSize;
    		if (eNotificationRequired())
    			eNotify(new ENotificationImpl(this, Notification.SET,
    					IrPackage.TYPE_UINT__SIZE, oldSize, size));
    	}
        public void setPolicy(Policy policy) {
    		this.policy = policy;
    		if (smtp_state == SMTP_NEW) {
    			smtp_state = SMTP_WRITING;
    			response = policy.getGreeting(this);
    			// reset buffer and get ready to read from an empty
    			// buffer.  that's how this class' read() method knows
    			// it's time to actually read from the channel (we
    			// only read a line at a time from the buffer, so
    			// if the remote mta pipelines there might be more data
    			// after the end of a line)
    			remoteReadBB.clear().flip();
    		}
    	}
        protected void disposeNode() {
    		// Remove ID identifier into DOM Document
    		String id = getId();
    		if (!StringUtils.isEmpty(id)) {
    			((CoreDocumentImpl) this.getOwnerDocument()).removeIdentifier(id);
    		}
    		disposeNode(this);
    	}
    }
}