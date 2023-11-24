class Test {
    public class Example {
    public java.util.List<String> getGrantTokens() {
            if (grantTokens == null) {
                grantTokens = new com.amazonaws.internal.SdkInternalList<String>();
            }
            return grantTokens;
        }
        public void testCreateEngine() throws Exception {
            log.info("RUN: "+getName());
            try {
                IFormPrintEngine engine = FormPrintFactory.newInstance(FormPrintFactory.ENGINE_TYPE_PDFLIB);
                // Assume it worked if there were no errors...as we don't know what file it wrote
                assertNotNull("No Engine Instance was returned",engine);
                
            } catch (Exception e) {
                log.error("Test Failed - " + e.getLocalizedMessage(), e);
                throw e;
            }
        }
        public int findIn(Source source) {
            boolean flag = false;
            int offset;
            for (offset = source.getOffset(); !flag && offset < source.getLength() - valueLength; offset++) {
                String str = source.subString(offset, offset + valueLength);
                flag = str.equalsIgnoreCase(value);
            }
            if (flag) {
                return offset;
            } else {
                return -1;
            }
        }
    }
}