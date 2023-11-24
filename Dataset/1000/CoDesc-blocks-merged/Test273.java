class Test {
    public class Example {
    public Object getValueObject() {
            String label = getLabel();
            if (label == null || label.length() == 0) {
                return null;
            } else {
                return label;
            }
        }
        public void setView(String view) {
            try { 
                project.setPersistentProperty(VIEW_KEY, view);
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
        protected DataElement copy() {
        SelectBeforeOperate aCopy = new SelectBeforeOperate();
        aCopy.commandID = commandID;
    
        return aCopy;
      }
    }
}