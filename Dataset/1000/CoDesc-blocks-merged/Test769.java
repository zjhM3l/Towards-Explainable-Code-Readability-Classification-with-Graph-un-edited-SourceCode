class Test {
    public class Example {
    public void printlnFilled(java.lang.String aString, char FillChar) {
            // @BEGINPROTECT _3D6A6EB50122
            String indentString = "";
            for (int i = this.getIndentLevel(); i > 0; i--) {
                indentString += this.getIndentString();
            }
    
            int maxLength = this.getMaxLineLength() - aString.length() - indentString.length();
    
            StringBuffer line = new StringBuffer(aString);
            for (int i = 0; i < maxLength; i++) {
                line.append(FillChar);
            }
    
            this.println(line.toString());
            // @ENDPROTECT
        }
        public static final Tag OPTIONS = new Tag ( ) {
      @ Override public void render ( Parameter self , StaplerRequest req , Tag tag ) throws IOException , ServletException {
        Pattern option = tag . patternGenerator ( "option" ) ;
        tag . add ( new OptionView ( index , o , option . matcher ( o ) ) ) ;
      }
    }
        public String getURI(String prefix) {
            
            // find prefix in current context
            for (int i = fNamespaceSize; i > 0; i -= 2) {
                //if (fNamespace[i - 2] == prefix) {
            	if (fNamespace[i - 2].equals(prefix) ) {
                    return fNamespace[i - 1];
                }
            }
    
            // prefix not found
            return null;
    
        }
    }
}