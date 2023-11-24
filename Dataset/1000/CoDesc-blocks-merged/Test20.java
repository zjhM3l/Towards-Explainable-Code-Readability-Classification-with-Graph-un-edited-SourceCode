class Test {
    public class Example {
    public void append (ListElement l)
    	{	if (Last==null) init(l);
    		else
    		{	Last.next(l); l.previous(Last); Last=l;
    			l.next(null); l.list(this);
    		}
    	}
        private static void process ( Token self , String name ) {
      if ( self . token . nature . equals ( name ) ) {
        self . token = self . lexer . nextToken ( ) ;
      }
      else {
        error ( ) ;
      }
    }
        public void setTime(int index, java.sql.Time x) {
            try {
                prep.setTime(index, x);
            }
            catch (SQLException e) {
                close(false);
                throw new DatabaseException(
                    e,
                    datasourceName);
            }
        }
    }
}