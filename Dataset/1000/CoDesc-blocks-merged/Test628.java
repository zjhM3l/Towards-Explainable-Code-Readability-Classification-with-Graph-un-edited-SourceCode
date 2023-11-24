class Test {
    public class Example {
    protected void cleanFragments() {
    		for (int i = 0; i < fragments.size(); i++) {
    			fragments.get(i).cleanFragmentedFragment();
    		}
    	}
        private NSArray listFromBindings() {
            if (canGetValueForBinding(Keys.List)) {
                NSArray result = (NSArray)valueForBinding(Keys.List);
                if(result != null) {
                	return result;
                }
            }
            return NSArray.EmptyArray;
        }
        public IntIdentity (Class pcClass, String str) {
            super(pcClass);
            assertKeyNotNull(str);
            construct(Integer.parseInt(str));
        }
    }
}