class Test {
    public class Example {
    public static void checkRange(int row,int column){
      if (row < 0) {
        throw new IllegalArgumentException("row must be in range 0-" + (row - 1));
      }
      if (column < 0) {
        throw new IllegalArgumentException("column must be in range 0-" + (row - 1));
      }
    }
        public static ResolvableType forMethodParameter(MethodParameter methodParameter, Type targetType) {
    		Assert.notNull(methodParameter, "MethodParameter must not be null");
    		ResolvableType owner = forType(methodParameter.getContainingClass()).as(methodParameter.getDeclaringClass());
    		return forType(targetType, new MethodParameterTypeProvider(methodParameter), owner.asVariableResolver()).
    				getNested(methodParameter.getNestingLevel(), methodParameter.typeIndexesPerLevel);
    	}
        public BitSet alignWith(AlignmentVector other) {
        final int size = this.size();
    
        if (size != other.size()) return null;
    
        final BitSet result = new BitSet(size);
    
        for (int i = 0; i < size; ++i) {
          result.set(i, this.getCell(i).compareTo(other.getCell(i)) == 0);
        }
    
        return result;
      }
    }
}