class Test {
    public class Example {
    public Object get(int index) {
            Object o = fList.get(index);
    
            if (o instanceof DeltaSet) {
                return new DeltaSet((DeltaSet) o);
            }
    
            return o;
        }
        public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
            
    if ("CPFRWSPort".equals(portName)) {
                setCPFRWSPortEndpointAddress(address);
            }
            else 
    { // Unknown Port Name
                throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
            }
        }
        public void toWatershed (ImageProcessor ip) {
            FloatProcessor floatEdm = makeFloatEDM(ip, 0, false);
            ByteProcessor maxIp = maxFinder.findMaxima(floatEdm, MAXFINDER_TOLERANCE,
                    ImageProcessor.NO_THRESHOLD, MaximumFinder.SEGMENTED, false, true);
            if (maxIp != null) ip.copyBits(maxIp, 0, 0, Blitter.AND);
        }
    }
}