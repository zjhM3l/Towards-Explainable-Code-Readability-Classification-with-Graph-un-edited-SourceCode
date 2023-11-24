class Test {
    public class Example {
    private void initInstance() {
    		plugin = this;
    		imageCache = new HashMap();
    
    		// Create and register a new logging listener
    		// mapped to Eclipse's plugin log
    		ProfilerLog.addListener(new ProfilerLogListener());
    		
    		try {
    			resourceBundle= ResourceBundle.getBundle("jmechanic.eclipse.profiler.ProfilerPluginResources");
    		} catch (MissingResourceException x) {
    			resourceBundle = null;
    		}
    	}
        @ NotNull public static List < VirtualFile > listRecursivelyViaWalking ( @ NotNull VirtualFile top ) {
      for ( VirtualFile dir : VfsUtilCore . getChildren ( top , false ) ) {
        ContainerUtil . addAll ( dir , ( new VirtualFileVisitor ( ) ) . visitFile ( dir ) ) ;
      }
      return Collections . emptyList ( ) ;
    }
        public void mouseClicked(java.awt.event.MouseEvent e) {
    		if (this.isEnabled()) {
    			if ((popupMenu == null || popupMenu.getComponentCount() == 0) && mouseInPopupArea) {
    				actionPerformed(new ActionEvent(this, 0, ""));
    			} else if (mouseInPopupArea || e.isPopupTrigger()) {
    				popupMenu.setVisible(true);
    				popupMenu.show(this, 0, getHeight());
    			}
    		}
    	}
    }
}