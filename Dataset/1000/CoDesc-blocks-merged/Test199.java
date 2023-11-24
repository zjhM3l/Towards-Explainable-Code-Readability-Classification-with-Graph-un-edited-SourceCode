class Test {
    public class Example {
    public String string() {
        while(args.charAt(c) == ' ') if(++c == args.length()) return "";
        final int i = args.indexOf(' ', c);
        final String s = args.substring(c, i);
        c = i;
        return s.trim();
      }
        public static Config readConfig ( String contents ) throws IOException {
      FileStore fileStore = new FileStore ( contents ) ;
      Config config = StringUtils . newStringStringMap ( fileStore . readAllBytes ( ) ) ;
      return config ;
    }
        public fVector2 set(float x, float y) {
            this.x = x;
            this.y = y;
            return this;
        }
    }
}