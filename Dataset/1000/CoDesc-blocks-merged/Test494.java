class Test {
    public class Example {
    public void setMatchedFields(java.lang.String[] param){
                                  
                                       validateMatchedFields(param);
    
                                   
                                              if (param != null){
                                                 //update the setting tracker
                                                 localMatchedFieldsTracker = true;
                                              } else {
                                                 localMatchedFieldsTracker = false;
                                                     
                                              }
                                          
                                          this.localMatchedFields=param;
                                  }
        public static ObjectCategory createFromNameAndDictionary ( ObjectCategory self , String name , Map < String , Object > datas ) {
      ObjectCategory category = new ObjectCategory ( name ) ;
      setCommonDatas ( category , name , datas ) ;
      if ( "order" . equals ( datas . get ( "order" ) ) ) {
        category . setOrder ( Integer . parseInt ( datas . get ( "order" ) ) ) ;
      }
      return category ;
    }
        public void closeIdMapperQueryObject(Query queryObject) {
    		if (queryObject == null)
    			return;
    		try {
    			queryObject.closeDb();
    			//prtln("closeIdMapperQueryObject()");
    		} catch (Throwable e) {
    			prtlnErr("Error closing idmapper database connection: " + e);
    		}
    		queryObject = null;
    	}
    }
}