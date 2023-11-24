class Test {
    public class Example {
    public void waitForSend() {
    		try {
    			int count = 0;
    			while (!sent.get()) {
    				count++;
    				Thread.sleep(1000);
    				if (!sent.get()) {
    					if (count % 10 == 0) {
    						log.info("Still waiting... {}", String.format("%TT", new Date()));
    					}
    					if (count > 300) {
    						log.info("5 minutes? I think this test has failed");
    						assert false;
    					}
    				}
    			}
    		} catch (InterruptedException ex) {
    			//nothing
    		}
    	}
        public SortOrder getSortOrder() {
            if (sortOrder != null && sortOrder.equals(SortOrderType.ASC))
                return SortOrder.ASCENDING;
            else if (sortOrder != null && sortOrder.equals(SortOrderType.DESC))
                return SortOrder.DESCENDING;
            else
                return null;
        }
        public Criteria or(){
      Criteria criteria=createCriteriaInternal();
      oredCriteria.add(criteria);
      return criteria;
    }
    }
}