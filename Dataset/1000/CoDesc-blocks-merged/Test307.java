class Test {
    public class Example {
    public static void queues ( ) {
      Connection conn = worker . getConnection ( ) ;
      Queue failureQ = null ;
      final String toString = "running:" + StartedJobRegistry . getInstance ( ) . getJobCount ( conn ) + " pending:" + pending + " finished:" + finished ;
      for ( Queue q : Queue . all ( conn ) ) {
        if ( q . getName ( ) . equals ( "failed" ) ) {
          failureQ = q ;
          continue ;
        }
        JOptionPane . showMessageDialog ( null , toString , "Failed" , JOptionPane . ERROR_MESSAGE ) ;
      }
      if ( failureQ != null ) {
        JOptionPane . showMessageDialog ( null , toString , "Failed" , JOptionPane . ERROR_MESSAGE ) ;
      }
    }
        public void testResponse() throws CapiException{
            ConnectRequest ci = new ConnectRequest(1, 2);
            ci.setAppID(3);
            ci.setMessageID(15);
            ci.setController(controller);
            ci.setCalledPartyNumber(cpn);
            ci.setCalledPartySubAddress(cpsa);
            ci.setCallingPartyNumber(clpn);
            ci.setCallingPartySubAddress(clpsa);
            ci.setBProtocol(b);
            ci.setBearerCapability(bc);
            ci.setLowLayerCompatibility(llc);
            ci.setHighLayerCompatibility(hlc);
            ci.setAdditionalInfo(addInfo);
            
            AbstractCapiMessage acm = ci.getResponse();
            assertNull("check non-existance of return-message", acm);
        }
        public void addChangeListener(ChangeListener listener) {
        listenerList.add(ChangeListener.class, listener);
        m_agencyArgsField.addChangeListener(listener);
        m_filterArgsField.addChangeListener(listener);
        m_matcherArgsField.addChangeListener(listener);
        m_propertiesField.addChangeListener(listener);
      }
    }
}