class Test {
    public class Example {
    public JFileChooser getFileChooser() {
    		if (fileChooser == null)
    			createFileChooser();
    		return fileChooser;
    	}
        private int drain(byte[] b, int off, int len) {
        int remaining = Math.min(len, byteBuffer.remaining());
        byteBuffer.get(b, off, remaining);
        return remaining;
      }
        public void setSmcd(String value) {
            if (value.length() > 4) {
                value = value.substring(0, 4);
            }
            setField("ACSMCD", value);
        }
    }
}