class Test {
    public class Example {
    public void delete(boolean validate) throws ValidationException {
    //        
    //        if (validate)
    //            beforeDelete();
    //        
    //    	if (synchronizeWithDM)
    //    		addRequest(new SynchronizeWithManagerRequest(SynchronizeWithManagerRequest._DELETE, this));
    //    	
    //        WorkFlow.delete(this);
        }
        public Token next() throws IOException {
        Token result = next(new Token());
    
        if (result != null) {
          Payload p = result.getPayload();
          if (p != null) {
            result.setPayload((Payload) p.clone());
          }
        }
    
        return result;
      }
        protected void showMessage(String message) {
    		MessageDialog.openInformation(this.viewer.getControl().getShell(),
    				"EclipseBugz", //$NON-NLS-1$
    				message);
    	}
    }
}