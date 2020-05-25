package com.preparing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
    private int id;
    private int chineseScore;
    private int mathScore;
    private int englishScore;
    private int sum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum){
        this.sum=sum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", chineseScore=" + chineseScore +
                ", mathScore=" + mathScore +
                ", englishScore=" + englishScore +
                ", sum=" + sum +
                '}';
    }
}

public class P1093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int id = 0;
        List<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ++id;
            Student student = new Student();
            student.setId(id);
            student.setChineseScore(Integer.parseInt(scanner.next()));
            student.setMathScore(Integer.parseInt(scanner.next()));
            student.setEnglishScore(Integer.parseInt(scanner.next()));
            student.setSum(student.getChineseScore()+student.getMathScore()+student.getEnglishScore());
            list.add(student);
        }

        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getSum() == o2.getSum()) {
                    if (o1.getChineseScore() == o2.getChineseScore()) {
                        return o1.getId() - o2.getId();
                    } else {
                        return o2.getChineseScore() - o1.getChineseScore();
                    }
                } else {
                    return o2.getSum() - o1.getSum();
                }
            }
        });

        for (int i = 0; i < 5; i++) {
            Student temp=list.get(i);
            System.out.print(temp.getId()+" "+temp.getSum());
            System.out.println();
        }
    }
}
