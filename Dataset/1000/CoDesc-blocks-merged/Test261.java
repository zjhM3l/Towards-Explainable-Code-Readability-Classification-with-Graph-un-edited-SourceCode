class Test {
    public class Example {
    public HTMLFormElement getForm() {
            Node parent = getParentNode(); 
            while ( parent != null ) {
                if ( parent instanceof HTMLFormElement ) {
                    return (HTMLFormElement) parent;
                }
                parent = parent.getParentNode();
            }
            return null;
        }
        public boolean hasValueChanged(Object oldValue, Object newValue) {
            if( oldValue != null && classesWithSafeEquals.contains( oldValue.getClass() ) ) {
                return !oldValue.equals( newValue );
            } else {
                return oldValue != newValue;
            }
        }
        public void printDataStartField(PrintWriter out, int iPrintOptions)
        {
            if ((iPrintOptions & HtmlConstants.MAIN_SCREEN) == HtmlConstants.MAIN_SCREEN)
            {
            }
            else 
                out.println("<tr>");
        }
    }
}