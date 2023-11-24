class Test {
    public class Example {
    public static String mmiToVrt ( MMII self , boolean forceFlag ) throws IOException {
      LOGGER . debug ( "mmiToVrt requested." ) ;
      String vrtPath = self . getOutputPath ( ) + self . getOutputBasename ( ) + ".vrt" ;
      if ( FileUtils . exists ( vrtPath ) && forceFlag != true ) {
        return vrtPath ;
      }
      String csvPath = mmiToDelimitedFile ( true ) ;
      String vrtString = ( "</OGRVRTDataSource>" + csvPath ) ;
      try ( OutputStreamWriter writer = new OutputStreamWriter ( new FileOutputStream ( vrtPath ) , "UTF-8" ) ) {
        writer . write ( vrtString ) ;
      }
      return vrtPath ;
    }
        public int getBinIndex(double value) {
            if (value == getMin()) {
                return 0;
            }
            if (value == getMax()) {
                return getNumBins() - 1;
            }
            final int binIndex = MathUtils.floorInt((value - getMin()) / (getMax() - getMin()) * getNumBins());
            if (binIndex >= 0 && binIndex < getNumBins()) {
                return binIndex;
            }
            return -1;
        }
        public static void convolve(Kernel2D_F64 kernel, InterleavedF64 src, InterleavedF64 dst ) {
    		InputSanityCheck.checkSameShapeB(src, dst);
    
    		boolean processed = BOverrideConvolveImageNormalized.invokeNativeConvolve(kernel,src,dst);
    		
    		if( !processed ) {
    			if( kernel.width >= src.width || kernel.width >= src.height ) {
    				ConvolveNormalizedNaive_IL.convolve(kernel,src,dst);
    			} else {
    				if( Math.abs(kernel.computeSum() - 1.0f) > 1e-4f ) {
    					Kernel2D_F64 k = kernel.copy();
    					KernelMath.normalizeSumToOne(k);
    					kernel = k;
    				}
    				ConvolveImageNoBorder.convolve(kernel,src,dst);
    				ConvolveNormalized_JustBorder_IL.convolve(kernel,src,dst);
    			}
    		}
    	}
    }
}