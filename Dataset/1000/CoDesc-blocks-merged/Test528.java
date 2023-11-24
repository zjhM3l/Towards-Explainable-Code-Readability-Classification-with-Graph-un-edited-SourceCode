class Test {
    public class Example {
    public Observable<ConnectionResetSharedKeyInner> beginResetSharedKeyAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, int keyLength) {
            return beginResetSharedKeyWithServiceResponseAsync(resourceGroupName, virtualNetworkGatewayConnectionName, keyLength).map(new Func1<ServiceResponse<ConnectionResetSharedKeyInner>, ConnectionResetSharedKeyInner>() {
                @Override
                public ConnectionResetSharedKeyInner call(ServiceResponse<ConnectionResetSharedKeyInner> response) {
                    return response.body();
                }
            });
        }
        private String normalizeWhitespace(String str) {
        str = WHITESPACE_EXCEPT_SPACE_PATTERN.matcher(str).replaceAll(" ");
        str = TWO_OR_MORE_SPACES_PATTERN.matcher(str).replaceAll(" ");
        return str;
      }
        private PcapPacket readPacket(int magicNumber) throws IOException {
      PacketHeader packetHeader=readPacketHeader(magicNumber);
      Buffer packetData=readPacketData(packetHeader.getInclLen());
      return new PcapPacket(packetHeader,packetData);
    }
    }
}