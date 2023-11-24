class Test {
    public class Example {
    public boolean matchesCurrentAvailableDevices(@NotNull Collection<IDevice> devices){
      if (myDevicesAvailableAtLaunch.size() != devices.size()) {
        return false;
      }
      for (  IDevice d : devices) {
        if (!myDevicesAvailableAtLaunch.contains(d.getSerialNumber())) {
          return false;
        }
      }
      return true;
    }
        public Package findPackage(String packageName) {
            String testName = getName() + "." + packageName;
            Package[] packages = getPackages(false);
            for ( int i=0; i<packages.length; i++ ) {
                if ( packages[i].getName().equals( testName ))
                    return packages[i];
                else {
                    String plusDot = packages[i].getName() + ".";
                    if ( testName.startsWith(plusDot))
                        return packages[i].findPackage(testName.substring(plusDot.length()));
                }
            }
    
            return null;
        }
        private static void inferenceTipCached ( @ NotNull PsiMethod method , @ NotNull PsiMethodCallExpression call , @ NotNull PsiSubstitutor substitutor , @ NotNull Map < PsiMethod , List < PsiMethodCallExpression >> cache ) {
      final PsiElement node = call . getMethodExpression ( ) . getReferenceNameElement ( ) ;
      PsiMethodCallExpression call = ( PsiMethodCallExpression ) node ;
      try {
        ContainerUtil . addIfNotNull ( cache . get ( method ) , call ) ;
      }
      catch ( IncorrectOperationException e ) {
        final List < PsiMethodCallExpression > result = call . getArgumentList ( ) . getExpressions ( ) ;
        final List < PsiMethodCallExpression > original = ContainerUtil . newArrayList ( result ) ;
        ContainerUtil . addAll ( original , call ) ;
        ContainerUtil . addAll ( result , call ) ;
        call . resolveMethod ( ) . getArgumentList ( ) . getExpressions ( ) . remove ( 0 ) ;
        cache . put ( method , ContainerUtil . newArrayList ( original ) ) ;
        return ;
      }
    }
    }
}