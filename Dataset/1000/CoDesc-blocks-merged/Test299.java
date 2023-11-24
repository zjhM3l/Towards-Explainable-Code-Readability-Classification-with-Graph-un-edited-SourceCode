class Test {
    public class Example {
    public void Gen_populate(android.database.Cursor cursor,int[] columnIndices) {
            if ( columnIndices[GEN_ID__ID] >= 0 && ! cursor.isNull(columnIndices[GEN_ID__ID])) {
                gen__Id = cursor.getLong(columnIndices[GEN_ID__ID]);
            }
            if ( columnIndices[GEN_ID_SENTTEXT] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_SENTTEXT])) {
                gen_sentText = cursor.getString(columnIndices[GEN_ID_SENTTEXT]);
            }
        }
        @Override
        public final void close() {
            preDisconnectListeners.forEach(Runnable::run);
    
            flush();
    
            while (writing.get()) {
                Thread.onSpinWait();
            }
    
            Channeled.super.close();
    
            if (executor != null) {
                executor.shutdownNow();
            }
    
            while (channel.isOpen()) {
                Thread.onSpinWait();
            }
    
            if (server != null) {
                server.connectedClients.remove(this);
            }
            
            postDisconnectListeners.forEach(Runnable::run);
        }
        static void throwEnterDowntimeLogEntry ( Contact self ) {
      MonitoringLog brok = makeMonitoringLog ( "info" , "CONTACT DOWNTIME ALERT: " + self . getName ( ) + ";
    STARTED;
     " + "Contact has entered a period of scheduled downtime" ) ;
      self . getBroks ( ) . add ( brok ) ;
    }
    }
}