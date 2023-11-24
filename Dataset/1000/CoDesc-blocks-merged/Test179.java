class Test {
    public class Example {
    public DateTimeFormatter withResolverStyle(ResolverStyle resolverStyle) {
            Jdk8Methods.requireNonNull(resolverStyle, "resolverStyle");
            if (Jdk8Methods.equals(this.resolverStyle, resolverStyle)) {
                return this;
            }
            return new DateTimeFormatter(printerParser, locale, decimalStyle, resolverStyle, resolverFields, chrono, zone);
        }
        public void setChid(String value) {
            if (value.length() > 10) {
                value = value.substring(0, 10);
            }
            setField("UOCHID", value);
        }
        public void stopService() throws Exception {
            try {
                log.debug("Stop the BulkServiceImpl");
                if (srvSms != null) {
                    srvSms.stopService();
                }
                //Removed, now the Service is Injected
                //srvSms = null;
            } catch (Exception exc) {
                log.error("Exception when try to stop the Service", exc);
                throw new Exception(exc);
            }
    
        }
    }
}