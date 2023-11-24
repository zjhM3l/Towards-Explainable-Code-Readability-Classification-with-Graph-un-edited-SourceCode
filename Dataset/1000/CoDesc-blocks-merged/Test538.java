class Test {
    public class Example {
    public void addObject(final T _object)
        {
            final Map<Long, T> newCache4Id =  getNewCache4Id();
            final Map<String, T> newCache4Name = getNewCache4Name();
            final Map<UUID, T>  newCache4UUID = getNewCache4UUID();
    
            if (getCache4Id() != null) {
                newCache4Id.putAll(getCache4Id());
            }
    
            if (getCache4Name() != null) {
                newCache4Name.putAll(getCache4Name());
            }
    
            if (getCache4UUID() != null) {
                newCache4UUID.putAll(getCache4UUID());
            }
    
            newCache4Id.put(_object.getId(), _object);
            newCache4Name.put(_object.getName(), _object);
            newCache4UUID.put(_object.getUUID(), _object);
    
            // replace old cache with new values
            // it is thread save because of volatile
            setCache4Id(newCache4Id);
            setCache4Name(newCache4Name);
            setCache4UUID(newCache4UUID);
        }
        public static URL get ( URL self , String urlType ) {
      String lowtype = urlType . toLowerCase ( ) ;
      if ( lowtype . equals ( "public" ) ) {
        return self . publicURL ;
      }
      else if ( lowtype . equals ( "private" ) ) {
        return self . privateURL ;
      }
      else {
        throw new IllegalArgumentException ( "Valid values are 'public' or 'private';
     " + "received '" + urlType + "'." ) ;
      }
    }
        public boolean resultInGroup(int n) {
    		if ( n<0 || n>=getRootBiasTotal() ) {
    			throw new IllegalArgumentException(n+" is outside of root bias range.");
    		}
    		int n2 =n;
    		for ( WeightedChildSkill wcs : childSkills ) {
    			n2 -= wcs.getWeighting().getValue();
    			if ( n2<0 ) {
    				return false;
    			}
    		}
    		return true;
    	}
    }
}