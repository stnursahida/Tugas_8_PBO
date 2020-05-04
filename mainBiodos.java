public class mainBiodos{
	public static void main(String[] args){
	//membuat objek dari class BioDosen
	BioDosen dosen = new BioDosen();
	
	//menggunakan method setter
	dosen.setNIDN("0906078701");
	dosen.setnamaDosen("Mardiyyah Hasnawi, S.Kom., M.T");
	dosen.setjurusan("Teknik Informatika");
	dosen.setfakultas("Ilmu Komputer");
	dosen.setemail("mardiyyah.hasnawi@umi.ac.id");
	
	//menggunakan method getter
	System.out.println("NIDN: "+dosen.getnidn());
	System.out.println("Nama Dosen: "+dosen.getnamaDosen());
	System.out.println("Jurusan: "+dosen.getjurusan());
	System.out.println("Fakultas: "+dosen.getfakultas());
	System.out.println("Email: "+dosen.getemail());
	}
}
