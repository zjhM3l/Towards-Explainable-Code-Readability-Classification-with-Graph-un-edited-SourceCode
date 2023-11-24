class Test {
    public class Example {
    public void setParameterExtention(java.lang.String extMethod) throws IllegalArgumentException {
    		if (extMethod == null) {
    			new IllegalArgumentException("ExtMethod must nto be null.");
    		}
    
    		DescriptorUtils.checkMethodExtensionRules(extMethod);
    
    		this.parameterExtension = extMethod;
    	}
        public void setThreadPool(IEventQueueThreadPool pool) {
            synchronized (getLock()) {
                this.pool = pool;
            }
        }
        private void clearTextFields() {
    	tfName.set(null);
    	tfType.set(null);
    	tfQuantity.setText("");
    	tfAllSum.setText("");
    	mask = isFullInit ? 0 : 1;
    	setBtnAddToTableEnabled();
    	tfName.requestFocus();
        }
    }
}