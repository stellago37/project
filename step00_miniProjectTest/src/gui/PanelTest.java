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
		b2 = new Button("����!");
		
		p2 = new Panel();
		t2 = new TextField(db.getQuestionList().get(1).getQuestion(), 100);
		b3 = new Button(db.getQuestionList().get(1).getAnswer());
		b4 = new Button(db.getQuestionList().get(1).getAnsalt());
		b5 = new Button("����");
		
		p3 = new Panel();
		t3 = new TextField(db.getQuestionList().get(2).getQuestion(), 100);
		b6 = new Button(db.getQuestionList().get(2).getAnswer());
		b7 = new Button(db.getQuestionList().get(2).getAnsalt());
		b8 = new Button("���� �ֱ�������");

		p4 = new Panel();
		t4 = new TextField(db.getQuestionList().get(3).getQuestion(), 100);
		b9 = new Button(db.getQuestionList().get(3).getAnswer());
		b10 = new Button(db.getQuestionList().get(3).getAnsalt());
		b11 = new Button("1���̸� ��!");
		
		p5 = new Panel();
		t5 = new TextField(db.getQuestionList().get(4).getQuestion(), 100);
		b12 = new Button(db.getQuestionList().get(4).getAnswer());
		b13 = new Button("No!");

		p6 = new Panel();
		t6 = new TextField(db.getQuestionList().get(5).getQuestion(), 100);
		b14 = new Button(db.getQuestionList().get(5).getAnswer());
		b15 = new Button("���Դ´�");
		
		p7 = new Panel();
		// ������ �����̳ʿ� ����ش�.

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
		

		// ������ ���� �������� �ٲ۴�.

//		p1.setBackground(Color.BLUE);
//		p2.setBackground(Color.MAGENTA);

		// ��ư�� ������ ActionListener �޼��尡 ȣ��ǵ��� �Ѵ�.

		b1.addActionListener(this); // ActionEvent �޼���� ���� Ŭ������ �ֱ� ������ this
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

		// ȭ��ũ��� ���� ��ġ���� ���� �� �ִ�.

		setSize(1000, 300);

		// ȭ�鿡 �������Բ� ������ ���ش�.(���)

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

	// ActionListener ��ӹ޾� �޼��带 �������̵� �Ѵ�. ��ư�� ������ �޼��尡 ȣ��ô�.

	@Override

	public void actionPerformed(ActionEvent arg0) {
//		DailyClothsController user = new DailyClothsController();
//		QuestionService user = new QuestionService();
		String cmd = arg0.getActionCommand(); // ��ư�� ������ �ִ� ���̺� ���� �̾ƿ´�.

		if (cmd.equals("�ִ�!")) {
			p1.setVisible(false);
			p2.setVisible(true);
			user.questioning0("�ִ�!");
		} else if (cmd.equals("����!")) {
			p1.setVisible(false);
			p2.setVisible(true);
			user.questioning0("����!");
		} else if (cmd.equals("15�� �̻�")) {
			p2.setVisible(false);
			p3.setVisible(true);
			user.questioning1("15�� �̻�");
		} else if (cmd.equals("3�� �̻�")) {
			p2.setVisible(false);
			p3.setVisible(true);
			user.questioning1("3�� �̻�");
		} else if (cmd.equals("����")) {
			p2.setVisible(false);
			p3.setVisible(true);
			user.questioning1("����");
		} else if (cmd.equals("���� ����ϳ�?")) {
			p3.setVisible(false);
			p4.setVisible(true);
			user.questioning2("���� ����ϳ�?");
		} else if (cmd.equals("������ �ٲ��")) {
			p3.setVisible(false);
			p4.setVisible(true);
			user.questioning2("������ �ٲ��");
		} else if (cmd.equals("���� �ֱ�������")) {
			p3.setVisible(false);
			p4.setVisible(true);
			user.questioning2("���� �ֱ�������");
		} else if (cmd.equals("���� �̸� ���Ѵ�")) {
			p4.setVisible(false);
			p5.setVisible(true);
			user.questioning3("���� �̸� ���Ѵ�");
		} else if (cmd.equals("10���̻�")) {
			p4.setVisible(false);
			p5.setVisible(true);
			user.questioning3("10���̻�");
		} else if (cmd.equals("1���̸� ��!")) {
			p4.setVisible(false);
			p5.setVisible(true);
			user.questioning3("1���̸� ��!");
		} else if (cmd.equals("Yes")) {
			p5.setVisible(false);
			p6.setVisible(true);
			user.questioning4("Yes");
		} else if (cmd.equals("No!")) {
			p5.setVisible(false);
			p6.setVisible(true);
			user.questioning4("No!");
		} else if (cmd.equals("�Դ´�")) {
			p6.setVisible(false);
			user.questioning5("�Դ´�");
			t7 = new TextField(ResultService.resultCalculator(user).toString(), 100);
			p7.add(t7);
			p7.setVisible(true);
		} else {
			p6.setVisible(false);
			user.questioning5("���Դ´�");
			t7 = new TextField(ResultService.resultCalculator(user).toString(), 100);
			p7.add(t7);
			p7.setVisible(true);
		}
	}

	public static void main(String[] args) {
		new PanelTest();// Ŭ������ ȣ���ϴ� �ν��Ͻ� ����, �ڱ� �ڽ��̱� ������ Ŭ���� �̸� ����
	}
}

//���ư��� ��� ������ ���ڴ�. reset
