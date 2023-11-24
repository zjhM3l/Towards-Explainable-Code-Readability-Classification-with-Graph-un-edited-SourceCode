class Test {
    public class Example {
    public void init() {
    		if (jbnOnt != null) {
    			for (int i = 0; i < jbnOnt.length; i++) {
    				btnGrpOnt.add(jbnOnt[i]);
    			}
    		}
    		if (jbnPort != null) {
    			for (int i = 0; i < jbnPort.length; i++) {
    				btnGrpOnt.add(jbnPort[i]);
    			}
    		}
    	}
        public int read() throws IOException {
    		int i = 0;
    		if(peeked>=0) {
    			i = peeked;
    			peeked = -1;
    		}
    		else if(in!=null) i = in.read();
    		else if(fin!=null) i = fin.read();
    
    		if(i==-1) throw new EOFException();
    		else if(in!=null) offset++;
    		return i;
    	}
        private static void createAndRegisterWorkflows(Backend<?> backend) throws DirectoryException {
      for (  DN curBaseDN : backend.getBaseDNs()) {
        createWorkflow(curBaseDN,backend);
      }
    }
    }
}