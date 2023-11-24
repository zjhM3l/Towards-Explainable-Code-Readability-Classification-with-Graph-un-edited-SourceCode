class Test {
    public class Example {
    public MemberReferenceList getReferences(Method m) {
    		Debug.assert(m);
    		updateModel();
    		MutableSet references = (MutableSet) element2references.get(m);
    		if (references == null) {
    			return MemberReferenceList.EMPTY_LIST;
    		}
    		int s = references.size();
    		if (s == 0) {
    			return MemberReferenceList.EMPTY_LIST;
    		}
    		MemberReferenceMutableList result = new MemberReferenceArrayList(s);
    		for (Enumeration e = references.elements(); s > 0; s -= 1) {
    			result.add((MemberReference) e.nextElement());
    		}
    		return result;
    	}
        public void resetIsModified() {
            id_is_modified = false;
            label_is_modified = false;
            deleted_is_modified = false;
        }
        public CapNode parent(CapNode node) {
    
            CapNode  parent   = null;
            Iterator iterator = edges.iterator();
    
            while (iterator.hasNext()) {
                CapEdge edge = (CapEdge) iterator.next();
    
                if (edge.getChildNode().equals(node)) {
                    parent = edge.getParentNode();
    
                    break;
                }
            }
    
            return parent;
        }
    }
}