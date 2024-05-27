package banking;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class Accdetail {

	@Id
	private int Customerid;
	private String Customername;
	private String Address;
	private long mobno;
	private String password;
	private int bal;

}
