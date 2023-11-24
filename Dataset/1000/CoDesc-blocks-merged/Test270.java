class Test {
    public class Example {
    public boolean insertRow(int rownum, Object[] data, boolean shiftrows){
            try{
                insertRow(rownum,shiftrows);
                for(int t=0;t<data.length;t++) {
                    if(data[t]!=null)
                        add(data[t], rownum, t);
                }
            }catch (Exception ex) {
            	throw new WorkBookException(ex.toString(),WorkBookException.RUNTIME_ERROR);
            }
            return true;
    	}
        public void setWindowTransparent(Window w, boolean transparent) {
                boolean isTransparent = w.getBackground() != null && w.getBackground().getAlpha() == 0;
                if (transparent != isTransparent) {
                    setBackgroundTransparent(w, transparent, "setWindowTransparent");
                }
            }
        private void transmit(Packet packet){
      byte[] data=packet.data;
      if (packet.offset > 0) {
        System.arraycopy(data,packet.offset,data=new byte[packet.length],0,packet.length);
      }
      stats.numBytes+=packet.length;
      stats.numPackets++;
      try {
        datagramConnection.send(remoteAddress,remotePort,data);
        RtpSource s=rtcpSession.getMySource();
        s.activeSender=true;
        rtcpSession.timeOfLastRTPSent=rtcpSession.currentTime();
        rtcpSession.packetCount++;
        rtcpSession.octetCount+=data.length;
      }
     catch (  IOException e) {
        e.printStackTrace();
      }
    }
    }
}