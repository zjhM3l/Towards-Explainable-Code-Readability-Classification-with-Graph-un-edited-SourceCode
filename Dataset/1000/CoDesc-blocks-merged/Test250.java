class Test {
    public class Example {
    synchronized public void addAccount(Account account){
        if (!haveData)
          throw new UnsupportedOperationException();
        accounts.put(new Integer(account.getID()), account);
        registerAccountPrivate(account.getID(), account.getName());
      }
        public final void addChainEventListener(ChainEventListener listener) {
            if (TraceComponent.isAnyTracingEnabled() && tc.isDebugEnabled()) {
                Tr.debug(this, tc, "addChainEventListener: " + listener);
            }
            if (null != listener) {
                this.chainEventListeners.add(listener);
            }
        }
        public String getSelectedPath() {
    		return tabbedPane.getSelectedIndex()
    				+ "."
    				+ ((FlatFilePanel) tabbedPane.getSelectedComponent())
    						.getSelectedPath();
    	}
    }
}