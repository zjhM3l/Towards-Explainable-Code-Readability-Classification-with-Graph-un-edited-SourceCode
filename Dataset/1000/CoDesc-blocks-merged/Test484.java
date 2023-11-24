class Test {
    public class Example {
    public void addVirtualHost(String hostname)
        {
            // Note that null hosts are also added.
            if (!_vhosts.contains(hostname))
            {
                _vhosts.add(hostname);
                _contextName=null;
    
                if (_httpServer!=null)
                {
                    if (_vhosts.size()==1)
                        _httpServer.removeMapping(null,this);
                    _httpServer.addMapping(hostname,this);
                }
                _vhostsArray=null;
            }
        }
        public int playerIdAt(Pair position) {
            int square = field.getValue(position);
    
            if ((square < 1) || (square > Constants.MAX_PLAYERS)) {
                return -1;
            }
    
            return square;
        }
        private void computeSquaringMatrix(){
      GF2Polynomial[] d=new GF2Polynomial[mDegree - 1];
      int i, j;
      squaringMatrix=new GF2Polynomial[mDegree];
      for (i=0; i < squaringMatrix.length; i++) {
        squaringMatrix[i]=new GF2Polynomial(mDegree,"ZERO");
      }
      for (i=0; i < mDegree - 1; i++) {
        d[i]=new GF2Polynomial(1,"ONE").shiftLeft(mDegree + i).remainder(fieldPolynomial);
      }
      for (i=1; i <= Math.abs(mDegree >> 1); i++) {
        for (j=1; j <= mDegree; j++) {
          if (d[mDegree - (i << 1)].testBit(mDegree - j)) {
            squaringMatrix[j - 1].setBit(mDegree - i);
          }
        }
      }
      for (i=Math.abs(mDegree >> 1) + 1; i <= mDegree; i++) {
        squaringMatrix[(i << 1) - mDegree - 1].setBit(mDegree - i);
      }
    }
    }
}