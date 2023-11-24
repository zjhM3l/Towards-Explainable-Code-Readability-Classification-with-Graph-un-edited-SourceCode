class Test {
    public class Example {
    public static Assignments allUnassigned(Method testMethod,
                TestClass testClass) {
            List<ParameterSignature> signatures;
            signatures = ParameterSignature.signatures(testClass
                    .getOnlyConstructor());
            signatures.addAll(ParameterSignature.signatures(testMethod));
            return new Assignments(new ArrayList<PotentialAssignment>(),
                    signatures, testClass);
        }
        private static void indexDocument ( IndexWriter self , Document document , boolean force ) throws IOException {
      if ( force ) {
        self . delete ( vid -> document . vid ) ;
      }
      IndexWriter writer = self . index . writer ( ) ;
      writer . addDocument ( new Document ( document ) ) ;
      writer . commit ( ) ;
    }
        private int compareStamps(Stamp memoryStamp, Stamp persistentStamp) {
        if (memoryStamp == null && persistentStamp == null) {
          return 0;
        } else if (memoryStamp == null) {
          return -1;
        } else if (persistentStamp == null) {
          return +1;
        } else {
          return memoryStamp.compareTo(persistentStamp);
        }
      }
    }
}