class Test {
    public class Example {
    public void run() {
    		showStatus( getAppletInfo() );
    
    		if ( spectrum == null ) {
    			try {
               			spectrum = new Spectrum( this );
    				readParameters();
    			}
    			catch ( Exception e ) {
    				showStatus( "Caught IO Error: " + e.toString() );
    			}
    		}
    
    		if ( spectrum != null ) {
    			spectrum.execute();
    		}
    	}
        private CType getSumType(RSummary sum) {
        XTypedSelectElem    elem;
    
        if (sum.getField().getQuery() == null) {
          return getXKjcType(sum.getField().getDatatype());
        }
    
        elem = getSelectElem(sum.getField());
    
        return toNullableType(elem.getVariableDefinition().getType());
      }
        private void prettyPrintLineage(String name, int spaces) {
    	    for ( int i=0; i<spaces; i++ ){
    			System.out.print(" ");
    		}
    		FamilyMember person = _ftree.get(name);
    		if ( person == null ) {
    		    return;
    		}
    		System.out.println( person );
    		if ( person.getChildren().size() == 0 ) {
    			return;
    		}
    		//Recursivley prints the children lineage.
    		List<FamilyMember> children = person.getChildren();
    		for ( FamilyMember kid:children ){
    			prettyPrintLineage( kid.getName(), spaces+3 );
    		}
    	}
    }
}