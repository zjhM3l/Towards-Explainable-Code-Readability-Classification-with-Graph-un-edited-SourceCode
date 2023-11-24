class Test {
    public class Example {
    public ConstantString MATCH(ConstantString pattern) {
            int pstart = 0;
            int pindex = pattern.indexOf(Delimiter.VM, pstart);
            int length = length();
            while (pindex >= 0) {
                if (match(0, length, pattern, pstart, pindex)) {
                    return ONE;
                }
                pstart = pindex + 1;
                pindex = pattern.indexOf(Delimiter.VM, pstart);
            }
            if (match(0, length, pattern, pstart, pattern.length())) {
                return ONE;
            }
            return ZERO;
        }
        public String createTableSchema(TableModel tableModel) throws Exception {
    		IControlScript controlScript = ControlScriptFactory.getJavaScript();
    		controlScript.addReference(tableModel, "tableModel");
    		
    		// add context parameters such as visitId, orderId, patientId etc.
    		return (String) controlScript.execute(script, "createTableSchema");
    
    	}
        public void init(String inputFile) throws Exception {
    		File f = new File(inputFile);
    		SAXBuilder builder = new SAXBuilder(false);
    		document = builder.build(f.toURI().toURL()); // this is inefficient (SAXParser with xhtml files)
    		root=document.getRootElement();
    	}
    }
}