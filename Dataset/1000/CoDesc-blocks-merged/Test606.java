class Test {
    public class Example {
    public static String guessGithubRepo ( ) {
      Process p = Runtime . getRuntime ( ) . exec ( "git ls-remote --get-url origin" ) ;
      if ( p . getErrorStream ( ) == null || p . getInputStream ( ) == null ) {
        return null ;
      }
      String url = p . getInputStream ( ) . toString ( ) . trim ( ) ;
      Matcher m = GIT_URL . fullmatch ( url ) ;
      if ( ! m . matches ( ) ) {
        return null ;
      }
      return m . group ( 1 ) ;
    }
        public AudioReader(String mimeType){
      super(mimeType);
      setDefault("factor",1.0);
      setDefault("offset",0.0);
    }
        public void addAll(Map options) {
            if (options == null) {
                String msg = "options parameter cannot be null";
                throw new IllegalArgumentException(msg);
            }
            for (Iterator i = options.entrySet().iterator(); i.hasNext();) {
                Map.Entry entry = (Map.Entry) i.next();
                Radio radio = new Radio(entry.getKey().toString(),
                                        entry.getValue().toString());
                add(radio);
            }
        }
    }
}