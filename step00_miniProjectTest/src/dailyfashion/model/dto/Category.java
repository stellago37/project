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
@ToString

public class Category {
	private int interest = 0;
	private int effort = 0;
	private int self = 0;

	public void addInterest() {
		this.interest = interest + 1;
	}
	
	public void addInterest(int i) {
		for (int j = 0 ; j < i; j ++) {
			this.interest = interest + 1;
		}
	}
	public void minusInterest() {
		this.interest = interest - 1;
	}
	
	public void minusInterest(int i) {
		for (int j = 0 ; j < i; j ++) {
			this.interest = interest - 1;
		}
	}
	public void addEffort() {
		this.effort = effort + 1;
	}
	
	public void addEffort(int i) {
		for (int j = 0 ; j < i; j ++) {
			this.effort = effort + 1;
		}
	}
	public void minusEffort() {
		this.effort = effort - 1;
	}
	public void minusEffort(int i) {
		for (int j = 0 ; j < i; j ++) {
			this.effort = effort - 1;
		}
	}
	
	public void addSelf() {
		this.self = self + 1;
	}
	
	public void addSelf(int i) {
		for (int j = 0 ; j < i; j ++) {
			this.self = self + 1;
		}
	}
	public void minusSelf() {
		this.self = self - 1;
	}
	
	public void minusSelf(int i) {
		for (int j = 0 ; j < i; j ++) {
			this.self = self - 1;
		}
	}
}
