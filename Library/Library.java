import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    public static Book addBook(int bookID) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the title of the book: ");

        String title = input.nextLine();
        System.out.print("Enter the author of the book: ");

        String author = input.nextLine();
        Book book = new Book(title, author, bookID);
        
        return book;
    }

    public static Member addMember(int memberID) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the member: ");

        String name = input.nextLine();
        System.out.print("Enter the address of the member: ");

        String address = input.nextLine();
        Member member = new Member(name, address, memberID);
        
        return member;
    }

    public static Lending lendBook(int lendingID, int bookID, int memberID) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the borrow date: ");

        int borrowDate = input.nextInt();
        System.out.print("Enter the return date: ");

        int returnDate = input.nextInt();
        Lending lending = new Lending(lendingID, bookID, memberID, borrowDate, returnDate);
        
        return lending;
    }
    
    public static void main(String[] args) {
        
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Member> memberList = new ArrayList<>();
        ArrayList<Lending> lendingList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int bookID = 0;
        int memberID = 0;
        int lendingID = 0;

        int choice = 0;

        while(choice != 13){
            System.out.println("1. Add a book");
            System.out.println("2. Add a member");
            System.out.println("3. Lend a book");
            System.out.println("4. Return a book");
            System.out.println("5. Display all books");
            System.out.println("6. Display all members");
            System.out.println("7. Search Books");
            System.out.println("8. Search Members");
            System.out.println("9. Remove a book");
            System.out.println("10. Remove a member");
            System.out.println("11. View Lendign Info");
            System.out.println("12. Display Overdue Books");
            System.out.println("13. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    // Add a book
                    bookList.add(addBook(bookID));
                    bookID++;
                    break;

                case 2:
                    // Add a member
                    memberList.add(addMember(memberID));
                    memberID++;
                    break;

                case 3:
                    // Lend a book
                    System.out.print("Enter the book ID: ");
                    int bookIDToLend = input.nextInt();
                    System.out.print("Enter the member ID: ");
                    int memberIDToLend = input.nextInt();
                    lendingList.add(lendBook(lendingID, bookIDToLend, memberIDToLend));
                    lendingID++;
                    break;

                case 4:
                    // Return a book
                    System.out.print("Enter the book ID: ");
                    int bookIDToReturn = input.nextInt();
                    System.out.print("Enter the member ID: ");
                    int memberIDToReturn = input.nextInt();

                    for (int i = 0; i < lendingList.size(); i++) {
                        if (lendingList.get(i).bookID == bookIDToReturn && lendingList.get(i).memberID == memberIDToReturn) {
                            lendingList.remove(i);
                            break;
                        }
                    }
                        break;

                case 5:
                    // Display all books
                    for (Book book : bookList) {
                        System.out.println("Title: " + book.title + ", Author: " + book.author + ", Book ID: " + book.bookID);
                    }
                    break;

                case 6:

                    // Display all members
                    for (Member member : memberList) {
                        System.out.println("Name: " + member.name + ", Address: " + member.address + ", Member ID: " + member.memberID);
                    }
                    break;

                case 7:

                    // Search Books
                    System.out.print("Enter the book ID: ");
                    int bookIDToSearch = input.nextInt();

                    for (Book book : bookList) {
                        if (book.bookID == bookIDToSearch) {
                            System.out.println("Title: " + book.title + ", Author: " + book.author + ", Book ID: " + book.bookID);
                            break;
                        }
                    }
                    break;
                
                case 8:
                    
                        // Search Members
                        System.out.print("Enter the member ID: ");
                        int memberIDToSearch = input.nextInt();
    
                        for (Member member : memberList) {
                            if (member.memberID == memberIDToSearch) {
                                System.out.println("Name: " + member.name + ", Address: " + member.address + ", Member ID: " + member.memberID);
                                break;
                            }
                        }
                        break;

                case 9:
                    // Remove a book
                    System.out.print("Enter the book ID: ");
                    int bookIDToRemove = input.nextInt();

                    for (int i = 0; i < bookList.size(); i++) {
                        if (bookList.get(i).bookID == bookIDToRemove) {
                            bookList.remove(i);
                            break;
                        }
                    }
                    break;

                case 10:
                    // Remove a member
                    System.out.print("Enter the member ID: ");
                    int memberIDToRemove = input.nextInt();

                    for (int i = 0; i < memberList.size(); i++) {
                        if (memberList.get(i).memberID == memberIDToRemove) {
                            memberList.remove(i);
                            break;
                        }
                    }
                    break;

                case 11:
                    // View Lending Info
                    for (Lending lending : lendingList) {
                        System.out.println("Lending ID: " + lending.lendingID + ", Book ID: " + lending.bookID + ", Member ID: " + lending.memberID + ", Borrow Date: " + lending.borrowDate + ", Return Date: " + lending.returnDate);
                    }
                    break;

                case 12:
                    // Display Overdue Books
                    for (Lending lending : lendingList) {
                        if (lending.returnDate < lending.borrowDate) {
                            System.out.println("Lending ID: " + lending.lendingID + ", Book ID: " + lending.bookID + ", Member ID: " + lending.memberID + ", Borrow Date: " + lending.borrowDate + ", Return Date: " + lending.returnDate);
                        }
                    }
                    break;

                case 13:
                    // Exit
                    System.out.println("Exiting...");
                    break;

                default:    
                    System.out.println("Invalid choice");
                    break;

            }

        }

    }
}
