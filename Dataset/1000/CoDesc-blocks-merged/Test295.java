class Test {
    public class Example {
    public void removeListener(final IDelayedDatabaseChangeListener listener) {
            synchronized (listeners) {
                listeners.remove(listener);
            }
        }
        public MobileNode getRearmostVehicle() {
    		try {
    			return vehicles.get(0);
    		} catch (Exception e){
    			return null;
    		}
    	}
        public int initialize(){
            fileManager = FileManager.getInstance();
            if ( !FileManager.isAPIAvailable() )
            {
                // File connection API is not available
                return -1;
            }
            // set the path for saving data files
            Preferences pref = Preferences.getInstance();
            String path = pref.get(Preferences.kPath);
            fileManager.setPath(path);
            if( fileManager.initialize() < 1 ){
                return -1;
            }
            
            // initialize the record manager
            recordManager = RecordManager.getInstance();
            // save the unsaved data, which are left by last run
            save();
            return 1;
        }
    }
}