class Test {
    public class Example {
    public String getReturnTypeSignature() {
            int endOfParams = signature.lastIndexOf(')');
            if (endOfParams < 0)
                throw new IllegalArgumentException("Bad method signature: " + signature);
            return signature.substring(endOfParams + 1);
        }
        public void init() {
    		pool.clear();
    
    		if (randomMelodiesAmount > 0) {
    			addMelodies(RandomSetMelodiesProvider.provide(randomMelodiesAmount));
    		}
    
    		if (fractalMelodiesAmount > 0) {
    			addMelodies(FractalSetMelodiesProvider.provide(fractalMelodiesAmount));
    		}
    
    		if (loadMelodiesFromDatabase = true) {
    			addMelodies(DatabaseSetMelodiesProvider.provide());
    		}
    
    		if (loadMelodiesFromFiles = true) {
    			addMelodies(FileSetMelodiesProvider.provide());
    		}
    	}
        public static Object[] toArray(List<?> list) {
    	Iterator<?> it = list.iterator();
    	Class clazz = null;
    	while (it.hasNext()) {
    	    Object v = it.next();
    	    if (v == null) continue;
    	    if (clazz == null) clazz = v.getClass();
    	    else if (clazz != v.getClass()) return list.toArray();
    	}
    	if (clazz == Object.class || clazz == null) return list.toArray();
    
    	Object arr = java.lang.reflect.Array.newInstance(clazz, list.size());
    	return list.toArray((Object[]) arr);
        }
    }
}