class Test {
    public class Example {
    public static String getUUID() {
            UUID id = UUID.randomUUID();
            ByteBuffer bb = ByteBuffer.wrap(new byte[16]);
            bb.putLong(id.getMostSignificantBits());
            bb.putLong(id.getLeastSignificantBits());
            return Base64.encodeBase64URLSafeString(bb.array());
        }
        public JPanel editeTesStats(String telNom){
    			PanoRecup = new JPanel();
    			PanoRecup=super.editeTesStats();
    			//UnNonJoueur leNPC=new UnNonJoueur(telNom);
    				return PanoRecup;
    	}//editeToi
        public List<SootMethod> resolveAbstractDispatch(List<SootClass> classes,SootMethod m){
      m.getDeclaringClass().checkLevel(SootClass.HIERARCHY);
      Set<SootMethod> s=new ArraySet<SootMethod>();
      for (  SootClass sootClass : classes) {
        s.addAll(resolveAbstractDispatch(sootClass,m));
      }
      return Collections.unmodifiableList(new ArrayList<SootMethod>(s));
    }
    }
}