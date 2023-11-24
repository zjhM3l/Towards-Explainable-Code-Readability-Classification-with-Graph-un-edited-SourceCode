class Test {
    public class Example {
    private boolean checkConnection(String name) {
    	//JcaChannel tempChannel = new JcaChannel(name);
            Channel tempChannel = ChannelFactory.defaultFactory().getChannel(name);
    //        Channel tempChannel = name;
    	try {
                //tempChannel.state();
    	    tempChannel.checkConnection();
    	}
    	catch ( ConnectionException e) {
    	    JOptionPane.showMessageDialog(myWindow(), "Opps - I can't connect to the PV called " + name, "Connection Error", JOptionPane.ERROR_MESSAGE);
    	    return false;
    	}
    	return true;
        }
        public void startElement(String name, AttributeList attrs) throws SAXParseException {
                if (helperImpl.project.getDataTypeDefinitions().get(name) != null) {
                    new DataTypeHandler(helperImpl, this, target).init(name, attrs);
                } else {
                    new TaskHandler(helperImpl, this, target, null, target).init(name, attrs);
                }
            }
        public void store(String filePath) throws Exception {
          FileOutputStream fileOutStrm = new FileOutputStream(new File(filePath));
          ObjectOutputStream objOutStream = new ObjectOutputStream(fileOutStrm);
          objOutStream.writeObject(this);
          fileOutStrm.close();
       }
    }
}