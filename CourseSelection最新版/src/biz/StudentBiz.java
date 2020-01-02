package biz;
import dao.StudentDao;
import entity.Student;
import view.MainUI;
public class StudentBiz {
	StudentDao studentDao;
	private Student student;
	//��¼
	public void login(String studentNo, String studentPassword) {
		studentDao = StudentDao.getInstance();
		student = (Student) studentDao.getEntity(studentNo);
		if (student == null) {
			System.out.println("\n���������û������� ��������\n");
			MainUI.show();
			return ;
		} else if (student.getStudentPassword().equals(studentPassword)) {
			System.out.println("\n����������¼�ɹ���������\n");
			System.out.println("��������������ѧ������ϵͳ�������������������������\n");
			MainUI.show();
		} else {
			System.out.println("\n��������!���벻��ȷ!��������\n");
			MainUI.show();
		}
	}
	//ע�ᣬҵ���߼�ʵ��
	public void register(String studentNo, 
						String studentName, 
						String studentGender, 
						int studentAge, 
						String studentDepartment, 
						String firstPassword, 
						String secondPassword) {
		if(firstPassword.equals(secondPassword)) {
			student = new Student();
			student.setStudentNo(studentNo);
			student.setStudentName(studentName);
			student.setStudentAge(studentAge);
			student.setStudentDepartment(studentDepartment);
			student.setStudentPassword(firstPassword);
			studentDao = StudentDao.getInstance();
			studentDao.insert(student);
			studentDao.update();
			System.out.println("\n����������ע��ɹ�����������\n");
			System.out.println("\n����������������ѧ������ϵͳ�����桤��������\n");
			MainUI.show();
		}
		else {
			System.out.println("������������������������벻һ��,������ѡ�񡤡�������");
			MainUI.show();
		}
	}
	//�޸�����
	public void modifyPassword(String studentNo,String studentPassword,String studentNewPassword ){
		studentDao = StudentDao.getInstance();
		student = (Student) studentDao.getEntity(studentNo);
		if (student == null) {
			System.out.println("\n��������!�û�������!��������\n");
			MainUI.show();
			return;
		} 
		if (student.getStudentPassword().equals(studentPassword)) {
			student.setStudentPassword(studentNewPassword);
			studentDao = StudentDao.getInstance();
			studentDao.update();
			System.out.println("\n�����������޸ĳɹ�����������\n");
			MainUI.show();
		} else {
			System.out.println("\n���������������벻��ȷ ������������\n");
			MainUI.show();
		}	
	}
}
