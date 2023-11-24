class Test {
    public class Example {
    public void kill() throws AIException {
    		Board board = Board.getInstance();
    		
    		log.debug("Player.kill: set robot state of life to dead");
    		board.getField(pos).setCurrentPlayer(null);
    		dead = true;
    	}
        public void addConnection(ServerSentEventConnection connection) {
            Objects.requireNonNull(connection, Required.CONNECTION.toString());
    
            final String url = RequestUtils.getServerSentEventURL(connection);
            Set<ServerSentEventConnection> uriConnections = getConnections(url);
            if (uriConnections == null) {
                uriConnections = new HashSet<>();
                uriConnections.add(connection);
            } else {
                uriConnections.add(connection);
            }
            setConnections(url, uriConnections);
        }
        public ChronologyDate plusYears(long years) {
            if (years == 0) {
                return this;
            }
            int newYears = MathUtils.safeToInt(MathUtils.safeAdd(prolepticYear, years));
            return ChronologyDate.of(chrono, newYears, monthOfYear, dayOfMonth);
        }
    }
}