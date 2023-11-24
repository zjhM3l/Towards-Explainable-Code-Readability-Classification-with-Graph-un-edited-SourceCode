class Test {
    public class Example {
    public static void shuffle(int[] array){
    synchronized (random) {
        random.shuffle(array);
      }
    }
        public byte[] responseAsBytes() throws IOException {
            InputStream is = responseAsInputStream();
            try {
                return IOUtils.toByteArray(is);
            } finally {
                Utils.close(is);
                disconnect();
            }
    
        }
        protected void updateOutgoingEdgesStateD(
    			int currS, int currL,
    			int prevS, int prevL,
    			Emissions emission
    	){
    		updateOutgoingEdges(currS, currL, States.D, prevS, prevL, States.D, Transitions.t_D_in, emission);
    		updateOutgoingEdges(currS, currL, States.D, prevS, prevL, States.M, Transitions.t_M_to_D, emission);
    	}
    }
}