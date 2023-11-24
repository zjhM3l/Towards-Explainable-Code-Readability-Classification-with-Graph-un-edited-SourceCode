class Test {
    public class Example {
    public void handleViewChange(View new_view, Digest digest) {
            Vector mbrs=new_view.getMembers();
            if(Trace.trace) {
                if(digest != null)
                    Trace.info(
                            "CoordGmsImpl.handleViewChange()",
                            "view=" + new_view + ", digest=" + digest);
                else
                    Trace.info(
                            "CoordGmsImpl.handleViewChange()",
                            "view=" + new_view);
            }
            if(leaving && !mbrs.contains(gms.local_addr)) {
                if(leave_promise != null) {
                    leave_promise.setResult(new Boolean(true));
                }
                return;
            }
            gms.installView(new_view, digest);
        }
        public void start(int port,int backlog,InetAddress localIP){
          try{
            ss = new ServerSocket(port,backlog,localIP);
            log("Starting SOCKS Proxy on:"+ss.getInetAddress().getHostAddress()+":"
                                          +ss.getLocalPort());
            while(true){
              Socket s = ss.accept();
              log("Accepted from:"+s.getInetAddress().getHostName()+":"
                                  +s.getPort());
              ProxyServer ps = new ProxyServer(auth,s, agent);
              (new Thread(ps)).start();
            }
          }catch(IOException ioe){
            ioe.printStackTrace();
          }finally{
          }
       }
        public void subtract(SequenceNameLocus region){
      final MergedIntervals intervals=mSequences.get(region.getSequenceName());
      if (intervals != null) {
        intervals.subtract(region);
      }
    }
    }
}