class Test {
    public class Example {
    private static List < ShannonRadii > shannonRadiiFromCn ( List < Species > speciesList , Cn cn_roman , int radiusToCompare ) {
      List < ShannonRadii > shannonRadii = new ArrayList < > ( ) ;
      for ( Species s : speciesList ) {
        try {
          double radius = s . getShannonRadius ( cn_roman ) ;
          shannonRadii . add ( new ShannonRadii ( s , radius , radius - radiusToCompare ) ) ;
        }
        catch ( Throwable t ) {
          t . printStackTrace ( ) ;
        }
      }
      return shannonRadii ;
    }
        protected void addEndPropertyDescriptor(Object object) {
    		itemPropertyDescriptors
    			.add(createItemPropertyDescriptor(
    				((ComposeableAdapterFactory) adapterFactory)
    					.getRootAdapterFactory(),
    				getResourceLocator(),
    				getString("_UI_LinkEndData_end_feature"), //$NON-NLS-1$
    				getString(
    					"_UI_PropertyDescriptor_description", "_UI_LinkEndData_end_feature", "_UI_LinkEndData_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    				UMLPackage.Literals.LINK_END_DATA__END, true, false, true,
    				null, null, null));
    	}
        @Override
        public synchronized boolean load(File tempDir) {
            boolean isLoaded = gklUtils.load(null);
    
            if(!isLoaded) {
                logger.warn("Intel GKL Utils not loaded");
                return false;
            }
    
            if(!gklUtils.isAvxSupported()) {
                return false;
            }
    
            return NativeLibraryLoader.load(tempDir, nativeLibraryName);
        }
    }
}