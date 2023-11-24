class Test {
    public class Example {
    public void drawString(String string, int x, int y) {
            if (string == null) return;
            byte[] newstr = string.getBytes();
            pDrawBytes(drawable, gc, fontmetrics.XFontSet, newstr, newstr.length, x + originX, y + originY);
        }
        public boolean equals(Object o) {
    	if (o == this)
    	    return true;
    	if (!(o instanceof MBeanOperationInfo))
    	    return false;
    	MBeanOperationInfo p = (MBeanOperationInfo) o;
    	return (p.getName().equals(getName()) &&
    		p.getReturnType().equals(getReturnType()) &&
    		p.getDescription().equals(getDescription()) &&
    		p.getImpact() == getImpact() &&
    		Arrays.equals(p.fastGetSignature(), fastGetSignature()) &&
                    p.getDescriptor().equals(getDescriptor()));
        }
        public void shutDown() {
            // don't shut down twice!
            if (!conditionShutDownCaughtTerm) {
                LOGGER.info(getName() + " shutting down " + getClass().getSimpleName() + " ...");
                conditionShutDownCaughtTerm = true;
                // is this thread waiting for some player to call back?
                try {
                    interrupt();
                }
                catch(SecurityException s) {
                    LOGGER.error(getName() + " did not wake up", s);
                }
            }
        }
    }
}