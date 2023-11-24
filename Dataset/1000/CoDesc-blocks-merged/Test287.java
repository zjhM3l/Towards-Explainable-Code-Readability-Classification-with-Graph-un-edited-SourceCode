class Test {
    public class Example {
    @ApiOperation(value="Delete workspace attribute",notes="Deletes attributes of a specified workspace. Roles allowed: account/owner, workspace/admin, system/admin") @ApiResponses(value={@ApiResponse(code=204,message="No Content"),@ApiResponse(code=404,message="Not Found"),@ApiResponse(code=409,message="Invalid attribute name"),@ApiResponse(code=500,message="Internal Server Error")}) @DELETE @Path("/{id}/attribute") @RolesAllowed({"account/owner","workspace/admin","system/admin"}) public void removeAttribute(@ApiParam(value="Workspace ID") @PathParam("id") String wsId,@ApiParam(value="Attribute name",required=true) @Required @QueryParam("name") String attributeName,@Context SecurityContext context) throws NotFoundException, ServerException, ConflictException {
      validateAttributeName(attributeName);
      final Workspace workspace=workspaceDao.getById(wsId);
      if (null != workspace.getAttributes().remove(attributeName)) {
        workspaceDao.update(workspace);
      }
    }
        protected String readObjectType(CharBuffer buffer) {
            // the first character must be 'L'
            if(buffer.get() != 'L')
                return "?";
            
            // start from 0 because charAt() takes index relative to current position
            // and now charAt(0) is char right after 'L''
            int i = 0;
            while(buffer.charAt(i) != ';')
                i++;
            char[] tab = new char[i];
            buffer.get(tab);
            buffer.get(); // read ';'
            
            String str = new String(tab);
            return str.replace('/', '.');
        }
        public Component getComponentAt(int x, int y) {
    	Enumeration<Component> e = _components.elements();
    	while (e.hasMoreElements()) {
    	    Component c = (Component) e.nextElement();
    	    if (c.contains(x, y)) {
    		if (c instanceof Container) {
    		    // Calculate the coordinates of the point relative
    		    // to the origin of the container
    		    Point origin = c.getLocation();
    		    return ((Container) c).getComponentAt(x-origin.x, y-origin.y);
    		}
    		else
    		    return c;
    	    }
    	}
    	return null;
        }
    }
}