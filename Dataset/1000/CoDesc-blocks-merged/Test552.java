class Test {
    public class Example {
    public static String [ ] getFilePaths ( Table self , int [ ] id_list ) {
      if ( id_list == null ) return new String [ 0 ] ;
      try {
        String [ ] path_array = self . _table [ id_list [ 0 ] ] . path ;
        if ( id_list . length == 0 ) {
          System . out . println ( "IndexOutOfBoundsException " + self . _table . length + " " + id_list ) ;
          path_array = new String [ 0 ] ;
        }
        return path_array ;
      }
      catch ( ArrayIndexOutOfBoundsException e ) {
        System . out . println ( "ArrayIndexOutOfBoundsException " + self . _table . length + " " + id_list ) ;
        path_array = new String [ 0 ] ;
      }
      return new String [ 0 ] ;
    }
        public void evictAll(){
      List<Connection> connections;
    synchronized (this) {
        connections=new ArrayList<Connection>(this.connections);
        this.connections.clear();
      }
      for (  Connection connection : connections) {
        Util.closeQuietly(connection);
      }
    }
        protected void printElementOn(int index, PrintWriter oo) {
    		Heaper value = fetchValue(index);
    		if (value != null) {
    			value.printOn(oo);
    		} else {
    			oo.print("null");
    		}
    	}
    }
}