package biz;
import java.util.Scanner;
import dao.*;
import entity.SC;
import entity.Student;
import view.MainUI;

public class SCBiz {
	
	SCDao scDao=SCDao.getInstance();
	CourseDao courseDao = CourseDao.getInstance();
	sc = (SC) studentDao.getEntity(studentNo);
	//��ѡ
	public void choose (String studentNo ){
		String courseNo;
        System.out.println("*****�����ǿ�ѡ�Ŀγ�*****\n");
		System.out.println("\t001 ������");
		System.out.println("\t002 ��ѧӢ��");
		System.out.println("\t003 ��ѧ����");
		System.out.println("\t004 Java");
		
		System.out.println("������Ҫѡ��Ŀγ����\n");
		Scanner scanner = new Scanner(System.in);
		courseNo = scanner.nextLine();
		SC sc = new SC();
		sc.setCourseNo(courseNo);
		sc.setStudentNo(studentNo);
		//scDao = SCDao.getInstance();
		//scDao.insert();
		System.out.println("��ϲ������ѡ�ɹ���");
	}
    //��ѡ
    public void tuixuan(String studentNo  ){
		
	}
    //�鿴��ѡ���
    public void look ( String studentNo ){
		
	}
}
