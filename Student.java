package shiyan5;

import java.util.Scanner;

class Student {
    //创建关于学生的属性
    String name;							//关于学生的姓名
    int  code;						    	//关于学生的编号
    String sexy;							//关于学生的性别
    int age;								//关于学生的年龄
    String grade;							//关于学生的班级
    String major;							//关于学生的专业


    public void toshows() {
        this.name = name;
        this.code = code;
        this.sexy=sexy;
        this.age=  age;
        this.grade=grade;
        this.major=major;
        Scanner sc=new Scanner(System.in);
        System.out.println("姓名");
        name =sc.next();
        System.out.println("学号");
        code=sc.nextInt();
        System.out.println("性别");
        sexy = sc.next();
        System.out.println("年龄");
        age =sc.nextInt();
        System.out.println("班级");
        grade= sc.next();
        System.out.println("专业");
        major =sc.next();
        System.out.println("你输入的姓名"+name+"学号："+code+"性别:"+sexy+"年龄"+age+"班级："+grade+"专业"+major);

    }

}
