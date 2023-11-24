class Test {
    public class Example {
    public void deleteUserData(String user, String domain) {
            String path=parent.getProperty("webmail.data.path")+System.getProperty("file.separator")+
                domain+System.getProperty("file.separator")+user+".xml";
            File f=new File(path);
            if(!f.canWrite() || !f.delete()) {
                log.error("SimpleStorage: Could not delete user "+user+" ("+path+")!");
            } else {
                log.info("SimpleStorage: Deleted user "+user+"!");
            }
            user_cache.remove(user+user_domain_separator+domain);
        }
        @Override public boolean equals(Object o){
      if (this == o) {
        return true;
      }
      if (o == null || this.getClass() != o.getClass()) {
        return false;
      }
      Fact other=(Fact)o;
      if (this.triple == null) {
        if (other.triple == null) {
          return this.getDerivation().equals(other.getDerivation());
        }
     else {
          return false;
        }
      }
     else {
        return this.triple.equals(other.triple);
      }
    }
        public InvocationHandler setInvocationHandler(InvocationHandler handler) {
            InvocationHandler old = delegate;
            delegate = handler;
            return old;
        }
    }
}