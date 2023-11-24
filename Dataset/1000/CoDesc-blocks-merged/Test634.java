class Test {
    public class Example {
    protected void paintTabBorder(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
            Graphics2D g2 = (Graphics2D)g;
            Object oldHint = g2.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            renderer.paintTabBorder(g, tabIndex, x, y, w, h, isSelected);
            
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, oldHint);
        }
        public void getCookiesFromConnection(URLConnection urlconnection) {
    
    		String headerKey;
    		for (int i = 1; (headerKey = urlconnection.getHeaderFieldKey(i)) != null; i++) {
    			if (headerKey.equalsIgnoreCase("set-cookie")) {
    				String rawCookieHeader = urlconnection.getHeaderField(i);
    		
    				HttpCookie cookie = new HttpCookie(rawCookieHeader, dateParser);
    				cookieMap.put(cookie.getName(), cookie);
    			}
    		}
    	}
        public void printHtmlData(PrintWriter out, InputStream streamIn)
        {
            String str = null;
            if (streamIn != null)
                str = Utility.transferURLStream(null, null, new InputStreamReader(streamIn));
            if ((str == null) || (str.length() == 0))
                str = this.getDefaultXML();
            this.parseHtmlData(out, str);
        }
    }
}