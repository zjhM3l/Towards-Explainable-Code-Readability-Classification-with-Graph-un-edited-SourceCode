class Test {
    public class Example {
    public RemotePlayer LookupPlayer(InetAddress user) {
            //get name from IP address of the requestor
            Iterator<RemotePlayer> i = presences.values().iterator();
            RemotePlayer rp;
    
            while (i.hasNext()) {
                rp = i.next();
                if (user.equals(rp.listening_on.getAddress())) {
                    return rp;
                }
            }
    
            return null;
        }
        public List getAllReferences() {
    		int size = mLevels.size();
    		ArrayList array = new ArrayList();
    		Collection tmp = null;
    
    		for (int i = 0; i < size; i++) {
    			tmp = (Collection)mLevels.get(i);
    
    			if (tmp != null)
    				array.addAll(tmp);
    		}
    		return array;
    	}
        public static void extendExpirationDate ( AccessToken self , int days ) {
      long delta = TimeUtils . toSeconds ( days ) ;
      self . expirationDate = self . expirationDate + delta ;
      self . save ( ) ;
    }
    }
}