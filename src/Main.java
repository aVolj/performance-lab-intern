import day2.task1.MC_21;
import day2.task2.CastomSecurity;
import day2.task2.Role;
import day2.task2.User;
import day2.task3.EnumDirection;
import day3.task3.Archive;
import day3.task3.Attachment;
import day3.task3.Bid;
import day3.task3.Status;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Attachment attachment = new Attachment(12.3);
        ArrayList<Attachment> arrAttachment= new ArrayList<>();
        arrAttachment.add(attachment);

        Archive archive = new Archive();



        Bid bid1 = new Bid("Володичев", "Артур", "Недоволен скоростью интернета",
            arrAttachment, "asfe@mail.ru");
        bid1.setStatus(Status.REMOVED);

        Bid bid2 = new Bid("Володичев", "Артур", "Недоволен скоростью интернета",
            arrAttachment, "asfe@mail.ru");
        bid2.setStatus(Status.RESOLVED);

        archive.addBid(bid1);
        archive.addBid(bid2);

        for(int i =0; i < 10; i++){
            Bid bid = new Bid("surname"+i, "name"+i, "txtComplaint"+i,
            arrAttachment, "email@email.com"+i);
            archive.addBid(bid);
        }

        System.out.println(archive.getAllDeleteBid());
        System.out.println("===================================");
        System.out.println(archive.getAllSuccessBid());
    }
}