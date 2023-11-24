class Test {
    public class Example {
    private IAtomContainer readMolecule() throws Exception {
            boolean foundCompound = false;
            while (parser.next() != XMLEvent.END_DOCUMENT) {
                if (parser.getEventType() == XMLEvent.START_ELEMENT) {
                    if (parser.getLocalName().equals("PC-Compound")) {
                        foundCompound = true;
                        break;
                    }
                }
            }
            if (foundCompound) {
                return parserHelper.parseMolecule(parser, builder);
            }
            return null;
        }
        private JButton getBackupTerugzettenButton() {
    		if (backupTerugzettenButton == null) {
    			backupTerugzettenButton = new JButton();
    			backupTerugzettenButton.setText("Zet backup terug");
    			backupTerugzettenButton.addActionListener(new BackupTerugzettenButtonActionListener());
    		}
    		return backupTerugzettenButton;
    	}
        public static PeriodType millis(){
      PeriodType type=cMillis;
      if (type == null) {
        type=new PeriodType("Millis",new DurationFieldType[]{DurationFieldType.millis()},new int[]{-1,-1,-1,-1,-1,-1,-1,0});
        cMillis=type;
      }
      return type;
    }
    }
}