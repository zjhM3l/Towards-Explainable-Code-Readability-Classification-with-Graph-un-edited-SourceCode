class Test {
    public class Example {
    public void fireBeforeCaseClosed(String caseId, CaseFileInstance caseFile, String comment) {
            final Iterator<CaseEventListener> iter = getEventListenersIterator();
    
            if (iter.hasNext()) {
                final CaseCloseEvent event = new CaseCloseEvent(identityProvider.getName(), caseId, caseFile, comment);
    
                do{
                    iter.next().beforeCaseClosed(event);
                } while (iter.hasNext());
            }
        }
        public void setServerSocketFactory(String name) throws Exception {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            Class ssfClass = loader.loadClass(name);
            serverSocketFactory = (ServerSocketFactory) ssfClass.newInstance();
        }
        private static void check ( Node self , CalcMap map , Set < Node > changes ) {
      if ( changes == null ) {
        changes = afferents ;
        for ( Node req : initializers ) map . runNode ( req ) ;
      }
      else {
        Set < Node > dpts = new HashSet < Node > ( changes . size ( ) ) ;
        for ( Node aff : changes ) dpts . add ( aff ) ;
        for ( Node dpt : dpts ) {
          Collections . addAll ( map . getDepNodes ( dpt ) , dpt ) ;
        }
      }
      Set < Node > proactives = new HashSet < Node > ( changes . size ( ) ) ;
      for ( Node node : changes ) proactives . add ( node ) ;
    }
    }
}