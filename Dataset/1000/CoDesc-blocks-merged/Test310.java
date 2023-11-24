class Test {
    public class Example {
    protected void releaseSetting(Object v, final IExpression expression, final boolean remove) {
    		if (v instanceof IJavaInstance) {
    			// Get existing adapter, if it doesn't have one, don't create it.
    			final IInternalBeanProxyHost value = (IInternalBeanProxyHost) EcoreUtil.getExistingAdapter((Notifier) v, IBeanProxyHost.BEAN_PROXY_TYPE);
    			if (value != null) {
    				SafeRunner.run(new ISafeRunnable() {
    
    					public void handleException(Throwable exception) {
    						JavaVEPlugin.getPlugin().getLogger().log(exception, Level.WARNING);
    					}
    
    					public void run() throws Exception {
    						value.releaseBeanProxy(expression);
    						if (remove)
    							value.getTarget().eAdapters().remove(value);
    					}
    				});
    			}
    		}
    	}
        public List<GeoPackageMetadata> getAllExternal() {
            List<GeoPackageMetadata> allMetadata = new ArrayList<GeoPackageMetadata>();
    
            String selection = GeoPackageMetadata.COLUMN_EXTERNAL_PATH + " IS NOT NULL";
            Cursor cursor = db.query(
                    GeoPackageMetadata.TABLE_NAME,
                    GeoPackageMetadata.COLUMNS, selection, null, null, null, null);
    
            try {
                while (cursor.moveToNext()) {
                    GeoPackageMetadata metadata = createGeoPackageMetadata(cursor);
                    allMetadata.add(metadata);
                }
            } finally {
                cursor.close();
            }
            return allMetadata;
        }
        public Rental create() {
            Rental Rental = new Rental(GUID.generate());
            Cache c = Cache.getInstance();
            c.put(Rental.getId(), Rental);
            return Rental;
        }
    }
}