package Manage;
import java.util.Scanner;
public class Main {
    static int num = 0;
    static boolean tag = true;
    static boolean tag_1 = true;
    static Students[] stu = new Students[100];
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (tag) { // 主菜单
        	System.out.println("*******欢迎使用学生管理系统*******");
            System.out.println("1.增加学生数据");
            System.out.println("2.删除学生数据");
            System.out.println("3.修改学生数据");
            System.out.println("4.查询学生数据");
            System.out.println("5.退出学生管理系统");
            
            int scan_num = scan.nextInt();
            switch (scan_num) {
            case 1:
                add();
                break;
            case 2:
                delete();
                break;
            case 3:
                gai();
               break;
            case 4:
                cha();
               break;
            case 5:
               tag = false;
               break;
            default:
               break;
            }
        }
    }

    static void add() { // 增加学生信息
        while (tag_1) {
            stu[num] = new Students();
            System.out.println("请依次输入学号/姓名/性别/年龄/成绩");
            stu[num].setStuNo(scan.next());
            stu[num].setStuName(scan.next());
            stu[num].setGender(scan.next());
            stu[num].setAge(scan.nextInt());
            stu[num].setNum(scan.nextInt());
            num++;
            System.out.println("继续输入请输入true,否则输入false");
            tag_1 = scan.nextBoolean();
        }
        paixu();
        cha();
    }
    static void paixu() { // 对学生信息进行排序，该方法菜单中不可选择，但会在其他方法中调用
        int l = num - 1;
        int temp;
        for (int j = 0; j < l; j++) {
            for (int i = 0; i < l - j; i++) {
                // 依次比较相邻的两个元素,使较大的那个向后移
                if (stu[i].getNum() > stu[i + 1].getNum()) {
                    temp = stu[i].getNum();
                    stu[i].setNum(stu[i + 1].getNum());
                    stu[i + 1].setNum(temp);
                }
            }
        }
    }
    static boolean kai = false;
    static void delete() { // 删除学生信息
        System.out.println("请输入你要删除的学号");
        String xuehao = scan.next();
        int i;
        for (i = 0; i < num; i++) {
            if (xuehao.equals(stu[i].getStuNo())) {
                kai = true;
                break;
            }
        }
        if (kai) {
            for (; i < num-1; i++) {
                stu[i].setStuNo(stu[i + 1].getStuNo());
                stu[i].setStuName(stu[i + 1].getStuName());
                stu[i].setGender(stu[i + 1].getGender());
                stu[i].setAge(stu[i + 1].getAge());
                stu[i].setNum(stu[i + 1].getNum());
            }
        } 
        else {
            System.out.println("查无此人");
        }
        num--;
    }

    static boolean gai = false;
    static void gai() {                   // 修改学生信息
        System.out.println("请输入你要修改的学号");
        String xuehao = scan.next();
        int i;
        for (i = 0; i < num; i++) {
            if (xuehao.equals(stu[i].getStuNo())) {
                gai = true;
                break;
            }
        }
        if (gai) {
            System.out.println("请依次输入信息");
            stu[i].setStuNo(scan.next());
            stu[i].setStuName(scan.next());
            stu[i].setGender(scan.next());
            stu[i].setAge(scan.nextInt());
            stu[i].setNum(scan.nextInt());
        } else {
            System.out.println("查无此人");
        }
        paixu();
        cha();
    }
    static void cha() {                  // 遍历学生信息并打印，取代了逐一查找学生信息
        System.out.println("[学号\t|姓名 \t|性别 \t|年龄\t|成绩]");
        for (int i = 0; i < num; i++) {
            System.out.println(stu[i]);
        }

    }

}