package day3.task3;

import java.util.ArrayList;
import java.util.Date;

/**
 * todo Document type Storage
 */
public abstract class Storage {
    abstract boolean addBid(Bid bid);
    abstract boolean removeBid(Bid bid);
    abstract ArrayList<Bid> getAllSuccessBid();
    abstract ArrayList<Bid> getAllDeleteBid();
    abstract ArrayList<Bid> getAllBid();
    abstract ArrayList<Bid> getBidBetween(Date d1, Date d2);
}
