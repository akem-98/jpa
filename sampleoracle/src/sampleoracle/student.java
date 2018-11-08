package sampleoracle;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	  private int Id;
	  private String Ename;
	  private int fee;
	  private int numb;
	  
	  public int getId() {
	   return Id;
	  }
	  public void setId(int id) {
	   Id = id;
	  }
	  public String getEname() {
	   return Ename;
	  }
	  public void setEname(String ename) {
	   Ename = ename;
	  }
	  public int getFee() {
	   return fee;
	  }
	  public void setFee(int fee) {
	   this.fee = fee;
	  }
	  public int getNum() {
	   return numb;
	  }
	  public void setNum(int numb) {
	   this.numb = numb;
	  }
	  public student(int id, String ename, int fee, int numb) {
	   super();
	   Id = id;
	   Ename = ename;
	   this.fee = fee;
	   this.numb = numb;
	  }
	  public student() {
	   super();
	   // TODO Auto-generated constructor stub
	  }
	  @Override
	  public String toString() {
	   return "student [Id=" + Id + ", Ename=" + Ename + ", fee=" + fee + ", num=" + numb +"]";
	  }
}