class Test {
    public class Example {
    public void setStartOffset(float startOffset) {
    		if(startOffset > 1.0f || startOffset < 0.0f)
    			throw new IllegalArgumentException("startOffset out of range");
    		this.startOffset = startOffset;
    	}
        private synchronized void adb(final String... args){
      String[] commands=new String[args.length + 1];
      commands[0]=adbPath;
      System.arraycopy(args,0,commands,1,args.length);
      try {
        Runtime.getRuntime().exec(commands).waitFor();
      }
     catch (  IOException ex) {
        JOptionPane.showMessageDialog(null,ex.getLocalizedMessage(),"Android DB Viewer",JOptionPane.ERROR_MESSAGE);
      }
    catch (  InterruptedException ex) {
        JOptionPane.showMessageDialog(null,ex.getLocalizedMessage(),"Android DB Viewer",JOptionPane.ERROR_MESSAGE);
      }
    }
        public void passNewData(List<DirPollRow> newData, Partner localPartner) {
            this.localPartner = localPartner;
            this.data.clear();
            this.data.addAll(newData);
            ((AbstractTableModel) this).fireTableDataChanged();
        }
    }
}