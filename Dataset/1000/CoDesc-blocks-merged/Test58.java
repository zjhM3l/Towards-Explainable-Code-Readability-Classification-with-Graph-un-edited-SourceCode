class Test {
    public class Example {
    public void testCursorChangeUpdateList() throws SQLException {
            
            // Update will fail
            cursorChange(
                    "42X31",
                    "select I, C from t for update",
                    "update t set i=i+19, c='OLD' || cast(i as CHAR(20)) where current of ",
                    "select I, C from t for update of I"
                    );
            
            // Delete will succeed.
            cursorChange(
                    null,
                    "select I, C from t for update",
                    "DELETE FROM t WHERE CURRENT OF ",
                    "select I, C from t for update of I"
                    );
    	}
        public void setSummaryIntervals(FromUntilPair[] newpairs) {
            super.setSummaryIntervals(newpairs);
            dirty = true;
    
            if(writeatonce) {
                saveConfiguration();
            }
        }
        public synchronized int writeToStream(OutputStream out) throws InterruptedException, IOException {
      while (mSize == 0 && !mClosed) {
        wait(TIMEOUT);
      }
      if (mSize == 0 && mClosed) {
        return -1;
      }
     else {
        final boolean wasFull=mSize == mBuf.length;
        final int copied=Math.min(mSize,mBuf.length - mStart);
        out.write(mBuf,mStart,copied);
        mStart+=copied;
        mSize-=copied;
        if (mStart == mBuf.length) {
          mStart=0;
        }
        if (wasFull) {
          notifyAll();
        }
        assert globalIntegrity();
        if (copied / 1000 < mReadHist.length - 1) {
          mReadHist[copied / 1000]++;
        }
     else {
          mReadHist[mReadHist.length - 1]++;
        }
        return copied;
      }
    }
    }
}