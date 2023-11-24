class Test {
    public class Example {
    private InputStream getInputStream(JarFile jarFile, String jarEntryFileName) {
            try {
                JarEntry entry = jarFile.getJarEntry(jarEntryFileName);
                if (entry == null) {
                    return null;
                } else {
                    return jarFile.getInputStream(entry);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                return null;
            }
        }
        public static void main(String[] args) throws Exception {
      Scanner input=new Scanner(System.in);
      System.out.print("Enter directory name: ");
      File dir=new File(input.next());
      if (dir.isDirectory()) {
        System.out.println("Directory already exists");
        System.exit(0);
      }
      if (dir.mkdirs()) {
        System.out.println("Directory created successfully");
      }
    }
        public static HiveServer2Cursor cursor ( HiveServer2Impl self , String user , Configuration configuration , boolean convertTypes , boolean dictify , boolean fetchError ) throws SQLException {
      log . debug ( "Getting a cursor (Impala session)" ) ;
      if ( user == null ) {
        user = System . getProperty ( "user.name" ) ;
      }
      log . debug ( ".cursor(): getting new sessionHandle" ) ;
      HiveServer2Session session = self . service . openSession ( user , configuration ) ;
      log . debug ( "HiveServer2Cursor(service=" + self . service + ", sessionHandle=" + session . getHandle ( ) + ", " + "defaultConfig=" + session . getConfig ( ) + ", hs2_protocol_version=" + session . getHsProtocolVersion ( ) + ")" ) ;
      Class < ? extends HiveServer2Cursor > cursorClass = dictify ? HiveServer2DictCursor . class : HiveServer2Cursor . class ;
      HiveServer2Cursor cursor = cursorClass . isAssignableFrom ( HiveServer2Cursor . class ) ? cursorClass : new HiveServer2Cursor ( session , convertTypes , fetchError ) ;
      if ( self . defaultDb != null ) {
        log . info ( "Using database " + self . defaultDb + " as default" ) ;
        cursor . execute ( "USE " + self . defaultDb ) ;
      }
      return cursor ;
    }
    }
}