class Test {
    public class Example {
    public ShapeStyle setMoveX(final Integer coord) {
            if ((coord != null)
                    && ((coord < Shape.MIN_COORD) || (coord > Shape.MAX_COORD))) {
                throw new IllegalArgumentRangeException(
                        Shape.MIN_COORD, Shape.MAX_COORD, coord);
            }
            moveX = coord;
            return this;
        }
        public void submitContextAndServiceString(final String evaluatorConfigurationString,
                                                final String contextConfigurationString,
                                                final String serviceConfigurationString) {
        if (evaluatorConfigurationString.isEmpty()) {
          throw new RuntimeException("empty evaluatorConfigurationString provided.");
        }
        if (contextConfigurationString.isEmpty()) {
          throw new RuntimeException("empty contextConfigurationString provided.");
        }
        if (serviceConfigurationString.isEmpty()) {
          throw new RuntimeException("empty serviceConfigurationString provided.");
        }
    
        //When submit over the bridge, we would keep the configurations as serialized strings.
        //public void submitContextAndService(final String contextConfiguration,
        //final String serviceConfiguration) is not exposed in the interface. Therefore cast is necessary.
        ((AllocatedEvaluatorImpl)jallocatedEvaluator)
            .submitContextAndService(evaluatorConfigurationString, contextConfigurationString, serviceConfigurationString);
      }
        public void write(DataOutput dataOutput) throws IOException {
        for (JobProbeData jpd = this; jpd != null; jpd = jpd.getNext()) {
          MessageHelper.writePublishable(dataOutput, jpd.globalJobId);
          MessageHelper.writeString(dataOutput, jpd.jobId);
          MessageHelper.writeString(dataOutput, jpd.jobStatus.name());
    
          dataOutput.writeInt(properties.size());
          for (Map.Entry<String, String> entry : properties.entrySet()) {
            MessageHelper.writeString(dataOutput, entry.getKey());
            MessageHelper.writeString(dataOutput, entry.getValue());
          }
    
          dataOutput.writeBoolean(jpd.next != null);
        }
      }
    }
}