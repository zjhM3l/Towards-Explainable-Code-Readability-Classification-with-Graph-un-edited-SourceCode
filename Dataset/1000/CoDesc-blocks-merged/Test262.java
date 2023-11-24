class Test {
    public class Example {
    public String decodeObjectIdentifier(IType obj) throws IOException {
          cat.debug("==> decodeObjectIdentifier()");
    
          Tag tag = obj.tag();
          byte[] buffer = readRaw(tag, Tag.OBJECT_IDENTIFIER);
          String result = toOID(buffer);
    
          cat.debug("<== decodeObjectIdentifier() --> "+result);
          return result;
       }
        protected SizeRequirements calculateMinorAxisRequirements(int axis, SizeRequirements r) {
    	updateGrid();
    	
    	// calculate column requirements for each column
    	calculateColumnRequirements(axis);
    
    
    	// the requirements are the sum of the columns.
    	if (r == null) {
    	    r = new SizeRequirements();
    	}
    	long min = 0;
    	long pref = 0;
    	long max = 0;
    	for (int i = 0; i < columnRequirements.length; i++) {
    	    SizeRequirements req = columnRequirements[i];
    	    min += req.minimum;
    	    pref += req.preferred;
    	    max += req.maximum;
    	}
    	r.minimum = (int) min;
    	r.preferred = (int) pref;
    	r.maximum = (int) max;
    	r.alignment = 0;
    	return r;
        }
        public CompositionProcess createEmptyComposition(String projectName) {
    		String user = ((UserSessionIM) getUserSession()).getCurrentUserId();
    		this.currentCompositionPrococess = compManager.newComposition(user, projectName);
    		this.projectName=projectName;		
    		return this.currentCompositionPrococess;
    	}
    }
}