class Test {
    public class Example {
    public static Trie fromString(String str) {
    		String[] components = str.split("/");
    		Trie r = ROOT;
    		for(int i=0;i!=components.length;++i) {
    			r = r.append(components[i]);
    		}
    		return r;
    	}
        public void add(int index, Object value) throws UnsupportedOperationException,IllegalArgumentException {
            if (value == null) {
                list.add(index,(short)0);
            } else if (value instanceof Number) {
                list.add(index,((Short)value).shortValue());
            } else {
                throw new UnsupportedOperationException("Data type not supported. [" + value.getClass().getName());
            }
        }
        public void caseAAssertStatement(AAssertStatement node) {
            inAAssertStatement(node);
    
            node.getBoolExpression().apply(this);
            //Top of stack should be boolean.
            KType tos = (KType) _typeStack.pop();
            if (!Util.isAssignmentCompatible(tos,KBasicType.getBoolean())) {
                int[] pos = Util.getFirstIdent(node.getBoolExpression());
                SourceCodeException.throwIncompatibleTypes_AssertBoolean(pos[0],
                        pos[1], pos[2], tos);
            }
    
            if (node.getColonString() != null) {
                node.getColonString().apply(this);
            }
    
            outAAssertStatement(node);
        }
    }
}