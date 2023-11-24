class Test {
    public class Example {
    public void handleTblButtonAddRequest(RequestInvocationEvent event){
      EntityAddViewBean vb=(EntityAddViewBean)getViewBean(EntityAddViewBean.class);
      setPageSessionAttribute(EntityAddViewBean.ENTITY_TYPE,(String)getPageSessionAttribute(PG_SESSION_ENTITY_TYPE));
      unlockPageTrail();
      passPgSessionMap(vb);
      vb.forwardTo(getRequestContext());
    }
        public void addPaxDetail(PaxDetail_type0 param){
                                       if (localPaxDetail == null){
                                       localPaxDetail = new PaxDetail_type0[]{};
                                       }
    
                                
                                     //update the setting tracker
                                    localPaxDetailTracker = true;
                                
    
                                   java.util.List list =
                                org.apache.axis2.databinding.utils.ConverterUtil.toList(localPaxDetail);
                                   list.add(param);
                                   this.localPaxDetail =
                                 (PaxDetail_type0[])list.toArray(
                                new PaxDetail_type0[list.size()]);
    
                                 }
        public boolean canBeConfirmed() {
            return true;
            /*
            if((!cancelled&&!confirmed))
            return true;
            return false;
             */
        }
    }
}