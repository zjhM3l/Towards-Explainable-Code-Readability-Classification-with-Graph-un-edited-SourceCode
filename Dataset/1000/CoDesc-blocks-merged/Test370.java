class Test {
    public class Example {
    private int findValuableTrump(CardList cards, Suit trump) {
    		// should be improved: consider, which other trumps have already been played
    		if (cards.size() < 1)
    			return 0;
    		int highCard = 0;
    		int index = 0;
    		while (++index < cards.size()) {
    			// if(cards.get(index).isTrump(GameType.SUIT, trump) &&
    			// cards.get(index).getPoints() > cards.get(highCard).getPoints()) {
    			// highCard = index;
    			// log.debug("     highest card set to "+index);
    			// }
    		}
    		return (highCard < cards.size() ? highCard : 0);
    	}
        public boolean addEdit(UndoableEdit anEdit) {
            if (anEdit == this) {
                    end();
                return true;
            } else if (isInProgress() && (anEdit instanceof CompositeEdit)) {
                return true;
            } else {
                return super.addEdit(anEdit);
            }
        }
        public void writeString(String v) {
    		print(STRING_START);
    		for (int i = 0; i < v.length(); i++) {
    			char ch = v.charAt(i);
    			switch (ch) {
    			case LT:
    				append(LT_ESCAPE_ARRAY);
    				break;
    			case GT:
    				append(GT_ESCAPE_ARRAY);
    				break;
    			case AMP:
    				append(AMP_ESCAPE_ARRAY);
    				break;
    			case QUOT:
    				append(QUOT_ESCAPE_ARRAY);
    				break;
    			case APOS:
    				append(APOS_ESCAPE_ARRAY);
    				break;
    			default:
    				print(ch);
    			}
    
    		}
    		print(STRING_END);
    	}
    }
}