class Test {
    public class Example {
    public static double log10(final double x) {
            final double hiPrec[] = new double[2];
    
            final double lores = log(x, hiPrec);
            if (Double.isInfinite(lores)){ // don't allow this to be converted to NaN
                return lores;
            }
    
            final double tmp = hiPrec[0] * HEX_40000000;
            final double lna = hiPrec[0] + tmp - tmp;
            final double lnb = hiPrec[0] - lna + hiPrec[1];
    
            final double rln10a = 0.4342944622039795;
            final double rln10b = 1.9699272335463627E-8;
    
            return rln10b * lnb + rln10b * lna + rln10a * lnb + rln10a * lna;
        }
        public static BigDecimal multiply(final BigDecimal x,double factor){
      BigDecimal multiplicand=new BigDecimal(factor,MathContext.DECIMAL64);
      BigDecimal multiplicationResult=x.multiply(multiplicand);
      return multiplicationResult;
    }
        public void flip(){
    		flipped = !flipped;
    		if(flipped){
    			current = imageType.getImage();
    		} else {
    			current = backOfCard;
    		}
    		repaint();
    	}
    }
}