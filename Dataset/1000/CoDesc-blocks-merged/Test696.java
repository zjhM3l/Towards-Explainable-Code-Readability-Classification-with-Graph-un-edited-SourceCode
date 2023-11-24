class Test {
    public class Example {
    public void initializeWizardFrame () {
        // Set up the frame on which each panel will be  placed
              this.getContentPane().setLayout(gbLayout);
              this.setBackground(Color.black);
              this.setSize(600, 350);
              this.setVisible(true);
              this.addWindowListener(new WindowAdapter() {
                 public void windowClosing (WindowEvent we) {
                 // dispose of the frame, but keep the MCUWizard running
                   WizMasterFrame.this.dispose();
                 }
              });
              initializePanels();
            }
        public boolean execute() throws Exception {
            boolean test5 = nativeExecute(TestClass.class, "objInt", "I"); 
    
            return !test5;
        }
        protected int checkHorizontalKey(int key, String message) {
    
    		// Check Key
    		if (key != SwingConstants.LEFT && key != SwingConstants.CENTER &&
    			key != SwingConstants.RIGHT && key != SwingConstants.LEADING &&
    			key != SwingConstants.TRAILING) {
    			throw new IllegalArgumentException(message);
    		} // if
    
    		// Return Key
    		return key;
    
    	} // checkHorizontalKey()
    }
}