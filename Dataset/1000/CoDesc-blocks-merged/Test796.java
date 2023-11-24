class Test {
    public class Example {
    public int hashCode() {
            if (hash == 0) {
                hash = elements.hashCode();
            }
            return hash;
        }
        @Override
        public void taskStopping() {
            SecWorkContextHandler.getInstance().dissociate();
            subjectManager.setCallerSubject(priorCallerSubject);
            subjectManager.setInvocationSubject(priorInvocationSubject);
        }
        public boolean isPassSafeFromAllOpponents(Vector2D from, Vector2D target, MatchPlayer parReceiver, double passingForce) {
        for (MatchPlayer p : opponents.getCurrentBlock()) {
          if (!isPassSafeFromOpponent(from, target, parReceiver, p, passingForce)) {
            return false;
          }
        }
        return true;
      }
    }
}