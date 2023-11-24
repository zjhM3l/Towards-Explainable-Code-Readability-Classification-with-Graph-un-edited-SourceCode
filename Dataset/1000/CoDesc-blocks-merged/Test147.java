class Test {
    public class Example {
    public Revision get(final int revisionIndex)
    	{
    		if (this.storage.containsKey(revisionIndex)) {
    
    			ChronoStorageBlock block = this.storage.get(revisionIndex);
    			return block.getRev();
    		}
    		return null;
    	}
        protected void addFigurePropertyDescriptor(Object object) {
    		itemPropertyDescriptors.add(createItemPropertyDescriptor(
    				((ComposeableAdapterFactory) adapterFactory)
    						.getRootAdapterFactory(), getResourceLocator(),
    				getString("_UI_ColorTransformator_figure_feature"), getString(
    						"_UI_PropertyDescriptor_description",
    						"_UI_ColorTransformator_figure_feature",
    						"_UI_ColorTransformator_type"),
    				DescPackage.Literals.COLOR_TRANSFORMATOR__FIGURE, true, false,
    				true, null, null, null));
    	}
        public void shutDown(int type) {
    		if (running) {
    			running = false;
    		//	The following line is _not_ a good way of doing this! Fix later.
    		//	for(;listener.isAlive();); // Wait for listener to stop.
    			if (type == TOTAL_SHUTDOWN)
    				for (int i=0;i < getNumberOfConnections();i++)
    					getConnectionByIndex(i).close();
    			logEntry("Shutting down server.");
    		}
    		else logEntry("Attempting server shutdown while server is not running.");
    	}
    }
}