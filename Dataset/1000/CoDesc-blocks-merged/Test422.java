class Test {
    public class Example {
    public void pack() {
            Container parent = this.parent;
            if (parent != null && parent.getPeer() == null) {
                parent.addNotify();
            }
            if (peer == null) {
                addNotify();
            }
            Dimension newSize = getPreferredSize();
            if (peer != null) {
                setClientSize(newSize.width, newSize.height);
            }
    
            if(beforeFirstShow) {
                isPacked = true;
            }
    
            validate();
        }
        public static void add ( Processor self , String kind , String key , Object ... values ) {
      if ( kind . equals ( "pre" ) ) {
        Map < String , Processor > procs = pre ;
        if ( kind . equals ( "post" ) ) {
          procs = post ;
        }
        else {
          throw new IllegalArgumentException ( "kind is not 'pre' or 'post'" ) ;
        }
        checkIfRegistered ( key ) ;
        procs . put ( key , values ) ;
      }
      else if ( kind . equals ( "post" ) ) {
        procs = post ;
      }
      else {
        throw new IllegalArgumentException ( "kind is not 'post'" ) ;
      }
      checkIfRegistered ( key ) ;
      procs . put ( key , values ) ;
    }
        public static < T > T runTaskJSON ( Class < T > taskClazz , String task_data ) {
      Task < T > task = instantiate ( taskClazz ) ;
      Callable < T > taskCallable = getCallable ( task ) ;
      TaskData td = new TaskData ( task_data ) ;
      td . setSkippingJson ( true ) ;
      return taskCallable . call ( td ) ;
    }
    }
}