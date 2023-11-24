class Test {
    public class Example {
    @Override
        void rejectRequest(HttpServerExchange exchange) {
            String scriptFile = OperatingSystemDetector.INSTANCE.isWindows() ? "add-user.bat" : "add-user.sh";
            String message = HttpServerLogger.ROOT_LOGGER.realmNotReadyForSecuredManagementHandler(scriptFile);
            Common.sendPlainTextError(exchange, message, 500);
        }
        private void permuteR(int level) {
    		if (level == size - 1) {
    			// termination case
    			for (int i = 0, j; i < propVals[level].length; i++) {
    				permIndex[level] = i;
    
    				for (j = 0; j < size; j++)
    					permedProps[j].actionProps.put(
    						permedProps[j].propName,
    						propVals[j][permIndex[j]]);
    
    				execute();
    			} // ends outer for
    
    			return;
    		} // ends if
    
    		for (int i = 0; i < propVals[level].length; i++) {
    			permIndex[level] = i;
    			permuteR(level + 1);
    		} // ends for
    	} // ends permuteR
        public String normalise(String value) {
    		if(value.indexOf(" ")==-1||value.endsWith(" s")||value.endsWith("'s")) //if string is a single word, or it is in "XYZ's" form where the ' char has been removed
    			return lemmatizer.lemmatize(value,1).trim();
    
    		String part1 = value.substring(0,value.lastIndexOf(" "));
    		String part2 = lemmatizer.lemmatize(value.substring(value.lastIndexOf(" ")+1),1);
    		return part1+" "+part2.trim();
    
    	}
    }
}