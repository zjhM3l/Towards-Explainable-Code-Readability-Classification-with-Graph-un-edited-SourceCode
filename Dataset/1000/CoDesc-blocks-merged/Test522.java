class Test {
    public class Example {
    private void move(DelegateNode node) {
            if (node.isDelegated()) {
                return;
            }
            Dimension dim = node.accumulator();
            node.getGridPoint().translate(dim.width, dim.height);
        }
        public MathVector getCueStrokeVelocity() {
    		MathMatrix rotMatrixH = Mathematics.getRotationMatrix3D(Math.PI * cueAngleH / 180., cueRotAxisH);
    		MathMatrix rotMatrixV = Mathematics.getRotationMatrix3D(Math.PI * cueAngleV / 180., cueRotAxisV);
    		MathVector velocityVector = Mathematics.mul(Mathematics.getUnitVector(3, 1), cueVelocity);
    		velocityVector = Mathematics.mul(rotMatrixH, velocityVector);
    		velocityVector = Mathematics.mul(rotMatrixV, velocityVector);
    		return velocityVector;
    	}
        public static final RootRhnGisManager getInstance ( ) throws Exception {
      if ( isLoggedIn ) {
        return null ;
      }
      if ( instance == null ) {
        instance = new RootRhnGisManager ( ) ;
      }
      return instance ;
    }
    }
}