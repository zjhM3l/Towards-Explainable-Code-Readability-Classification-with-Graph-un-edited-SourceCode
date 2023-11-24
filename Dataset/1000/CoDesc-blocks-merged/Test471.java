class Test {
    public class Example {
    public void close() {
        if (log.isInfoEnabled()) {
          log.info("Closing dataset '" + file + "'");
        }
        if (currentReader != null) {
          try {
            currentReader.close();
          } catch (Throwable e) {
            log.error("  Error closing reader " + e.getMessage(), e);
    
          }
        }
        if (!file.isDirectory()) {
          if (log.isDebugEnabled()) {
            log.debug("  Deleting working files");
          }
          try {
            FileUtil.deleteDirectory(workingDirectory);
          } catch (IOException e) {
            log.error("  Error deleting working directory " + e.getMessage(), e);
          }
        }
        if (log.isDebugEnabled()) {
          log.debug("  Finished closing file");
        }
      }
        public void removeAllConcreteTaskDescriptors() {
    		for (ConcreteTaskDescriptor tmp : this.getConcreteTaskDescriptors()) {
    			tmp.setTaskDescriptor(null);
    		}
    		this.getConcreteTaskDescriptors().clear();
    	}
        public void clear() {
                count = 0;
                for (int i = table.length - 1; i >= 0; i--) {
                    table[i] = null;
                }
            }
    }
}