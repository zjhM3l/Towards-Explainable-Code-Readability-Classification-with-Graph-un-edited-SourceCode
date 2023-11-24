class Test {
    public class Example {
    public void setLabelFont(String fontInfo) throws MonoiException {
    		labelFont = new FontInfo(fontInfo);
    		if (cLabel != null) {
    			cLabel.setFont(labelFont.toSWTFont());
    			cLabel.redraw();
    		}
    	}
        public void cancelAllTimelines() {
    		synchronized (LOCK) {
    			for (Timeline timeline : this.runningTimelines) {
    				TimelineState oldState = timeline.getState();
    				while (timeline.getState() != TimelineState.IDLE)
    					timeline.popState();
    				timeline.pushState(TimelineState.CANCELLED);
    				this.callbackCallTimelineStateChanged(timeline, oldState);
    				timeline.popState();
    				this.callbackCallTimelineStateChanged(timeline,
    						TimelineState.CANCELLED);
    			}
    			this.runningTimelines.clear();
    			this.runningScenarios.clear();
    			this.waitingTimelines.clear();
    			this.waitingTimelinesMap.clear();
    		}
    	}
        public void add(AbstractButton button) {
            buttonGroup.add(button);
            super.add(button);
            button.setSelected(true);
            resizeButtons();
        }
    }
}