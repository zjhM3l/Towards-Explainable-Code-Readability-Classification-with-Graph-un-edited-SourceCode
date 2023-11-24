class Test {
    public class Example {
    private long write(long offset, ByteBuffer inputBuf) throws IOException {
        int inputBufLength = inputBuf.limit() - inputBuf.position();
        MappedByteBuffer outputBuf =
            mLocalFileChannel.map(FileChannel.MapMode.READ_WRITE, offset, inputBufLength);
        outputBuf.put(inputBuf);
        int bytesWritten = outputBuf.limit();
        BufferUtils.cleanDirectBuffer(outputBuf);
        return bytesWritten;
      }
        private void handleClusterStatus(SolrQueryRequest req,SolrQueryResponse rsp) throws KeeperException, InterruptedException {
      Map<String,Object> props=new HashMap<>();
      props.put(Overseer.QUEUE_OPERATION,CollectionAction.CLUSTERSTATUS.toLower());
      copyIfNotNull(req.getParams(),props,COLLECTION_PROP,SHARD_ID_PROP,ShardParams._ROUTE_);
      handleResponse(CollectionAction.CLUSTERSTATUS.toString(),new ZkNodeProps(props),rsp);
    }
        public void delete(EnvioDocTrans entity) {
        				EntityManagerHelper.log("deleting EnvioDocTrans instance", Level.INFO, null);
    	        try {
            	entity = getEntityManager().getReference(EnvioDocTrans.class, entity.getCodEnviaDocTrans());
                getEntityManager().remove(entity);
                			EntityManagerHelper.log("delete successful", Level.INFO, null);
    	        } catch (RuntimeException re) {
            				EntityManagerHelper.log("delete failed", Level.SEVERE, re);
    	            throw re;
            }
        }
    }
}