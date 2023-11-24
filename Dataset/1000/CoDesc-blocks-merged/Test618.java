class Test {
    public class Example {
    public String getLastWarningMessage() {
    		if (null != lastWarningMessage) {
    			String message = lastWarningMessage.substring(0);
    			lastWarningMessage = null;
    			return message;
    		} else {
    			return null;
    		}
    	}
        public void setBorder(Border border) {
    		if (textField!=null) {
    			textField.setBorder(border);
    		}
    	}
        public Vector sub(Vector b) {
            if ((b == null) || (size != b.size)) return null;
    
            int i;
            Vector result = new Vector(size);
            for (i = 0; i < size; i++)
                result.vector[i] = vector[i] - b.vector[i];
            return result;
        }
    }
}