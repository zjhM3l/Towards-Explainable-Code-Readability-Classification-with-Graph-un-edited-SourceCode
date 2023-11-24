class Test {
    public class Example {
    public int getLength() {
    
            // make sure folders always have a -1 size
            return m_isFolder ? -1 : m_length;
        }
        public Observable<List<CertificateOrderActionInner>> retrieveCertificateActionsAsync(String resourceGroupName, String name) {
            return retrieveCertificateActionsWithServiceResponseAsync(resourceGroupName, name).map(new Func1<ServiceResponse<List<CertificateOrderActionInner>>, List<CertificateOrderActionInner>>() {
                @Override
                public List<CertificateOrderActionInner> call(ServiceResponse<List<CertificateOrderActionInner>> response) {
                    return response.body();
                }
            });
        }
        public void sendPacket(byte[] packet,int repeats){
      if (repeats > 9) {
        repeats=9;
      }
      if (repeats < 0) {
        log.error("repeat count out of range: " + repeats);
        repeats=1;
      }
      EasyDccMessage m=new EasyDccMessage(4 + 3 * packet.length);
      int i=0;
      m.setElement(i++,'S');
      m.setElement(i++,' ');
      m.setElement(i++,'0');
      m.setElement(i++,'0' + repeats);
      for (int j=0; j < packet.length; j++) {
        m.setElement(i++,' ');
        String s=Integer.toHexString(packet[j] & 0xFF).toUpperCase();
        if (s.length() == 1) {
          m.setElement(i++,'0');
          m.setElement(i++,s.charAt(0));
        }
     else {
          m.setElement(i++,s.charAt(0));
          m.setElement(i++,s.charAt(1));
        }
      }
      EasyDccTrafficController.instance().sendEasyDccMessage(m,null);
    }
    }
}