class Test {
    public class Example {
    public void updateEnableStateFXItems(){
      for (  MenuItem menuItem : menuItem2CommandFX.keySet()) {
        ICommand command=menuItem2CommandFX.get(menuItem);
        menuItem.setDisable(!command.isApplicable());
        if (command instanceof ICheckBoxCommand) {
          ((CheckMenuItem)menuItem).setSelected(((ICheckBoxCommand)command).isSelected());
        }
      }
    }
        private void removeFromCircleOfTrust(BaseConfigType config,String realm,String entityId){
      String classMethod="IDFFMetaManager:removeFromCircleOfTrust:";
      try {
        if (config != null) {
          Map attr=IDFFMetaUtils.getAttributes(config);
          List cotAttr=(List)attr.get(COTConstants.COT_LIST);
          List cotList=new ArrayList(cotAttr);
          if ((cotList != null) && !cotList.isEmpty()) {
            for (Iterator iter=cotList.iterator(); iter.hasNext(); ) {
              String cotName=(String)iter.next();
              if (cotName != null && cotName.length() > 0) {
                try {
                  cotManager.removeCircleOfTrustMember(realm,cotName,COTConstants.IDFF,entityId);
                }
     catch (            COTException ce) {
                  if (debug.messageEnabled()) {
                    debug.message(classMethod + "Invalid COT: " + cotName);
                  }
                }
              }
            }
          }
        }
      }
     catch (  Exception e) {
        debug.error("IDFFMetaManager.removeFromCircleOfTrust:" + "Error while removing entity " + entityId + " from COT.",e);
      }
    }
        public void setPerspective(Perspective p) {
            setPerspective(p.getView().getSwingComponent());
    
            kendoTVButton.setEnabled(p instanceof DesignPerspective);
            organizeButton.setEnabled(p instanceof DesignPerspective);
            exportRtfItem.setEnabled(p instanceof DesignPerspective);
    
            kendoTVButton.setVisible(p instanceof DesignPerspective);
            organizeButton.setVisible(p instanceof DesignPerspective);
            setViewMenuItemsVisible(p instanceof DesignPerspective);
            setProjectMenuItemsVisible(p instanceof DesignPerspective);
        }
    }
}