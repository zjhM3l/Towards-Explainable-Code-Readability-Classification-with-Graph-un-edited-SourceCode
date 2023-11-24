class Test {
    public class Example {
    @Override public boolean provides(Class<?> type){
      if (adapterMemo.getDisabled()) {
        return false;
      }
     else   if (type.equals(jmri.ProgrammerManager.class)) {
        return true;
      }
     else   if (type.equals(jmri.ThrottleManager.class)) {
        return true;
      }
     else   if (type.equals(jmri.PowerManager.class)) {
        return true;
      }
     else   if (type.equals(jmri.SensorManager.class)) {
        return true;
      }
     else   if (type.equals(jmri.TurnoutManager.class)) {
        return true;
      }
     else   if (type.equals(jmri.ReporterManager.class)) {
        return true;
      }
     else   if (type.equals(jmri.LightManager.class)) {
        return true;
      }
     else   if (type.equals(jmri.CommandStation.class)) {
        return true;
      }
      return false;
    }
        public void loadAssociations() {
    
    		initListRoles();
    
    	}
        public String getComponent(int i) {
        if (i < 0 || i >= ncomponents) {
          return null;
        }
        if (i == 0) {
          return new String(chars, 0, ends[0]);
        }
        return new String(chars, ends[i - 1], ends[i] - ends[i - 1]);
      }
    }
}