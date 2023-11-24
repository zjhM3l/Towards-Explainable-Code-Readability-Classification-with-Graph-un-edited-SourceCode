class Test {
    public class Example {
    private static boolean canResolveDownloadItem(Context context,long downloadId){
      assert !ThreadUtils.runningOnUiThread();
      Intent intent=getLaunchIntentFromDownloadId(context,downloadId);
      return (intent == null) ? false : ExternalNavigationDelegateImpl.resolveIntent(context,intent,true);
    }
        protected StringBuffer describeRelationships(Stack heritage) {
            StringBuffer msg = new StringBuffer();
            for (int i = 0; i < heritage.size(); i++) {
                ComponentBean node = (ComponentBean) heritage.get(i);
                if (i > 0) {
                    msg.insert(0, "/");
                }
                msg.insert(0, node.getJsfid());
            }
            return msg;
        }
        public void setEndDate( ProjectDate newEndDate ) {
            if(newEndDate!=null && null==startDate) throw new IllegalStateException("setEndDate(1): startDate not set. How can you know the end date?");
            endDate = newEndDate;
            if(null==endDate) {
                // mark status to be recalculated before next access
                status = STATUS_UNDEFINED;
            }
            this.fireEndDateChanged();
        }
    }
}