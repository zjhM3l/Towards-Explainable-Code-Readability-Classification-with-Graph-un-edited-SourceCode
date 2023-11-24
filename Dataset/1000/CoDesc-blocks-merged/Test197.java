class Test {
    public class Example {
    private void initialize() {
    		this.setBorder(BorderFactory.createTitledBorder(BorderFactory
    				.createLineBorder(robot.getColor(), 2), " " + robot.getName()
    				+ " ", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
    				new Font("Dialog", Font.BOLD, 12)));
    		this.setBackground(Color.WHITE);
    		this.setPreferredSize(new Dimension(110, 105));
    
    	}
        private JMenuItem getSearchPatientMItem() {
    		if (m_SearchPatientMItem == null) {
    			m_SearchPatientMItem = new JMenuItem();
    			m_SearchPatientMItem.setText("Patient ausw�hlen ");			
    			m_SearchPatientMItem.addActionListener(new java.awt.event.ActionListener() { 
    				public void actionPerformed(java.awt.event.ActionEvent e) {     
    					if(checkCenterPanelSet()){
    					
    						m_SearchPatientMItem.setEnabled(true);
    					PatientSearch pSearch = new PatientSearch(MainFrame.this, 
    							true, m_UserHandler);
    					pSearch.setVisible(true);
    					}
    				}
    			});
    		}
    		return m_SearchPatientMItem;
    	}
        public void dispose() {
    		if (disposed) {
    			return;
    		}
    
    		if (breakpoints != null) {
    			for (IBreakpoint breakpoint : breakpoints) {
    				try {
    					if (breakpoint.isRegistered()) {
    						breakpoint.delete();
    					}
    				} catch (CoreException e) {
    					throw new RuntimeException(e);
    				}
    			}
    
    			breakpoints = null;
    		}
    
    		disposed = true;
    	}
    }
}