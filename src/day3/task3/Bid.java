package day3.task3;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 * todo Document type Bid
 */
public class Bid {

    private int id;
    private Date date;
    private String surname;
    private String name;
    private String txtComplaint;
    private ArrayList<Attachment> attachmentArrayList;
    private String email;
    private Status status = Status.RECEIVED;

    @Override
    public String toString(){
        return "\nИд заявки - " + id +" Время создания " + date +
            "\nСоздана: " + surname + " " + name + " Статус " + status;
    }

    public Bid(String surname, String name, String txtComplaint, ArrayList<Attachment> attachmentArrayList,
        String email) {
        int randomId = (int) (Math.random()*100 + 1);
        this.id = randomId;
        this.date = new Date();
        this.surname = surname;
        this.name = name;
        this.txtComplaint = txtComplaint;
        this.attachmentArrayList = attachmentArrayList;
        this.email = email;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getTxtComplaint() {
        return txtComplaint;
    }

    public ArrayList<Attachment> getAttachmentArrayList() {
        return attachmentArrayList;
    }

    public String getEmail() {
        return email;
    }

    public Status getStatus() {
        return status;
    }

}
