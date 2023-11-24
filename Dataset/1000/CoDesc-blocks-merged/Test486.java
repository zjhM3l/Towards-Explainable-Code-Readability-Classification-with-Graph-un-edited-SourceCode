class Test {
    public class Example {
    private void removeNode(DeltaTarget target, Node node) {
    	    if (target instanceof InternalGraph) {
    	        ((InternalGraph) target).removeNodeWithoutCheck(node);
    	    } else {
    	        // apparently the target wasn't an InternalGraph
    	        // so we can't do efficient edge removal
    	    	target.removeNode(node);
    	    }
    	}
        public static void stop ( CommandSender self , int groupMask ) {
      sendPacket ( new byte [ ] {
        ( byte ) COMMAND_STOP , groupMask }
        ) ;
      }
        public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
            if ("konga_odbc_infoprovider".equals(portName)) {
                setkonga_odbc_infoproviderEndpointAddress(address);
            }
            else { // Unknown Port Name
                throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
            }
        }
    }
}