import day4.task2.*;
import day4.task3.Test1;
import day4.task3.Util;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args){

        //day3.task3
/*        Attachment attachment = new Attachment(12.3);
        ArrayList<Attachment> arrAttachment = new ArrayList<>();
        List<Bid> bidList = new ArrayList<>();

        arrAttachment.add(attachment);

        Storage storage = new Archive();

        Bid bid1 = new Bid("Володичев", "artur", "Недоволен скоростью интернета",
            arrAttachment, "asfe@mail.ru");

        Bid bid2 = new Bid("Володичев", "ar", "Недоволен скоростью интернета",
            arrAttachment, "asfemail.ru");

        bidList.add(bid1);
        bidList.add(bid2);

        for (int i = 5; i < 15; i++) {
            Bid bid = new Bid("surname" + i, "n" + i, "txtComplaint" + i,
                arrAttachment, "email@gmail.com" + i);
            bidList.add(bid);
        }

        for(Bid bid: bidList){
            storage.addBid(bid);
        }

        System.out.println(storage.getAllDeleteBid());
        System.out.println("===================================");
        System.out.println(storage.getAllSuccessBid());
    }
}*/
        Util util = new Util();
        Test1 test = new Test1();
        util.benchmark(test.callable, 100000);

        //day4.task2
        List<List<Ingredients>> pileOfPackages =
            IngredientsGenerator.generateIngredients(15);

        Chef chef = new Chef("Jean");
        List<Burger> burgers = new ArrayList<>();
        for(List<Ingredients> packIngredients : pileOfPackages) {
                try {
                    burgers.add(chef.makeBurger(packIngredients));
                } catch (BurgerException e) {
                    System.err.println(e.getMessage());
                }
            }

        for(Burger burger: burgers){
            burger.printComposition();
        }
    }
}
