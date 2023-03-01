public class Book implements Publication {
    private String title;
    private String personWriter;
    private int totalPages;
    private int currentPage;
    private boolean bookOpen;
    private Person personReader;
    private String gender;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPersonWriter() {
        return personWriter;
    }

    public void setPersonWriter(String personWriter) {
        this.personWriter = personWriter;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean getBookOpen() {
        return bookOpen;
    }

    public void setBookOpen(boolean bookOpen) {
        this.bookOpen = bookOpen;
    }

    public Person getPersonReader() {
        return personReader;
    }

    public void setPersonReader(Person personReader) {
        this.personReader = personReader;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Book(String title, String personWriter, int totalPages, String gender, Person personReader) {
        this.title = title;
        this.personWriter = personWriter;
        this.totalPages = totalPages;
        this.gender = gender;
        this.personReader = personReader;
        this.currentPage = 0;
        this.bookOpen = false;
    }





    public String showDetailsBook() {
        return ("name of book is " + getTitle() +
                "\nit was written by " + getPersonWriter() +
                "\nhas a total of " + getTotalPages() + " pages " +
                "\nthe current pages is " + getCurrentPage() +
                "\nand its genre is " + getGender() +
                "\nperson reading the book is the " + personReader.getName() +
                "\n---------------------------------------");
    }

        @Override
        public boolean openBook() {
            this.setBookOpen(true);

            return true;
        }

        @Override
        public void closeBook(){
            this.setBookOpen(false);
        }

        @Override
        public void turnPage (int page) {
            if (page > this.totalPages) {
                this.currentPage = 0;
            } else {
                this.currentPage = page;
            }
        }

        @Override
        public void nextPage () {
            this.currentPage++;
        }

        @Override
        public void returnPage () {
            this.currentPage--;
        }
    }

