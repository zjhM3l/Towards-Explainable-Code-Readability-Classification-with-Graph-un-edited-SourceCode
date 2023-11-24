class Test {
    public class Example {
    private void findProperties(File dir) throws BuildException {
    		if (!dir.isDirectory())
    			throw new BuildException(dir.getPath() + " is not a directory");
    
    		for (File file : dir.listFiles()) {
    			if (file.getName().startsWith(".")) {
    				continue;
    			} else if (file.isFile() && file.getName().endsWith(".properties")) {
    				loadProperties(file);
    			} else if (file.isDirectory()){
    				findProperties(file);
    			}
    		}
    	}
        public void addInitParameters(final Map<String, String> initParameters) {
            if (initParameters == null) {
                return;
            }
            initParameters.putAll(initParameters);
        }
        public void testPutNull() {
            try {
                PriorityBlockingQueue q = new PriorityBlockingQueue(SIZE);
                q.put(null);
                shouldThrow();
            } 
            catch (NullPointerException success){
            }   
         }
    }
}