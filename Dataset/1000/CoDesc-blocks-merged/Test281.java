class Test {
    public class Example {
    public void deletePriceListEntry(String priceListCode, String productCode, String currencyCode, DateTime startDate) throws Exception
    
    	{
    
    		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.pricelists.PriceListEntryClient.deletePriceListEntryClient( priceListCode,  productCode,  currencyCode,  startDate);
    
    		client.setContext(_apiContext);
    
    		client.executeRequest();
    
    		client.cleanupHttpConnection();
    
    
    
    	}
        public void initializeScheduler() {
    		try{
    			StdSchedulerFactory factory = new StdSchedulerFactory();			
    			factory.initialize(MgkIoUtil.resourceStringToInputStream(this.propertiesResourceString));
    			this.scheduler = factory.getScheduler();
    			this.scheduler.getContext().put("gateway", this.gateway);
    			this.scheduler.start();
    		}catch(Throwable ex){
    			logger.error(ex);
    		}
    	}
        public void unregisterServiceHandler(String name) {
    
            Map<String, Object> serviceHandlers = getServiceHandlers(false);
    
            if (serviceHandlers != null) {
    
                serviceHandlers.remove(name);
    
            }
    
        }
    }
}