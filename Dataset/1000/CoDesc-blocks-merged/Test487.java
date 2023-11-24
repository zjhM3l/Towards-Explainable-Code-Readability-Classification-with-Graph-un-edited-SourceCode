class Test {
    public class Example {
    public void testEquals() {
            assertEquals(AreaRendererEndType.LEVEL, AreaRendererEndType.LEVEL);
            assertEquals(AreaRendererEndType.TAPER, AreaRendererEndType.TAPER);
            assertEquals(
                AreaRendererEndType.TRUNCATE, AreaRendererEndType.TRUNCATE
            );
        }
        public static double interpolantNormalized(double amount,double startAmount,double stopAmount){
      if (amount < startAmount)   return 0.0;
     else   if (amount > stopAmount)   return 1.0;
      if ((stopAmount - startAmount) == 0) {
        return (1.0);
      }
      return (amount - startAmount) / (stopAmount - startAmount);
    }
        public static QueryBasedHivePublishEntity deserializePublishCommands(State state) {
        QueryBasedHivePublishEntity queryBasedHivePublishEntity =
            GSON.fromJson(state.getProp(HiveAvroORCQueryGenerator.SERIALIZED_PUBLISH_TABLE_COMMANDS),
                QueryBasedHivePublishEntity.class);
        return queryBasedHivePublishEntity == null ? new QueryBasedHivePublishEntity() : queryBasedHivePublishEntity;
      }
    }
}