class Test {
    public class Example {
    private ThreadScope getSessionScope() throws Exception {
            final String scopeID = USER_GLOBAL_SCOPE + getInterpreterID();
            final Request request = ObjectModelHelper.getRequest(this.processInfoProvider.getObjectModel());
    
            ThreadScope scope;
    
            // Get/create the scope attached to the current context
            HttpSession session = request.getSession(false);
            if (session != null) {
                scope = (ThreadScope) session.getAttribute(scopeID);
            } else {
                scope = (ThreadScope) request.getAttribute(scopeID);
            }
    
            if (scope == null) {
                scope = createThreadScope();
                // Save scope in the request early to allow recursive Flow calls
                request.setAttribute(scopeID, scope);
            }
    
            return scope;
        }
        public void testProcessContent() throws Exception {
        System.out.println("processContent");
        ActionServlet servlet = new MockActionServlet(context, config);
        RequestProcessor instance = new RequestProcessor();
        instance.init(servlet, moduleConfig);
        try{
          instance.processContent(request, response);
        } catch (UnsupportedOperationException uoe) {
          // this is expected as MockResponse is not a real response and does not implement everything
        } catch (Exception e){
          fail("test should threw an unexpected Exception: "+e.getClass().getName());
        } finally {
          instance.destroy();
        }
      }
        public String getType() {
            if (type == null) {
                return "free_entry";
            } else {
                return type;
            }
        }
    }
}