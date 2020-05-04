public class BioDosen{
	private String nidn;
	private String namaDosen;
	private String jurusan;
	private String fakultas;
	private String email;
	
	
	//method setter
	public void setNIDN(String nidn){
		this.nidn = nidn;
	}
	
	public void setnamaDosen(String namaDosen){
		this.namaDosen = namaDosen;
	}
	
	public void setjurusan(String jurusan){
		this.jurusan = jurusan;
	}
	
	public void setfakultas(String fakultas){
		this.fakultas = fakultas;
	}
	
	public void setemail(String email){
		this.email = email;
	}
	//method getter
	public String getnidn(){
		return this.nidn;
	}
	
	public String getnamaDosen(){
		return this.namaDosen;
	}
	
	public String getjurusan(){
		return this.jurusan;
	}
	
	public String getfakultas(){
		return this.fakultas;
	}
	
	public String getemail(){
		return this.email;
	}
}