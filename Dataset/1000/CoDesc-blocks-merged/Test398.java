class Test {
    public class Example {
    private void startThumbnailsCreation(boolean clearThumbnails) {
            if (mContentModel != null) {
                ArrayList<Uri> pictureUris = new ArrayList<Uri>();
                Iterator<SlideshowItem> i = mContentModel.iterator();
                while (i.hasNext()) {
                    SlideshowItem entry = i.next();
                    pictureUris.add(entry.uri);
                }
                mThmbCreator = new ThumbnailsCreator(this, pictureUris,
                        thumbnailsCreationHandler, clearThumbnails);
                mThmbCreator.start();
            }
        }
        private void updateList() {
    		itemsFilterStack.push(currentFilter);
    		currentFilter = filterList(findBox.getText(), currentFilter);
    
    		searchList.setListData(currentFilter);
    	}// UPDATELIST
        public int getRecordCount(FieldTable table)
        {
            int iKeyOrder = table.getRecord().getDefaultOrder();
            if (iKeyOrder == -1)
                iKeyOrder = Constants.MAIN_KEY_AREA;
            return this.getPKeyArea(iKeyOrder).getRecordCount();
        }
    }
}