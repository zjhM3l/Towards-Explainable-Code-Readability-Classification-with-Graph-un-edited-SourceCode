class Test {
    public class Example {
    protected String ensureLength(String s, int l) {
    		if (s.length() > l) return s;
    		else {
    			StringBuffer b = new StringBuffer(s);
    			while (b.length() != l) b.append(" ");
    			return b.toString();
    		}
    	}
        private int getTruncationValueLength(String column, String query) {
        
        // UPDATE db.table SET `column`='01/01/2008' WHERE ImportId='1';
        
        String re = "SET.*?`" + column + "`?.*?=.*?\'(.*?)\'";
        Pattern p = Pattern.compile(re);
        Matcher m = p.matcher(query);
        boolean found = m.find();
        
        String f = "";
        if (found == true) {
          f = m.group(1);
        } 
        
        int i = f.length();
        
        return i;
      }
        public ProxyAuthenticateHeader getProxyAuthenticateHeader() {
    		Header h = getHeader(SipHeaderType.PROXY_AUTHENTICATE);
    		if (h == null)
    			return null;
    		else
    			return new ProxyAuthenticateHeader(h);
    	}
    }
}