public class Apdu {

	public static final int MAX_EXPECTED_LENGTH = 256;
	public static final int MAX_EXPECTED_LENGTH_LONG = 65536;
	public static final int INS_ERASE_BINARY = 0x0E;
	public static final int INS_VERIFY = 0x20;
	public static final int INS_MANAGE_CHANNEL = 0x70;
	public static final int INS_EXTERNAL_AUTHENTICATE = 0x82;
	public static final int INS_GET_CHALLENGE = 0x84;
	public static final int INS_INTERNAL_AUTHENTICATE = 0x88;
	public static final int INS_INTERNAL_AUTHENTICATE_ACS = 0x86;
	public static final int INS_SELECT_FILE = 0xA4;
	public static final int INS_READ_BINARY = 0xB0;
	public static final int INS_READ_RECORDS = 0xB2;
	public static final int INS_GET_RESPONSE = 0xC0;
	public static final int INS_ENVELOPE = 0xC2;
	public static final int INS_GET_DATA = 0xCA;
	public static final int INS_WRITE_BINARY = 0xD0;
	public static final int INS_WRITE_RECORD = 0xD2;
	public static final int INS_UPDATE_BINARY = 0xD6;
	public static final int INS_PUT_DATA = 0xDA;
	public static final int INS_UPDATE_DATA = 0xDC;
	public static final int INS_APPEND_RECORD = 0xE2;
	public static final int CLS_PTS = 0xFF; // Class for PTS
}
