class Test {
    public class Example {
    public Aggregate duplicate() throws IOException, ClassNotFoundException {
    		Aggregate result = new Aggregate();
    		// serialize
    		ByteArrayOutputStream baos = new ByteArrayOutputStream();
    		ObjectOutputStream oos = new ObjectOutputStream(baos);
    		writeExternal(oos);
    		oos.close();
    		// convert to byte array
    		byte[] buf = baos.toByteArray();
    		baos.close();
    		// create input streams
    		ByteArrayInputStream bais = new ByteArrayInputStream(buf);
    		ObjectInputStream ois = new ObjectInputStream(bais);
    		// deserialize
    		result.readExternal(ois);
    		ois.close();
    		bais.close();
    		// clone the header if there is one
    		if (header != null) {
    			result.setHeader(header.clone());
    		}
    		return result;
    	}
        private JMenu getMenuAvancado() {
    		if (menuAvancado == null) {
    			menuAvancado = new JMenu();
    			menuAvancado.setText("Advanced");
                menuAvancado.add(getMenuItemAdjustPosition());			
    			menuAvancado.add(getMenuItemAdjustCharset());
    			menuAvancado.add(getMenuItemAdjustMetrics());
    			menuAvancado.add(getMenuItemMetricsLimit());		
    		}
    		return menuAvancado;
    	}
        @SuppressWarnings("unchecked") // worse case should be a ClassCastException
      /*
       * TODO(cpovirk): Consider requiring key to be a K here. But AtomicLongMapSubject isn't currently
       * parameterized, and if we're going to add a type parameter, I'd rather wait until after we
       * (hopefully) remove the other existing type parameters.
       */
      public void containsEntry(Object key, long value) {
        checkNotNull(key, "AtomicLongMap does not support null keys");
        long actualValue = ((AtomicLongMap<Object>) actual()).get(key);
        if (actualValue != value) {
          failWithActual("expected to contain entry", immutableEntry(key, value));
        }
      }
    }
}