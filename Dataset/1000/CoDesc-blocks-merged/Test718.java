class Test {
    public class Example {
    void skipRemainingSiblings(){
      if (!stack.isEmpty()) {
        stack.peek().skip();
      }
    }
        @Nonnull
      public static EChange setExpirationSeconds (final int nExpirationSeconds)
      {
        return s_aRWLock.writeLocked ( () -> {
          if (s_nExpirationSeconds == nExpirationSeconds)
            return EChange.UNCHANGED;
          s_nExpirationSeconds = nExpirationSeconds;
          LOGGER.info ("ResponseHelper expirationSeconds=" + nExpirationSeconds);
          return EChange.CHANGED;
        });
      }
        public void removeFolder(FolderTree folderTree, Folder folder) throws RepositoryException {
    
            for (Folder subfolder : new ArrayList<Folder>(folder.getFolders())) {
                removeFolder(folderTree, subfolder);
            }
    
            for (ContentFile file : new ArrayList<ContentFile>(folder.getFiles())) {
                removeFile(file);
            }
    
            folderDao.remove(folder.getPath());
            if (folderTree.getSelectedFolder().equals(folder)) {
                folderTree.setSelectedFolder(folder.getParent());
            }
    
            log.info("Deleting folder {0}", folder.getPath());
    
        }
    }
}