class Test {
    public class Example {
    public void checkDeleteExistingFile(String filename){
      Log.i(TAG,">>>>>>>>>>>>>>>>>>checkDeleteExistingFile  = " + filename);
      if (filename != null) {
        File temp=new File(filename);
        if (temp != null && temp.exists()) {
          temp.delete();
        }
      }
    }
        public void setDoubleValue(Double value) throws NOMException {
    	if (element!=null) {
    	    element.setDoubleAttribute(name, value);
    	} else {
    	    number_value=value;
    	}
        }
        public void populateAntiHostList(PTContainer c,List<String> antiHosts){
      for (  PTContainer container : c.getStrictAntiPrefs()) {
        if (antiAffinityMapping.containsKey(container)) {
          antiHosts.add(antiAffinityMapping.get(container));
        }
     else {
          String antiHost=getHostForContainer(container);
          if (antiHost != null) {
            antiHosts.add(antiHost);
          }
        }
      }
    }
    }
}