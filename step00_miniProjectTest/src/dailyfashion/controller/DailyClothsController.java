/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  TalentDonationController.java
 * DESC  :  사용자로 부터 받은 요청을 처리하는 클래스
 * 			Model 갱신 및 View 제어
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
	 * 모든 프로젝트 검색
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
	 * 프로젝트 이름으로 특정 프로젝트 검색
	 * 
	 * @param projectName
	 */
//	public void getProject(String clothname) {
//		Cloth cloth = service.getClothByName(clothname);
//		EndView.projectView(cloth);
//	}

	// TO DO
	/**
	 * 새로운 프로젝트 저장
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
//			EndView.messageView("새로 저장하고자 하는 옷의 입력 정보가 무효합니다. 재확인 해 주세요");
//		}
//	}

	/**
	 * 존재하는 프로젝트의 기부자 수정 프로젝트 이름으로 검색해서 해당하는 프로젝트의 기부자 수정
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
//			EndView.messageView("수정하고자 하는 기부자 정보가 무효합니다, 재 확인 해 주세요");
//		}
//	}

	// TO DO
	/**
	 * 존재하는 프로젝트 수혜자 수정 프로젝트 이름으로 검색해서 해당하는 프로젝트의 수혜자 수정
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
//			EndView.messageView("수정하고자 하는 수혜자 정보가 무효합니다, 재 확인 해 주세요");
//		}
//	}

	// TO DO
	/**
	 * 프로젝트 명으로 해당하는 프로젝트 삭제
	 * 
	 * @param projectName
	 */
//	public void deleteProject(String clothname) {
//		try {
//			service.clothDelete(clothname);
//			EndView.messageView(clothname + "삭제 성공");
//		} catch (NotExistException e) {
//			FailView.failMessageView(e.getMessage());
//		}
//	}
}
