public class student1 {
    public static void main(String[] args) {
        String[] str = new String[]{"Charles", "Mark", "Bill", "Vincent", "William"};
        float[][] ave ={{39,48,25},{47,68,76},{80,89,74},{90,97,94},{100,100,100}};
        //每一个大括号里面的是这个学生经历三次考试的成绩
        float[] score=new float[5];
        float sum = 0;
        float sum1 = 0;
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
        for (int s= 0; s <str.length; s++) {
            System.out.println(str[s]+"\t");
            System.out.println(score[s]+"\t");
            if (score[s] == 100) {
                System.out.println("完美");
            } else if (score[s] < 100 && score[s] >= 90) {
                System.out.println("优秀");
            } else if (score[s] < 90 && score[s] >= 80) {
                System.out.println("良好");
            } else if (score[s] < 80 && score[s] >= 60) {
                System.out.println("及格");
            } else if (score[s] < 60 && score[s] >= 0) {
                System.out.println("不及格"+"\t");
            }
        }
    }
}
