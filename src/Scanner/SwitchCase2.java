package Scanner;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*********************");
        System.out.println("Hello It is winsim ");
        System.out.println("*********************");

        System.out.println("1. Language");
        System.out.println("2. Billing And Account Information");
        System.out.println("3. Plan and usage Details");
        System.out.println("4  Technical Support");
        System.out.println("5. Recharge");
        System.out.println("6. Speak to Customer Representative");
        System.out.println("7. Exit");
        System.out.println("Enter the Service Number you want:-");
        int number = sc.nextInt();

        switch (number){
            case 1:
                System.out.println("Enter the Language you want to talk:");
                System.out.println("1. German");
                System.out.println("2. French");
                System.out.println("3. Spanish");
                System.out.println("4. Italian");
                int Language = sc.nextInt();
                switch(Language){
                    case 1:
                        System.out.println("1. German");
                        break;
                    case 2:
                        System.out.println("2. French");
                        break;
                    case 3:
                        System.out.println("3. Spanish");
                        break;
                    case 4:
                        System.out.println("4. Italian");
                        break;
                    default:
                        System.out.println("by default English");
                }
                break;
            case 2:
                System.out.println("Billing and Account Information:");
                System.out.println("1. check current balance");
                System.out.println("2. Pay your monthly balance");
                System.out.println("3. know your last month payment");
                int billing = sc.nextInt();
                switch (billing){
                    case 1:
                        System.out.println("1. check current balance");
                        break;
                    case 2:
                        System.out.println("2. Pay your monthly balance");
                        break;
                    case 3:
                        System.out.println("know your last month payment");
                        break;
                    default:
                        System.out.println("Enter the wrong number");
                }
                break;
            case 3:
                System.out.println("Plan and usage details");
                System.out.println("1. check your current Plan");
                System.out.println("2. review data, call or sms");
                System.out.println("3. change your plan");
                int planusage = sc.nextInt();
                switch(planusage){
                    case 1:
                    System.out.println("1. check your current Plan");
                    break;
                    case 2:
                    System.out.println("2. review data, call or sms");
                    break;
                    case 3:
                    System.out.println("3. change your plan");
                    break;
                    default:
                        System.out.println("wrong value");
                }
                break;
            case 4:
                System.out.println("Technical Support");
                break;
            case 5:
                System.out.println("Recharge");
                break;
            case 6:
                System.out.println("Speak to customer Representative");
                break;
            case 7:
                System.out.println("Exit");
                break;
            default:
                System.out.println("wrong Value");


        }

    }
}
