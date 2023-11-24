class Test {
    public class Example {
    public void test4() {
            try {
                Object o = java.lang.PackageAccessible
                        .getProtectedClassInstance();
                Constructor c = o.getClass().getDeclaredConstructor((Class[]) null);
                c.newInstance((Object[]) null);
                fail("Exception expected");
            } catch (Exception e) {
                assertTrue(e.getMessage(), e instanceof IllegalAccessException);
            }
        }
        public void serialize(OutputStream out) throws IOException {
            OutputStorage storage = new OutputStorage(out);
            Enumeration e;
            PublicKeyInfo keyInfo;
      
            e = keyList.elements();
            while (e.hasMoreElements()) {
                keyInfo = (PublicKeyInfo)e.nextElement();
                putKeyInStorage(storage, keyInfo);
            }
        }
        public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
            
    if ("CompanyServiceInterfacePort".equals(portName)) {
                setCompanyServiceInterfacePortEndpointAddress(address);
            }
            else 
    { // Unknown Port Name
                throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
            }
        }
    }
}