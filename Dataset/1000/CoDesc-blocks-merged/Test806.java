class Test {
    public class Example {
    @Override
        public DescribeObjectsResult describeObjects(DescribeObjectsRequest request) {
            request = beforeClientExecution(request);
            return executeDescribeObjects(request);
        }
        public String getSubSummaryRow(final String path) {
    		String fullPath = path;
    		if (!path.endsWith(dirHelper.separator())) {
    			fullPath += dirHelper.separator();
    		}
    
    		Counts sum = subDirSum(fullPath);
    
    		//int depth = dirHelper.dirDepth(fullPath) - 1;
    
    		StringBuilder builder = new StringBuilder();
    		builder.append("<tr bgcolor=\"");
    		builder.append(color(sum));
    		builder.append("\"><th style=\"text-align: left\">");
    
    		//indent(depth, builder);
    
    		builder.append(fullPath);
    		builder.append("</th><td>");
    		builder.append(sum.toString());
    		builder.append("</td></tr>");
    
    		return builder.toString();
    	}
        public boolean replaceCard(Card oldCard, Card replacementCard) {
    		int location = findCard(oldCard);
    		if (location < 0)
    			return false;
    		hand.set(location, replacementCard);
    		return true;
    	}
    }
}