class Test {
    public class Example {
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
            
    if ("AdParamServiceInterfacePort".equals(portName)) {
                setAdParamServiceInterfacePortEndpointAddress(address);
            }
            else 
    { // Unknown Port Name
                throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
            }
        }
        static synchronized public DBConnectionManager getInstance() {
            if (instance == null) {
                instance = new DBConnectionManager();
            }
            clients++;
            return instance;
        }
        protected String getRegistry() {
            if (!RuntimeMode.isOpenShiftMode(getProject().getProperties())) {
                return getConfigWithFallback(Config.registry, "fabric8.generator.registry", null);
            }
    
            return null;
        }
    }
}