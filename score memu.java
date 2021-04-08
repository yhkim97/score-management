import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("메뉴 선택(숫자입력) \n1. 총점\n2. 평균\n");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    switch(num) {
      case 1:
        System.out.println("1. 국어 점수 = \n" + lang);
        System.out.println("2. 수학 점수 = \n" + math);
        System.out.println("3. 영어 점수 = \n" + eng);
        System.out.println("총 점 : \n" + sum);
        break;

      case 2:
        System.out.println("1. 국어 점수 = \n" + lang);
        System.out.println("2. 수학 점수 = \n" + math);
        System.out.println("3. 영어 점수 = \n" + eng);
        System.out.println("평균 : \n" + avg);
        break;

    }


  }
}