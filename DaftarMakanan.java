import java.util.Scanner;
   
public class DaftarMakanan {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
     

    int pilih;
    double jumlah,total1=0,total2=0,total3=0,total4=0,total5=0,total6=0,total_keseluruhan;
    char ulang;
     
    do {
		System.out.println("Warung Klotok");
		System.out.println("Caping Alaska");
		System.out.println("---------------");
		System.out.println("1. Nasi Ayam");
		System.out.println("2. Nasi Kebuli");
		System.out.println("3. Nasi Teri");
		System.out.println("4. Nasi Kucing");
		System.out.println("5. Nasi Lumba-lumba");
		System.out.println("6. Nasi Paus");
		System.out.println("7. Keluar - Tidak Jadi Memesan");
		System.out.println("----------------");
		System.out.println("Pilih [1-7] :");
       
      System.out.print("Sebutkan pilihan anda : ");
      pilih = input.nextInt();
    
      switch(pilih) {
		case 1:
			System.out.print("Nasi Ayam At 8K, beli berapa porsi = ");
			jumlah=input.nextDouble();
			total1=jumlah*8000;
			System.out.println("Nasi Ayam yang kamu pesan seharga = Rp."+total1);
                        break;
		case 2:
			System.out.print("Nasi Kebuli At 10k, beli berapa porsi =");
			jumlah=input.nextDouble();
			total2=jumlah*10000;
			System.out.println("Nasi Kebuli yang kamu pesan seharga = Rp."+total2);
                        break;
		case 3:
			System.out.print("Nasi Teri At 4k , beli berapa porsi =");
			jumlah=input.nextDouble();
			total3=jumlah*4000;
			System.out.println("Nasi Teri yang kamu pesan seharga = Rp."+total3);
                        break;
		case 4:
			System.out.print("Nasi Kucing At 2k, beli berapa porsi =");
			jumlah=input.nextDouble();
			total4=jumlah*2000;
			System.out.println("Nasi Kucing yang kamu pesan seharga = Rp."+total4);
                        break;
		case 5:
			System.out.print("Nasi Lumba-lumba At 20k, beli berapa porsi =");
			jumlah=input.nextDouble();
			total5=jumlah*20000;
			System.out.println("Nasi Lumba-lumba yang kamu pesan seharga = Rp."+total5);
                        break;
		case 6:
			System.out.print("Nasi Paus At 35k,mau beli berapa porsi =");
			jumlah=input.nextDouble();
			total6=jumlah*35000;
			System.out.println("Nasi Paus yang kamu pesan seharga = Rp."+total6);
                        break;
                case 7:
                        System.out.println("Tidak Jadi Memesan, Terkesan Tidak Mampu ");
                        System.exit(0);
			
		}
    
      System.out.println();
    
      System.out.println("Ingin meneruskan pesanan ? / mengakhiri pesanan ?");
      System.out.print("y/n ? : ");
      ulang = input.next().charAt(0);
       
      System.out.println();
    }
    while (ulang!= 'n');
    
   total_keseluruhan=(total1+total2+total3+total4+total5+total6);
   System.out.println("Total Pesanan = "+total1+" + "+total2+" + "+total3+" + "+total4+" + "+total5+" + "+total6+" = "+total_keseluruhan);
   System.out.println("Terimakasih Telah Memesan");
  
  }
}
