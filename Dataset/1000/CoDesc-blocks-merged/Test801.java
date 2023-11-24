class Test {
    public class Example {
    public int getPageCount() {
         int count = 0;
         
         int width = (int) (mPageFormat.getImageableWidth());
         int height = (int) (mPageFormat.getImageableHeight());
    
         BufferedImage bufferedImage = new BufferedImage (width, height, BufferedImage.TYPE_4BYTE_ABGR_PRE );
         Graphics2D g2d = ( bufferedImage.createGraphics() );
         
         while (print(g2d, mPageFormat, count) == PAGE_EXISTS) {
           count++;
         }
        
         return count;
      }
        public String getString(final String key) throws PropertyNotFoundException {
    		final String property = (String)this.properties.get(key);
    		if(property==null){
    			throw new PropertyNotFoundException("Property ["+key +"] not found");
    		}
    		return property;
    	}
        public void rollTreasure() {
            // note: while rolling, new items may be added to the t_items list
            // because new added items are unrolled, they are not merged
            // while rolling, no items are removed from this list (no merging)
            int counter = 0;
            while (counter < t_items.size()){
                TreasureItem item = (TreasureItem) t_items.get(counter);
                item.rollTreasureItem();
                t_amountCoins.modifyResult(item);
                counter++;
            }
        }
    }
}