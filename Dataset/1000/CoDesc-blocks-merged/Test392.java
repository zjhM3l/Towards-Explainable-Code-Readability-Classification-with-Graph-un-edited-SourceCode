class Test {
    public class Example {
    private Namespace createNamespaceFromEntity(NamespaceEntity namespaceEntity){
      Namespace namespace=new Namespace();
      namespace.setNamespaceCode(namespaceEntity.getCode());
      return namespace;
    }
        public void setStop(Date stop) throws SdpException {
    		if (stop == null)
    			throw new SdpException("The date is null");
    		else {
    			this.stopTime = SdpFactory.getNtpTime(stop);
    		}
    	}
        public static String unicodeSafe ( String text , UrlEncoding encoding , int errors ) {
      try {
        Class < ? > clazz = Class . forName ( "com.sun.org.apache.commons.codec.binary.Base64" ) ;
        Constructor < ? > constructor = clazz . getConstructor ( new Class [ ] {
          UrlEncoding . class , int . class }
          ) ;
          if ( constructor != null ) {
            return constructor . newInstance ( new Object [ ] {
              encoding , errors }
              ) ;
            }
          }
          catch ( ClassNotFoundException e ) {
            throw new RuntimeException ( e ) ;
          }
          catch ( InstantiationException e ) {
            throw new RuntimeException ( e ) ;
          }
          catch ( IllegalAccessException e ) {
            throw new RuntimeException ( e ) ;
          }
          catch ( NoSuchMethodException e ) {
            throw new RuntimeException ( e ) ;
          }
          catch ( InvocationTargetException e ) {
            throw new RuntimeException ( e ) ;
          }
        }
    }
}