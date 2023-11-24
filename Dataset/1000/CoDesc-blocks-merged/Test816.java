class Test {
    public class Example {
    public void addObservations(int var1[],int var2[],int cond[]){
      int rows=var1.length;
      observations+=rows;
      for (int r=0; r < rows; r++) {
        firstSecondCondCount[var1[r]][var2[r]][cond[r]]++;
        firstCondCount[var1[r]][cond[r]]++;
        secondCondCount[var2[r]][cond[r]]++;
        condCount[cond[r]]++;
      }
    }
        private void buildRedirectElement(Element extensionElement, Redirect redirect) {
    		Element operationElement = new Element(ElementConst.OPERATIONINST);
    		operationElement.setText(redirect.getValue());
    		Element actionElement = new Element(ElementConst.ACTION);
    		actionElement.setAttribute(ElementConst.ATTRIBUTE_OPERATION_REDIRECT,Boolean.TRUE.toString());
    		actionElement.setAttribute(ElementConst.ATTRIBUTE_STEP_NUMBER, redirect.getStepLabel().trim());
    		operationElement.addContent(actionElement);
    		extensionElement.addContent(operationElement);
    	}
        public void start() throws SchedulerException {
      try {
        getRemoteScheduler().start();
      }
     catch (  RemoteException re) {
        throw invalidateHandleCreateException("Error communicating with remote scheduler.",re);
      }
    }
    }
}