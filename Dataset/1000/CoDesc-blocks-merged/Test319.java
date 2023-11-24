class Test {
    public class Example {
    private void printColorStyle(Hashtable<String, String> colorTable, PrintWriter out) {
    
    		Iterator<String> colorIt = colorTable.keySet().iterator();
    
    		while (colorIt.hasNext()) {
    			String color        = colorIt.next();
    			String styleColorID = colorTable.get(color);
    
    			this.outStyle(styleColorID,color,false, null,null,out);
    		}
    		
    	}
        boolean checkServerUp(String serverId){
      if ((serverId == null) || (serverId.isEmpty())) {
        return false;
      }
      if (serverId.equalsIgnoreCase(localServerId)) {
        return true;
      }
      if ((servers == null) || servers.isEmpty()) {
        return false;
      }
      StateInfo info=servers.get(serverId);
      info.isUp=checkServerUp(info);
      return info.isUp;
    }
        public void update(Group group) {
    		this.applyCommonConstraints(group);
    
    		if (group.getId() == 0) {
    			throw new ValidationException("update() expects a group with an existing id");
    		}
    
    		this.repository.update(group);
    	}
    }
}