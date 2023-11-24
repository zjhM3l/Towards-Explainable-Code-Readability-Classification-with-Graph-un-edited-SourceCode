class Test {
    public class Example {
    public String getText(Object object) {
    		String label = ((BulkResource)object).getName();
    		return label == null || label.length() == 0 ?
    			getString("_UI_BulkResource_type") :
    			getString("_UI_BulkResource_type") + " " + label;
    	}
        private boolean isGameDay(Calendar currentDay) {
        int dayOfWeek = currentDay.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
          case Calendar.MONDAY: {
            return (gameDays.indexOf("MO") >= 0);
          }
          case Calendar.TUESDAY: {
            return (gameDays.indexOf("TU") >= 0);
          }
          case Calendar.WEDNESDAY: {
            return (gameDays.indexOf("WE") >= 0);
          }
          case Calendar.THURSDAY: {
            return (gameDays.indexOf("TH") >= 0);
          }
          case Calendar.FRIDAY: {
            return (gameDays.indexOf("FR") >= 0);
          }
          case Calendar.SATURDAY: {
            return (gameDays.indexOf("SA") >= 0);
          }
          case Calendar.SUNDAY: {
            return (gameDays.indexOf("SU") >= 0);
          }
          default: {
            return true;
          }
        }
    
      }
        public void setValue(OBJTYPE value) {
    		// same value? ignore it
    		if(prefValue == value)
    			return;
    		
    		// they equal the same thing? ignore it
    		if(prefValue != null && prefValue.equals(value))
    			return;
    		
    		valueModified = true;
    		prefValue = value;
    		
    		if(autocommit)
    			commit();
    	}
    }
}