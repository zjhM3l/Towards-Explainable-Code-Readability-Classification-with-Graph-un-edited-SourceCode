class Test {
    public class Example {
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2018-10-12T02:41:42+02:00", comments = "JAXB RI v2.2.11")
        public List<Feedindex.Feed> getFeed() {
            if (feed == null) {
                feed = new ArrayList<Feedindex.Feed>();
            }
            return this.feed;
        }
        public MimeEntry findByFileName(String fname) {
            String ext = "";
    
            int i = fname.lastIndexOf('#');
    
            if (i > 0) {
                fname = fname.substring(0, i - 1);
            }
    
            i = fname.lastIndexOf('.');
            // REMIND: OS specific delimters appear here
            i = Math.max(i, fname.lastIndexOf('/'));
            i = Math.max(i, fname.lastIndexOf('?'));
    
            if (i != -1 && fname.charAt(i) == '.') {
                ext = fname.substring(i).toLowerCase();
            }
    
            return findByExt(ext);
        }
        private void setDefaultIOProperties() {
    	io.setWarningMode(Boolean.valueOf(props.getProperty(SHOW_WARN)).booleanValue());
    	io.setErrorMode(Boolean.valueOf(props.getProperty(SHOW_ERR)).booleanValue());
    	io.setDebugMode(Boolean.valueOf(props.getProperty(SHOW_DEBUG)).booleanValue());
        }
    }
}