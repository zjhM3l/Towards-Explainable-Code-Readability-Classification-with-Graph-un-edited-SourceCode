class Test {
    public class Example {
    private String createMailToLink(String to, String bcc, String cc,
                String subject, String body) {
            Validate.notNull(to, "You must define a to-address");
            final StringBuilder urlBuilder = new StringBuilder("mailto:");
            addEncodedValue(urlBuilder, "to", to);
            if (bcc != null || cc != null || subject != null || body != null) {
                urlBuilder.append('?');
            }
            addEncodedValue(urlBuilder, "bcc", bcc);
            addEncodedValue(urlBuilder, "cc", cc);
            addEncodedValue(urlBuilder, "subject", subject);
            if (body != null) {
                addEncodedValue(urlBuilder, "body", body.replace("$NL$", "\r\n"));
            }
    
            return urlBuilder.toString();
        }
        public SharedGroup getSharedGroup() {
    
    	if (isLiveOrCompiled())
    	    if (!this.getCapability(ALLOW_SHARED_GROUP_READ))
    		throw new CapabilityNotSetException(J3dI18N.getString("Link1"));
    	return ((LinkRetained)this.retained).getSharedGroup();
        }
        public void readGroup(AttributeSet attrs){
      TypedArray a=mContext.obtainStyledAttributes(attrs,R.styleable.SherlockMenuGroup);
      groupId=a.getResourceId(R.styleable.SherlockMenuGroup_android_id,defaultGroupId);
      groupCategory=a.getInt(R.styleable.SherlockMenuGroup_android_menuCategory,defaultItemCategory);
      groupOrder=a.getInt(R.styleable.SherlockMenuGroup_android_orderInCategory,defaultItemOrder);
      groupCheckable=a.getInt(R.styleable.SherlockMenuGroup_android_checkableBehavior,defaultItemCheckable);
      groupVisible=a.getBoolean(R.styleable.SherlockMenuGroup_android_visible,defaultItemVisible);
      groupEnabled=a.getBoolean(R.styleable.SherlockMenuGroup_android_enabled,defaultItemEnabled);
      a.recycle();
    }
    }
}