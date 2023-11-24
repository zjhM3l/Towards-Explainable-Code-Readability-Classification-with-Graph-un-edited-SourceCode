class Test {
    public class Example {
    public boolean isOneWay(String mapName, int segmentNo) {
    		try {
    			String selectStatement = "SELECT COUNT(*) FROM onewaysign WHERE SegmentID=?;";
    			PreparedStatement pstmt = con.prepareStatement(selectStatement);
    			pstmt.setInt(1, this.getSegmentID(mapName, segmentNo));
    			ResultSet result = pstmt.executeQuery();
    			while (result.next()) {
    				int exists = result.getInt(1);
    				return (exists>0);
    			}
    			result.close();
    			pstmt.close();
    		} catch(SQLException sqle) {
    			System.out.println(sqle);
    		}
    		return false;
    	}
        public void selectRootNode() {
            DweezilTreeModel treeModel = (DweezilTreeModel)getModel();
            if(treeModel != null) {
                DefaultMutableTreeNode node = treeModel.getRootNode();
    			selectNode(node);
            }
        }
        public ProfilerSection section(String name){
      if (!sections.containsKey(name)) {
        ProfilerSection sec=new ProfilerSection(name,this);
        sections.put(name,sec);
        return sec;
      }
      return sections.get(name);
    }
    }
}