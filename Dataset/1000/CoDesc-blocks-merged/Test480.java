class Test {
    public class Example {
    @Override
      public int readTimeout(byte []buffer, int offset, int length,
                             long timeout)
        throws IOException
      {
        int sublen = getDelegate().readTimeout(buffer, offset, length, timeout);
        
        if (sublen > 0) {
          logStream().write(buffer, offset, sublen);
        }
        return sublen;
      }
        private static Route getCurrentRoute ( Route self , KeycloakSession session ) {
      String endpoint = session . getKeycloakSessionFactory ( ) . getProviderName ( ) ;
      String method = session . getKeycloakSessionFactory ( ) . getProviderName ( ) ;
      String routeKey = routeKey ( method , endpoint ) ;
      Route route = mapOfRoutes . get ( routeKey ) ;
      if ( route == null ) {
        LOG . debug ( "Lambda function for the route not found. This should not happen because KeycloakSession is " + "Path=" + endpoint + " Method=" + method + " RouteKey=" + routeKey ) ;
        throw new IllegalArgumentException ( "Lambda function for the route not found" ) ;
      }
      return route ;
    }
        public void writeSortTempFile(Object[][] records) throws CarbonSortKeyAndGroupByException {
      int recordCount=0;
      Object[][] tempRecords;
      while (recordCount < records.length) {
        if (records.length - recordCount < recordPerLeaf) {
          recordPerLeaf=records.length - recordCount;
        }
        tempRecords=new Object[recordPerLeaf][];
        System.arraycopy(records,recordCount,tempRecords,0,recordPerLeaf);
        recordCount+=recordPerLeaf;
        this.writer.writeSortTempFile(tempRecords);
      }
    }
    }
}