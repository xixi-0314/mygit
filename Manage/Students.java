package Manage;
class Students {
    // 学号，姓名，性别，年龄，成绩
    private String stuNo = " ";
    private String stuName = " ";
    private String gender = " ";
    private int age;
    private int num;

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String toString() {
        return "[" + stuNo + "\t|" + stuName + "\t|" + gender + "\t|" + age + "\t|" + num + "]";
    }

}