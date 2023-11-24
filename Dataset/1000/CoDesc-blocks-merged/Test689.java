class Test {
    public class Example {
    private boolean removeFacilityAccount() throws Exception {
    		if (selectedFacilityAccount.isNotNew()) {
    			if (PromptsController.questionIsOKCancelOK(getFrame(), "Remove " + selectedFacilityAccount.getDisplayListText(),
    			"Remove")) {
    				selectedFacilityAccount.setDeleted();
    				BillingService.store(selectedFacilityAccount);
    				loadAccessListResultsByRef(AccessReference.FACILITYACCOUNTMODELLIST.getRefId());
    			}
    		} 
    		return false;
    	}
        private JPanel getInlineTextPanel() {
        if (inlineTextPanel == null) {
          inlineTextPanel = new JPanel();
          inlineTextPanel.setLayout(new BoxLayout(inlineTextPanel, BoxLayout.Y_AXIS));
          inlineTextPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(
              10, 10, 10, 10));
    
          inlineTextPanel.add(getJScrollPane(), null);
        }
    
        return inlineTextPanel;
      }
        public int getHeaderHeight () {
    	checkWidget ();
    	if ( !OS.GTK_CLIST_SHOW_TITLES (handle) ) return 0;
    	OS.gtk_widget_size_request(handle, new GtkRequisition());
    	return OS.GTK_CLIST_COLUMN_TITLE_AREA_HEIGHT(handle);
    }
    }
}