class Test {
    public class Example {
    protected boolean write(String s, boolean doecho) {
        if (debug > 2) System.out.println("write(|" + s + "|," + doecho);
        if (s == null) // aka the empty string.
          return true;
        /* NOTE: getBytes() honours some locale, it *CONVERTS* the string.
         * However, we output only 7bit stuff towards the target, and *some*
         * 8 bit control codes. We must not mess up the latter, so we do hand
         * by hand copy.
         */
    
        byte arr[] = new byte[s.length()];
        for (int i = 0; i < s.length(); i++) {
          arr[i] = (byte) s.charAt(i);
        }
        write(arr);
    
        if (doecho)
          putString(s);
        return true;
      }
        public float getDefaultInitialAssetQuantity() {
    		try {
    			return this.getAssetPropagationDelegator().getDefaultInitialAssetQuantity();
    		} catch (Exception e) {
    			Debug.println(getClass(), e.getMessage(), e);
    		}
    		return 1000.0f;
    	}
        private Attribute getAttribute(QueryComponent queryComponent) {
    		String internalName = queryComponent.getQualifiedName();
    		Attribute attribute = null;
    		if (nameToAttributeMap.containsKey(internalName)) {
    			attribute = (Attribute) nameToAttributeMap.get(internalName);
    		} else {
    			attribute = new Attribute(queryComponent.getName());
    			if (queryComponent.getValue() != null) {
    				attribute.setAttributes(queryComponent.getValue());
    			}
    			nameToAttributeMap.put(internalName, attribute);
    		}
    		return attribute;
    	}
    }
}