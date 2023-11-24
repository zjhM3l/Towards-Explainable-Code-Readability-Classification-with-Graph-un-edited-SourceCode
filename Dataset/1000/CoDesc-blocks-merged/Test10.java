class Test {
    public class Example {
    public Value poll(String queue_name){
      Value element=null;
      if (has_queue(queue_name)) {
        element=queue_map.get(queue_name).pollFirst();
      }
      return element;
    }
        private void updateJobWithSplit(final JobConf job, InputSplit inputSplit) {
        if (inputSplit instanceof FileSplit) {
          FileSplit fileSplit = (FileSplit) inputSplit;
          job.set("map.input.file", fileSplit.getPath().toString());
          job.setLong("map.input.start", fileSplit.getStart());
          job.setLong("map.input.length", fileSplit.getLength());
        }
        LOG.info("split: " + inputSplit.toString());
      }
        private void buildPatternPlus() {
            BufferedImage image = new BufferedImage(10, 10, 
                                                    BufferedImage.TYPE_INT_RGB);
            Graphics2D g = image.createGraphics();
            g.setColor(Color.white);
            g.fillRect(0, 0, 10, 10);
            g.setColor(Color.black);
            g.drawLine(3, 5, 8, 5);
            g.drawLine(3, 6, 8, 6);
            g.drawLine(5, 3, 5, 8);
            g.drawLine(6, 3, 6, 8);
            Rectangle r = new Rectangle(0, 0, 10, 10);
            Paint pattern = new TexturePaint(image, r);
            patterns.put("PATTERN_PLUS", pattern);
        }
    }
}