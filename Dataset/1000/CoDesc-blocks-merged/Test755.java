class Test {
    public class Example {
    private ConstraintElement blankToVariable(Node blankNode) {
    
        Node_Blank bnode = (Node_Blank) blankNode;
        if (nodesToVariables.containsKey(bnode)) {
          return (ConstraintElement) nodesToVariables.get(bnode);
        }
        else {
          Variable newVar = varFactory.newVariable();
          nodesToVariables.put(bnode, newVar);
          return newVar;
        }
      }
        public JSONNavi<T> add(Object... values) {
    		array();
    		if (failure)
    			return this;
    		List<Object> list = a(current);
    		for (Object o : values)
    			list.add(o);
    		return this;
    	}
        private void executeTargets() throws BuildException {
    
            if (project == null) {
                return; //shouldn't happen but return JIC
            }
            // execute the default command handler's target: execute
            final List targets = new Vector();
            //if (null != unnamed_target) {
            //log("adding the Ant1.6 unnamed target.");
            //  targets.add("");
            //}
            targets.add("execute"); // the Antdepo default target
    
            project.fireBuildStarted();
    
            for (Iterator iter = targets.iterator(); iter.hasNext();) {
                final String targetName = (String) iter.next();
                project.executeTarget(targetName);
            }
            project.fireBuildFinished(null);
        }
    }
}