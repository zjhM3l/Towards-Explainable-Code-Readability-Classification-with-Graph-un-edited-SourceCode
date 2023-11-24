class Test {
    public class Example {
    public TextField getAsymmetricNumberOfTests () {
    if (asymmetricNumberOfTests == null) {//GEN-END:|186-getter|0|186-preInit
     // write pre-init user code here
    asymmetricNumberOfTests = new TextField ("Number of tests to run:", "1", 2, TextField.NUMERIC);//GEN-LINE:|186-getter|1|186-postInit
     // write post-init user code here
    }//GEN-BEGIN:|186-getter|2|
    return asymmetricNumberOfTests;
    }
        public void setTomu(String value) {
    		if (value.length() > 11) {
    			value = value.substring(0, 11);
    		}
    		setFieldValue("DCTOMU", value);
    	}
        public int compare(Image o1, Image o2) {
    		if (o1 == null || o1.getExifMetadata() == null || o1.getExifMetadata().getFocal() == null) {
    			if (o2 == null || o2.getExifMetadata() == null || o2.getExifMetadata().getFocal() == null)
    				return 0;
    			return -1;
    		}
    		if (o2 == null || o2.getExifMetadata() == null || o2.getExifMetadata().getFocal() == null)
    			return 1;
    		
    		Float focal1 = Float.valueOf(o1.getExifMetadata().getFocal());
    		Float focal2 = Float.valueOf(o2.getExifMetadata().getFocal());
    		return focal1.compareTo(focal2);
    	}
    }
}