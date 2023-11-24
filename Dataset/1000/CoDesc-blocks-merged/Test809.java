class Test {
    public class Example {
    public Container getContainer() {
            if( container==null ) {
                // Lazy - maybe it was added later
                findContainer();
            }
            return (container);
    
        }
        public Object put(Object key, Object value) {
    		String name = key.toString();
    		Object ret = getProperty(name);
    		setProperty(name, value, TYPE_UNDEFINED);
    		return ret;
    	}
        protected void validateWarnings() {
    		for (Polygon polygon : getPolygons()) {
    			addWarnings(polygon.getValidationWarnings(), false);
    		}
    		for (Point point : getPoints()) {
    			addWarnings(point.getValidationWarnings(), false);
    		}
    	}
    }
}