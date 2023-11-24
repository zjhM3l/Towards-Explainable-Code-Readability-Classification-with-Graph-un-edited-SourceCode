class Test {
    public class Example {
    public static <T>T runRenderAction(@NotNull Callable<T> callable) throws Exception {
      try {
        if (ourTimeoutExceptionCounter.get() > 3) {
          ourRenderingExecutor.submit(null).get(50,TimeUnit.MILLISECONDS);
        }
        T result=ourRenderingExecutor.submit(callable).get(DEFAULT_RENDER_THREAD_TIMEOUT_MS,TimeUnit.MILLISECONDS);
        ourTimeoutExceptionCounter.set(0);
        return result;
      }
     catch (  TimeoutException e) {
        ourTimeoutExceptionCounter.incrementAndGet();
        Thread renderingThread=ourRenderingThread.get();
        TimeoutException timeoutException=new TimeoutException("Preview timed out while rendering the layout.\n" + "This typically happens when there is an infinite loop or unbounded recursion in one of the custom views.");
        if (renderingThread != null) {
          timeoutException.setStackTrace(renderingThread.getStackTrace());
        }
        throw timeoutException;
      }
    }
        public static ExpiryPolicy<Object, Object> timeToLiveExpiration(Duration timeToLive) {
        Objects.requireNonNull(timeToLive, "TTL duration cannot be null");
        if (timeToLive.isNegative()) {
          throw new IllegalArgumentException("TTL duration cannot be negative");
        }
        return new TimeToLiveExpiryPolicy(timeToLive);
      }
        public void setSaltGenerator(final SaltGenerator saltGenerator) {
            if (this.encryptorSet) {
                throw new EncryptionInitializationException(
                        "An encryptor has been already set: no " +
                        "further configuration possible on hibernate wrapper");
            }
            final StandardPBEBigIntegerEncryptor standardPBEBigIntegerEncryptor =
                (StandardPBEBigIntegerEncryptor) this.encryptor;
            standardPBEBigIntegerEncryptor.setSaltGenerator(saltGenerator);
        }
    }
}