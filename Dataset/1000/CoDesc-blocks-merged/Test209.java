class Test {
    public class Example {
    @DSComment("Private Method") @DSBan(DSCat.PRIVATE_METHOD) @DSGenerator(tool_name="Doppelganger",tool_version="2.0",generated_on="2013-12-30 12:58:20.856 -0500",hash_original_method="F527C5C3DD4F0176588A0C261AD76B7A",hash_generated_method="E21B90D8FFA2C73529233B2579E8CE52") private Message obtainCompleteMessage(int what){
      pendingOperations++;
      lastRelevantPoll=null;
      needsPoll=true;
      if (DBG_POLL)   log("obtainCompleteMessage: pendingOperations=" + pendingOperations + ", needsPoll="+ needsPoll);
      return obtainMessage(what);
    }
        public void setFilter (SiteTreeFilter filter) {
    
    		this.filter = filter;
    
    		SiteNode root = getRoot();
    
    		setFilter(filter, root);
    
    		// Never filter the root node
    
    		root.setFiltered(false);
    
    	}
        public boolean isNotWindowsBased( ) {
    
            if( partitionType == 0x07 || // NTFS
                    partitionType == 0x0b || // FAT32 CHS
                    partitionType == 0x0c || // FAT32 LBA
                    partitionType == 0x06 // FAT16
    
            )
                return false; // it may be windows based
            else
                return true; // can't be windows based
        }
    }
}