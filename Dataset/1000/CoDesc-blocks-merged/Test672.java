class Test {
    public class Example {
    private void createFormatAdapters() {
    		allFormats.clear();
    		if (docGenerator != null) {
    			for (de.tuc.in.sse.weit.export.steuerung.configuration.Format format : docGenerator
    					.getAllFormats()) {
    				allFormats.add(new FormatAdapter(format));
    			}
    		}
    	}
        public void applyUpgrade(Tank tank) {
    		//System.out.println("Applying speed upgrade");
    		tank.increaseSpeed();
    		// Schedule reversal of this upgrade after ACTIVE_TIME seconds.
    		UpgradeReverser reverser = new UpgradeReverser(tank, this, ACTIVE_TIME);
    		
    	}
        public void testLoad() throws DataSetException {
            String filename = "/xml/flatXmlDataSetTest.xml";
            IDataSet ds = loader.load(filename);
            assertTrue("No tables found in dataset.", ds.getTableNames().length > 0);
            // DataSet loading tests verify data accuracy
        }
    }
}