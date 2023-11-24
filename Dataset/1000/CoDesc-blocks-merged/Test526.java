class Test {
    public class Example {
    public BigDecimalAssert asNumber() {
            isPresent(NUMBER.getDescription());
            Node node = getNode(actual, "");
            if (node.getNodeType() == NUMBER) {
                return createBigDecimalAssert(node.decimalValue());
            } else if (node.getNodeType() == STRING) {
                try {
                    return createBigDecimalAssert(new BigDecimal(node.asText()));
                } catch (NumberFormatException e) {
                    failWithMessage("Node \"" + path + "\" can not be converted to number expected: <a number> but was: <" + quoteTextValue(node.getValue()) + ">.");
                }
            } else {
                failOnType(node, "number or string");
            }
            return null;
        }
        @Override
    	public Cookie[] getCookies() {
    		Collection<Cookie> entries = cookies.values();
    		return entries.toArray(new Cookie[0]);
    	}
        @Override Map<String,Object> extractFields(String line){
      try {
        return reader.readValue(line);
      }
     catch (  IOException e) {
        logger.error("Exception while extracting fields {}",e);
      }
      return null;
    }
    }
}