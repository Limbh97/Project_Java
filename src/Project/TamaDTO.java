package Project;

public class TamaDTO {
	private String hp;
	private String exp;
	private String lv;
	
	//기본생성자
	TamaDTO(){
		
	}
	//매개변수가 있는 생성자
	public TamaDTO(String hp, String exp, String lv) {
		super();
		this.hp = hp;
		this.exp = exp;
		this.lv = lv;
	}
	
	//get, set
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getLv() {
		return lv;
	}
	public void setLv(String lv) {
		this.lv = lv;
	}
	
	//toString
	@Override
	public String toString() {
		return "TamaDTO [hp=" + hp + ", exp=" + exp + ", lv=" + lv + "]";
	}
	
	
	
	
}
