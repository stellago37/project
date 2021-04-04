
package dailyfashion.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Result {
	String type;
	String explanation;
	
	@Override
	public String toString() {
		return "����� �м� ������? " + type + "    " + explanation;
	}
}
