class Test {
    public class Example {
    public static Schema loadSchema ( String path ) throws IOException {
      try ( InputStream json = new FileInputStream ( path ) ) {
        Schema schema = Schema . parseFrom ( json ) ;
        return schema ;
      }
    }
        private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException {
      ObjectInputStream.GetField f=s.readFields();
      hgap=f.get("hgap",0);
      vgap=f.get("vgap",0);
      if (f.defaulted("vector")) {
        Hashtable<String,Component> tab=(Hashtable)f.get("tab",null);
        vector=new Vector<>();
        if (tab != null && !tab.isEmpty()) {
          for (Enumeration<String> e=tab.keys(); e.hasMoreElements(); ) {
            String key=(String)e.nextElement();
            Component comp=(Component)tab.get(key);
            vector.add(new Card(key,comp));
            if (comp.isVisible()) {
              currentCard=vector.size() - 1;
            }
          }
        }
      }
     else {
        vector=(Vector)f.get("vector",null);
        currentCard=f.get("currentCard",0);
      }
    }
        private void parseSize(UWP uwp) {
    		int			size = uwp.getDiameter();
    		
    		if (size == 0) {
    			planetType = PlanetType.Cerean;
    		}
    		
    		radius = size * 800;
    
    		// Following sets day length to be some whole number of minutes.
    		day = 60 * (int)(Die.d6(7) * 50  * Math.pow(radius/6400.0, 0.33));
    		
    		if (distance < 50) {
    			day *= 100;
    		}
    	}
    }
}