package kovalenko;

interface CurrencyCourseIntr {
    public double getBuyValue();
    public double getSaleValue();
    public double getBankValue();
    public String getCurrencyName();
}

public class CurrencyCourse implements CurrencyCourseIntr{
    // список поддерживаемых валют :)
    public static final String USD = "USD";
    public static final String EUR = "EUR";
    public static final String RUB = "RUB";
    
    private double buyValue;
    private double saleValue;
    private double bankValue;
    private String currency;
    
    public CurrencyCourse(double buyValue, double saleValue, double bankValue, String currency) {
        this.buyValue = buyValue; // цена покупки валюты
        this.saleValue = saleValue; // цена продажи валюты
        this.bankValue = bankValue; // цена НБУ
        this.currency = currency; // имя/тип валюты (доллар, евро, рубль)
    }
    
    public double getBuyValue() {
        return this.buyValue;
    }
    
    public double getSaleValue() {
        return this.saleValue;
    }
    
    public double getBankValue() {
        return this.bankValue;
    }
    
    public String getCurrencyName() {
        return this.currency;
    }
    
    public String toString() {
        return new String(currency + ": BUY: " + buyValue + "; SALE: " + saleValue + "; BANK: " + bankValue);
    }
}
