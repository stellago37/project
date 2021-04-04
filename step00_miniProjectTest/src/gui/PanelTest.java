package gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dailyfashion.model.QuestionsDB;
import dailyfashion.service.QuestionService;
import dailyfashion.service.ResultService;

public class PanelTest extends Frame implements ActionListener {
	QuestionService user = new QuestionService();
	QuestionsDB db = new QuestionsDB();
	Frame frame = new Frame();
	private Panel p1, p2, p3, p4, p5, p6, p7;
	private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;
	private TextField t1, t2, t3, t4, t5, t6, t7;
	
	public PanelTest() {

		setLayout(new FlowLayout());
//		setLayout(new BorderLayout());

		p1 = new Panel();
		t1 = new TextField(db.getQuestionList().get(0).getQuestion(), 100);
		b1 = new Button(db.getQuestionList().get(0).getAnswer());
		b2 = new Button("없다!");
		
		p2 = new Panel();
		t2 = new TextField(db.getQuestionList().get(1).getQuestion(), 100);
		b3 = new Button(db.getQuestionList().get(1).getAnswer());
		b4 = new Button(db.getQuestionList().get(1).getAnsalt());
		b5 = new Button("없다");
		
		p3 = new Panel();
		t3 = new TextField(db.getQuestionList().get(2).getQuestion(), 100);
		b6 = new Button(db.getQuestionList().get(2).getAnswer());
		b7 = new Button(db.getQuestionList().get(2).getAnsalt());
		b8 = new Button("나름 주기적으로");

		p4 = new Panel();
		t4 = new TextField(db.getQuestionList().get(3).getQuestion(), 100);
		b9 = new Button(db.getQuestionList().get(3).getAnswer());
		b10 = new Button(db.getQuestionList().get(3).getAnsalt());
		b11 = new Button("1분이면 돼!");
		
		p5 = new Panel();
		t5 = new TextField(db.getQuestionList().get(4).getQuestion(), 100);
		b12 = new Button(db.getQuestionList().get(4).getAnswer());
		b13 = new Button("No!");

		p6 = new Panel();
		t6 = new TextField(db.getQuestionList().get(5).getQuestion(), 100);
		b14 = new Button(db.getQuestionList().get(5).getAnswer());
		b15 = new Button("안입는다");
		
		p7 = new Panel();
		// 재료들을 컨테이너에 담아준다.

		p1.add(new Label("Q1"));
		p1.add(t1);
		p1.add(b1);
		p1.add(b2);
		
		p2.add(new Label("Q2"));
		p2.add(t2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		
		p3.add(new Label("Q3"));
		p3.add(t3);
		p3.add(b6);
		p3.add(b7);
		p3.add(b8);

		p4.add(new Label("Q4"));
		p4.add(t4);
		p4.add(b9);
		p4.add(b10);
		p4.add(b11);
		
		p5.add(new Label("Q5"));
		p5.add(t5);
		p5.add(b12);
		p5.add(b13);
		
		p6.add(new Label("Q6"));
		p6.add(t6);
		p6.add(b14);
		p6.add(b15);
		
//		this.add(p1, BorderLayout.CENTER);
//		this.add(p2, BorderLayout.CENTER);
//		this.add(p3, BorderLayout.CENTER);
//		this.add(p4, BorderLayout.CENTER);
//		this.add(p5, BorderLayout.CENTER);
//		this.add(p6, BorderLayout.CENTER);
		
//		frame.add(p1, "Center");
//		frame.add(p2, "Center");
//		frame.add(p3, "Center");
//		frame.add(p4, "Center");
//		frame.add(p5, "Center");
//		frame.add(p6, "Center");
		
//		add(frame);
		add(p1, "Center");
		add(p2, "Center");
		add(p3, "Center");
		add(p4, "Center");
		add(p5, "Center");
		add(p6, "Center");
		add(p7);
		

		// 각각의 라벨의 배경색깔을 바꾼다.

//		p1.setBackground(Color.BLUE);
//		p2.setBackground(Color.MAGENTA);

		// 버튼이 눌리면 ActionListener 메서드가 호출되도록 한다.

		b1.addActionListener(this); // ActionEvent 메서드와 같은 클래스에 있기 때문에 this
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);

		// 화면크기와 실행 위치까지 정할 수 있다.

		setSize(1000, 300);

		// 화면에 보여지게끔 설정을 해준다.(출력)

		setVisible(true);
		p1.setVisible(true);
		p2.setVisible(false);
		p3.setVisible(false);
		p4.setVisible(false);
		p5.setVisible(false);
		p6.setVisible(false);
		p7.setVisible(false);

//		addWindowListener(new WindowAdapter() {
//			public void WindowClosing(WindowEvent e) {
//				dispose();
//				System.exit(0);
//			}
//		});
		
	}

	// ActionListener 상속받아 메서드를 오버라이드 한다. 버튼을 누르면 메서드가 호출돤다.

	@Override

	public void actionPerformed(ActionEvent arg0) {
//		DailyClothsController user = new DailyClothsController();
//		QuestionService user = new QuestionService();
		String cmd = arg0.getActionCommand(); // 버튼이 가지고 있는 레이블 값만 뽑아온다.

		if (cmd.equals("있다!")) {
			p1.setVisible(false);
			p2.setVisible(true);
			user.questioning0("있다!");
		} else if (cmd.equals("없다!")) {
			p1.setVisible(false);
			p2.setVisible(true);
			user.questioning0("없다!");
		} else if (cmd.equals("15개 이상")) {
			p2.setVisible(false);
			p3.setVisible(true);
			user.questioning1("15개 이상");
		} else if (cmd.equals("3개 이상")) {
			p2.setVisible(false);
			p3.setVisible(true);
			user.questioning1("3개 이상");
		} else if (cmd.equals("없다")) {
			p2.setVisible(false);
			p3.setVisible(true);
			user.questioning1("없다");
		} else if (cmd.equals("굳이 사야하나?")) {
			p3.setVisible(false);
			p4.setVisible(true);
			user.questioning2("굳이 사야하나?");
		} else if (cmd.equals("계절이 바뀌면")) {
			p3.setVisible(false);
			p4.setVisible(true);
			user.questioning2("계절이 바뀌면");
		} else if (cmd.equals("나름 주기적으로")) {
			p3.setVisible(false);
			p4.setVisible(true);
			user.questioning2("나름 주기적으로");
		} else if (cmd.equals("전날 미리 정한다")) {
			p4.setVisible(false);
			p5.setVisible(true);
			user.questioning3("전날 미리 정한다");
		} else if (cmd.equals("10분이상")) {
			p4.setVisible(false);
			p5.setVisible(true);
			user.questioning3("10분이상");
		} else if (cmd.equals("1분이면 돼!")) {
			p4.setVisible(false);
			p5.setVisible(true);
			user.questioning3("1분이면 돼!");
		} else if (cmd.equals("Yes")) {
			p5.setVisible(false);
			p6.setVisible(true);
			user.questioning4("Yes");
		} else if (cmd.equals("No!")) {
			p5.setVisible(false);
			p6.setVisible(true);
			user.questioning4("No!");
		} else if (cmd.equals("입는다")) {
			p6.setVisible(false);
			user.questioning5("입는다");
			t7 = new TextField(ResultService.resultCalculator(user).toString(), 100);
			p7.add(t7);
			p7.setVisible(true);
		} else {
			p6.setVisible(false);
			user.questioning5("안입는다");
			t7 = new TextField(ResultService.resultCalculator(user).toString(), 100);
			p7.add(t7);
			p7.setVisible(true);
		}
	}

	public static void main(String[] args) {
		new PanelTest();// 클래스를 호출하는 인스턴스 생성, 자기 자신이기 때문에 클래스 이름 생략
	}
}

//돌아가는 기능 있으면 좋겠다. reset
