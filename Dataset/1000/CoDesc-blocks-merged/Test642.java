class Test {
    public class Example {
    protected UserTransaction getUserTransaction(boolean injection, Object injectionContext) throws NamingException
        {
            final UserTransaction ut = AccessController.doPrivileged(new PrivilegedAction<UserTransaction>() {
                @Override
                public UserTransaction run() {
                    return userTranSvcRef.getBundle().getBundleContext().getService(userTranSvcRef);
                }
            });
            final UserTransactionDecorator utd = getUserTransactionDecorator();
            if (utd == null) {
                return ut;
            } else {
                return utd.decorateUserTransaction(ut, injection, injectionContext);
            }
        }
        @Beta
        public static <K, V> Map<K, V> fromDictionary(Dictionary<K, V> dictionary) {
            checkArgument(dictionary != null, "Expected non-null dictionary");
    
            ImmutableMap.Builder<K, V> builder = ImmutableMap.builder();
    
            for (Enumeration<K> keys = dictionary.keys(); keys.hasMoreElements(); ) {
                K key = keys.nextElement();
                V value = dictionary.get(key);
                builder.put(key, value);
            }
    
            return builder.build();
        }
        public void setDataFromXML( XmlDataAdaptor rawDataPanelData ) {
            XmlDataAdaptor filterRawDataPanelData = (XmlDataAdaptor) rawDataPanelData.childAdaptor( getNameXMLData() );
            XmlDataAdaptor params = (XmlDataAdaptor) filterRawDataPanelData.childAdaptor( "PARAMS" );
    
            avg_Button.setSelected( params.booleanValue( "useAvg" ) );
            nAvg_Spinner.setValue( new Integer( params.intValue( "nAvg" ) ) );
            par_0_Text.setValue( params.doubleValue( "filterLevel" ) );
        }
    }
}