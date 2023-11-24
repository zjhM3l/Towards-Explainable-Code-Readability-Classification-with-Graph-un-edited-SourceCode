class Test {
    public class Example {
    public String getRemoteHost() {
            if (WCCustomProperties.CHECK_REQUEST_OBJECT_IN_USE){
                checkRequestObjectInUse();
            }
            // 321485
            String host = null;
            if (this._request != null) {
                host = this._request.getRemoteHost();
            }
            if (TraceComponent.isAnyTracingEnabled()&&logger.isLoggable (Level.FINE)) {  //306998.15
                logger.logp(Level.FINE, CLASS_NAME,"getRemoteHost", "this->"+this+": "+" host --> " + host);
            }
            return host;
        }
        public void setUpEmail() {
            this.emailResult = null;
    
            final EmailTransportService ets = new EmailTransportService() {
                public Future<Email> sendEmail(Email email) {
                    emailResult = email;
                    return new FutureTask<Email>(new Callable<Email>() {
                        public Email call() throws Exception {
                            return emailResult;
                        }
                    });
                }
            };
    
            modules.add(new AbstractModule() {
                protected void configure() {
                    bind(EmailTransportService.class).toInstance(ets);
                }
            });
        }
        public void wireRandomly(int edges) {
            Random random = new Random();
            Node[] theNodes = (Node[]) nodes.toArray(new Node[0]);
            Node n1, n2;
            for (int j = 0; j < edges; j++) {
                int i1 = random.nextInt() % nodes.size();
                int i2 = random.nextInt() % nodes.size();
                while ((i1 < 0 || i2 < 0) || theNodes[i1].hasNeighbor(theNodes[i2])) {
                    i1 = random.nextInt() % nodes.size();
                    i2 = random.nextInt() % nodes.size();
                }
                theNodes[i1].connectUndirected(theNodes[i2]);
            }
        }
    }
}