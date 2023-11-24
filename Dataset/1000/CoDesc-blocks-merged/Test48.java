class Test {
    public class Example {
    public Vector recursiveGetVarsInEquation(Node n,Vector v) throws ParseException {
    		if(n instanceof ASTVarNode) {
    			XVariable var = (XVariable) (((ASTVarNode) n).getVar());
    			if(!v.contains(var))
    			{
    				if(var.hasEquation())
    					recursiveGetVarsInEquation(var.getEquation(),v);
    				if(v.contains(var))
    					throw new ParseException("Recursive definition for "+var.getName());
    				v.add(var);
    			}
    		}
    		else if(n instanceof ASTFunNode) {
    			for(int i=0;i<n.jjtGetNumChildren();++i)
    				recursiveGetVarsInEquation(n.jjtGetChild(i),v);
    		}
    		return v;
    	}
        public synchronized void beginTransaction() throws TransactionInProgressException, TransactionAbortedException
        {
            if (isInTransaction())
            {
                throw new TransactionInProgressException("PersistenceBroker is already in transaction");
            }
            fireBrokerEvent(BEFORE_BEGIN_EVENT);
            setInTransaction(true);
            this.connectionManager.localBegin();
            fireBrokerEvent(AFTER_BEGIN_EVENT);
        }
        private String scanplain() throws RegexException {
            int startp = now;
            int endp;
    
            assert see(COLLEL) || see(ECLASS) || see(CCLASS);
            lex.next();
    
            endp = now;
            while (see(PLAIN)) {
                endp = now;
                lex.next();
            }
    
            String ret = new String(pattern, startp, endp - startp);
            assert see(END);
            lex.next();
    
            return ret;
        }
    }
}