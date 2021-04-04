package dailyfashion.model;

import java.util.ArrayList;

import dailyfashion.model.dto.Question;

public class QuestionsDB {
	private ArrayList<Question> questions = new ArrayList();

	public QuestionsDB() {
		questions.add(new Question("��� ������ �ϴ� ���, ���õ� �ｺ�忡 ���ϴ�. �ｺ�� ���� ������ ����� �ֳ���?","�ִ�!",null));
		questions.add(new Question("����� �ƴ� �м� ������ ������ �� �����ΰ���? ","15�� �̻�","3�� �̻�")); //"����" 
		questions.add(new Question("���� �� ���� �ƽ��ϴ�. ����� �󸶸��� ���� �糪��?","���� ����ϳ�?","������ �ٲ��"));//3��° �亯�� 2 �� ���� �� else�� ��������
		questions.add(new Question("�߿��� ����� �ִ�. ����� ���� ���µ� �󸶳� �ɸ�����?","���� �̸� ���Ѵ�", "10���̻�")); //������ ����� 1���̸� ��. 3������
		questions.add(new Question("���� �� ¦�� ���� ��, ����ϳ���?","Yes",null)); //2������
		questions.add(new Question("�� ���� ��� �� ���� �� ���. ������� ģ���� ���ӿ� �԰� ������. �׷��� ���ڱ� ģ���� ��ſ��� ���Ѵ�. "
				+ "\"�� �� �� ����?\" �������� ���ζ�� ����...�������� ����� �� ���� �Դ´�? �� �Դ´�?", "�Դ´�", null)); //2������
	}

	public ArrayList<Question> getQuestionList() {
		return questions;
	}
}
