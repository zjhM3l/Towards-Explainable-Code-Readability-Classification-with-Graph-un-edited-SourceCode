class Test {
    public class Example {
    public static vpathparam get(nitro_service service) throws Exception{
    		vpathparam obj = new vpathparam();
    		vpathparam[] response = (vpathparam[])obj.get_resources(service);
    		return response[0];
    	}
        private ResourceRoot createResourceRoot(final DeploymentUnit deploymentUnit, final VirtualFile file, final boolean markAsSubDeployment, final boolean explodeDuringMount) throws IOException {
            final boolean war = file.getName().toLowerCase(Locale.ENGLISH).endsWith(WAR_EXTENSION);
            final Closeable closable = file.isFile() ? mount(file, explodeDuringMount) : exportExplodedWar(war, file, deploymentUnit);
            final MountHandle mountHandle = new MountHandle(closable);
            final ResourceRoot resourceRoot = new ResourceRoot(file, mountHandle);
            deploymentUnit.addToAttachmentList(Attachments.RESOURCE_ROOTS, resourceRoot);
            if (markAsSubDeployment) {
                SubDeploymentMarker.mark(resourceRoot);
            }
            if (war) {
                resourceRoot.putAttachment(Attachments.INDEX_RESOURCE_ROOT, false);
                SubExplodedDeploymentMarker.mark(resourceRoot);
            }
            return resourceRoot;
        }
        protected void scrollTables(boolean baseHeader) {
        // Return if scrolling is disabled
        if (scrollPolicy == ScrollPolicy.DISABLED) {
          return;
        }
    
        if (isAttached() && !disableScrollTables) {
          if (baseHeader) {
            int headerScrollLeft = headerWrapper.getScrollLeft();
            dataWrapper.setScrollLeft(headerScrollLeft);
          }
          int scrollLeft = dataWrapper.getScrollLeft();
          headerWrapper.setScrollLeft(scrollLeft);
          if (footerWrapper != null) {
            footerWrapper.setScrollLeft(scrollLeft);
          }
        }
      }
    }
}