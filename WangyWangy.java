/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wangywangy;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class WangyWangy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String KEQING;
        boolean ulang=true;
        boolean again=true;
        String d;
        
        while(ulang){
            System.out.print("Masukkan nama yang anda ingin WANGY WANGY : ");
        KEQING=input.nextLine();
        System.out.println(KEQING+"...... "+KEQING+" ❤ ❤ ❤ WANGY WANGY WANGY WANGY WANGY WANGY HU HA HU HA HU HA, aaaah baunya "+KEQING+" wangi aku mau nyiumin aroma wanginya "+KEQING+" AAAAAAAAH ~~ Rambutnya.... aaah rambutnya juga pengen aku elus-elus ~ AAAAAH "+KEQING+" ❤ ❤ ❤ manis banget AAAAAAAAH\n" +
"TATAPAN "+KEQING+" BEGITU MENGGODAAAAAAAAA............ GUA RELA JADI BUDAK SIMP HANYA DEMI "+KEQING+" TERDJINTA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAGH\n" +
"apa ? "+KEQING+" itu gak nyata ? Cuma karakter 2 dimensi katamu ? nggak, ngak ngak ngak ngak NGAAAAAAAAK GUA GAK PERCAYA ITU DIA NYATA !! GUA GAK PEDULI SAMA KENYATAAN POKOKNYA GAK PEDULI. "+KEQING+" ngeliat gw ... "+KEQING+" NGELIATIN GW! "+KEQING+"... kamu percaya sama aku ? aaaaaaaaaaah syukur "+KEQING+" gak malu memiliki aku aaaaaah ❤ ❤ ❤ YEAAAAAAAAAAAH GUA MASIH PUNYA "+KEQING+" ,"+KEQING+" AKU SAYANG "+KEQING+" AKU CINTA "+KEQING+" AKU AKU INGIN "+KEQING+" MENJADI BIDADARIKUUUUUUU!!!!!!!!!!!!!\n" +
"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAGH!!!!!!!!!!!!!!!!!!!!!!");
        again=true;
        while(again){
            System.out.println("------------------------------------------");
            System.out.println("Anda ingin memasukkan nama lagi ? [y]/[t]");
            System.out.println("==========================================");
            d=input.nextLine();
            if(d.equals("y")){
                ulang=true;
                again=false;
            }
            else if(d.equals("t")){
                ulang=false;
                again=false;
            }
            else{
                System.out.println("        -------------");
                System.out.println("        pilihan salah");
                System.out.println("        --------------");
                again=true;
                
            }
        }
        }
    }
    
}
