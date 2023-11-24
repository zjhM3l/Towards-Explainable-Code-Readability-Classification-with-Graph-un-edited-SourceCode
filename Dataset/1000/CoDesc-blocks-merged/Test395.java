class Test {
    public class Example {
    public void addAllowedPrograms(final Program program) {
            if (isCorporate() && program != null) {
                if (this.allowedPrograms == null) {
                    this.allowedPrograms = new HashSet<Program>();
                }
                this.allowedPrograms.add(program);
            }
        }
        public void contextDestroyed(ServletContextEvent sce) {
    		log.debug("ServletContext destroyed");
    		// help gc, but should be already clear except when exception was thrown
    		// during sessionDestroyed
    		clickstreams.clear();
    	}
        public String getOutput(OID oid, String outputName) {
        loadFeaturesIfNeeded();
        SimpleFeatureBean model = (SimpleFeatureBean)mFeatureHandler.getOrLoadModelForOid(oid);
        if (model != null)
          return model.getOutput(outputName);
        return null;
      } // End method: getOutput
    }
}