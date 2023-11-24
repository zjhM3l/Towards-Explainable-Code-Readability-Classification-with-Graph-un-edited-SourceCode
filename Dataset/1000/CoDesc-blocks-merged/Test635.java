class Test {
    public class Example {
    public ErrCode storeFriendlyName(String name) {
    
            ErrCode e;
    
            if (name_store.getNumberOfRecords() < 0) {
                // RecordStore need to be created
                name_store = new RecordIO("Name", true);
                e = name_store.addSingleRecord(name);
            } else if (name_store.getNumberOfRecords() == 0) {
                // RecordStore has been created but without a record
                e = name_store.addSingleRecord(name);
            } else {
                // RecordStore hass been created - name will be updated
                e = name_store.saveToRecord(name, 1);
            }
    
            return e;
        }
        public String getNumIdentifiersResults() {
    		if (numIdentifiersResults == null)
    			return "value not initialized";
    		else
    			return numIdentifiersResults;
    	}
        public static BunqResponseNoteTextWhitelistResult get ( final String whitelistId , final int whitelistResultId , final int noteTextWhitelistResultId , final String monetaryAccountId , final Map < String , String > custom_headers ) throws Exception {
      if ( custom_headers == null ) {
        custom_headers = new HashMap < String , String > ( ) ;
      }
      final ApiClient api_client = new ApiClient ( getApiContext ( ) ) ;
      final String endpointUrl = ENDPOINT_URL_READ . concat ( determineUserId ( ) ) . concat ( determineMonetaryAccountId ( monetaryAccountId ) ) . concat ( whitelistId ) . concat ( whitelistResultId ) . concat ( noteTextWhitelistResultId ) ;
      final String responseRaw = api_client . get ( endpointUrl , new HashMap < String , String > ( custom_headers ) , custom_headers ) ;
      return BunqResponseNoteTextWhitelistResult . castFromBunqResponse ( fromJSONObject ( responseRaw , OBJECT_TYPE_GET ) ) ;
    }
    }
}