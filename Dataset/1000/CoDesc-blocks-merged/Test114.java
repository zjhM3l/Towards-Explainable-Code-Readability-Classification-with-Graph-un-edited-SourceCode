class Test {
    public class Example {
    public void menuSelected(final MenuEvent arg0) {
    
            if (getSubElements().length > 0) {
                return;
            }
            synchronized (this) {
                if (loadSubMenus == null) {
                    loadSubMenus = new SubMenuLoader(false);
                    Future<?> submited = SUBMENULOADEREXECUTOR.submit(loadSubMenus);
                    this.loadSubMenusFuture = submited;
                    add(isLoadingMenuItem);
                }
            }
    
        }
        public int getSortID() {
    		if ((sortID + 1) > modules.get(currentModule).sortIdEnd) {
    			logger.warn("Module " + currentModule.toUpperCase() 
    					+ " is about to exceed SortID upper limit: "
    					+ modules.get(currentModule).sortIdEnd
    					+ "(" + (sortID + 1) + ")");
    		}
    		return sortID++;
    	}
        public void deletePackage(String packageId) throws WMWorkflowException {
            setEngine();
            if (_logger.isDebugEnabled()) {
                _logger.debug("deletePackage(" + packageId + ')');
            }
    
            try {
                // Defer enforcement of RI constraints to the database.
                ProcessRepository processRepository =
                    _svcMgr.getProcessRepository();
                XPDLPackage pkg = findPackage(packageId);
                processRepository.deletePackage(packageId);
    
                // Notify package listeners.
                _svcMgr.getWorkflowEventBroker().firePackageDeleted(pkg);
            } catch (RepositoryException e) {
                throw new WMWorkflowException(e);
            }
        }
    }
}