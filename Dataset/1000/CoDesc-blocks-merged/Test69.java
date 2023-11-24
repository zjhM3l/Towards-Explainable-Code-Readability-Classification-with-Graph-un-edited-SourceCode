class Test {
    public class Example {
    public InteractiveBrokersContractBuilder getContractBuilderForMarketDataItem(MarketDataItem marketDataItem){
    		InteractiveBrokersContractBuilder builder = null;		
    		SecurityType securityType = marketDataItem.getSecurityType();
    		
    		switch(securityType){
    			case EQUITY:
    				builder = new InteractiveBrokersEquityContractBuilder();
    				break;
    			case EQUITY_INDEX:
    				builder = new InteractiveBrokersEquityIndexContractBuilder();
    				break;
    			case EQUITY_OPTION:
    				builder = new InteractiveBrokersEquityOptionContractBuilder();
    				break;
    		}
    		
    		return builder;
    	}
        @CrossOrigin(allowedHeaders = {"*"}, origins = {"*"})
      @RequestMapping(value = {"{identifier}/manifest", "{identifier}"}, method = RequestMethod.GET,
              produces = "application/json")
      @ResponseBody
      public Manifest getManifest(@PathVariable String identifier, HttpServletRequest request) throws NotFoundException, InvalidDataException {
        HttpLoggingUtilities.addRequestClientInfoToMDC(request);
        MDC.put("manifestId", identifier);
        try {
          Manifest manifest = presentationService.getManifest(identifier);
          LOGGER.info("Serving manifest for {}", identifier);
          return manifest;
        } catch (NotFoundException e) {
          LOGGER.info("Did not find manifest for {}", identifier);
          throw e;
        } catch (InvalidDataException e) {
          LOGGER.error("Bad data for {}", identifier);
          throw e;
        } finally {
          MDC.clear();
        }
      }
        public String read_index(long offset, RandomAccessFile fp) {
            try {
                fp.seek(offset);
                int size = Search.fgets(fp, lineBuf);
                return new String(lineBuf, 0, 0, size);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}