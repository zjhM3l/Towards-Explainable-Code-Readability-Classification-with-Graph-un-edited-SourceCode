class Test {
    public class Example {
    public static boolean reloadComponentsUI ( Component self ) {
      Component [ ] selectedComponents = getSelectedComponents ( self ) ;
      engine . startProcessing ( "Reloading Components ..." , selectedComponents . length ) ;
      List < Component > reloadFailedComponents = new ArrayList < Component > ( ) ;
      for ( Component component : selectedComponents ) {
        if ( component . getInterface ( ) . isDeactivatable ( ) ) {
          boolean success = reloadComponent ( component . getName ( ) ) != null ? reloadComponent ( component . getName ( ) ) : false ;
          if ( ! success ) {
            reloadFailedComponents . add ( component ) ;
          }
        }
        else {
          engine . getNotificationsManager ( ) . warnify ( "{0}
     | '{
    1}
    ' Component cannot be deactivated and won't be reloaded!" , self . getClass ( ) . getName ( ) , component . getName ( ) ) ;
          }
          engine . stepProcessing ( ) ;
        }
        engine . stopProcessing ( ) ;
        if ( reloadFailedComponents . isEmpty ( ) ) {
          return true ;
        }
        else {
          throw new Manager . RuntimeException ( "{0}
     | Exception(s) thrown while reloading '{
    1}
    ' Component(s)!" , self . getClass ( ) . getName ( ) , Joiner . on ( ", " ) . join ( ( reloadFailedComponents . size ( ) > 0 ? reloadFailedComponents . get ( 0 ) : "" ) ) ) ;
          }
        }
        public void testModPowPosExp(){
      byte aBytes[]={-127,100,56,7,98,-1,39,-128,127,75,48,-7};
      byte eBytes[]={27,-15,65,39};
      byte mBytes[]={-128,2,3,4,5};
      int aSign=1;
      int eSign=1;
      int mSign=1;
      byte rBytes[]={113,100,-84,-28,-85};
      BigInteger aNumber=new BigInteger(aSign,aBytes);
      BigInteger exp=new BigInteger(eSign,eBytes);
      BigInteger modulus=new BigInteger(mSign,mBytes);
      BigInteger result=aNumber.modPow(exp,modulus);
      byte resBytes[]=new byte[rBytes.length];
      resBytes=result.toByteArray();
      for (int i=0; i < resBytes.length; i++) {
        assertTrue(resBytes[i] == rBytes[i]);
      }
      assertEquals("incorrect sign",1,result.signum());
    }
        private void setAdminRight(String userName, boolean value) {
            for (JCheckBox check : containterAdmin) {
                if (check.getActionCommand().replaceFirst("ADMIN_", "").equals(userName)) {
                    check.setSelected(value);
                    return;
                } else {
                    continue;
                }
            }
        }
    }
}