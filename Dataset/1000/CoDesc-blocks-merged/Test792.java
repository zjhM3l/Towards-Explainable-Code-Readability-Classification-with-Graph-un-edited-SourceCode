class Test {
    public class Example {
    public String getFixtureId() {
            if (!isValidFitTable()) {
                return null;
            }
    
            return getRows().get(FIXTURE_ID_ROW).getCells().get(FIXTURE_ID_CELL).getData();
        }
        public boolean canLoad( Entity unit ) {
            // Assume that we cannot carry the unit.
            boolean result = false;
    
            /*
             * For now disable everything until I get docking worked out
            if(unit instanceof Dropship) {
                Dropship ds = (Dropship)unit;
                result = true;
                if(ds.isDockCollarDamaged()) 
                    result = false;
            }
    
            // We must have enough space for the new troops.
            // POSSIBLE BUG: we may have to take the Math.ceil() of the weight.
            if ( this.currentSpace < 1 || isDamaged()) {
                result = false;
            }
            */
            
            // Return our result.
            return result;
        }
        public UserTokenPolicy findUserTokenPolicy(UserTokenType type){
      if (UserIdentityTokens == null)   return null;
      for (  UserTokenPolicy p : UserIdentityTokens) {
        try {
          String securityPolicyUri=p.getSecurityPolicyUri();
          SecurityPolicy.getSecurityPolicy(securityPolicyUri);
        }
     catch (    ServiceResultException e) {
          continue;
        }
        if (p.getTokenType() != type)     continue;
        return p;
      }
      return null;
    }
    }
}