class Test {
    public class Example {
    public static XPacket makeResetPacket ( int ID , int param ) {
      if ( param != 0x01 && param != 0x02 && param != 0xff ) {
        throw new RuntimeException ( "Packet.makeResetPacket invalide parameter {
    }" , param ) ;
      }
      XPacket pkt = makePacket ( ID , xl320 . XL320_RESET , null , new byte [ 1 ] ) ;
      return pkt ;
    }
        public Object getAdapter(Class adapter) {
    		if (adapter.isAssignableFrom(Project.class))
    			return parsedProject;
    		if (adapter.isAssignableFrom(ProjectEditor.class))
    			return rootEditor;
    		return projectFile.getAdapter(adapter);
    	}
        public void analyseMessageStanza( XmppMessageStanza message ) {
    		ImMessage newMessage = null;
    		
    		// chat message
    		if( message.getType() != null && message.getType().equals( XmppMessageStanza.TYPE_CHAT )
    				&& message.getFrom() != null && message.isBodyAvailable() )  {
    			
    			
    			newMessage = new ImMessage( message.getDefaultChildSubject(), message.getDefaultChildBody() );
    			
    			for( int i = 0; i < this.stanzaListeners.size(); i++ )
    				this.stanzaListeners.get( i ).messageArrived( 
    						XmppProtocol.stripResourceFromUserId( message.getFrom() ), newMessage );
    		}
    	}
    }
}