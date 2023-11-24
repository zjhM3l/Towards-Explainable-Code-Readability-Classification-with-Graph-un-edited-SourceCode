class Test {
    public class Example {
    public IntVariable makeInternalVar(int[] domain) {
    		this.var = new IntVariable(this, domain);
    		this.var.setVarIdentifier(new VarIdentifier(this.agentId, 0));
    		this.addVariable(var.getVarIdentifier(), var);
    		return var;
    	}
        private int getLastLineNumber() {
            if (text != null) {
                int end = text.getText().length();
                Element rootElement = text.getDocument().getDefaultRootElement();
                int lineNumber = rootElement.getElementIndex(end);
                return lineNumber + 1;
            }
            return -1;
        }
        protected void doLaunch() throws ControlException {
            ExampleModel selected = ((LaunchpadModel) getModel()).getSelectedExample();
            if (selected == null) {
                return;
            }
            String controller = selected.getControllerName();
            try {
                BasicController c = (BasicController) Class.forName(controller).newInstance();
                addChild(c);
                c.startup();
            } catch (Exception e) {
                LOG.fatal("Can't launch: " + controller, e);
                throw new ControlException("CANT_LAUNCH", controller);
            }
        }
    }
}