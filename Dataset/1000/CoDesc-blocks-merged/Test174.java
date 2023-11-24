class Test {
    public class Example {
    public void setBetTypesIncluded(BetStatusEnum param){
                                
                                                this.localBetTypesIncluded=param;
                                        
    
                                   }
        public void createSeries( Series ser ) {
            String qryAddSeries = "INSERT INTO series ( title, comments ) VALUES ( '"
                        + ser.getTitle() + "', '"
                        + ser.getComments() + "' )";
            try {
                Statement stmAddSeries = conComics.createStatement();
                stmAddSeries.executeUpdate( qryAddSeries );
    
                ser.setID( getLastInsertID() );
                addSeries( ser );
                stmAddSeries.close();
            } catch( SQLException E ) {
                System.err.println( getClass() + ".createSeries() :: Error saving new Series to database." );
                E.printStackTrace();
            }
        }
        public static Having buildMetricHaving(LogicalMetric metric,Set<ApiHaving> havings){
      LOG.trace("Building metric having using metric: {} \n\n and set of queries: {}",metric,havings);
      List<Having> orHavings=havings.stream().map(null).collect(Collectors.toList());
      Having newHaving=orHavings.size() == 1 ? orHavings.get(0) : new AndHaving(orHavings);
      LOG.trace("Filter: {}",newHaving);
      return newHaving;
    }
    }
}