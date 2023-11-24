class Test {
    public class Example {
    private static Map < String , String > mapUserDetails ( User self , Map < String , String > response ) {
      Map < String , String > dest = new HashMap < > ( ) ;
      for ( Map . Entry < String , String > sourceEntry : CLAIMS_TO_DETAILS_KEY_MAP . entrySet ( ) ) {
        String destKey = sourceEntry . getKey ( ) ;
        String destKey = destKey . toLowerCase ( ) ;
        String value = response . get ( sourceEntry . getValue ( ) ) ;
        if ( value != null ) {
          dest . put ( destKey , value ) ;
        }
      }
      return dest ;
    }
        @SuppressWarnings("unchecked")
        public <T> T getObjectByUuid(Class<T> clazz, UUID uuid, String fetchGroup) {
            pm.getFetchPlan().addGroup(fetchGroup);
            return getObjectByUuid(clazz, uuid);
        }
        public static void register(Class<? extends ResourceResolverSpi> className,boolean start){
      JavaUtils.checkRegisterPermission();
      try {
        ResourceResolverSpi resourceResolverSpi=className.newInstance();
        register(resourceResolverSpi,start);
      }
     catch (  IllegalAccessException e) {
        log.log(java.util.logging.Level.WARNING,"Error loading resolver " + className + " disabling it");
      }
    catch (  InstantiationException e) {
        log.log(java.util.logging.Level.WARNING,"Error loading resolver " + className + " disabling it");
      }
    }
    }
}