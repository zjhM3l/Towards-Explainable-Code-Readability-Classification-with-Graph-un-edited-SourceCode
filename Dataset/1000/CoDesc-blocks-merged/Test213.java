class Test {
    public class Example {
    private int determineReadOrder(String orderAttribute) {
            if (orderAttribute.equalsIgnoreCase("random order")) {
                return RANDOM_ORDER;
            } else if (orderAttribute.equalsIgnoreCase("sequential order")) {
                return SEQUENTIAL_ORDER;
            } else {
                System.out.println("Read order attribute not recognized: " + orderAttribute+". Setting read order to sequential order.");
                return SEQUENTIAL_ORDER;
            }
        }
        public void addActivatedFlag( String flag ) {
    
            allFlagsVars.add( flag );
            actionsValues.add( ACTIVATE );
    
        }
        public void test_insertLookupRemoveKeyTreeStressTest(){
      Banner.banner();
      final int ntrials=5;
      final int mtuples=10000;
      doInsertLookupRemoveStressTestMGC(4,mtuples,ntrials);
      doInsertLookupRemoveStressTestMGC(5,mtuples,ntrials);
      doInsertLookupRemoveStressTestMGC(16,mtuples,ntrials);
      doInsertLookupRemoveStressTestMGC(3,mtuples,ntrials);
      doInsertLookupRemoveStressTest(3,mtuples,ntrials);
      doInsertLookupRemoveStressTest(4,mtuples,ntrials);
      doInsertLookupRemoveStressTest(5,mtuples,ntrials);
      doInsertLookupRemoveStressTest(16,mtuples,ntrials);
    }
    }
}