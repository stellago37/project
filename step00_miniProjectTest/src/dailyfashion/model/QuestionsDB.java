package dailyfashion.model;

import java.util.ArrayList;

import dailyfashion.model.dto.Question;

public class QuestionsDB {
	private ArrayList<Question> questions = new ArrayList();

	public QuestionsDB() {
		questions.add(new Question("운동을 열심히 하는 당신, 오늘도 헬스장에 갑니다. 헬스장 전용 나만의 운동복이 있나요?","있다!",null));
		questions.add(new Question("당신이 아는 패션 유행템 갯수는 몇 가지인가요? ","15개 이상","3개 이상")); //"없다" 
		questions.add(new Question("옷을 살 때가 됐습니다. 당신은 얼마만에 옷을 사나요?","굳이 사야하나?","계절이 바뀌면"));//3번째 답변이 2 달 내외 에 else로 빠지도록
		questions.add(new Question("중요한 약속이 있다. 당신은 옷을 고르는데 얼마나 걸리나요?","전날 미리 정한다", "10분이상")); //마지막 대답은 1분이면 돼. 3지선다
		questions.add(new Question("어제 내 짝꿍 입은 옷, 기억하나요?","Yes",null)); //2지선다
		questions.add(new Question("내 맘에 드는 새 옷을 산 당신. 기분좋게 친구들 모임에 입고 나갔다. 그런데 갑자기 친구가 당신에게 말한다. "
				+ "\"야 그 옷 뭐냐?\" 느껴지는 별로라는 말투...다음부터 당신은 그 옷을 입는다? 안 입는다?", "입는다", null)); //2지선다
	}

	public ArrayList<Question> getQuestionList() {
		return questions;
	}
}
