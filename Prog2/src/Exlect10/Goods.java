package Exlect10;

public class Goods {

	private int goodsID;
	private String goodsName;
	private String goodsDescription;
	private int goodsPrice;
	private int goodsStock;
	
	public Goods() {
		
	}
	public int getInt() {
		return this.goodsID;
	}
	public void setID(int goodsID) {
		this.goodsID=goodsID;
	}
	public String getName() {
        return this.goodsName;
    }
    public void setName(String goodsName) {
        this.goodsName=goodsName;
    } 
    public String getDescription() {
        return this.goodsDescription;
    }
    public void setDescription(String goodsDescription) {
        this.goodsDescription=goodsDescription;
    } 
    public int getPrice() {
        return this.goodsPrice;
    }
    public void setPrice(int goodsPrice) {
        this.goodsPrice=goodsPrice;
    } 
    public int getStock() {
        return this.goodsStock;
    }
    public void setStock(int goodsStock) {
        this.goodsStock=goodsStock;
    } 
    public String toString() {
        return goodsID+","+goodsName+","+goodsDescription+","+goodsPrice+","+goodsStock;
    }
}
