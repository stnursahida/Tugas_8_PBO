public class MetodStatik{
	public static String Aksara = "   KABAMAFIKOM UMI";
	
	public static void tampilAksara(){
		System.out.println(Aksara);
	}
	
	public static void tampilNama(String nama){
		System.out.println("Terdiri dari dua prodi yakni "+nama);
	}
	public static void main(String[] args){
		tampilAksara();
		tampilNama("Teknik Informatika & Sistem Informasi");
	}
}