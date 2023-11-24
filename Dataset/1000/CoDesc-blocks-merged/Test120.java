class Test {
    public class Example {
    public void addOutput(OutputArg output) {
            if(m_outputArgs == null) {
                m_outputArgs = new java.util.LinkedList() ;
            }
            m_outputArgs.add(output) ;
        }
        public void set_logging_level (DevVarLongStringArray dvlsa) throws DevFailed {
        //- Check input
        if (dvlsa.svalue.length != dvlsa.svalue.length) {
          String desc = "Imcompatible command argument type, long and string arrays must have the same length";
          Except.throw_exception("API_IncompatibleCmdArgumentType", desc, "Logging::set_logging_level");
        }
        //- For each entry in dvlsa.svalue
        for (int i = 0; i < dvlsa.svalue.length; i++) {
          //- Check/get logging level (may throw DevFailed)
          Level level = tango_to_log4j_level(dvlsa.lvalue[i]);
          //- Get ith wilcard
          String pattern = dvlsa.svalue[i].toLowerCase();
          //- Get devices which name matches the pattern pattern
          Vector dl = Util.instance().get_device_list(pattern);
          //- For each device in dl
          Iterator it = dl.iterator();
          while (it.hasNext()) {
            Logger logger = ((DeviceImpl)it.next()).get_logger();
            if (logger == null) {
              String desc = "Internal error. Got invalid logger for device " + logger.getName();
              Except.throw_exception("API_InternalError", desc, "Logging::set_logging_level");
            }
            // set logger's level
            logger.setLevel(level);
            Util.out4.println("Logging level set to " + level.toString() + " for device " + logger.getName());
          } //  while it.hasNext
        } // for i
    	}
        public void popOutConsole() {
    		if (PopoutVertical == 0) {
    			Rectangle bounds = getBounds();
    			PopoutVertical = (int) 7 * (bounds.height / 10);
    		}
    
    		if (VerticalHidden) {
    			VerticalHidden = false;
    			mainSplitpane.setDividerLocation(PopoutVertical);
    		}
    	}
    }
}