class Test {
    public class Example {
    protected void _setHeaderForActionResults(String value, String key, WOActionResults results) {
    		if (results instanceof WOResponse) {
    			((WOResponse)results).setHeader(value, key);
    		}
    		else if (results instanceof ERXRouteResults) {
    			((ERXRouteResults)results).setHeaderForKey(value, key);
    		}
    		else {
    			ERXRouteController.log.info("Unable to set a header on an action results of type '" + results.getClass().getName() + "'.");
    		}
    	}
        public String save(){
      UploadedFile item=getFile();
      try {
        String fileName=item.getFileName();
        fileName=FilenameUtils.getBaseName(fileName) + "-" + UUID.randomUUID().toString()+ "."+ FilenameUtils.getExtension(fileName);
        File parent=new File("uploads");
        parent.mkdirs();
        File f=new File(parent,fileName);
        LOG.info("Writing file to " + f.getAbsolutePath());
        FileUtils.writeByteArrayToFile(f,item.getContents());
        messages.info("Wrote file to " + f.getAbsolutePath());
      }
     catch (  Exception e) {
        messages.error(e.getMessage());
      }
      return null;
    }
        public int getNumberOfFailed() {
    		int numberOfFailed = 0;
    		for (TestStep testStep : testSteps) {
    			if (testStep.isFailed()) {
    				++numberOfFailed;
    			}
    		}
    		return numberOfFailed;
    	}
    }
}