class Test {
    public class Example {
    public static int compareNull(boolean aNull,int sortType){
      if ((sortType & NULLS_FIRST) != 0) {
        return aNull ? -1 : 1;
      }
     else   if ((sortType & NULLS_LAST) != 0) {
        return aNull ? 1 : -1;
      }
     else {
        int comp=aNull ? DEFAULT_NULL_SORT : -DEFAULT_NULL_SORT;
        return (sortType & DESCENDING) == 0 ? comp : -comp;
      }
    }
        private boolean tryGoto(final int id) {
    			final Integer label = labels.get(id);
    			if (label == null) {
    				labels.put(id, code.getCursor());
    				return false;
    			} else {
    				code.writeInstruction(Bytecode.GOTO, label);
    				return true;
    			}
    		}
        protected <T extends OperationResponse>void completeOperation(ServerStateMachine.Result result,OperationResponse.Builder<?,T> builder,Throwable error,CompletableFuture<T> future){
      if (isOpen()) {
        if (result != null) {
          builder.withIndex(result.index);
          builder.withEventIndex(result.eventIndex);
          if (result.result instanceof Exception) {
            error=(Exception)result.result;
          }
        }
        if (error == null) {
          future.complete(logResponse(builder.withStatus(Response.Status.OK).withResult(result.result).build()));
        }
     else     if (error instanceof CompletionException && error.getCause() instanceof CopycatException) {
          future.complete(logResponse(builder.withStatus(Response.Status.ERROR).withError(((CopycatException)error.getCause()).getType()).build()));
        }
     else     if (error instanceof CopycatException) {
          future.complete(logResponse(builder.withStatus(Response.Status.ERROR).withError(((CopycatException)error).getType()).build()));
        }
     else {
          future.complete(logResponse(builder.withStatus(Response.Status.ERROR).withError(CopycatError.Type.INTERNAL_ERROR).build()));
        }
      }
    }
    }
}