package com.example.contactmanager.db.entity;


public class Contact {

    public static final String TABLE_NAME = "contacts";
    public static  final String COLUMN_ID = "contact_id";
    public static  final String COLUMN_NAME = "contact_name";
    public static final String COLUMN_EMAIL = "contact_email";


    private String name ;
    private int id;
    private String email;

    public Contact(){

    }
    public Contact(String name, String email, int id){
        this.name = name;
        this.email = email;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // CREATING A TABLE
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
            + COLUMN_NAME + " TEXT,"
             + COLUMN_EMAIL + " DATETIME DEFAULT CURRENT_TIMESTAMP "
            + ")";
}
