class Test {
    public class Example {
    public void setReceiveBufferSize(int size) throws IOException {
            Assert.isTrue(size > 0);
            if (size != getReceiveBufferSize()) {
                receiveBufferSize = size;
                if (connected) {
                    socket.setReceiveBufferSize(receiveBufferSize);
                }
            }
        }
        public <M extends Configuration>void deregisterAddListener(InstantiableRelationDefinition<?,M> d,ConfigurationAddListener<M> listener){
      validateRelationDefinition(d);
      DN baseDN=DNBuilder.create(path,d);
      deregisterAddListener(baseDN,listener);
    }
        public HttpClientConnection getHttpClientConnection(IHttpRequestHeader header) throws IOException, SocketTimeoutException {
            URL url = header.getRequestUrl();
            String host = url.getHost();
            int port = url.getPort();
            boolean isSSL = url.getProtocol().equalsIgnoreCase("HTTPS");
            
            return newHttpClientConnection(pool.getNonBlockingConnection(host, normalizePort(port, isSSL), IHttpConnection.DEFAULT_CONNECT_TIMEOUT_MILLIS, isSSL));
        }
    }
}