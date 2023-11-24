class Test {
    public class Example {
    public ArrayList GetValidBindings() {
    		if(CheckCondition())
    		{
    			ArrayList bindings = new ArrayList();
    			bindings.add(new SubstitutionSet());
    			return bindings;
    		}
    		else return null;
    	}
        private JTextField getJTextField() {
    		if (jTextField == null) {
    			jTextField = new JTextField();
    			jTextField.setText("localhost");
    		}
    		return jTextField;
    	}
        private byte[] writeCheckedBytes(MessageNano proto){
      BackupProtos.CheckedMessage wrapper=new BackupProtos.CheckedMessage();
      wrapper.payload=MessageNano.toByteArray(proto);
      CRC32 checksum=new CRC32();
      checksum.update(wrapper.payload);
      wrapper.checksum=checksum.getValue();
      return MessageNano.toByteArray(wrapper);
    }
    }
}