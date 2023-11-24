class Test {
    public class Example {
    private JRadioButton getJrbtQuincenalCamion() {
    		if (jrbtQuincenalCamion == null) {
    			jrbtQuincenalCamion = new JRadioButton();
    			jrbtQuincenalCamion.setBounds(new Rectangle(717, 257, 88, 20));
    			jrbtQuincenalCamion.setText("Quincenal");
    			jrbtQuincenalCamion.setEnabled(false);
    		}
    		return jrbtQuincenalCamion;
    	}
        public static void listUsersInAccount ( final String accountId , final String searchTerm ) {
      final Map < String , Object > path = new HashMap < String , Object > ( ) ;
      final Map < String , Object > data = new HashMap < String , Object > ( ) ;
      final Map < String , Object > params = new HashMap < String , Object > ( ) ;
      path . put ( "accountId" , accountId ) ;
      if ( searchTerm != null ) {
        params . put ( "searchTerm" , searchTerm ) ;
      }
      logger . debug ( "GET /api/v1/accounts/{
    accountId}
    /users with query params: {
    params}
     and form data: {
    data}" , params , data , path ) ;
            genericRequest ( "GET" , "/api/v1/accounts/{
    accountId}
    /users" , data , params , allPages ) ;
            }
        public void setMass(float mass){
            this.mass=mass;
            constructionInfo.mass=mass;
            rebuildRigidBody();
        }
    }
}