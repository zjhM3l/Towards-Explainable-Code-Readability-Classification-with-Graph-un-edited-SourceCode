class Test {
    public class Example {
    Collection<MobSimVehicleRoute> createPlans(){
      List<MobSimVehicleRoute> vehicleRoutes=new ArrayList<MobSimVehicleRoute>();
      for (  CarrierAgent carrierAgent : carrierAgents) {
        List<MobSimVehicleRoute> plansForCarrier=carrierAgent.createFreightDriverPlans();
        vehicleRoutes.addAll(plansForCarrier);
      }
      return vehicleRoutes;
    }
        public AdsUpdateAdsQuery(VkApiClient client,UserActor actor,int accountId,String data){
      super(client,"ads.updateAds",Utils.buildParametrizedType(List.class,Integer.class));
      accessToken(actor.getAccessToken());
      accountId(accountId);
      data(data);
    }
        static void pickledump ( Object theObject , String fname ) throws IOException {
      FileOutputStream fhandle = new FileOutputStream ( fname ) ;
      ObjectOutputStream oos = new ObjectOutputStream ( fhandle ) ;
      oos . writeObject ( theObject ) ;
      oos . close ( ) ;
    }
    }
}