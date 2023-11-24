class Test {
    public class Example {
    public void putOnOutfit(Player player, String outfitType) {
    		List<Outfit> possibleNewOutfits = outfitTypes.get(outfitType);
    		Outfit newOutfit = Rand.rand(possibleNewOutfits);
    		player.setOutfit(newOutfit.putOver(player.getOutfit()), true);
    
    		if (endurance != NEVER_WEARS_OFF) {
    			// restart the wear-off timer if the player was still wearing
    			// another temporary outfit.
    			TurnNotifier.get().dontNotify(new OutwearClothes(player));
    			// make the costume disappear after some time
    			TurnNotifier.get().notifyInTurns(endurance, new OutwearClothes(player));
    		}
    	}
        protected void setAddChildObjectLaunch() {
                if(getCurrentSelection() != null) {
                   objectLaunch = new ChildObjectLaunch();
                }
                else {
                    objectLaunch = new MainObjectLaunch();
                }
            }
        @Nullable
      public String getPrimaryMimeTypeStringForFilename (@Nonnull @Nonempty final String sFilename)
      {
        ValueEnforcer.notEmpty (sFilename, "Filename");
    
        final String sExtension = FilenameHelper.getExtension (sFilename);
        return getPrimaryMimeTypeStringForExtension (sExtension);
      }
    }
}