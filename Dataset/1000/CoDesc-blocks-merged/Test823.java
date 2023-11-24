class Test {
    public class Example {
    public void draw3DRect (int x, int y, int width, int height, boolean raised) {
            emitThis ("%draw3DRect");
            Color c = getColor ();
            Color brighter = c.brighter ();
            Color darker = c.darker ();
    
            setColor (raised ? brighter : darker);
            drawLine (x, y, x, y + height);
            drawLine (x + 1, y, x + width - 1, y);
            setColor (raised ? darker : brighter);
            drawLine (x + 1, y + height, x + width, y + height);
            drawLine (x + width, y, x + width, y + height);
            setColor (c);
        }
        public TablesApiRequest(String tableName,String granularity,String format,@NotNull String perPage,@NotNull String page,UriInfo uriInfo,BardConfigResources bardConfigResources) throws BadApiRequestException {
      super(format,perPage,page,uriInfo);
      this.tables=generateTables(tableName,bardConfigResources.getLogicalTableDictionary());
      if (tableName != null && granularity != null) {
        this.granularity=generateGranularity(granularity,bardConfigResources.getGranularityParser());
        this.table=generateTable(tableName,this.granularity,bardConfigResources.getLogicalTableDictionary());
      }
     else {
        this.table=null;
        this.granularity=null;
      }
      LOG.debug("Api request: Tables: {},\nGranularity: {},\nFormat: {}\nPagination: {}",this.tables,this.granularity,this.format,this.paginationParameters);
    }
    }
}