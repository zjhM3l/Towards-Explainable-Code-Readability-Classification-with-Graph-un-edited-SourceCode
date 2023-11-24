class Test {
    public class Example {
    public void setExtraElement(org.apache.axiom.om.OMElement param){
                                
                                    clearAllSettingTrackers();
                                
                                           if (param != null){
                                              //update the setting tracker
                                              localExtraElementTracker = true;
                                           } else {
                                              localExtraElementTracker = false;
                                                  
                                           }
                                       
                                                this.localExtraElement=param;
                                        
    
                                   }
        protected void translateClassDescription( Element parent, OntClass classDescr, Model source ) {
            if (classDescr.isUnionClass()) {
                translateUnionClass( parent, classDescr, source );
            }
            else if (classDescr.isIntersectionClass()) {
                translateIntersectionClass( parent, classDescr, source );
            }
            else if (classDescr.isComplementClass()) {
                translateComplementClass( parent, classDescr, source );
            }
            else if (classDescr.isEnumeratedClass()) {
                translateEnumeratedClass( parent, classDescr, source );
            }
            else if (classDescr.isRestriction()) {
                translateRestrictionClass( parent, classDescr, source );
            }
        }
        private String formatValue(java.lang.String newValue) {
    
    	String myReturnString = "";
    	
    	if (newValue==null) return null;
    	else
    		for (int i=0; i<newValue.length(); i++) {
    
    			// --- Change '>' & '<' with the HTML symbole
    			if (newValue.charAt(i)=='\'')
    				myReturnString += "&#39";
    			else if (newValue.charAt(i)=='\"')
    				myReturnString += "&#34";
    			else 
    				myReturnString += newValue.charAt(i);
    		}
    
    
    	return myReturnString;
    }
    }
}