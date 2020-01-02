package biz;
import dao.StudentDao;
import entity.Student;
import view.MainUI;
public class StudentBiz {
	StudentDao studentDao;
	private Student student;
	//登录
	public void login(String studentNo, String studentPassword) {
		studentDao = StudentDao.getInstance();
		student = (Student) studentDao.getEntity(studentNo);
		if (student == null) {
			System.out.println("\n···！用户不存在 ！···\n");
			MainUI.show();
			return ;
		} else if (student.getStudentPassword().equals(studentPassword)) {
			System.out.println("\n····登录成功····\n");
			System.out.println("····将返回学生事务系统主界面进行其它操作····\n");
			MainUI.show();
		} else {
			System.out.println("\n····!密码不正确!····\n");
			MainUI.show();
		}
	}
	//注册，业务逻辑实现
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
			System.out.println("\n·····注册成功·····\n");
			System.out.println("\n·····将返回学生事务系统主界面·····\n");
			MainUI.show();
		}
		else {
			System.out.println("·····您两次输入的密码不一致,请重新选择·····");
			MainUI.show();
		}
	}
	//修改密码
	public void modifyPassword(String studentNo,String studentPassword,String studentNewPassword ){
		studentDao = StudentDao.getInstance();
		student = (Student) studentDao.getEntity(studentNo);
		if (student == null) {
			System.out.println("\n····!用户不存在!····\n");
			MainUI.show();
			return;
		} 
		if (student.getStudentPassword().equals(studentPassword)) {
			student.setStudentPassword(studentNewPassword);
			studentDao = StudentDao.getInstance();
			studentDao.update();
			System.out.println("\n·····修改成功·····\n");
			MainUI.show();
		} else {
			System.out.println("\n·····！密码不正确 ！·····\n");
			MainUI.show();
		}	
	}
}
