class Test {
    public class Example {
    public static String parse(String str, final CommandLineParser.CallbackHandler handler, ParsingState initialState) throws CommandFormatException {
            if(str == null) {
                return null;
            }
            final ParsingStateCallbackHandler callbackHandler = getCallbackHandler(handler);
            return StateParser.parse(str, callbackHandler, initialState);
        }
        public void nameColumns(String tableName, JdbcNameGenerator nameGen) {
            if (col.name == null) {
                col.name = nameGen.generateFieldColumnName(tableName, fmd.name, false);
            } else if (!nameGen.isColumnInTable(tableName, col.name)) {
                try {
                    nameGen.addColumnName(tableName, col.name);
                } catch (IllegalArgumentException e) {
                    throw BindingSupportImpl.getInstance().runtime(
                        "Invalid jdbc-column-name for field " + fmd.name + ": " +
                        e.getMessage() + "\n" + getContext());
                }
            }
        }
        public void displayMessage( Component component, Object aMessage, String aTitle, int type ) {
    		// The isDisplayingMessage flag is potentially useful for focusLost event handlers
    		// which may want to ignore events caused by error messages, for example.
    		synchronized( this ) {
    			if (isDisplayingMessage) {
    				return;
    			}
    			isDisplayingMessage = true;
    			JOptionPane.showMessageDialog(component, aMessage, aTitle, type );
    			isDisplayingMessage = false;
    		}
    	}
    }
}