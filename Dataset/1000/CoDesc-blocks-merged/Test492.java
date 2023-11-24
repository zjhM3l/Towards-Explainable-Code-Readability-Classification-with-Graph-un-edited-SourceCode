class Test {
    public class Example {
    public boolean equals(Object object) {
            if (! (object instanceof BindingSet))
                return false;
            QueryLiteral thatQueryLiteral = ((BindingSet) object).getQueryLiteral();
            return this.queryLiteral.equals(thatQueryLiteral);
        }
        public void setMax(int val) throws PropagationFailureException {
        	this.getIntDomain().setMax(val);
        	//notify listeners if the variable changed
        	if(this.getIntDomain().changed()) {
        		fireChangeEvent();
        	}
        }
        public void createMove(final Movable unit, final IVector destination) {
            unit.setDestination(destination);
            if (this.unitList.contains(unit)) {
                this.unitList.remove(unit);
            }
            this.unitList.add(unit);
        }
    }
}