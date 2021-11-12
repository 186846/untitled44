public class student {
    public static void main(String[] args) {
        String str[]= new String[]{"Charles", "Mark", "Bill", "Vincent", "William"};
             float[][] ave ={{39,48,25},{47,68,76},{80,89,74},{90,97,94},{100,100,100}};
            //每一个大括号里面的是这个学生经历三次考试的成绩
            float[] score=new float[5];
            float sum = 0, sum1 = 0;
            for (int s = 0; s < score.length; s++) {
                int n = 0;
                sum1 = 0;
                for (int r = 0; r< ave[s].length; r++) {
                    sum1 += ave[s][r];
                    score[s]=sum1/3;
                    n++;
                    sum += ave[s][r];
                }
            }
            for(int i=0;i< score.length-1;i++){
                for(int j=0;j< str.length-1-i;j++) {
                    if (score[j] < score[j+1]) {
                        float t = score[j];
                        score[j] = score[j+1];
                        score[j+1] = t;
                        String temp = str[j];
                        str[j] = str[j+1];
                        str[j+1] = temp;
                    }
                }
            }
        System.out.print(str[0] + "\t");
        System.out.println(String.format("%.1f",score[0] + "\t"));
        if (score[0] == 100) {
            System.out.println("完美" + "\t");
        } else if (score[0] < 100 && score[0] >= 90) {
            System.out.println("优秀" + "\t");
        } else if (score[0] < 90 && score[0] >= 80) {
            System.out.println("良好" + "\t");
        } else if (score[0] < 80 && score[0] >= 60) {
            System.out.println("及格" + "\t");
        } else if (score[0] < 60 && score[0] >= 0) {
            System.out.println("不及格" + "\t");
        }
        System.out.print(str[1] + "\t");
        System.out.println(String.format("%.1f", score[1] + "\t"));
        if (score[1] == 100) {
            System.out.println("完美" + "\t");
        } else if (score[1] < 100 && score[1] >= 90) {
            System.out.println("优秀" + "\t");
        } else if (score[1] < 90 && score[1] >= 80) {
            System.out.println("良好" + "\t");
        } else if (score[1] < 80 && score[1] >= 60) {
            System.out.println("及格" + "\t");
        } else if (score[1] < 60 && score[1] >= 0) {
            System.out.println("不及格" + "\t");
        }
        System.out.print(str[2] + "\t");
        System.out.println(String.format("%.1f",score[2] + "\t"));
        if (score[2] == 100) {
            System.out.println("完美" + "\t");
        } else if (score[2] < 100 && score[2] >= 90) {
            System.out.println("优秀" + "\t");
        } else if (score[2] < 90 && score[2] >= 80) {
            System.out.println("良好" + "\t");
        } else if (score[2] < 80 && score[2] >= 60) {
            System.out.println("及格" + "\t");
        } else if (score[2] < 60 && score[2] >= 0) {
            System.out.println("不及格" + "\t");
        }
        System.out.print(str[3] + "\t");
        System.out.println(String.format("%.1f",score[3] + "\t"));
        if (score[3] == 100) {
            System.out.println("完美" + "\t");
        } else if (score[3] < 100 && score[3] >= 90) {
            System.out.println("优秀" + "\t");
        } else if (score[3] < 90 && score[3] >= 80) {
            System.out.println("良好" + "\t");
        } else if (score[3] < 80 && score[3] >= 60) {
            System.out.println("及格" + "\t");
        } else if (score[3] < 60 && score[3] >= 0) {
            System.out.println("不及格" + "\t");
        }
        System.out.print(str[4] + "\t");
        System.out.println(String.format("%.1f",score[4] + "\t"));
        if (score[4] == 100) {
            System.out.println("完美" + "\t");
        } else if (score[4] < 100 && score[4] >= 90) {
            System.out.println("优秀" + "\t");
        } else if (score[4] < 90 && score[4] >= 80) {
            System.out.println("良好" + "\t");
        } else if (score[4] < 80 && score[4] >= 60) {
            System.out.println("及格" + "\t");
        } else if (score[4] < 60 && score[4] >= 0) {
            System.out.println("不及格" + "\t");
        }
    }
}
