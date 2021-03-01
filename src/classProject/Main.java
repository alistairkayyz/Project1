package classProject;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 0; i < 4; i++){
            switch (i){
                case 0:
                    System.out.println("i = " + i);
                    break;
                case 1:
                    System.out.println("i == " + i);
                    break;
                case 2:
                    System.out.println("i = " + i);
                default:
                    System.out.println("The number is not in range!");
            }
        }
    }
}
