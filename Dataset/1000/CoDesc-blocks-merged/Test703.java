class Test {
    public class Example {
    public boolean hasGoal(String goalName) {
            for (Goal g : goals) {
    	    if (g.getName().equals(goalName)) {
    		return g.getPriority() > 0;
    	    }
    	}
    	return false;
        }
        private JCheckBox getCBGenerateSpDist() {
    		if (CBGenerateSpDist == null) {
    			CBGenerateSpDist = new JCheckBox();
    			CBGenerateSpDist.addItemListener(new java.awt.event.ItemListener() {
    				public void itemStateChanged(java.awt.event.ItemEvent e) 
    				{
    					blnGenerateSpDist = CBGenerateSpDist.isSelected();
    					parentPane.addOrRemovePanel(blnGenerateSpDist, "sd");
    				}
    			});
    		}
    		return CBGenerateSpDist;
    	}
        public synchronized void stop(){
      if (mStreaming) {
        if (mMode == MODE_MEDIACODEC_API) {
          Log.d(TAG,"Interrupting threads...");
          mThread.interrupt();
          mAudioRecord.stop();
          mAudioRecord.release();
          mAudioRecord=null;
        }
        super.stop();
      }
    }
    }
}