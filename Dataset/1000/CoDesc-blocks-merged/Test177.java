class Test {
    public class Example {
    public void mouseClicked(MouseEvent evt) {
    
    		/*
    		if (current_tool == UIScribblePad.NO_TOOL) {
    			UINode node = oViewPane.getUI().isMouseOnANode(evt);
    			if (node != null) {
    				((NodeUI)node.getUI()).mouseClicked(evt);
    			}
    			else {
    				UILink link = oViewPane.getUI().isMouseOnALink(evt);
    				if (link != null) {
    					((LinkUI)link.getUI()).mouseClicked(evt);
    				}
    				else {
    					((ViewPaneUI)oViewPane.getUI()).mouseClicked(evt);
    				}
    			}
    			return;
    		}
    		*/
    		if (oViewPane.isScribblePadBack()) {
    			((ViewPaneUI)oViewPane.getUI()).mouseClicked(evt);
    			return;
    		}
    		else {
    			evt.consume();
    		}
    	}
        public static void cleanSessionMapPartnerList(String userDN,String currentEntityId,String metaAlias,FSSession session){
      if (FSUtils.debug.messageEnabled()) {
        FSUtils.debug.message("In cleanSessionMapPartnerList for user : " + userDN + "and provider : "+ currentEntityId);
      }
      FSSessionManager sessionMgr=FSSessionManager.getInstance(metaAlias);
      sessionMgr.removeProvider(userDN,currentEntityId,session);
    }
        @Override public void stateChanged(ChangeEvent e){
      setButtons();
      if (getCurrentTable() != null) {
        notifyListeners(getCurrentTable().getURL(),getCurrentTable().getUser(),getCurrentTable().getPassword(),getCurrentTable().getQuery());
      }
    }
    }
}