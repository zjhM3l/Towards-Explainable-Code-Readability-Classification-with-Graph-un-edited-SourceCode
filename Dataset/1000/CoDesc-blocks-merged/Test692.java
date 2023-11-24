class Test {
    public class Example {
    private void computeZerosAbove() throws RuntimeException {
      short tmp=0;
      for (int k=A.length - 1; k > 0; k--) {
        for (int i=k - 1; i >= 0; i--) {
          short factor1=A[i][k];
          short factor2=GF2Field.invElem(A[k][k]);
          if (factor2 == 0) {
            throw new RuntimeException("The matrix is not invertible");
          }
          for (int j=k; j < 2 * A.length; j++) {
            tmp=GF2Field.multElem(A[k][j],factor2);
            tmp=GF2Field.multElem(factor1,tmp);
            A[i][j]=GF2Field.addElem(A[i][j],tmp);
          }
        }
      }
    }
        public int getWeight(E e ) {	
    		if (! edgeToWeight.containsKey( e )) {
    			throw new IllegalArgumentException("This edge has no assigned weight");
    		}
    		return ((Number) edgeToWeight.get( e )).intValue();
    	}
        public static void callbackRegistration(String method,String modname){
      String[] splitName=method.split("\\.");
      String methodName=splitName[splitName.length - 1];
      String className=method.substring(0,method.length() - methodName.length() - 1);
      APIInstanceProvider providerinst=InternalAPI.getAPIProviderInstance(modname);
      if (providerinst == null) {
        LoggerUtils.error(String.format("Could not initialize API provider instance for %s",modname));
        return;
      }
      LoggerUtils.info(String.format("Trying to call (reflection) %s %s",className,methodName));
      try {
        Class reflectClass=Class.forName(className);
        Method reflectMethod=reflectClass.getDeclaredMethod(methodName,APIInstanceProvider.class);
        reflectMethod.invoke(null,providerinst);
        LoggerUtils.info(String.format("API provided to %s",modname));
      }
     catch (  ClassNotFoundException e) {
        LoggerUtils.error(String.format("Could not find class %s",className));
      }
    catch (  NoSuchMethodException e) {
        LoggerUtils.error(String.format("Could not find method %s",methodName));
      }
    catch (  Exception e) {
        LoggerUtils.error(String.format("Exception while calling the method %s.%s",className,methodName));
        e.printStackTrace();
      }
    }
    }
}