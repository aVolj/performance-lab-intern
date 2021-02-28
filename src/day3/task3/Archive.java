package day3.task3;

import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * todo Document type Archive
 */
public class Archive extends Storage{

    ArrayList<Bid> allBid = new ArrayList<>();

    @Override
    public boolean addBid(Bid bid){
        try {
            validate(bid);
        } catch (Exception e) {
            bid.setStatus(Status.REMOVED);
            System.err.println(e.getMessage());
        }
        allBid.add(bid);
        return true;
    }

    @Override
    public boolean removeBid(Bid bid) {
        allBid.remove(bid);
        return true;
    }

    @Override
    public ArrayList<Bid> getAllSuccessBid() {
        ArrayList<Bid> successBid = new ArrayList<>();
        for(Bid bid: allBid){
            if(bid.getStatus() == Status.RESOLVED){
                successBid.add(bid);
            }
        }
        return successBid;
    }

    @Override
    public ArrayList<Bid> getAllDeleteBid() {
        ArrayList<Bid> removedBid = new ArrayList<>();
        for(Bid bid: allBid){
            if(bid.getStatus() == Status.REMOVED){
                removedBid.add(bid);
            }
        }
        return removedBid;
    }

    @Override
    public ArrayList<Bid> getAllBid() {
        return allBid;
    }

    @Override
    public ArrayList<Bid> getBidBetween(Date d1, Date d2) {
        ArrayList<Bid> betweenBid = new ArrayList<>();
        for(Bid bid: allBid){
            if(bid.getDate().after(d1) && bid.getDate().before(d2)){
                betweenBid.add(bid);
            }
        }        return betweenBid;
    }

    public static void validate(Bid bid) throws Exception{
        if (validateEmail(bid.getEmail())) {
            bid.setStatus(Status.RESOLVED);
        }else{
            bid.setStatus(Status.REMOVED);
            throw new Exception("Некоректный email в заявке с id = "+ bid.getId());
        }
        if(bid.getName().length() < 3){
            bid.setStatus(Status.REMOVED);
            throw new Exception("Имя должно содержать в себе более 2х символов в " +
                "заявке с id = " + bid.getId());

        }
    }

    public static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("^.+@.+\\..+$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
