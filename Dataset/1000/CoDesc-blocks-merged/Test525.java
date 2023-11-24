class Test {
    public class Example {
    public String toString() {
    		StringBuffer result = new StringBuffer("[Program \"");
    		result.append(name);
    		result.append("\", ");
    		if( fProtected)
    			result.append("protected");
    		else {
    			result.append(statements.size());
    			result.append(" statements");
    		}
    		if (executable != null)
    			result.append(", linked");
    		if (fModified)
    			result.append(", modified");
    		if (fProgramActive)
    			result.append(", active");
    		if (fSystemObject)
    			result.append( ", system object");
    		result.append("]");
    		return result.toString();
    	}
        private void readObject(java.io.ObjectInputStream s)
            throws java.io.IOException, ClassNotFoundException {
            s.defaultReadObject();
    
            // Read in elements until trailing null sentinel found
            Node<E> h = null, t = null;
            for (Object item; (item = s.readObject()) != null; ) {
                @SuppressWarnings("unchecked")
                Node<E> newNode = newNode((E) item);
                if (h == null)
                    h = t = newNode;
                else {
                    NEXT.set(t, newNode);
                    PREV.set(newNode, t);
                    t = newNode;
                }
            }
            initHeadTail(h, t);
        }
        @Override
        public boolean next() {
            if (!this.iterator.hasNext()) {
                this.brlw.numberOfLiteralWords = 0;
                this.brlw.runningLength = 0;
                return false;
            }
            this.brlw.reset(this.iterator.next());
            this.literalWordStartPosition = this.iterator.literalWords(); // +
            // this.brlw.literalWordOffset
            // ==0
            return true;
        }
    }
}