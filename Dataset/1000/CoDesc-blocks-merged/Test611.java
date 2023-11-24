class Test {
    public class Example {
    @Override
        public ConnectMessage createCON(int cic) {
            ConnectMessage msg = createCON();
            CircuitIdentificationCode code = this.parameterFactory.createCircuitIdentificationCode();
            code.setCIC(cic);
            msg.setCircuitIdentificationCode(code);
            return msg;
        }
        private static void initialize ( RpcRequest self , RpcRequest request ) {
      request . node . mergeFrom ( self . _node ) ;
      request . resource . mergeFrom ( self . _resource ) ;
      self . _initialRequest = request ;
      self . _rpc . open ( ) ;
      isInitialized = true ;
    }
        public boolean equals(Object other){
      if (!this.getClass().equals(other.getClass()))   return false;
     else {
        TLSMessageChannel that=(TLSMessageChannel)other;
        if (this.mySock != that.mySock)     return false;
     else     return true;
      }
    }
    }
}