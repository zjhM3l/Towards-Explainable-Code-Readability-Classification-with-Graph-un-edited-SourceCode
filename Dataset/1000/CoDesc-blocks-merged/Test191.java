class Test {
    public class Example {
    @Override
    	protected void onStartLoading() {
    		if (mCursor != null) {
    			deliverResult(mCursor);
    		}
    		if (takeContentChanged() || mCursor == null) {
    			forceLoad();
    		}
    	}
        public static void attachEventHandler ( Canvas canvas , CloseOnEscOrMiddleEvent handler ) {
      if ( ( ( Canvas ) canvas ) . javaEventDispatcherAttached ) {
        return ;
      }
      C . TPyDispatcherProcessedEvent eventDispatcher = new C . TPyDispatcherProcessedEvent ( handler ) ;
      canvas . Connect ( "ProcessedEvent(int,int,int,TObject*)" , "TPyDispatcherProcessedEvent" , eventDispatcher , "Dispatch(int,int,int,TObject*)" ) ;
      canvas . javaEventDispatcherAttached = eventDispatcher ;
    }
        protected String getContent() throws FusionGWException {
    		//		 Get application file
    		try {
    			return getResource( 
    					registry.getAttribute( "org.fusiongw.directory" ) + "/WEB-INF/fusiongw/" + getFileName() );
    		} catch( FileNotFoundException e ) {
    			throw new FusionGWException( e );
    		}
    	}
    }
}