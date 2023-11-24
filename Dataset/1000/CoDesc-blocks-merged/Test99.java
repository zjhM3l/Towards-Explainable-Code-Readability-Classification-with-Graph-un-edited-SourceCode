class Test {
    public class Example {
    public void select(JCustomizer customizer, Point point) {
            selectOnly(customizer);
            customizer.getStateManager().setStateBound(point);
            fireSelectionChanged();
        }
        public void destroy() throws DBException {
          // invoke destroy() on the delegate.
          executorService.shutdown();
          delegate.destroy();
          
          try {
             MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
             ObjectName oname = new ObjectName("com.virtela.poller:type=DBDriver,name=" + name);
             mbs.unregisterMBean(oname);
          }
          catch (Exception e) {
             throw new DBException(e);   
          }
          
          initialized = false;
       }
        private Record getRecord() {
            final VoiceXmlNode node = getNode();
    
            if (node == null) {
                return null;
            }
    
            if (!(node instanceof Record)) {
                return null;
            }
    
            return (Record) node;
        }
    }
}