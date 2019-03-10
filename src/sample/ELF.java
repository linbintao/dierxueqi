package sample;

public class ELF implements Dosong,Demove {
    @Override
    public void move() {
        System.out.println("可移动");
    }

    @Override
    public void song() {
        System.out.println("可唱歌");
    }
    public static void main(String[] args){
        ELF elf = new ELF();
        System.out.println("精灵");
        elf.move();
        elf.song();
    }
}
