class Test {
    public class Example {
    public void testModelAssignmentInInvocation() throws InterpreterException {
             String termAssignment = "Print(l = List(1,2), l);";
             Value result = interpreter.process(termAssignment);
             System.out.println("Result: " + result);
             checkResult("[1,2][1,2]", result);
         }
        public Object getRawValueAt(int row, int col) {
    	StringListItem key = new StringListItem(row + "," + col);
    	Object val = get(key);
    	if (val != null)
    	    val = val.toString();
    	return val;
        }
        public void addOnReconnectListener(OnReconnect listener){
      if (listener != null) {
    synchronized (reconnectListeners) {
          reconnectListeners.add(listener);
          log.debug("Added new OnReconnect listener " + listener);
        }
      }
    }
    }
}