class Test {
    public class Example {
    public static double [ ] doubleCentre ( double [ ] matrix , boolean squareInput ) {
      double [ ] m = matrix . clone ( ) ;
      if ( squareInput ) {
        m [ 0 ] *= 2 ;
      }
      ( ( int ) m . length ) += 1 ;
      double cm = Math . mean ( m , 0 ) ;
      double rm = Math . mean ( m , 1 ) . doubleValue ( ) ;
      double gm = Math . mean ( cm ) ;
      m [ 0 ] -= rm + cm - gm ;
      m [ 1 ] /= - 2 ;
      return m ;
    }
        public void setLog4j_Level_DEBUG(String value) {
    		if (value == null) { return; }
    
    		value = value.trim();
    
    		if (value.length() == 0) { return; }
    
    		switch ((new Integer((String)Nagios_levels.get(value))).intValue()) {
    		case NAGIOS_OK:		Log4j_Level_DEBUG = NAGIOS_OK; break;
    		case NAGIOS_WARN:	Log4j_Level_DEBUG = NAGIOS_WARN; break;
    		case NAGIOS_CRITICAL:	Log4j_Level_DEBUG = NAGIOS_CRITICAL; break;
    		case NAGIOS_UNKNOWN:	Log4j_Level_DEBUG = NAGIOS_UNKNOWN; break;
    		default:		Log4j_Level_DEBUG = NAGIOS_UNKNOWN; break;
    		}
    
    	}
        public Operand pop() {
    		if(!source.isEmpty()) {
    			int lastIndex = source.size() - 1;
    			Operand operand = source.get(lastIndex);
    			source.remove(lastIndex);
    			return operand;
    		} else {
    			throw new IllegalStateException("Stack is empty");
    		}
    	}
    }
}