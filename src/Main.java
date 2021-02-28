import day2.task1.MC_21;
import day2.task2.CastomSecurity;
import day2.task2.Role;
import day2.task2.User;
import day2.task3.EnumDirection;
import day3.task3.*;
import day4.task2.BurgerValidator;
import day4.task2.Ingredients;
import day4.task2.IngredientsGenerator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Main {
    public static void main(String[] args) throws Exception {
        Attachment attachment = new Attachment(12.3);
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
}

        //day4.task2
//        List<List<Ingredients>> pileOfPackages =
//            IngredientsGenerator.generateIngredients(5);
//        printPileOfIngredients(pileOfPackages);
//    }
//
//    public static void printPileOfIngredients(List<List<Ingredients>> list){
//        for(List<Ingredients> element: list){
//            System.out.println(element);
//            System.out.println(BurgerValidator.validate(element));
//        }
//    }
//}
