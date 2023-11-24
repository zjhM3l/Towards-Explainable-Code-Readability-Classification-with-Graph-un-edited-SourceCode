class Test {
    public class Example {
    public static void renameVersion ( @ NotNull final Project project , @ NotNull final String oldName , @ NotNull final String newName ) {
      final ProjectLevelVcsManager vcsManager = ProjectLevelVcsManager . getInstance ( project ) ;
      final VirtualFile file = vcsManager . findVcsRootFor ( VfsUtilCore . virtualToIoFile ( oldName ) ) ;
      if ( file != null ) {
        vcsManager . addRoot ( file , new VirtualFileRevision ( newName , null ) ) ;
      }
    }
        public static final void addPlaces ( Place self , List < Place > places , boolean ret ) {
      if ( CollectionUtils . isEmpty ( places ) ) {
        places = new ArrayList < Place > ( ) ;
      }
      places . addAll ( places ) ;
      if ( ret ) {
        return ;
      }
    }
        public void setLID(Integer newLID) {
    		Integer oldLID = lid;
    		lid = newLID;
    		if (eNotificationRequired())
    			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.ESU__LID, oldLID, lid));
    	}
    }
}