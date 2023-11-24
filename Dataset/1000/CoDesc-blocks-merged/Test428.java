class Test {
    public class Example {
    public boolean addAll(Collection coll) {
            for (Iterator it = coll.iterator(); it.hasNext(); ) {
                validate(it.next());
            }
            return getCollection().addAll(coll);
        }
        public static void logLocation(){
            if (!BMSAnalytics.collectLocation ) {
                logger.error("You must enable collectLocation before location can be logged");
                return;
            }
    
            if( !locationService.getInitLocationRequests()){
                logger.error("locationService  Initialization has failed");
                return;
            }
    
            // Create metadata object to log
            JSONObject metadata = new JSONObject();
            String hashedUserID = UUID.nameUUIDFromBytes(DEFAULT_USER_ID.getBytes()).toString();
    
            try {
                metadata.put(CATEGORY, LOG_LOCATION_KEY);
                metadata.put(LATITUDE_KEY,locationService.getLatitude());
                metadata.put(LONGITUDE_KEY,locationService.getLongitude());
                metadata.put(TIMESTAMP_KEY, (new Date()).getTime());
                metadata.put(APP_SESSION_ID_KEY, MFPAnalyticsActivityLifecycleListener.getAppSessionID());
                metadata.put(USER_ID_KEY,hashedUserID);
    
            } catch (JSONException e) {
                logger.debug("JSONException encountered logging change in user context: " + e.getMessage());
            }
    
            log(metadata);
    
        }
        protected static ValueManager[] mergeArrays(ValueManager[] a1,ValueManager[] a2){
      ValueManager[] result=new ValueManager[a1.length + a2.length];
      System.arraycopy(a1,0,result,0,a1.length);
      System.arraycopy(a2,0,result,a1.length,a2.length);
      return result;
    }
    }
}