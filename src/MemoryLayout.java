public class MemoryLayout
{
	public static final int GPB_MAD_V1 = 0x01;
	public static final int GPB_MAD_V2 = 0x02;
	
	private static final int FOUR_BLOCK_SECTORS = 32;
	private static final int SIXTEEN_BLOCK_SECTORS = 8;

	public static final MemoryLayout CLASSIC_1K = new MemoryLayout(16);
	public static final MemoryLayout CLASSIC_4K = new MemoryLayout(FOUR_BLOCK_SECTORS + SIXTEEN_BLOCK_SECTORS);

	private int sectors;

	public MemoryLayout(int sectors) {
		this.sectors = sectors;
	}

	public int getMadVersion()
	{
		if (sectors == 16)
			return GPB_MAD_V1;
		else
			return GPB_MAD_V2;
	}

	public int getSectors()
	{
		return sectors;
	}

	public int getBlocksPerSector(int sectorId)
	{
		if (sectorId < FOUR_BLOCK_SECTORS)
			return 4;
		else
			return 16;
	}

	public int getDataBlocksPerSector(int sectorId)
	{
		if (sectorId < FOUR_BLOCK_SECTORS)
			return 3;
		else
			return 15;
	}

	public int getBlockNumber(int sectorId, int blockId)
	{
		if (sectorId < FOUR_BLOCK_SECTORS)
			return sectorId * 4 + blockId;
		else
			return (FOUR_BLOCK_SECTORS * 4) + ((sectorId - FOUR_BLOCK_SECTORS) * 16 + blockId);
	}

	public int getTrailerBlockNumberForSector(int sectorId)
	{
		return getBlocksPerSector(sectorId) - 1;
	}

	public boolean isTrailerBlock(int sectorId, int blockId)
	{
		return blockId == getBlocksPerSector(sectorId) - 1;
	}
}
