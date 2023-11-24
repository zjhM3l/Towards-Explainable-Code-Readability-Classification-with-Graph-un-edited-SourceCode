class Test {
    public class Example {
    public ResourceBundle getResourceBundle() {
    		try {
    			if (resourceBundle == null)
    				resourceBundle = ResourceBundle.getBundle("org.jcommander.update.UpdatePluginResources");
    		} catch (MissingResourceException x) {
    			resourceBundle = null;
    		}
    		return resourceBundle;
    	}
        public int toIntBigEndian(){
            int res = 0;
            for (int j = 0; j < count ; ++j)
            {
                    res = res*256+data[count - j - 1];
            }
            return res;
        }
        public VmCompiledExceptionHandler getExceptionHandler(int index) {
            if (eTable != null) {
                return eTable[index];
            } else {
                throw new IndexOutOfBoundsException("eTable is null; index "
                    + index);
            }
        }
    }
}