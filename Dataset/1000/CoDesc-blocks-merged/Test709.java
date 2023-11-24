class Test {
    public class Example {
    public final void readChar() throws IOException {
      currInt=reader.read();
      ch=(char)currInt;
      if (ch == '\n') {
        line++;
      }
    }
        public void finishedNestedScope(ScopingAppenderEvent<ScopeStartEvent> ev) {
    		ScopeStartEvent ole = ev.getOwnedLoggingEvent();
    		if (!ole.getOwner().equals(getOwner())) {
    			return;
    		}
    		_innermostScope = ole.getParent();
    		_depth = _innermostScope.getDepth();
    		SessionView.instance().update(this);
    	}
        public static AlgoliaEngineWrapper register ( AlgoliaEngineWrapper model ) {
      final AlgoliasearchActivator activator = AlgoliaEngineActivator . getInstance ( ) ;
      final AlgoliaEngineWrapper wrapper = activator . getAlgoliaEngineWrapper ( ) ;
      if ( wrapper == null ) {
        throw new IllegalArgumentException ( "Wrapped class must subclass AlgoliaEngineWrapper." ) ;
      }
      activator . register ( model , wrapper ) ;
      return wrapper ;
    }
    }
}