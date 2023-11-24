class Test {
    public class Example {
    public static < T > T execute ( Result < T > self , boolean returnResults ) {
      if ( self . results != null ) {
        return self . results == null ? null : self . results ;
      }
      self . executeRaw ( ) ;
      if ( self . _rawResultsOnly ) {
        self . results = self . rawResults ;
      }
      else {
        self . mapResults ( ) ;
      }
      if ( returnResults ) {
        return self . results ;
      }
      return null ;
    }
        private static int base64toInt(char c){
      int result;
      if (c >= base64ToInt.length)   result=-1;
     else   result=base64ToInt[c];
      if (result < 0)   throw new IllegalArgumentException("Illegal character " + c);
      return result;
    }
        public MerchantSearchResults merchantSearch(MerchantSearchRequest request) throws IOException, ShoppingException {
            request.getParameters().put(APPID_KEY, appId);
            Map results = executeAndParse(request.getRequestUrl(), request.getParameters());
    
            return new XmlParserMerchantSearchResults(results);
        }
    }
}