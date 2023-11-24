class Test {
    public class Example {
    public ScaleIOStoragePool queryStoragePool(String poolId) throws Exception {
      ClientResponse response=get(URI.create(ScaleIOConstants.getStoragePoolStatsURI(poolId)));
      ScaleIOStoragePool pool=getResponseObject(ScaleIOStoragePool.class,response);
      ScaleIOStoragePool poolStats=getStoragePoolStats(poolId);
      pool.setCapacityAvailableForVolumeAllocationInKb(poolStats.getCapacityAvailableForVolumeAllocationInKb());
      pool.setMaxCapacityInKb(poolStats.getMaxCapacityInKb());
      return pool;
    }
        public void setErrorKeyWithParams(String errorKey, String[] params) {
    		clearError();
    		this.errorKey = errorKey;
    		this.errorKeyParams = params;
    	}
        public ClassDescriptor getDescriptor(Class type) {
    		ClassDescriptor descriptor;
            
    		descriptor = super.getDescriptor(type);
    
    		if ((null == descriptor) && (type == _newClass)) {
    			if (CATEGORY.isDebugEnabled()) {
    				CATEGORY.debug("Creating resource class descriptor for " + type);
    			}
    			try {
    				descriptor = new ResourceClassDescriptorImpl(type);
    				addDescriptor(descriptor);
    				_newClass = null;
    			}
    			catch(MappingException e) {
    				// this should not happen
    				throw new RuntimeException(e.toString());
    			}
    		}
    
    		return descriptor;
    	}
    }
}