class Test {
    public class Example {
    private void shareProtect(boolean state) {
    
            String[] disabled = SharingSettings.getDefaultDisabledExtensions();
            
            Set<String> totalDisabled = new HashSet<String>();
                    
            for( String item : disabled ) {
                totalDisabled.add(item);
            }
            
            for ( CheckBoxList<String> panel : this.panels.values() ) {
                panel.setItemsEnabled(totalDisabled, state);
            }
    
            this.refreshSidePanel();
        }
        public void unprorate(int hoursPerDay, int percent) {
            if (duration == 0) {
                return;
            }
    
            if (percent == 0) {
                duration = 0;
            } else if (percent != 100) {
                if (durationType == HOUR) {
                    duration = (100 * duration) / percent;
                } else if (durationType == DAY) {
                    duration = (100 * hoursPerDay * duration) / percent;
                    durationType = HOUR;
                } else if (durationType == HALFDAY) {
                    duration = (200 * hoursPerDay * duration) / percent;
                    durationType = HOUR;
                }
            }
    
            if (duration == 0) {
                duration = 1;
            }
    
            normalize(hoursPerDay);
        }
        public void select(List<GlyphI> glyphs) {
    		if (glyphs == null) {
    			return;
    		}
    		for (GlyphI glyph : glyphs) {
    			select(glyph);
    		}
    	}
    }
}