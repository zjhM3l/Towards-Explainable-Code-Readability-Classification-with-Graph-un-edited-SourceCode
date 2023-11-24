class Test {
    public class Example {
    private JButton getEjecutarBoton() {
            if (ejecutarBoton == null) {
                ejecutarBoton = new JButton();
                ejecutarBoton.setBounds(new Rectangle(221, 556, 157, 25));
                ejecutarBoton.setIcon(new ImageIcon(getClass().getResource(
                        "/gui2/FormRunHS.png")));
                ejecutarBoton.setText("Ejecutar");
                ejecutarBoton.addActionListener(new ActionListener() {
    
                    public void actionPerformed(ActionEvent e) {
                        InformacionBean informacion = recopilarDatos();
                        if (informacion != null) {
                            ProgresoJFrame progreso = new ProgresoJFrame();
                            ResultadosJFrame result = new ResultadosJFrame();
                            // seleccionFuncion = new SeleccionFuncion(informacion);
                            Controlador controlador = new Controlador(informacion,
                                    result, progreso);
                            controlador.start();
    
                        }
                    }
                });
            }
            return ejecutarBoton;
        }
        public static boolean providesResource ( Object obj ) {
      if ( obj instanceof Class ) {
        Class < ? > clazz = ( Class < ? > ) obj ;
        return IResource . class . isAssignableFrom ( providedBy ( clazz ) ) ;
      }
      return false ;
    }
        private void setOtherAttr(final Element element, final LDItems.LDItem item) {
            Enumeration enumeration = item.getAttributesHash().keys();
            for (; enumeration.hasMoreElements();) {
                //Get property name
                String key = (String)enumeration.nextElement();
                if (key.equals(key.toLowerCase())) {
                    element.setAttribute(key, item.getAttribute(key));
                } else {
    //            LDLogger.log("Skipping pseudo attribute " + key + "=" + item.getAttribute(key) + " for " + element.getTagName());
                }
            }
        }
    }
}