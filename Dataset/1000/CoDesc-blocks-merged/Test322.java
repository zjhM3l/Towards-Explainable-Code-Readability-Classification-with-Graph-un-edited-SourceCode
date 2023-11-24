class Test {
    public class Example {
    private static boolean isAdHost(String host){
      if (TextUtils.isEmpty(host)) {
        return false;
      }
      int index=host.indexOf(".");
      return index >= 0 && (AD_HOSTS.contains(host) || index + 1 < host.length() && isAdHost(host.substring(index + 1)));
    }
        @DSGenerator(tool_name="Doppelganger",tool_version="2.0",generated_on="2013-12-30 12:35:17.156 -0500",hash_original_method="BA9D4031BD488C1D379B1950A362F8D4",hash_generated_method="4894634EDDCA3FC9A62B97AC03EE312F") @DSSafe(DSCat.ANDROID_CALLBACK) @DSVerified public boolean dispatchKeyShortcutEvent(KeyEvent event){
      if (mWindow.superDispatchKeyShortcutEvent(event)) {
        return true;
      }
      return onKeyShortcut(event.getKeyCode(),event);
    }
        public static final KeyPair createKeyPair(AlgorithmParameterSpec spec) throws GeneralSecurityException {
    		KeyPairGenerator keyGen = KeyPairGenerator.getInstance(ALGORITHM);
    	    keyGen.initialize(spec, new SecureRandom());
    		return keyGen.generateKeyPair();
    	}
    }
}