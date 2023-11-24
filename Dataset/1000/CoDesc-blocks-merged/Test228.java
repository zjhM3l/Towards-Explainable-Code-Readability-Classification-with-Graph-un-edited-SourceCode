class Test {
    public class Example {
    public String getPriorEmergencyAccount() {
    		TrimEx eaTrim = getLatestTrim(EMERGENCY_ACCOUNT_LIST, "DateSort=DESC");
    		String account = null;
    
    		try {
    			List<ObservationValueSlot> accountValues = ((ActEx) eaTrim.getAct())
    					.getRelationship().get("accountDetails").getAct()
    					.getObservation().getValues();
    			account = accountValues.get(0).getST().toString() + " / "
    					+ accountValues.get(1).getST().toString();
    		} catch (Exception e) {
    
    		}
    
    		return account;
    	}
        public boolean setHeader(String name, String value) {
    	Element header = doc.getRootElement().getChild("header");
    	Element elem = header.getChild(name);
    	if (elem==null)
    	    return addHeader(name,value);
    	elem.setText(value);
    	return true;
        }
        public RegisteredServer clone(){
      RegisteredServer result=new RegisteredServer();
      result.ServerUri=ServerUri;
      result.ProductUri=ProductUri;
      result.ServerNames=ServerNames == null ? null : ServerNames.clone();
      result.ServerType=ServerType;
      result.GatewayServerUri=GatewayServerUri;
      result.DiscoveryUrls=DiscoveryUrls == null ? null : DiscoveryUrls.clone();
      result.SemaphoreFilePath=SemaphoreFilePath;
      result.IsOnline=IsOnline;
      return result;
    }
    }
}