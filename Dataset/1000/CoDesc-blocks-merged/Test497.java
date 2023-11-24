class Test {
    public class Example {
    private void check(X509Certificate[] chain) throws CertificateException {
    	if (principals != null &&
    	    !principals.contains(chain[0].getSubjectX500Principal()))
    	{
    	    throw new CertificateException("Remote principal is not trusted");
    	}
        }
        public void reset() {
    //    if (totalMoves != 0) {
    //      System.out.println("Overhead Per Move = " + (totalOverheadTime/(double)totalMoves) + "ms");
    //    }
        matches.clear();
       // overheadTime = 0;
       // totalMoves = 0;
      }
        public double crossLength(Geo b) {
            double x = this.y() * b.z() - this.z() * b.y();
            double y = this.z() * b.x() - this.x() * b.z();
            double z = this.x() * b.y() - this.y() * b.x();
            return Math.sqrt(x * x + y * y + z * z);
        }
    }
}