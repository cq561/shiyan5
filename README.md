#### 计G202 2020322100  陈庆
# 实验五 模拟学生作业处理  
## 一，实验目的
掌握字符串String及其方法的使用  
掌握文件的读取/写入方法  
掌握异常处理结构  
## 二 实验内容
在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。  
文件A包括两部分内容：  
一是学生的基本信息；  
二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：  
每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”  
允许提供输入参数，统计古诗中某个字或词出现的次数  
输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A  
考虑操作中可能出现的异常，在程序中设计异常处理程序    
## 实验要求
计学生类（可利用之前的）；  
采用交互式方式实例化某学生；  
设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。  
## 实验过程   
  try (FileReader fInputStream = new FileReader("D:\\a.txt");//输入流文件  
             FileWriter fOutputStream  = new FileWriter("D:\\b.txt")){  
            StringBuffer st=new StringBuffer();  
            char[] ch=new char[14];//设置有14个字符  
            while ((fInputStream.read(ch)) !=-1) {  
                st.append(ch, 0,7);  
                st.append("，");  
                st.append(ch, 7, 7);  
                st.append("。"+"\n");  
            }  
            System.out.println(st);  
            fOutputStream.write(new String(st));  
        }catch (IOException e) {  
            e.printStackTrace();  
        }     

## 实验结果
![image](https://github.com/cq561/shiyan5/blob/main/1.png)  
## 实验感想
大部分代码和思路都参考了同学，感觉自己有很多的不足

