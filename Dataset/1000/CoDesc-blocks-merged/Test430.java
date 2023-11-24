class Test {
    public class Example {
    public String marshall(ConstraintsParameters constraintsParams){
      StringWriter writer=new StringWriter();
      try {
        policyMarshaller.marshal(constraintsParams,new StreamResult(writer));
      }
     catch (  Exception e) {
        logger.error("Unable to parse JaxB object : " + e.getMessage(),e);
      }
      return writer.toString();
    }
        public static Polygon getBounds ( ChangeSet changeset ) {
      try {
        return new Polygon ( new double [ ] {
          ( double ) changeset . getMinLon ( ) , ( double ) changeset . getMinLat ( ) }, ( double ) changeset . getMaxLon ( ) , ( double ) changeset . getMinLat ( ) }, ( double ) changeset . getMaxLon ( ) , ( double ) changeset . getMaxLat ( ) ) ;
        }
        catch ( NullPointerException e ) {
          return null ;
        }
      }
        public String getClientID() throws JMSException {
            try { 
                return this.userName;
            }
            catch (Exception e) {
                throw new JMSException(e.getMessage());
            }
        }
    }
}