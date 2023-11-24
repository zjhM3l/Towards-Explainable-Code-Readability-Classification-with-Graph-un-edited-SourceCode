class Test {
    public class Example {
    private JButton getJButton2() {
    		if (jButton2 == null) {
    			jButton2 = new JButton();
    			jButton2.setBounds(260, 170, 100, 30);
    			jButton2.setText("cancel");
    			jButton2.addMouseListener(new java.awt.event.MouseAdapter() { 
    				public void mouseClicked(java.awt.event.MouseEvent e) {    
    					inputServerName.setText("");
    					inputIpAddress.setText("");
    					inputServerPort.setText("");
    					inputDescription.setText("");
    					inputType.setText("");
    					insertServerPanel.setVisible(false);
    					startPanel.setVisible(true);
    				}
    			});
    		}
    		return jButton2;
    	}
        public boolean isWrapperFor(Class<?> iface) throws SQLException {
    
    		boolean isInstance = iface.isInstance(this);
    
    		if (isInstance) {
    			return true;
    		}
    
    		String interfaceClassName = iface.getName();
    		
    		return (interfaceClassName.equals("com.mysql.jdbc.Statement")
    				|| interfaceClassName.equals("java.sql.Statement")
    				|| interfaceClassName.equals("java.sql.Wrapper"));
    	}
        public PXContextualItem contextualItemForItemIdentifier(WOComponent page, String identifier) {
    		PXContextualItem item = new PXContextualItem(identifier);
    
    		if (PresViewDemoIdentifier.equals(identifier)) {
    			item.setLabel("View Demo");
    			item.setTarget(this);
    			item.setAction("handleViewDemoCommand");
    		} else if (ScreenPreviewIdentifier.equals(identifier)) {
    			item.setLabel("Preview This Screen");
    			item.setTarget(this);
    			item.setAction("handleScreenPreviewCommand");
    		} else {
    			item = null;
    		}
    
    		return item;
    	}
    }
}