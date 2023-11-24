class Test {
    public class Example {
    public String toFactString() {
    		StringBuffer buf = new StringBuffer();
    		buf.append("f-" + id + " (" + this.deftemplate.getName());
    		if (this.slots.length > 0) {
    			buf.append(" ");
    		}
    		for (int idx = 0; idx < this.slots.length; idx++) {
    			buf.append("(" + this.slots[idx].getName() + " "
    					+ ConversionUtils.formatSlot(this.slots[idx].value)
    					+ ") ");
    		}
    		buf.append(")");
    		buf.append(" expiration time: " + this.expirationTime);
    		return buf.toString();
    	}
        public void initialize(){
    	// setea como criterio recuperar solamente configuraciones del 
    	// esquema que tenga como nombre de objeto SERVICIOS_DISTRIBUIDOS
    	_dsConf.setCriteria("configuracion.esquema_configuracion_id in "
    			+ "(select t1.esquema_configuracion_id"
    			+ "   from infraestructura.esquema_configuracion t1"
    			+ "  where t1.tipo_objeto = \"TABLA\""
    			+ "    and t1.nombre_objeto = \"servicio_distribuido\")");
         
    	addPageListener(this);
    }
        private void assertEqualAdviceExpressions(final AdviceExpressions aes1,final AdviceExpressions aes2){
      assertThat(aes1.getAdviceExpression().size()).isEqualTo(aes2.getAdviceExpression().size());
      for (  AdviceExpression ae : aes1.getAdviceExpression()) {
        boolean found=false;
        for (    AdviceExpression other : aes2.getAdviceExpression()) {
          if (checkEqualAdviceExpressionValues(ae,other)) {
            found=true;
            break;
          }
        }
        assertThat(found).isTrue();
      }
    }
    }
}