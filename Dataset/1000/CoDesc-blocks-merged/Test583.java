class Test {
    public class Example {
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
            
    if ("FLAuth".equals(portName)) {
                setFLAuthEndpointAddress(address);
            }
            else 
    { // Unknown Port Name
                throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
            }
        }
        public void visit(RegExprSpec n, A argu) {
          n.f0.accept(this, argu);
          n.f1.accept(this, argu);
          n.f2.accept(this, argu);
       }
        public Player createPlayer(String name, float leftLimit, float rightLimit) {
            Player player = new Player(name, players.size(), leftLimit, rightLimit);
            players.add(player);
    
            return player;
        }
    }
}