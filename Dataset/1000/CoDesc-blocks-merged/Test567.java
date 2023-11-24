class Test {
    public class Example {
    protected void showOutput() {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    while (true) {
                        EntryMarks ev;
                        synchronized (forOutput) {
                            ev = forOutput.poll();
                        }
                        if (ev == null) {
                            // end of queue
                            return;
                        }
                        if (!mController.isEntryChanged(ev)) {
                            mController.setEntryMarks(ev.entryIndex, ev.builder, ev.result, markerIndex);
                        }
                    }
                }
            });
        }
        public void addOutline(OutlineItem outlineItem) {
        if (outlineItems == null) {
          outlineItems = new ArrayList<OutlineItem>();
        }
        outlineItems.add(outlineItem);
      }
        private void injectProperties(BeanDefinition definition, Object beanInstance) {
    		Dependency[] dependencies = definition
    				.getDependencies(DependencyTarget.Property);
    		Object[] resolved = this.resolveDependencies(dependencies);
    
    		ObjectProxy<Object> bean = Reflect.on(beanInstance);
    
    		for (int i = 0; i < resolved.length; i++) {
    			String setter = "set"
    					+ StringUtils.capitalize(dependencies[i].getPropertyName());
    
    			bean.method(setter, dependencies[i].getType()).invoke(resolved[i]);
    		}
    	}
    }
}