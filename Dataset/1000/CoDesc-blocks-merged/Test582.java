class Test {
    public class Example {
    public void print() {
    	PrinterJob pj = PrinterJob.getPrinterJob();
    	pj.setPrintable(this);
    
    	if (pj.printDialog()) {
    	    pj.defaultPage();
    	    try {
    		pj.print();
    	    } catch (PrinterException e) {
    		JOptionPane.showMessageDialog(null, e.getMessage(), "EID fout", 
    		    JOptionPane.ERROR_MESSAGE);
    	    }
    	}
        }
        public static ChannelServerEventListener initWithDelegate_port_protocol_ ( ChannelServerEventListener self , Object cb_obj , int port , int proto ) throws IOException {
      self . init ( ) ;
      if ( cb_obj == null ) {
        throw new NullPointerException ( "callback object is null" ) ;
      }
      self . __cb_obj = cb_obj ;
      self . __usernotif = null ;
      if ( proto == _lightbluecommon . RFCOMM ) {
        usernotif = IOBluetooth . IOBluetoothRFCOMMChannel . registerForChannelOpenNotifications_selector_withChannelID_direction_ ( self , "newChannelOpened:channel:" , port , _macutil . kIOBluetoothUserNotificationChannelDirectionIncoming ) ;
      }
      else if ( proto == _lightbluecommon . L2CAP ) {
        usernotif = IOBluetooth . IOBluetoothL2CAPChannel . registerForChannelOpenNotifications_selector_withPSM_direction_ ( self , "newChannelOpened:channel:" , port , _macutil . kIOBluetoothUserNotificationChannelDirectionIncoming ) ;
      }
      if ( usernotif == null ) {
        throw new IOException ( "Unable to register for channel-" + "opened notifications on server socket on channel/PSM " + port ) ;
      }
      self . __usernotif = usernotif ;
      return self ;
    }
        public void inverseTranslateVect(float[] vec) throws Exception {
            if (vec.length != 3) { throw new Exception(
                    "vec must be of size 3."); }
    
            vec[0] = vec[0] - m03;
            vec[1] = vec[1] - m13;
            vec[2] = vec[2] - m23;
        }
    }
}