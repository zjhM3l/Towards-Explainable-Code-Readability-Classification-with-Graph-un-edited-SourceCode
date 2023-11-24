class Test {
    public class Example {
    private BSPTree<Euclidean1D> previousInternalNode(BSPTree<Euclidean1D> node){
      if (childBefore(node).getCut() != null) {
        return leafBefore(node).getParent();
      }
      while (isBeforeParent(node)) {
        node=node.getParent();
      }
      return node.getParent();
    }
        private static String concat(Collection<String> col)
    	{
    		StringBuilder b = new StringBuilder();
    		boolean first = true;
    		for (String s : col)
    		{
    			if (first)
    				first = false;
    			else
    				b.append(";");
    
    			b.append(s);
    		}
    		return b.toString();
    	}
        public void removeFileVersion(int versionNumber) {
    	   	if (fileVersions == null) fileVersions=new ArrayList();
        	for (int i=0; i<fileVersions.size(); ++i) {
        		VersionAttachment v = (VersionAttachment)fileVersions.get(i);
        		if (v.getVersionNumber() == versionNumber) {
        			fileVersions.remove(v);
        			v.setOwner((AnyOwner)null);
        			v.setParentAttachment(null);
        			break;
        		}
        	}
        }
    }
}