class Test {
    public class Example {
    protected String getString(String stringCode) {
    
            Object[] args = { };
    
            return Messages.getString(getSchema(), stringCode, args);
    
        } /* getString(String) */
        protected void removeFrame(JInternalFrame frame) {
            if (useTabbedEmulation) {
                int i = frames.indexOf(frame);
                if (i != -1) {
                    jtp.removeTabAt(i);
                    frames.remove(frame);
                }
            }
            else {
                frames.remove(frame);
                remove(frame);
            }
        }
        public static void enableOnce(){
      if (logged)   return;
      ResourcesPlugin.getPlugin().getLog().log(new Status(IStatus.OK,ResourcesPlugin.PI_RESOURCES,"Place holder to init log-system. Loaded by " + EclipseGracefulUIShutdownEnabler.class.getName() + " @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=460863 "));
      logged=true;
    }
    }
}