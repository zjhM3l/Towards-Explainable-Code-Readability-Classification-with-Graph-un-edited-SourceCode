class Test {
    public class Example {
    public void addActiveColor(int color) {
    
            if(color == Palette.NON_COLOR_INDEX) {
                nonColorActive = true;
            } else {
    
                if(((color < 0) || (color >= activeColors.length))) {
                    throw new IllegalArgumentException("Illegal color " + color);
                }
    
                activeColors[color] = true;
            }
        }
        static void runTest() throws Exception {
      Thread[] threadList=new Thread[NUM_OF_THREADS];
      s_conn=new Connection[NUM_OF_THREADS];
      if (s_cType == C_SHARED)   s_sconn=DriverManager.getConnection(CONNECTION,UID,PWD);
      for (int i=0; i < NUM_OF_THREADS; i++) {
        if (s_cType == C_PRECREATED)     s_conn[i]=DriverManager.getConnection(CONNECTION,UID,PWD);
        threadList[i]=new JdbcTest(i);
        threadList[i].start();
      }
      long start=System.currentTimeMillis();
      setGreenLight();
      for (int i=0; i < NUM_OF_THREADS; i++)   threadList[i].join();
      if (s_sconn != null)   s_sconn.close();
      s_sconn=null;
      for (int i=0; i < NUM_OF_THREADS; i++) {
        if (s_conn[i] != null)     s_conn[i].close();
        s_conn[i]=null;
      }
      long result=System.currentTimeMillis() - start;
      System.out.print(C_INFO[s_cType] + "Threads=" + NUM_OF_THREADS+ " \tYield="+ s_do_yield+ " \tms= "+ result+ " \teach= "+ (result / NUM_OF_THREADS));
      System.out.println();
    }
        public void setPosition(float x, float y, float z) {
    		px = x;
    		py = y;
    		pz = z;
    	}
    }
}