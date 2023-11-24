class Test {
    public class Example {
    public void notifyChanged(Notification notification) {
    		updateChildren(notification);
    
    		switch (notification.getFeatureID(DictLiteralExp.class)) {
    			case ImperativeoclPackage.DICT_LITERAL_EXP__PART:
    				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
    				return;
    		}
    		super.notifyChanged(notification);
    	}
        private List<Column> filterKeyColumn(CqlRow row) {
        if ( suppressKeyInColumns && row.isSetColumns() && row.columns.size() > 0) {
          Iterator<Column> columnsIterator = row.getColumnsIterator();
          Column column = columnsIterator.next();
          if ( column.name.duplicate().equals(KEY_BB) ) {
            columnsIterator.remove();  
          }      
        }
        return row.getColumns();
      }
        public void removeChannel(int n){
    	if(!((n>=0)&&(n<getChannelNum())))
    	    return;
    	sounds.remove(n);
        }
    }
}