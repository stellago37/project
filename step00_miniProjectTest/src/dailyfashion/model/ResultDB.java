package dailyfashion.model;

import java.util.ArrayList;

import dailyfashion.model.dto.Result;

public class ResultDB {
	private ArrayList<Result> results = new ArrayList();

	public ResultDB() {
	results.add(new Result("본투비패셔니스타","옷에 대한 관심도 열정도 많은 당신.당신만의 스타일이 있네요. 당신의 옷 스타일이 어떤지 궁금해지네요"));//All +. 옷말고 다른 관심은 무엇?
	results.add(new Result("패셔니스타준비형","옷에 관심이 많고 노력도 많이 하는 군요. 입고 싶지만 선뜻 도전하지 못한 옷까지 입어본다면 당신은 완성형 패셔니스타가 될 수 있어요. 내일 당장 그 옷을 꺼내 입어보는 건 어떨까요?")); //effort +, interest +, self -
	results.add(new Result("사회생활형","적재적소에 알맞은 옷을 입는 걸 선호하는 당신. 이번 겨울엔 나를 위해 트렌디한 겨울 옷 하나 장만해보는건 가져보는 건 어떨까요?"));//Effort +, interest -, self +
	results.add(new Result("노력형","옷을 잘 입으려고 노력하지 않아도 되요. 당신은 당신만으로 빛나는 사람이에요."));//Effort +, interest -, self -
	results.add(new Result("마이웨이형","유행에 좌우되지 않는 당신. 당신은 당신만의 패셔니스타입니다"));//effort -, interest +, self +
	results.add(new Result("유행관심형","당신의 기분을 전환 할 유행 템 한 가지를 당신을 위해 사보는 건 어떨까요?"));//effort -, interest +, self -
	results.add(new Result("No관심러형","당신의 관심은 옷이 아니군요? 당신의 관심사가 궁금해지네요"));//effort -, interest -, self +
	results.add(new Result("내가좋아하는건뭐지","올 겨울 당신만을 위한 스웨터 하나를 구매하는건 어떨까요? 나를 위한 선물을 샀다는 사실만으로도 기분이 좋아질거에요.")); //effort -, interest -, self -
}

	public ArrayList<Result> getResultList() {
		return results;
	}

}
