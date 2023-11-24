class Test {
    public class Example {
    public FeedsDatasource getFeedsDatasource(String datasourceName) {
        	Object datasource = getDatasourceObject(datasourceName);
        	if (datasource != null) {
        		if (datasource instanceof FeedsDatasource) 
        			return (FeedsDatasource)datasource;
        		else
        			throw new IllegalArgumentException("Invalid datasource specified");
        	}
        	return null;
        }
        private Watt getActiveOneTimeConsumption() {
    		Watt activeConsumption = new Watt();
    
    		for (OneTimeConsumptionInformation information : activeOneTimeConsumptionInformation) {
    			activeConsumption.addWatt(information.getConsumption());
    		}
    		
    		return activeConsumption;
    	}
        public static void createSomeSupportedCountries(DataService mgr) throws NonUniqueBusinessKeyException {
      findOrCreate(mgr,Locale.GERMANY.getCountry());
      findOrCreate(mgr,Locale.JAPAN.getCountry());
      findOrCreate(mgr,Locale.UK.getCountry());
    }
    }
}