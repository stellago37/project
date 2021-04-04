/** 
 * PROJECT  : ��ɱ�� ������Ʈ
 * NAME  :  TalentDonationController.java
 * DESC  :  ����ڷ� ���� ���� ��û�� ó���ϴ� Ŭ����
 * 			Model ���� �� View ����
 * 
 * @author  
 * @version 1.0
*/

package dailyfashion.controller;

import java.util.ArrayList;

import dailyfashion.exception.DuplicateException;
import dailyfashion.exception.NotExistException;
import dailyfashion.service.QuestionService;
import dailyfashion.service.ResultService;
//import dailyfashion.service.TalentDonationProjectService;

public class DailyClothsController {
//	private static DailyClothsController instance = new DailyClothsController();
	QuestionService user = new QuestionService();	
	
	public DailyClothsController() {
	}

//	public static DailyClothsController getInstance() {
//		return instance;
//	}

	public void questioning0(String answer) {
		user.questioning0(answer);
	}
	
	public void questioning1(String answer) {
		user.questioning1(answer);
	}
	
	public void questioning2(String answer) {
		user.questioning2(answer);
	}
	
	public void questioning3(String answer) {
		user.questioning3(answer);
	}
	
	public void questioning4(String answer) {
		user.questioning4(answer);
	}
	
	public void questioning5(String answer) {
		user.questioning5(answer);
	}
	
	public String getResult() {
		return ResultService.resultCalculator(user).toString();
	}
	
	
	/**
	 * ��� ������Ʈ �˻�
	 * @return 
	 */
//	public ArrayList<Cloth> getClothList() {
//		ArrayList<Cloth> clothList = service.getClothsList();
//
//		if (clothList.size() != 0) {
//			return clothList;
//		} else {
//			return null;
//		}
//	}

	// TO DO
	/**
	 * ������Ʈ �̸����� Ư�� ������Ʈ �˻�
	 * 
	 * @param projectName
	 */
//	public void getProject(String clothname) {
//		Cloth cloth = service.getClothByName(clothname);
//		EndView.projectView(cloth);
//	}

	// TO DO
	/**
	 * ���ο� ������Ʈ ����
	 * 
	 * @param newProject
	 */
//	public void insertProject(Cloth newCloth) {
//		if (newCloth != null) {
//			try {
//				service.clothInsert(newCloth);
//			} catch (DuplicateException e) {
//				FailView.failMessageView(e.getMessage());
//			}
//		} else {
//			EndView.messageView("���� �����ϰ��� �ϴ� ���� �Է� ������ ��ȿ�մϴ�. ��Ȯ�� �� �ּ���");
//		}
//	}

	/**
	 * �����ϴ� ������Ʈ�� ����� ���� ������Ʈ �̸����� �˻��ؼ� �ش��ϴ� ������Ʈ�� ����� ����
	 * 
	 * @param projectName
	 * @param people
	 */
//	public void updateProjectDonator(String projectName, Condition people) {
//		if (people != null && projectName != null) {
//			try {
//				service.projectDonatorUpdate(projectName, people);
//			} catch (NotExistException e) {
//				FailView.failMessageView(e.getMessage());
//			}
//		} else {
//			EndView.messageView("�����ϰ��� �ϴ� ����� ������ ��ȿ�մϴ�, �� Ȯ�� �� �ּ���");
//		}
//	}

	// TO DO
	/**
	 * �����ϴ� ������Ʈ ������ ���� ������Ʈ �̸����� �˻��ؼ� �ش��ϴ� ������Ʈ�� ������ ����
	 * 
	 * @param projectName
	 * @param people
	 */
//	public void updateProjectBeneficiary(String projectName, ClothInfo people) {
//		if (people != null) {
//			try {
//				service.projectBeneficiaryUpdate(projectName, people);
//			} catch (NotExistException e) {
//				e.printStackTrace();
//				FailView.failMessageView(e.getMessage());
//			}
//		} else {
//			EndView.messageView("�����ϰ��� �ϴ� ������ ������ ��ȿ�մϴ�, �� Ȯ�� �� �ּ���");
//		}
//	}

	// TO DO
	/**
	 * ������Ʈ ������ �ش��ϴ� ������Ʈ ����
	 * 
	 * @param projectName
	 */
//	public void deleteProject(String clothname) {
//		try {
//			service.clothDelete(clothname);
//			EndView.messageView(clothname + "���� ����");
//		} catch (NotExistException e) {
//			FailView.failMessageView(e.getMessage());
//		}
//	}
}
