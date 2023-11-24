class Test {
    public class Example {
    private JButton getJButton() {
    		if (jButton == null) {
    			jButton = new JButton();
    			jButton.setPreferredSize(new Dimension(68, 25));
    			jButton.setText(" OK ");
    			jButton.addActionListener(new java.awt.event.ActionListener() {
    				public void actionPerformed(java.awt.event.ActionEvent e) {
    					caixamail=jTextField.getText();
    					esconde();
    				}
    			});
    		}
    		return jButton;
    	}
        private Color hexRGBToColor(String hexStr) throws SAXParseException {
    		if (!hexStr.startsWith("#") || hexStr.length()!=7)
    			throw new SAXParseException("Wrong color formatting", locator); // [SR:pending] localize
    		int red = Integer.parseInt(hexStr.substring(1,3),16);
    		int green = Integer.parseInt(hexStr.substring(3,5),16);
    		int blue = Integer.parseInt(hexStr.substring(5,7),16);
    		return new Color(red,green,blue);
    	}
        public void test_030_supports() {
        try {
          this.runTests();
        } catch (Exception e) {
          this.fail(e);
        } finally {
          this.trackMemoryUse();
        }
      }
    }
}