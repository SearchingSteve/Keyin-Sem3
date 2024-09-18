package Excersize4;
public class Invoice {
    
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    private static int InvoiceCount = 0;

    public Invoice(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
        InvoiceCount++; // Increment the static counter every time an invoice is created
    }

    // Copy Constructor
    public Invoice(Invoice item) {
        this.id = item.id;
        this.desc = item.desc;
        this.qty = item.qty;
        this.unitPrice = item.unitPrice;
        InvoiceCount++; // Increment the static counter for copied invoice too
    }

    public String getID() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return unitPrice * qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }

    public static int getInvoiceCount() {
        return InvoiceCount;
    }

}
