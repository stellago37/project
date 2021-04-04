package dailyfashion.service;

import java.util.ArrayList;

import dailyfashion.model.QuestionsDB;
import dailyfashion.model.dto.Category;
import dailyfashion.model.dto.Question;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j

public class QuestionService {
	QuestionsDB contentsdb = new QuestionsDB();
	ArrayList<Question> questions = contentsdb.getQuestionList();
	Category category = new Category();
	
	public void questioning0(String answer) {
		Question question0 = questions.get(0);
		//��� ������ �ϴ� ���. �ｺ���� ���� ������ ���� �ִ�? ����?
		if(answer.equals(question0.getAnswer())) {
			category.addEffort(1);
			category.addInterest(1);
			category.addSelf(1);
			log.info("1�� ������ 1�� ����� ���");
		} else {
			category.minusEffort(1);
			category.minusInterest(1);
			category.minusSelf(1);
			log.info("1�� ������ 2�� ����� ���");
		}
	}
	
	public void questioning1(String answer) {
		Question question1 = questions.get(1);
		//����� �ƴ� ������ ������ ���?
		if(answer.equals(question1.getAnswer())) {
			category.addEffort(1);
			category.addInterest(2);
			category.minusSelf(1);
			log.info("2�� ������ 1�� ����� ���");
		}else if(answer.equals(question1.getAnsalt())){
			category.addInterest(1);
			log.info("2�� ������ 2�� ����� ���");
		}else {
			category.minusEffort(1);
			category.minusInterest(1);
			category.addSelf(1);
			log.info("2�� ������ 3�� ����� ���");
		}
		
	}
	

	public void questioning2(String answer) {
		Question question2 = questions.get(2);
		//���� �� ���� �ƴ�. ����� �󸶸��� ���� �糪��?
		if(answer.equals(question2.getAnswer())) {
			category.minusInterest(2);
			category.minusEffort(1);
			log.info("3�� ������ 1�� ����� ���");
		} else if (answer.equals(question2.getAnsalt())) {
			log.info("3�� ������ 2�� ����� ���");
		} else {
			category.addEffort(1);
			category.addInterest(1);
			log.info("3�� ������ 3�� ����� ���");
		}
		
	}

	public void questioning3(String answer) {
		Question question3 = questions.get(3);
		//�߿��� ����� �ִ�. ����� ���� ���µ� �󸶳� �ɸ�����?
		if(answer.equals(question3.getAnswer())) {
			category.addEffort(2);
			log.info("4�� ������ 1�� ����� ���");
		} else if (answer.equals(question3.getAnsalt())) {
			category.addInterest(1);
			log.info("4�� ������ 2�� ����� ���");
		} else {
			category.minusInterest(1);
			category.minusEffort(1);
			log.info("4�� ������ 3�� ����� ���");
		}
		
	}
	
	public void questioning4(String answer) {
		Question question4 = questions.get(4);
		//���� �� ¦�� ���� ��, ����ϳ���?
		if(answer.equals(question4.getAnswer())) {
			log.info("5�� ������ 1�� ����� ���");
		} else {
			log.info("5�� ������ 2�� ����� ���");
		}
		
	}	
	
	public void questioning5(String answer) {
		Question question5 = questions.get(5);
		//�� ���� ��� �� ���� ��µ� ģ���� ���� �ϸ� �������� �� ���� �Դ´� �� �Դ´�?
		if(answer.equals(question5.getAnswer())) {
			category.addSelf(2);
			log.info("6�� ������ 1�� ����� ���");
		} else {
			category.minusSelf(2);
			log.info("6�� ������ 2�� ����� ���");
		}
		
	}

}
