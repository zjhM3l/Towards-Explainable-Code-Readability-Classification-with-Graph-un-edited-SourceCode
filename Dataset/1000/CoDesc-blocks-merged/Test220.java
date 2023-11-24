class Test {
    public class Example {
    public Optional<WikiPage> getOptionalPage(Object projectIdOrPath, String slug) {
            try {
                return (Optional.ofNullable(getPage(projectIdOrPath, slug)));
            } catch (GitLabApiException glae) {
                return (GitLabApi.createOptionalFromException(glae));
            }
        }
        public void restoreState(int index,PdfCanvas cb){
      int pops;
      if (index < 0)   pops=Math.min(-index,savedStates.size());
     else   pops=Math.max(savedStates.size() - index,0);
      if (pops == 0)   return;
      MetaState state=null;
      while (pops-- != 0) {
        cb.restoreState();
        state=savedStates.pop();
      }
      setMetaState(state);
    }
        public void updateNamespaceMappings(Node node, boolean deepSearch) {
    		if (node.getNodeType() == Node.ELEMENT_NODE) {
    			final Map<String, String> namespaces = getNamespaces(
    					(Element) node, deepSearch);
    			final Element root = getFragmentElement(getFragment(node));
    			DOMMutils.createXmlnsAttributes(root, namespaces);
    		}
    	}
    }
}