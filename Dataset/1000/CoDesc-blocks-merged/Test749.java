class Test {
    public class Example {
    private JCheckBox getJCheckBox1() {
    		if (jCheckBox1 == null) {
    			jCheckBox1 = new JCheckBox();
    			jCheckBox1.setToolTipText("This brief description will be added to the biclustering results file");
    			jCheckBox1.setBounds(32, 316, 184, 24);
    			jCheckBox1.setText("Add description line");
    			jCheckBox1.setEnabled(false);
    		}
    		return jCheckBox1;
    	}
        public int singleIterationTime() {
          // This cast is safe since we assume that evaluation is not too long
          // and int number can store few hundreds of hours in milliseconds
          // representation.
          return (int) (this.evaluationEndTime.getTimeInMillis()
              - this.evaluationStartTime.getTimeInMillis());
        }
        public String defaultStratum() {
            SDE sdei = sourceDebugExtensionInfo();
            if (sdei.isValid()) {
                return sdei.defaultStratumId;
            } else {
                return SDE.BASE_STRATUM_NAME;
            }
        }
    }
}