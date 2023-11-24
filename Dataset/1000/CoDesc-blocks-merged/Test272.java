class Test {
    public class Example {
    private void setMinDate(TimeBarViewerInterface emitting, JaretDate minDate) {
            for (TimeBarViewerInterface viewer : _viewers) {
                if (!emitting.equals(viewer)) { // do not set on the emitting viewer
                    viewer.removePropertyChangeListener(this);
                    viewer.setMinDate(minDate.copy());
                    viewer.addPropertyChangeListener(this);
                }
            }
        }
        protected void checkNaN(Coordinate c) {
    		if (c.isNaN()) {
    			throw new BugException("Simulation resulted in not-a-number (NaN) value, please report a bug.");
    		}
    	}
        public void append(Writable key, Writable val) throws IOException {
          if (key.getClass() != keyClass)
            throw new IOException("wrong key class: "+key+" is not "+keyClass);
          if (val.getClass() != valClass)
            throw new IOException("wrong value class: "+val+" is not "+valClass);
    
          buffer.reset();
    
          key.write(buffer);
          int keyLength = buffer.getLength();
          if (keyLength == 0)
            throw new IOException("zero length keys not allowed: " + key);
    
          val.write(buffer);
          //System.out.println("Appending " + key + ", " + val);
          append(buffer.getData(), 0, buffer.getLength(), keyLength);
        }
    }
}