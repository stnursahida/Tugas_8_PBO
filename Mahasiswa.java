public class Mahasiswa{
	String nama,prodi;
	int NIM;
	
	public Mahasiswa(String nm,String prodi,int nim){
	this.nama= nm;
	this.prodi = prodi;
	this.NIM= nim;
	}
	
	public static void main(String[] args){
		Mahasiswa A = new Mahasiswa("Siti Nursahida Imlan","Teknik Informtaika",180104);
		System.out.print("Biodata Mshasiswa : ");
		System.out.print("\n NAMA : "+A.nama+"\n Prodi : "+A.prodi+"\n Stambuk : "+A.NIM);
	}
}