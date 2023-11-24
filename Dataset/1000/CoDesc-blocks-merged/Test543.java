class Test {
    public class Example {
    public void ismAddSubCustomer(Customer subCustomer) {
    		if(subCustomer != null) {
    			getSubCustomers().add(subCustomer);
    		}
    	}
        public void setPositionEng(String string) {
    		if(string == null)
    			positionEng = "";
    		else
    			positionEng = string;
    	}
        public static void writeInt(DataOutputStream dis,boolean isBigEndian,int val) throws IOException {
      if (!isBigEndian) {
        writeLittleEndianInt(dis,val);
      }
     else {
        dis.writeInt(val);
      }
    }
    }
}