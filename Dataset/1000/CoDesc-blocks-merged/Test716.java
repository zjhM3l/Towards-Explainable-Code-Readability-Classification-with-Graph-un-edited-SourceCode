class Test {
    public class Example {
    public Process open(String args[]) {
        try {
          return Runtime.getRuntime().exec(args);
        } catch (Exception e) {
          e.printStackTrace();
          throw new RuntimeException("Could not open " + join(args, ' '));
        }
      }
        private void addSubmission(ForkJoinTask<?> t) {
            final ReentrantLock lock = this.submissionLock;
            lock.lock();
            try {
                ForkJoinTask<?>[] q; int s, m;
                if ((q = submissionQueue) != null) {    // ignore if queue removed
                    long u = (((s = queueTop) & (m = q.length-1)) << ASHIFT)+ABASE;
                    UNSAFE.putOrderedObject(q, u, t);
                    queueTop = s + 1;
                    if (s - queueBase == m)
                        growSubmissionQueue();
                }
            } finally {
                lock.unlock();
            }
            signalWork();
        }
        public String toString() {
    		final StringBuilder output = new StringBuilder();
    		//phrase 
    		output.append("\"");
    		output.append(super.toString());
    		output.append("\"");
    		//with proximity constraint if not default	
    		if (proximityDistance > 1) 
    		{
    			output.append("~");
    			output.append(proximityDistance);
    		}
    		return output.toString();
    	}
    }
}