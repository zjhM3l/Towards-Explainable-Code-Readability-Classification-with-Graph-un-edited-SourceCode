class Test {
    public class Example {
    private void loadCompanyList() {
                    try {
                            CompanyController companyController = new CompanyController();
                             companies = (ArrayList<Company>) companyController.getAllCompany();
                            for (Company item : companies) {
                                    list.add( item.getName() );
                                    
    
                            }
                    } catch (Exception e) {
                            logger.log(Level.SEVERE, null, e);
                    }
            }
        public void testEmpty() {
          Vector vector = new Vector();
          Iterator iter = vector.iterator();
          Enumeration enum = new IteratorEnumeration(iter);
    
          int expected = 0;
          int i;
          for (i = 0; enum.hasMoreElements(); i++) {
             enum.nextElement();
             }
          assertEquals(expected, i);
          }
        private boolean multiSelectionHandleClick(GalleryCursorAdapter.GridCellViewHolder holder){
      if (!mSelectedItems.isEmpty()) {
        long imageID=holder.imageID;
        holder.icon.setVisibility((mSelectedItems.toggle(imageID)) ? View.VISIBLE : View.GONE);
        multiSelectionUpdateActionbar("changed mutli sel");
        return true;
      }
      multiSelectionUpdateActionbar("lost multi sel");
      return false;
    }
    }
}