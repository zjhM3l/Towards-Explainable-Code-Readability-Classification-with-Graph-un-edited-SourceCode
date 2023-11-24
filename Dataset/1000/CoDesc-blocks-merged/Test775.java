class Test {
    public class Example {
    public void flushBase64() throws java.io.IOException {
                if (position < 1) {
                    return;
                }
    
                if (encode == false) {
                    throw new java.io.IOException(
                            "Base64 input not properly padded.");
                }
    
                out.write(encode3to4(b4, buffer, position));
                position = 0;
            }
        public void setcapheader(OutputStream out) {
            byte[] head = new byte[]{(byte) 0xd4, (byte) 0xc3, (byte) 0xb2, (byte) 0xa1, (byte) 0x03, (byte) 0x00,
                (byte) 0x04, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
                (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0xff, (byte) 0xff,
                (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00
            };
            try {
                out.write(head);
            } catch (IOException ex) {
                tolog("FILE : could not write capture header");
            } catch (Exception ex) {
                tolog("FILE : could not convert Header to byte[]");
            }
        }
        private void adjustRecoverKeyBinding() {
    		//check, if key binding exists...create if necessary
    		if (!this.isSetRecoverKeyBinding()) {
    
    			KeyInfo ki = new KeyInfo();
    			
    			KeyBindingType rkb = new KeyBindingType();
    			rkb.setKeyInfo(ki);
    			
    			this.setRecoverKeyBinding(rkb);
    		} else if (!this.getRecoverKeyBinding().isSetKeyInfo()) {
    			KeyInfo ki = new KeyInfo();
    			this.getRecoverKeyBinding().setKeyInfo(ki);
    		}
    	}
    }
}