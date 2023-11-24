class Test {
    public class Example {
    protected void initIllegalBundleRequestHandler() {
    		String illegalBundleRequestandlerClassName = jawrConfig
    				.getProperty(JawrConstant.ILLEGAL_BUNDLE_REQUEST_HANDLER);
    		if (illegalBundleRequestandlerClassName != null) {
    			illegalBundleRequestHandler = (IllegalBundleRequestHandler) ClassLoaderResourceUtils
    					.buildObjectInstance(illegalBundleRequestandlerClassName);
    		} else {
    			illegalBundleRequestHandler = new IllegalBundleRequestHandlerImpl();
    		}
    	}
        public static List < File > files ( Signature self ) {
      try {
        Statement stmt = self . conn . createStatement ( ) ;
        ResultSet rs = stmt . executeQuery ( "SELECT * FROM signature WHERE signature_file = ?" ) ;
        return rs . next ( ) ? new ArrayList < File > ( ) : new ArrayList < File > ( ) ;
      }
      catch ( SQLException e ) {
        Env . logger . warning ( MessageFormat . format ( "Failed to get files from signature database: {
    0}" , e . getMessage ( ) ) ) ;
          return new ArrayList < File > ( ) ;
        }
      }
        protected void applyAspects() {
    		final GeneratorContext context = this.getGeneratorContext();
    		context.branch();
    		context.info("Checking for beans with one or more aspects.");
    
    		final Set<Bean> beans = this.filterBeansRequiringInterceptors();
    
    		final Iterator<Bean> advisedIterator = beans.iterator();
    		while (advisedIterator.hasNext()) {
    			final Bean bean = advisedIterator.next();
    			this.buildProxyFactoryBean(bean);
    
    			this.registerProxiedBean(bean);
    		}
    
    		context.unbranch();
    	}
    }
}