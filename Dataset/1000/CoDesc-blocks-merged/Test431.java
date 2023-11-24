class Test {
    public class Example {
    public void copySelection() {
        if(mode==MODE_PLAY) return;
        if(mode==MODE_LIB) return;
        if(selObjects.size()==0) return;
        addObjectToClipboard(selObjects);
      }
        @Bean
        public DataSource dataSource_plain() {
            
            SimpleDriverDataSource ds =
                    new SimpleDriverDataSource();
            
            ds.setDriverClass(null);
            ds.setUrl("jdbc:oracle:thin:@<server>[:<1521>]:<database_name>");
            ds.setUsername("");
            ds.setPassword("");
            
            return ds;
        }
        public boolean loadFile(String filename, boolean privateCopy) {
    		usePluginQ(true);
    		callListeners(LI_BEFORELOAD, filename);
    		doLoad(filename, privateCopy);
    		callListeners(LI_AFTERLOAD, filename);
    		usePluginQ(false);
    		
    		return true;	
    	}
    }
}