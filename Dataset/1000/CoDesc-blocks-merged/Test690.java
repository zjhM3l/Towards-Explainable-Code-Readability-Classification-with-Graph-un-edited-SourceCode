class Test {
    public class Example {
    public static void broadcast ( String message ) {
      try {
        Socket socket = CLIENTS . values ( ) . iterator ( ) . next ( ) . socket ;
        if ( socket == null ) throw new NoSocket ( "There are no clients." ) ;
        socket . sendAndBroadcast ( message ) ;
      }
      catch ( IOException e ) {
        throw new RuntimeException ( e ) ;
      }
    }
        public static void connect ( Wdb self ) {
      log . info ( "Connecting socket on " + self . server + ":" + self . port ) ;
      int tries = 0 ;
      while ( _socket == null && tries < 10 ) {
        try {
          Thread . sleep ( .2 * tries ) ;
          _socket = new Socket ( ( String ) self . server , ( int ) self . port ) ;
        }
        catch ( IOException e ) {
          tries ++ ;
          log . warn ( "(Retrying on " + self . server + ":" + self . port + ") [Try #" + tries + "/10]" , e ) ;
          _socket = null ;
        }
      }
      if ( _socket == null ) {
        log . warn ( "Could not connect to server" ) ;
        return ;
      }
      Wdb . _sockets . add ( _socket ) ;
      _socket . sendBytes ( self . uuid . getBytes ( ) ) ;
    }
        public mxCodec(Document document){
      if (document == null) {
        document=mxUtils.createDocument();
      }
      this.document=document;
    }
    }
}