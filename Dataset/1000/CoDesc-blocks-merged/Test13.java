class Test {
    public class Example {
    public UserData findUserByUserID(String accountName) {
            UserData found = null;
            ArrayList<UserData> friends = this.getCurrentProfile().getAllFriends();
            for (UserData user : friends) {
                // Temp fix for switching conversations
                if (user.getUserID().equals(accountName)
                        || user.getNickname().equals(accountName)) {
                    found = user;
                    break;
                }
            }
            return found;
        }
        public GridTuple5(@Nullable V1 v1,@Nullable V2 v2,@Nullable V3 v3,@Nullable V4 v4,@Nullable V5 v5){
      this.v1=v1;
      this.v2=v2;
      this.v3=v3;
      this.v4=v4;
      this.v5=v5;
    }
        public final SSLEngine createSSLEngine() {
            try {
                return contextSpi.engineCreateSSLEngine();
            } catch (AbstractMethodError e) {
                UnsupportedOperationException unsup =
                    new UnsupportedOperationException(
                        "Provider: " + getProvider() +
                        " doesn't support this operation");
                unsup.initCause(e);
                throw unsup;
            }
        }
    }
}