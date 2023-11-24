class Test {
    public class Example {
    public DeleteKeyPairAction(KseFrame kseFrame){
      super(kseFrame);
      putValue(LONG_DESCRIPTION,res.getString("DeleteKeyPairAction.statusbar"));
      putValue(NAME,res.getString("DeleteKeyPairAction.text"));
      putValue(SHORT_DESCRIPTION,res.getString("DeleteKeyPairAction.tooltip"));
      putValue(SMALL_ICON,new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getResource(res.getString("DeleteKeyPairAction.image")))));
    }
        public void setRemoteAddr(InetAddress remoteAddr) throws FTPException {
            checkConnection(false);
            this.remoteAddr = remoteAddr;
            this.remoteHost = remoteAddr.getHostName();
        }
        public void setCoord(Coords o, Coords v){
    		coordsys.resetCoordSys();
    		coordsys.addPoint(o);
    		coordsys.addVector(v);
    		coordsys.makeOrthoMatrix(false,false);
    		//Application.debug("o=\n"+o+"\nv=\n"+v+"\ncoordsys=\n"+coordsys.getMatrixOrthonormal());
    		//Application.debug("o=\n"+o+"\nv=\n"+v+"\norigin=\n"+coordsys.getOrigin()+"\nVx=\n"+coordsys.getVx());
    	}
    }
}