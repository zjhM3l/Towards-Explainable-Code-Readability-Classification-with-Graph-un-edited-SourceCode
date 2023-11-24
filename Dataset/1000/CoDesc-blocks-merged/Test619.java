class Test {
    public class Example {
    public double getProd() {
            double prod = s.one();
            for (int c = 0; c < this.size(); c++) {
                prod = s.times(prod, getValue(c));
            }
            return prod;
        }
        public String getItemsPerPageEntry(String allLabel) {
        HtmlSelect itemSelect = new HtmlSelect();
        itemSelect.addItem("6");
        itemSelect.addItem("10");
        itemSelect.addItem("12");
        itemSelect.addItem("20");
        itemSelect.addItem("30");
        itemSelect.addItem("50");
        itemSelect.addItem("100");
        itemSelect.addItem("-1", allLabel);
        itemSelect.setJsEvent("onChange='submit();'");
        return (itemSelect.getHtml("items", getItemsPerPage()));
        //return("Items per page <input type=\"text\" name=\"items\" value=\"" + getItemsPerPage() + "\" size=\"3\">");
      }
        protected void growEmittingBranches() {
            if (acousticLookaheadFrames > 0F) {
                growTimer.start();
                float bestScore = -Float.MAX_VALUE;
                for (Token t : activeList) {
                    float score = t.getScore() + t.getAcousticScore()
                            * acousticLookaheadFrames;
                    if (score > bestScore) {
                        bestScore = score;
                    }
                    t.setWorkingScore(score);
                }
                float relativeBeamThreshold = bestScore + relativeBeamWidth;
    
                for (Token t : activeList) {
                    if (t.getWorkingScore() >= relativeBeamThreshold) {
                        collectSuccessorTokens(t);
                    }
                }
                growTimer.stop();
            } else {
                growBranches();
            }
        }
    }
}