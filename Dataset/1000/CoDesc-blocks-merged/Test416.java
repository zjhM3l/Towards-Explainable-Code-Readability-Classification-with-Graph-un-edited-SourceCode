class Test {
    public class Example {
    public static String transform ( Transform self , Map < Parameter , Map < String , Double >> maps ) {
      Map < String , Double > out = new HashMap < String , Double > ( ) ;
      out . put ( Parameters . mass1 , Conversions . mass1FromMChirpEta ( maps . get ( Parameters . mchirp ) , maps . get ( Parameters . eta ) ) ) ;
      out . put ( Parameters . mass2 , Conversions . mass2FromMChirpEta ( maps . get ( Parameters . mchirp ) , maps . get ( Parameters . eta ) ) ) ;
      return self . formatOutput ( maps , out ) ;
    }
        public void buildFergusonPatch(ParametricCurve curve) {
            this.contourCurve = curve;
            approximationSteps = INITIAL_APPROXIMATION_STEPS;
            this.type = FERGUSON;
            calculateMatrices();
        }
        public void setFK(boolean fk) {
    		this.isFK = fk;
    		if (getObjAtr().equals("REF")) {
    			getDomain().getField().setFK(fk);
    		}
    	}
    }
}