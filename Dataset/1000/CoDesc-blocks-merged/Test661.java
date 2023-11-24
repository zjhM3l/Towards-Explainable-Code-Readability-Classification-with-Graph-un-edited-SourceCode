class Test {
    public class Example {
    private void updateNeighborViewsForID(long itemID){
      int position=getPositionForID(itemID) - 1;
      PlaylistAdapter adapter=(PlaylistAdapter)((HeaderViewListAdapter)getAdapter()).getWrappedAdapter();
      mAboveItemId=adapter.getItemId(position - 1);
      mBelowItemId=adapter.getItemId(position + 1);
    }
        public static String join(Collection collection, String separator) {
          if (collection == null) {
              return null;
          }
          return join(collection.iterator(), separator);
      }
        public void loadMultipleFragments(FragmentManager fragmentManager,int containerId,int showPos,BaseFragment... fragments){
      FragmentTransaction ft=fragmentManager.beginTransaction();
      ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
      for (int i=0; i < fragments.length; i++) {
        BaseFragment fragment=fragments[i];
        if (fragment == null) {
          throw new IllegalArgumentException("loadMultipleFragments fragment in list can not be null ");
        }
        String tag=fragment.getClass().getName();
        ft.add(containerId,fragment,tag);
        if (showPos != i) {
          ft.hide(fragment);
        }
        Bundle bundle=fragment.getArguments();
        if (bundle != null) {
          bundle.putBoolean(ARG_IS_ROOT,true);
        }
      }
      ft.commit();
    }
    }
}