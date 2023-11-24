class Test {
    public class Example {
    public void setFILELOG(boolean fILELOG) {
    		if(FILELOG && !fILELOG){logger.removeAppender(appender);}
    		if(!FILELOG && fILELOG){logger.addAppender(appender);}
    		FILELOG = fILELOG;
    	}
        private JRadioButton getNonlinRadioButton() {
            if (nonlinRadioButton == null) {
                nonlinRadioButton = new JRadioButton();
                nonlinRadioButton.setText("Simulate from nonlinear solution");
            }
            return nonlinRadioButton;
        }
        private static void skipNames(ByteBuffer tableBuffer,int count){
      for (int i=0; i < count; ++i) {
        ByteUtil.forward(tableBuffer,tableBuffer.getShort());
      }
    }
    }
}