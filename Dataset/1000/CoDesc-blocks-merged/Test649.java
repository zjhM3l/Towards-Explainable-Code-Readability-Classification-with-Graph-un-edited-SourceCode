class Test {
    public class Example {
    public void setStallTimeout(long newvalue) {
            if ((-1 != newvalue) && (newvalue <= 0)) {
                throw new IllegalArgumentException("Stall timeout must be > 0");
            }
    
            stallTimeout = newvalue;
        }
        private int getColCount() throws Exception {
    		/* ================================================== */
    		return dayCount * getSelectedCalendars().size();
    		/* ================================================== */
    	}
        public void testNoManifestJar() throws Exception {
        MockCachedUrl noManifestCu =
          new MockCachedUrl("http://foo.com/nomanifest.jar", noManifestJar, true);
        JarValidator validator =
          new JarValidator(m_pubKeystore, getTempDir());
        File f = null;
        try {
          f = validator.getBlessedJar(noManifestCu);
        } catch (JarValidator.JarValidationException ignore) {
          //expected
        }
        assertNull(f);
      }
    }
}