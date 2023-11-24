class Test {
    public class Example {
    private static byte[] getRowKey(long id) {
            final byte[] b = new byte[6];
            b[0] = (byte) (id >>> 40);
            b[1] = (byte) (id >>> 32);
            b[2] = (byte) (id >>> 24);
            b[3] = (byte) (id >>> 16);
            b[4] = (byte) (id >>> 8);
            b[5] = (byte) (id >>> 0);
            return b;
        }
        public void shutdown ()
        {
            if (_self == null) { // never initialized
                return;
            }
    
            // clear out our invocation service
            if (_nodeobj != null) {
                _invmgr.clearDispatcher(_nodeobj.peerService);
            }
    
            // clear out our client observer registration
            _clmgr.removeClientObserver(this);
    
            // clear our record from the node table
            if (!_adHoc) {
                _invoker.postUnit(new WriteOnlyUnit("shutdownNode(" + _nodeName + ")") {
                    @Override
                    public void invokePersist () throws Exception {
                        _noderepo.shutdownNode(_nodeName);
                    }
                });
            }
    
            // shut down the peers
            for (PeerNode peer : _peers.values()) {
                peer.shutdown();
            }
        }
        public String getLast(){
    		String result = "";
    		if (names.size() > 0) result = (String) names.get( names.size() - 1 );
    		return result;
    	}
    }
}