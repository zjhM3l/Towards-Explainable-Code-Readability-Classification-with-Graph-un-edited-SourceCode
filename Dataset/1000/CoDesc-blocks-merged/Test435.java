class Test {
    public class Example {
    public void abortPublishJob(CmsObject cms, CmsPublishJobEnqueued publishJob, boolean removeJob)
        throws CmsException, CmsSecurityException, CmsPublishException {
    
            if (!OpenCms.getRoleManager().hasRole(cms, CmsRole.PROJECT_MANAGER)
                && !cms.getRequestContext().getCurrentUser().getId().equals(publishJob.getUserId())) {
                // Can only be executed by somebody with the role CmsRole#PROJECT_MANAGER or the owner of the job
                throw new CmsSecurityException(
                    Messages.get().container(
                        Messages.ERR_PUBLISH_ENGINE_ABORT_DENIED_1,
                        cms.getRequestContext().getCurrentUser().getName()));
            }
            m_publishEngine.abortPublishJob(cms.getRequestContext().getCurrentUser().getId(), publishJob, removeJob);
        }
        public String getInputValue(Entity entity) {
    		return new StringBuffer().append("#{").append(
    				Util.lowerCaseFirstChar(table.getName())).append("Action.")
    				.append(Util.lowerCaseFirstChar(table.getName())).append(".")
    				.append(entity.getName()).append("}").toString();
    	}
        public boolean equals(Object obj) {
    	if (!(obj instanceof Flags))
    	    return false;
    
    	Flags f = (Flags)obj;
    
    	// Check system flags
    	if (f.system_flags != this.system_flags)
    	    return false;
    
    	// Check user flags
    	if (f.user_flags == null && this.user_flags == null)
    	    return true;
    	if (f.user_flags != null && this.user_flags != null &&
    		f.user_flags.size() == this.user_flags.size()) {
    	    Enumeration e = f.user_flags.keys();
    
    	    while (e.hasMoreElements()) {
    		if (!this.user_flags.containsKey(e.nextElement()))
    		    return false;
    	    }
    	    return true;
    	}
    
    	return false;
        }
    }
}