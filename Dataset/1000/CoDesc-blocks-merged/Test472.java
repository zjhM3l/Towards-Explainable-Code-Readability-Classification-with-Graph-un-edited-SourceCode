class Test {
    public class Example {
    public void serialize(final Object obj, final ByteBuffer buffer) {
        ByteBufferOutput out = new ByteBufferOutput(buffer);
        Kryo kryo = borrow();
        try {
          kryo.writeClassAndObject(out, obj);
          out.flush();
        } finally {
          release(kryo);
        }
      }
        public AttributeDefinition addAliases(String[] aliases) {
        if ((aliases == null) || (aliases.length < 1)) {
          return this;
        }
        for (int i = 0; i < aliases.length; i++) {
          this.aliases.add(aliases[i]);
        }
        return this;
      }
        public void run() {
    
    		// Show a message in the status line
    		window.setStatus(Application.getInstance().getResourceBundle().getString("statusmsg_savingindex"));
    		
    		// Get all images and save the index
    		window.getCategoryPart().getRootIndexCategory().writeIndex();
    
    		// Remove the message from the status line
    		window.setStatus("");
    		
    	}
    }
}