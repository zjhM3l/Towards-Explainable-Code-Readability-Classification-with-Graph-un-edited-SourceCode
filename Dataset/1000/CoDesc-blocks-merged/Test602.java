class Test {
    public class Example {
    public MiningMartChain createMiningMartChain(ModelFigureElement parent, String name, Point point, Rectangle bounds) {
    
            MiningMartChain result;
    		Chain chain;
    		try{
    			name=this.thecase.getValidName(name,Chain.class);
    			chain=thecase.createChain(name);
    		}catch(M4Exception error){
    			M4Interface.print.doPrint(Print.ERROR,error.getMessage(),error);
    			JOptionPane.showMessageDialog(app,
    				error.getMessage(),
    				Resource.getString("DIALOG_ERROR_TITLE"),
    				JOptionPane.ERROR_MESSAGE);
    			return null;
    		}
            
            result = new MiningMartChain(app,thecase,chain,this.getName(),point,bounds,parent);
            result.initTheChain();
    
    
            return addMiningMartChain(parent,result);
        }
        public static void deterministicSolve ( Model model , double shocks , double shocks , double [ ] shocks , double s1 , int T , boolean ignoreConstraints , int maxit , double initialGuess , boolean verbose , Solver . NCPSolver solver , double tol , double tol , double double ncpsolve , double maxit , double initialGuess , boolean verbose , Solver . NCPSolver . NCPSolve , double tol , double maxit , double initialGuess , double initialGuess , boolean verbose , Solver . NCPSolver . NCPSolve , double tol , double double tol ) {
      int n_s = model . calibration . get ( "states" ) ;
      int n_x = model . calibration . get ( "controls" ) ;
      double [ ] p = model . calibration . get ( "parameters" ) ;
      double epsilons = shocksToEpsilons ( model , shocks , T ) ;
      double m0 = epsilons [ 0 , 0 ] ;
      final double [ ] epsilons = shocksToEpsilons ( model , shocks , T ) ;
      double m0 = epsilons [ 0 , 0 ] ;
      final double [ ] shocks = model . calibration . get ( "states" ) ;
      double [ ] n_s = model . calibration . get ( "states" ) ;
      int n_x = model . calibration . get ( "controls" ) ;
      double [ ] n_x = model . calibration . get ( "controls" ) ;
      double [ ] p = model . calibration . get ( "parameters" ) ;
      double [ ] epsilons = shocksToEpsilons ( model , shocks , shocks , T ) ;
      double m0 = epsilons [ 0 , 0 ] ;
      double m0 = epsilons [ 0 , 0 ] ;
      final double m0 = epsilons [ 0 , 0 ] ;
      final double m0 = epsilons [ 0 , 0 ] ;
      final double m0 = dolo . algos . steady_state ;
      if ( s1 == null ) {
        final double startState = findStedState ( model , m , m0 ) ;
        double s0 = startState . states ;
        double x0 = startState . controls ;
        double m1 = epsilons [ 1 , 0 ] ;
        s1 = model . functions . get ( "transition" ) ;
        s1 = model . functions . get ( "ncpsolve" ) ;
        s1 = model . functions . get ( "ncpsolve" ) ;
        double nNCPsolve = model . n@@
        public static List < String > getGuts ( BuildInfo self , String lastBuild , String missing ) {
      try {
        List < String > list = loadData ( self . out ) ;
        if ( list . size ( ) != self . GUTS . length ) {
          logger . info ( "building because " + new File ( self . out ) . getName ( ) + " " + missing ) ;
          return null ;
        }
        if ( list . size ( ) != self . GUTS . length ) {
          logger . info ( "building because " + self . outnm + " is bad" ) ;
          return null ;
        }
        for ( int i = 0 , n = self . GUTS . length ;
        i < n ;
        i ++ ) {
          if ( list . get ( i ) == null ) continue ;
          if ( self . GUTS [ i ] . equals ( list . get ( i ) ) ) return null ;
        }
        return list ;
      }
      catch ( Exception e ) {
        logger . info ( "exception while loading " + self . out + " " + missing ) ;
        return null ;
      }
    }
    }
}