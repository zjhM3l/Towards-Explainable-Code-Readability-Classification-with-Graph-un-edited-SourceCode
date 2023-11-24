class Test {
    public class Example {
    public void deleteImageSharings() throws RcsServiceNotAvailableException, RcsGenericException {
      if (mApi == null) {
        throw new RcsServiceNotAvailableException();
      }
      try {
        mApi.deleteImageSharings();
      }
     catch (  Exception e) {
        throw new RcsGenericException(e);
      }
    }
        @Benchmark
    	@BenchmarkMode(Mode.Throughput)
    	public StackFrame stackWalkerWithLambda() {
    		return StackWalker.getInstance().walk(stream -> stream.skip(1).findFirst().get());
    	}
        protected void parse(String input) {
            System.out.println(input);
            rawMessage = input;
            ok = false;
            message = rawMessage;
            if (rawMessage != null) {
                ok = rawMessage.startsWith("OK");
                parseResult();
            }
        }
    }
}