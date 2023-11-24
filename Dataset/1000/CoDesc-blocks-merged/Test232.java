class Test {
    public class Example {
    public final void setDelegate(Object delegate) {
    		this.classifier = null;
    		this.invoker = MethodInvokerUtils.getMethodInvokerByAnnotation(
    				org.springframework.classify.annotation.Classifier.class, delegate);
    		if (this.invoker == null) {
    			this.invoker = MethodInvokerUtils
    					.<C, T>getMethodInvokerForSingleArgument(delegate);
    		}
    		Assert.state(this.invoker != null,
    				"No single argument public method with or without "
    						+ "@Classifier was found in delegate of type "
    						+ delegate.getClass());
    	}
        private boolean isUpperCaseCamelCaseHunk(String hunk){
      if (hunk.length() < 2)   return false;
      for (int i=0; i < hunk.length(); i++) {
        if (!isLegalChar(hunk.charAt(i)))     return false;
      }
      return true;
    }
        public String format(CheckLevel level, MessageFormatter formatter) {
        switch (level) {
          case ERROR:
            return formatter.formatError(this);
    
          case WARNING:
            return formatter.formatWarning(this);
    
          default:
            return null;
        }
      }
    }
}