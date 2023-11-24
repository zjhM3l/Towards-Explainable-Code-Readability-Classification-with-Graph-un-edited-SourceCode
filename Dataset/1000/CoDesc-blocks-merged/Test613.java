class Test {
    public class Example {
    static public boolean isChar(int ucs4char) {
            // [2] Char ::= #x0009 | #x000A | #x000D
            //            | [#x0020-#xD7FF]
            //    ... surrogates excluded!
            //            | [#xE000-#xFFFD]
            //             | [#x10000-#x10ffff]
            return ((ucs4char >= 0x0020 && ucs4char <= 0xD7FF)
                    || ucs4char == 0x000A || ucs4char == 0x0009
                    || ucs4char == 0x000D
                    || (ucs4char >= 0xE000 && ucs4char <= 0xFFFD)
                    || (ucs4char >= 0x10000 && ucs4char <= 0x10ffff));
        }
        public boolean openConnectionNoDB() {
    		return openConnectionImpl(
    				"com.mysql.jdbc.Driver",
    				"jdbc:mysql://" + url + ":" + port,
    				"root",
    				"sa-account-password");
    	}
        public void receive(UndoableEdit undoableEdit) {
            Assert.isTrue(isReceiving());
    
            //Don't add the UndoableEdit to the UndoManager right away; the caller may
            //call #clearNewUndoableEdits. [Jon Aquino]
            newUndoableEdits.add(undoableEdit);
        }
    }
}