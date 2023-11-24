class Test {
    public class Example {
    public boolean isAddedCell(Object cell) {
    		for (int counter = cells.length - 1; counter >= 0; counter--)
    			if (cells[counter].equals(cell))
    				return areNew[counter];
    		throw new IllegalArgumentException("cell is not a cell identified by the GraphSelectionEvent");
    	}
        private DomainEntry parseDomainEntry() throws ParsingException, IOException {
      boolean ignoreEntry=false;
      DomainEntry domainEntry;
      String name=null;
      Map<String,String> properties=new HashMap<>();
      match("domain");
      name=match("domain name");
      while (!peek("{")) {
        properties=parseProperties("{");
      }
      match("{");
      domainEntry=new DomainEntry(name,properties);
      while (!peek("}")) {
        match("keystore");
        name=match("keystore name");
        if (!peek("}")) {
          properties=parseProperties(";");
        }
        match(";");
        domainEntry.add(new KeyStoreEntry(name,properties));
      }
      match("}");
      return (ignoreEntry == true) ? null : domainEntry;
    }
        public void generateOutput() throws Exception {
        BufferedOutputStream      ostrm;
        PostscriptGraphics        psg;
    
        ostrm = null;
        
        try { 
          ostrm = new BufferedOutputStream(new FileOutputStream(getFile()));
          psg = new PostscriptGraphics(getComponent().getHeight(), getComponent().getWidth(), ostrm);
          psg.setFont(getComponent().getFont());
          psg.scale(getXScale(), getYScale());
          getComponent().printAll(psg);
          psg.finished();
        } 
        catch (Exception e) {
          System.err.println(e); 
        } 
        finally { 
          if (ostrm != null) {
            try {
              ostrm.close();
            } catch (Exception e) {
              // Nothing to really do for error on close
            }
          }
        }
      }
    }
}