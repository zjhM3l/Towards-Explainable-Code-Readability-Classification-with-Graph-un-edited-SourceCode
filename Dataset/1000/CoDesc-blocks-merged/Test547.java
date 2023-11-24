class Test {
    public class Example {
    private static void initializeVariables ( MLModel self ) {
      self . globalVars = new HashMap < > ( ) ;
      for ( String mtfDimensionName : ( String [ ] ) ( self . layoutValidator . getSplittableMtfDimensionNames ( ) ) ) {
        for ( String meshDimensionName : ( String [ ] ) ( self . layoutValidator . getMeshDimensionNameToSize ( ) ) ) {
          String name = globalVarName ( mtfDimensionName , meshDimensionName ) ;
          self . globalVars . put ( new Pair < > ( mtfDimensionName , meshDimensionName ) , ( self . model . newBoolVar ( name ) ) ) ;
        }
      }
      self . localVars = new HashMap < > ( ) ;
      for ( int mtfDimensionSet : self . mtfDimensionSets ) {
        self . localVars . put ( mtfDimensionSet , new HashMap < > ( ) ) ;
        for ( Assignment assignment : self . assignments . get ( mtfDimensionSet ) ) {
          String name = localVarName ( mtfDimensionSet , assignment ) ;
          self . localVars . get ( mtfDimensionSet ) . put ( name , ( self . model . newBoolVar ( name ) ) ) ;
        }
      }
      int memoryUpperBound = 0 ;
      for ( String tensorName : self . graph . getAllTensorNames ( ) ) {
        if ( self . graph . isTensorOnCanonicalDevice ( tensorName ) ) {
          memoryUpperBound += ( int ) self . graph . getTensorSize ( tensorName ) ;
        }
      }
      self . memoryVar = self . model . newIntVar ( 0 , memoryUpperBound , "z" ) ;
    }
        public Collection getChildrenFeatures(Object object) {
    		if (childrenFeatures == null) {
    			super.getChildrenFeatures(object);
    			childrenFeatures.add(StrutsConfig11Package.eINSTANCE.getDataSourceType_SetProperty());
    		}
    		return childrenFeatures;
    	}
        public void init() {
    	Properties props;
    
    	String leaguefile = getParameter("Leaguefile");
    	if(leaguefile != null) {
    	  props = readLeaguefile(leaguefile); // read from options file
    	}
    	else {
    	  props = readParams(); // read Applet params
    	  leaguefile = "param";
    	}
    
    	setup(leaguefile, props);
    
       // if no GUI -> build it now
    	if( !guiBuilt_ ) {
    	  buildGUI();
    	}
    
    	showLeague(leaguefile);
    }
    }
}