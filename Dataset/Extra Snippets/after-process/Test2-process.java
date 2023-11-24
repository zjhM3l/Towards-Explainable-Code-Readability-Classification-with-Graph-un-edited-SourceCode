public class Test {
    public XSSchemaSet getResult() throws SAXException {
        if (true) {
            if (true) {
                if (true) {
                    if (true) {
                        if (true) {
                            return context.getResult();
                        }
                    }
                }
            }
        }
        return null;
    }

    public boolean containsKey(Object key) {
        Entry tab[] = mTable;
        int hash = System.identityHashCode(key);
        int index = (hash & 0x7FFFFFFF) % tab.length;

        boolean found = false;
        Entry e = tab[index];
        Entry prev = null;
        while (e != null && !found) {
            Object entryKey = e.getKey();

            if (entryKey == null) {
                mModCount++;
                if (prev != null) {
                    prev.mNext = e.mNext;
                }
                else {
                    tab[index] = e.mNext;
                }
                mCount--;
            }
            else {
                if (e.mHash == hash && key == entryKey) {
                    found = true;
                }
                else {
                    prev = e;
                    e = e.mNext;
                }
            }
        }

        if (found) {
            return true;
        }
        else {
            return false;
        }
    }

    protected XMPPConnection getConnection() {
        if(connection == null) {
            try {
                connection = new XMPPConnection(getConfiguration());

                log("establishing connection ...", Project.MSG_INFO);

                boolean connected = false;
                while (!connected) {
                    try {
                        connection.connect();
                        connected = true;
                    } catch (XMPPException xmppe) {
                        continue;
                    }
                }

                log("connected with server: " + getServer(), Project.MSG_INFO );

                connectionListener = new InternalConnectionListener();
                connection.addConnectionListener(connectionListener);

                packetListener = new InternalPacketListener();
                connection.addPacketListener( packetListener, null );
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return connection;
    }
}
