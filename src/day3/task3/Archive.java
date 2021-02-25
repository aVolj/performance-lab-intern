package day3.task3;

import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * todo Document type Archive
 */
public class Archive extends Storage{
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
        Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    ArrayList<Bid> allBid = new ArrayList<>();

    @Override
    public boolean addBid(Bid bid) {
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
        }        return null;
    }

    public static boolean validate(Bid bid) throws Exception {
        if(bid.getName().length() < 3){
            throw new Exception("Имя должно содержать в себе более 2х символов");
        }
        if (validateEmail(bid.getEmail())) {
            return true;
        }else{
            throw new Exception("Некоректный email");
        }
    }

    public static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("^.+@.+\\..+$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
