package dailyfashion.service;


import dailyfashion.model.ResultDB;
import dailyfashion.model.dto.Result;
import lombok.extern.slf4j.Slf4j;

@Slf4j

public class ResultService {

	public static Result resultCalculator(QuestionService user) {
		ResultDB resultlist = new ResultDB();

		int effort = user.getCategory().getEffort();
		int interest = user.getCategory().getInterest();
		int self = user.getCategory().getSelf();

		if (effort > 0) {
			if (interest > 0) {
				if (self > 0) {
					log.info("1번(본투비패셔니스타) 유형이 나온 기록");
					return resultlist.getResultList().get(0);
				} else {
					log.info("2번(패셔니스타준비형) 유형이 나온 기록");
					return resultlist.getResultList().get(1);
				}
			} else {
				if (self > 0) {
					log.info("3번(사회생활형) 유형이 나온 기록");
					return resultlist.getResultList().get(2);
				} else {
					log.info("4번(노력형) 유형이 나온 기록");
					return resultlist.getResultList().get(3);
				}
			}
		} else {
			if (interest > 0) {
				if (self > 0) {
					log.info("5번(마이웨이형) 유형이 나온 기록");
					return resultlist.getResultList().get(4);
				} else {
					log.info("6번(유행follower형) 유형이 나온 기록");
					return resultlist.getResultList().get(5);
				}
			} else {
				if (self > 0) {
					log.info("7번(No관심러) 유형이 나온 기록");
					return resultlist.getResultList().get(6);
				} else {
					log.info("8번(내가좋아하는건뭐지) 유형이 나온 기록");
					return resultlist.getResultList().get(7);
				}
			}
		}
	}
}
