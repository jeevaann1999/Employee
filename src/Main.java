import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Choose an option");
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your option : 1. Add Employee \n 2. View All \n 3. Search an Employee \n 4. Delete an Employee\n 5. Exit");
        option = sc.nextInt();
        switch (option) {
            case 1:
                AddEmp();
                break;
            case 2:
                ViewAll();
                break;
            case 3:
                SearchAnEmp();
                break;
            case 4:
                DeleteAnEmp();
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}