public class KaryawanTest{
	public static void main(String[] args) {
		Designer d =new Designer();
		PM m = new PM();
		Programmer p= new Programmer();

			System.out.println("=====DESIGNER=====");
			d.setnama("DHEA MAHDAVIKIA");
			System.out.println(d.getnama());
			d.setalamat("INDRAMAYU");
			System.out.println(d.getalamat());
			d.tambahgaji(20, "ANDA SEORANG DESIGNER yang HEBAT");
			d.tambahgaji(20);
			
			
			System.out.println("===============================");
			
			System.out.println("=====PROJECT MANAGER=====");
			m.setnama("DHEAaaaaa");
			System.out.println(m.getnama());
			m.setalamat("JAKARTA");
			System.out.println(m.getalamat());
			m.tambahgaji(80, "ANDA SEORANG PROJECT MANAGER yang HEBAT");
			m.tambahgaji(20);
			
			System.out.println("===============================");
			
			System.out.println("=====PROGRAMMER=====");
			p.setnama("LALAAAAA");
			System.out.println(p.getnama());
			p.setalamat("BANDUNG");

			System.out.println(p.getalamat());
			p.tambahgaji(90, "Anda seorang PROGRAMMER yang HEBAT");
			p.tambahgaji(50);
		
		System.out.println("===============================");
		
	}
}