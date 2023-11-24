class Test {
    public class Example {
    public String getText(Object object) {
    		String label = ((ModelElement)object).getName();
    		return label == null || label.length() == 0 ?
    			getString("_UI_ModelElement_type") :
    			getString("_UI_ModelElement_type") + " " + label;
    	}
        public void reload()
       {
          providers = new HashSet<S>();
          loadedImplementations = new HashSet<Class<?>>();
    
          for (URL serviceFile : loadServiceFiles())
          {
             loadServiceFile(serviceFile);
          }
    
          if (locatorLoader == null)
             locatorLoader = java.util.ServiceLoader
                      .load(ServiceLocator.class);
    
          for (ServiceLocator locator : locatorLoader)
          {
             Collection<Class<S>> serviceTypes = locator.locate(expectedType);
             if ((serviceTypes != null) && !serviceTypes.isEmpty())
             {
                for (Class<S> type : serviceTypes) {
                   loadClass(type); // TODO lb3 test this now
                }
             }
          }
    
       }
        public static boolean isOnCooldown ( CooldownService self , MessageContext ctx ) {
      if ( ! self . getBuckets ( ) . isValid ( ) ) {
        return false ;
      }
      Bucket bucket = self . getBuckets ( ) . getBucket ( ctx . getMessage ( ) ) ;
      return bucket . getTokens ( ) == 0 ;
    }
    }
}