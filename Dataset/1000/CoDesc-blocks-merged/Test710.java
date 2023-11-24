class Test {
    public class Example {
    public void testSaveData() {
            try {
                FileInputStream si = new FileInputStream(TEST_PATIENT_DEFAULT_PATH);
                model.loadData(si);
                File file = new File(TEST_PATIENT_DEFAULT_PATH);
                file.delete();
                assertFalse(file.exists());
                file = null;
                
                FileOutputStream so = new FileOutputStream(TEST_PATIENT_DEFAULT_PATH);
                model.saveData(so);
                file = new File(TEST_PATIENT_DEFAULT_PATH);
                assertTrue(file.exists());
            } catch (GelloModelException e) {
                System.out.println(e.getMessage());
                assertFalse(true);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                assertFalse(true);
            }
        };
        public Object extractValue() {
    		for (int i = 0; i < buttons.size(); i++) {
    			JRadioButton jRadioButton = (JRadioButton) buttons.get(i);
    			if (jRadioButton.isSelected()) {
    				return ids.get(i);
    			}
    		}
    		return null;
    	}
        private JTextField getClientReconnectTimeout() {
    		if (clientReconnectTimeout == null) {
    			clientReconnectTimeout = new JTextField();
    		}
    		return clientReconnectTimeout;
    	}
    }
}