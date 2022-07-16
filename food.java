import java.util.Scanner;
public class food
{
    public static void main(String[] args)
    {
        System.out.println(" ---------------------------------");
        System.out.println("|                                 |");
        System.out.println("| Welcome to Food Ordering System |");
        System.out.println("|                                 |");
        System.out.println(" ---------------------------------");
        System.out.println("Enter your username And Create your Password..");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your username : ");
        String username = scan.next();
        System.out.println("Your username is : " + username);

        System.out.println("Enter your password : ");
        String pass1 = scan.next();

        System.out.println("Enter your confirm password : ");
        String pass2 = scan.next();

        while (!pass1.equals(pass2))
        {
            System.out.println("Your Password is not Correct..Please try again..!");
            pass2 = scan.next();
        }

        System.out.println("You have Successfully login your account..");
        System.out.println("Welcome to Gans Food..");
        System.out.println("Are you hungry..? y/n");
        String ans1 = scan.next();

        if (ans1.equals("yes") || ans1.equals("y"))
        {
            System.out.println("Okay.. what would you want eat or drink..?");
            String ans3 = scan.next();
            if (ans3.equals("eat") || ans3.equals("1"))
            {
                System.out.println("What would you like to eat...? y/n");
                System.out.println("1.Pizza");
                System.out.println("2.Burger");
                System.out.println("3.Noodles");
                System.out.println("4.Jeera rice");
                System.out.println("5.Green salad");
                System.out.println("6.Masala Papad");
                System.out.println("7.Manchaw soup");
                System.out.println("8.veg sandwich");
                System.out.println("9.Paneer and roti");
                System.out.println("10.Manchurian");
                System.out.println("11.Roasted veg sandwich");
                System.out.println("12.Matar paneer and roti");
                System.out.println("y/n");

                String ans22 = scan.next();
                if (ans22.equals("y")) {
                    System.out.println("What would you like to eat from above options...?");

                    String ans4 = scan.next();
                    if (ans4.equals("Pizza") || ans4.equals("1"))
                    {
                        System.out.println("Okay your order is Pizza");
                        System.out.println("it will come in 10 mins..");
                    } else if (ans4.equals("Burger") || ans4.equals("2"))
                    {
                        System.out.println("Okay your order is Burger");
                        System.out.println("it will come in 10 mins..");
                    } else if (ans4.equals("Noodles") || ans4.equals("3"))
                    {
                        System.out.println("Okay your order is Noodles");
                        System.out.println("it will come in 10 mins..");
                    } else if (ans4.equals("Jeera rice") || ans4.equals("4"))
                    {
                        System.out.println("Okay your order is Jeera rice");
                        System.out.println("it will come in 10 mins..");
                    } else if (ans4.equals("Green salad") || ans4.equals("5"))
                    {
                        System.out.println("Okay your order is Green salad");
                        System.out.println("it will come in 10 mins..");
                    } else if (ans4.equals("Masala Papad") || ans4.equals("6"))
                    {
                        System.out.println("Okay your order is Masala Papad");
                        System.out.println("it will come in 10 mins..");
                    } else if (ans4.equals("Manchaw soup") || ans4.equals("7"))
                    {
                        System.out.println("Okay your order is Manchaw soup");
                        System.out.println("it will come in 10 mins..");
                    } else if (ans4.equals("veg sandwich") || ans4.equals("8"))
                    {
                        System.out.println("Okay your order is veg sandwich");
                        System.out.println("it will come in 10 mins..");
                    } else if (ans4.equals("Paneer and roti") || ans4.equals("9"))
                    {
                        System.out.println("Okay your order is Paneer and roti");
                        System.out.println("it will come in 10 mins..");
                    } else if (ans4.equals("Manchurian") || ans4.equals("10"))
                    {
                        System.out.println("Okay your order is Manchurian");
                        System.out.println("it will come in 10 mins..");
                    } else if (ans4.equals("Roasted veg sandwich") || ans4.equals("11"))
                    {
                        System.out.println("Okay your order is Roasted veg sandwich");
                        System.out.println("it will come in 10 mins..");
                    } else if (ans4.equals("Matar paneer and roti") || ans4.equals("12"))
                    {
                        System.out.println("Okay your order is Matar paneer and roti");
                        System.out.println("it will come in 10 mins..");
                    }
                    else
                    {
                        System.out.println("Please choose correct option");
                    }
                }
            }
            else if (ans3.equals("drink") || ans3.equals("2"))
            {
                System.out.println("What would you like to prefer..? ");
                System.out.println("1.Coffee = Hot / Cold");
                System.out.println("2.Milk shake = mango / Strawbrry / chocolate / pineapple");
                System.out.println("3.Desert = mastani / Mango lassi / Chocolate desert / pineapple desert");


                String ans5 = scan.next();
                if (ans5.equals("1") || ans5.equals("coffee") )
                {
                    System.out.println("Okay your order is " + ans5+ ".Coffee");
                    System.out.println("which one hot / cold..?");
                    String ans6 = scan.next();
                    if (ans6.equals("hot")) {
                        System.out.println("Okay your order is " + ans6 + "Coffee");
                        System.out.println("okay it'll come in 5 to 10 mins..");
                    } else if (ans6.equals("cold")) {
                        System.out.println("Okay your order is " + ans6 + ans5+ "coffee");
                        System.out.println("okay it'll come in 5 to 10 mins..");
                    } else {
                        System.out.println("Please choose correct option");
                    }
                }
                else if (ans5.equals("2") || ans5.equals("milk shake"))
                {
                    System.out.println("Okay your order is milk shake");
                    System.out.println("which one from above");
                    System.out.println("1.mango");
                    System.out.println("2.Strawberry");
                    System.out.println("3.chocolate");
                    System.out.println("4.pineapple");


                    String ans7 = scan.next();
                    if (ans7.equals("mango") || ans7.equals("1"))
                    {
                        System.out.println("Okay your order is mango milk shake");
                        System.out.println("it will come in 10 mins..");
                    }
                    else if (ans7.equals("strawberry") || ans7.equals("2"))
                    {
                        System.out.println("Okay your order is strawberry milk shake");
                        System.out.println("it will come in 10 mins..");
                    }
                    else if (ans7.equals("chocolate") || ans7.equals("3"))
                    {
                        System.out.println("Okay your order is chocolate milk shake");
                        System.out.println("it will come in 10 mins..");
                    }
                    else if (ans7.equals("pineapple") || ans7.equals("4"))
                    {
                        System.out.println("Okay your order is pineapple milk shake");
                        System.out.println("it will come in 10 mins..");
                    }
                    else
                    {
                        System.out.println("Please choose from above milkshake...");
                    }
                }
                 else if (ans5.equals("3") || ans5.equals("desert"))
                {
                    System.out.println("Okay your order is desert");
                    System.out.println("which one you'll prefer..?");
                    System.out.println("1.mastani");
                    System.out.println("2.Mango lassi");
                    System.out.println("3.Chocolate desert");
                    System.out.println("4.pineapple desert");

                    String ans8 = scan.next();
                    if(ans8.equals("1") || ans8.equals("mastani"))
                    {
                        System.out.println("Okay..your order is mastani");
                        System.out.println("it will come in 10 mins..");
                    }
                    else if (ans8.equals("2") || ans8.equals("mango lassi"))
                    {
                        System.out.println("Okay..your order is mango lassi");
                        System.out.println("it will come in 10 mins..");
                    } else if (ans8.equals("3") || ans8.equals("chocolate desert"))
                    {
                    System.out.println("Okay..your order is chocolate shake");
                        System.out.println("it will come in 10 mins..");
                    }
                    else if (ans8.equals("4") || ans8.equals("pineapple"))
                    {
                        System.out.println("Okay..your order is pineapple desert");
                        System.out.println("it will come in 10 mins..");
                    }
                    else
                    {
                        System.out.println("Please choose from above desert");
                    }
                }
                }
            else
            {
             System.out.println("Please choose from eat or drink");
            }
            }
        else
        {
            System.out.println("Okay No Worries..!");
            System.out.println("Have a good day..!");
        }
    }
}
