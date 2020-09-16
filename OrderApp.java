package cookies;

import java.util.Scanner;

public class OrderApp {
    public static void main(String[] args) {

        String varietyToRemove;
        Scanner input = new Scanner(System.in);


        MasterOrder myOrder = new MasterOrder();

        myOrder.addOrder(new CookieOrder("Tagalongs", 1));
        myOrder.addOrder(new CookieOrder("Thin Mints", 5));
        myOrder.addOrder(new CookieOrder("Samoas", 2));
        myOrder.addOrder(new CookieOrder("DoSeDos", 0));
        myOrder.addOrder(new CookieOrder("Tagalongs", 3));

        System.out.println("Your Cookie Order");
        myOrder.showOrder();
        System.out.println();
        System.out.println("You have ordered " + myOrder.getTotalBoxes() + " boxes of cookies");
        System.out.println("What would you like to remove?");
        varietyToRemove = input.nextLine();

        //if (varietyToRemove.equals("Tagalongs")) {
            //System.out.println();
            System.out.println("You are removing " + myOrder.getVarietyBoxes1(varietyToRemove) + " " + varietyToRemove);
            myOrder.removeVariety(varietyToRemove);

            System.out.println();
            System.out.println("Your Cookie Order");
            System.out.println();
            myOrder.showOrder();


//        cookieOrderArray.add("fum");
//        System.out.println(cookieOrderArray);
//        System.out.println("my list has " + cookieOrderArray.size() + " elements");
//
//        if  (cookieOrderArray.contains("Fido")) {
//        System.out.println(("I have a dog Fido"));
    }
    }
