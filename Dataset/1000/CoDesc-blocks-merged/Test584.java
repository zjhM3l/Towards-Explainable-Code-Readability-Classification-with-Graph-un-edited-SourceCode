class Test {
    public class Example {
    public void save(String data){
      LOGGER.info("Cache: Trying to save " + id + "..");
      try (BufferedWriter writer=Files.newBufferedWriter(file,CHARSET)){
        writer.write(new Long(System.currentTimeMillis() / 1000).toString() + "\n");
        writer.write(data);
        LOGGER.info("Cache: Saved " + id + ".");
      }
     catch (  IOException ex) {
        LOGGER.warning("Cache: Error saving " + id + " ["+ ex+ "]");
      }
    }
        public boolean getVerticalLinesExistence() {
            GraphProperties graphProps = XgChart2D.getGraphProperties(0);
    
            return graphProps.getGraphLabelsLinesExistence();
        }
        protected void printSessionAttributes(HttpServletRequest request) {
        if (true) {
          HttpSession session = request.getSession();
          Logger.debug(this, "--> session-parameter:");
    
          Enumeration enum_app = session.getAttributeNames();
    
          while (enum_app.hasMoreElements()) {
            String attribute = enum_app.nextElement().toString();
            Logger.debug(this, "   " + attribute + "\t\t:    " + session.getAttribute(attribute));
          }
    
          Logger.debug(this, "<--  session-parameter");
        }
      }
    }
}