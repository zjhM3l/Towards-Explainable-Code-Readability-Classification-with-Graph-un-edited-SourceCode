class Test {
    public class Example {
    private boolean possiblyAppliesToIndex(IndexSpecification indexSpec, Put put) {
        for (List<KeyValue> familyPuts : put.getFamilyMap().values()) {
          for (KeyValue kv : familyPuts) {
            if (indexSpec.containsColumn(kv.getColumn())) {
              return true;
            }
          }
        }
        return false;
      }
        public int getSectionHeading(int addr) {
            if (featOkTst && casFeat_sectionHeading == null)
          jcas.throwFeatMissing("sectionHeading", "de.julielab.jules.types.Section");
        return ll_cas.ll_getRefValue(addr, casFeatCode_sectionHeading);
      }
        private static WorkerStatisticsContext proxy ( WorkerStatisticsContext self ) {
      if ( self . _context == null ) {
        self . _context = new WorkerStatisticsContext ( self . _version , self . _solution . getWorkspaceSid ( ) , self . _solution . getWorkerSid ( ) , null ) ;
      }
      return self . _context ;
    }
    }
}