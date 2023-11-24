class Test {
    public class Example {
    protected String getNotificationResource(CmsObject cms) {
    
    
    
            String result = getParameter(
    
                PARAM_NOTIFICATION_CONTENT,
    
                OpenCms.getSystemInfo().getConfigFilePath(cms, "notification/workflow-notification"));
    
            return result;
    
        }
        protected String doIt() throws java.lang.Exception {
      StringBuffer sql=null;
      if (m_DeleteOldImported) {
        int no=0;
        for (    X_I_Movement move : getRecords(true,false)) {
          move.deleteEx(true);
          no++;
        }
        log.fine("Delete Old Impored =" + no);
      }
      fillIDValues();
      importRecords();
      return "Imported: " + imported + ", Not imported: "+ notimported;
    }
        public Object getAdapter(Class type) {
    		if (type == org.eclipse.ui.views.properties.IPropertySheetPage.class) {
    			ERPropertySheetPage page = new ERPropertySheetPage();
    			ERPropertySheetSorter sorter = new ERPropertySheetSorter();
    			page.setRootEntry(new UndoablePropertySheetEntry(getCommandStack()));
    			page.setSorter(sorter);
    			return page;
    		}
    		return super.getAdapter(type);
    	}
    }
}