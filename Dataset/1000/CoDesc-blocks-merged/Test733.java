class Test {
    public class Example {
    public void writeStream(InputStream source,int totalLength) throws IOException {
      if (source == null)   return;
      int length=_writeBuffer.length;
      if (length <= _writeLength) {
        int tmplen=_writeLength;
        _writeLength=0;
        _source.write(_writeBuffer,0,tmplen,false);
        _position+=tmplen;
        _isFlushRequired=true;
      }
      while (totalLength > 0) {
        int sublen=Math.min(totalLength,length - _writeLength);
        sublen=source.read(_writeBuffer,_writeLength,sublen);
        if (sublen < 0)     break;
        _writeLength+=sublen;
        totalLength-=sublen;
        if (length <= _writeLength) {
          int tmplen=_writeLength;
          _writeLength=0;
          _source.write(_writeBuffer,0,tmplen,false);
          _position+=tmplen;
          _isFlushRequired=true;
        }
      }
      if (_isFlushOnNewline || _implicitFlush) {
        flush();
      }
    }
        public void addExceptionConfig(ExceptionConfig config) {
            throwIfConfigured();
    
            String key = config.getType();
    
            if (exceptions.containsKey(key)) {
                log.warn("Overriding ExceptionConfig of type " + key);
            }
    
            exceptions.put(key, config);
        }
        protected void fireDataReceived(byte[] data, int offset, int length) {
    		Object[] listeners = listenersList.getListenerList();
    		
    		for (int i = listeners.length - 2; i >= 0; i -= 2)
    			if (listeners[i] == DataListener.class)
    				((DataListener) listeners[i + 1]).dataReceived(
    						new DataEvent(this, data, offset, length));
    	}
    }
}