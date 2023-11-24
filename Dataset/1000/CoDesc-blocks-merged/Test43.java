class Test {
    public class Example {
    public void stop(int pageNum) {
            PDFParser parser = cache.getPageParser(new Integer(pageNum));
            if (parser != null) {
                // stop it
                parser.stop();
            }
        }
        public JTableHeaderFixture tableHeader() {
        JTableHeader tableHeader = driver.tableHeaderOf(target);
        assertThat(tableHeader).isNotNull();
        return new JTableHeaderFixture(robot, tableHeader);
      }
        protected void setValue(byte[] value) {
    		int length = value.length;
    		for (int i = 0; i < length; i++) {
    			if (value[i] == 0) {
    				length = i;
    				break;
    			}
    		}
    		String s;
    		try {
    			s = new String(value, 0, length, CHARSET_MAC);
    		} catch (UnsupportedEncodingException uee) {
    			// Should never arrive here!
    			s = new String(value, 0, length);
    		}
    		s = s.replace(INK8, INK);
    		setValue(s);
    	}
    }
}