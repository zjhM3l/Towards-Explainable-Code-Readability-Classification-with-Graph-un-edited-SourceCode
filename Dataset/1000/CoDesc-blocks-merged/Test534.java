class Test {
    public class Example {
    public ClassMapping getClassMappingByName(final String name) {
            Enumeration ec = _mapping.getRoot().enumerateClassMapping();
            while (ec.hasMoreElements()) {
                ClassMapping cm = (ClassMapping) ec.nextElement();
                String cmName = cm.getName();
                if ((cmName != null) && cmName.equals(name)) { return cm; }
            }
            return null;
        }
        @Override
    
        public void cbrt()
    
        {
    
            if (top < 1)
    
            {
    
                throw new EmptyStackException();
    
            }
    
            stack[top-1] = Math.cbrt(stack[top-1]);
    
        }
        public void testAddFolder(){
    		
    		int childs = lib.getChildCount(lib.getRoot());
    
    		//adding one folder
    		lib.addFolder(lib.getRoot(), folderTestName);
    		int childsExpected = lib.getChildCount(lib.getRoot());
    
    		assertEquals("Folder does not have been added to Library",childs+1,childsExpected);
    	}
    }
}