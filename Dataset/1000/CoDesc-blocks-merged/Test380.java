class Test {
    public class Example {
    public static boolean update ( CacheClient self , int rid , byte [ ] data , boolean throwOnError ) {
      CacheData cacheData = new CacheData ( ) ;
      cacheData . setCacheDate ( self . getDtToEpoch ( new Date ( ) ) ) ;
      cacheData . setCacheData ( data ) ;
      return self . ds . put ( rid , cacheData , throwOnError ) ;
    }
        private static String getElementTextOrNull ( Document document , String selector ) {
      Element element = document . getElementById ( selector ) ;
      if ( element != null ) {
        return element . getTextContent ( ) ;
      }
      return null ;
    }
        public void disbleSaveFromMenu() {
    		//fixme: why is newAction modified, but not loadAction??
    		newAction.setEnabled(false);
    		saveAction.setEnabled(false);
    		saveAsAction.setEnabled(false);
    	}
    }
}