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
		//운동을 열심히 하는 당신. 헬스장을 위한 나만의 옷이 있다? 없다?
		if(answer.equals(question0.getAnswer())) {
			category.addEffort(1);
			category.addInterest(1);
			category.addSelf(1);
			log.info("1번 문제에 1번 대답한 기록");
		} else {
			category.minusEffort(1);
			category.minusInterest(1);
			category.minusSelf(1);
			log.info("1번 문제에 2번 대답한 기록");
		}
	}
	
	public void questioning1(String answer) {
		Question question1 = questions.get(1);
		//당신이 아는 유행템 갯수는 몇가지?
		if(answer.equals(question1.getAnswer())) {
			category.addEffort(1);
			category.addInterest(2);
			category.minusSelf(1);
			log.info("2번 문제에 1번 대답한 기록");
		}else if(answer.equals(question1.getAnsalt())){
			category.addInterest(1);
			log.info("2번 문제에 2번 대답한 기록");
		}else {
			category.minusEffort(1);
			category.minusInterest(1);
			category.addSelf(1);
			log.info("2번 문제에 3번 대답한 기록");
		}
		
	}
	

	public void questioning2(String answer) {
		Question question2 = questions.get(2);
		//옷을 살 때가 됐다. 당신은 얼마만에 옷을 사나요?
		if(answer.equals(question2.getAnswer())) {
			category.minusInterest(2);
			category.minusEffort(1);
			log.info("3번 문제에 1번 대답한 기록");
		} else if (answer.equals(question2.getAnsalt())) {
			log.info("3번 문제에 2번 대답한 기록");
		} else {
			category.addEffort(1);
			category.addInterest(1);
			log.info("3번 문제에 3번 대답한 기록");
		}
		
	}

	public void questioning3(String answer) {
		Question question3 = questions.get(3);
		//중요한 약속이 있다. 당신은 옷을 고르는데 얼마나 걸리나요?
		if(answer.equals(question3.getAnswer())) {
			category.addEffort(2);
			log.info("4번 문제에 1번 대답한 기록");
		} else if (answer.equals(question3.getAnsalt())) {
			category.addInterest(1);
			log.info("4번 문제에 2번 대답한 기록");
		} else {
			category.minusInterest(1);
			category.minusEffort(1);
			log.info("4번 문제에 3번 대답한 기록");
		}
		
	}
	
	public void questioning4(String answer) {
		Question question4 = questions.get(4);
		//어제 내 짝꿍 입은 옷, 기억하나요?
		if(answer.equals(question4.getAnswer())) {
			log.info("5번 문제에 1번 대답한 기록");
		} else {
			log.info("5번 문제에 2번 대답한 기록");
		}
		
	}	
	
	public void questioning5(String answer) {
		Question question5 = questions.get(5);
		//내 맘에 드는 새 옷을 샀는데 친구가 뭐라 하면 다음부터 그 옷을 입는다 안 입는다?
		if(answer.equals(question5.getAnswer())) {
			category.addSelf(2);
			log.info("6번 문제에 1번 대답한 기록");
		} else {
			category.minusSelf(2);
			log.info("6번 문제에 2번 대답한 기록");
		}
		
	}

}
