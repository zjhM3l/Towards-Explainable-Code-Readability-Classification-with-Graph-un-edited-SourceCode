class Test {
    public class Example {
    public void init(SynapseEnvironment se) {
            if (log.isDebugEnabled()) {
                log.debug("Initializing child mediators");
            }
    
            for (Iterator it = mediators.iterator(); it.hasNext();) {
                Mediator m = (Mediator) it.next();
    
                if (m instanceof ManagedLifecycle) {
                	((ManagedLifecycle) m).init(se);
                }
            } 
        }
        @Override
        public CreateConstraintResult createConstraint(CreateConstraintRequest request) {
            request = beforeClientExecution(request);
            return executeCreateConstraint(request);
        }
        public void testNumericPredicatesSetArg1() throws Exception {
    		testNumericPredicatesAccess();
    		
    		setInputTextField("arg1", "123");
    		clickButtonWithText("execute");
    		assertNoProblem();
    		
    		// 123 == 0
    		assertButtonNotPresentWithText("numeric-equal");
    		
    		// 123 < 0
    		assertButtonNotPresentWithText("numeric-less-than");
    		
    		// 123 > 0
    		assertButtonPresentWithText("numeric-greater-than");
    		
    		// !123
    		assertButtonNotPresentWithText("not arg1");
    	}
    }
}