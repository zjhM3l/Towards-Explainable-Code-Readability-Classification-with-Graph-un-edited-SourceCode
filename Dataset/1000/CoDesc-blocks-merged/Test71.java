class Test {
    public class Example {
    public ChangelogWsResponse changelog(ChangelogRequest request) {
        return call(
          new GetRequest(path("changelog"))
            .setParam("issue", request.getIssue()),
          ChangelogWsResponse.parser());
      }
        protected void addFacesListener(FacesListener listener) {
    
            if (listener == null) {
                throw new NullPointerException();
            }
    
            if (listeners == null) {
                listeners = new AttachedObjectListHolder<FacesListener>();
            }
    
            listeners.add(listener);
    
        }
        protected void addBackgroundColorPropertyDescriptor(Object object) {
    		itemPropertyDescriptors.add
    			(createItemPropertyDescriptor
    				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
    				 getResourceLocator(),
    				 getString("_UI_DiagramElement_backgroundColor_feature"),
    				 getString("_UI_PropertyDescriptor_description", "_UI_DiagramElement_backgroundColor_feature", "_UI_DiagramElement_type"),
    				 Di2Package.Literals.DIAGRAM_ELEMENT__BACKGROUND_COLOR,
    				 true,
    				 false,
    				 false,
    				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
    				 null,
    				 null));
    	}
    }
}