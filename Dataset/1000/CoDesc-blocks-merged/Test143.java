class Test {
    public class Example {
    protected boolean computeRenderingTransform() {
            initialTransform = new AffineTransform();
            if (initialTransform != renderingTransform) {
                setRenderingTransform(initialTransform, false);
                return true;
            }
            return false;
        }
        public void setNumericQueryValuesSequence(NumericQueryValuesSequence[] param){
                                  
                                       validateNumericQueryValuesSequence(param);
    
                                   
                                              if (param != null){
                                                 //update the setting tracker
                                                 localNumericQueryValuesSequenceTracker = true;
                                              } else {
                                                 localNumericQueryValuesSequenceTracker = false;
                                                     
                                              }
                                          
                                          this.localNumericQueryValuesSequence=param;
                                  }
        public StructType container() {
            if (! isMember())
                throw new InternalCompilerError("Non-member class " + this + " cannot have container classes.");
            if (outer() == null)
                throw new InternalCompilerError("Member class " + this + " must have an outer class.");
            return outer();
        }
    }
}