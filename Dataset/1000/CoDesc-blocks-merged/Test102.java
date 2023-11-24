class Test {
    public class Example {
    public int getColumnCount() {
        int max = 0;
        for (int r = 0; r < lData.length; r ++) {
          if (max < lData[r].length) {
            max = lData[r].length;
          }
        }
        return max;
      }
        public void setPainters(List<? extends Painter<T>> painters)
        {
            Collection<Painter<T>> old = new ArrayList<Painter<T>>(getPainters());
    
            for (Painter<T> p : old)
            {
                if (p instanceof AbstractPainter)
                {
                    ((AbstractPainter<?>) p).removePropertyChangeListener(handler);
                }
            }
    
            this.painters.clear();
            this.painters.addAll(painters);
    
            for (Painter<T> p : this.painters)
            {
                if (p instanceof AbstractPainter)
                {
                    ((AbstractPainter<?>) p).addPropertyChangeListener(handler);
                }
            }
    
            setDirty(true);
            firePropertyChange("painters", old, getPainters());
        }
        private void endConnection() {
    		connected = false;
    		try {
    			output.endDocument();
    		} catch (Exception e) {
    			System.err.println("*** Error disconnectiong : " + e.getMessage());
    		}
    	}
    }
}