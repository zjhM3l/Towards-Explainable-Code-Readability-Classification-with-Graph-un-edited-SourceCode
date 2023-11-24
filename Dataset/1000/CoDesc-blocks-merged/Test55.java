class Test {
    public class Example {
    private void addNewLine(){
      if (addLineDialog == null) {
        addLineDialog=new AddParallelLineDialog();
      }
      addLineDialog.setChartEngine(engine);
      addLineDialog.showDialog();
      if (horizontalLineRadiobutton.isSelected()) {
        setHorizontalLineSelected();
      }
     else   if (verticalLineRadiobutton.isSelected()) {
        setVerticalLineSelected();
      }
    }
        public void setConnections(Object handle, Collection elems) {
            if (handle instanceof MAssociation && elems instanceof List) {
                ((MAssociation) handle).setConnections((List) elems);
                return;
            }
            if (handle instanceof MLink && elems instanceof List) {
                ((MLink) handle).setConnections(elems);
                return;
            }
            throw new IllegalArgumentException("handle: " + handle);
        }
        public int query(String statement){
    		
    		int insertId = 0;
    		Statement stmt;
    		try{
    			stmt = con.createStatement();
    			stmt.executeUpdate(statement);
    			ResultSet rs = stmt.executeQuery("SELECT LAST_INSERT_ID() AS ID");
    			if(rs.first()){
    				insertId = rs.getInt("id");
    			}
    
    		}
    		catch (SQLException e){
    			Debug.out("DBConnect.query() - Possibly problems with authentication...!");
    			e.printStackTrace();
    		}
    		return insertId;
    	}
    }
}