class Test {
    public class Example {
    public void actionDelete() {
            if (!(_currentTable.getRowCount() == 0)) {
                if (_mode) {
                    _tableStructurePanel.getTableModel().deleteRow(_currentTable
                                                                      .getSelectedRow());
                } else {
                    _tableDataPanel.getTableModel().deleteRow(_currentTable
                                                                 .getSelectedRow());
                }
    
                if (!(_currentRow.intValue() == 0)) {
                    _currentRow = new Long(_currentRow.intValue() - 1);
                    _currentTable.setColumnSelectionInterval(0,
                                                            _currentTable
                                                                .getColumnCount()
                                                            - 1);
                    _currentTable.setRowSelectionInterval(_currentRow.intValue(),
                                                         _currentRow.intValue());
                    this.setRow(_currentRow.longValue() + 1);
                }
            }
        }
        public void elapseTime(long quantum, TimeUnit timeUnit)
        {
            Preconditions.checkArgument(quantum > 0, "Time quantum must be a positive number");
            Preconditions.checkState(!isShutdown, "Trying to elapse time after shutdown");
    
            elapseTime(toNanos(quantum, timeUnit), ticker);
        }
        public Long getLongProperty(String...propertyAliases) throws BuildException {
    		Long value = null;
    		for(String alias : propertyAliases) {
    			if (getProperties().containsKey(alias)) {
    				//if the same property's aliases are defined multiple times, we need to throw exception
    				if (value == null) {
    					value = (Long)getProperties().get(alias);
    				} else {
    					throw new BuildException("Found multiple alias values for the same property: " + propertyAliases);
    				}
    			}
    		}
    		return value;
    	}
    }
}