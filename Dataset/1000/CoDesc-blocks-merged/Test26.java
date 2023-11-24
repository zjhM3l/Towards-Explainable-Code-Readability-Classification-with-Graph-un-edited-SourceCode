class Test {
    public class Example {
    protected void onGeneratedTypes(String result, JClassType[] genTypes) {
            List list = new ArrayList();
            Util.addAll(list, genTypes);
            Object existing = generatedTypesByResultTypeName.put(result, list);
            assert (existing == null) : "Internal error: redundant notification of generated types";
          }
        public final boolean isScrolledToBottom() {
            int y = getScrollY();
            View view = getChildAt(0);
            return (view.getBottom() - y) == getHeight();
        }
        public float getDecodeMax(int dimension) {
    		COSArray decode = cosGetDecode();
    		if (decode == null) {
    			return getRangeMax(dimension);
    		}
    		return decode.get((dimension * 2) + 1).asNumber().floatValue();
    	}
    }
}