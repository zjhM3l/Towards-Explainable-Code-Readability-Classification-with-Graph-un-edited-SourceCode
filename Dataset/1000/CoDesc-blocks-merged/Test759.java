class Test {
    public class Example {
    private List<ColumnFamilyDescriptor> createAndRegisterColumnFamilyDescriptors(
    		List<StateMetaInfoSnapshot> stateMetaInfoSnapshots,
    		boolean registerTtlCompactFilter) {
    
    		List<ColumnFamilyDescriptor> columnFamilyDescriptors =
    			new ArrayList<>(stateMetaInfoSnapshots.size());
    
    		for (StateMetaInfoSnapshot stateMetaInfoSnapshot : stateMetaInfoSnapshots) {
    			RegisteredStateMetaInfoBase metaInfoBase =
    				RegisteredStateMetaInfoBase.fromMetaInfoSnapshot(stateMetaInfoSnapshot);
    			ColumnFamilyDescriptor columnFamilyDescriptor = RocksDBOperationUtils.createColumnFamilyDescriptor(
    				metaInfoBase, columnFamilyOptionsFactory, registerTtlCompactFilter ? ttlCompactFiltersManager : null);
    			columnFamilyDescriptors.add(columnFamilyDescriptor);
    		}
    		return columnFamilyDescriptors;
    	}
        private void setAsParent(Txn transaction) {
                if (pageHeader.getStatus() == BRANCH) {
                    for (int i = 0; i < nPtrs; i++) {
                        BTreeNode node = getBTreeNode(ptrs[i]);
                        if (transaction != null && isTransactional) {
                            Loggable log = new SetParentLoggable(transaction, fileId, 
                                node.page.getPageNum(), page.getPageNum());
                            writeToLog(log, node);
                        }
                        node.setParent(this);
                        cache.add(node);
                    }
                }
            }
        public void applyMoves(Moves mvs, boolean overwrite) {
            Move m;
            for (int i = 0; i < mvs.size(); i++) {
                m = mvs.getMove(i);
    
                // Sets the tile if square is empty, or overwrite is set to TRUE
                if (isEmpty(m.getX(), m.getY()) || overwrite) {
                    this.setTile(m.getX(), m.getY(), ((Tile) m).makeClone());
                    this.unsetBonus(m.getX(), m.getY());
                }
            }
        }
    }
}