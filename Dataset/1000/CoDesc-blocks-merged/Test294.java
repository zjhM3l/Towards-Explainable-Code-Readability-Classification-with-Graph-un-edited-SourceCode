class Test {
    public class Example {
    public static void send ( MailSender self , String email ) {
      if ( email == null && sendAsOne ) {
        self . smtp . sendMessage ( multipart , self . getConfig ( ) . getString ( "EMAIL" ) , self . getAddresses ( ) ) ;
      }
      else if ( email != null && sendAsOne == false ) {
        self . smtp . sendMessage ( multipart , self . getConfig ( ) . getString ( "EMAIL" ) , email ) ;
      }
      multipart = new MimeMultipart ( ) ;
    }
        public void setSeparatorPosition(Extent newValue) {
            Extent.validate(newValue, Extent.PX);
            if (newValue != null && newValue.getValue() < 0) {
                throw new IllegalArgumentException("Extent value may not be negative.");
            }
            setProperty(PROPERTY_SEPARATOR_POSITION, newValue);
        }
        private void copy(Locator from, LocatorImpl to) {
            if (from != null && to != null) {
                to.setColumnNumber(from.getColumnNumber());
                to.setLineNumber(from.getLineNumber());
                to.setPublicId(from.getPublicId());
                to.setSystemId(from.getSystemId());
            }
        }
    }
}