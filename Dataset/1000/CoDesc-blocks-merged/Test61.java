class Test {
    public class Example {
    @Override
        protected void logImpl(LogLevel level,Object[] message,Throwable throwable)
        {
            //format log message (without exception)
            String text=this.formatLogMessage(level,message,null);
    
            //get log level
            int levelValue=level.getValue();
            switch(levelValue)
            {
                case LogLevel.DEBUG_LOG_LEVEL_VALUE:
                    this.APACHE_LOGGER.debug(text);
                    break;
                case LogLevel.ERROR_LOG_LEVEL_VALUE:
                    this.APACHE_LOGGER.error(text,throwable);
                    break;
                case LogLevel.INFO_LOG_LEVEL_VALUE:
                default:
                    this.APACHE_LOGGER.info(text);
                    break;
            }
        }
        public void checkImports( final Buffer buffer ) {
            myErrorSource.clear();
            final String filename = buffer.getPath();
            if ( !filename.endsWith( ".java" ) ) {
                return ;     // not a java file, don't check
            }
    
            JavaParser parser = new JavaParser();
            CUNode cu = parser.parse( buffer );
            cu.setFilename(buffer.getPath());
            checkImports(cu);
        }
        public int hashCode() {
    		int result;
    		result = (fieldName != null ? fieldName.hashCode() : 0);
    		result = 29 * result + (order != null ? order.hashCode() : 0);
    		return result;
    	}
    }
}