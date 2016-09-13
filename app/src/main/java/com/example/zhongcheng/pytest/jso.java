package com.example.zhongcheng.pytest;

import java.util.List;

/**
 * Created by zhongcheng on 16/9/5.
 */
public class jso {

    /**
     * status : success
     * data : {"credit":[],"debit":[{"bankcardId":120332147,"tailNo":"2731","bankName":"招商银行",
     * "cardType":"储蓄卡","maxAmountPerTime":1000,"maxAmountPerDay":3000,"icon":"https://p0.meituan
     * .net/pay/ic_bank_cmb.png","bin":"62148301","cellphone":"15827481731","freeze":0,
     * "modtime":1472279470}]}
     */

    private String status;
    private DataBean data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<?> credit;
        /**
         * bankcardId : 120332147
         * tailNo : 2731
         * bankName : 招商银行
         * cardType : 储蓄卡
         * maxAmountPerTime : 1000
         * maxAmountPerDay : 3000
         * icon : https://p0.meituan.net/pay/ic_bank_cmb.png
         * bin : 62148301
         * cellphone : 15827481731
         * freeze : 0
         * modtime : 1472279470
         */

        private List<DebitBean> debit;

        public List<?> getCredit() {
            return credit;
        }

        public void setCredit(List<?> credit) {
            this.credit = credit;
        }

        public List<DebitBean> getDebit() {
            return debit;
        }

        public void setDebit(List<DebitBean> debit) {
            this.debit = debit;
        }

        public static class DebitBean {
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

            public int getBankcardId() {
                return bankcardId;
            }

            public void setBankcardId(int bankcardId) {
                this.bankcardId = bankcardId;
            }

            public String getTailNo() {
                return tailNo;
            }

            public void setTailNo(String tailNo) {
                this.tailNo = tailNo;
            }

            public String getBankName() {
                return bankName;
            }

            public void setBankName(String bankName) {
                this.bankName = bankName;
            }

            public String getCardType() {
                return cardType;
            }

            public void setCardType(String cardType) {
                this.cardType = cardType;
            }

            public int getMaxAmountPerTime() {
                return maxAmountPerTime;
            }

            public void setMaxAmountPerTime(int maxAmountPerTime) {
                this.maxAmountPerTime = maxAmountPerTime;
            }

            public int getMaxAmountPerDay() {
                return maxAmountPerDay;
            }

            public void setMaxAmountPerDay(int maxAmountPerDay) {
                this.maxAmountPerDay = maxAmountPerDay;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getBin() {
                return bin;
            }

            public void setBin(String bin) {
                this.bin = bin;
            }

            public String getCellphone() {
                return cellphone;
            }

            public void setCellphone(String cellphone) {
                this.cellphone = cellphone;
            }

            public int getFreeze() {
                return freeze;
            }

            public void setFreeze(int freeze) {
                this.freeze = freeze;
            }

            public int getModtime() {
                return modtime;
            }

            public void setModtime(int modtime) {
                this.modtime = modtime;
            }
        }
    }
}
