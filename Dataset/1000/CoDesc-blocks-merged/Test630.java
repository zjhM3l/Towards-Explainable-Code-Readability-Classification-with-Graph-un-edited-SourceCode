class Test {
    public class Example {
    public Collection getLibraryNames() {
            if (logger.isDebugEnabled())
                logger.debug("getRelativeUrlsForDynamicLoading");
            Collection c = new ArrayList();
            File[] files = this.libDir.listFiles();
            for (int i = 0; i < files.length; i++) {
                c.add(files[i].getName());
            }
            return c;
        }
        private static VCalAlarmProperty convert(VAlarm valarm, ICalComponent parent) {
    		VCalAlarmProperty property = create(valarm);
    		if (property == null) {
    			return null;
    		}
    
    		property.setStart(determineStartDate(valarm, parent));
    
    		DurationProperty duration = valarm.getDuration();
    		if (duration != null) {
    			property.setSnooze(duration.getValue());
    		}
    
    		Repeat repeat = valarm.getRepeat();
    		if (repeat != null) {
    			property.setRepeat(repeat.getValue());
    		}
    
    		return property;
    	}
        public XObject execute(XPathContext xctxt) throws javax.xml.transform.TransformerException
      {
        double pos = (double) getPositionInContextNodeList(xctxt);
        
        return new XNumber(pos);
      }
    }
}