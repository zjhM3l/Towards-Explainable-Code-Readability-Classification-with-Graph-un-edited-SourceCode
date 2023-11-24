class Test {
    public class Example {
    protected void removeSession(InternalSession session) {
    		
    		SessionManager sm=getConfiguration().getSessionManager();
    
    		if (sm != null) {
    			try {
    				sm.removeSession(session);
    			} catch(SessionManagerException e) {
    				logger.log(Level.SEVERE,
    						"Failed to remove session '"+session+
    						"' from state manager: "+e, e);
    			}
    		}
    	}
        public void delete(CoMenu entity) {
    		EntityManagerHelper.log("deleting CoMenu instance", Level.INFO, null);
    		try {
    			entity = getEntityManager().getReference(CoMenu.class, entity.getMenuId());
    			getEntityManager().remove(entity);
    			EntityManagerHelper.log("delete successful", Level.INFO, null);
    		} catch (RuntimeException re) {
    			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
    			throw re;
    		}
    	}
        private Template getTemplate(String name) throws TMPLException {
    		
    		// Check for existence
    		if (!template.containsKey(name)) {
    			throw new TMPLException("Template " + name + " not defined " +
    					"in symbol table of module " + moduleName);
    		}
    		
    		// Return the template asked for
    		return template.get(name);
    	}
    }
}