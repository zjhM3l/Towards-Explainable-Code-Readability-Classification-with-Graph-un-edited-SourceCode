class Test {
    public class Example {
    public void set(AsciiString name, String value){
            if(name==null)
                return;
            if(value==null){
                remove(name);
                return;
            }
            Header head = entry(name, true);
            if(head.value==null)
                head.value = value;
            else{
                head.value = value;
                Header next = head.sameNext;
                head.sameNext = null;
                head.samePrev = head;
                removeSameNext(next);
            }
            assert validateLinks();
        }
        public static double regularizedIncBeta(double x,double alpha,double beta){
      if (alpha <= 0.0 || beta <= 0.0 || Double.isNaN(alpha) || Double.isNaN(beta) || Double.isNaN(x)) {
        return Double.NaN;
      }
      if (x <= 0.0) {
        return 0.0;
      }
      if (x >= 1.0) {
        return 1.0;
      }
      if (alpha > SWITCH && beta > SWITCH) {
        return regularizedIncBetaQuadrature(alpha,beta,x);
      }
      double bt=Math.exp(-logBeta(alpha,beta) + alpha * Math.log(x) + beta * Math.log1p(-x));
      if (x < (alpha + 1.0) / (alpha + beta + 2.0)) {
        return bt * regularizedIncBetaCF(alpha,beta,x) / alpha;
      }
     else {
        return 1.0 - bt * regularizedIncBetaCF(beta,alpha,1.0 - x) / beta;
      }
    }
        @Override
        public Set<T> next() {
            Set<T> subset = new LinkedHashSet<>();
            next(subset);
            return subset;
        }
    }
}