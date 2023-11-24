class Test {
    public class Example {
    public static void close ( SMTPConnection self ) {
      isClosed = true ;
      try {
        self . smtp . quit ( ) ;
      }
      catch ( IOException | SmtpException e ) {
        e . printStackTrace ( ) ;
      }
    }
        public void packet0x22() {
    		try {
    			byte sequence = readByte();
    			byte status = readByte();
    //			OSIPacketSender osiPacketSender = (OSIPacketSender) commCore.output;
    //			osiPacketSender.moveRequestAccepted(sequence);
    		} catch (IOException e) {
    		}
    	}
        public void setState(String s) {
            if(s==null){
                // do nothing
            } else {
                state = s;
            }
        }
    }
}