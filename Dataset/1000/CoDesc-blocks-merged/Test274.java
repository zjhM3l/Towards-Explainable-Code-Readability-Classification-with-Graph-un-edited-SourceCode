class Test {
    public class Example {
    protected Message toJMS(SoapMessage message, Session session) throws Exception {
            SoapHelper soapHelper = new SoapHelper(endpoint);
            
            // turn SOAP message into byte array/string
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            SoapWriter writer = soapHelper.getSoapMarshaler().createWriter(message);
            writer.write(baos);
            
            // create text message
            TextMessage msg = session.createTextMessage();
            msg.setText(baos.toString(SourceTransformer.getDefaultCharset()));
            
            // overwrite whatever content-type was passed on to us with the one
            // the SoapWriter constructed
            msg.setStringProperty(CONTENT_TYPE, writer.getContentType());
            
            return msg;
        }
        public static synchronized void cors() {
            checkStarted();
            instance().rootInterceptors.add(Interceptors.cors());
            instance().adminManager.addInterceptor(Interceptors.cors());
        }
        private JPanel getTables() {
    		if (tables == null) {
    			tables = new JPanel();
    			tables.setLayout(null);
    			tables.setName("");
    			tables.add(jLabel112, null);
    			tables.add(jLabel11, null);
    			tables.add(getTxtAddTable(), null);
    			tables.add(getBtnAddTable(), null);
    			tables.add(getBtnQuitTable(), null);
    			tables.add(getJScrollPane1(), null);
    		}
    		return tables;
    	}
    }
}