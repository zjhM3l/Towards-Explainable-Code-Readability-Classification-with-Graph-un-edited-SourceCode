class Test {
    public class Example {
    public void duplicate(MessageBytes src) throws IOException {
    switch (src.getType()) {
    case MessageBytes.T_BYTES:
        type=T_BYTES;
      ByteChunk bc=src.getByteChunk();
    byteC.allocate(2 * bc.getLength(),-1);
    byteC.append(bc);
    break;
    case MessageBytes.T_CHARS:
    type=T_CHARS;
    CharChunk cc=src.getCharChunk();
    charC.allocate(2 * cc.getLength(),-1);
    charC.append(cc);
    break;
    case MessageBytes.T_STR:
    type=T_STR;
    String sc=src.getString();
    this.setString(sc);
    break;
    }
    setCharset(src.getCharset());
    }
        public void deleteOutcomes() {
    		try {
    			deleteObject(resource,RR_RDFS+"outcomes",getOutcomes().getResource(),"outcomes","SectionResult");
    		}
    		catch (NoExistingPropertyException e) {}
    		catch (NoExistingObjectException e) {
    			System.out.println("Error: "+e.getLocalizedMessage());
    		}
    	}
        private boolean link(FacebookSettings settings) {
            boolean isSuccessful = false;
    
            // Validate account params and store.
            if (settings != null) {
                storeSettings(settings);
    
                // Emit link state change event.
                notifyLinkStateChanged(new LinkEvent(true));
    
                isSuccessful = true;
            }
            return isSuccessful;
        }
    }
}