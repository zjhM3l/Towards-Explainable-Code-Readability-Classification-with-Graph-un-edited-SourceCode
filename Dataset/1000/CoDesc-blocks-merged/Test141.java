class Test {
    public class Example {
    private String getArchiveFileName(String archive) {
            String fileExtension = getFilenameExtension();
    
            if (archive.endsWith(fileExtension)) {
                return archive;
            } else if (archive.endsWith(archiver.getFilenameExtension())) {
                return archive + compressor.getFilenameExtension();
            } else {
                return archive + fileExtension;
            }
        }
        private void init() {
    		branchNextMove = false;
    		moveChainCount = 1;
    		
    		treeRoot = new ChainLink(0, null);
    		currentLink = treeRoot;
    		
    		branchTop = new BranchLink(CM_MAIN_BRANCH_NUMBER, ChessTree.messages.getString("defBranchName"));
    		branchModel = new DefaultTreeModel(branchTop);
    		branchCurrent = branchTop;
    		branchMarked = null;
    		branchChainMap = new HashMap();
    
    		branchChainMap.put(branchTop.getKey(), branchTop);
    	}
        public boolean domainMatch(String host, String domain) {
            boolean match = host.equals(domain) 
                || (domain.startsWith(".") && host.endsWith(domain));
    
            return match;
        }
    }
}