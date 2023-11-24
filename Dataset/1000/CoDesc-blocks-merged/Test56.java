class Test {
    public class Example {
    public static void walkUpDirs ( @ NotNull File file ) {
      File prevFile = null ;
      File currentFile = file ;
      while ( currentFile != prevFile ) {
        walkUpDirs ( currentFile ) ;
        prevFile = currentFile ;
        currentFile = currentFile . getParentFile ( ) ;
      }
    }
        private Vector buildConfigNodes(Node node) {
    	try {
    	    console.logEntry();
    
    	    Vector results = new Vector();
    	    Node temp = null;
    	    NodeList children = node.getChildNodes();
    
    	    for (int i = 0; i < children.getLength(); i++) {
    		temp = children.item(i);
    		if (temp.getNodeType() == Node.ELEMENT_NODE) {
    		    results.add(buildSingleConfigNode(temp));
    		}
    	    }
    
    	    return results;
    	} finally {
    	    console.logExit();
    	}
        }
        public void mapSheet2Excel(List<MapSheetWrapper> sheetWrappers, String templatePath, OutputStream os)
                throws Excel4JException {
    
            try (SheetTemplate sheetTemplate = exportExcelByMapHandler(sheetWrappers, templatePath)) {
                sheetTemplate.write2Stream(os);
            } catch (IOException e) {
                throw new Excel4JException(e);
            }
        }
    }
}