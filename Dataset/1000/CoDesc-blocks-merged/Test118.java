class Test {
    public class Example {
    boolean calc_length_violation(){
      double old_violation=length_violation;
      double max_length=rule_net.get_class().get_maximum_trace_length();
      double min_length=rule_net.get_class().get_minimum_trace_length();
      if (max_length <= 0 && min_length <= 0) {
        length_violation=0;
        return false;
      }
      double new_violation=0;
      double trace_length=rule_net.get_trace_length();
      if (max_length > 0 && trace_length > max_length) {
        new_violation=trace_length - max_length;
      }
      if (min_length > 0 && trace_length < min_length && this.incomplete_list.size() == 0) {
        new_violation=trace_length - min_length;
      }
      length_violation=new_violation;
      boolean result=Math.abs(new_violation - old_violation) > 0.1;
      return result;
    }
        public void decrement(){
      int counterVal=counter.decrementAndGet();
      if (counterVal == 0) {
        if (null != resourceCallback) {
          resourceCallback.onTransitionToIdle();
        }
        becameIdleAt=SystemClock.uptimeMillis();
      }
      if (debugCounting) {
        if (counterVal == 0) {
          Log.i(TAG,"Resource: " + resourceName + " went idle! (Time spent not idle: "+ (becameIdleAt - becameBusyAt)+ ")");
        }
     else {
          Log.i(TAG,"Resource: " + resourceName + " in-use-count decremented to: "+ counterVal);
        }
      }
      if (counterVal < 0) {
        throw new IllegalArgumentException("Counter has been corrupted!");
      }
    }
        public static void validateInputParameters(ImfUtilityInputParameters inputParameters) throws ArgumentValidationException {
      File impDirectory=inputParameters.getImpDirectoryFile();
      if (impDirectory == null) {
        throw new ArgumentValidationException("IMP directory must be specified either as a command line argument or in config.xml");
      }
      if (!impDirectory.isDirectory()) {
        throw new ArgumentValidationException(String.format("IMP directory '%s' must be an existing folder",impDirectory.getAbsolutePath()));
      }
      File cplFile=inputParameters.getCplFile();
      if (cplFile == null) {
        throw new ArgumentValidationException("CPL file must be specified either as a command line argument or in config.xml");
      }
      if (!cplFile.isFile()) {
        throw new ArgumentValidationException(String.format("CPL file '%s' must be an existing file",cplFile.getAbsolutePath()));
      }
      File workingDir=inputParameters.getWorkingDirFile();
      if (workingDir == null) {
        throw new ArgumentValidationException("Working directory must be specified either as a command line argument or in config.xml");
      }
    }
    }
}