class Test {
    public class Example {
    private int getMask(int length, int offset) {
            int res = getMask(length) << offset;
    
            // if the bpp is 32 bits then we need to invert it because the buffer is in little endian
            if (bpp == 32) {
                return Integer.reverseBytes(res);
            }
    
            return res;
        }
        public static base_responses update(nitro_service client, appfwconfidfield resources[]) throws Exception {
    		base_responses result = null;
    		if (resources != null && resources.length > 0) {
    			appfwconfidfield updateresources[] = new appfwconfidfield[resources.length];
    			for (int i=0;i<resources.length;i++){
    				updateresources[i] = new appfwconfidfield();
    				updateresources[i].fieldname = resources[i].fieldname;
    				updateresources[i].url = resources[i].url;
    				updateresources[i].comment = resources[i].comment;
    				updateresources[i].state = resources[i].state;
    			}
    			result = update_bulk_request(client, updateresources);
    		}
    		return result;
    	}
        public int read(byte[] b, int off, int len) throws IOException {
        int mycount = 0;
        int current = 0;
        // limit bandwidth ?
        if (bandwidth > 0) {
          for (int i=off; i < off+len; i++) {
    	current = read();
    	if (current == -1) {
    	  return mycount;
    	} else {
    	  b[i]=(byte)current;
    	  count++;
    	  mycount++;
    	}
          }
          return mycount;
        } else {
          return in.read(b, off, len);
        }
      }
    }
}