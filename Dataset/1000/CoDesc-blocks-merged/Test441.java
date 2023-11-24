class Test {
    public class Example {
    public void setVariableDeclrs(VariableDeclr[] param){
                                  
                                       validateVariableDeclrs(param);
    
                                   
                                              if (param != null){
                                                 //update the setting tracker
                                                 localVariableDeclrsTracker = true;
                                              } else {
                                                 localVariableDeclrsTracker = true;
                                                     
                                              }
                                          
                                          this.localVariableDeclrs=param;
                                  }
        static void saveLastExecVersion(@Nonnull String version) {
            File lastExecVersionFile = getLastExecVersionFile();
            try {
                FileUtils.write(lastExecVersionFile, version);
            } catch (IOException e) {
                LOGGER.log(SEVERE, "Failed to save " + lastExecVersionFile.getAbsolutePath(), e);
            }
        }
        public String getDatatypeRange(OWLDataProperty prop) {
    		//check if the property is in the first ontology
    		if(Attributes.firstOntology.getDatatypeProperties().contains(prop)){
    			//get the range
    			String range = prop.getRanges(Attributes.firstOntology.getOntology()).toString();
    			//a string like [range] is returned -> delete [ and ] to get a normal string
    			range = range.replace("[", "");
    			range = range.replace("]", "");
    			return range;
    		}
    		//property is in the second ontology
    		else {
    			String range = prop.getRanges(Attributes.secondOntology.getOntology()).toString();
    			range = range.replace("[", "");
    			range = range.replace("]", "");
    			return range;
    		}
    			
    	}
    }
}