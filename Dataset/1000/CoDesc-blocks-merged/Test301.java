class Test {
    public class Example {
    public int getCol(Anchor a) {
    		int e = getEntry(a);
    		if (e < 0) {
    			return -1;
    		}
    		return text.htmlText.colOf(e);
    	}
        public void updateTaskStart(Task task, Date start) throws  Exception {
    		sess = HibernateUtil.currentSession();
    		try {
    			tman.updateTaskStart(task, start);
    			log.info("Zmiana daty  rozpoczecia tasku");
    			HibernateUtil.closeSession();
    		} catch (Exception e) {
    			HibernateUtil.closeSession();
    			throw e;
    		}
    	}
        public void checkProgress(Object arg){
      if (!(arg instanceof ImportItem)) {
        return;
      }
      ImportItem item=(ImportItem)arg;
      if (!item.getProgress().equals(running.get(item))) {
        fireTableCellUpdated(list.indexOf(item),PROGRESS);
        running.put(item,item.getProgress());
      }
      if (item.isComplete()) {
        running.remove(item);
        item.getProgressObserver().deleteObserver(this);
      }
     else {
      }
      if (running.isEmpty()) {
        timer.stop();
      }
    }
    }
}