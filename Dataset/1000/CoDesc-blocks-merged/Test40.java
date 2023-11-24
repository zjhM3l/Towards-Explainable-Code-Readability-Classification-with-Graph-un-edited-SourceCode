class Test {
    public class Example {
    public String showOpenDialog( int constraints ) throws IOException {
            JFileChooser chooser = new JFileChooser();
            chooser.setFileSelectionMode(constraints);
            int val = chooser.showOpenDialog(this);
            if ( val == JFileChooser.APPROVE_OPTION ) {
                return chooser.getSelectedFile().getCanonicalPath();
            }
            return null;
        }
        public SOAPMonitorData getData(int row) {
                SOAPMonitorData soap = null;
                if (filter_data == null) {
                    soap = (SOAPMonitorData) data.elementAt(row);
                } else {
                    soap = (SOAPMonitorData) filter_data.elementAt(row);
                }
                return soap;
            }
        public void copyTo(DataStoreRow dest) {
    	DSDataStoreDescriptor destDesc = dest.getDesc();
    	DSDataRow sourceRow = getDSDataRow();
    	DSDataRow destRow = dest.getDSDataRow();
    	sourceRow.copyTo(destRow,_desc,destDesc);	
    }
    }
}