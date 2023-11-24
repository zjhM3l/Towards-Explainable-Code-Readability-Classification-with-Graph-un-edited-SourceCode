class Test {
    public class Example {
    public TideFileInfo getFileInfo(String fileName) {
          TideFileInfo fileInfo = (TideFileInfo) files.get(fileName);
          if(fileInfo == null) {
             fileInfo = new TideFileInfo(fileName);
             files.put(fileName, fileInfo);
          }
          return fileInfo;
       }
        @Override
    
        public void sendSystemData(String systemIdentifier,
    
                ActionDescription[] actionDescriptions) {
    
            internalSSOService.saveSystemData(obtainSubsystemIdentifier(systemIdentifier),
    
                    actionDescriptions);
    
        }
        public static String renderHtml ( Thing self , Object obj , Map < String , Object > context ) {
      Map < String , Object > providedContext = context != null ? context : new HashMap < String , Object > ( ) ;
      FacesContext context = FacesContext . getCurrentInstance ( ) ;
      context . setInitScope ( context . getInitScope ( ) ) ;
      context . setInitParameter ( self . getClass ( ) . getName ( ) , "obj" , obj ) ;
      String rendered = renderHtml ( self , context ) ;
      context . removeInitScope ( context . getInitScope ( ) ) ;
      return rendered ;
    }
    }
}