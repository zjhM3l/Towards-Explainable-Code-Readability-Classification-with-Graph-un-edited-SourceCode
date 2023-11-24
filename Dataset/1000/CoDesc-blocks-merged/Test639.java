class Test {
    public class Example {
    protected void add(Object object, Comparable value) {
    		String key = key(object);
    		if (key2value.containsKey(key)) {
    			throw new IllegalStateException("Duplicate key '" + key + "'");
    		}
    		key2value.put(key, value);
    
    		if (value2object.containsKey(value)) {
    			throw new IllegalStateException("Duplicate value '" + value + "'");
    		}
    		value2object.put(value, object);
    	}
        public int compareTo(Object o) {
            // Implicitly tests for the correct type, throwing
            // ClassCastException as required by interface
            String otherLabel = ((LabelValue) o).getLabel();
    
            return this.getLabel().compareTo(otherLabel);
        }
        public void validate(Collection projects)  throws EmeraldjbException {
        // OK, all fkeys need validating and populating with correct
        // references based on the raw data they hold.
        Vector preEnts = new Vector(entities);
        Iterator iter = preEnts.iterator();
        while (iter.hasNext()) {
          Entity entity = (Entity)iter.next();
          entity.validateAndApplyPatterns(projects);
        }
      }
    }
}