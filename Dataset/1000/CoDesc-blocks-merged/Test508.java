class Test {
    public class Example {
    public JCheckBox getJCheckBoxEnzimas() {
    		if (jCheckBoxEnzimas == null) {
    			jCheckBoxEnzimas = new JCheckBox();
    			jCheckBoxEnzimas.setOpaque(false);
    			jCheckBoxEnzimas.setSize(new Dimension(84, 21));
    			jCheckBoxEnzimas.setLocation(new Point(64, 290));
    			jCheckBoxEnzimas.setText("Enzimas");
    			jCheckBoxEnzimas.setCursor(new Cursor(Cursor.HAND_CURSOR));
    		}
    		return jCheckBoxEnzimas;
    	}
        protected Connection getConnection() {
        Connection conn = null;
    
        try {
          // hopefully the getConnection is synchronized
          conn = db.getConnection();
        } catch (SQLException e) {
          errorLogger.warn("SQLException" + e);
        }
        return conn;
      }
        public static String forPrint ( Object self ) {
      String s = "\033[34m" + self . getObjectInfo ( ) + "\033[0m" ;
      s += "\n" ;
      s += self . asString ( ) ;
      return s ;
    }
    }
}