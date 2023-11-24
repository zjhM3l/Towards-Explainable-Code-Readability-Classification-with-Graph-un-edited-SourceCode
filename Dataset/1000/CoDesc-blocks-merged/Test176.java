class Test {
    public class Example {
    @Override
    
        public int read() throws IOException {
            int b = in.read();
            if (b != -1) {
                hasher.put((byte) b);
            }
            return b;
        }
        public ListIPSetsResult withIpSetIds(String... ipSetIds) {
            if (this.ipSetIds == null) {
                setIpSetIds(new java.util.ArrayList<String>(ipSetIds.length));
            }
            for (String ele : ipSetIds) {
                this.ipSetIds.add(ele);
            }
            return this;
        }
        public LogRecord getLastestLogRecord() throws ChaiDBException {
            int[] endOffset = new int[1];
            Lsn lsn = getLastLsnInDir(endOffset);
            LogRecord logObj = getLogRecordByLsn(lsn);
    
            return logObj;
        }
    }
}