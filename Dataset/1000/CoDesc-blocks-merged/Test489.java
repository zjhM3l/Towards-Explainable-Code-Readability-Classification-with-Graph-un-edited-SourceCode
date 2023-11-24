class Test {
    public class Example {
    public void printBoatPositions() {
    		Iterator<Boat> iter = boats.values().iterator();
    		int i = 0;
    		while (iter.hasNext()) {
    			Boat boatTemp = iter.next();
    			Logging.getInstance().info(
    					this.getClass().getName(),
    					i + ":" + boatTemp.getName() + " - "
    							+ boatTemp.getPosition());
    			i++;
    		}
    	}
        public void log(String msg) {
        if (isLogSummary()) {
          logInternal(msg);
        }
      }
        private void connect() throws IOException {
    		url.openConnection();
    		
    		this.is = url.openConnection().getInputStream();
    	}
    }
}