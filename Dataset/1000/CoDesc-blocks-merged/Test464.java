class Test {
    public class Example {
    private void addLink(String newURL) {
    
    	try {
    	    // remove part after # from the URL
    	    int pos = newURL.indexOf("#");
    	    if (pos >=0 ) {
    		newURL = newURL.substring(0,pos);
    	    }
    
    	    // There maybe some problem in the creation of a new URL
    	    // see java documentation 
    	    URL u = new URL(url, newURL);
    	    links.add(u);
    	} catch (Exception e) {
    	    log.debug("error during link extraction: "+e.getMessage()+" "+newURL);
    	}
        }
        T register(VCardPropertyScribe<? extends VCardProperty> scribe){
      if (index == null) {
        index=new ScribeIndex();
      }
      index.register(scribe);
      return this_;
    }
        public void setAlgorithm(String algorithm) {
            if ("default".equalsIgnoreCase(algorithm)) {
                this.algorithm = KeyManagerFactory.getDefaultAlgorithm();
            } else {
                this.algorithm = algorithm;
            }
        }
    }
}