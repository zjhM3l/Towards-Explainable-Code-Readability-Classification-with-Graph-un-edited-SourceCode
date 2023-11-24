class Test {
    public class Example {
    public static void setStyle ( String key ) {
      if ( key == null ) {
        return ;
      }
      else if ( key == null || key . equals ( "unset" ) || key . equals ( "backup" ) ) {
        if ( "backup" . equals ( key ) ) {
          UIManager . setLookAndFeel ( UIManager . getSystemLookAndFeelClassName ( ) ) ;
        }
        else {
          throw new RuntimeException ( "No style backed up to restore" ) ;
        }
      }
      else if ( key != null ) {
        UIManager . setLookAndFeel ( key ) ;
      }
      else {
        String path = UIManager . getLookAndFeel ( ) . getClass ( ) . getName ( ) + ".class" ;
        Map < String , String > newStyle = rcParamsFromFile ( path , useDefaultTemplate ) ;
        UIManager . setLookAndFeel ( UIManager . getSystemLookAndFeelClassName ( ) ) ;
        UIManager . setDefaults ( ) ;
      }
    }
        public static RouteNode clone ( RouteNode self ) {
      RouteNode newRoute = self . getClass ( self . getProblem ( ) ) ;
      for ( Node node : self . getNodes ( ) ) {
        RouteNode newNode = node . getClass ( node . getName ( ) , node . getDemand ( ) ) ;
        newRoute . allocate ( new RouteNode ( newNode ) ) ;
      }
      return newRoute ;
    }
        public static MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> getViewEntityContainersClient(String entityListFullName, String viewName, Integer pageSize, Integer startIndex, String filter, String responseFields) throws Exception
    
    	{
    
    		MozuUrl url = com.mozu.api.urls.platform.entitylists.ListViewUrl.getViewEntityContainersUrl(entityListFullName, filter, pageSize, responseFields, startIndex, viewName);
    
    		String verb = "GET";
    
    		Class<?> clz = com.mozu.api.contracts.mzdb.EntityContainerCollection.class;
    
    		MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection>) MozuClientFactory.getInstance(clz);
    
    		mozuClient.setVerb(verb);
    
    		mozuClient.setResourceUrl(url);
    
    		return mozuClient;
    
    
    
    	}
    }
}