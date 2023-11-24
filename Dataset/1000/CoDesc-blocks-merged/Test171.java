class Test {
    public class Example {
    public Term copyForProof(AxiomSource ignored, Scope scope) {
            return new Comparison(
                    operator,
                    (ComparisonTerm) term0.copyForProof(null, scope),
                    (ComparisonTerm) term1.copyForProof(null, scope));
        }
        protected void okPressed() {
        	displaying = false;
            // save settings if they shall be saved
            if (chkSave==null || chkSave.isSelected()) {
                saveConfigItems(pnDialog);
            }
            // always save the "ask to save"-setting
            if (chkSave!=null) {
                chkSave.saveOption();
            }
        }
        private Character findMismatches(String s) {
        Deque<Character> state = new ArrayDeque<Character>();
        for (Character c : s.toCharArray()) {
          if (NESTING_OPENINGS.contains(c)) {
            state.push(NESTING_PAIRS.get(c));
          } else if (NESTING_CLOSINGS.contains(c)) {
            if (state.isEmpty() || !state.peek().equals(c)) {
              return c;
            }
            state.pop();
          }
        }
        if (!state.isEmpty()) {
          return state.pop();
        }
    
        return null;
      }
    }
}