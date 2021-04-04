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
					log.info("1��(�������мŴϽ�Ÿ) ������ ���� ���");
					return resultlist.getResultList().get(0);
				} else {
					log.info("2��(�мŴϽ�Ÿ�غ���) ������ ���� ���");
					return resultlist.getResultList().get(1);
				}
			} else {
				if (self > 0) {
					log.info("3��(��ȸ��Ȱ��) ������ ���� ���");
					return resultlist.getResultList().get(2);
				} else {
					log.info("4��(�����) ������ ���� ���");
					return resultlist.getResultList().get(3);
				}
			}
		} else {
			if (interest > 0) {
				if (self > 0) {
					log.info("5��(���̿�����) ������ ���� ���");
					return resultlist.getResultList().get(4);
				} else {
					log.info("6��(����follower��) ������ ���� ���");
					return resultlist.getResultList().get(5);
				}
			} else {
				if (self > 0) {
					log.info("7��(No���ɷ�) ������ ���� ���");
					return resultlist.getResultList().get(6);
				} else {
					log.info("8��(���������ϴ°ǹ���) ������ ���� ���");
					return resultlist.getResultList().get(7);
				}
			}
		}
	}
}
