class Test {
    public class Example {
    public ListenerConfiguration getListenerByName(String name) {
            ListenerConfiguration[] listeners = getListeners();
            for (int i = 0; i < listeners.length; i++) {
                if (listeners[i].getName().equals(name)) {
                    return listeners[i];
                }
            }
            return null;
        }
        private static Map < String , List < String >> getResultsFromCoursier ( CoursierSubsystem self , List < String > jarsToResolve , List < String > globalExcludes , List < String > pinnedCoords , String coursierCachePath , List < String > sources , List < String > javadoc , Executor executor ) throws Exception {
      CoursierSubsystem coursierSubsystemInstance = CoursierSubsystem . getGlobalInstance ( ) ;
      File coursierJar = coursierSubsystemInstance . bootstrapCoursier ( self . getContext ( ) . getNewWorkUnit ( ) ) ;
      List < String > repos = coursierSubsystemInstance . getOptions ( ) . getRepos ( ) ;
      List < String > repoArgs = Lists . newArrayList ( Iterables . transform ( repos , new Function < String , String > ( ) {
        @ Override public String apply ( String input ) {
          return input ;
        }
      }
      ) ) ;
      List < String > artifactTypesArg = ImmutableList . of ( "-A"," , " . join ( coursierSubsystemInstance . getOptions ( ) . getArtifactTypes ( ) ) ) ;
      List < String > advanceOptions = coursierSubsystemInstance . getOptions ( ) . getFetchOptions ( ) ;
      List < String > commonArgs = ImmutableList . of ( "fetch","-t","--cache" , coursierCachePath ) . concat ( repoArgs ) . concat ( artifactTypesArg ) . concat ( advanceOptions ) ;
      File coursierWorkTempDir = new File ( self . getVersionedWorkingDirectory ( ) , "tmp" ) ;
      safeMkdir ( coursierWorkTempDir ) ;
      Map < String , List < String >> resultsByConf = getDefaultConfResults ( commonArgs , coursierJar , globalExcludes , jarsToResolve , coursierWorkTempDir , pinnedCoords , executor ) ;
      if ( sources . isEmpty ( ) || javadoc . isEmpty ( ) ) {
        Map < String , List < String >> nonDefaultConfResults = getNonDefaultConfResults ( commonArgs , coursierJar , globalExcludes , jarsToResolve , coursierWorkTempDir , pinnedCoords , sources , javadoc , executor ) ;
        resultsByConf . putAll ( nonDefaultConfResults ) ;
      }
      return resultsByConf ;
    }
        public void setOwner(Owner owner) {
        if (owner == null) {
          removeExtension(Owner.class);
        } else {
          setExtension(owner);
        }
      }
    }
}