class Test {
    public class Example {
    private void changeColorTo(Color color) {
    		redbutton.setBackground(color);
    		yellowbutton.setBackground(color);
    		greenbutton.setBackground(color);
    		bluebutton.setBackground(color);
    	}
        public void testPaintEmptyTree() throws Exception {
        Tree tmpTree = new Tree(null);
    
        tmpTree.paintMe();
        String tmpString = tmpTree.paintMeAsString();
        assertTrue("Tree should contain 'Tree is empty'", tmpString.contains("Tree is empty"));
      }
        @Override
        public PurchaseProvisionedCapacityResult purchaseProvisionedCapacity(PurchaseProvisionedCapacityRequest request) {
            request = beforeClientExecution(request);
            return executePurchaseProvisionedCapacity(request);
        }
    }
}