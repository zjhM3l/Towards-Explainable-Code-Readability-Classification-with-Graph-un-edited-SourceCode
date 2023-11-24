class Test {
    public class Example {
    public static byte[] yaml2byte(byte[] yamlstr) {
            Parser parser = Parser.newParser();
            parser.str(Pointer.create(yamlstr, 0), null);
            parser.handler(new BytecodeNodeHandler());
            parser.errorHandler(null);
            parser.implicitTyping(true);
            parser.taguriExpansion(true);
            Bytestring sav = (Bytestring)parser.parse();
            if(null == sav) {
                return null;
            } else {
                byte[] ret = new byte[Bytestring.strlen(sav.buffer) + 2];
                ret[0] = 'D';
                ret[1] = '\n';
                System.arraycopy(sav.buffer, 0, ret, 2, ret.length-2);
                return ret;
            }
        }
        public void setAmp(final int amp) {
            this.groupAmp = amp;
    
            if (amp == 0) {
                return;
            }
    
            final Integer amplitude = amp;
    
            for (JaxoObject ob : getObjectList()) {
                JaxoObjectUtils.setParameter(ob, "amp", Integer.TYPE, amplitude, false);
            }
        }
        public void setRotation(Quaternion rotation){
    	  this.rotation = rotation;
    	  accumulatedWeightAbsolute = 1.0f;
    	  accumulatedWeight = 1.0f ;
    	}
    }
}