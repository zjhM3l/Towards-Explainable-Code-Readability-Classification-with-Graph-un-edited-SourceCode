class Test {
    public class Example {
    public void setWakeMode(Context context, int mode) {
            boolean washeld = false;
            if (mWakeLock != null) {
                if (mWakeLock.isHeld()) {
                    washeld = true;
                    mWakeLock.release();
                }
                mWakeLock = null;
            }
    
            PowerManager pm = (PowerManager)context.getSystemService(Context.POWER_SERVICE);
            mWakeLock = pm.newWakeLock(mode|PowerManager.ON_AFTER_RELEASE, MediaPlayer.class.getName());
            mWakeLock.setReferenceCounted(false);
            if (washeld) {
                mWakeLock.acquire();
            }
        }
        public void actionPerformed(ActionEvent e)
      { /* actionPerformed */
        String cmd= e.getActionCommand();    
        
        if (cmd.startsWith("File:SaveImage"))
        { /* (File | Save Image) */
          /*Get image name for "Save image" */      
          PopupFileDialog pfd= new PopupFileDialog();
          oGifFileName= cs.tmpDir+
                        "SPF-"+cs.rsampleName+"-VS-"+
                        cs.sampleName+"-"+dispName+".gif";
          oGifFileName= pfd.popupFileDialog(oGifFileName, 
                                            "Save as GIF image to file",
                                            true);
          if(oGifFileName!=null)
          {
            useSaveImageFlag= true;      
            repaint();
          }
        } /* (File | Save Image) */
      
        else if (cmd.startsWith("Close"))
        {
          close();
        } 
            
      } /* actionPerformed */
        public String getExceptionTypeNmProviderAuxText(Object object, AdapterFactory adapterFactory) {
    		if (object == null) {
    			return INodeTextProvider.NULL_TEXT;
    		}
    		return doGetExceptionTypeNmProviderAuxText((AtcExceptionCatch)object, adapterFactory);
    	}
    }
}