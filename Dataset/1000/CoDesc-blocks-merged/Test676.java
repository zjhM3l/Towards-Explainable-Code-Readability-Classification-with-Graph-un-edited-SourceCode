class Test {
    public class Example {
    public void before() {
            xListener = (XUIConfigurationListenerImpl)tEnv.getObjRelation(
                            "XUIConfiguration.XUIConfigurationListenerImpl");
            XUIConfigurationListener l;
        }
        private void fireReceivedStartedCompression(StartedCompression startedCompression) {
    		for (FcpListener fcpListener : fcpListeners) {
    			fcpListener.receivedStartedCompression(this, startedCompression);
    		}
    	}
        public void endTyping(String buddy) throws IOException {
            YmsgPacket yp = new YmsgPacket(version, 0, Event.NOTIFY, Status.TYPING.value);
            yp.addData(new YmsgData(4, username));
            yp.addData(new YmsgData(5, buddy));
            yp.addData(new YmsgData(14, " "));
            yp.addData(new YmsgData(13, "0"));
            yp.addData(new YmsgData(49, "TYPING"));
            connection.write(yp.toByteArray());
        }
    }
}