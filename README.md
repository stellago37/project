# 나는 어떤 패션유형?

### 개발목표: 마케팅 도구, 신규 고객 유입을 유도, 구매 장려
### 개발도구: `eclipse`, `java`

[패션 테스트 결과 출력되는 유형 8가지](https://www.notion.so/58301f73d96443df874ea38bbed9eb46)

| test type | contents |
|-----------|----------|
| 본투비패셔니스타         | 옷에 대한 관심도 열정도 많은 당신.당신만의 스타일이 있네요. 당신의 옷 스타일이 어떤지 궁금해지네요        |
| 패셔니스타준비형         | 옷에 관심이 많고 노력도 많이 하는 군요. 입고 싶지만 선뜻 도전하지 못한 옷까지 입어본다면 당신은 완성형 패셔니스타가 될 수 있어요. 내일 당장 그 옷을 꺼내 입어보는 건 어떨까요?        |
| 4         | 5        |
| 6         | 7        |
| 8         | 9        |
| 2         | 3        |
| 1         | 2        |
| 3         | 4        |


- 개발 구조

    ![class structure](https://user-images.githubusercontent.com/80409179/113501514-8f639800-9560-11eb-8786-cca9bd2886ee.png)


```java
[**테스트 질문 내역]**

	**public QuestionsDB() {
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
}**

[**테스트 답 구현]**

**results.add(new Result("본투비패셔니스타","옷에 대한 관심도 열정도 많은 당신.당신만의 스타일이 있네요. 당신의 옷 스타일이 어떤지 궁금해지네요"));//All +. 옷말고 다른 관심은 무엇?
	results.add(new Result("패셔니스타준비형","옷에 관심이 많고 노력도 많이 하는 군요. 입고 싶지만 선뜻 도전하지 못한 옷까지 입어본다면 당신은 완성형 패셔니스타가 될 수 있어요. 내일 당장 그 옷을 꺼내 입어보는 건 어떨까요?")); //effort +, interest +, self -
	results.add(new Result("사회생활형","적재적소에 알맞은 옷을 입는 걸 선호하는 당신. 이번 겨울엔 나를 위해 트렌디한 겨울 옷 하나 장만해보는건 가져보는 건 어떨까요?"));//Effort +, interest -, self +
	results.add(new Result("노력형","옷을 잘 입으려고 노력하지 않아도 되요. 당신은 당신만으로 빛나는 사람이에요."));//Effort +, interest -, self -
	results.add(new Result("마이웨이형","유행에 좌우되지 않는 당신. 당신은 당신만의 패셔니스타입니다"));//effort -, interest +, self +
	results.add(new Result("유행관심형","당신의 기분을 전환 할 유행 템 한 가지를 당신을 위해 사보는 건 어떨까요?"));//effort -, interest +, self -
	results.add(new Result("No관심러형","당신의 관심은 옷이 아니군요? 당신의 관심사가 궁금해지네요"));//effort -, interest -, self +
	results.add(new Result("내가좋아하는건뭐지","올 겨울 당신만을 위한 스웨터 하나를 구매하는건 어떨까요? 나를 위한 선물을 샀다는 사실만으로도 기분이 좋아질거에요.")); //effort -, interest -, self -
}**
```

```java
**[테스트 구현 로직]

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
}**
```
