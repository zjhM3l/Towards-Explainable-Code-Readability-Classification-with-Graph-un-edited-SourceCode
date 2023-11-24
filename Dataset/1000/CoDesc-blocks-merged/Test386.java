class Test {
    public class Example {
    public static void dump ( @ NotNull final PsiElement element , final boolean annotateFields , final boolean includeAttributes , final int indent ) {
      final StringBuilder builder = new StringBuilder ( ) ;
      if ( element instanceof PsiDocTag ) {
        final PsiDocTag tag = ( PsiDocTag ) element ;
        if ( annotateFields && tag . getEnumeratedName ( ) != null ) {
          builder . append ( tag . getEnumeratedName ( ) ) ;
        }
        builder . append ( "\n" ) ;
      }
      else if ( element instanceof PsiDocTagValue ) {
        builder . append ( "\n" ) ;
      }
      if ( annotateFields && element . getTextRange ( ) != null ) {
        builder . append ( "\n" ) ;
      }
      builder . append ( element . getText ( ) ) ;
    }
        public ElementSet Thrower() {
    
    		return org.openarchitectureware.core.meta.util.MMUtil
    				.filterByView(throwerSet);
    	}
        public static Field getField ( FieldImpl self , Page page , Language language , String initial ) {
      if ( self . parsed ) {
        String helpText = Messages . get ( ) . key ( Messages . GUI_NOTE_FIELD_IS_EXPRESSION_evaluated ) ;
        if ( helpText != null ) {
          return self . field ( ) ;
        }
      }
      Widget widget = getWidget ( page , language ) ;
      return self . field ( ) . widget ( widget , initial , helpText , false ) ;
    }
    }
}