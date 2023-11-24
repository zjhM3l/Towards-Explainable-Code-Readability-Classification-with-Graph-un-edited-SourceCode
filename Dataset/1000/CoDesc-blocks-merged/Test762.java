class Test {
    public class Example {
    private String getAsLocalCacheKey( String path ) {
    		String key = path.toUpperCase();
    		key = key.replace( '\\', '/' );
    		return key;
    	}
        protected void warning(String message) {
            JOptionPane.showMessageDialog(this,
                    message, VietPad.APP_NAME,
                    JOptionPane.INFORMATION_MESSAGE);
        }
        private void resize() {
            Object[] newArray = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
    }
}