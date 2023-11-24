class Test {
    public class Example {
    protected void setStrand(int strandVal) {
            if (strandVal == 1)
            {
                this.setDirection(SequenceDirection.REVERSE);
            }
            else
            {
                this.setDirection(SequenceDirection.FORWARD);
            }
        }
        public NewID createNewID(String value) throws SAML2Exception {
      Object obj=SAML2SDKUtils.getObjectInstance(SAML2SDKUtils.NEWID,value);
      if (obj == null) {
        return new NewIDImpl(value);
      }
     else {
        return (NewID)obj;
      }
    }
        public void deleteHost(Long hostId, String commandId, String comment) {
    		Host deleteHost = loadHost(hostId);
    
    		recordCurrentHostVersion(deleteHost, commandId, ChangeType.DELETE,
    				"Host deleted", comment);
    		for (HostAlias ha : deleteHost.getHostAliases()) {
    			getSession().delete(ha);
    		}
    		for (ExtendedHostInfo hc : deleteHost.getConfigSettings().values()) {
    			getSession().delete(hc);
    		}
    		getSession().delete(deleteHost);
    
    	}
    }
}