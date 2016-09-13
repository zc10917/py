
package com.example.zhongcheng.pytest.BankCardList;
/**
 * Created by zhongcheng on 16/9/5.
 */
public class BankCard {
    private int bankcardId;

    private String tailNo;

    private String bankName;

    private String cardType;

    private int maxAmountPerTime;

    private int maxAmountPerDay;

    private String icon;

    private String bin;

    private String cellphone;

    private int freeze;

    private int modtime;

    public void setBankcardId(int bankcardId){
        this.bankcardId = bankcardId;
    }
    public int getBankcardId(){
        return this.bankcardId;
    }
    public void setTailNo(String tailNo){
        this.tailNo = tailNo;
    }
    public String getTailNo(){
        return this.tailNo;
    }
    public void setBankName(String bankName){
        this.bankName = bankName;
    }
    public String getBankName(){
        return this.bankName;
    }
    public void setCardType(String cardType){
        this.cardType = cardType;
    }
    public String getCardType(){
        return this.cardType;
    }
    public void setMaxAmountPerTime(int maxAmountPerTime){
        this.maxAmountPerTime = maxAmountPerTime;
    }
    public int getMaxAmountPerTime(){
        return this.maxAmountPerTime;
    }
    public void setMaxAmountPerDay(int maxAmountPerDay){
        this.maxAmountPerDay = maxAmountPerDay;
    }
    public int getMaxAmountPerDay(){
        return this.maxAmountPerDay;
    }
    public void setIcon(String icon){
        this.icon = icon;
    }
    public String getIcon(){
        return this.icon;
    }
    public void setBin(String bin){
        this.bin = bin;
    }
    public String getBin(){
        return this.bin;
    }
    public void setCellphone(String cellphone){
        this.cellphone = cellphone;
    }
    public String getCellphone(){
        return this.cellphone;
    }
    public void setFreeze(int freeze){
        this.freeze = freeze;
    }
    public int getFreeze(){
        return this.freeze;
    }
    public void setModtime(int modtime){
        this.modtime = modtime;
    }
    public int getModtime(){
        return this.modtime;
    }

}
