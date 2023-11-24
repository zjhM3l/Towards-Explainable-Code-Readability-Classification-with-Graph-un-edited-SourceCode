class Test {
    public class Example {
    private void printIndents() throws IOException {
        try {
          write(indents[depthCounter.getLevel()]);
        } catch (IndexOutOfBoundsException e) {
          // unlikely needed so can be slow
          for(int i = 0; i < depthCounter.getLevel(); i++)
            write("  ");
        }
       
      }
        public Index indexById(byte[] id) throws IOException {
            if (id.length != 8) {
                throw new IllegalArgumentException("Expected 8 byte identifier: " + id.length);
            }
            return indexById(readLongBE(id, 0));
        }
        public void testGetNode() {
    		final DirectedAcyclicGraph<Object> dag = new DirectedAcyclicGraph<Object>();
    		final Object o1 = new Object();
    		final Object o2 = new Object();
    		final Node<Object> n = dag.getNode(o1);
    		assertSame(n, dag.getNode(o1));
    		assertNotSame(n, dag.getNode(o2));
    	}
    }
}