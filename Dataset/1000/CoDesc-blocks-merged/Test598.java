class Test {
    public class Example {
    public boolean hangupAll() {
            if (interlocutors.size() < 1) {
                Log.debug("hangup", "No interlocutors");
                return false;
            }
            Interlocutor inter;
            for (int i = 0; i < interlocutors.size(); i++) {
                inter = (Interlocutor) interlocutors.get(i);
                for (UserActionListener ual : actionHandlers) {
                    ual.handleHangupRequest(inter);
                }
            }
            return true;
        }
        private void addStep(Set steps, Step add) {
            if(steps.contains(add)) {
                throw new IllegalStateException("Found circular dependency graph from step '"+add.getName()+"':"+getStepNames(steps));
            }
            steps.add(add);
        }
        private void removeOldSignedPreKeys(OmemoDevice userDevice) {
            if (OmemoConfiguration.getMaxNumberOfStoredSignedPreKeys() <= 0) {
                return;
            }
    
            TreeMap<Integer, T_SigPreKey> signedPreKeys = loadOmemoSignedPreKeys(userDevice);
    
            for (int i = 0; i < signedPreKeys.keySet().size() - OmemoConfiguration.getMaxNumberOfStoredSignedPreKeys(); i++) {
                int keyId = signedPreKeys.firstKey();
                LOGGER.log(Level.INFO, "Remove signedPreKey " + keyId + ".");
                removeOmemoSignedPreKey(userDevice, i);
                signedPreKeys = loadOmemoSignedPreKeys(userDevice);
            }
        }
    }
}