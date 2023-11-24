class Test {
    public class Example {
    public static double[][] selectColumns(double matrix[][],Vector<Integer> columns){
      double[][] data=new double[matrix.length][columns.size()];
      for (int r=0; r < matrix.length; r++) {
        for (int cIndex=0; cIndex < columns.size(); cIndex++) {
          data[r][cIndex]=matrix[r][columns.elementAt(cIndex).intValue()];
        }
      }
      return data;
    }
        public WorkingSetGroup createWorkingSetGroup(Composite composite, IStructuredSelection selection, String[] supportedWorkingSetTypes) {
    		if (workingSetGroup != null)
    			return workingSetGroup;
    		workingSetGroup = new WorkingSetGroup(composite, selection, supportedWorkingSetTypes);
    		return workingSetGroup;
    	}
        protected void addHasProcessPropertyDescriptor(Object object) {
    		itemPropertyDescriptors.add
    			(createItemPropertyDescriptor
    				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
    				 getResourceLocator(),
    				 getString("_UI_OwlsProfile_hasProcess_feature"),
    				 getString("_UI_PropertyDescriptor_description", "_UI_OwlsProfile_hasProcess_feature", "_UI_OwlsProfile_type"),
    				 OwlsPackage.Literals.OWLS_PROFILE__HAS_PROCESS,
    				 true,
    				 false,
    				 true,
    				 null,
    				 null,
    				 null));
    	}
    }
}