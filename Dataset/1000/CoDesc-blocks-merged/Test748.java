class Test {
    public class Example {
    public Object createObject() {
            try {
                final Object o = getObjectClass().newInstance();
                // now add the various parameters ...
    
                final Iterator it = getParameterNames();
                while (it.hasNext()) {
                    final String name = (String) it.next();
    
                    if (isParameterIgnored(name)) {
                        continue;
                    }
    
                    final Method method = findSetMethod(name);
                    final Object parameterValue = getParameter(name);
                    if (parameterValue == null) {
                        // Log.debug ("Parameter: " + name + " is null");
                    }
                    else {
                        method.invoke(o, new Object[]{parameterValue});
                    }
                }
                return o;
            }
            catch (Exception e) {
                Log.error("Unable to invoke bean method", e);
            }
            return null;
        }
        public boolean isRealSubsetOf(GraphComponentSet<T> g) {
            if (null == g) {
                throw new NullPointerException();
            }
    
            return g.containsAll(this) && g.size() != this.size();
        }
        public double getDouble(byte[] marshalledBytes) throws MarshallingException {
    		ByteArrayInputStream baInputStream = new ByteArrayInputStream(
    				marshalledBytes);
    		DataInputStream din = new DataInputStream(new BufferedInputStream(
    				baInputStream));
    
    		if (marshalledBytes == null) {
    			throw new NullPointerException("Specified byte[] is null.");
    		}
    		try {
    			double value = din.readDouble();
    
    			return value;
    		} catch (IOException ioe) {
    			throw new MarshallingException("Problems un-marshalling double. "
    					+ ioe.getMessage());
    		}
    	}
    }
}