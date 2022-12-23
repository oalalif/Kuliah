package Klotok;
import java.util.Scanner;
public class Daftarmenu {
    private void welcome() {
    }
    public static void main(String[] args) {
        
        Scanner input;
        String textInBold = "";
        System.out.print("\033[0;1m"+textInBold);
        
        char  ulang;
        double TK;
        Nasyam Nym = new Nasyam();
        Nasuli Nli = new Nasuli();
        Nasri Nri = new Nasri();
        Nascing Nci = new Nascing();
        Naslumb Nlb = new Naslumb();
        Naspaus Nus = new Naspaus();
        
            input = new Scanner (System.in);
            Daftarmenu DM= new Daftarmenu ();
            DM.welcome();
            System.out.println("===#Warung Klotok#===");
            System.out.println("========Caping  Alaska========");
            System.out.println("-----------------------------");
            System.out.println();
            System.out.println();
            System.out.println("1. Nasi Ayam ---- Rp. 8.000");
            System.out.println();
            System.out.println("2. Nasi Kebuli -------- Rp. 10.000");
            System.out.println();
            System.out.println("3. Nasi Teri ------ Rp. 4.000");
            System.out.println();
            System.out.println("4. Nasi Kucing ------ Rp. 2.000");
            System.out.println();
            System.out.println("5. Nasi Lumba-lumba --- Rp. 20.000");
            System.out.println();
            System.out.println("6. Nasi Paus - Rp.35.000");
            System.out.println();
            System.out.println("7. Keluar -- Tidak Jadi Pesan");
            System.out.println();
            System.out.println();
            System.out.println("-----------------------------");
        do{
            System.out.println("Pilih [1-7] ----------------:");
            System.out.print("Masukan Pilihan Anda        : ");
            int kode = input.nextInt();
            switch(kode){
                
                case 1 :
                Nym.setNama("Nasyam");
                Nym.Infodaftarmenu();
                System.out.println("Harga Nasi Ayam Rp. 10.000");
                System.out.print("Mau pesan berapa porsi ? ");
                Nym.setjml1(input.nextInt());
                System.out.println("===============================");
                System.out.println("Total pesanan anda " +Nym.getjml1()+" porsi, seharga Rp."+Nym.getT1());
                System.out.println("Telah ditambahkan ke dalam tagihan");
                break;
                
                case 2 :
                Nli.setNama("Nasuli");
                Nli.Infodaftarmenu();
                System.out.println("Harga Nasi Kebuli Rp. 10.000");
            System.out.print("Mau pesan berapa porsi ? ");
            Nli.setjml2(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan anda " +Nli.getjml2()+" porsi, seharga Rp."+Nli.getT2());
            System.out.println("Telah ditambahkan ke dalam tagihan");
            break;
            
            case 3 :
            Nri.setNama("Nasri");
            Nri.Infodaftarmenu();
            System.out.println("Harga Nasi Teri Rp. 4.000");
            System.out.print("Mau pesan berapa porsi ? ");
            Nri.setjml3(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan anda " +Nri.getjml3()+" porsi, seharga Rp."+Nri.getT3());
            System.out.println("Telah ditambahkan ke dalam tagihan");
            break;
            
            case 4 :
            Nci.setNama("Nascing");
            Nci.Infodaftarmenu();
            System.out.println("Harga Nasi Kucing Rp. 2.000");
            System.out.print("Mau pesan berapa porsi ? ");
            Nci.setjml4(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan anda " +Nci.getjml4()+" porsi, seharga Rp."+Nci.getT4());
            System.out.println("Telah ditambahkan ke dalam tagihan");
            break;

            case 5 :
            Nlb.setNama("Naslumb");
            Nlb.Infodaftarmenu();
            System.out.println("Harga Nasi Lumba-lumba Rp. 20.000");
            System.out.print("Mau pesan berapa porsi ? ");
            Nlb.setjml5(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan anda " +Nlb.getjml5()+" porsi, seharga Rp."+Nlb.getT5());
            System.out.println("Telah ditambahkan ke dalam tagihan");
            break;
            
            case 6 :
            Nus.setNama("Naspaus");
            Nus.Infodaftarmenu();
            System.out.println("Harga Nasi Paus Rp. 35.000");
            System.out.print("Mau pesan berapa porsi ? ");
            Nus.setjml6(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan anda " +Nus.getjml6()+" porsi, seharga Rp."+Nus.getT6());
            System.out.println("Telah ditambahkan ke dalam tagihan");
            break;
            
            case 7:
            System.out.println();
            System.out.println("Anda Membatalkan Pemesanan, Silakan Datang Kembali !");
            System.out.println();
            System.out.println();
            System.exit(0);
            
        }
        System.out.println();
        System.out.println("Ingin meneruskan pesanan ? / mengakhiri pesanan ?");
                System.out.print("Untuk meneruskan (enter : Y (ya) atau tidak meneruskan (enter : T (tidak) ? : ");
                ulang = input.next().charAt(0);
                System.out.println();
                System.out.print("\u001B[2J");
                
            }
            while (ulang !='t');
            TK=(Nym.getT1()+Nli.getT2()+Nri.getT3()+Nci.getT4()+Nlb.getT5()+Nus.getT6());
            System.out.println("Keseluruhan Daftar Menu Yang Telah Di Pesan");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("1. Nasi Ayam Seharga Rp. 8.000 sebanyak "+Nym.getjml1()+" porsi, dengan total harga Rp."+Nym.getT1());
            System.out.println();
            System.out.println("2. Nasi Kebuli seharga Rp. 10.000 sebanyak "+Nli.getjml2()+" porsi, dengan total harga Rp."+Nli.getT2());
            System.out.println();
            System.out.println("3. Nasi Teri seharga Rp. 4.000 sebanyak "+Nri.getjml3()+" porsi, dengan total harga Rp."+Nri.getT3());
            System.out.println();
            System.out.println("4. Nasi Kucing seharga Rp. 2.000 sebanyak "+Nci.getjml4()+" porsi, dengan total harga Rp."+Nci.getT4());
            System.out.println();
            System.out.println("5. Nasi Lumba-lumba seharga Rp. 20.000 sebanyak "+Nlb.getjml5()+" porsi, dengan total harga Rp."+Nlb.getT5());
            System.out.println();
            System.out.println("6. Nasi Paus seharga Rp. 35.000 sebanyak "+Nus.getjml6()+" porsi, dengan total harga Rp."+Nus.getT6());
            System.out.println();
            System.out.println();
            System.out.println("Total Seluruh Tagihan Yang Harus Di Bayar Adalah Rp."+TK);
            System.out.println();
            System.out.println("Terimakasih Telah Datang Dan Memesan Di Caping Alaska ^^");
            System.out.println();
            System.out.println();
            input.close();
            
        }
    }