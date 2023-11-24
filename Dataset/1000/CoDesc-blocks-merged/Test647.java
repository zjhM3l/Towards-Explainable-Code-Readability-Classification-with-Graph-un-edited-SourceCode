class Test {
    public class Example {
    public void shutDownNodes() {
    		updateLock.WaitForFreeAndLock();
    		nodesLock.writeLock().lock();
    		for (NodeItem n : nodes) {
    			try {
    				if ( n.isValid() )
    					n.getNode().shutDown();
    				n.init(null);
    				numOfNodes--;
    			} catch (RemoteException re) {
    				Log.event(Log.WARNING, "failed to shutdown node " + n.getID());
    			}
    		}
    		nodesLock.writeLock().unlock();
    		updateLock.UnLock();
    	}
        public String getEnteredString() {
        try {
          return DateFormat.getDateInstance(DateFormat.SHORT).format(entered);
        } catch (NullPointerException e) {
        }
        return ("");
      }
        private JButton getBtnCopy() {
    		if (btnCopy == null) {
    			btnCopy = new JButton();
    			try {
    				btnCopy.setText(resouceBundle.getString("btnCopy"));
    				btnCopy.setIcon(new ImageIcon(getClass().getResource(
    						"/org/uc/gui/swing/icons/buttonBar/btnCopy.png"))); // Generated
    			} catch (MissingResourceException e) {
    				btnCopy.setText("F5 Copy");
    			}
    		}
    		return btnCopy;
    	}
    }
}