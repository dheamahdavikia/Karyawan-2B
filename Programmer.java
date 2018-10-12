public class Programmer extends Karyawan {
	public void tambahgaji(int tambahgaji){
		System.out.println("GAJI "+ gaji);
		if ((gaji+tambahgaji)<=gajiProg){
			gaji+=tambahgaji;
			System.out.println("GAJI DITAMBAH:"+tambahgaji);
			System.out.println("GAJI ANDA:"+gaji);
		}
		else {
			gaji=gajiProg;
			System.out.println("GAJI MAXIMAL");
		}

	}
		
	public void tambahgaji(int tambahgaji, String pesan){
		if ((gaji+tambahgaji)<=gajiProg){
			gaji+=tambahgaji;
			System.out.println("GAJI DITAMBAH:"+tambahgaji);
			System.out.println("GAJI ANDA:"+gaji);
			System.out.println(pesan);
		}
		else {
			gaji=gajiProg;
			System.out.println("GAJI MAXIMAL");
			System.out.println("GAJI ANDA:"+gaji);
		}

	}
	

}
	
