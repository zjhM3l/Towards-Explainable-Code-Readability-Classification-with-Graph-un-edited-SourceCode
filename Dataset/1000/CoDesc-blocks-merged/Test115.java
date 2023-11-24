class Test {
    public class Example {
    private void weAreDone() {
            try {
                communicator.removeCallback(theRequest.getXID());
            } catch (ServiceLocationException ex) {
                owner.logError("ERROR: SlpMessageSender.weAreDone() - Failed to remove callback !", null);
            }
            if (timer != null) timer.cancel();
            timer = null;
            theRequest = null;
            thePacket = null;
            stopWaiting();
        }
        private void loadSound(String id, String path) throws NVFrameException {
    		if (path == null || path.length() == 0)
    			throw new NVFrameException("Sound resource [" + id + "] | path can't be null");
    
    		try {
    			Sound sound = new Sound(path);
    			sounds.put(id, sound);
    			SoundManager.getInstance().addSound(id, sound);
    		} catch (SlickException e) {
    			throw new NVFrameException("Could not load sound [id: " + id + " | " +
    					"path: " + path + "]", e);
    		}
    	}
        public static void mode ( USBISSDevice self , byte [ ] setBytes ) throws USBISSException {
      self . _mode = setBytes ;
      byte [ ] data = new byte [ ] {
        ISS_CMD , ISS_SET_MODE };
        self . writeToBytes ( data ) ;
        byte [ ] response = self . readData ( 2 ) ;
        if ( response [ 0 ] == 0 ) {
          HashMap errorMap = new HashMap ( ) ;
          errorMap . put ( 0x05 , "Unknown Command" ) ;
          errorMap . put ( 0x06 , "Internal Error 1" ) ;
          errorMap . put ( 0x07 , "Internal Error 2" ) ;
          try {
            throw new USBISSException ( errorMap . get ( response ( 1 ) ) ) ;
          }
          catch ( ClassCastException e ) {
            throw new USBISSException ( "Undocumented Error" ) ;
          }
        }
      }
    }
}