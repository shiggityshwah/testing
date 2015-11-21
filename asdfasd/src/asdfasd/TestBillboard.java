package asdfasd;

class TestBillboard
{
    public static void main(String args[])
    {
        Rectangle r;
        r = new Rectangle();
        r.printRect();
        r.printBillBoard();
        BillBoard b;
        b = new BillBoard();
        b.printBillBoard();
        b.printRect();
        b = new Rectangle();
        r = new BillBoard();
        r.printRect();
        r.printBillBoard();
        ((BillBoard)r).printBillBoard();
    }
}

class Rectangle
{
    private int length = 0;
    private int width = 0;
    public void printRect()
    { System.out.println ("Length = " + length + ", Width = " + width); }
}

class BillBoard extends Rectangle
{
    private String message = “hello”;
    public void printBillBoard()
    {
        System.out.println (message);
        super.printRect();
    }
}