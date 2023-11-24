class Test {
    public class Example {
    @Override
    	public void removeByUuid_C(String uuid, long companyId) {
    		for (CommerceDiscount commerceDiscount : findByUuid_C(uuid, companyId,
    				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
    			remove(commerceDiscount);
    		}
    	}
        void print(){
      System.out.print("Record ");
      for (int i=0; i < n + 1; i++)   System.out.print(fieldPosition[i] + " ");
      System.out.println();
      System.out.print("       ");
      for (int i=0; i < n; i++)   System.out.print(fieldType[i] + " ");
      System.out.println();
    }
        private static void removeAuthorizedKeys ( LoginUser self , String user ) {
      PwdEntry entry = self . getEntry ( user ) ;
      if ( entry == null ) {
        return ;
      }
      File homeDir = entry . getPwdDir ( ) ;
      File authorizedKeysFile = new File ( homeDir , ".ssh" ) ;
      if ( authorizedKeysFile . exists ( ) ) {
        try {
          FileUtils . deleteQuietly ( authorizedKeysFile ) ;
        }
        catch ( IOException e ) {
          String message = "Could not remove authorized keys for user " + user + ". " + e . getMessage ( ) + "." ;
          self . logger . warn ( message , user , e ) ;
        }
      }
    }
    }
}