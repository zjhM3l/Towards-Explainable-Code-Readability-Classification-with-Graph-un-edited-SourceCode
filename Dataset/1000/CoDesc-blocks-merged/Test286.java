class Test {
    public class Example {
    private void deleteGameFiles(File rootFile) {
    		File[] innerFiles = rootFile.listFiles();
    		for (File file : innerFiles) {
    			if (file.isDirectory())
    				deleteGameFiles(file);
    			else
    				file.delete();
    		}
    	}
        public void setPOJOClass(Class<?> pojoClass) {
            this.pojoClass = pojoClass;
            setPOJOName(pojoClass.getName());
            
            // Index the POJO's methods
            methods = new HashMap<String, Method>();
            Method[] m = pojoClass.getMethods();
            for (int i = 0; i < m.length; i++) {
                methods.put(m[i].getName(), m[i]);
            }
        }
        private boolean containsRepSetUID(List<ReplicationSetUID> rsetUids,ReplicationSetUID repSetUID){
      for (  ReplicationSetUID rsetUid : rsetUids) {
        if (rsetUid.getId() == repSetUID.getId()) {
          return true;
        }
      }
      return false;
    }
    }
}