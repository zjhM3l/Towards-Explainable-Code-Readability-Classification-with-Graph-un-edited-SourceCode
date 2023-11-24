class Test {
    public class Example {
    public FileInfo getFileInfo(URI path) throws IOException {
        logger.atFine().log("getFileInfo(%s)", path);
        checkArgument(path != null, "path must not be null");
        // Validate the given path. true == allow empty object name.
        // One should be able to get info about top level directory (== bucket),
        // therefore we allow object name to be empty.
        StorageResourceId resourceId = pathCodec.validatePathAndGetId(path, true);
        FileInfo fileInfo =
            FileInfo.fromItemInfo(
                pathCodec,
                getFileInfoInternal(resourceId, gcs.getOptions().isInferImplicitDirectoriesEnabled()));
        logger.atFine().log("getFileInfo: %s", fileInfo);
        return fileInfo;
      }
        public int getNumOfObs() {
    		if (VectVar != null && VectVar.length > 0) {
    			return VectVar[0].Size();
    		} else {
    			return -1;
    		}
    	}
        public static String getFaxResult ( PopbillConnection self , String CorpNum , String ReceiptNum , String UserID ) throws PopbillException {
      if ( ReceiptNum == null || ReceiptNum . length ( ) != 18 ) {
        throw new PopbillException ( - 99999999 , "접수번호가 올바르지 않습니다." ) ;
      }
      return self . httpget ( "/FAX/" + ReceiptNum , CorpNum , UserID ) ;
    }
    }
}