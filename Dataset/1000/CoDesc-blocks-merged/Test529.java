class Test {
    public class Example {
    public static String writeFile ( ZipOutputStream self , String filepath , String filename , String directory ) throws IOException {
      String arcname = null ;
      if ( filename != null || directory != null ) {
        directory = directory . endsWith ( "/" ) ? directory : "" ;
        filename = filename != null ? filename . substring ( 0 , filename . length ( ) - 1 ) : filename ;
        arcname = "{}
    {
    }" . format ( directory , filename ) ;
      }
      self . copyTo ( filepath , arcname ) ;
      return arcname != null ? arcname : filepath ;
    }
        public void setUp() throws AILibException {
                Configuration.loadDefaultConfig();
                g = new BinaryString1DGenome(10);
                g.setComparator(new NoComparator());
                g.setEvaluator(new NoEvaluator());
                g.setInitialiser(new NoInitialiser());
                g.setMutator(new NoMutator());
            }
        private boolean readLine(InputStream in, StringBuffer buf) throws IOException {
            while (true) {
                int c = in.read();
                if (c < 0)
                    return (buf.length() > 0);
                if (c == '\r') {
                    in.mark(1);
                    c = in.read();
                    if (c != '\n')
                        in.reset();
                    return (true);
                }
                if (c == '\n')
                    return (true);
                buf.append((char) c);
            }
        }
    }
}