class Test {
    public class Example {
    public static void cli ( Environment env , String identifier , boolean enabled , int port , int weight , String healthCheckType , String ipAddress ) throws Exception {
      SoftLayer . LoadBalancerManager mgr = SoftLayer . LoadBalancerManager . getInstance ( env . getClient ( ) ) ;
      int loadbalId = loadbal . parseId ( identifier ) ;
      int groupId = loadbal . parseGroupId ( identifier ) ;
      int ipAddressId = 0 ;
      if ( ipAddress != null ) {
        Service ipService = env . getClient ( ) . get ( "Network_Subnet_IpAddress" ) ;
        List < Service > ipRecord = ipService . getByIpAddress ( ipAddress ) ;
        if ( ipRecord . size ( ) > 0 ) {
          ipAddressId = ipRecord . get ( 0 ) . getId ( ) ;
        }
      }
      mgr . addService ( loadbalId , groupId , ipAddressId , enabled , port , weight , healthCheckType ) ;
      env . fout ( "Load balancer service is being added!" ) ;
    }
        public String getKey() {
            String texto = null;
            if (this.key != null) {
                texto = this.getResource(this.key);
            }
            return texto;
        }
        public void insert(final byte[] pk,final Map<String,byte[]> map) throws SpaceExceededException, IOException {
      final byte[] b=BEncoder.encode(BEncoder.transcode(map));
      this.table.insert(pk,b);
      this.columnames.addAll(map.keySet());
    }
    }
}