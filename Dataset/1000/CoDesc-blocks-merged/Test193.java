class Test {
    public class Example {
    final protected void fireChildChanged(String childName, Object child, Object oldValue) {
            if (child == null) {
                fireChanged(); // well something changed			
            } else {
                GTDelta delta;
                delta = new GTDeltaImpl(new GTNoteImpl(childName, GTDelta.NO_INDEX),
                        GTDelta.Kind.CHANGED, child);
                delta = new GTDeltaImpl(notification, GTDelta.Kind.NO_CHANGE, this);
                notification.getParent().changed(delta);
            }
        }
        public double getDouble(String key, double defaultValue) {
            try {
                return Double.parseDouble((String) dataMap.get(key));
            }
            catch (Exception exc) {
                return defaultValue;
            }
        }
        public void setRDFType( Resource rdfClass, boolean replace ) {
            if (replace) {
                setRDFType( rdfClass );
            }
            else {
                addRDFType( rdfClass );
            }
        }
    }
}