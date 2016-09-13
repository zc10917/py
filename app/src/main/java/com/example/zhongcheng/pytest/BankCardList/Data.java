package com.example.zhongcheng.pytest.BankCardList;

/**
 * Created by zhongcheng on 16/9/5.
 */

import java.util.List;

public class Data {
    private List<BankCard> credit;

    private List<BankCard> debit;

    public List<BankCard> getCredit() {
        return credit;
    }

    public void setCredit(List<BankCard> credit) {
        this.credit = credit;
    }

    public List<BankCard> getDebit() {
        return debit;
    }

    public void setDebit(List<BankCard> debit) {
        this.debit = debit;
    }
}
