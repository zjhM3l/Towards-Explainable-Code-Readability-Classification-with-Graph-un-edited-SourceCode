class Test {
    public class Example {
    private void removeZeroDiagonals() {
    		int diagonalCount = getDiagonalCount();
    		boolean toRemove = true; //Some edge diagonals may be removed,
    		for (int i = 0; i < diagonalCount/2; i++) {
    			if (!toRemove) return; //No use to check other diagonals.
    			if (isZeroDiagonal(getDiagonal(0)) && isZeroDiagonal(getDiagonal(getDiagonalCount() - 1)))
    				decreaseDiagonalCount(1);
    			else toRemove = false;
    		}
    	}
        public void cleanup () {
    	        log.debug("Starting a session cleanup process.");
    		List<String> list = getExpiredSessions();
    		
    		Iterator <String> iter = list.iterator();
    		while (iter.hasNext()) {
    			String key = iter.next();
    			try {
    				destroy(key);
    			}
    			catch (Exception ex) {
    			    //failed to destroy session
    			    log.warn ("Failed to destroy session id: "+ key + " from storage.", ex); 
    			}
    			sessionMap.remove(key);
    		}
    		log.debug("Finished session cleanup process.");
    	}
        public void testGetMessage() {
    		Enumeration<String> temp_keys = Helper.getMessages().getKeys();
    		
    		while ( temp_keys.hasMoreElements() ) {
    			String key = temp_keys.nextElement();
    			assertSame( Helper.getMessage( key ),
    						Helper.getMessages().getString( key ) );
    		}
    	}
    }
}