class Test {
    public class Example {
    private void fireMessageSent(final String message) {
            assert message != null;
            ConnectorListener[] fireListeners = Connector.this.listeners.getListeners(ConnectorListener.class);
            if (fireListeners.length == 0) {
                return;
            }
            ConnectorMessageEvent event = new ConnectorMessageEvent(this, message);
            for (ConnectorListener listener : fireListeners) {
                listener.messageSent(event);
            }
        }
        public void add(final Banks bank, final Entity entity) {
    		final List<Entity> bankAccess = getListAddingUnknownBanks(bank);
    		if (!bankAccess.contains(entity)) {
    			bankAccess.add(entity);
    		}
    	}
        private int cg_varMIPS(Operand3a var, int offset) {
    		int size;
    		size = var.getSize();
    		var.setOffset(offset);
    		if(debugCG){System.out.println("\\ "+var.getName3a()+"  @ = " + offset);}
    		return offset + size;
    	}
    }
}