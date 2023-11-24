class Test {
    public class Example {
    public AttributeOperand clone(){
      AttributeOperand result=new AttributeOperand();
      result.NodeId=NodeId;
      result.Alias=Alias;
      result.BrowsePath=BrowsePath == null ? null : BrowsePath.clone();
      result.AttributeId=AttributeId;
      result.IndexRange=IndexRange;
      return result;
    }
        private void initialize() {
    		this.setSize(300, 200);
    		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		this.setJMenuBar(getMenu());
    		this.setContentPane(getJContentPane());
    		this.setTitle("Exatta - Sistema de Gest�o de Recursos Humanos");
    	}
        public void undeployed() {
    		
    		classLoader = null;
    		
    		if (classLoaderDomain != null) {				
    			classLoaderDomain.getDependencies().clear();
    			classLoaderDomain = null;				
    		}
    		
    		if (classPool != null) {
    			classPool.clean();
    			classPool = null;
    		}
    		
    		if (permissions != null) {
    			permissions.clear();
    			permissions = null;
    		}
    	}
    }
}