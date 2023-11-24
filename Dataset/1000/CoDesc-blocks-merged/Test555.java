class Test {
    public class Example {
    public void processGuiToolsEvent() {
            SpriteBuilder wb = sm.getSpriteBuilder();
            Sprite sprite;
            switch (eventType) {
                case RELOAD:
                    sm.getMainFrame().reload();
                    break;
                case SHOW_WINDOW:
                    sprite = wb.createSprite(spriteName);
                    S2d.mainContainer.addSprite(sprite);
                    break;
                case REMOVE:
                    sprite = S2d.mainContainer.getSpriteByName(spriteName);
                    if (sprite != null) {
                        sprite.die();
                    }
                    break;
                default: //NOTHING
                    throw new IllegalStateException("No GuiTools event");
            }
            eventType = NOTHING;
        }
        public OvhFaxCampaign billingAccount_fax_serviceName_campaigns_POST(String billingAccount, String serviceName, String documentId, OvhFaxQualityEnum faxQuality, String name, String recipientsDocId, String[] recipientsList, OvhFaxCampaignRecipientsTypeEnum recipientsType, Date sendDate, OvhFaxCampaignSendTypeEnum sendType) throws IOException {
    		String qPath = "/telephony/{billingAccount}/fax/{serviceName}/campaigns";
    		StringBuilder sb = path(qPath, billingAccount, serviceName);
    		HashMap<String, Object>o = new HashMap<String, Object>();
    		addBody(o, "documentId", documentId);
    		addBody(o, "faxQuality", faxQuality);
    		addBody(o, "name", name);
    		addBody(o, "recipientsDocId", recipientsDocId);
    		addBody(o, "recipientsList", recipientsList);
    		addBody(o, "recipientsType", recipientsType);
    		addBody(o, "sendDate", sendDate);
    		addBody(o, "sendType", sendType);
    		String resp = exec(qPath, "POST", sb.toString(), o);
    		return convertTo(resp, OvhFaxCampaign.class);
    	}
        private static void checkForOutdatedChannel ( Channel self , Address participant1 , Address participant2 , BlockSpecification blockIdentifier , ChannelID channelIdentifier , ) throws ChannelOutdatedException {
      try {
        OnchainChannelDetails onchainChannelDetails = self . detailChannel ( participant1 , participant2 , blockIdentifier , null ) ;
        if ( onchainChannelDetails == null ) {
          return ;
        }
        ChannelID onchainChannelIdentifier = onchainChannelDetails . getChannelIdentifier ( ) ;
        if ( onchainChannelIdentifier != channelIdentifier ) {
          throw new ChannelOutdatedException ( MessageFormat . format ( "new={
    0}" , onchainChannelIdentifier ) , null ) ;
          }
        }
        catch ( RaidenRecoverableException e ) {
          return ;
        }
      }
    }
}