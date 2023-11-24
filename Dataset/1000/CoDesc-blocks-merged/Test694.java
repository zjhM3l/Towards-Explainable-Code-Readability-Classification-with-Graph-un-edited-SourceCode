class Test {
    public class Example {
    public void reset() throws XNIException {
            fNamespaceContext.reset();
            fValidationManager.reset();
            fEntityManager.reset(this);
            fErrorReporter.reset(this);
            fSchemaValidator.reset(this);
            // Mark configuration as fixed.
            fConfigUpdated = false;
        }
        public void testSetRemoveController() {
    
            players[0].setControllers(new HashSet(Arrays.asList(controllers)));
            HobbesTestConstants.assertContains(players[0].getControllers().toArray(), controllers[0]);
            HobbesTestConstants.assertContains(players[0].getControllers().toArray(), controllers[1]);
            players[0].removeController(controllers[0]);
            HobbesTestConstants.assertNotContains(players[0].getControllers().toArray(), controllers[0]);
        }
        public Vector getClassName() {
            
            className.add("column1");
            className.add("column2");
            className.add("column3");
            className.add("column4");
            className.add("column5");
            className.add("NoClass");
            return this.className;
        }
    }
}