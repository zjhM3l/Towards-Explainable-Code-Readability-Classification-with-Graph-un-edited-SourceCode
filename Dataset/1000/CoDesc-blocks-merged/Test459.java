class Test {
    public class Example {
    private static void findPlayers ( TeamPlayer self , String year ) {
      if ( year == null ) year = Utils . findYearForSeason ( "nhl" ) ;
      String url = self . createUrl ( year ) ;
      Page page = self . pullTeamPage ( url ) ;
      if ( page == null ) {
        String output = ( "Can't pull requested team page. Ensure the following " + "URL exists: " + url ) ;
        throw new IllegalArgumentException ( output ) ;
      }
      for ( String player : page ( "table#roster tbody tr" ) . getItems ( ) ) {
        String player_id = getId ( player ) ;
        if ( self . getSlim ( ) ) {
          String name = getName ( player ) ;
          self . getPlayers ( ) . put ( player_id , name ) ;
        }
        else {
          Player playerInstance = new Player ( player_id ) ;
          self . getPlayers ( ) . add ( playerInstance ) ;
        }
      }
    }
        public static List < String > listResourceGroups ( String accessToken , String subscriptionId ) {
      String endpoint = "" ;
      endpoint += getRMEndpoint ( ) + "/subscriptions/" + subscriptionId + "/resourceGroups/" + "?api-version=" + RESOURCE_API ;
      return doGet ( endpoint , accessToken ) ;
    }
        public void addAuthorativeAnswer(DNSRecord rec) throws IOException {
      MessageOutputStream record=new MessageOutputStream(512,this);
      record.writeRecord(rec,0);
      byte[] byteArray=record.toByteArray();
      record.close();
      if (byteArray.length < this.availableSpace()) {
        _authoritativeAnswers.add(rec);
        _authoritativeAnswersBytes.write(byteArray,0,byteArray.length);
      }
     else {
        throw new IOException("message full");
      }
    }
    }
}