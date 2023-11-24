class Test {
    public class Example {
    public static boolean isValidRandomIdentifier( String identifier ) {
            if (identifier.length() == UUID_LENGTH) {
                // It's the right length, but see if it's a UUID ...
                try {
                    UUID.fromString(identifier);
                    return true;
                } catch (IllegalArgumentException e) {
                    // Nope
                    return false;
                }
            }
            return false;
        }
        private void loadModifications() {
            for (int index : ptmFactory.getPtmMap().keySet()) {
                modificationIndexes.put(ptmFactory.getPTM(index).getName().toLowerCase(), index);
            }
            loadModificationUse(searchGuiParent.loadModificationsUse());
            updateModificationList();
        }
        public Domaine getValue(String data, int row) throws IloaException {
    		// Control that the data exists in the datastore
    		if (!this.getDomaineClasses().containsKey(data)) {
    			throw new IloaException("The data '" + data + "' not exists in the datastore '" + this.getName() + "'");
    		}
    
    		// Get the value of the data
    		Domaine value = getRow(row).getValue(data);
    
    		// Call the fonction getValue() of the services
    		for (Iterator<IDataStoreService> iter = this.services.iterator(); iter.hasNext();) {
    			IDataStoreService element = iter.next();
    			value = element.getValue(data, row, value);
    		}
    
    		// Return the value of the data
    		return value;
    	}
    }
}