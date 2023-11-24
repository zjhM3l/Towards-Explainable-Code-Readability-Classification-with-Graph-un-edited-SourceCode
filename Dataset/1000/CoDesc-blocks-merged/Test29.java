class Test {
    public class Example {
    public DecoratorManager getDecoratorManager() {
            if (this.decoratorManager == null) {
                this.decoratorManager = new DecoratorManager();
            }
            return decoratorManager;
        }
        public static void tryMkdir ( String directory ) throws IOException {
      try {
        Files . createDirectories ( directory ) ;
      }
      catch ( IOException err ) {
        if ( err . getMessage ( ) != null ) {
          throw err ;
        }
      }
    }
        public void recordParsingException(CqlTranslatorException e) {
            addException(e);
            if (shouldReport(e.getSeverity())) {
                CqlToElmError err = af.createCqlToElmError();
                err.setMessage(e.getMessage());
                err.setErrorType(e instanceof CqlSyntaxException ? ErrorType.SYNTAX : (e instanceof CqlSemanticException ? ErrorType.SEMANTIC : ErrorType.INTERNAL));
                err.setErrorSeverity(toErrorSeverity(e.getSeverity()));
                if (e.getLocator() != null) {
                    err.setStartLine(e.getLocator().getStartLine());
                    err.setEndLine(e.getLocator().getEndLine());
                    err.setStartChar(e.getLocator().getStartChar());
                    err.setEndChar(e.getLocator().getEndChar());
                }
    
                if (e.getCause() != null && e.getCause() instanceof CqlTranslatorIncludeException) {
                    CqlTranslatorIncludeException incEx = (CqlTranslatorIncludeException) e.getCause();
                    err.setTargetIncludeLibraryId(incEx.getLibraryId());
                    err.setTargetIncludeLibraryVersionId(incEx.getVersionId());
                    err.setErrorType(ErrorType.INCLUDE);
                }
                library.getAnnotation().add(err);
            }
        }
    }
}