class Test {
    public class Example {
    public HashMap fetchIDName() throws Exception{
    		openDB();
    		
    		HashMap idNameMap = new HashMap();
    		String qtext = "SELECT pid, indexDir FROM personindex";
    		ResultSet rs = stmt.executeQuery(qtext); //edges table is not complete
    		while (rs.next()) {
    			String pid = rs.getString("pid");
    			String indexDir = rs.getString("indexDir");
    			idNameMap.put(indexDir.toLowerCase(), pid);
    		}
    		
    		rs.close();		
    		closeDB();
    		
    		return idNameMap;
    	}
        public void createPartControl(Composite parent) {
    		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
    		viewer.setContentProvider(new ViewContentProvider());
    		viewer.setLabelProvider(new ViewLabelProvider());
    		viewer.setSorter(new NameSorter());
    		viewer.setInput(getViewSite());
    
    		// Create the help context id for the viewer's control
    		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "CladosPlugin.viewer");
    		makeActions();
    		hookContextMenu();
    		hookDoubleClickAction();
    		contributeToActionBars();
    	}
        public boolean hasAttribute(String attribute_name)
       {  for (int i=0; i<av.size(); i++)
          {  if (((AttributeField)av.elementAt(i)).getAttributeName().equals(attribute_name)) return true;
          }
          return false;
       }
    }
}