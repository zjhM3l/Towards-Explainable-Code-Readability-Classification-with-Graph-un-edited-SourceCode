class Test {
    public class Example {
    public void testSelect() {
            System.out.println("testSelect");
            
            testObject.setPhone("123453445");
            assertEquals(testObject.getPhone(), "(123)453-445");
        }
        public static boolean changeSubPage ( Page self , int offset , int maxPageCount , boolean nom ) {
      if ( offset == 0 ) return false ;
      if ( self . slots [ Page . SUBPAGE ] == 0 ) self . slots [ Page . SUBPAGE ] = 1 ;
      if ( ( self . slots [ Page . SUBPAGE ] + offset > maxPageCount ) && nom ) return false ;
      else if ( ( self . slots [ Page . SUBPAGE ] + offset < 1 ) && nom ) return false ;
      else self . slots [ Page . SUBPAGE ] = norm_page_cnt ( self . slots [ Page . SUBPAGE ] + offset , maxPageCount ) ;
      return true ;
    }
        public CaTIES_LexBIGConcept getNextUnprocessedConcept() {
    		CaTIES_LexBIGConcept result = null;
    		if (conceptHeap.size() > 0) {
    			result = (CaTIES_LexBIGConcept) conceptHeap.remove();
    		}
    		return result;
    	}
    }
}