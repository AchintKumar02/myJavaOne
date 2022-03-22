public class TryCatch{
    public static void main(String args []){
        int stud[]= {2, 3, 4};
        int no_stud;
        Scanner print = new Scanner(System.in);
        try{
            System.out.println("Enter the no of stduent");
            no_stud = print.nextInt();
            System.out.println(stud[no_stud]);
        }catch {
            System.out.println("Something went wrong");
        }
       

    }

}

