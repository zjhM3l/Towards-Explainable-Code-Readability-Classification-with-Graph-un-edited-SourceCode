class Test {
    public class Example {
    public Object getAppObject(CallableStatement cstmt, int parameterIndex, String engineType) throws SQLException, IOException {
                double value = cstmt.getDouble(parameterIndex);
                if (cstmt.wasNull())
                    return null;
                else
                    return new Currency(value);
            }
        public void handleQueryParameters() {
            if( queryMB.length() == 0) {
                return;
            }
            
            decodedQuery.recycle();
            decodedQuery.append(getMsgBytes().query());
            // TODO: option 'useBodyEncodingForUri' - versus UTF or ASCII
            String queryStringEncoding = getEncoding();
            processParameters( decodedQuery, queryStringEncoding );
        }
        private void informOfLostEntity(Address addr) {
    		MBusLogger.log(MBusLogger.LVL2_DEBUG, "inform of lost entity: "+addr);
    		MBusLogger.log(MBusLogger.LVL2_DEBUG, "interfaces are =  "+interfaces);
    		synchronized (interfaces) {
    			for (AddressInterface iface : interfaces) 
    				iface.notifyEntityDied(addr);
    		}
    	}
    }
}