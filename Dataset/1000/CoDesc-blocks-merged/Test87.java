class Test {
    public class Example {
    public void setRequest(GetQuote param){
                                
                                           if (param != null){
                                              //update the setting tracker
                                              localRequestTracker = true;
                                           } else {
                                              localRequestTracker = true;
                                                  
                                           }
                                       
                                                this.localRequest=param;
                                        
    
                                   }
        @Override
        public void connectionClosed() {
            lock.lock();
            try {
                connectionOpen = false;
                if (state != null)
                    state.disconnectFromChannel();
            } finally {
                lock.unlock();
            }
        }
        public void reset( String input, String delimiters ) {
    		this.inputText = input;
    		this.delimiters = delimiters;
    		this.inputChars = input.toCharArray();
    		updateTokenStartPosition(input, this.inputChars, this.delimiters);
    	}
    }
}