package day3.task3;

import java.util.ArrayList;
import java.util.Date;

/**
 * todo Document type Bid
 */
public class Bid {
    private static int nId = 1;
    private int id;
    private Date date;
    private String surname;
    private String name;
    private String txtComplaint;
    private ArrayList<Attachment> attachmentArrayList;
    private String email;
    private Enum<Status> status = Status.RECEIVED;

    @Override
    public String toString(){
        return "Ид заявки - " + id +" Время создания " + date +
            "\nСоздана: " + surname + " " + name + " Статус " + status;
    }

    public Bid(String surname, String name, String txtComplaint, ArrayList<Attachment> attachmentArrayList,
        String email) {
        this.id = nId;
        nIdInc();
        this.date = new Date();
        this.surname = surname;
        this.name = name;
        this.txtComplaint = txtComplaint;
        this.attachmentArrayList = attachmentArrayList;
        this.email = email;
    }

    public void setStatus(Enum<Status> status) {
        this.status = status;
    }

    public static int getnId() {
        return nId;
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

    public Enum<Status> getStatus() {
        return status;
    }

    private void nIdInc(){
        nId++;
    }
}
