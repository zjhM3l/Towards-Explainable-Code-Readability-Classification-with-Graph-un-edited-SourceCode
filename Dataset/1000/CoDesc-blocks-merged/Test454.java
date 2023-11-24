class Test {
    public class Example {
    private int elapsed(int type) {
    	        GregorianCalendar gc1, gc2;
    	        int elapsed = 0;
    	        // Create copies since we will be clearing/adding
    	        if (endDate.after(startDate)) {
    	            gc2 = (GregorianCalendar) endDate.clone();
    	            gc1 = (GregorianCalendar) startDate.clone();
    	        } else {
    	            gc2 = (GregorianCalendar) startDate.clone();
    	            gc1 = (GregorianCalendar) endDate.clone();
    	        }
    	        if (type == Calendar.MONTH || type == Calendar.YEAR) {
    	            gc1.clear(Calendar.DATE);
    	            gc2.clear(Calendar.DATE);
    	        }
    	        if (type == Calendar.YEAR) {
    	            gc1.clear(Calendar.MONTH);
    	            gc2.clear(Calendar.MONTH);
    	        }
    	        while (gc1.before(gc2)) {
    	            gc1.add(type, 1);
    	            elapsed++;
    	        }
    	        return elapsed;
    	    }
        public void addPayment(PaymentRecord p) {
            this.q.put(p.getKey(), p);
            this.queuesize++;
            this.queuevalue += p.value;
            this.updateStats();
        }
        private static void recalcFontSize(final float scale,final int rotate,final FormObject formObject,final Component curComp){
      final int size=GUIData.getFontSize(formObject,rotate,scale);
      final Font resetFont=curComp.getFont();
      final Font newFont=new Font(resetFont.getFontName(),resetFont.getStyle(),size);
      curComp.setFont(newFont);
    }
    }
}