class Test {
    public class Example {
    private void saveConsumers(EircAccount account, ConsumerInfo info, DelayedUpdatesContainer container) {
    
    		ConsumerService service = factory.getConsumerService();
    		for (Consumer consumer : account.getConsumers()) {
    			if (info.equals(consumer.getConsumerInfo())) {
    				container.addUpdate(new DelayedUpdateConsumer(consumer, service));
    			}
    		}
    	}
        public String nextVASPTokenFollowing(String string) throws IOException {
            int index;
            String line;
            while (inputBuffer.ready()) {
                line = inputBuffer.readLine();
                index = line.indexOf(string);
                if (index > 0) {
                    index = index + string.length();
                    line = line.substring(index);
                    st = new StringTokenizer(line, " =\t");
                    while(!st.hasMoreTokens() && inputBuffer.ready()) {
                        line = inputBuffer.readLine();
                        st = new StringTokenizer(line, " =\t");
                    } 
                    if (st.hasMoreTokens()) {
                        fieldVal = st.nextToken();
                    } else {
                        fieldVal = null;
                    }
                    break;
                }
            }
            return fieldVal;
        } //end nextVASPTokenFollowing(String string)
        protected Ray getEHRoutingEndConstraint(){
    		switch (getEHTargetAnchorLoc()) {
    		case CenteredConnectionAnchor.TOP:
    			return ManhattanConnectionRouterEx.UP;
    		default:
    			return ManhattanConnectionRouterEx.LEFT;
    		}
    	}
    }
}