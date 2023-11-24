class Test {
    public class Example {
    public static void saveAttributes ( DynamoDBTable self , RequestEnvelope envelope , String attributes ) throws PersistenceException {
      try {
        DynamoDB table = self . dynamodb ( ) . getTable ( self . tableName ) ;
        String partitionKeyVal = partitionKeyGen ( envelope ) ;
        table . putItem ( Item . withPartitionKeyName ( partitionKeyVal ) . withAttributeName ( attributes ) ) ;
      }
      catch ( ResourceNotExistException e ) {
        throw new PersistenceException ( "to DynamoDb table." . concat ( self . tableName ) , e ) ;
      }
      catch ( Exception e ) {
        throw new PersistenceException ( "type {
    }
     occurred: {
    }" . concat ( e . getClass ( ) . getSimpleName ( ) , e . getMessage ( ) ) , e ) ;
      }
    }
        public void setValue(Object value) {
            if (value == null) {
                spinner.getModel().setValue(new Integer(0));
                checkBox.setSelected(false);
                spinner.setEnabled(false);
            } else {
                spinner.getModel().setValue(value);
                checkBox.setSelected(true);
                spinner.setEnabled(this.isEnabled());
            }
        }
        public static RegionRequest createForCreateSubregion(CacheInfo c,String parentPath,String name,RegionAttributes attrs){
      RegionRequest m=new RegionRequest();
      m.action=CREATE_VM_REGION;
      m.cacheId=c.getId();
      m.path=parentPath;
      m.newRegionName=name;
      m.newRegionAttributes=new RemoteRegionAttributes(attrs);
      RegionRequest.setFriendlyName(m);
      return m;
    }
    }
}