class Test {
    public class Example {
    private void checkLocaleForInfix(NlsResourceLocator resourceLocator, String localeInfix, Locale expectedLocale) {
    
        Locale locale = resourceLocator.getLocaleForInfix(localeInfix);
        Assert.assertEquals("language", expectedLocale.getLanguage(), locale.getLanguage());
        Assert.assertEquals("country", expectedLocale.getCountry(), locale.getCountry());
        Assert.assertEquals("variant", expectedLocale.getVariant(), locale.getVariant());
      }
        public void pop() throws EmptyStackException {
    		if (currIndex <= 0) {
    			throw new EmptyStackException();
    		}
    		currIndex--;
    	}
        public void genCode(GenerationContext context, boolean discardValue) {
        CodeSequence code = context.getCodeSequence();
    
        setLineNumber(code);
    
        if (init == null) {
          allocArray(context, type, dims);
          if (discardValue) {
    	code.plantPopInstruction(type);
          }
        } else {
          init.genCode(context, discardValue);
        }
      }
    }
}