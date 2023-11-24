class Test {
    public class Example {
    public void addConnectionFrom(Node n) {
    		if (connectedFrom.contains(n)) {
    			System.out.println("connectFrom error: already connected");
    			return;
    		} else
    			connectedFrom.add(n);
    
    		System.out
    				.println("Connected to " + getName() + " from " + n.getName());
    	}
        public boolean equals(final ADS.Iterator i) {
            if (! (i instanceof Iterator))
              return false ;
            return (getContainer() == i.getContainer()) &&
             currentItem.equals(((Iterator)i).currentItem) ;
          }
        private void disable(final String login) {
            try {
                Connection conn = null;
                boolean autoCommit = false;
                try {
                    conn = pool.getConnection();
                    autoCommit = conn.getAutoCommit();
                    conn.setAutoCommit(true);
                    final PreparedStatement update = conn.prepareStatement(
                            "update passwords set enabled=? "
                            + "where userId=?");
                    try {
                        update.setBoolean(1, false);
                        update.setString(2, login);
                        update.executeUpdate();
                    } finally {
                        if(update!=null) update.close();
                    }
                } finally {
                    if(conn!=null) {
                        conn.setAutoCommit(autoCommit);
                        conn.close();
                    }
                }
            } catch(SQLException sqle) {
                log.log(Level.SEVERE, "Error disbaling user " + login, sqle);
            }
        }
    }
}