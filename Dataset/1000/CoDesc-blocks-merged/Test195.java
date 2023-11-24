class Test {
    public class Example {
    public static int rawUncompress(byte[] input, int inputOffset, int inputLength, Object output, int outputOffset)
                throws IOException
        {
            if (input == null || output == null) {
                throw new NullPointerException("input or output is null");
            }
            return impl.rawUncompress(input, inputOffset, inputLength, output, outputOffset);
        }
        private void rollDices(){
    		for(int i = 0; i<6; i++){
    			if (i < 3) sourceDices[i] = $r.nextInt(6) + 1;
    			if (i >= 3) destDices[i-3] = $r.nextInt(6) + 1;
    		}
    		sort(sourceDices);
    		sort(destDices);
    	}
        private void checkInfo(MarkerInfo info) throws CoreException {
    		if (info == null) {
    			throw new CoreException( new Status(IStatus.ERROR,AptanaCorePlugin.ID,IStatus.OK,"UniformResourceMarker Info is null",null));
    		}
    	}
    }
}