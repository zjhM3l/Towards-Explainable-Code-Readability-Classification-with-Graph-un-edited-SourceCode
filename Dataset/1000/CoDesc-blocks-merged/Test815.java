class Test {
    public class Example {
    public RrdGraphDef getEmptyGraphDef() {
            RrdGraphDef retValue = getGraphDesc().getEmptyGraphDef();
            retValue.setTitle(getGraphTitle());
            return retValue;
        }
        public double getLength2() {
    		// get the body anchor point in world space
    		Vector2 ba = this.body2.getWorldPoint(this.localAnchor2);
    		return this.pulleyAnchor2.distance(ba);
    	}
        protected void fireEventOccurred(EventType e) {
    
    		if (listeners.size() > 0) {
    			// new ondex event
    			ONDEXEvent oe = new ONDEXEvent(this, e);
    			// notify all listeners
    
    			for (ONDEXListener listener : listeners) {
    				listener.eventOccurred(oe);
    			}
    		}
    	}
    }
}