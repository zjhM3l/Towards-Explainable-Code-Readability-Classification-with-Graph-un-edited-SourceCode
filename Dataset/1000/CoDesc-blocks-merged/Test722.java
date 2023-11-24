class Test {
    public class Example {
    public String getAnnouncement(String sessionId, int index) throws Exception {
    		if(!loggedUsers.containsKey(sessionId))
    			throw new InvalidSessionException();
    		
    		if(index < 0 || index >= getNumberOfAnnouncements(sessionId))
    			throw new InvalidIndexException();
    		
    		return loggedUsers.get(sessionId).getAnnouncement(index);
    	}
        private void handleApproach(final MobApproach chosen) {
    		switch (chosen) {
    		case TALK:
    			TalkEvent talk = 
    				(TalkEvent) Diceroller.getRandomObject(
    						approaches.get(chosen));
    			childEvent = talk;
    			Flow.addEventToBeginning(childEvent);
    			talk.fire();
    			break;
    		case EVADE:
    			EvadeEvent evade = 
    				(EvadeEvent) Diceroller.getRandomObject(
    						approaches.get(chosen));
    			childEvent = evade;
    			evade.fire();
    			break;
    		case FIGHT:
    			AttackEvent attack = 
    				(AttackEvent) Diceroller.getRandomObject(
    						approaches.get(chosen));
    			childEvent = attack;
    			BPController.showCombat(mobs, attack, attack.isDuel());
    			break;
    		default: break;
    		}
    	}
        protected void mouseReleased(int mButton) {
            // Return events for this widget
            if (listener != null && hasMouseOver())
                listener.mouseReleased(mButton);
    
            // Cycle the child widget list and send the mouseReleased event
            for (int i = 0; i < widgetList.size(); i++) {
                Widget widget = (Widget) widgetList.elementAt(i);
                widget.mouseReleased(mButton);
            }
        }
    }
}