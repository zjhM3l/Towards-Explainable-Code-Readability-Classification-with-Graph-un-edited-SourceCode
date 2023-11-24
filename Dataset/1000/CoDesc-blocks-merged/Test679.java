class Test {
    public class Example {
    public void rotateLeft() {
    		if (--rotation < 0) {
    			rotation = PieceDefinition.TYPES_PER_PIECE - 1;
    		}
    	}
        public static final void setServerName(String name)
        {
            if (tc.isDebugEnabled())
                Tr.debug(tc, "setServerName", name);
    
            // Store the server name.
            serverName = name;
        }
        public void printStackTrace(PrintStream ps) {
            synchronized (ps) {
                super.printStackTrace(ps);
                if (cause != null) {
                    ps.println("--- Nested Exception ---");
                    cause.printStackTrace(ps);
                }
            }
        }
    }
}