class Test {
    public class Example {
    private JScrollPane getJScrollPaneList() {
    		if (jScrollPaneList == null) {
    			jScrollPaneList = new JScrollPane();
    			jScrollPaneList.setPreferredSize(new java.awt.Dimension(120,100));
    			jScrollPaneList.setMinimumSize(new java.awt.Dimension(120,100));
    			jScrollPaneList.setViewportView(getJListFilters());
    		}
    		return jScrollPaneList;
    	}
        public String toString(){
      StringBuilder sb=new StringBuilder();
      sb.append("================== Preface ======================\n");
      sb.append(this.header.toString());
      sb.append(String.format("instance_uid = 0x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%n",this.instance_uid[0],this.instance_uid[1],this.instance_uid[2],this.instance_uid[3],this.instance_uid[4],this.instance_uid[5],this.instance_uid[6],this.instance_uid[7],this.instance_uid[8],this.instance_uid[9],this.instance_uid[10],this.instance_uid[11],this.instance_uid[12],this.instance_uid[13],this.instance_uid[14],this.instance_uid[15]));
      sb.append(String.format("last_modified_date = 0x%02x%02x%02x%02x%02x%02x%02x%02x%n",this.last_modified_date[0],this.last_modified_date[1],this.last_modified_date[2],this.last_modified_date[3],this.last_modified_date[4],this.last_modified_date[5],this.last_modified_date[6],this.last_modified_date[7]));
      sb.append(String.format("version = 0x%02x%02x%n",this.version[0],this.version[1]));
      sb.append(String.format("content_storage = %s%n",this.content_storage.toString()));
      sb.append(String.format("operational_pattern = %s%n",this.operational_pattern.toString()));
      sb.append(this.essencecontainers.toString());
      sb.append(this.dm_schemes.toString());
      return sb.toString();
    }
        public Card dealCard() {
          if ( index >= deck.size() )
             return null;
          else
             return deck.get( index++ );
       }
    }
}