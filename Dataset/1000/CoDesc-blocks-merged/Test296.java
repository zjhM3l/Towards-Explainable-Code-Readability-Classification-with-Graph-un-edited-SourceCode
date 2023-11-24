class Test {
    public class Example {
    protected void saveNewUser() {
    		if(newUserFld.getText().equals("")||newPasswordFld.getText().equals(""))
    			return;
    		User user = new User();
    		user.setAdmin(0);
    		if(adminUserFld.isSelected())
    			user.setAdmin(1);
    		user.setName(newUserFld.getText());
    		user.setPassword(newPasswordFld.getText());
    		user.setParty_id(mainPanel.getFrame().party.getParty_id());
    		StorageImpl.getInstance().saveUser(user);
    		newUserFld.setText("");
    		newPasswordFld.setText("");
    		adminUserFld.setSelected(false);
    		updateUsersList();
    		
    	}
        private void drawPoints(int index, Graphics2D g){
    		Color savedColor = g.getColor();
    		Color c = getCountColor(index);
    		g.setColor(c);
    		try{
    		Iterator<Point> i = img.getCount(index).iterator();
    		Point current;
    		while (i.hasNext()) {
    			current = Conversions.translate(reSizedImage, imageSize, (Point) i
    					.next().clone());
    			g.fillOval((int) current.getX() - penguinCountSize / 2,
    					(int) current.getY() - penguinCountSize / 2,
    					penguinCountSize, penguinCountSize);
    		}
    		}catch(Exception ex){}
    		g.setColor(savedColor);
    	}
        public void changeCurrentManifest(String manifestName) throws ManifestException, LocationException {
    
        ManifestFactory manifestFactory = new ManifestFactory();
        ManifestLoader loader = new ManifestLoader(workingContext);
        Manifest newManifest = manifestFactory.create(workingContext, loader.load(manifestName));
    
        // If we are here, loading the new manifest was succesfull.
        //
        currentManifest = newManifest;
    
        register();
      }
    }
}