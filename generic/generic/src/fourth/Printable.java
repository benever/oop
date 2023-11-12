package fourth;

interface Printable {
    Printable printable = new Printable() {
        @Override
        public void print() {
            System.out.println("Print printable");
        }
    };
    void print();

    public static void main(String[] args) {
        printable.print();
    }
}