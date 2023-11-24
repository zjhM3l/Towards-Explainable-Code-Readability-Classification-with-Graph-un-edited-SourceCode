class Test {
    public class Example {
    protected FunctionTypeReference getAsProcedureOrNull(ParameterizedTypeReference typeReference) {
    		ITypeReferenceOwner owner = typeReference.getOwner();
    		JvmType type = typeReference.getType();
    		FunctionTypeReference functionType = new FunctionTypeReference(owner, type);
    		if (!tryAssignTypeArguments(typeReference.getTypeArguments(), functionType))
    			return null;
    		JvmType voidType = (JvmType) owner.getContextResourceSet().getEObject(URIHelperConstants.PRIMITIVES_URI.appendFragment("void"), true);
    		functionType.setReturnType(owner.newParameterizedTypeReference(voidType));
    		return functionType;
    	}
        private PerfMetricId findMetricId(String group,String name,PerfStatsType type,PerformanceManagerUnit unit,PerfSummaryType rollupType){
      PerfMetricId res=new PerfMetricId();
      PerfCounterInfo counter=this.perfCounterLookup.getCounter(name,group,type,rollupType,unit);
      if (counter == null) {
        String msg=String.format("Cannot find metric for %s/%s/%s/%s/%s",group,name,type,rollupType.value(),unit.value());
        logger.warning(msg);
        throw new IllegalArgumentException(msg);
      }
      res.setCounterId(counter.getKey());
      res.setInstance("");
      return res;
    }
        public static Model getModel ( Application self , String modelIdentifier ) {
      if ( modelIdentifier . contains ( "." ) ) {
        return self . getModel ( modelIdentifier ) ;
      }
      else {
        String message = "Application - getModel() - " + "Model with identifier {
    }
     does not exist." ;
        throw new RuntimeException ( message ) ;
      }
    }
    }
}