class Test {
    public class Example {
    public void manageTargets(List<Target> validTargets) {
    		final boolean[] highlightedZones = new boolean[IdZones.NB_ZONE * 2];
    		Target.targetize(validTargets, highlightedZones);
    		if (this.validTargets != null) {
    			this.validTargets.clear();
    		}
    		this.validTargets = validTargets;
    		zones.clear();
    		for (int i = highlightedZones.length; i-- > 0;) {
    			if (highlightedZones[i]) {
    				final MZone highlightZone = StackManager.PLAYERS[i / IdZones.NB_ZONE].zoneManager
    						.getContainer(i % IdZones.NB_ZONE);
    				zones.add(highlightZone);
    				highlightZone.highLight(TargetFactory.TARGET_COLOR);
    			}
    		}
    	}
        public void releaseDBConnections() {
            for (Connection connection : dbPool.values()) {
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        // There is nothing we can do with this.
                        // We must ignore this exception to let the rest connections in the pool to get a chance to be released.
                    }
                }
            }
        }
        public void setColorSpace(ColorSpace colorSpace, InterpolationDirection[] dir) {
    		if(dir.length < colorSpace.getNumComponents()) {
    			throw new IllegalArgumentException( "Must specify an interpolation " +
    					"direction for each colorspace component ("+colorSpace.getNumComponents()+")");
    		}
    		this.colorSpace = colorSpace;
    		this.interpolationDirection = dir;
    	}
    }
}