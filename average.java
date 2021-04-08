import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int hookScore;
    int mathScore;
    int EnglishScore;
    int sum;
    int average;

    Scanner sc = new Scanner(System.in);

    System.out.println("국어 성적 입력 :");

    hookScore = sc.nextInt();

    System.out.println("수학 성적 입력 :");

    mathScore = sc.nextInt();

    System.out.println("영어 성적 입력 :");

    EnglishScore = sc.nextInt();

    sum = hookScore + mathScore + EnglishScore;

    average = sum/3;  
          
  }
}