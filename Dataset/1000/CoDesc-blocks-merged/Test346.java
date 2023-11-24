class Test {
    public class Example {
    protected void close() {
            try {
                isOk = false;
                if(reader != null)
                    reader.close();
                if(writer != null)
                    writer.close();
                if(socket != null)
                    socket.close();
            } catch (IOException e) {
                
            }
        }
        public void testSimpleAbsoluteToRelativeURLConversion() throws Exception {
            doTest(pipelineFactory,
                   "SimpleAbsoluteToRelativeURLTestCase.input.xml",
                   "SimpleAbsoluteToRelativeURLTestCase.expected.xml");
        }
        public void setStatusInfos(java.util.Collection<DBInstanceStatusInfo> statusInfos) {
            if (statusInfos == null) {
                this.statusInfos = null;
                return;
            }
    
            this.statusInfos = new com.amazonaws.internal.SdkInternalList<DBInstanceStatusInfo>(statusInfos);
        }
    }
}