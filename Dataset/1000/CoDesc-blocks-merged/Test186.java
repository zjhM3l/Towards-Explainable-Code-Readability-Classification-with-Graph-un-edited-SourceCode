class Test {
    public class Example {
    private boolean containsLinkedResource(IResource[] resources) {
    		for (int i = 0; i < resources.length; i++) {
    			IResource resource = resources[i];
    			if (resource.isLinked()) {
    				return true;
    			}
    		}
    		return false;
    	}
        public int compare(String source, String target) {
    			if (source == null) {
    				return 1;
    			}
    			if (target == null) {
    				return -1;
    			}
    			return comp.compare(source, target);
    		}
        public void notifyChanged(Notification notification) {
    		updateChildren(notification);
    
    		switch (notification.getFeatureID(LifecycleType.class)) {
    			case ImsMdRootv1p1Package.LIFECYCLE_TYPE__VERSION:
    			case ImsMdRootv1p1Package.LIFECYCLE_TYPE__STATUS:
    			case ImsMdRootv1p1Package.LIFECYCLE_TYPE__CONTRIBUTE:
    				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
    				return;
    		}
    		super.notifyChanged(notification);
    	}
    }
}