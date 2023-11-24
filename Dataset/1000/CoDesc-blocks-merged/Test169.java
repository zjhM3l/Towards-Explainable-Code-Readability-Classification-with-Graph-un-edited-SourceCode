class Test {
    public class Example {
    private void refineExtensions(IEventBRoot concreteEventBRoot, IEventBRoot abstractEventBRoot, IProgressMonitor monitor) throws RodinDBException {
    		for (ISerialisedExtension extension : abstractEventBRoot.getChildrenOfType(ISerialisedExtension.ELEMENT_TYPE)) {
    			if (extension.hasExtensionId() && extension.getExtensionId().startsWith(EXTENSION_ID))
    				refineExtension(concreteEventBRoot, extension, monitor);
    		}
    	}
        public void sendEvent(final Map<String, String> params) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    // put user id
                    params.put("cid", userId);
                    Multimap queryParams = HashMultimap.create();
                    for (Map.Entry<String, String> entry : params.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        Preconditions.checkNotNull(key, "Custom search param key must not be null.");
                        Preconditions.checkNotNull(value, "Custom search param value must not be null.");
                        queryParams.put(key, value);
                    }
                    viSearchHttpClient.get(ENDPOINT_SEND_ACTIONS, queryParams);
                }
            });
        }
        public DistributedVirtualSwitchManagerCompatibilityResult[] queryDvsCheckCompatibility(
    
            DistributedVirtualSwitchManagerHostContainer hostContainer, DistributedVirtualSwitchManagerDvsProductSpec dvsProductSpec,
    
            DistributedVirtualSwitchManagerHostDvsFilterSpec[] hostFilterSpec) throws RuntimeFault, RemoteException {
    
            return getVimService().queryDvsCheckCompatibility(getMOR(), hostContainer, dvsProductSpec, hostFilterSpec);
    
        }
    }
}