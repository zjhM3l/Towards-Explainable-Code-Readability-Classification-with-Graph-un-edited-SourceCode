class Test {
    public class Example {
    public static double log(double x) {
        x = Math.max(0,x);
        double val = x == 0 ? MIN_LOG : Math.max(MIN_LOG, Math.log(x));
    //    if (val == MIN_LOG) Log.warn("Log underflow: log(" + x + ") truncated to " + MIN_LOG);
        return val;
      }
        public boolean send(String cmd) {
    		try {
    			mSocket.send(cmd);
    		} catch (Exception e) {
    			return false;
    		}
    		return true;
    	}
        public void addAll(List newlist) {
            Iterator it = newlist.iterator();
            TreeNode node;
    
            while (it.hasNext()) {
                node = (TreeNode) it.next();
                list.add(node);
            }
        } // of method
    }
}