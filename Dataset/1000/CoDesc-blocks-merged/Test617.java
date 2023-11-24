class Test {
    public class Example {
    public void init(Rectangle viewRectangle) {
    		_theQuadTree = new QuadTree(new Bounds(viewRectangle).asRectangle2D());
    
    		FigureEnumeration fe = figures();
    		while (fe.hasMoreElements()) {
    			_addToQuadTree(fe.nextFigure());
    		}
    	}
        public void testLinks() throws Exception {
            WebLink[] links = _simplePage.getLinks();
            assertNotNull( "Found no links", links );
            assertEquals( "number of links in page", 4, links.length );
        }
        public void registerSecurityDomain(SecurityDomain securityDomain) 
    	{
    		securityDomains.put(securityDomain.getName(), securityDomain);
    		if (LOGGER.isDebugEnabled())
    			LOGGER.debug("Security Domain "+securityDomain.getName()+" has been successfully registered to the configuration manager.");
    	}
    }
}