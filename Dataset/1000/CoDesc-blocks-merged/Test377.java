class Test {
    public class Example {
    public final FluxSink<IN> sink(FluxSink.OverflowStrategy strategy) {
    		Objects.requireNonNull(strategy, "strategy");
    		if (getBufferSize() == Integer.MAX_VALUE){
    			strategy = FluxSink.OverflowStrategy.IGNORE;
    		}
    
    		FluxCreate.BaseSink<IN> s = FluxCreate.createSink(this, strategy);
    		onSubscribe(s);
    
    		if(s.isCancelled() ||
    				(isSerialized() && getBufferSize() == Integer.MAX_VALUE)){
    			return s;
    		}
    		if (serializeAlways())
    			return new FluxCreate.SerializedSink<>(s);
    		else
    			return new FluxCreate.SerializeOnRequestSink<>(s);
    	}
        public boolean getTypeOfFkey(int i) {
    		boolean r;
    		if(typeOfFKey.get(this.getListIndexOfElement(i)) instanceof Boolean) {
    			r = ((Boolean)typeOfFKey.get(this.getListIndexOfElement(i))).booleanValue();
    		} else {
    			r = false;
    		}
    		return r;
    	}
        public void setTheme(String theme) {
            if (hasText(theme)) {
                this.theme = theme;
            }
        }
    }
}