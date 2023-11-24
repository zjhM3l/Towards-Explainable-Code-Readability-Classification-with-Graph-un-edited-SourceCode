class Test {
    public class Example {
    public void setTempProperty(String key, String value) {
    		try {
    			RunProperties.getInstance().setRunProperty("summary." + key, value);
    		} catch (Exception exception) {
    			log.log(Level.WARNING, 
    					"Fail to save property key: " + key + ", value: " + value, 
    					exception);
    		}
    	}
        public void addOrganism(Organism o, String phenotype) {
    		o.setCageId(id);
    		o.setId(count);
    		count++;
    
    		OList l = (OList) children.get(phenotype);
    		if (l == null) // no such phenotype, so create new array
    			l = new OList();
    		l.add(o);
    		children.put(phenotype, l);
    	}
        public void addTab(TabProperty prop) {
    		if (m_items == null)
    			m_items = new LinkedList();
    
    		m_items.add(prop);
    	}
    }
}