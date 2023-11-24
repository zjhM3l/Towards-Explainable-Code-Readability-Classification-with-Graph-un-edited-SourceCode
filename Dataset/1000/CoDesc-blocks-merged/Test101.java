class Test {
    public class Example {
    public IRepositoryOptions getRepositoryOptions() {
    		if (repositoryOptions == null) {
    			repositoryOptions = createRepositoryOptions();
    			if (optionListener == null) {
    				optionListener = new OptionListener();
    			}
    			repositoryOptions.addXfsrOptionListener(optionListener);
    		}
    		return repositoryOptions;
    	}
        protected void addNormalPropertyDescriptor(Object object) {
    		itemPropertyDescriptors.add
    			(createItemPropertyDescriptor
    				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
    				 getResourceLocator(),
    				 getString("_UI_Trap_normal_feature"),
    				 getString("_UI_PropertyDescriptor_description", "_UI_Trap_normal_feature", "_UI_Trap_type"),
    				 LeveleditorPackage.Literals.TRAP__NORMAL,
    				 true,
    				 false,
    				 false,
    				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
    				 null,
    				 null));
    	}
        private boolean isBufferHeaderValid(ByteBuffer buffer) {
            if (buffer.get(2) == magicNumber && buffer.get(3) == protocolVersion) {
                return true;
            } else {
                return false;
            }
        }
    }
}