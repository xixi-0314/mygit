package Manage;
import java.util.Scanner;
public class Main {
    static int num = 0;
    static boolean tag = true;
    static boolean tag_1 = true;
    static Students[] stu = new Students[100];
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (tag) { // ���˵�
        	System.out.println("*******��ӭʹ��ѧ������ϵͳ*******");
            System.out.println("1.����ѧ������");
            System.out.println("2.ɾ��ѧ������");
            System.out.println("3.�޸�ѧ������");
            System.out.println("4.��ѯѧ������");
            System.out.println("5.�˳�ѧ������ϵͳ");
            
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

    static void add() { // ����ѧ����Ϣ
        while (tag_1) {
            stu[num] = new Students();
            System.out.println("����������ѧ��/����/�Ա�/����/�ɼ�");
            stu[num].setStuNo(scan.next());
            stu[num].setStuName(scan.next());
            stu[num].setGender(scan.next());
            stu[num].setAge(scan.nextInt());
            stu[num].setNum(scan.nextInt());
            num++;
            System.out.println("��������������true,��������false");
            tag_1 = scan.nextBoolean();
        }
        paixu();
        cha();
    }
    static void paixu() { // ��ѧ����Ϣ�������򣬸÷����˵��в���ѡ�񣬵��������������е���
        int l = num - 1;
        int temp;
        for (int j = 0; j < l; j++) {
            for (int i = 0; i < l - j; i++) {
                // ���αȽ����ڵ�����Ԫ��,ʹ�ϴ���Ǹ������
                if (stu[i].getNum() > stu[i + 1].getNum()) {
                    temp = stu[i].getNum();
                    stu[i].setNum(stu[i + 1].getNum());
                    stu[i + 1].setNum(temp);
                }
            }
        }
    }
    static boolean kai = false;
    static void delete() { // ɾ��ѧ����Ϣ
        System.out.println("��������Ҫɾ����ѧ��");
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
            System.out.println("���޴���");
        }
        num--;
    }

    static boolean gai = false;
    static void gai() {                   // �޸�ѧ����Ϣ
        System.out.println("��������Ҫ�޸ĵ�ѧ��");
        String xuehao = scan.next();
        int i;
        for (i = 0; i < num; i++) {
            if (xuehao.equals(stu[i].getStuNo())) {
                gai = true;
                break;
            }
        }
        if (gai) {
            System.out.println("������������Ϣ");
            stu[i].setStuNo(scan.next());
            stu[i].setStuName(scan.next());
            stu[i].setGender(scan.next());
            stu[i].setAge(scan.nextInt());
            stu[i].setNum(scan.nextInt());
        } else {
            System.out.println("���޴���");
        }
        paixu();
        cha();
    }
    static void cha() {                  // ����ѧ����Ϣ����ӡ��ȡ������һ����ѧ����Ϣ
        System.out.println("[ѧ��\t|���� \t|�Ա� \t|����\t|�ɼ�]");
        for (int i = 0; i < num; i++) {
            System.out.println(stu[i]);
        }

    }

}