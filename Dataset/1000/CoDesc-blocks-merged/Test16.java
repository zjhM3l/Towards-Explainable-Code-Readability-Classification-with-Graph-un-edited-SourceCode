class Test {
    public class Example {
    public DataLine getSelectedDataLine() {
            int selected = getSelectedRow();
            if(selected != -1)
                return ((DataLineModel)dataModel).get(selected);
            else
                return null;
        }
        public void removeNodeFromParent(DefaultMutableTreeNode node, boolean removeChildlessParent) {
            DefaultMutableTreeNode parent = (DefaultMutableTreeNode) node.getParent();
            treeModel.removeNodeFromParent(node);
            if (removeChildlessParent && parent.getChildCount() < 1) {
                treeModel.removeNodeFromParent(parent);
            }
        }
        public Boolean closeMainview() {
    		if(closeOpenWorkingFile() == RET_OK) {
    			
    			/* user accepts that the system will exit */
    			closeWorkingFile();
    			restoreDefaults();
    			/* controller cleans up on exit */
    			controller.tidyUp();
    
    			return true;
    		}	
    		/* user rejects the system exiting */
    		return false;
    	}
    }
}