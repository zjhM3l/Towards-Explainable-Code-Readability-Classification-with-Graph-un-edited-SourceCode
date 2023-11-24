class Test {
    public class Example {
    public BufferedImage getImage() {
        if (image == null) {
          generateGraphic(null);
        }
        return image;
      }
        public void setETINStatus(gov.irs.www.a2a.mef.mefmsiservices_xsd.ETINStatusType[] param){
                                  
                                       validateETINStatus(param);
    
                                   
                                              if (param != null){
                                                 //update the setting tracker
                                                 localETINStatusTracker = true;
                                              } else {
                                                 localETINStatusTracker = false;
                                                     
                                              }
                                          
                                          this.localETINStatus=param;
                                  }
        @Override public Container[] findChildren(){
    synchronized (children) {
        Container results[]=new Container[children.size()];
        return children.values().toArray(results);
      }
    }
    }
}