class Test {
    public class Example {
    public String toString() {
            StringBuffer rc = new StringBuffer("Person: ");
            rc.append(personid);
            rc.append(", ");
            rc.append(lastname);
            rc.append(", " + firstname);
            rc.append(", born " + formatter.format(birthdate));
            rc.append(", phone " + phoneNumbers);
            return rc.toString();
        }
        public Element createHeaderAssignElementForProcessInputRedirect(Container4BPEL process) {
    		Element assign = this.document.createElement("assign");
    		
    		for (Task task : BPELUtil.getDistinctServiceList(process.getTasks())) {
    			/* Copy token */
    			Copy copy = prepareCopyForHeaderMetaData(task.getId(), "token");
    			Element copyElement = createCopyElement(copy);
    			assign.appendChild(copyElement);
    			
    			/* Copy reporting service URL */
    			copy = prepareCopyForHeaderMetaData(task.getId(), "reportingService");
    			copyElement = createCopyElement(copy);
    			assign.appendChild(copyElement);
    		}
    		
    		return assign;
    	}
        public void addContext(Context context) {
        if (context.getGedcom()!=getGedcom())
          throw new IllegalArgumentException();
        addProperties(context.getProperties());
        addEntities(context.getEntities());
      }
    }
}