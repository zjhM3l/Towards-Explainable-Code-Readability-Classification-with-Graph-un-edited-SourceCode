class Test {
    public class Example {
    public void setProcessTicks(int processTicks) {
    		log.debug("NEW=" + processTicks + "  OLD=" + this.processTicks);
    		int old = getProcessTicks();
    		this.processTicks = processTicks;
    		this.firePropertyChange(MainModel.PROPERTY_ProcessTicks, old, this.processTicks );
    	}
        public String getExtension(File f) {
           if (f == null) return null;
           String filename = f.getName();
           int i = filename.lastIndexOf('.');
           if (i>0 && i<filename.length()-1) {
    	 return filename.substring(i+1).toLowerCase();
           }
           return null;
        }
        private void refreshThumbs(final Cover cover) {
        // refresh thumbs
        try {
          for (int i = 0; i < 4; i++) {
            final Album album = dirReference.getFiles().iterator().next().getTrack().getAlbum();
            final File fThumb = Util.getConfFileByPath(ITechnicalStrings.FILE_THUMBS + '/'
                + (50 + 50 * i) + "x" + (50 + 50 * i) + '/' + album.getID() + '.'
                + ITechnicalStrings.EXT_THUMB);
            ThumbnailManager.createThumbnail(cover.getFile(), fThumb, (50 + 50 * i));
          }
        } catch (final Exception ex) {
          Log.error(24, ex);
        }
      }
    }
}