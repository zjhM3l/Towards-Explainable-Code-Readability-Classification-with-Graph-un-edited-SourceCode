class Test {
    public class Example {
    public void process(InputStream source) {
    		DataInputStream dis = new DataInputStream(source);
    		try {
    			while (true)
    			{
    				long packetId;
    				packetId = dis.readLong();
    				
    				IPacketHandler handler = getHandlerMap().get(packetId);
    				
    				if (handler != null) {
    					logger.debug(getHandlerIdentifier() +  "Activating handler: ");
    					logger.debug(handler.getClass());
    					handler.processPacket(dis);
    					m_responseQueue.processQueue(); // If there are any responses.
    				} else {
    					logger.error("Invalid incoming packet");
    				}
    			}
    		}
    		catch(java.io.IOException readException)
    		{
    			logger.error(readException);
    		}
    	}
        protected void startup() throws ComponentException {
        assert isInitialized();
        state = States.STARTING_UP;
        for (Component component : components.values()) {
          component.startup();
        }
    
        state = States.RUNNING;
        assert isRunning();
      }
        protected ByteBuffer getByteBuffer() {
    	try {
    	    return (ByteBuffer)byteBufferPool.removeLast();
    	} catch(NoSuchElementException e) {
    	    return ByteBuffer.allocate(blocksize);
    	}
        }
    }
}