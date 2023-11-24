class Test {
    public class Example {
    public List<List<T>> split(Predicate<? super T> predicate) {
            final List<T> a = Lists.newArrayList(), b = Lists.newArrayList();
            for (T elt: each()) {
                (predicate.apply(elt) ? a : b).add(elt);
            }
            List<List<T>> result = Lists.newArrayList();
            result.add(a);
            result.add(b);
            return result;
        }
        public int transferStateAndDataFrom(JBuffer buffer) {
    		final int len = buffer.size();
    		JBuffer b = getMemoryBuffer(len);
    
    		buffer.transferTo(b);
    
    		return peerStateAndData(b, 0);
    	}
        public void setOrigin(String origin) {
    		if (!Comparison.areEqual(this.origin, origin)) {
    			this.origin = origin;
    			setModified("origin");
    		};
    	}
    }
}