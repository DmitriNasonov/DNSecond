package Computer;

public class SystemBlock {

    private PowerSupply powerSupply;

    private Disk[] disk;

    private VideoCard videoCard;

    private MotherBoard motherBoard;

    public SystemBlock(PowerSupply powerSupply, Disk[] disk, VideoCard videoCard, MotherBoard motherBoard) {
        this.powerSupply = powerSupply;
        this.disk = disk;
        this.videoCard = videoCard;
        this.motherBoard = motherBoard;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Disk[] getDisk() {
        return disk;
    }

    public void setDisk(Disk[] disk) {
        this.disk = disk;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }
}
