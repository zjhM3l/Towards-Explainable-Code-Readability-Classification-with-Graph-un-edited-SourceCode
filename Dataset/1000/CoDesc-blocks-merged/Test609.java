class Test {
    public class Example {
    public void setKeyStroke(String keyStroke) {
    		if (Converter.isDifferent(this.keyStroke, keyStroke)) {
    			String oldkeyStroke= null;
    			oldkeyStroke = this.keyStroke;
    			this.keyStroke = keyStroke;
    			setModified("keyStroke");
    			firePropertyChange(String.valueOf(APPLICATIONCONTROLS_KEYSTROKE), oldkeyStroke, keyStroke);
    		}
    	}
        protected void addShowresponsehierarchyPropertyDescriptor(Object object) {
    		itemPropertyDescriptors.add
    			(createItemPropertyDescriptor
    				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
    				 getResourceLocator(),
    				 getString("_UI_View_showresponsehierarchy_feature"),
    				 getString("_UI_PropertyDescriptor_description", "_UI_View_showresponsehierarchy_feature", "_UI_View_type"),
    				 DxlPackage.Literals.VIEW__SHOWRESPONSEHIERARCHY,
    				 true,
    				 false,
    				 false,
    				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
    				 null,
    				 null));
    	}
        public static Value TLCEval(Value val){
      Value evalVal=SetEnumValue.convert(val);
      if (evalVal != null) {
        return evalVal;
      }
      evalVal=FcnRcdValue.convert(val);
      if (evalVal != null) {
        return evalVal;
      }
      return val;
    }
    }
}