class Test {
    public class Example {
    public void removeConnections() {
            // detach reference connections
            while (getConnectionCount()>0)
                getConnection(0).disconnect();
            // clear all reference connections
            References = new java.util.Vector();
            // remove connector connections
            for (int i=0; i<getConnectorCount(); i++)
               getConnector(i).removeConnections();
        }
        public boolean descendentOf(String name) {
    		if(parent.equals(name)) {
    			return true;
    		}
    		Component myParent = owner.getChild(parent);
    		if (myParent == null) {
    			return false;
    		} else {
    			return myParent.descendentOf(name);
    		}
    	}
        public Transaction build () {
                //other integrity conditions could be added here
                if ((type == TType.stockBuy || type == TType.stockSell) && (shares.size() == 0)) {
                        throw new IllegalArgumentException();
                }
                return new Transaction(this);
            }
    }
}