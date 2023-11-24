class Test {
    public class Example {
    public void notifyTableMessageListeners( String p_message ) {
            // We notify only if the message is correct (ie. not empty, not null)
            if ( ToolBox.isCorrect( p_message ) ) {
                BSFMessageListener messageListener;
                Iterator bsfMessageListenersIterator = _tableMessageListeners.iterator();
    
                // We notify every listener
                while ( bsfMessageListenersIterator.hasNext() ) {
                    messageListener = (BSFMessageListener) bsfMessageListenersIterator.next();
                    messageListener.handleMessage( p_message, this );
                }
            }
        }
        public synchronized final void pause() {
            if (isStop) return ;
    
            isPause = true;
            mPauseTimeInFuture = mStopTimeInFuture - SystemClock.elapsedRealtime();
            mHandler.removeMessages(MSG);
        }
        public void yearEndNotification() {
    		if ((this.isActive()) && (!this.hasInfiniteAge())) {
    			age++;
    
    			if (age >= maximum_age)
    				active_status = false;
    		}
    	}
    }
}