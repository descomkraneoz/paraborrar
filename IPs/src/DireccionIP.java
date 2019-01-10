import java.util.Arrays;

public class DireccionIP {
    int[] octetos;

    //String mascarRed;
    //public String getMascaraRed(){ return mascaraRed;}

    DireccionIP mascaraRed;

    DireccionIP idRed;

    DireccionIP(int octeto1,int octeto2,int octeto3,int octeto4){
        this.octetos=new int[4];
        this.octetos[0]=octeto1;
        this.octetos[1]=octeto2;
        this.octetos[2]=octeto3;
        this.octetos[3]=octeto4;
        this.mascaraRed=new DireccionIP(255,255,255,0);
        this.idRed=new DireccionIP(this.octetos[0],this.octetos[1],this.octetos[2],this.octetos[3]);

    }



    @Override
    public String toString() {
        return this.octetos[0]+"."+this.octetos[1]+"."+this.octetos[2]+"."+this.octetos[3];
    }

    public static void main(String[] args) {
        DireccionIP mia=new DireccionIP(192,168,20,3);
        System.out.println(mia);

    }
}
