class Test {
    public class Example {
    private void logStart(ActionMapping mapping, HttpServletRequest request) {
            LOG.trace(new StringBuffer(128).append("Requested Path [")
                    .append(mapping.getPath()).append("] - Start [")
                    .append(mapping.getType()).append("]"));
        }
        public static void notify ( String msg , int msgType , Throwable t ) {
      if ( Platform . isMac ( ) ) {
        String command = notifyCommandMac ( msg , msgType , t ) ;
        if ( command != null ) {
          Runtime . getRuntime ( ) . exec ( command . getBytes ( ) ) ;
        }
      }
    }
        public static BitcoinClient bitcoinClient ( String configPath , String bitcoinConf ) throws IOException {
      if ( bitcoinConf == null && configPath == null ) {
        throw new IllegalArgumentException ( "Need bitcoinConf or config path" ) ;
      }
      bitcoinConf = getBitcoinConf ( configFile ( configPath ) ) ;
      log . debug ( "Connect to bitcoind at " + bitcoinConf . get ( "bitcoind.server.address" ) + ":" + bitcoinConf . get ( "bitcoind.server.port" ) + " (" + configPath + ")" ) ;
      BitcoinClient client = connectBitcoinImpl ( bitcoinConf ) ;
      return client ;
    }
    }
}