class Test {
    public class Example {
    protected boolean generate(Projection proj){
      if (boundaries != null) {
        return boundaries.generate(proj);
      }
      return false;
    }
        public static Map < Brand , Double > jaccardMerge ( Map < Brand , Set < Double >> brands , Map < Brand , Set < Double >> exemplars ) {
      Map < Brand , Double > scores = new HashMap < Brand , Double > ( ) ;
      Set < Double > exemplarFolds = new HashSet < Double > ( ) ;
      for ( Set < Double > followers : exemplars . values ( ) ) {
        exemplarFolds . addAll ( followers ) ;
      }
      for ( Brand brand : brands ) {
        scores . put ( brand , jaccard ( followers , exemplarFolds ) ) ;
      }
      return scores ;
    }
        public ConnectionConfig createConnectionConfig() {
            return new DefaultConnectionConfig(anonymousLoginEnabled,
                    loginFailureDelay, maxLogins, maxAnonymousLogins,
                    maxLoginFailures);
        }
    }
}