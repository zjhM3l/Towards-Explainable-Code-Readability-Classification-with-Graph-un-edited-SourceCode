class Test {
    public class Example {
    private void synchParamList(){
    
    		// get the current parameter values
    		List<String> paramValues = node.getParameterValues( );
    		
    		int newSize = ExtensionNodeUtils.getNumberOfParameters( node.getClassName( ), node.getMethodName( ) );
    		
    		// add missing items
    		while(paramValues.size( )<newSize){
    			paramValues.add( new String() );
    		}
    
    		// remove excess items
    		while(paramValues.size( )>newSize){
    			paramValues.remove( paramValues.size( )-1 );
    		}
    		
    	}
        public void disconnect() throws SQLException {
            if (connection != null) {
                connection.close();
                unregister();
            }
        }
        public synchronized void putDuplicate(Object key,
                                              Token value,
                                              Transaction transaction)
                        throws ObjectManagerException {
            put(key,
                value,
                transaction,
                true);
    
        }
    }
}