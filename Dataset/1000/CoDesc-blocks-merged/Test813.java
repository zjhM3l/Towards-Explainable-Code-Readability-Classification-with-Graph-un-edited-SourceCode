class Test {
    public class Example {
    public String getWebInterfaceId() {
    		if (_webInterface != null) {
    			return _webInterface.getId();
    		}
    		return _webOptions.getWebInterfaceId();
    	}
        private void moveToNextLine(final boolean valueContinuation) {
            mContent.append(CodeGenUtil.CRLF);
            mLinesCount++;
            mEndColumn = mStartColumn + INDENT_SLOPE;
            if (valueContinuation) {
                mContent.append(fillString(' ', SEQ_NUM_AREA_LEN));
                mContent.append('-');
                mContent.append(fillString(' ', mEndColumn - SEQ_NUM_AREA_LEN - 1));
            } else {
                mContent.append(fillString(' ', mEndColumn));
            }
            needSpaceSeparator = false;
        }
        public int getFieldExprIndex(final String _expr)
        {
            int ret = -1;
            if (getAllFieldExpr().containsKey(_expr)) {
                final Integer ident = getAllFieldExpr().get(_expr);
                ret = ident.intValue();
            }
            return ret;
        }
    }
}