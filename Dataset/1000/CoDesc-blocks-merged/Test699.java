class Test {
    public class Example {
    private PropertyEditor getCustomEditor(Class requiredType) {
    		if (requiredType != null) {
    			PropertyEditor editor = (PropertyEditor) this.customEditors.get(requiredType);
    			if (editor == null) {
    				for (Iterator it = this.customEditors.keySet().iterator(); it.hasNext();) {
    					Object key = it.next();
    					if (key instanceof Class && ((Class) key).isAssignableFrom(requiredType)) {
    						editor = (PropertyEditor) this.customEditors.get(key);
    					}
    				}
    			}
    			return editor;
    		}
    		return null;
    	}
        public void createNewConfiguration(String imageId, String imageLocation){
    		instanceConfiguration = new InstanceConfiguration();
    		
    		instanceConfiguration.setImageId(imageId);
    		instanceConfiguration.setImageLocation(imageLocation);
    		
    		
    	}
        public void hide(){
      if (this.parent.isDisposed()) {
        SWT.error(SWT.ERROR_WIDGET_DISPOSED);
      }
      if (this.panel == null || this.panel.isDisposed()) {
        return;
      }
      this.panel.dispose();
    }
    }
}