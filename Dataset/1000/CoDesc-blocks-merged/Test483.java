class Test {
    public class Example {
    public void run() {
            try {
                method.invoke(service, new Object[0]);
            }
            catch(InvocationTargetException itex) {
                Throwable t = itex.getTargetException();
                String message = "InvocationTargetException ('"+ t +"') while calling method '" + method + "' of service '" + service + "'";
                log.debug(message, t);
                if (t instanceof RuntimeException){
                    throw (RuntimeException) t;
                }
                else if (t instanceof Error){
                    throw (Error) t;
                }
                else{
                    throw new RuntimeException(message);
                }
            }
            catch(Exception ex) {
                String message = "Exception '" + ex + "' while calling method '" + method + "' of service '" + service + "'";
                log.debug(message, ex);
                throw new RuntimeException(message);
            }
        }
        public Class getParameterType() {
            if (parameterType == null && paramDescComposite != null) {
                parameterType = paramDescComposite.getParameterTypeClass();
            }
            return parameterType;
        }
        private void initActionsInterceptors() throws Exception {
    		try {
    			new LoadAdviserFromXml().load(this.getServletContext()
    					.getResourceAsStream(getConfigFile ()));
    		} catch (Exception exc) {
    			LOGGER.error("Loading ActionsInterceptor, cause: {}.", exc.getMessage(), exc);
    			throw exc;
    		}
    	}
    }
}