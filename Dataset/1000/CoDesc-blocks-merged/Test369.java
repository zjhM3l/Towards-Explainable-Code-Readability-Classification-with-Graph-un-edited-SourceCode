class Test {
    public class Example {
    public void testProcessData_2() {
    		LinkGrabber lg = new LinkGrabber(100);
    
    		String url1 = "http://www.google.com";
    		String url2 = "http://www.sourceforge.net";
    
    		String link1 = genLink(url1, "link1");
    		String link2 = genLink(url2, "link2");
    
    		String data = "<html><body><p>" + link1 + link2 + "</p></body></html>";
    
    		lg.readData(data, null);
    		assertEquals(url1, lg.getNextUrl());
    		assertEquals(url2, lg.getNextUrl());
    		assertEquals(null, lg.getNextUrl());
    	}
        public static void setRandomB(BMatrixRMaj mat , Random rand )
        {
            boolean d[] = mat.data;
            int size = mat.getNumElements();
    
    
            for( int i = 0; i < size; i++ ) {
                d[i] = rand.nextBoolean();
            }
        }
        void save(){
      if (kSave == null) {
        kSave=new byte[blockSize];
      }
      System.arraycopy(k,0,kSave,0,blockSize);
    }
    }
}