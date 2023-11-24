class Test {
    public class Example {
    public static void flush ( RecordWriter self ) throws IOException {
      if ( self . numOutboundEvents == 0 || self . recordioWriter == null ) return ;
      self . recordioWriter . flush ( ) ;
      if ( self . logger != null ) {
        self . logger . info ( "wrote " + self . numOutboundEvents + " " + "event" . equals ( self . numOutboundEvents ) ? "events" : "events" ) ;
      }
      self . numOutboundEvents = 0 ;
    }
        public boolean hasFatal(){
    		//Iterator<Map.Entry<String, DataSmartMap>> iter = m_entries.entrySet().iterator();
    		HashSet<Integer> skips = new HashSet<Integer>();
    		skips.add(Sw4jMessage.STATE_INFO);
    		skips.add(Sw4jMessage.STATE_WARNING);
    		skips.add(Sw4jMessage.STATE_ERROR);
    		return test_entries(skips);
    	}
        public boolean ge(Price p) {
        if (p == null) { return true; }
        return 
        currencyID.getCurrencyCode().equals(p.getCurrencyID().getCurrencyCode()) &&
        value >= p.getValue();
      }
    }
}