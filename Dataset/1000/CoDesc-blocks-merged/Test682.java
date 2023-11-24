class Test {
    public class Example {
    boolean isBetterCandidate(int direction,Rect source,Rect rect1,Rect rect2){
      if (!isCandidate(source,rect1,direction)) {
        return false;
      }
      if (!isCandidate(source,rect2,direction)) {
        return true;
      }
      if (beamBeats(direction,source,rect1,rect2)) {
        return true;
      }
      if (beamBeats(direction,source,rect2,rect1)) {
        return false;
      }
      return (getWeightedDistanceFor(majorAxisDistance(direction,source,rect1),minorAxisDistance(direction,source,rect1)) < getWeightedDistanceFor(majorAxisDistance(direction,source,rect2),minorAxisDistance(direction,source,rect2)));
    }
        public void error(Marker marker, String format, Object arg1, Object arg2) {
        if (!logger.isErrorEnabled())
          return;
        if (instanceofLAL) {
          String formattedMessage = MessageFormatter.format(format, arg1, arg2);
          ((LocationAwareLogger) logger).log(marker, fqcn,
              LocationAwareLogger.ERROR_INT, formattedMessage, null);
        } else {
          logger.error(marker, format, arg1, arg2);
        }
      }
        protected String substitute( String sIn ) {
    		String s = sIn;
    		
    		for (Iterator i = m_replacements.iterator(); i.hasNext(); ) {
    			Replacement r = (Replacement) i.next();
    			Matcher m = r.pattern.matcher(s);
    			s = m.replaceAll(r.sub);
    		}
    		
    		return s;
    	}
    }
}