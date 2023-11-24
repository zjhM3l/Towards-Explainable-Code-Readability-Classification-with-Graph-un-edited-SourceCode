class Test {
    public class Example {
    public SportsTickerToSML (ExtendedProperties config){
    		super( config );
    		setXslfile( config.getString(ST_XSL_FILENAME_PROPERTY,
    									 DEFAULT_ST_XSL_FILENAME));
    		cat.debug( "config XSL: " + config.getString(ST_XSL_FILENAME_PROPERTY,
    									 DEFAULT_ST_XSL_FILENAME));
    		cat.info( getXslfile() );
    	}
        public void clear() {
    		for (;;) {
    			final Set<CallGraphNode> allNodes = callGraph.allNodes();
    			if (allNodes.isEmpty())	break;
    			final CallGraphNode node = allNodes.iterator().next();
    			delete(node);
    		}
    	}
        private Timer newThreadInterrupt() { 
    		final Thread t = Thread.currentThread();
    		Timer timer = new Timer();
    		timer.schedule(new TimerTask() {
    			public void run() {
    				LOG.debug("going to interrupt [" + t.getName() + "]");
    				t.interrupt();
    				LOG.debug("interrupted.");
    			}
    		}, 1500);
    		return timer;
    	}
    }
}