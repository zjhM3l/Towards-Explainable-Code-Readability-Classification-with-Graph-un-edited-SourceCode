class Test {
    public class Example {
    public void setMaxFieldSize(int max) throws SQLException {
    
            checkClosed();
    
            if (max < 0) {
                throw jdbcUtil.sqlException(Trace.INVALID_JDBC_ARGUMENT);
            }
        }
        public ViewPlatform getTriggeringViewPlatform() {
    	if (behav == null) {
    	    throw new IllegalStateException(Ding3dI18N.getString("WakeupOnViewPlatformExit0"));
    	}
    
    	synchronized (behav) {
    	    if (!behav.inCallback) {
    		throw new IllegalStateException(Ding3dI18N.getString("WakeupOnViewPlatformExit0"));
    	    }
    	}
    
    	return (triggeredVP != null) ? (ViewPlatform)triggeredVP.source : null;
        }
        private <T extends AccessControlHandlerCfg>AccessControlHandler<T> loadHandler(String className,T configuration,boolean initialize) throws InitializationException {
      try {
        AccessControlHandlerCfgDefn definition=AccessControlHandlerCfgDefn.getInstance();
        ClassPropertyDefinition propertyDefinition=definition.getJavaClassPropertyDefinition();
        Class<? extends AccessControlHandler> providerClass=propertyDefinition.loadClass(className,AccessControlHandler.class);
        AccessControlHandler<T> provider=providerClass.newInstance();
        if (configuration != null) {
          if (initialize) {
            provider.initializeAccessControlHandler(configuration);
          }
        }
     else {
          List<LocalizableMessage> unacceptableReasons=new ArrayList<>();
          if (!provider.isConfigurationAcceptable(configuration,unacceptableReasons)) {
            String reasons=Utils.joinAsString(".  ",unacceptableReasons);
            throw new InitializationException(ERR_CONFIG_AUTHZ_CONFIG_NOT_ACCEPTABLE.get(null,reasons));
          }
        }
        return provider;
      }
     catch (  Exception e) {
        LocalizableMessage message=ERR_CONFIG_AUTHZ_UNABLE_TO_INSTANTIATE_HANDLER.get(className,configuration.dn(),stackTraceToSingleLineString(e));
        throw new InitializationException(message,e);
      }
    }
    }
}