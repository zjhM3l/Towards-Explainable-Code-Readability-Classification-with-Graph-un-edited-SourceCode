class Test {
    public class Example {
    public void recreate(int S_Resource_ID,Timestamp date){
      GregorianCalendar cal=new GregorianCalendar();
      cal.setTime(date);
      cal.set(Calendar.HOUR,0);
      cal.set(Calendar.MINUTE,0);
      cal.set(Calendar.SECOND,0);
      cal.set(Calendar.MILLISECOND,0);
      if (m_type == TYPE_WEEK)   cal.set(Calendar.DAY_OF_WEEK,cal.getFirstDayOfWeek());
     else   if (m_type == TYPE_MONTH)   cal.set(Calendar.DAY_OF_MONTH,1);
      m_startDate=new Timestamp(cal.getTimeInMillis());
      cal.add(m_type,1);
      m_endDate=new Timestamp(cal.getTimeInMillis());
      log.config("(" + m_type + ") Resource_ID="+ S_Resource_ID+ ": "+ m_startDate+ "->"+ m_endDate);
      MAssignmentSlot[] mas=m_model.getAssignmentSlots(S_Resource_ID,m_startDate,m_endDate,null,true,null);
      MAssignmentSlot[] mts=m_model.getDayTimeSlots();
      timePanel.setTimeSlots(mts);
      schedulePanel.setAssignmentSlots(mas,S_Resource_ID,m_startDate,m_endDate);
      schedulePanel.setHeight(timePanel.getPreferredSize().height);
    }
        public void updateHandlers(Iterator handlerAdaptorIter) {
    		while( handlerAdaptorIter.hasNext() ) {
    			DataAdaptor handlerAdaptor = (DataAdaptor)handlerAdaptorIter.next();
    			int handlerType = handlerAdaptor.intValue("type");
    			switch(handlerType) {
    				case AbstractScreenHandler.DEFAULT_HANDLER:
    					_defaultHandler.update(handlerAdaptor);
    					break;
    				case AbstractScreenHandler.FFT_HANDLER:
    					_fftHandler.update(handlerAdaptor);
    					break;
    			}
    		}
    	}
        @NonNull
      public Caffeine<K, V> maximumSize(@NonNegative long maximumSize) {
        requireState(this.maximumSize == UNSET_INT,
            "maximum size was already set to %s", this.maximumSize);
        requireState(this.maximumWeight == UNSET_INT,
            "maximum weight was already set to %s", this.maximumWeight);
        requireState(this.weigher == null, "maximum size can not be combined with weigher");
        requireArgument(maximumSize >= 0, "maximum size must not be negative");
        this.maximumSize = maximumSize;
        return this;
      }
    }
}