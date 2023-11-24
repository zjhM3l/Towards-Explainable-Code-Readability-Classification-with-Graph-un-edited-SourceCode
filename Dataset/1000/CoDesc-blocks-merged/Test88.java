class Test {
    public class Example {
    private JPasswordField getJPasswordFieldUserPassword() {
    		if (jPasswordFieldUserPassword == null) {
    			jPasswordFieldUserPassword = new JPasswordField();
    			jPasswordFieldUserPassword.addFocusListener(new java.awt.event.FocusAdapter() {
    				public void focusLost(java.awt.event.FocusEvent e) {
    					try {
    						passwdHash = NinanRmiUserContext.hashPassword(new String(getJPasswordFieldUserPassword().getPassword()));
    					} catch (NinanRMIException e1) {
    						// TODO Auto-generated catch block
    						e1.printStackTrace();
    					}
    				}
    			});
    		}
    		return jPasswordFieldUserPassword;
    	}
        public static Set<ClassTemplateSpec> allReferencedTypes(ClassTemplateSpec spec) {
        return findAllReferencedTypes(
            directReferencedTypes(spec),
            Collections.<ClassTemplateSpec>emptySet(),
            Collections.<ClassTemplateSpec>emptySet());
      }
        private String convertElemToText(final Element elem) {
            final String output = elem.getText();
            if (output.trim().length() != 0) {
                return output;
            }
    
            // If the return string is blank, then there can be two possibilities
            // 1) The return value was actually an xml string in which case
            // the element should have children nor should it not belong to
            // xa namespace
            // or
            // 2) The return value is actually an xml string
            if (elem.getNamespace().equals(XAwareConstants.xaNamespace) || elem.getChildren().size() == 0) {
                return output;
            }
    
            // Otherwise convert XML to a string and return it.
            return xmlout.outputString(elem);
        }
    }
}