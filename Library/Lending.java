public class Lending {
    
    int lendingID;
    int bookID;
    int memberID;
    int borrowDate;
    int returnDate;

    public Lending(int lendingID, int bookID, int memberID, int borrowDate, int returnDate) {
        this.lendingID = lendingID;
        this.bookID = bookID;
        this.memberID = memberID;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public void Display() {
        System.out.println("Lending ID: " + lendingID);
        System.out.println("Book ID: " + bookID);
        System.out.println("Member ID: " + memberID);
        System.out.println("Borrow Date: " + borrowDate);
        System.out.println("Return Date: " + returnDate);
    }

    public int Fine(){

        if (returnDate < borrowDate) {
            return 0;
        }

        int days = returnDate - borrowDate;
        int fine = 0;

        if (days > 7) {
            fine = (days - 7) * 10;
        }

        return fine;
    }
}
