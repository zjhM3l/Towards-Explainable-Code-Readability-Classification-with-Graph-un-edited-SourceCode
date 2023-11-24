class Test {
    public class Example {
    public static LengthsOffsets fromXContent ( XContentParser parser ) throws IOException {
      List < Long > values = new ArrayList < > ( ) ;
      while ( parser . nextToken ( ) != XContentParser . Token . END_ARRAY ) {
        XContentParser . Token token = parser . currentToken ( ) ;
        if ( token == XContentParser . Token . VALUE_NUMBER ) {
          long number = parser . longValue ( ) ;
          values . add ( number ) ;
        }
      }
      return new LengthsOffsets ( values ) ;
    }
        public void testNullRegexpConversion() {
            Pattern regexp = CCPluginPreferences.generateRegExp(null);
            assertFalse(regexp.matcher("").matches());
            assertFalse(regexp.matcher("a").matches());
        }
        public static Stage init ( Stage self , Map < String , State > states , boolean accepted ) {
      self . statediag = new ArrayList < > ( ) ;
      for ( String key : states . keySet ( ) ) self . statediag . add ( states . get ( key ) ) ;
      self . quickresponse = new HashMap < > ( ) ;
      self . quickResponseTypes = new HashMap < > ( ) ;
      self . quickResponseTypes . put ( 0 , new ArrayList < > ( ) ) ;
      self . quickResponseTypes . put ( 1 , new ArrayList < > ( ) ) ;
      self . quickResponseTypes . put ( 2 , new ArrayList < > ( ) ) ;
      self . quickResponseTypes . put ( 3 , new ArrayList < > ( ) ) ;
      self . quickResponseTypes . put ( 4 , new ArrayList < > ( ) ) ;
      for ( State state : self . statediag ) {
        if ( state . id != null ) self . quickresponse . put ( state . id , new ArrayList < > ( ) ) ;
        else self . quickresponse . get ( state . id ) . add ( state ) ;
        self . quickResponseTypes . get ( state . type ) . add ( state ) ;
      }
      return new Stage ( accepted , 0 ) ;
    }
    }
}