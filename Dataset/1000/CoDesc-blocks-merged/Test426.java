class Test {
    public class Example {
    public void addChangingSimons() {
    		timer.schedule(new TimerTask() {
    			final Stopwatch tlStopwatch = SimonManager.getStopwatch("TL");
    
    			@Override
    			public void run() {
    				try {
    					lock.lock();
    					System.out.println("TL " + addStopwatchSplit(tlStopwatch));
    				} finally {
    					lock.unlock();
    				}
    			}
    		}, 0, 10000L);
    	}
        @Override public void toString(StringBuilder buffer,int indent){
      StringBuilder indentBuf=new StringBuilder(indent);
      for (int i=0; i < indent; i++) {
        indentBuf.append(' ');
      }
      buffer.append(indentBuf);
      buffer.append("Add Request");
      buffer.append(EOL);
      buffer.append(indentBuf);
      buffer.append("  DN:  ");
      buffer.append(dn);
      buffer.append(EOL);
      buffer.append("  Attributes:");
      buffer.append(EOL);
      for (  RawAttribute attribute : attributes) {
        attribute.toString(buffer,indent + 4);
      }
    }
        public DBIdentifier clone() {
            DBIdentifier sName = new DBIdentifier();
            sName.setNameInternal(getNameInternal());
            sName.setType(getType());
            sName.setIgnoreCase(getIgnoreCase());
            return sName;
        }
    }
}