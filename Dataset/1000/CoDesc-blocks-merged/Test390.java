class Test {
    public class Example {
    public long getMillis(int type) {
    		if (type >= millis.length || type < 0)
    			return 0;
    		return millis[type];
    	}
        private void workerExecute() {
    		File[] dirList;
    		// Clear existing information
    		display.syncExec(new Runnable() {
    			public void run() {
    				tableContentsOfLabel.setText(SWTFileViewerDemo
    						.getResourceString("details.ContentsOf.text",
    								new Object[] { workerStateDir.getPath() }));
    				table.removeAll();
    				table.setData(TABLEDATA_DIR, workerStateDir);
    			}
    		});
    		dirList = getDirectoryList(workerStateDir);
    
    		for (int i = 0; (!workerCancelled) && (i < dirList.length); i++) {
    			workerAddFileDetails(dirList[i]);
    		}
    
    	}
        public void push(final RuleConditionElement rce) {
            if (this.buildstack == null) {
                this.buildstack = new LinkedList<>();
            }
            this.buildstack.addLast(rce);
        }
    }
}