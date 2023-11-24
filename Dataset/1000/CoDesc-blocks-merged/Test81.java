class Test {
    public class Example {
    public GpxWaypointRecord createNewWaypointAfterSelection(Position pos) {
    		//create a waypoint
    		GpxWaypointRecord res = new GpxWaypointRecord(getNextName(), pos);
    		insertAfterWaypoint(res, getActiveWaypoint());
    		return res;
    	}
        public Device copy() {
    	if (isCopiable())
    		return DeviceUtilities.defaultCopy(this);
    	else
    		return null;
    }
        private static void addEvents ( final Class < ? extends AbstractEvent > clazz ) {
      final Method makeEvent = clazz . getDeclaredMethod ( "createDefaultEvent" ) ;
      makeEvent . setAccessible ( true ) ;
      for ( Method method : clazz . getDeclaredMethods ( ) ) {
        if ( ! method . isAccessible ( ) ) {
          method . setAccessible ( true ) ;
          method . invoke ( null ) ;
        }
      }
    }
    }
}