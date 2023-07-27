/****************************
 * Innovative Assignment OOP
 * Topic :: Shopping Managment System
 ***************************/

import java.util.*;

class Shopping{ // To Displaying the FinalAmount
    Scanner ns3=new Scanner(System.in);
    void GetPrice(int aa){
        System.out.println("Enter the Quantity You Want : ");
        int quantity;
        quantity=ns3.nextInt();
        int finalprice=(quantity*aa);
        System.out.println("Your Final Amount of Bill is : "+finalprice);
        System.out.println();
    }
}

class Information{ // To Displaying the information
    Scanner ns2=new Scanner(System.in);
    Shopping sop=new Shopping();
    void Mobile(){
        System.out.println("Mobile Details : ");
        System.out.println("1> Apple -> Price : 50,000");
        System.out.println("2> Oneplus -> Price : 28,000");
        System.out.println("3> Oppo -> Price : 25,000");
        System.out.println("4> Vivo -> Price : 20,000");
        int m1;
        System.out.println("Enter Your choice According to Information :");
        m1=ns2.nextInt();
        if(m1==1){
            sop.GetPrice(50000);
        }
        else if(m1==2){
            sop.GetPrice(28000);
        }
        else if(m1==3){
            sop.GetPrice(25000);
        }
        else if(m1==4){
            sop.GetPrice(20000);
        }
    }
    
    void Laptop(){
        System.out.println("Laptop Details : ");
        System.out.println("1> Apple -> Price : 1,20,000");
        System.out.println("2> HP -> Price : 85,000");
        System.out.println("3> Dell -> Price : 75,000");
        System.out.println("4> Asus -> Price : 70,000");
        int m1;
        System.out.println("Enter Your choice According to Information :");
        m1=ns2.nextInt();
        if(m1==1){
            sop.GetPrice(120000);
        }
        else if(m1==2){
            sop.GetPrice(85000);
        }
        else if(m1==3){
            sop.GetPrice(75000);
        }
        else if(m1==4){
            sop.GetPrice(70000);
        }
    }
    
    void Computer(){
        System.out.println("Computer Details : ");
        System.out.println("1> Apple -> Price : 1,50,000");
        System.out.println("2> HP -> Price : 80,000");
        System.out.println("3> Dell -> Price : 70,000");
        System.out.println("4> Asus -> Price : 65,000");
        int m1;
        System.out.println("Enter Your choice According to Information :");
        m1=ns2.nextInt();
        if(m1==1){
            sop.GetPrice(150000);
        }
        else if(m1==2){
            sop.GetPrice(80000);
        }
        else if(m1==3){
            sop.GetPrice(70000);
        }
        else if(m1==4){
            sop.GetPrice(65000);
        }
    }
    
    void Airpods(){
        System.out.println("Airpods Details : ");
        System.out.println("1> Apple -> Price : 10,000");
        System.out.println("2> Boat -> Price : 5000");
        System.out.println("3> JBL -> Price : 4000");
        System.out.println("4> Oppo -> Price : 3000");
        int m1;
        System.out.println("Enter Your choice According to Information :");
        m1=ns2.nextInt();
        if(m1==1){
            sop.GetPrice(10000);
        }
        else if(m1==2){
            sop.GetPrice(5000);
        }
        else if(m1==3){
            sop.GetPrice(4000);
        }
        else if(m1==4){
            sop.GetPrice(3000);
        }
    } 
}

class YourChoice{ // Get choice from User 
    char choice(){
        char choice;
        Scanner ns1=new Scanner(System.in);
        System.out.println("**********Welcome to online Shopping**********");
        System.out.println("----- Please Follow the insructions -----");
        System.out.println("1> Pleae Enter M for buying Mobile phones");
        System.out.println("2> Pleae Enter L for buying Laptop");
        System.out.println("3> Pleae Enter C for buying Computers");
        System.out.println("4> Pleae Enter A for buying Airpods");
        choice=ns1.next().charAt(0);
        System.out.println();
        return choice;
    }
}

public class ShoppingManagment { // Driver Class
    /*static char choice(){
        char choice;
        Scanner ns1=new Scanner(System.in);
        System.out.println("**********Welcome to online Shopping**********");
        System.out.println("----- Please Follow the insructions -----");
        System.out.println("1> Pleae Enter M for buying Mobile phones");
        System.out.println("2> Pleae Enter L for buying Laptop");
        System.out.println("3> Pleae Enter C for buying Computers");
        System.out.println("4> Pleae Enter A for buying Airpods");
        choice=ns1.next().charAt(0);
        return choice;
    }*/
    public static void main(String args[]){
        Scanner ns=new Scanner(System.in);
        Information inf=new Information();
        YourChoice in=new YourChoice();
        char start,ok;
        boolean boo=true;
        int hi=0;
        while(hi==0){
            System.out.println("Enter Y to srart Shopping");
            start=ns.next().charAt(0);
            if(start=='Y'){
                ok=in.choice();
                if(ok=='M'){
                    inf.Mobile();
                }
                else if(ok=='L'){
                    inf.Laptop();
                }
                else if(ok=='C'){
                    inf.Computer(); 
                }
                else if(ok=='A'){
                    inf.Airpods();
                }
            }
            System.out.println();
            int bb;
            System.out.println("Enter 1 to do shopping again : ");
            bb =ns.nextInt();
            if(bb==1){
                hi=0;
            }
            else{
                hi=1;
            }
        }
    }
}