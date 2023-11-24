class Test {
    public class Example {
    public static int isSubdirectoryOf(File pathFile,List directories){
      String path=pathFile.toString();
      for (int j=0, size=directories.size(); j < size; j++) {
        File dirFile=FileUtil.getCanonicalFile((File)directories.get(j));
        String dir=dirFile.toString();
        if (!pathFile.getParent().equals(dirFile.getParent()) && (path.length() > dir.length() && path.startsWith(dir) || dir.length() > path.length() && dir.startsWith(path))) {
          return j;
        }
      }
      return -1;
    }
        public final static int murmurHash3(int x){
      x^=x >>> 16;
      x*=0x85ebca6b;
      x^=x >>> 13;
      x*=0xc2b2ae35;
      x^=x >>> 16;
      return x;
    }
        public void clear() {
            init();
            setAddrPattern("");
            setArguments(new Object[0]);
        }
    }
}