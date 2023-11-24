class Test {
    public class Example {
    protected void observe(Event event, List<IObservableValue> newValues) {
    		myPreviousValueEvent = event;
    		if (newValues.equals(myPreviousValues)) {
    			return;
    		}
    
    		for (final IObservableValue v : myPreviousValues) {
    			v.removeChangeListener(myObservedChangeListener);
    		}
    		myPreviousValues.clear();
    		for (final IObservableValue v : newValues) {
    			v.addChangeListener(myObservedChangeListener);
    		}
    		myPreviousValues.addAll(newValues);
    	}
        public Rectangle getClipBounds() {
        Rectangle r = gd.getClipBounds();
        if (r == null)
          return null;
        else
          return new Rectangle( round(((float)r.x)/xScale),
    			    round(((float)r.y)/yScale),
    			    round(((float)r.width)/xScale),
    			    round(((float)r.height)/yScale));
      }
        private String messageResourceNotFound(Locale locale) {
    
    
    
            return Messages.get().getBundle(locale).key(Messages.ERR_ALIAS_RESOURCE_NOT_FOUND_0);
    
    
    
        }
    }
}