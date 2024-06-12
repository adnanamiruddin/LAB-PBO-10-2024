package TugasPraktikum7.kelas;

public class Projek extends Kehidupan{
    int jumlah;

    public Projek(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public void prosesKehidupan(){
        System.out.println("Pernah Melakukan Penetration Testing");
    }
    
    public void jumlahProjek(){
        if(this.jumlah == 1){
            System.out.println("Jumlah Projek Penetration Testing : 0 <= 4");
        }else if(this.jumlah == 2){
            System.out.println("Jumlah Projek Penetration Testing : 5 <= 7");
        }else if(this.jumlah == 3){
            System.out.println("Jumlah Projek Penetration Testing : 8 <= 16");
        }else if(this.jumlah == 4){
            System.out.println("Jumlah Projek Penetration Testing : Lebih dari 16");
        }else{}
    }

}
