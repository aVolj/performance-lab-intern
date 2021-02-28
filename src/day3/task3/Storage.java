package day3.task3;

import java.util.ArrayList;
import java.util.Date;

/**
 * todo Document type Storage
 */
public abstract class Storage {
    public abstract boolean addBid(Bid bid) throws Exception;
    public abstract boolean removeBid(Bid bid);
    public abstract ArrayList<Bid> getAllSuccessBid();
    public abstract ArrayList<Bid> getAllDeleteBid();
    public abstract ArrayList<Bid> getAllBid();
    public abstract ArrayList<Bid> getBidBetween(Date d1, Date d2);
}
