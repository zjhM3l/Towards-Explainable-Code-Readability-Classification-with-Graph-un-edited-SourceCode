class Test {
    public class Example {
    public boolean find(boolean forwardDirection) {
    		IDialogSettings settings = JIntoCorePlugin.getDefault().getDialogSettings().getSection(FindDialog.SETTINGS_SECTION_ID);
    		if (settings != null) {
    			String[] searchHistory = settings.getArray(FindDialog.SEARCH_HISTORY_ID);
    			if (searchHistory != null && searchHistory.length > 0) {
    				return find(searchHistory[0], forwardDirection, settings.getBoolean(FindDialog.CASE_SENSITIVE_ID), settings.getBoolean(FindDialog.WRAP_SEARCH_ID));
    			}
    		}
    		return false;
    	}
        public static < T > T pop ( Set < T > self ) {
      try {
        T x = next ( self ) ;
        self . remove ( x ) ;
        return x ;
      }
      catch ( NoSuchElementException e ) {
        throw new NoSuchElementException ( "pop from an empty set" ) ;
      }
    }
        public String toString() {
    		if(date.equals(new Date(0l))) {
    			return "";
    		}
    		return lastRaidFormat.format(date);
    	}
    }
}