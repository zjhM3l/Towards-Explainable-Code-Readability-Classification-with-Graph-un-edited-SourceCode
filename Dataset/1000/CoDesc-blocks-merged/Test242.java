class Test {
    public class Example {
    public double getValue(LogData prev, LogData next) {
    		double val = 0;
    		switch (this) {
    			case EV:
    				val = next.getDeltaResistance();
    				break;
    			case T:
    				val = next.getTemperature();
    				break;
    			case P:
    				val = next.getPressure();
    				break;
    			case dPdt:
    				val = (prev != null) ? next.getPressure() - prev.getPressure() : 0;
    				break;
    		}
    
    		return val;
    		
    	}
        static private boolean meetsSatisfaction( final Solver solver, final double satisfactionTarget ) {
    		// get the best solution found so far
    		final Trial bestSolution = solver.getScoreBoard().getBestSolution();
    		if ( bestSolution == null )  return false;
    		
    		// check if any objective satisfaction is below the minimum satisfaction					
    		for ( final Objective objective : solver.getProblem().getObjectives() ) {
    			final double satisfaction = bestSolution.getSatisfaction( objective );
    			if ( Double.isNaN( satisfaction ) || satisfaction < satisfactionTarget ) {
    				return false;
    			}
    		}
    		
    		return true;	// if we made it this far then all conditions are satisfied to stop		
    	}
        @Override public Object clone() throws CloneNotSupportedException {
      DefaultKeyedValues2D clone=(DefaultKeyedValues2D)super.clone();
      clone.columnKeys=new java.util.ArrayList(this.columnKeys);
      clone.rowKeys=new java.util.ArrayList(this.rowKeys);
      clone.rows=(List)ObjectUtilities.deepClone(this.rows);
      return clone;
    }
    }
}