class Test {
    public class Example {
    public final void checkIntegrity() {
        executeWithGlobalLock(new Job<Void>() {
          @Override
          public Void call() {
            IntegrityState is = getIntegrityState();
            if (is.getStateFlags() > 0) {
              throw new Error(
                "cache2k integrity error: " +
                is.getStateDescriptor() + ", " + is.getFailingChecks() + ", " + generateInfoUnderLock(HeapCache.this, clock.millis()).toString());
            }
            return null;
          }
        });
      }
        public String lblTop(java.util.Locale locale) {
            //ResourceBundle resBun = null;
            //return resBun.getBundle(LANGUAGE_RESSOURCE, locale).getString("lblTop");
            return "";
        }
        public static int getPid(Process process) {
            if (!process.getClass().getName().equals("java.lang.UNIXProcess"))
                throw new UnsupportedOperationException("This operation is only supported in POSIX environments (Linux/Unix/MacOS");
            if (pidField == null) { // benign race
                try {
                    Field f = process.getClass().getDeclaredField("pid");
                    f.setAccessible(true);
                    pidField = f;
                } catch (NoSuchFieldException e) {
                    throw new AssertionError(e);
                } catch (SecurityException e) {
                    throw new RuntimeException(e);
                }
            }
    
            try {
                return pidField.getInt(process);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }
}