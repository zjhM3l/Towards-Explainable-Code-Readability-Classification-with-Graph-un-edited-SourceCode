class Test {
    public class Example {
    public Throwable getThrowable() {
        Throwable t;
        if (cause != null) {
          t = new Throwable(message, cause.getThrowable());
        } else {
          t = new Throwable(message);
        }
        t.setStackTrace(stackTrace);
        return t;
      }
        public AdministratorAction(Type type,AbstractManagedObjectDefinition<?,?> d,String propertyName){
      this.type=type;
      this.definition=d;
      this.propertyName=propertyName;
    }
        public void first() {
            try {
                resultSetWrapper.first();
                resultSetWrapper.mapRecord(getModel());
            } catch (Exception e) {
                LOG.error(e,e);
            }
        }
    }
}