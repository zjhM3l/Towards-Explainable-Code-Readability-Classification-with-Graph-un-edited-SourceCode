class Test {
    public class Example {
    public void setAngle(double ang) {
            this.angle = ang;
            this.anglefix();
            this.dy = Math.sin(ang);
            this.dx = Math.cos(ang);
        }
        private void addToken(Request req, String hdr, String tok) throws ParseException {
    		int idx;
    		NVPair[] hdrs = req.getHeaders();
    		for (idx = 0; idx < hdrs.length; idx++) {
    			if (hdrs[idx].getName().equalsIgnoreCase(hdr))
    				break;
    		}
    		if (idx == hdrs.length)
    			// no such header, so add one
    			{
    			hdrs = Util.resizeArray(hdrs, idx + 1);
    			hdrs[idx] = new NVPair(hdr, tok);
    			req.setHeaders(hdrs);
    		} else
    			// header exists, so add token
    			{
    			if (!Util.hasToken(hdrs[idx].getValue(), tok))
    				hdrs[idx] = new NVPair(hdr, hdrs[idx].getValue() + ", " + tok);
    		}
    	}
        public String getValueParameter(int index){
    	String str;
    	if (index < valueParameters.size()) {
    	    str = (String)valueParameters.elementAt(index);
    	} else str = null;
    	return str;
        }
    }
}