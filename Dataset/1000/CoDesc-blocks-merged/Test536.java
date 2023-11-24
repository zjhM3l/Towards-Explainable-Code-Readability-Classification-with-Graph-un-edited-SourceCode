class Test {
    public class Example {
    public int getLaneOfs() { 
    		if (lanofs <= -99 && !xport) {
    			int lnx = sss.getFragIndex(this)+1;
    			lnx = (lnx < sss.getFragCount() - 1) ?
    				sss.useFrag(lnx).getLeftLanes() : 0 ;
    			 return  -inlane + lnx;
    		} else return lanofs;
    	}
        private void outputMessageBody(MailMessage message, PrintWriter pw) {
            for (Iterator it = message.getBodyLines().iterator(); it.hasNext(); ) {
                String line = (String) it.next();
                if (line.startsWith(".")) {
                    // lines starting with termination character . must be "byte-stuffed":
                    pw.print(".");
                }
                pw.print(line);
    			pw.print("\r\n");
            }
        }
        @Nullable
        public <T> T gauge(String name, Iterable<Tag> tags, @Nullable T obj, ToDoubleFunction<T> valueFunction) {
            Gauge.builder(name, obj, valueFunction).tags(tags).register(this);
            return obj;
        }
    }
}