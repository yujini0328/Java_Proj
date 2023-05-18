package Chapter08.Ex04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Data
@AllArgsConstructor

public class Member {
	
	private long memberNo;
	private String memberID;
	private String  memberPass;
	private String memberEmail;
	private int memberAge;

}
