class Test {
    public class Example {
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
            if ("SemanticBindingPortTypePort".equals(portName)) {
                setSemanticBindingPortTypePortEndpointAddress(address);
            }
            else { // Unknown Port Name
                throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
            }
        }
        public void setFocus() {
    		final Component focus = componentSource.first();
    		if (focus != null) {
    			focus.add(new FocusBehavior());
    		}
    	}
        public void windowLostFocus(WindowEvent e) {
    
    		if ((e.getOppositeWindow()==null)||(e.getOppositeWindow().getOwner()!=this)) {
    			hideFrame();
    		}
    	}
    }
}