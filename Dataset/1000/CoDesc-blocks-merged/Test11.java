class Test {
    public class Example {
    public CmsToolRootHandler getCurrentRoot(CmsWorkplace wp) {
    
            CmsToolUserData userData = getUserData(wp);
            String root = ROOTKEY_DEFAULT;
            if (userData != null) {
                if (m_roots.getObject(userData.getRootKey()) != null) {
                    root = userData.getRootKey();
                } else {
                    if (LOG.isErrorEnabled()) {
                        LOG.error(Messages.get().getBundle().key(Messages.ERR_NOT_CONFIGURED_ROOT_1, userData.getRootKey()));
                    }
                }
            }
            return (CmsToolRootHandler)m_roots.getObject(root);
        }
        protected void checkOutputDirectory(File outputDirectory) {
    		File f = outputDirectory;
    
    		if (!f.exists()) {
    			f.mkdirs();
    		}
    	}
        public LockTable getLockTable(String debateID) throws DebateOpenException{
    		ActiveDebate debate = activeDebates.get(debateID);
    		if(debate==null)
    			debate = activateDebate(debateID);
    		debate.lastAccessTimestamp = System.currentTimeMillis();
    		return debate.lockTable;
    	}
    }
}