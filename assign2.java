import java.util.Scanner;

public class assign2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";
        boolean run = true;
        String selectMenu = "[메뉴선택] \n1. 회원관리 \n2. 과목 관리 \n3. 수강 관리 \n4. 결제 관리 \n5. 종료";

        label1:
        while(run) {
            
            
            System.out.println(selectMenu);
            int menu = scanner.nextInt();
            switch(menu) {
                case 1:
                    text = "\n회원 관리 메뉴를 선택했습니다\n";
                    break;
                case 2:
                    text = "\n과목 관리 메뉴를 선택했습니다.\n";
                    break;
                case 3:
                    text = "\n수강 관리 메뉴를 선택했습니다.\n";
                    break;
                case 4:
                    text = "\n결제 관리 메뉴를 선택했습니다.\n";
                    break;
                case 5:
                    text = "\n프로그램을 종료합니다.\n";
                    break label1;
                default:
                    System.out.println("\n유효하지 않은 메뉴입니다.\n");
                }
            System.out.println(text);
        }
    }
}
