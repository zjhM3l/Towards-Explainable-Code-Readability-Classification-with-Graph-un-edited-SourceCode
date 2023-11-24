class Test {
    public class Example {
    public int getMaxLength() {
        if (theDoc != null) {
          return theDoc.getMaxLength();
        } else {
          return 255;
        }
      }
        public void close() throws IOException, MailException {
            if (connected()) {
                execute("QUIT");
                connection.close();
            }
        }
        public void removeLiveProperties(Document propertiesDocument) {
    		Element properties = (Element) propertiesDocument.getDocumentElement();
    		Element p = null;
    		p =
    			(Element) ((Element) properties)
    				.getElementsByTagNameNS("DAV:", "supportedlock")
    				.item(0);
    
    		if (p != null) {
    			properties.removeChild(p);
    		}
    
    		// remove the live properties that are repository specific
    		propertiesManager.removeLiveProperties(propertiesDocument);
    	}
    }
}