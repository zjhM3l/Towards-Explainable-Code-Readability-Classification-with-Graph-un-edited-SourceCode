class Test {
    public class Example {
    @Override public synchronized Object appendEL(Object o){
      if (offset + size + 1 > arr.length)   enlargeCapacity(size + 1);
      arr[offset + size]=o;
      size++;
      return o;
    }
        public void testSetEndSize() {
    		int i = 2;
    		GraphConstants.setEndSize(map, i);
    		assertTrue(GraphConstants.getEndSize(map) == 2);
    	}
        protected Expression instantiate(Object oldInstance, Encoder out)
        {
            //
            // An implementation instance is actually constructed at decode time by calling
            // ControlBean.ensureControl on the parent bean.  This will create a new impl
            // instance and run the impl initializer on it.
            //
            return new Expression(((XMLEncoder)out).getOwner(), "ensureControl", null);
        }
    }
}