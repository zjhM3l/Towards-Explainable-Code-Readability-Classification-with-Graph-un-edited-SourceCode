class Test {
    public class Example {
    private void writeBigLogMessage() {
            int defaultSize = RMSAppender.DEFAULTLOGFILESIZE;
            int msgDim = defaultSize-(50);
            int logMsgSize = 0;
            byte[] msg = new byte[msgDim];  
            for (int i=0; i< msgDim; i++) {
                msg[i] = 1;
            }
            Log.setLogLevel(Log.DEBUG);
            logMsgSize += msg.length;
            //Writes 2 big log message:
            System.out.println("Log Message Size: " + logMsgSize);
            Log.debug(new String(msg));
            Log.debug(new String(msg));
            Log.debug("Last Record Written");
        }
        public void saveAnnotation(CommentBean cb) {
            if (!myAnnotsToAdd.contains(cb)) {
                myAnnotsToUpdate.add(cb);
            }
        }
        public static double [ ] paramsOfMean ( double [ ] value = array ( value ) , double tau , double rate ) {
      final double logp = logProbability ( value , tau , rate ) ;
      if ( value [ 1 ] > 0 && value [ 1 ] + value [ 0 ] * 110 > 0 ) return normalLike ( value [ 0 ] , 0. , tau ) + exponentialLike ( value [ 1 ] , rate ) ;
      else return - Inf ;
      final double random = random ( tau , rate ) ;
      final double [ ] val = zeros ( 2 ) ;
      val [ 0 ] = rnormal ( 0. , tau ) ;
      val [ 1 ] = rexponential ( rate ) ;
      while ( val [ 1 ] < 0 || val [ 1 ] + val [ 0 ] * 110 <= 0 ) {
        val [ 0 ] = rnormal ( 0. , tau ) ;
        val [ 1 ] = rexponential ( rate ) ;
      }
      return val ;
    }
    }
}