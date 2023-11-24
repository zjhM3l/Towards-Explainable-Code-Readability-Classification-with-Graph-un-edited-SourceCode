class Test {
    public class Example {
    public void preloadItems() {
    
    		// check if there are any items present, load some if not
    		if(dao.findAll(JsffullcrudItem.class).isEmpty()){
    
    			// use the dao to preload some data here
    			dao.save( new JsffullcrudItem("Preload Title", 
    					"Preload Owner", "Preload Site", Boolean.TRUE, new Date()) );
    
    			log.info("Preloaded " + dao.countAll(JsffullcrudItem.class) + " items");
    		}
    	}
        public boolean selectByPrimary(TileID id) throws SQLException {
            PreparedStatement pstmt = connection.prepareStatement("SELECT id FROM " + table + " WHERE id=?");
            pstmt.setInt(1, id.getValue());
            ResultSet ret = pstmt.executeQuery();
            boolean result = ret.next();
            pstmt.close();
            return result;
        }
        private WCMGraph1DBean getGraphF() {
    		if (graphF == null) {
    			graphF = new WCMGraph1DBean();
    			if (presentation) {
    				graphF.setLineWidth(3.0f);
    			}
    			graphF.setFunction(getWCMExpressionInputBean());
    		}
    		return graphF;
    	}
    }
}