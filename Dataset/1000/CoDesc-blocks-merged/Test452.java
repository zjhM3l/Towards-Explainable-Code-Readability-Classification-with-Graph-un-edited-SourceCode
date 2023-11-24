class Test {
    public class Example {
    public static void appendSample ( StringBuilder self , int v , Dimod . VarType varType , boolean _left ) {
      String vstr = Integer . toString ( v ) . substring ( 2 ) ;
      int length = vstr . length ( ) ;
      if ( varType == Dimod . VarType . SPIN ) {
        final String f = new SpinString ( datum . sample . get ( v ) , rtrim ( length ) ) ;
        self . append ( vstr , f , _left ) ;
      }
      else {
        final String f = new BinaryString ( datum . sample . get ( v ) , rtrim ( length ) ) ;
        self . append ( vstr , f , _left ) ;
      }
    }
        private void collisionDetection(ArrayList<Planet> planets,ArrayList<Player> players) {
               
                for(Planet p: planets) {
                    if(p.solidGlobalPosition(position)) {
                        GameFrame.gp.getEngine().rocketHit(position,player);
                        return;
                    }
                }
    
                for(Player player:players) {
                    if(player.getLocation().subtract(position).norm() < player.getRadius()) {
                        GameFrame.gp.getEngine().rocketHit(position,player);
                        return;
                    }
                }
            }
        private void addNewDistribution(){
      editDistribution=Boolean.FALSE;
      final String name=HawkbitCommonUtil.trimAndNullIfEmpty(distNameTextField.getValue());
      final String version=HawkbitCommonUtil.trimAndNullIfEmpty(distVersionTextField.getValue());
      final String distSetTypeName=HawkbitCommonUtil.trimAndNullIfEmpty((String)distsetTypeNameComboBox.getValue());
      final String desc=HawkbitCommonUtil.trimAndNullIfEmpty(descTextArea.getValue());
      final boolean isMigStepReq=reqMigStepCheckbox.getValue();
      DistributionSet newDist=entityFactory.generateDistributionSet();
      setDistributionValues(newDist,name,version,distSetTypeName,desc,isMigStepReq);
      newDist=distributionSetManagement.createDistributionSet(newDist);
      notificationMessage.displaySuccess(i18n.get("message.new.dist.save.success",new Object[]{newDist.getName(),newDist.getVersion()}));
      final Set<DistributionSetIdName> s=new HashSet<>();
      s.add(new DistributionSetIdName(newDist.getId(),newDist.getName(),newDist.getVersion()));
      final DistributionSetTable distributionSetTable=SpringContextHelper.getBean(DistributionSetTable.class);
      distributionSetTable.setValue(s);
    }
    }
}