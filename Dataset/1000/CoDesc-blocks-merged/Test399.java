class Test {
    public class Example {
    protected void itemSanityCheck() throws RepositoryException {
            // check status of this item for read operation
            final int status = data.getStatus();
            if (status == STATUS_DESTROYED || status == STATUS_INVALIDATED) {
                throw new InvalidItemStateException(
                        "Item does not exist anymore: " + id);
            }
        }
        @Override protected void startup() {
            CallerIdentificationView view = new CallerIdentificationView(this);
            show(view);
            view.checkArgs(args);
            
            addExitListener(new ExitListener() {
                public boolean canExit(EventObject arg0) {
                    boolean bOkToExit = false;
                    Component source = (Component) arg0.getSource();
                    bOkToExit = JOptionPane.showConfirmDialog(source,
                                    "Do you really want to exit?") ==
                                    JOptionPane.YES_OPTION;
                    return bOkToExit;
                }
                public void willExit(EventObject arg0) {
                    // No action needs to be taken
                }
            });
        }
        public void deregister(Route route) {
        	if (route == null)
        		return;
            route.dispose();
            Integer oldSize = Integer.valueOf(_routeHashTable.size());
        	_routeHashTable.remove(route.getId());
            firePropertyChange(LISTLENGTH_CHANGED_PROPERTY, oldSize, Integer.valueOf(_routeHashTable.size()));
        }
    }
}