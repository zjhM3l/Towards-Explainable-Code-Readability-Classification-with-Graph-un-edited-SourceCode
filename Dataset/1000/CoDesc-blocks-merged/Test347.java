class Test {
    public class Example {
    public XDispatch queryDispatch(URL url, String targetFrameName, int searchFlags) {
    			String commandURL = url.Complete;
    			if(isDispatchDisabled(commandURL))
    				return null;
    						
    			IDispatchDelegate dispatchDelegate = null;
    			XDispatch xDispatch = null;
    			if(delegatesMap != null) {
    				dispatchDelegate = (IDispatchDelegate)delegatesMap.get(commandURL);
    			}
    			if(slaveDispatchProvider != null) {
    				xDispatch = slaveDispatchProvider.queryDispatch(url, targetFrameName, searchFlags);
    			}
    			if(dispatchDelegate != null)
    				return new DispatchWrapper(dispatchDelegate, xDispatch);
    			else
    				return xDispatch;
    		}
        public static void listService ( Context ctx , String name ) {
      SwagService swag = createSwagService ( ctx ) ;
      List < Service > accounts = swag . getServiceEnabled ( name ) ;
      String [ ] _table = new String [ accounts . size ( ) ] ;
      for ( int i = 0 ;
      i < accounts . size ( ) ;
      i ++ ) {
        _table [ i ] = new String ( accounts . get ( i ) . getName ( ) ) ;
        _table [ accounts . size ( ) - 1 ] = accounts . get ( i ) . getId ( ) ;
      }
      Toast . makeText ( ctx , _table , Toast . LENGTH_LONG ) . show ( ) ;
    }
        public void appendClause(LogicalClause parent, DiscoveryClause clause) {
        if ((parent != null) && (clause != null)) {
          parent.getClauses().add(clause);
        }
      }
    }
}