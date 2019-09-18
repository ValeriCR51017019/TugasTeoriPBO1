/**
 * @(#)formdata.java
 *
 *
 * @author 
 * @version 1.00 2019/9/17
 */

import java.util.Scanner;
	public class formdata {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
		
				String nama1, alamat;
				int tahun;
				System.out.print("Masukkan nama: ");
				nama1=input.nextLine();
				System.out.print("Masukkan alamat: ");
				alamat=input.nextLine();
				System.out.print("Masukkan umur: ");
				tahun=input.nextInt();
				System.out.println();
			
			System.out.println("Saudara: "+nama1);
			System.out.println("Tinggal di: "+alamat);
			System.out.println("Berumur: "+tahun+" tahun");
	}
}
