class Test {
    public class Example {
    public boolean equals(final Object object, boolean checkWeakness) {
            boolean result = (object != null) && (object instanceof Tag);
    
            if (result) {
                final Tag that = (Tag) object;
    
                if (checkWeakness) {
                    result = (that.isWeak() == isWeak());
                }
    
                if (result) {
                    if (getName() == null) {
                        result = (that.getName() == null);
                    } else {
                        result = getName().equals(that.getName());
                    }
                }
            }
    
            return result;
        }
        public ArrayList getEmployees(int listSize, boolean isDescending, String sortColumn) {
    
            ArrayList employees = getEmployees(listSize);
            // sour our list
            Collections.sort(employees, new EmployeeComparator(isDescending, sortColumn));
    
            return employees;
        }
        public ArrayList getText(Object[] args) {
    	ArrayList text = new ArrayList();
    	for(Iterator i=iterator(); i.hasNext();) {
    	    StringBuffer line_buf = new StringBuffer();
    	    List line = (List)i.next();
    	    for(Iterator j=line.iterator(); j.hasNext();) {
    		DataLayoutItem item = (DataLayoutItem)j.next();
    		line_buf.append(item.getItem(args));
    	    }
    	    if(line_buf.length()>0)
    	       text.add(line_buf.toString());
    	}
    
    	if(text.size()==0)
    	    return null;
    	else
    	    return text;
        }
    }
}