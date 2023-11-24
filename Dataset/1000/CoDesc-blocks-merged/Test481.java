class Test {
    public class Example {
    @CheckReturnValue @Nonnull static public String to8Bits(int val,boolean msbLeft){
      String result="";
      for (int i=0; i < 8; i++) {
        if (msbLeft) {
          result=(((val & 0x01) != 0) ? "1" : "0") + result;
        }
     else {
          result=result + (((val & 0x01) != 0) ? "1" : "0");
        }
        val=val >> 1;
      }
      return result;
    }
        public void setPerspective(boolean usePers) {
    		perspective = usePers;
    		scene.resizeScene(perspective);
    		render();
    	}
        public SList lookup(String name) {
    	SExpression sx;
    
    	if (null == this.hash)
    	    this.makeLookupHash();
    
    	// See if it's in this hash-table
    	if (this.hash.containsKey(name)) {
    	    sx = (SExpression)this.hash.get(name);
    	    if (sx.isList())
    		return (SList)sx;
    	    else
    		throw new RuntimeException(__me + ".lookup(): " + 
    			"Hashed SEXP lookup \"" + name + 
    			"\" doesn't resolves to SList: " + sx);
    	}
    
    	for (Enumeration e = this.list.elements() ; e.hasMoreElements(); ) {
    	    sx = (SExpression)e.nextElement();
    	    if (sx.isList()) {
    		// Recurse if list
    		sx = ((SList)sx).lookup(name);
    		if (null != sx)
    		    return (SList)sx;
    	    }
    	}
    	return null;
        }
    }
}