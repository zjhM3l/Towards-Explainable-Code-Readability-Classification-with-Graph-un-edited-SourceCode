class Test {
    public class Example {
    private JMenuItem getMiExit() {
    		if (miExit == null) {
    			miExit = new JMenuItem(new ImageIcon(UserInterface.class.getResource(RSC_LOC + "exit.png")));
    			miExit.setText("Exit");
    		}
    		return miExit;
    	}
        public boolean equals(Object other) {
            if (!(other instanceof TestCollisionListener)) {
                return false;
            }
            TestCollisionListener otherTestCollisionListener =
                                (TestCollisionListener) other;
    
            if (this.toString().equals(otherTestCollisionListener.toString())) {
                return true;
            }
            return false;
        }
        public boolean equals(Object obj) {
        if (obj instanceof LocationObject) {
          LocationObject cmp=(LocationObject)obj;
          if (getLocation()!=cmp.getLocation() &&
               (getLocation()==null || !getLocation().equals(cmp.getLocation()))
              ) return false;
          return true;
        }
        return false;
      }
    }
}