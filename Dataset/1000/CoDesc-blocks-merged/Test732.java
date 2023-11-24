class Test {
    public class Example {
    public boolean isRendered() {
            if (!UserRoleUtils.isVisibleOnUserRole(this))
                return false;
            //return super.isRendered();
            if (_rendered != null) return _rendered.booleanValue();
            ValueBinding vb = getValueBinding("rendered");
            Boolean v = vb != null ? (Boolean)vb.getValue(getFacesContext()) : null;
            return v != null ? v.booleanValue() : DEFAULT_RENDERED;
        }
        public int getLabelSize(int frequency) {
    		// Lineal interpolation
    		//int multiplier = (MAX_FONT_SIZE-MIN_FONT_SIZE)/(maxFrequency-minFrequency);  
    		//int fontSize = MIN_FONT_SIZE + ((maxFrequency-(maxFrequency-(frequency-minFrequency)))*multiplier);
    		
    		// Logarithmic interpolation
    		double weight = (Math.log(frequency) - Math.log(minFrequency)) / (Math.log(maxFrequency) - Math.log(minFrequency));
    		int fontSize = MIN_FONT_SIZE + (int)Math.round((MAX_FONT_SIZE - MIN_FONT_SIZE) * weight);  
    		
    		return fontSize;
    	}
        private void fillUpPartitions() {
    		Set<Event> rest = new TreeSet<Event>(table.getUnpartitionedEvents());
    		if (!rest.isEmpty()) {
    			Partition p = new Partition(rest);
    
    			String name = showNameDialog(Messages.getString("em",
    					"PartitionPanel.DefaultPartitionName")
    					+ ""
    					+ (observations.size() + 1));
    			if (name != null) {
    				p.setName(name);
    				observations.add(p);
    				((PartitionListModel) partitionList.getModel())
    						.setElements(observations);
    
    				bRemove.setEnabled(true);
    			} else {
    				p.remove();
    			}
    
    			table.clearSelection();
    		}
    	}
    }
}