class Test {
    public class Example {
    public Vector parse(final char[] chars, int offset, int length, char separator) {
    
            if (chars == null) {
                return new Vector();
            }
            Vector params = new Vector();
            this.chars = chars;
            this.pos = offset;
            this.len = length;
    
            String paramName = null;
            String paramValue = null;
            while (hasChar()) {
                paramName = parseToken(new char[] { '=', separator });
                paramValue = null;
                if (hasChar() && (chars[pos] == '=')) {
                    pos++; // skip '='
                    paramValue = parseQuotedToken(new char[] { separator });
                }
                if (hasChar() && (chars[pos] == separator)) {
                    pos++; // skip separator
                }
                if ((paramName != null) && (paramName.length() > 0)) {
                    params.addElement(new NameValuePair(paramName, paramValue));
                }
            }
            return params;
        }
        public void TuneToChannel(int ChannelNumber) {
            if (!this.siriusTunerData.SiriusPower) {
                return;
            }
    
            if (this.TestIfChannelValid(ChannelNumber)) {
                Command command = new cmdTuneToChannel(ChannelNumber);
                addToCommandQueue(command);
            }
        }
        public void emptyStore() {
            logger.debug("Empty store ");
            
            this.sessionMap = new HashMap <NegotiationResult, NegotiationOutcome> ();
            this.sessionList = new ArrayList<SessionID>();
        }
    }
}