class Test {
    public class Example {
    protected long getLastModifiedDate(String fileName) {
            File f = new File(getServletContext().getRealPath(fileName));
            if (f.exists()) {
                return f.lastModified();
            } else {
                return Long.MAX_VALUE;
            }
        }
        public Molecule computeMolecule() throws Exception {
        Molecule ret = new Molecule();
        Molecule subst_mol = substitutionMolecule();    
        computeMolecule(ret,root,subst_mol);
        computeMolecule(ret,bracket,subst_mol);
        return ret;
        }
        public void validateComplete(MetricFileReader reader){
      Assert.assertTrue(reader.hasNext());
      Assert.assertArrayEquals(new double[]{0.0,0.1,-0.1,1.0,-1.0,1E-5},reader.next(),Settings.EPS);
      Assert.assertTrue(reader.hasNext());
      Assert.assertArrayEquals(new double[]{0,10,100,1000,-10,-100},reader.next(),Settings.EPS);
      Assert.assertFalse(reader.hasNext());
      Assert.assertFalse(reader.hasNext());
    }
    }
}