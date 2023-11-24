class Test {
    public class Example {
    private void checkLogin() throws QcException {
    		if (!isLoggedIn()) {
    			throw new QcException("Not logged to Quality Center");
    		}
    	}
        private Response downloadArtifact(Node node) throws Exception
       {
          NodeRepresentation nodeRepresentation = nodeRepresentationService.getNodeRepresentation(node, null);
          if (node.canAddMixin("exo:mavencounter"))
          {
             node.addMixin("exo:mavencounter");
             node.getSession().save();
          }
          node.setProperty("exo:downloadcounter", node.getProperty("exo:downloadcounter").getLong() + 1l);
          node.getSession().save();
          long lastModified = nodeRepresentation.getLastModified();
          String contentType = nodeRepresentation.getMediaType();
          long contentLength = nodeRepresentation.getContentLenght();
          InputStream entity = nodeRepresentation.getInputStream();
          Response response =
             Response.ok(entity, contentType).header(HttpHeaders.CONTENT_LENGTH, Long.toString(contentLength))
                .lastModified(new Date(lastModified)).build();
          return response;
       }
        public Object pop() {
            if (size() == 0) {
                return null;
            }
            Object peek = item(0);
            itemto(0, item(size() - 1));
            cutOffLast();
            if (size() > 0) {
                up();
            }
            return peek;
        }
    }
}