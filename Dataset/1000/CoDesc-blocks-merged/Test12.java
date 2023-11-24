class Test {
    public class Example {
    public boolean doesTarget() {
            if (target == null)
                return false;
            return target.doesTarget();
        }
        public void setQuery(String query) {
            if (!StringUtils.equals(this.query, query)) {
                this.query = query;
                this.queryUpper = StringUtils.toUpperEnglish(query);
            }
        }
        protected void updateBeanFields(PersistentDataBean bean) {
    		Feedback feedback = (Feedback) bean;
    		userId = feedback.getUserId();
    		userName = feedback.getUserName();
    		userEmail = feedback.getUserEmail();
    		subject = feedback.getSubject();
    		dateTime = feedback.getDateTime();
    		remoteAddress = feedback.getRemoteAddress();
    		remoteHost = feedback.getRemoteHost();
    		platform = feedback.getPlatform();
    		browser = feedback.getBrowser();
    		type = feedback.getType();
    		description = feedback.getDescription();
    	}
    }
}