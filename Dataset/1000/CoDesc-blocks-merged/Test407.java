class Test {
    public class Example {
    public boolean logout(int iLogoutComputer){
    		boolean result=isPossibleUsername(pComputerPlayer[iLogoutComputer]);
    		if(result){
    			System.out.println(pComputerPlayer[iLogoutComputer]+" logged out.");
    		}
    		pComputerPlayer[iLogoutComputer]="";
    		chunk.markChanged(this);
    		return result;
    	}
        public boolean hasCorpus(String name) {
    		if (corpora == null)
    			return false;
    		for (MainCorpus c : corpora)
    			if (name.equals(c.getName()))
    				return true;
    		return false;
    	}
        public CurveInterpolationType getInterpolation() {
            if (interpolation == null) {
                return CurveInterpolationType.CUBIC_SPLINE;
            } else {
                return interpolation;
            }
        }
    }
}