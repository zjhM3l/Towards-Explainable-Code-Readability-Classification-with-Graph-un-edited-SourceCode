class Test {
    public class Example {
    public B message(String messageName) {
        MessageEventDefinition messageEventDefinition = createMessageEventDefinition(messageName);
        element.getEventDefinitions().add(messageEventDefinition);
    
        return myself;
      }
        protected GetMethod createGetMethod(String url) {
            GetMethod method = new GetMethod(url);
            method.setRequestHeader("Accept", "application/xml");
            System.out.println("url: " + url);
            return method;
        }
        public static String version ( MemcacheClient self ) throws MemcacheUnknownException {
      byte [ ] cmd = "version\n" ;
      String [ ] results = self . miscCmd ( new String [ ] {
        cmd }, "version" , false ) ;
        String before = results [ 0 ] . substring ( 0 , 1 ) ;
        String after = results [ 0 ] . substring ( 1 ) ;
        if ( before != "VERSION" ) {
          throw new MemcacheUnknownException ( "Received unexpected response: " + results [ 0 ] ) ;
        }
        return after ;
      }
    }
}