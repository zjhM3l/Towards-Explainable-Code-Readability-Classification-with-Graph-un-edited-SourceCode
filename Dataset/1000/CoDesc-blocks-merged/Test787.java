class Test {
    public class Example {
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
            
    if ("ILOGIN_SERVPort".equals(portName)) {
                setILOGIN_SERVPortEndpointAddress(address);
            }
            else 
    { // Unknown Port Name
                throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
            }
        }
        public static String String ( String self , int off ) {
      N . enforce_number ( off , N . UOffsetTFlags . STRING ) ;
      off += Encode . Get ( N . UOffsetTFlags . packer_type , self . getBytes ( ) , off ) ;
      int start = off + N . UOffsetTFlags . bytewidth ;
      int length = Encode . Get ( N . UOffsetTFlags . packer_type , self . getBytes ( ) , off ) ;
      return Bytes . toString ( self . getBytes ( ) , start , length ) ;
    }
        public static boolean assertStrictProbability(final double p){
      if (p > 0.0 && p <= 1.0 && !Double.isNaN(p)) {
        return true;
      }
      throw new Exam.ExamException(Utils.realFormat(p));
    }
    }
}