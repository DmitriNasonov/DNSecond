package Computer;

public class MainComputer {

    public static void main(String[] args) {
        Mouse mouse = new Mouse("AAP","Logitech","Laser","Wireless");
        Keyboard keyboard = new Keyboard("AAER29", "Asus", Color.black);

        Disk disk = new Disk("WER45", "WD",1000);
        Disk disk1 = new Disk("AADF78", "Toshiba", 250);
        Disk[] totalDisk = {disk, disk1};

        CPU cpu = new CPU("Intel 9", "Intel Core", 400);

        Ram ram = new Ram("SD4-3200", "Asus", 3200);
        Ram ram1 = new Ram("SD4-3200", "Crusial", 2666);
        Ram[] totalRam = {ram,ram1};

        VideoCard videoCard= new VideoCard("Geforce-6700","Geforse", 16 );
        PowerSupply powerSupply = new PowerSupply("ASDE908", "BestBrand", 800);

        MotherBoard motherBoard = new MotherBoard("WERF456", "HP", cpu,totalRam );

        SystemBlock systemBlock = new SystemBlock(powerSupply,totalDisk, videoCard, motherBoard);

        Monitor monitor = new Monitor("Dell", "QERED37", 37);
        Monitor monitor2 = new Monitor("HP", "DFGT35", 35);
        Monitor[] totalMonitor = {monitor, monitor2};

        Computer computer1 = new Computer(mouse,keyboard,systemBlock,totalMonitor);

        System.out.println(computer1.getSystemBlock().getMotherBoard().getCpu().getModel());
        System.out.println(computer1.getSystemBlock().getMotherBoard().getRam()[0].getBrand());

        for (int i = 0; i <computer1.getMonitor().length ; i++) {
            System.out.println(computer1.getMonitor()[i].getSize());
        }
        for (Monitor monitors:computer1.getMonitor()){
            System.out.println(monitors.getModel());
        }
        for (int i = 0; i <computer1.getSystemBlock().getMotherBoard().getRam().length ; i++) {
            System.out.println(computer1.getSystemBlock().getMotherBoard().getRam()[i].getBrand());
        }
        Computer computerMono = new Computer(mouse,keyboard,totalMonitor);

        Computer comp = new Computer();
        Mouse mouse1 = new Mouse("sdyt", "Asus", "laser", "Wireless");
        comp.setMouse(mouse1);
        System.out.println(comp.getMouse().getModel());

        Keyboard keyboard1 = new Keyboard("weytf45", "Logitech", Color.black);
        comp.setKeyboard(keyboard1);
        System.out.println(comp.getKeyboard().getColor());


    }
}
