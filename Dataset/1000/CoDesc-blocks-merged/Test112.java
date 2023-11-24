class Test {
    public class Example {
    private void updateConnection(final String date,final String name,final int newConnections){
      Connection conn=getSQLConnection();
      try (Statement st=conn.createStatement()){
        if (databaseType == POSTGRESQL) {
          st.execute("INSERT INTO " + tablePrefix + "connections VALUES ('"+ name+ "', "+ newConnections+ ", '"+ date+ "')"+ " ON CONFLICT (playername) DO UPDATE SET (connections,date)=('"+ newConnections+ "','"+ date+ "')");
        }
     else {
          st.execute("REPLACE INTO " + tablePrefix + "connections VALUES ('"+ name+ "', "+ newConnections+ ", '"+ date+ "')");
        }
      }
     catch (  SQLException e) {
        plugin.getLogger().log(Level.SEVERE,"SQL error while updating connection: ",e);
      }
    }
        public ComparableOperand createOperand(String javaString, String name, String readableName, Class type){
    		if( type == String.class)
    			return new StringComparableOperand(javaString, name, readableName);
    		return new BooleanOperand(javaString, name, readableName);		
    	}
        public void reload() throws Exception {
    		//first, blank everithing
    		this.clean();
    		//now reload data
    		this.loadFrom(getActualPath(), getModelFileName());
    	}
    }
}