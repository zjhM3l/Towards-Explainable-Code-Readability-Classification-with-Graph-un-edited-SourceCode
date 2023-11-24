class Test {
    public class Example {
    public void actionPerformed(ActionEvent e) {
    					double position = (double) currentX / currentWidth;
    
    					Shape newShape = loadShape();
    					if (newShape != null) {
    						// make a new ShapeNodeEditor
    						nodeEditors
    								.add(new ShapeNodeEditor(newShape, position));
    						// rebuild the list of shapes in the shape map to mirror
    						// the
    						// list of ShapeNodeEditors
    						rebuildShapes();
    						// make the ShapeNodeEditors evenly spaced
    						rebuildEditorPanels();
    						// notify possible subclasses that something has changed
    						somethingHasChanged();
    					}
    				}
        public boolean readContinueCode() {
            if (getStatusLine() == null) {
                return false;
            }
            if(null != getRequestHeader("expect") &&
               getStatusLine().getStatusCode() != HttpStatus.SC_CONTINUE) {
                return false;
            }
            return true;
        }
        public String exportAsXML() {
            StringBuffer sb = new StringBuffer ();
    
            sb.append ("<ContactPersonPrimary>")
              .append ("<ContactPerson>")
              .append (XMLTools.validateCDATA (contactPerson))
              .append ("</ContactPerson>")
              .append ("<ContactOrganization>")
              .append (XMLTools.validateCDATA (contactOrganization))
              .append ("</ContactOrganization>")
              .append ("</ContactPersonPrimary>");
    
            return sb.toString ();
        }
    }
}