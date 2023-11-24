class Test {
    public class Example {
    public static Dictionary getDictionary ( String dictName ) {
      synchronized ( dictionariesCache ) {
        if ( dictName != null ) {
          try {
            BufferedReader dictionaryReader = new BufferedReader ( new InputStreamReader ( new FileInputStream ( join ( DICTIONARIES_PATH , dictName ) ) ) ) ;
            try {
              dictionariesCache . put ( dictName , dictionaryReader . readLine ( ) ) ;
              dictionaryReader . close ( ) ;
            }
            finally {
              dictionaryReader . close ( ) ;
            }
          }
          catch ( IOException e ) {
            e . printStackTrace ( ) ;
          }
        }
      }
      return dictionariesCache . get ( dictName ) ;
    }
        private BigDecimal checkDebit(BigDecimal d, CreditDebitCode code) {
            if (d == null || code == null || code == CreditDebitCode.CRDT)
                return d;
    
            return BigDecimal.ZERO.subtract(d);
        }
        private void writeFontBBox(final StringBuilder buffer) {
            /* Only applies to Type3 fonts. Gets written in the font descriptor
             * for other font types. */
            if (this.fontSubType != PDFFont.SubType.TYPE3) {
                return;
            }
            final PDFRectangle fontBBox = new PDFRectangle(this.fsFont.getFontBoundingBox());
            if (fontBBox != null) {
                buffer.append("/FontBBox ");
                buffer.append(fontBBox.toPDF());
                buffer.append(EOL);
            }
        }
    }
}