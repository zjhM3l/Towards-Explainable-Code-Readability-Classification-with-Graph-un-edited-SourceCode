class Test {
    public class Example {
    public void runTest() throws Throwable {
      String localName="blank";
      String namespaceURI="http://www.nist.gov";
      Document doc;
      NodeList elementList;
      Element testNode;
      boolean state;
      doc=(Document)load("staffNS",false);
      elementList=doc.getElementsByTagName("emp:address");
      testNode=(Element)elementList.item(0);
      assertNotNull("empAddrNotNull",testNode);
      state=testNode.hasAttributeNS(namespaceURI,localName);
      assertFalse("throw_False",state);
    }
        public Exception getException() {
        	if(super.getException() ==  null) { return null; }
        	String errorCodeMessage = super.getException().toString();
        	try {
        	  String message = getMessageFromErrorCode(errorCodeMessage);
        	  return new Exception("Error Message ["+errorCodeMessage+"]: "+message+"\n", super.getException());
        	}catch (Exception exception) {
        	  return new Exception(errorCodeMessage,super.getException());	
        	}    	
        }
        public void storeValue(final ValueNode value){
    		final TransactionControl tx = gate.requireTx();
    		registry.store(value);
    		tx.commit();
    	}
    }
}