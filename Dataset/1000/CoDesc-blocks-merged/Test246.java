class Test {
    public class Example {
    public void setMaxSuggestions(int maxSuggestions) {
            if (maxSuggestions < 1 || maxSuggestions > 100) {
                throw new IllegalArgumentException("maxSuggestions must be between 1 and 100");
            }
            mPrefMaxSuggestions = maxSuggestions;
            mPriorities = new int[mPrefMaxSuggestions];
            mBigramPriorities = new int[PREF_MAX_BIGRAMS];
            collectGarbage(mSuggestions, mPrefMaxSuggestions);
            while (mStringPool.size() < mPrefMaxSuggestions) {
                StringBuilder sb = new StringBuilder(getApproxMaxWordLength());
                mStringPool.add(sb);
            }
        }
        protected void freeConnection(Connection connection) {
        	if (connection != null) {
    	    	if (datasource instanceof ConnectionBroker) {
    	    		((ConnectionBroker)datasource).freeConnection(connection);
    	    	} else {
    	    		try {
    	    			connection.close();
    	    		} catch (SQLException sqle) {
    	    			sqle.printStackTrace();
    	    		}
    	    	}
        	}
        }
        public static class Util {
    		private static SampleHtmlServiceAsync instance;
    		public static SampleHtmlServiceAsync getInstance(){
    			if (instance == null) {
    				instance = (SampleHtmlServiceAsync) GWT.create(SampleHtmlService.class);
    				ServiceDefTarget target = (ServiceDefTarget) instance;
    				target.setServiceEntryPoint(GWT.getModuleBaseURL() + "/SampleHtmlService");
    			}
    			return instance;
    		}
    	}
    }
}