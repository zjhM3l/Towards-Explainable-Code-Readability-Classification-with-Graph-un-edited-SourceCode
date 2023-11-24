class Test {
    public class Example {
    public void logPurchase(BigDecimal purchaseAmount, Currency currency, Bundle parameters) {
    
            if (purchaseAmount == null) {
                notifyDeveloperError("purchaseAmount cannot be null");
                return;
            } else if (currency == null) {
                notifyDeveloperError("currency cannot be null");
                return;
            }
    
            if (parameters == null) {
                parameters = new Bundle();
            }
            parameters.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, currency.getCurrencyCode());
    
            logEvent(AppEventsConstants.EVENT_NAME_PURCHASED, purchaseAmount.doubleValue(), parameters);
            eagerFlush();
        }
        public int indexOf(char ch, int start) {
            if (ch > MAX_CHAR_VALUE) {
                return INDEX_NOT_FOUND;
            }
    
            if (start < 0) {
                start = 0;
            }
    
            final byte chAsByte = c2b0(ch);
            final int len = offset + length;
            for (int i = start + offset; i < len; ++i) {
                if (value[i] == chAsByte) {
                    return i - offset;
                }
            }
            return INDEX_NOT_FOUND;
        }
        private int importTables(Referenceable databaseReferenceable, String databaseName, final boolean failOnError) throws Exception {
            int tablesImported = 0;
            List<String> hiveTables = hiveClient.getAllTables(databaseName);
            LOG.info("Importing tables {} for db {}", hiveTables.toString(), databaseName);
            for (String tableName : hiveTables) {
                int imported = importTable(databaseReferenceable, databaseName, tableName, failOnError);
                tablesImported += imported;
            }
    
            if (tablesImported == hiveTables.size()) {
                LOG.info("Successfully imported all {} tables from {} ", tablesImported, databaseName);
            } else {
                LOG.error("Able to import {} tables out of {} tables from {}. Please check logs for import errors", tablesImported, hiveTables.size(), databaseName);
            }
    
            return tablesImported;
        }
    }
}