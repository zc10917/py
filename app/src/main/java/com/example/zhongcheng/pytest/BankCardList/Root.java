package com.example.zhongcheng.pytest.BankCardList;

import com.example.zhongcheng.pytest.BankCardList.Data;

/**
 * Created by zhongcheng on 16/9/5.
 */
public class Root {
    private String status;

    private Data data;

    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    public void setData(Data data){
        this.data = data;
    }
    public Data getData(){
        return this.data;
    }

}
