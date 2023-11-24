class Test {
    public class Example {
    public void incomingMessage() {
    	try {
    	    SipMessage newMessage = (SipMessage) mQueue.dequeueHead().obj();
    
    	    switch ( newMessage.getType() ) {
    	    case SipMessage.Request:
    		incomingRequestMessage( (SipRequestMessage) newMessage );
    		break;
    	    case SipMessage.Response:
    		incomingResponseMessage( (SipResponseMessage) newMessage );
    		break;
    	    default:
    		System.err.println( "SipClient: bad incoming message type" );
    		return;
    	    }
    
    	    CallEventMulticaster cemc = CallEventMulticaster.getMulticaster();
    	    cemc.dispatchEvents();
    	}
    	catch( InterruptedException ie ) {
    	    ie.printStackTrace( System.err );
    	}
        }
        public SimpleEventAdapter createListener(Object listener, String methodName){
    		SimpleEventAdapter adapter = new SimpleEventAdapter();
    		adapter.setListener(listener);
    		adapter.setMethodName(methodName);
    		return adapter;
    	}
        public SimpleJob setJoin(String[] masterLabels, String[] masterColumns,
                                 String[] dataColumns, String masterPath) throws IOException, URISyntaxException {
            String separator = conf.get(SEPARATOR);
            return setJoin(masterLabels, masterColumns, dataColumns, masterPath, separator, false, DEFAULT_AUTOSOMEJOIN_THRESHOLD);
        }
    }
}