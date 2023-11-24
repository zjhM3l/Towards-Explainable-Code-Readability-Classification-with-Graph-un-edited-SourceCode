class Test {
    public class Example {
    public TreeNode getTreeNodeForPipelineStage(TreeNode pipeNode, String stage) {
        if(pipeNode!=null) {
          for(int i = 0; i < pipeNode.getChildCount(); ++i) {
            TreeNode treeNode = pipeNode.getChildAt(i);
            if(stage.equals(treeNode.toString())) {
              return treeNode;
            }
          }
        }
        return null;
      }
        private JTextField getCityfield() {
    		if (cityfield == null) {
    			cityfield = new JTextField();
    		}
    		return cityfield;
    	}
        public static CPAttachmentFileEntry fetchByC_C_First(long classNameId,
    		long classPK, OrderByComparator<CPAttachmentFileEntry> orderByComparator) {
    		return getPersistence()
    				   .fetchByC_C_First(classNameId, classPK, orderByComparator);
    	}
    }
}