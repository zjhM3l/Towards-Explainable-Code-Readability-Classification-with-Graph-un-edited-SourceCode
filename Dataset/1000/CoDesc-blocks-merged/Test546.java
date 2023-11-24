class Test {
    public class Example {
    private JMenuItem getJCopyPopupItem() {
    		if (jCopyPopupItem == null) {
    			jCopyPopupItem = new JMenuItem();
    			jCopyPopupItem.setText("Copy");
    			jCopyPopupItem.addActionListener(new java.awt.event.ActionListener() {
    				public void actionPerformed(java.awt.event.ActionEvent e) {
    					copy(); // TODO Auto-generated Event stub actionPerformed()
    				}
    			});
    		}
    		return jCopyPopupItem;
    	}
        public void selectedByList(java.lang.Object target) {
            Util.pushTrace("TestGUI(activatedByList)");
            Util.db("Selected object = " + target);
    
            if (ignoreRequest_) {
                Util.db("Ignoring request to change object");
                return;
            }
    
            setAll(false);
    
            Offer o = ((TraderAndOffer) target).offer;
            // printAllProperties(o);
            propertySearchDisplay.setPropertiesFor(o);
            propertySearchDisplay.setVisible(true);
    
            setAll(true);
    
            Util.popTrace();
        }
        public int countWhere(String where) throws SQLException {
            String sql = "select count(*) as MCOUNT from GAMEDATA " + where;
            Connection c = null;
            Statement pStatement = null;
            ResultSet rs =  null;
            try {
                int iReturn = -1;
                c = getConnection();
                pStatement = c.createStatement();
                rs =  pStatement.executeQuery(sql);
                if (rs.next()) {
                    iReturn = rs.getInt("MCOUNT");
                }
                if (iReturn != -1)
                    return iReturn;
            } finally {
                getManager().close(pStatement, rs);
                freeConnection(c);
            }
           throw new SQLException("Error in countWhere");
        }
    }
}