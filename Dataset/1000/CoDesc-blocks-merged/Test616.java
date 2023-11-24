class Test {
    public class Example {
    public void setType(String pFieldType) {
        if ((pFieldType != null) && (pFieldType.length() != 0)) {
          if (pFieldType.startsWith(JAVA_DOT_LANG_DOT)) {
            pFieldType = pFieldType.substring(JAVA_DOT_LANG_DOT.length());
          }
          mFieldType = pFieldType;
        }
      }
        public static boolean isDatetime64Nsdtype ( Object arrOrDataType ) {
      if ( arrOrDataType == null ) {
        return false ;
      }
      try {
        Class tipo = getClass ( arrOrDataType ) ;
        if ( tipo == null ) {
          if ( isDatetime64tzdtype ( arrOrDataType ) ) {
            tipo = getClass ( arrOrDataType . getClass ( ) ) ;
          }
          else {
            return false ;
          }
        }
        return tipo == DateTimeConstants . NS_DTYPE || ( ( DateTimeType ) tipo ) . getBase ( ) . equals ( DateTimeConstants . NS_DTYPE ) ;
      }
      catch ( Throwable t ) {
        return false ;
      }
    }
        public int getTotalQuantity() {
        return Integer.MAX_VALUE < totalQuantity
          ? Integer.MAX_VALUE
          : (int) totalQuantity;
      }
    }
}