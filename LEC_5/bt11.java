
package LEC_5;


public class bt11 {
    public static void main(String[] args) {
        int xucxac1, xucxac2;
        int solangieo=0;
        do{
            xucxac1=(int)(Math.random()*6)+1;
            xucxac2=(int)(Math.random()*6)+1;
            solangieo++;
            System.out.println("lan "+solangieo+": "+ xucxac1+"-"+xucxac2);
            
        }while(xucxac1!=xucxac2);
        System.out.println("ca hai suc sac deu ra"+xucxac1+"-"+xucxac2);
    }
}
