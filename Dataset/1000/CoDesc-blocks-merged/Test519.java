class Test {
    public class Example {
    public String getXml() {
    
    	String xml = "";
    	xml += "<OSCPACKET ADDRESS=\"" + address.getHostAddress() +
    	    "\" PORT=\"" + port +
    	    "\" TIME=\""+ time + "\">";
    
    	Enumeration m = messages.elements();
    	while (m.hasMoreElements()) {
    	    OscMessage mess = (OscMessage)m.nextElement();
    	    xml += mess.getXml();
    	}
    
    	xml += "</OSCPACKET>";
    	return xml;
        }
        public static List < Object > allSolidityVariablesUsedAsArgs ( final Self self ) {
      if ( allSolidityVariablesUsedAsArgs == null ) {
        allSolidityVariablesUsedAsArgs = self . exploreFunctions ( new ExploreFunctionVisitor ( ) {
          @ Override public void visit ( Node node ) {
            self . exploreFuncNodes ( node , solidityVariableInInternalCalls ) ;
          }
        }
        ) ;
      }
      return allSolidityVariablesUsedAsArgs ;
    }
        public void setModel(TextModel newModel) {
        if (model != null) {
          if (newModel.getFormat() == null) {
            newModel.setFormat(model.getFormat());
            newModel.setFormatPattern(model.getFormatPattern());
          }
          model.removeChangeListener(this);
        }
        model = newModel;
        model.addChangeListener(this);
        fireEnableChange(
            new EnableEvent(this, isChangeable()));
      }
    }
}