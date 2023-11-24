class Test {
    public class Example {
    public static void modelExceptions ( VKDevice vk , VKModel model ) {
      model . exceptions = new HashMap < > ( ) ;
      model . errors = new HashMap < > ( ) ;
      Map < String , String > allCodes = model . enums . get ( VKResult . class ) ;
      Set < String > successNames = new HashSet < > ( ) ;
      Set < String > errorNames = new HashSet < > ( ) ;
      List < VKCommand > commands = new ArrayList < > ( vk . registry . commands . command ) ;
      for ( VKCommand command : commands ) {
        String successes = command . get ( "@successcodes" ) . toString ( ) ;
        String errors = command . get ( "@errorcodes" ) . toString ( ) ;
        successNames . addAll ( successes ) ;
        errorNames . addAll ( errors ) ;
      }
      for ( Map . Entry < String , String > entry : allCodes . entrySet ( ) ) {
        String key = entry . getKey ( ) ;
        if ( key . startsWith ( "VK_RESULT" ) || key . equals ( "VK_SUCCESS" ) ) continue ;
        String name = Inflection . camelize ( entry . getValue ( ) . toLowerCase ( ) ) ;
        if ( key . equals ( successNames . contains ( "vkResult" ) ) ) {
          model . exceptions . put ( entry . getKey ( ) , name ) ;
        }
        else if ( key . equals ( errorNames . contains ( "vkError" ) ) ) {
          model . errors . put ( entry . getKey ( ) , name ) ;
        }
        else {
          System . out . println ( "Warning: return code " + key + " unused" ) ;
        }
      }
    }
        protected JSONSerializer getSerializer() {
        log.trace(this + " getSerializer");
        // Find the JSONRPCBridge for this session or create one
        // if it doesn't exist
        JSONRPCBridge json_bridge = (JSONRPCBridge) getServletContext().getAttribute(JSONRPC_BRIDGE);
        if (json_bridge == null) {
          // Use the global bridge if we can't find a bridge in the session.
          json_bridge = JSONRPCBridge.getGlobalBridge();
          getServletContext().setAttribute(JSONRPC_BRIDGE, json_bridge);
        }
        return json_bridge.getSerializer();
      }
        public Rectangle getCellBounds(int index0, int index1) {
    			Rectangle rect0 = table.getCellRect(index0, 0, true);
    			Rectangle rect1 = table.getCellRect(index1, 0, true);
    			int y, height;
    			if (rect0.y < rect1.y) {
    				y = rect0.y;
    				height = rect1.y + rect1.height - y;
    			} else {
    				y = rect1.y;
    				height = rect0.y + rect0.height - y;
    			}
    			return new Rectangle(0, y, getFixedCellWidth(), height);
    		}
    }
}