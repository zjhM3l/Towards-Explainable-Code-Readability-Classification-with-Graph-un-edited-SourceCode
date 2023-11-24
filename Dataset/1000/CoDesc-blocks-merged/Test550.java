class Test {
    public class Example {
    static public ECollection createCollection(ECollection necol){
    		ECollection ecol = null;
    		
    		TCollections tcol = new TCollections();
    		tcol.setName(necol.getColname());
    		tcol.setDescription(necol.getDescription());
    		try {
                ecol = getECollection(tcol.create());
            } catch (MyDMException e) {
                e.printStackTrace();
            }
    		
    		return ecol;
    	}
        protected void renderTableEnd(UIComponent table, ResponseWriter writer) throws IOException {
    
    		writer.endElement("table");
    		writer.writeText("\n", table, null);
    
    	}
        private String convClassToFileName(String classRepresentation) {
    
        return classRepresentation.replace('.', '/') + CLASS_EXT;
        
        /* do not use this; JarFile.getEntry("filename") uses '/' to
           separate path even in Windows. Possible bug in Java? */
        //return classRepresentation.replace('.', File.separatorChar) + CLASS_EXT;
      }
    }
}