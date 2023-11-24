class Test {
    public class Example {
    public String getPath() {
    			StringBuffer buf = new StringBuffer();
    			int maxIndex = path.size();
    			for (int i = 0; i < maxIndex; i++) {
    				buf.append(String.valueOf(path.get(i)));
    				if (i + 1 < maxIndex) {
    					buf.append(".");
    				}
    			}
    			return buf.toString();
    		}
        public void get(int offset, long[] la) {
        int start = longOffset + offset;
    
        for (int i = 0; i < la.length; ++i) {
          la[i] = lb.get(start + i);
        }
      }
        public String getConfig(String key) throws MojoExecutionException {
    		ResourceBundle resource = null;
    		try {
    			resource = ResourceBundle.getBundle(
    					"io/sarl/maven/compiler/config", //$NON-NLS-1$
    					java.util.Locale.getDefault(),
    					MavenHelper.class.getClassLoader());
    		} catch (MissingResourceException e) {
    			throw new MojoExecutionException(e.getLocalizedMessage(), e);
    		}
    		String value = resource.getString(key);
    		if (value == null || value.isEmpty()) {
    			value = Strings.nullToEmpty(value);
    			this.log.warn(MessageFormat.format(Messages.MavenHelper_1, key));
    		}
    		return value;
    	}
    }
}