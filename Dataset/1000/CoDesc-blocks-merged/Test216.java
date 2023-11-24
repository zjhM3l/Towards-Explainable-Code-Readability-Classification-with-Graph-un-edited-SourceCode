class Test {
    public class Example {
    public static @NonNull PushPullAnimation create(@Direction int direction,boolean enter,long duration){
    switch (direction) {
    case UP:
    case DOWN:
        return new VerticalPushPullAnimation(direction,enter,duration);
    case LEFT:
    case RIGHT:
    default :
      return new HorizontalPushPullAnimation(direction,enter,duration);
    }
    }
        public String transformBackToOriginalTipText() {
        return "Transform through the IC space and back to the original space. "
          +"If only the best n ICs are retained (by setting varianceCovered < 1) "
          +"then this option will give a dataset in the original space but with "
          +"less attribute noise.";
      }
        public int countInternalGaps() {
    		int count = 0;
    
    		for(int x = 0; x < len; x++) {
    			if(isInternalGap(seq[x]))
    				count++;
    		}
    
    		return count;
    	}
    }
}