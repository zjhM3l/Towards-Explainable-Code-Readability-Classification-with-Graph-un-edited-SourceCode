class Test {
    public class Example {
    public void setSection (String cSection) {
    		try {
    			courseSection = cSection;
    		}
    		catch (IllegalArgumentException iae) {
    			System.out.println("This is an Illegal Course Number. ");		
    		}		
    	}
        public String getJobStatus(String jobName) throws Exception {
    		FileJobInfo fileJobInfo = getFileJobInfo(jobName);
    		if (fileJobInfo == null) {
    			throw new Exception("Can't find file job : " + jobName);
    		}
    		String jobstatus = fileJobInfo.getStatus();
    		return jobstatus;
    	}
        private void returnResponse(Message message) {
        	boolean needToRespond = false;
        	synchronized (lock) {
        	if (!answered) {
        		answered = true;
        		needToRespond = true;
        	}
        	}
        	if (needToRespond) {
                // Stop the timer!
                cancelTimer();
                returnResponse(listener, responseQueue, message, id);    		
        	}
        }
    }
}