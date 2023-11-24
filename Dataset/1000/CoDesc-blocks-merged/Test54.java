class Test {
    public class Example {
    public void save(PosRole entity) {
    		LogUtil.log("saving PosRole instance", Level.INFO, null);
    		try {
    			entityManager.persist(entity);
    			LogUtil.log("save successful", Level.INFO, null);
    		} catch (RuntimeException re) {
    			LogUtil.log("save failed", Level.SEVERE, re);
    			throw re;
    		}
    	}
        public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
            
    if ("DynamicServiceSample".equals(portName)) {
                setDynamicServiceSampleEndpointAddress(address);
            }
            else 
    { // Unknown Port Name
                throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
            }
        }
        protected boolean matchesFilter(String input, String[] filter) {
    		for (String match : filter) {
    			if (!input.contains(match))
    				return false;
    		}
    		return true;
    	}
    }
}