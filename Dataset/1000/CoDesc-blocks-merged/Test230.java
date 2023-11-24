class Test {
    public class Example {
    public Map getInstance() {
          if (instance == null) {
            instance = createInstance();
          }
          return instance;
        }
        @SuppressWarnings("unchecked") @Override public void eSet(int featureID,Object newValue){
    switch (featureID) {
    case UmplePackage.KEY_DEFINITION___DEFAULT_KEY_1:
        getDefaultKey_1().clear();
      getDefaultKey_1().addAll((Collection<? extends String>)newValue);
    return;
    case UmplePackage.KEY_DEFINITION___KEY_1:
    getKey_1().clear();
    getKey_1().addAll((Collection<? extends Key_>)newValue);
    return;
    }
    super.eSet(featureID,newValue);
    }
        public static void loadModeValidator ( obs_mode . mode . Validator validator , Node node ) {
      Object nval = node . get ( "validator" ) ;
      if ( nval == null ) {
      }
      else if ( nval instanceof String ) {
        validator . setValidator ( importObject ( ( String ) nval ) ) ;
      }
      else {
        throw new NullPointerException ( "validator must be null or a string" ) ;
      }
    }
    }
}