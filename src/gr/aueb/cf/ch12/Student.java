package gr.aueb.cf.ch12;

public class Student {
    public  int id; //τα πεδια της κλασης ειναι προσπελασιμα απο παντου
    private  String firstname; //τα πεδια της κλασης οτι ειναι προσπελασιμα μονο στην ιδια την κλαση
    protected   String lastname; //τα πεδια  της κλασης ειναι προσπελασιμα απο την ιδια τη κλαση και απο υποκλασεις αυτής της κλασης σε μια ιεραρχεια κληρονομικοτητας
}