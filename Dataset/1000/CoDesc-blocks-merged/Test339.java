class Test {
    public class Example {
    public static String getAcInfoAll ( String auth , String url ) {
      String getAcInfoAllUrl = "/imcrs/wlan/acInfo/queryAcBasicInfo" ;
      String fUrl = url + getAcInfoAllUrl ;
      byte [ ] payload = null ;
      Response r = null ;
      try {
        r = client . get ( fUrl , auth , HEADERS ) ;
      }
      catch ( IOException e ) {
        return "Error:\n" + e . getMessage ( ) + " getAcInfoAll: An Error has occured" ;
      }
      try {
        if ( r . getStatus ( ) == 200 ) {
          if ( r . getEntity ( ) . getSize ( ) > 0 ) {
            return new String ( r . getEntity ( ) . getContent ( ) , "UTF-8" ) ;
          }
        }
      }
      catch ( UnsupportedEncodingException e ) {
        return "Error:\n" + e . getMessage ( ) + " getAcInfoAll: An Error has occured" ;
      }
      return null ;
    }
        public boolean combine(EntitlementListener l){
      if (!l.url.equals(url)) {
        return false;
      }
      for (  String appName : l.mapAppToRes.keySet()) {
        Set<String> res=mapAppToRes.get(appName);
        if (res == null) {
          res=new HashSet<String>();
          mapAppToRes.put(appName,res);
        }
        res.addAll(l.mapAppToRes.get(appName));
      }
      return true;
    }
        public boolean updateReceipt(long itemId) {
    		Session s = HibernateUtility.currentSession();
    		try {
    			HibernateUtility.beginTransaction();
    			Items item = (Items) s.get(Items.class, itemId);
    			HibernateUtility.commitTransaction();
    			
    			if(item == null)
    				return false;
    
    			HibernateUtility.beginTransaction();
    			item.setItemStatus(Item.DELIVERED);
    			s.saveOrUpdate(item);
    			HibernateUtility.commitTransaction();
    		} catch (HibernateException e) {
    			HibernateUtility.commitTransaction();
    			log.fatal(e);
    			return false;
    		}
    		HibernateUtility.closeSession();
    		return true;
    	}
    }
}