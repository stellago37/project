package dailyfashion.model;

import java.util.ArrayList;

import dailyfashion.model.dto.Result;

public class ResultDB {
	private ArrayList<Result> results = new ArrayList();

	public ResultDB() {
	results.add(new Result("�������мŴϽ�Ÿ","�ʿ� ���� ���ɵ� ������ ���� ���.��Ÿ��� ��Ÿ���� �ֳ׿�. ����� �� ��Ÿ���� ��� �ñ������׿�"));//All +. �ʸ��� �ٸ� ������ ����?
	results.add(new Result("�мŴϽ�Ÿ�غ���","�ʿ� ������ ���� ��µ� ���� �ϴ� ����. �԰� ������ ���� �������� ���� �ʱ��� �Ծ�ٸ� ����� �ϼ��� �мŴϽ�Ÿ�� �� �� �־��. ���� ���� �� ���� ���� �Ծ�� �� ����?")); //effort +, interest +, self -
	results.add(new Result("��ȸ��Ȱ��","�������ҿ� �˸��� ���� �Դ� �� ��ȣ�ϴ� ���. �̹� �ܿ￣ ���� ���� Ʈ������ �ܿ� �� �ϳ� �常�غ��°� �������� �� ����?"));//Effort +, interest -, self +
	results.add(new Result("�����","���� �� �������� ������� �ʾƵ� �ǿ�. ����� ��Ÿ����� ������ ����̿���."));//Effort +, interest -, self -
	results.add(new Result("���̿�����","���࿡ �¿���� �ʴ� ���. ����� ��Ÿ��� �мŴϽ�Ÿ�Դϴ�"));//effort -, interest +, self +
	results.add(new Result("���������","����� ����� ��ȯ �� ���� �� �� ������ ����� ���� �纸�� �� ����?"));//effort -, interest +, self -
	results.add(new Result("No���ɷ���","����� ������ ���� �ƴϱ���? ����� ���ɻ簡 �ñ������׿�"));//effort -, interest -, self +
	results.add(new Result("���������ϴ°ǹ���","�� �ܿ� ��Ÿ��� ���� ������ �ϳ��� �����ϴ°� ����? ���� ���� ������ ��ٴ� ��Ǹ����ε� ����� �������ſ���.")); //effort -, interest -, self -
}

	public ArrayList<Result> getResultList() {
		return results;
	}

}
