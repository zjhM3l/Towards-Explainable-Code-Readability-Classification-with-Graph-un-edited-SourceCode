class Test {
    public class Example {
    private Client createClient(Env env, String depotPath) throws Exception {
        String hackystatSensorClientName = "hackystat-sensor-" + (new Date()).getTime();
        Client client = new Client(env, hackystatSensorClientName);
        client.setRoot(System.getProperty("user.home") + "/perforcesensorsketch");
        client.addView(depotPath, "//" + hackystatSensorClientName + "/...");
        client.commit();
        return client;
      }
        @Override
      public void sendRedirect(final String location)
          throws IOException {
        try {
          LOG.debug("redirecting to: {}", location);
          final InputStream is = externalResourceLocator.locate(location);
          IOUtils.copy(is, servletOutputStream);
          is.close();
          servletOutputStream.close();
        } catch (final IOException e) {
          LOG.warn("{}: Invalid response for location: {}", e.getClass().getName(), location);
          throw e;
        }
      }
        public static void encode(Object object,Writer writer,Option... options){
      try (JsonGenerator generator=javax.json.Json.createGenerator(writer)){
        generator.writeStartObject();
        encode("data",object,generator,options.length == 0 ? noneOf(Option.class) : copyOf(asList(options)));
        generator.writeEnd();
      }
     }
    }
}