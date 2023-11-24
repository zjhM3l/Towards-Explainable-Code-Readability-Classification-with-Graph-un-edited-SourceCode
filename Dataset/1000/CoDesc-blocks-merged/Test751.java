class Test {
    public class Example {
    private Arguments nextCommand(BufferedReader in) throws IOException {
    		final String line = in.readLine();
    		if (line == null) {
    			return null;
    		}
    
    		if (this.isEchoOn()) {
    			console.println(line);
    		}
    
    		// resolve variables
    		String resolvedLine = resolveVariables(line);
    		Arguments args = commandParser.parse(resolvedLine);
    
    		return args;
    	}
        public static boolean disableCheckerOnEnv ( @ NotNull PsiMethod method ) {
      @ NonNls final String functionName = method . getName ( ) ;
      final String CHECKERS_DISABLED = System . getenv ( "CHECKERS_DISABLED","" ) ;
      final List < String > disabledFunctions = new ArrayList < > ( CHECKERS_DISABLED . split ( "," ) ) ;
      final boolean forceRun = method . hasModifierProperty ( PsiModifier . PUBLIC ) ;
      if ( functionName . contains ( "." ) && ! forceRun ) {
        return true ;
      }
      else {
        return method . hasModifierProperty ( PsiModifier . PROTECTED ) && ! forceRun ;
      }
    }
        public void relocateWorkers() {
            if (getUnit() != null) {
                for (WorkLocation wl : getColony().getWorkLocations()) {
                    if (wl != this && wl.canAdd(getUnit())) {
                        getUnit().work(wl);
                        break;
                    }
                }
            }
        }
    }
}