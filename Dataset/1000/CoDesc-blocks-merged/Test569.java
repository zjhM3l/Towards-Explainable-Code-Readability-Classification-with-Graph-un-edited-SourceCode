class Test {
    public class Example {
    private void ensureMutatorFor(Map<String, SetGetPair> mutators, String property) {
    		if (!mutators.containsKey(property)) {
    			mutators.put(property, new SetGetPair());
    		}
    	}
        public void incrementElementsCount(int amount){
      if (this.maxElements <= 0) {
        return;
      }
      this.elements+=amount;
      if (this.elements > this.maxElements) {
        throw new RuntimeException("Tried to read NBT tag with too many elements, " + this.elements + " > "+ this.maxElements);
      }
    }
        public void addTables(Collection<Table> tables) {
            for (Iterator<Table> it = tables.iterator(); it.hasNext();) {
                addTable(it.next());
            }
        }
    }
}