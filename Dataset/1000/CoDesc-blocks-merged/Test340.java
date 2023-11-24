class Test {
    public class Example {
    public int getNumberOfViewports() {
    		int count = 0;
    		for (int i = 0; i < vpCombo.length; i++) {
    			if (vpCombo[i] != null) {
    				count++;
    			}
    		}
    		return count;
    	}
        private ItemsListLabelProvider getItemsListLabelProvider() {
    		if (itemsListLabelProvider == null) {
    			itemsListLabelProvider = new ItemsListLabelProvider(
    					new LabelProvider(), null);
    		}
    		return itemsListLabelProvider;
    	}
        public void matchRequest(Snac snac) {
            RequestKeeper requestKeeper = connection.getRequestKeeper();
            if (requestKeeper.containsRequest(snac.getRequestId())) {
                Request request = requestKeeper.getRequest(snac.getRequestId());
                RequestAnswerEvent evt = new RequestAnswerEvent(request.getMonitoredSnac(), snac);
                for (int i = 0; i < request.getNbListeners(); i++) {
                    request.getRequestListener(i).onRequestAnswer(evt);
                }
                request.removeAllListener();
            }
        }
    }
}