class Test {
    public class Example {
    public static void addErrorListener(ActionListener listener){
      if (onErrorListeners == null) {
        onErrorListeners=new EventDispatcher();
      }
      onErrorListeners.addListener(listener);
    }
        private static boolean checkValueItemParent ( String policyElement , String policyName , String policyKey , String policyValueName , XPathObject xpathObject , String policyFileData , boolean checkDeleted , boolean testItem ) throws XPathExpressionException {
      for ( Element element : xpathObject . elements ( policyElement ) ) {
        for ( ValueItem valueItem : element . getXPathValues ( policyValue ) ) {
          String searchString = processValueItem ( valueItem , policyKey , policyValueName , policyElement , element , checkDeleted ) ;
          if ( ! testItem ) {
            return searchString . equals ( policyValue ) ;
          }
          if ( regexSearchRegPolData ( Pattern . quote ( searchString ) , policyFileData ) ) {
            log . debug ( "found the search string in the pol file, " + policyName + " is configured" ) ;
            return true ;
          }
        }
      }
      return false ;
    }
        protected void validateKeyword(KeywordType[] param){
                                 
                                  if ((param != null) && (param.length < 1)){
                                    throw new java.lang.RuntimeException();
                                  }
                                  
                                  }
    }
}