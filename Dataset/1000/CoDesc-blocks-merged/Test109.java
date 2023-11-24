class Test {
    public class Example {
    public Seconds minus(Seconds seconds) {
            if (seconds == null) {
                return this;
            }
            return minus(seconds.getValue());
        }
        public void printBlockAlign(String block, Vector sources, Vector targets) {
        newLine();
        print("ALIGN " + block + " <");
        for (int i = 0; i < sources.size(); i++) {
          if (i != 0) {
    	print(", ");
          }
          print(sources.elementAt(i).toString());
          print("-");
          print(targets.elementAt(i).toString());
        }
        print(">");
      }
        private JTabbedPane getJTabbedPane1() {
    		if (jTabbedPane1 == null) {
    			jTabbedPane1 = new JTabbedPane();
    			jTabbedPane1.setPreferredSize(new Dimension(176, 48));
    			jTabbedPane1.addTab("snapshot", null, getJPanel41(), null);
    			jTabbedPane1.addTab("search", null, getJPanel51(), null);
    		}
    		return jTabbedPane1;
    	}
    }
}