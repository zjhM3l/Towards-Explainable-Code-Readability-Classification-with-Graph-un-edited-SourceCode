class Test {
    public class Example {
    public static Map < String , ImageAlias > listImages ( String call , Map < String , String > map ) throws SaltCloudSystemExit {
      if ( call != "function" ) {
        throw new SaltCloudSystemExit ( ) ;
      }
      if ( ! versionCompatible ( "4.0" ) ) {
        throw new SaltCloudNotFound ( ) ;
      }
      Map < String , ImageAlias > ret = new HashMap < > ( ) ;
      AmazonDynamoDB conn = getAmazonDynamoDB ( ) ;
      if ( map . get ( "location" ) != null ) {
        Item item = conn . getLocation ( map . get ( "location" ) , 3 ) ;
        ret . put ( item . getId ( ) , new ImageAlias ( item . getProperties ( ) . getImageAliases ( ) ) ) ;
        return ret ;
      }
      for ( Item item : conn . listLocations ( 3 ) . getItems ( ) ) {
        ret . put ( item . getId ( ) , new ImageAlias ( item . getProperties ( ) . getImageAliases ( ) ) ) ;
      }
      return ret ;
    }
        protected int inc() {
                this.value++;
                incSize();
                assert this.value > 0;
                return this.value;
            }
        public void removeCompletionValue(String value) {
    		assert value != null;
    		int index = -1;
    		while ((index = values.indexOf(value)) != -1) {
    			values.remove(index);
    			descriptions.remove(index);
    		}
    	}
    }
}