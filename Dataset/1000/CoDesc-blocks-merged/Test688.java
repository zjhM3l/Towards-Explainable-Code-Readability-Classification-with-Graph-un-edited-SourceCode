class Test {
    public class Example {
    public Mapper createMapper() throws BuildException {
            if (mapperElement != null) {
                throw new BuildException(ERROR_MULTIPLE_MAPPERS,
                                         getLocation());
            }
            mapperElement = new Mapper(getProject());
            return mapperElement;
        }
        public void deregisterStoppableAsynchConsumerCallback()
       throws SISessionUnavailableException,
              SISessionDroppedException,
              SIConnectionUnavailableException,
              SIConnectionDroppedException,
              SIIncorrectCallException
       {
          if (TraceComponent.isAnyTracingEnabled() && tc.isEntryEnabled()) SibTr.entry(this, tc, "deregisterStoppableAsynchConsumerCallback");
    
          // Check FAP level is suitable for this API call
          final HandshakeProperties props = getConversation().getHandshakeProperties();
          CommsUtils.checkFapLevel(props, JFapChannelConstants.FAP_VERSION_9);
    
          // Pass the call on down the stack...
          _deregisterAsynchConsumerCallback(true);
    
          if (TraceComponent.isAnyTracingEnabled() && tc.isEntryEnabled()) SibTr.exit(this, tc, "deregisterStoppableAsynchConsumerCallback");
       }
        public static void onChannelOpen ( Channel self , Channel channel ) {
      Log . i ( TAG , "Channel opened" ) ;
      self . setChannel ( channel ) ;
      self . addOnChannelCloseListener ( ) ;
      self . setupExchange ( EXCHANGE ) ;
    }
    }
}