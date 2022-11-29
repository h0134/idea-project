import java.util.Scanner;
public class Bank {



  /* Account opening*/
    public void OpenNewAccount(){
        Scanner kb = new  Scanner(System.in);
        System.out.println("Enter your name:");
        kb.nextInt();
        System.out.println("Enter the account type:");
        kb.nextInt();
        System.out.println("Amount you want to deposit");
        kb.nextInt();

    }
/* Deposit Money */
    public void DepositMoney(){


    }
    public  int getDetails() {
        return 0;
    }
}








class SBI extends Bank {


        public int getDetails(){

            return 5;

    }
}

class BOI extends Bank {
    int Current_Balance= 600;
   public int getDetails(){

       return 6;
   }
}

class ICICI extends Bank {
    int Current_Balance= 700;
    public int getDetails(){

           return 7;
       }
    }



