class Test {
    public class Example {
    public URLName getURLName() throws MessagingException {
            URLName baseURL = store.getURLName(); 
            return new URLName(baseURL.getProtocol(), baseURL.getHost(), baseURL.getPort(), 
                getFullName(), baseURL.getUsername(), null); 
        }
        protected void calculateEffectiveStatsFromEquipment() {
    
    	// clear
    	this.clearEffectiveStats();
    
    	// cycle through equipment (no order)
    	Collection<Equipment> eqList = this.equipmentTable.values();
    
    	// go through the equipment
    	for( Equipment eq: eqList ) {
    
    	    // equip! and go through each stat
    	    for( Attribute stat: eq.getAvailableStats() ) {
    
    		// get the value of the stat
    		Double value = eq.getStat(stat);
    
    		// increment effective
    		this.incrementEffectiveStat(stat, value);
    	    }
    	}
    
    	// all effective stats should be set up
        }
        public static void setLevel(Level outputLevel) {
            Logger appRooLogger = Logger.getLogger("edu.ucla.sspace");
            Handler verboseHandler = new ConsoleHandler();
            verboseHandler.setLevel(outputLevel);
            appRooLogger.addHandler(verboseHandler);
            appRooLogger.setLevel(outputLevel);
            appRooLogger.setUseParentHandlers(false);
        }
    }
}