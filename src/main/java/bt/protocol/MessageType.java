package bt.protocol;

public enum MessageType {
    HANDSHAKE, KEEPALIVE, CHOKE, UNCHOKE, INTERESTED, NOT_INTERESTED,
    HAVE, BITFIELD, REQUEST, PIECE, CANCEL, PORT
}
