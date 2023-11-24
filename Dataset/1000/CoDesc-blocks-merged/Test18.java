class Test {
    public class Example {
    private ClassLoader setupClassPath(File rootPath) {
    		ClassLoader classLoader = null;
    		if (rootPath == null)
    			return null;
    
    //		File path = getPath(rootPath, node);
    		File path = rootPath;
    
    		try {
    			if (path != null) {
    				URI uri = path.toURI();
    				classLoader = new URLClassLoader(new URL[] { uri.toURL() });
    			}
    		} catch (Exception e) {
    			e.printStackTrace();
    			classLoader = null;
    		}
    
    		return classLoader;
    	}
        public void DataRecieved(byte[] bytes) {
        //System.out.println(getClass().getName() + " Bytes Recv'd = " + bytes);// convert the bytes to a String before output
        this.bytes = new byte[bytes.length];
        System.arraycopy(bytes, 0, this.bytes, 0, bytes.length);
        bytesRecieved = true;
      }
        public MyGuiDnDDrawable getFutureLayoutDrawable(Point p) {
            Rectangle[] rects = getActiveDnDAreas();
            for(int i=1; i<rects.length; i++)
                if (rects[i].contains(p))
                    if (i==1 || i==3)
                        return new FutureLayoutDrawable(rects[i]);
                    else
                        return new FutureLayoutDrawable( new Rectangle((int)rects[i].getX(), 0,
                                                                (int)rects[i].getWidth(),
                                                                (int)getHeight()) );
    
            return new FutureLayoutDrawable(getActiveDnDAreas()[0]);
        }
    }
}