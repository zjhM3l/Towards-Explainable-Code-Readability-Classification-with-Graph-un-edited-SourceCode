class Test {
    public class Example {
    public Conditionality traitSpaceEndConditionality() {
            final AbstractRelativeSpace property =
                    (AbstractRelativeSpace) getProperty(FoProperty.SPACE_END);
            if (property == null) {
                return AbstractRelativeSpace.getConditionalityNoInstance();
            }
            return property.getConditionality();
        }
        public int getChildCount(Object t) {
    		if (isNil(t)) {
    			return ((NilNode) t).getChildCount();
    		}
    		
    		return treeBuilder.getChildCount((AbstractTPLNode) t);
    	}
        public final Object pop(){
      Object result=this.first.value;
      this.first=this.first.next;
      if (this.first == null)   this.last=null;
      return result;
    }
    }
}