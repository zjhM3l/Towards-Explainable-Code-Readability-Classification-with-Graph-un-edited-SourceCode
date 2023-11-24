class Test {
    public class Example {
    public static Object execute(ExecutablePool pool,LocalRegion region,Object key,Object callbackArg,boolean prSingleHopEnabled,EntryEventImpl clientEvent){
      ClientMetadataService cms=((GemFireCacheImpl)region.getCache()).getClientMetadataService();
      GetOpImpl op=new GetOpImpl(region,key,callbackArg,prSingleHopEnabled,clientEvent);
      if (logger.isDebugEnabled()) {
        logger.debug("GetOp invoked for key {}",key);
      }
      if (prSingleHopEnabled) {
        ServerLocation server=cms.getBucketServerLocation(region,Operation.GET,key,null,callbackArg);
        if (server != null) {
          try {
            PoolImpl poolImpl=(PoolImpl)pool;
            boolean onlyUseExistingCnx=((poolImpl.getMaxConnections() != -1 && poolImpl.getConnectionCount() >= poolImpl.getMaxConnections()) ? true : false);
            op.setAllowDuplicateMetadataRefresh(!onlyUseExistingCnx);
            return pool.executeOn(new ServerLocation(server.getHostName(),server.getPort()),op,true,onlyUseExistingCnx);
          }
     catch (      AllConnectionsInUseException e) {
          }
    catch (      ServerConnectivityException e) {
            if (e instanceof ServerOperationException) {
              throw e;
            }
            cms.removeBucketServerLocation(server);
          }
    catch (      CacheLoaderException e) {
            if (e.getCause() instanceof ServerConnectivityException)         cms.removeBucketServerLocation(server);
          }
        }
      }
      return pool.execute(op);
    }
        public void runInTransaction(StatementRunnable runnable, Object argument, int isolationLevel){
    
            Connection connection = this.beginTransaction(isolationLevel);
            connection.setRollbackOnException(false);
    
            try {
                runnable.run(connection, argument);
            } catch (Throwable throwable) {
                connection.rollback();
                throw new Sql2oException("An error occurred while executing StatementRunnable. Transaction is rolled back.", throwable);
            }
            connection.commit();
        }
        public MemberList<TMember> membersOfImplementedInterfaces(TClassifier classifier){
      Iterator<ParameterizedTypeRef> iter=classifier.getImplementedOrExtendedInterfaceRefs().iterator();
      if (!iter.hasNext()) {
        return MemberList.emptyList();
      }
      ParameterizedTypeRef first=iter.next();
      if (!iter.hasNext()) {
        if (first.getDeclaredType() instanceof TInterface) {
          TInterface tinterface=(TInterface)first.getDeclaredType();
          return members(tinterface);
        }
        return MemberList.emptyList();
      }
      MemberList<TMember> memberList=new MemberList<>();
      for (  ParameterizedTypeRef interfaceRef : classifier.getImplementedOrExtendedInterfaceRefs()) {
        if (interfaceRef.getDeclaredType() instanceof TInterface) {
          TInterface tinterface=(TInterface)interfaceRef.getDeclaredType();
          memberList.addAll(members(tinterface));
        }
      }
      return memberList;
    }
    }
}