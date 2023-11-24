class Test {
    public class Example {
    public void createValueObject(ValueObject valueObject) throws Exception {
          Person p = (Person)valueObject;
          Address a = new Address();
          a.setCountry(grid.getSelectedCountry());
          if (a.getCountry()==null)
              a.setCountry("USA");
          p.setAddress(a);
      }
        public static < A extends Annotation > Set < Pair < String , String >> parsePairArgs ( Set < String > labels , Class < A > argClass ) {
      Set < Pair < String , String >> labelData = new HashSet < Pair < String , String >> ( ) ;
      for ( String arg : labels ) {
        String name = splitPair ( arg , '=' , nullableIdx ) ;
        String value = splitPair ( arg , '=' , nullableIdx + 1 ) ;
        labelData . add ( argClass . newPair ( name , value ) ) ;
      }
      return labelData ;
    }
        protected File createFile(File baseDir, ClassDesc classDesc, String suffix) {
            File packageDir = null;
            if (StringUtil.isEmpty(classDesc.getPackageName())) {
                packageDir = baseDir;
            } else {
                packageDir =
                    new File(baseDir, classDesc.getPackageName().replace(
                        ".",
                        File.separator));
            }
            mkdirs(packageDir);
            return new File(packageDir, classDesc.getSimpleName().replace('.', '/')
                + suffix
                + ".java");
        }
    }
}