class Test {
    public class Example {
    protected boolean fireRowChangeRequest(int oldCol, int oldRow, int newCol, int newRow) {
            MasterObjectChangeEvent e = new MasterObjectChangeEvent(this, oldCol, oldRow, newCol, newRow);
            for (Iterator i = rowChangeListeners.iterator(); i.hasNext();) {
                IMasterObjectChangeListener element = (IMasterObjectChangeListener) i.next();
                element.requestChange(e);
            }
            return e.doit;
        }
        public void setStartRule(int month, int dayOfMonth, int time) {
            if (isFrozen()) {
                throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
            }
    
            getSTZInfo().setStart(month, -1, -1, time, dayOfMonth, false);
            setStartRule(month, dayOfMonth, 0, time, WALL_TIME);
        }
        public String getIPString(InetAddress addr) {
    	if (addr == null) return new String("");
    		
    	String addrstr = addr.toString();
    	int slash_loc = addrstr.indexOf('/');
    	return addrstr.substring(slash_loc+1, addrstr.length());
    }
    }
}