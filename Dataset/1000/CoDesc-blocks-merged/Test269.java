class Test {
    public class Example {
    public final synchronized Template getTemplate(String name)
            throws ClassNotFoundException, NoSuchMethodException, LinkageError
        {
            Template template = mTemplates.get(name);
            if (template == null) {
                template = loadTemplate(name);
                mTemplates.put(name, template);
            }
            return template;
        }
        private void addListeners(Component component) {
    		component.addKeyListener(this);
    
    		if (component instanceof Container) {
    			Container container = (Container) component;
    
    			container.addContainerListener(this);
    
    			for (Component child : container.getComponents()) {
    				addListeners(child);
    			}
    		}
    	}
        public Not not(Constraint constraint) throws InvalidQueryException, RepositoryException {
            if (!(constraint instanceof ConstraintImpl)) {
                throw new RepositoryException("Unknown Constraint implementation");
            }
            return new NotImpl(resolver, (ConstraintImpl) constraint);
        }
    }
}