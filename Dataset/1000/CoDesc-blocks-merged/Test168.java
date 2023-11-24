class Test {
    public class Example {
    private void removeChildNodes(SessionNode node) throws RepositoryException {
    
            NodeManager nodeManager = node.getNodeManager();
    
            List childNodes = nodeManager.getNodes();
            for (Iterator iter = childNodes.iterator(); iter.hasNext();) {
                SessionNode childNode = (SessionNode) iter.next();
                childNode.getState().remove(childNode);
            }
        }
        public void setInterfacepackage(String interfacePackage) {
          if (interfacePackage.trim().equals("")) {
             throw new IllegalArgumentException("Can't use empty String for interfacepackage!");
          }
          _interfacePackage = interfacePackage;
       }
        public void listComPortsAndOwners(boolean connectToAllDiscoveredPhones) {
    		LOG.trace("ENTER");
    		Enumeration<CommPortIdentifier> portIdentifiers = CommUtils.getPortIdentifiers();
    		LOG.debug("Getting ports...");
    		while (portIdentifiers.hasMoreElements()) {
    			requestConnect(portIdentifiers.nextElement(), connectToAllDiscoveredPhones);
    		}
    		LOG.trace("EXIT");
    	}
    }
}