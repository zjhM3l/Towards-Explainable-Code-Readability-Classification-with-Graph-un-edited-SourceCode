class Test {
    public class Example {
    public Template getFirstTemplate(String name) {
    		for (Iterator iterator= fTemplates.iterator(); iterator.hasNext();) {
    			Template curr= (Template) iterator.next();
    			if (curr.getName().equals(name)) {
    				return curr;
    			}
    		}
    		return null;
    	}
        private JScrollPane getSpUsers() {
        if (spUsers == null) {
          spUsers = new JScrollPane();
          spUsers.setViewportView(getTbUsers());
          spUsers.setPreferredSize(new java.awt.Dimension(300, 100));
        }
        return spUsers;
      }
        public void addButton(Action action) {
            if (action == null)
                throw new NullPointerException("The button Action must not be null.");
            addButton(new JButton(action));
        }
    }
}