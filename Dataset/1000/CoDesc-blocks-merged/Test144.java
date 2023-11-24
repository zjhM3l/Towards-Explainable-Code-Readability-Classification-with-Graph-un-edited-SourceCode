class Test {
    public class Example {
    public static boolean allDone(Collection<Future> futures) {
            for (Future f : futures) {
                if (!f.isDone()) {
                    return false;
                }
            }
            return true;
        }
        public static String hashSecretToString(byte[] secret){
      try {
        MessageDigest md=MessageDigest.getInstance("SHA-256");
        md.update(secret);
        byte[] digest=md.digest();
        RIPEMD160Digest dig=new RIPEMD160Digest();
        dig.update(digest,0,digest.length);
        byte[] out=new byte[20];
        dig.doFinal(out,0);
        return Tools.byteToString(out);
      }
     catch (  NoSuchAlgorithmException e) {
        throw new RuntimeException(e);
      }
    }
        private String padString(String str, int length){
            /** a String constant that holds 150 spaces for appending. */
            final String SPACES =
                    "                                                                                                                                                      "; //150spaces
            String strPadded = str + SPACES;
            strPadded = strPadded.substring(0, length);
            return strPadded;
        }
    }
}