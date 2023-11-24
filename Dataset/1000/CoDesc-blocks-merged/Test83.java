class Test {
    public class Example {
    private String checkLooseEndsTableNameConflict(String clearname, int attempt)
        {
            Enumeration e = getVariables();
            while (e.hasMoreElements()) {
                BaseType bt = (BaseType) e.nextElement();
                String btName = bt.getEncodedName();
    
                //LogStream.out.println("bt: '"+btName+"'  dataset: '"+name+"'");
    
                if (btName.equals(clearname)) {
                    clearname = repairLooseEndsTableConflict(clearname, attempt++);
                    clearname = checkLooseEndsTableNameConflict(clearname, attempt);
                }
            }
    
            AttributeTable at = getAttributeTable();
            e = at.getNames();
            while (e.hasMoreElements()) {
                String aName = (String) e.nextElement();
                if (aName.equals(clearname)) {
                    clearname = repairLooseEndsTableConflict(clearname, attempt++);
                    clearname = checkLooseEndsTableNameConflict(clearname, attempt);
                }
            }
            return (clearname);
        }
        public void testAddOfficeAdministratorInstance() {
    		// Add two different administrators verifying details
    		this.replayMockObjects();
    		OfficeAdministrator admin = this.node.addOfficeAdministrator("ADMIN",
    				new ClassAdministratorSource());
    		assertNotNull("Must have administrator", admin);
    		assertEquals("Incorrect administrator name", "ADMIN",
    				admin.getOfficeAdministratorName());
    		assertNotSame("Should obtain another administrator", admin,
    				this.node.addOfficeAdministrator("ANOTHER",
    						new ClassAdministratorSource()));
    		this.verifyMockObjects();
    	}
        protected Insets getVisualMargin(Component c, Insets insets) {
            Insets i = super.getVisualMargin(c, insets);
            if (UIManager.getBoolean("ComboBox.harmonizePreferredHeight")) {
                if (! ((JComboBox) c).isEditable()) {
                    i.top += 1;
                    i.bottom += 1;
                }
            }
            return i;
        }
    }
}