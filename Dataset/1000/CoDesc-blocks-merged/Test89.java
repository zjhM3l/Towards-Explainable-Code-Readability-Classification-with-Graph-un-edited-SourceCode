class Test {
    public class Example {
    public void run() {
    		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
    		try {
    			String line;
    			while ((line = reader.readLine()) != null) {
    				if (prefix != null) {
    					System.out.printf("[%s] %s%n", prefix, line);
    				}
    				if (list != null) {
    					list.add(line);
    				}
    			}
    		} catch (IOException e) {
    			e.printStackTrace();
    		} finally {
    			try {
    				stream.close();
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    	}
        protected void updateStatus(boolean live) {
    		if (live) {
    			keepPipeLive();
    			pipeAlive = true;
    		} else if (isPipeLive()) {
    			pipeDestroy();
    			pipeAlive = false;
    		}
    	}
        public static void idleAllWorkers ( Scheduler self ) throws InterruptedException {
      self . setMode ( IDLE ) ;
      while ( 1 ) {
        Map < String , Integer > numPending = Maps . newHashMap ( ) ;
        for ( String workSpecName : self . registry . pull ( NICE_LEVELS ) . keySet ( ) ) {
          numPending . put ( workSpecName , self . numPending ( workSpecName ) ) ;
        }
        if ( Iterables . isEmpty ( numPending . values ( ) ) ) {
          break ;
        }
        logger . warn ( "waiting for pending workUnits: " + numPending ) ;
        Thread . sleep ( 1000 ) ;
      }
    }
    }
}